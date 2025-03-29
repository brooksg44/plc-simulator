Initializing inputs in events namespace
Setting input 0 to true
Setting input 1 to false
Setting input 2 to false
Setting input 3 to false
Starting PLC Simulator...
Initial PLC state before UI start: {:inputs {0 true, 1 false, 2 false, 3 false}, :outputs {}, :memory {}, :timers {}, :counters {}, :scan-time 100, :running false}
Input 0 value: true
Setting input 0 to true
PLC Simulator started!
Example program loaded: 'Example Program' with 4 rungs
IO PANEL STATE - Outputs: {}
IO PANEL: Output 0 not found, should be set to true
LADDER EDITOR STATE - Outputs: {}
LADDER OUTPUT ELEMENT - Address: 0 Type: :output Output Map: {} Is Active: NO
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:inputs :outputs :memory :timers :counters :scan-time :running)
LADDER OUTPUT ELEMENT - Address: 1 Type: :output Output Map: {} Is Active: NO
IO PANEL STATE - Outputs: {0 false}
IO PANEL: Output 0 not found, should be set to true
IO PANEL OUTPUT - Address: 0 Value: false Color: #008000
LADDER EDITOR STATE - Outputs: {0 false}
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:inputs :outputs :memory :timers :counters :scan-time :running)
LADDER OUTPUT ELEMENT - Address: 1 Type: :output Output Map: {0 false} Is Active: NO
LADDER OUTPUT ELEMENT - Address: 0 Type: :output Output Map: {0 false} Is Active: NO
IO PANEL STATE - Outputs: {0 false, 1 false}
IO PANEL: Output 0 not found, should be set to true
IO PANEL OUTPUT - Address: 1 Value: false Color: #000000
LADDER EDITOR STATE - Outputs: {0 false, 1 false}
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:inputs :outputs :memory :timers :counters :scan-time :running)
LADDER OUTPUT ELEMENT - Address: 1 Type: :output Output Map: {0 false, 1 false} Is Active: NO
LADDER OUTPUT ELEMENT - Address: 0 Type: :output Output Map: {0 false, 1 false} Is Active: NO
Button clicked!
Toggle running button clicked!
Starting PLC execution...
State before creating atom: {:inputs {0 true, 1 false, 2 false, 3 false}, :outputs {0 false, 1 false}, :memory {}, :timers {}, :counters {}, :scan-time 100, :running false}
PLC state atom contents: {:inputs {0 true, 1 false, 2 false, 3 false}, :outputs {0 false, 1 false}, :memory {}, :timers {}, :counters {}, :scan-time 100, :running false}
Starting PLC execution...
Initial state: {:inputs {0 true, 1 false, 2 false, 3 false}, :outputs {0 false, 1 false}, :memory {}, :timers {}, :counters {}, :scan-time 100, :running false}
Scan time: 100
REPLACED state with new one - inputs: {0 true, 1 false, 2 false, 3 false} Full state: {:inputs {0 true, 1 false, 2 false, 3 false}, :outputs {}, :memory {}, :timers {}, :counters {}, :scan-time 100, :running true}
PLC execution started, returning control channel
IO PANEL STATE - Outputs: {0 false, 1 false}
IO PANEL: Output 0 not found, should be set to true
UI Update Thread - PLC state from executor: outputs: {}
WARNING: Outputs map is empty or nil, creating new one
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:inputs {0 true, 1 false, 2 false, 3 false}, :outputs {}, :memory {}, :timers {}, :counters {}, :scan-time 100, :running true}
LADDER EDITOR STATE - Outputs: {0 false, 1 false}
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:inputs :outputs :memory :timers :counters :scan-time :running)
LADDER OUTPUT ELEMENT - Address: 1 Type: :output Output Map: {0 false, 1 false} Is Active: NO
LADDER OUTPUT ELEMENT - Address: 0 Type: :output Output Map: {0 false, 1 false} Is Active: NO
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:inputs :outputs :memory :timers :counters :scan-time :running)
Getting value for :input 0 = true
  Element results: IO PANEL STATE - Outputs: {0 true}
(true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
IO PANEL OUTPUT - Address: 0 Value:GET_INPUT CALLED - Address:  1true  Value: Color:false  Inputs map: #008000
{0 true, 1 false, 2 false, 3 false} Full state keys: (:inputs :outputs :memory :timers :counters :scan-time :running)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:inputs :outputs :memory :timers :counters :scan-time :running)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
LADDER EDITOR STATE - Outputs: {0 true}
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (Final state before atom update - Outputs: :inputs{0 true} 
:outputs :memory :timers :counters :scan-time :running)
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}
LADDER OUTPUT ELEMENT - Address: 1 Type: :output Output Map: {0 true} Is Active: 
========== DEBUG LADDER EXECUTION ==========
NO
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
LADDER OUTPUT ELEMENT - Address: 0 Type: :output Output Map: {0 true}GET_INPUT CALLED - Address:  0Is Active:  Value: YEStrue
 Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
UI Update Thread - PLC state from executor: outputs: {0 true}
USING EXISTING OUTPUTS: {0 true}
IO PANEL STATE - Outputs: {0 true}
LADDER EDITOR STATE - Outputs: {0 true}
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
LADDER OUTPUT ELEMENT - Address: 1 Type: :output Output Map: {0 true} Is Active: NO
LADDER OUTPUT ELEMENT - Address: 0 Type: :output Output Map: {0 true} Is Active: YES
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
Button clicked!
Toggle running button clicked!
Starting PLC execution...
State before creating atom: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
PLC state atom contents: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Starting PLC execution...
Initial state: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Scan time: nil
REPLACED state with new one - inputs: {0 true, 1 false, 2 false, 3 false} Full state: {:inputs {0 true, 1 false, 2 false, 3 false}, :outputs {}, :memory {}, :timers {}, :counters {}, :scan-time nil, :running true}
PLC execution started, returning control channel
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:inputs {0 true, 1 false, 2 false, 3 false}, :outputs {}, :memory {}, :timers {}, :counters {}, :scan-time nil, :running true}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: UI Update Thread - PLC state from executor:{0 true, 1 false, 2 false, 3 false}  outputs:Full state keys:  {}
WARNING: Outputs map is empty or nil, creating new one
(:inputs :outputs :memory :timers :counters :scan-time :running)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:inputs :outputs :memory :timers :counters :scan-time :running)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung:IO PANEL STATE - Outputs:  Timer Example with{0 true} 
2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:inputs :outputs :memory :timers :counters :scan-time :running)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
LADDER EDITOR STATE - Outputs: {0 true}
  Final rung result:GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs :running)
LADDER OUTPUT ELEMENT - Address: 1 Type: :output Output Map: {0 true} Is Active: NO
 false
LADDER OUTPUT ELEMENT - Address:  RUNG RESULT: false 
========================================

0 Type: :output Output Map: {0 true} Is Active: YES
State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
UI Update Thread - PLC state from executor: outputs: {0 true}
USING EXISTING OUTPUTS: {0 true}
IO PANEL STATE - Outputs: {0 true}
LADDER EDITOR STATE - Outputs: {0 true}
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
LADDER OUTPUT ELEMENT - Address: 1 Type: :output Output Map: {0 true} Is Active: NO
LADDER OUTPUT ELEMENT - Address: 0 Type: :output Output Map: {0 true} Is Active: YES
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
DIRECT CHECK after setting input 0: Value = true
PRE-SCAN STATE: Input 0 = true Full inputs: {0 true, 1 false, 2 false, 3 false}
State before scan: {:outputs {0 true}, :inputs {0 true, 1 false, 2 false, 3 false}}
Pre-scan state - Inputs: (0 1 2 3) Values: (true false false false)
Pre-scan outputs: {0 true}

===== EXECUTING PROGRAM SCAN =====
Processing rung 0 : Rung 1 - Input 0 to Output 0
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
Rung 0 result: true
State after executing rung 0 - Outputs: {0 true}
Processing rung 1 : Rung 2
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
Rung 1 result: false
State after executing rung 1 - Outputs: {0 true, 1 false}
Processing rung 2 : Timer Example
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
Rung 2 result: false
State after executing rung 2 - Outputs: nil
Processing rung 3 : Counter Example
Evaluating rung: Counter Example with 2 elements
ERROR: Nil state passed to get-input!
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
Rung 3 result: false
State after executing rung 3 - Outputs: nil
===== PROGRAM SCAN COMPLETE =====
Post-scan state - Outputs: nil
FINAL STATE WITH OUTPUT 0 SET: {0 true}
Final state before atom update - Outputs: {0 true}
FINAL OUTPUT STATE: {0 true}
OUTPUT 0 VALUE: true
POST-UPDATE STATE: {0 true, 1 false, 2 false, 3 false}

========== DEBUG LADDER EXECUTION ==========
RUNG 1: Rung 1 - Input 0 to Output 0
----------------------------------------
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  normally-open input0      = true
  output output0            = true
Evaluating rung: Rung 1 - Input 0 to Output 0 with 2 elements
GET_INPUT CALLED - Address: 0 Value: true Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 0 = true
  Element results: (true true)
  Final rung result: true
  RUNG RESULT: true
========================================

RUNG 2: Rung 2
----------------------------------------
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
  normally-open input1      = false
Getting value for :output 0 = true
  normally-closed output0   = false
  output output1            = true
Evaluating rung: Rung 2 with 3 elements
GET_INPUT CALLED - Address: 1 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 1 = false
Getting value for :output 0 = true
  Element results: (false false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 3: Timer Example
----------------------------------------
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  normally-open input2      = false
  timer timer0              = true
Evaluating rung: Timer Example with 2 elements
GET_INPUT CALLED - Address: 2 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 2 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

RUNG 4: Counter Example
----------------------------------------
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  normally-open input3      = false
  counter counter0          = true
Evaluating rung: Counter Example with 2 elements
GET_INPUT CALLED - Address: 3 Value: false Inputs map: {0 true, 1 false, 2 false, 3 false} Full state keys: (:outputs :inputs)
Getting value for :input 3 = false
  Element results: (false true)
  Final rung result: false
  RUNG RESULT: false
========================================

State after scan: {:outputs {0 true}}
Shutting down PLC Simulator...
Stopping PLC execution...
Stopping PLC execution...
PLC execution stopped
JVM shutdown hook triggered!
Stopping PLC execution...
PLC execution stopped
