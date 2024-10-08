package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.0sP;
import android.view.Surface;

public interface ISurfaceVideoSink extends IRawVideoSink {
    void addSurfaceListener(0sP r1);

    Surface getSurface();

    void removeSurfaceListener(0sP r1);
}
