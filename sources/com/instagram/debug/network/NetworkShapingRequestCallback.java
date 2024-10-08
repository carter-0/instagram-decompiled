package com.instagram.debug.network;

import X.0qQ;
import X.1Qd;
import X.2ZD;
import X.C51974G9v;
import X.JTO;
import X.Pxf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Random;

public final class NetworkShapingRequestCallback implements 1Qd {
    public final NetworkShapingConfiguration configuration;
    public final Random random = new Random();
    public boolean simulateFailure;
    public final String tag;
    public int totalData;
    public final String uri;
    public final 1Qd wrappedCallback;

    public void onFailed(IOException iOException) {
        0qQ.A0B(iOException, 0);
        this.wrappedCallback.onFailed(iOException);
    }

    public void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        if (!this.simulateFailure) {
            maybeSimulateFailure();
            if (!this.simulateFailure) {
                long sleepTimePerChunk = (this.configuration.getSleepTimePerChunk() * ((long) byteBuffer.remaining())) / 4096;
                if (sleepTimePerChunk > 0) {
                    0qQ.A07(String.format(Locale.US, "Slowing down network download by %dms: %s", Pxf.A1X(Long.valueOf(sleepTimePerChunk), this.uri, 2)));
                    try {
                        Thread.sleep(sleepTimePerChunk);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                this.wrappedCallback.onNewData(byteBuffer);
                this.totalData += byteBuffer.remaining();
                maybeSimulateFailure();
            }
        }
    }

    public void onResponseStarted(2ZD r2) {
        0qQ.A0B(r2, 0);
        this.wrappedCallback.onResponseStarted(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r5.configuration;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void maybeSimulateFailure() {
        /*
            r5 = this;
            boolean r0 = r5.simulateFailure
            if (r0 != 0) goto L_0x0036
            com.instagram.debug.network.NetworkShapingConfiguration r2 = r5.configuration
            int r1 = r2.getFailNetworkRequestAfterBytesCount()
            r0 = -1
            if (r1 == r0) goto L_0x0036
            int r4 = r5.totalData
            if (r4 < r1) goto L_0x0036
            java.util.Random r1 = r5.random
            int r0 = r2.getFailNetworkRequestProbability()
            int r1 = r1.nextInt(r0)
            r0 = 1
            if (r1 >= r0) goto L_0x0036
            r5.simulateFailure = r0
            java.util.Locale r3 = java.util.Locale.US
            r2 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = r5.uri
            java.lang.Object[] r1 = X.Pxf.A1X(r1, r0, r2)
            java.lang.String r0 = "Failing request after %d bytes: %s"
            java.lang.String r0 = java.lang.String.format(r3, r0, r1)
            X.0qQ.A07(r0)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.network.NetworkShapingRequestCallback.maybeSimulateFailure():void");
    }

    public void onComplete() {
        boolean z = this.simulateFailure;
        1Qd r1 = this.wrappedCallback;
        if (z) {
            r1.onFailed(JTO.A0u("IG Dev Tools: Simulated Network Failure"));
        } else {
            r1.onComplete();
        }
    }

    public NetworkShapingRequestCallback(1Qd r2, NetworkShapingConfiguration networkShapingConfiguration, String str, String str2) {
        C51974G9v.A1P(r2, networkShapingConfiguration, str, str2);
        this.wrappedCallback = r2;
        this.configuration = networkShapingConfiguration;
        this.uri = str;
        this.tag = str2;
    }
}
