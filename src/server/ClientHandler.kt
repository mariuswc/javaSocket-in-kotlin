package server

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStream
import java.io.OutputStream
import java.io.PrintWriter
import java.net.Socket


class ClientHandler(clientSocket: Socket) {

    private val write: OutputStream = clientSocket.getOutputStream()
    private val reader: InputStream = clientSocket.getInputStream()
    private var running: Boolean = false

    fun handle() {
        running = true
        //reads from client
        val readingFromClient = BufferedReader(reader.reader())
        //writes back to the client
        val writingToClient = BufferedWriter(write.writer())

        println("Server has started, please type something ")
        //socket connection is OK
        while (running) {
            try {
                val message = readingFromClient.readLine()
                println("You received a message: ${message.trim()}")
//                if (message == "null"){
//                    print(" Client has shutdown ")
//                    clientSocket.close()
//                }
                PrintWriter(writingToClient, true)

            } catch (e: Exception) {
                throw (IllegalArgumentException(e))
            }
        }

    }
}
