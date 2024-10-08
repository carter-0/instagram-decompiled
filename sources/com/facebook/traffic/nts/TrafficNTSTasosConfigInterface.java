package com.facebook.traffic.nts;

public interface TrafficNTSTasosConfigInterface {
    CongestionManagerConfigInterface getCongestionManagerConfig();

    boolean getEnableTasosBweManager();

    boolean getEnableTasosBweManagerV2();

    boolean getEnableTasosCongestionManager();

    boolean getEnableTasosHeaderInjector();
}
