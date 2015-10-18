package messaging;

import com.rabbitmq.client.*;

/**
 * Created by oleh.krupenia on 10/17/2015.
 */
public class ServerToStomp {

    private static final String EXCHANGE_NAME = "test1";

    public static void main(String[] argv) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "topic");

        String routingKey = "test1";
        String message = "hello";
        channel.basicPublish(EXCHANGE_NAME, routingKey, null, message.getBytes());
        System.out.println(" [x] Sent '" + routingKey + "':'" + message + "'" + channel.getConnection().getPort());

        connection.close();
    }
// ...
}
