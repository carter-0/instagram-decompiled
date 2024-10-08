package com.instagram.debug.quickexperiment;

import X.0KC;
import X.0qQ;
import X.0yN;
import X.AnonymousClass000;
import X.AnonymousClass0UC;
import X.C63140yR;
import X.XYV;
import java.util.Arrays;

public final class OverlayConfigHelper {
    public static final OverlayConfigHelper INSTANCE = new Object();
    public static final String TAG = "OverlayConfigHelper";

    public static final boolean isOverlayConfig(0yN r5) {
        0qQ.A0B(r5, 0);
        long j = r5.mobileConfigSpecifier;
        try {
            if (Arrays.binarySearch(XYV.A00, C63140yR.A00(j)) < 0) {
                return false;
            }
            return true;
        } catch (AnonymousClass0UC e) {
            0KC.A0M(TAG, AnonymousClass000.A00(2275), e, new Object[]{Long.valueOf(j)});
            return false;
        }
    }
}
