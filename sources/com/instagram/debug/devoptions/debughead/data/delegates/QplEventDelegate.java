package com.instagram.debug.devoptions.debughead.data.delegates;

import X.0XY;
import java.util.Map;

public interface QplEventDelegate {
    void initializeFromCache(Map map);

    void onLoomTriggerMarkerEnd();

    void onLoomTriggerMarkerStart();

    void reportQplEventForDebug(0XY r1);

    void reportQplMarkerPointForDebug(int i, String str, String str2, long j);
}
