package com.instagram.debug.network;

import X.0qQ;
import X.19W;
import X.1QS;
import X.1QU;
import X.DbW;
import X.Pxf;
import java.nio.ByteBuffer;
import java.util.Locale;

public final class NetworkThrottleDebugServiceLayer$startRequest$1 extends 19W {
    public final /* synthetic */ long $sleepDuration;

    public void onNewData(1QS r7, 1QU r8, ByteBuffer byteBuffer) {
        int A02 = DbW.A02(0, r7, byteBuffer);
        long remaining = (this.$sleepDuration * ((long) byteBuffer.remaining())) / 4096;
        0qQ.A07(String.format(Locale.US, "Slowing down network download by %dms: %s", Pxf.A1X(Long.valueOf(remaining), r7.A09.toString(), A02)));
        try {
            Thread.sleep(remaining);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public NetworkThrottleDebugServiceLayer$startRequest$1(long j) {
        this.$sleepDuration = j;
    }
}
