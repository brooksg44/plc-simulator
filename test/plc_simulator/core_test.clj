(ns plc-simulator.core-test
  (:require [clojure.test :refer :all]
            [plc-simulator.core :refer :all]
            [plc-simulator.model.plc-state :as plc]
            [plc-simulator.model.ladder-logic :as ladder]
            [plc-simulator.engine.executor :as executor]))

(deftest plc-state-test
  (testing "PLC state functions"
    (let [state (plc/initial-state)]
      ;; Test input functions
      (is (= false (plc/get-input state 0)))
      (let [state' (plc/set-input state 0 true)]
        (is (= true (plc/get-input state' 0))))
      
      ;; Test output functions
      (is (= false (plc/get-output state 0)))
      (let [state' (plc/set-output state 0 true)]
        (is (= true (plc/get-output state' 0))))
      
      ;; Test memory functions
      (is (= false (plc/get-memory state 0)))
      (let [state' (plc/set-memory state 0 true)]
        (is (= true (plc/get-memory state' 0))))
      
      ;; Test timer functions
      (is (nil? (plc/get-timer state 0)))
      (let [timer (plc/create-timer 0 100)
            state' (plc/set-timer state 0 timer)]
        (is (= timer (plc/get-timer state' 0))))
      
      ;; Test counter functions
      (is (nil? (plc/get-counter state 0)))
      (let [counter (plc/create-counter 0 100)
            state' (plc/set-counter state 0 counter)]
        (is (= counter (plc/get-counter state' 0))))))))

(deftest ladder-logic-test
  (testing "Ladder logic functions"
    ;; Test creating ladder elements
    (is (= {:element-type :normally-open
            :address-info {:address-type :input
                         :address 0}}
           (ladder/normally-open :input 0)))
    
    (is (= {:element-type :normally-closed
            :address-info {:address-type :output
                         :address 1}}
           (ladder/normally-closed :output 1)))
    
    (is (= {:element-type :output
            :address-info {:address-type :memory
                         :address 2}}
           (ladder/output :memory 2)))
    
    ;; Test creating a rung
    (let [rung (ladder/create-rung "Test Rung"
                                  [(ladder/normally-open :input 0)
                                   (ladder/output :output 0)])]
      (is (= "Test Rung" (:name rung)))
      (is (= 2 (count (:elements rung)))))
    
    ;; Test creating a program
    (let [program (ladder/create-program "Test Program"
                                        [(ladder/create-rung "Rung 1"
                                                           [(ladder/normally-open :input 0)
                                                            (ladder/output :output 0)])])]
      (is (= "Test Program" (:name program)))
      (is (= 1 (count (:rungs program)))))))

(deftest executor-test
  (testing "Executor functions"
    (let [program (ladder/create-program "Test Program"
                                        [(ladder/create-rung "Rung 1"
                                                           [(ladder/normally-open :input 0)
                                                            (ladder/output :output 0)])])
          state (-> plc/initial-state
                  (plc/set-input 0 true))
          state-atom (atom state)]
      
      ;; Test evaluation
      (is (= true (executor/evaluate-element state (ladder/normally-open :input 0))))
      (is (= false (executor/evaluate-element state (ladder/normally-closed :input 0))))
      
      ;; Test rung evaluation
      (is (= true (executor/evaluate-rung state (first (:rungs program)))))
      
      ;; Test scan execution
      (let [state' (executor/execute-program-scan state program)]
        (is (= true (plc/get-output state' 0))))))))