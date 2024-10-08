package com.facebook.traffic.nts;

public interface CongestionManagerConfigInterface {
    String getCongestionSignalHeader();

    double getCongestionSignalThreshold();

    int getCongestionStateExpirySeconds();

    boolean getEnableCongestionLogging();

    boolean getEnableCongestionObservability();

    boolean getEnableCongestionSignalInjection();
}
