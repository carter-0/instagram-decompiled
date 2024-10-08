package com.facebook.blescan;

import X.0KC;
import X.C3722490b;
import X.S0D;
import X.S3S;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class BleScanOperation extends C3722490b {
    public S0D A00;
    public S3S A01;
    public boolean A02;
    public final Context A03;
    public final ScheduledExecutorService A04;

    public static void A00(BleScanOperation bleScanOperation) {
        boolean z;
        bleScanOperation.A02 = false;
        bleScanOperation.A00 = null;
        S3S s3s = bleScanOperation.A01;
        if (s3s != null) {
            synchronized (s3s) {
                z = s3s.A07;
            }
            if (z) {
                try {
                    bleScanOperation.A01.A00();
                } catch (Exception e) {
                    0KC.A0F("com.facebook.blescan.BleScanOperation", "Exception stopping BLE scanning", e);
                }
            }
            bleScanOperation.A01 = null;
        }
    }

    public BleScanOperation(Context context, S3S s3s, ScheduledExecutorService scheduledExecutorService) {
        this.A04 = scheduledExecutorService;
        this.A03 = context;
        this.A01 = s3s;
    }
}
