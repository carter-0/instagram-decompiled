package X;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* renamed from: X.5ck  reason: invalid class name and case insensitive filesystem */
public abstract class C288945ck {
    public static C288975cn A00(View view) {
        ContentCaptureSession A00;
        if (Build.VERSION.SDK_INT < 29 || (A00 = C288965cm.A00(view)) == null) {
            return null;
        }
        return C288975cn.A00(view, A00);
    }

    public static void A01(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C288955cl.A00(view);
        }
    }
}
