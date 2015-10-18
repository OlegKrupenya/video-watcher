package messaging;

import java.util.Date;

/**
 * A class that contains information about connection of a client to web socket
 * @author oleg.krupenya
 */
public class ClientConnectionData {
    /**
     * Time of connection of a client to web socket
     */
    private Date connectionTime;

    public Date getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(Date connectionTime) {
        this.connectionTime = connectionTime;
    }
}
