package com.instagram.realtimeclient;

public interface MainRealtimeEventHandler$Delegate {
    String getProtocol();

    int getSkywalkerMessageType();

    void handleRealtimeOperation(RealtimeOperation realtimeOperation);
}
