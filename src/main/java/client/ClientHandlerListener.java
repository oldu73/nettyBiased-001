package client;

import common.Envelope;

public interface ClientHandlerListener {

    void messageReceived(Envelope message);
}
