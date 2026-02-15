How to Run and Test the TCP Server
1. Start the Server

Open the project in IntelliJ and run the main() function.

The server will start listening on port 8888 and wait for incoming connections.

2. Test Using Telnet (Windows)

If Telnet is not enabled on your system, enable it first:

Press Win + R

Type optionalfeatures

Check Telnet Client

Click OK and wait for installation

Restart PowerShell or Command Prompt

Once enabled, open a new terminal and run:

telnet localhost 8888


You are now connected to the server.

Type a message and press Enter.
The server will receive and process your input.
