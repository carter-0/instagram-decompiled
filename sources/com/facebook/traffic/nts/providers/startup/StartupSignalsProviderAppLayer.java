package com.facebook.traffic.nts.providers.startup;

public interface StartupSignalsProviderAppLayer {
    void notifyStartupCompleted(int i);

    void setUpcallImpl(StartupSignalsProviderAppLayerUpcalls startupSignalsProviderAppLayerUpcalls);
}
