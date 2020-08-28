package edu.eci.arep.microspring;
import edu.eci.arep.httpserver.HttpServer;
public class MicroSpringBoot {
    public static void main(String[] args){
        args = new String[]{"edu.eci.arep.microspring.ExampleController"};
        try{
            MicroSpring iocServer = new MicroSpring();
            iocServer.start(args);
            HttpServer server = new HttpServer(iocServer);
            server.setPort(getPort());
            server.start();
        }catch (Exception ex){
            ex.printStackTrace();;
        }
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 36000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
