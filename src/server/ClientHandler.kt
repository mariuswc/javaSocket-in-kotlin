package server

import java.io.BufferedReader
import java.io.InputStream
import java.io.OutputStream
import java.net.Socket

class ClientHandler(
    private val clientSocket: Socket) {

 lateinit var inputStream: InputStream
//lateinit var outputStream: OutputStream
private var running: Boolean = false


fun handle(){
    running = true
    println("Welcome to the chat, please enter your message")
    while (running){
        try {
            //reading input from stream
            inputStream = clientSocket.getInputStream()
            inputStream.read().toString()
        }
        catch (e: Exception){
            throw(IllegalArgumentException(e))
        }
    }

}
}