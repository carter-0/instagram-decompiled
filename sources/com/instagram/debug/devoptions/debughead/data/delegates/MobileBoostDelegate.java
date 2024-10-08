package com.instagram.debug.devoptions.debughead.data.delegates;

import java.util.Map;

public interface MobileBoostDelegate {
    void onBoostReleased(int i);

    void onBoostRequested(int i);

    void onMobileBoostInit(Map map);
}
