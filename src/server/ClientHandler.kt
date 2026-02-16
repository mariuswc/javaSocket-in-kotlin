package server

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.PrintWriter
import java.net.Socket
import kotlin.concurrent.thread


class ClientHandler(clientSocket: Socket) {

    private val reader = BufferedReader(clientSocket.getInputStream().reader())
    private val writer = BufferedWriter(clientSocket.getOutputStream().writer())
    private var running: Boolean = false
    private val user = clientSocket.localAddress

    fun handle() {
        running = true
        println("Someone has started a chat with you")

        //Sending message to client:
        welcomeMessage("$user:  Welcome to the server, type something")

        //running client on seperate thread
        thread {
            while (running) {
                try {
                    readMessage()
                } catch (e: Exception) {
                    running = false
                }
            }
        }

        //running client on seperate thread
        while (running) {
            try {
                respondMessage()
            } catch (e: Exception) {
                running = false
            }
        }
    }


    private fun readMessage() {
        val message = reader.readLine()
        println("The user wrote: $message")

        }

    private fun welcomeMessage(message: String) {
        return PrintWriter(writer, true)
            .println(message)
    }
    private fun respondMessage() {
        val input = readln()
        PrintWriter(writer, true).println("Server responds with: $input")
    }

}
