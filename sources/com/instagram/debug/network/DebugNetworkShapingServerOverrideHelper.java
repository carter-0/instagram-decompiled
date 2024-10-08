package com.instagram.debug.network;

import X.0lg;
import X.0qQ;
import com.instagram.debug.network.L;
import java.util.Calendar;

public final class DebugNetworkShapingServerOverrideHelper {
    public static final DebugNetworkShapingServerOverrideHelper INSTANCE = new Object();

    public static final long getSleepPerChunkOverride(0lg r1) {
        0qQ.A0B(r1, 0);
        if (!INSTANCE.isDayEnabled(r1)) {
            return 0;
        }
        Long andExpose = L.ig_android_slow_network_debug_tool_config.sleep_time_per_chunk.getAndExpose(r1);
        0qQ.A0A(andExpose);
        return andExpose.longValue();
    }

    private final boolean isDayEnabled(0lg r4) {
        int longValue = (int) L.ig_android_slow_network_debug_tool_config.days_of_week.getAndExpose(r4).longValue();
        int i = 1 << Calendar.getInstance().get(7);
        if ((longValue & i) != i) {
            return false;
        }
        return true;
    }
}
