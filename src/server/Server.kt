package server

import java.io.IOException
import java.net.ServerSocket
import kotlin.concurrent.thread

class Server(
) {

      fun start() {
         try {
             //server start and listens on port 8888
             val server = ServerSocket(8888)
             while (true) {
                 // is active until a socket is connected this port
                 val clientSocket = server.accept()
                 println("The socket has connected:${clientSocket.inetAddress.hostAddress}")
                 thread {
                     //when connected it starts a separate thread where we send the socket to the ClientHandler
                     ClientHandler(clientSocket).handle()

                 }
             }

         }
         catch (ex: IOException){
             ex.printStackTrace()
    }

    }



















}