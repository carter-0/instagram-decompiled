package com.facebook.realtime.common.network;

public interface NetworkDetailedStateGetter {
    String getNetworkSubType();

    String getNetworkType();

    String getSignalStrength();
}
