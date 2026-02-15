package server

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.PrintWriter
import java.net.Socket


class ClientHandler(private val clientSocket: Socket) {

    private val reader = BufferedReader(clientSocket.getInputStream().reader())
    private val writer = BufferedWriter(clientSocket.getOutputStream().writer())
    private var running: Boolean = false

    fun handle() {
        running = true
        println("Someone has started a chat with you")

        //Sending message to client:
        writeMessage("Hello, type something")

        //socket connection is OK
        while (running) {
            try {

                //reading message
                readMessage()

            } catch (e: Exception) {
                throw (IllegalArgumentException(e))
            }
        }
    }


    private fun readMessage() {
        return println(reader.readLine())
    }
    private fun writeMessage(message: String) {
        return PrintWriter(writer, true)
            .println(message)
    }
}


