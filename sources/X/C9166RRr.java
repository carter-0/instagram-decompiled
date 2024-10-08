package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;

/* renamed from: X.RRr  reason: case insensitive filesystem */
public abstract class C9166RRr {
    public static FingerprintManager A00(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }
}
