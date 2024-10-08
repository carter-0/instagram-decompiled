package com.facebook.traffic.nts.providers.reachability;

public interface ReachabilityV2ProviderAppLayer {
    void setUpcallImpl(ReachabilityV2ProviderAppLayerUpcalls reachabilityV2ProviderAppLayerUpcalls);

    void updateConnectionType(int i);
}
