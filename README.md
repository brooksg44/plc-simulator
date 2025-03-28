# PLC Simulator

A Programmable Logic Controller (PLC) simulator implemented in Clojure with a graphical user interface. This application simulates basic ladder logic programming and execution commonly used in industrial automation.

## Features

- Graphical ladder logic editor
- Real-time I/O monitoring and control
- Timer and counter support
- Adjustable scan time
- Live program execution

## Installation

### Prerequisites

- Java JDK 11 or higher
- Leiningen (Clojure build tool)

### Building from Source

```bash
git clone https://github.com/yourusername/plc-simulator.git
cd plc-simulator
lein deps
```

## Usage

To start the application:

```bash
lein run
```

Or to create a standalone JAR:

```bash
lein uberjar
java -jar target/uberjar/plc-simulator-0.1.0-SNAPSHOT-standalone.jar
```

## How to Use

### Main Interface

The main interface consists of three main components:
- **I/O Monitor Tab**: View and control inputs and outputs
- **Ladder Editor Tab**: View and edit ladder logic programs
- **Control Bar**: Start/stop the PLC and adjust scan time

### Working with I/O Points

- Toggle inputs by clicking on the corresponding buttons
- Monitor outputs in real-time
- Add new I/O points by entering an address and clicking "Add"

### Ladder Logic Components

The simulator supports these basic ladder logic elements:
- **Normally Open Contacts**: Conducts when input is ON
- **Normally Closed Contacts**: Conducts when input is OFF
- **Outputs**: Controlled by rung logic
- **Timers**: Time-based operations
- **Counters**: Event counting

### Program Execution

1. Start the simulator by clicking the "Start" button
2. Adjust scan time with the slider (affects execution speed)
3. Toggle inputs to see the program respond in real-time
4. Stop execution with the "Stop" button

## Architecture

The simulator is structured into these main components:

- **Model**: Defines the PLC state and ladder logic data structures
- **Engine**: Executes the ladder logic program
- **UI**: Provides the graphical interface

## Example Program

The application comes with an example program that demonstrates basic ladder logic functionality including inputs, outputs, timers, and counters.

## License

Copyright © 2025

This program is available under the Eclipse Public License 2.0.
