# Java WebSocket Chat Server

A lightweight real-time chat application using Java WebSocket API, featuring a multithreaded server, client handler, and a simple Swing-based GUI for client-side interaction.

This project showcases fundamental concepts in system design, concurrency, and network communication — ideal for demonstrating your distributed systems interest.

## Features

- Real-time messaging using the WebSocket protocol
- Multithreaded server supporting multiple clients concurrently
- Graceful connection handling with session tracking
- Java Swing-based GUI for client interface
- Server-side message broadcasting
- Clean modular codebase with separation of concerns

## Tech Stack

- **Language:** Java
- **Networking:** Java WebSocket API (`javax.websocket`)
- **Concurrency:** Java Threads
- **GUI:** Java Swing

## Getting Started

### Prerequisites

- Java 11+ (Java 17 recommended)
- Maven or compatible build tool

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/java-chat-server.git
   cd java-chat-server
   ```

2. **Compile the project:**

    ```bash
        mvn clean install
    ```
3. **Compile and start the server:**
    ```bash
        javac ChatServer.java
        java ChatServer
    ```
4. **Compile and start the client:**
    ```bash
        javac ChatClient.java
        java ChatServer
    ```
5. **Compile Chat GUI:**
    ```bash
    javac ChatClientGUI.java
    ```
6. **Start Chat GUI:**
    ```bash
    java ChatClientGUI
    ```