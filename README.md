# How to Run and Test the TCP Server

## 1. Start the Server (IntelliJ)

1. Open the project in IntelliJ.
2. Locate the file containing the `main()` function.
3. Click the green ▶ button next to `main()` and select **Run**.

The server will start listening on port `8888` and wait for incoming connections.

---

## 2. Test the Server Using Telnet (Windows)

### Enable Telnet (if not already enabled)

1. Press **Win + R**
2. Type `optionalfeatures`
3. Enable **Telnet Client**
4. Click **OK** and wait for installation to complete
5. Restart PowerShell or Command Prompt

Open a new terminal window and run: telnet localhost 8888

### Connect to the Server

## 2. Test the Server using NetCat (Mac)
1. Open terminal
2. run nc localhost 8888
   

You are now connected to the server.

Type a message and press **Enter**.  
The server will receive and process your input.
