package com.facebook.rsys.networkinfo.gen;

public abstract class NetworkInfoProxy {
    public abstract void start(NetworkInfoCallback networkInfoCallback);

    public abstract void stop();
}
