package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.7q3  reason: invalid class name and case insensitive filesystem */
public final class C343337q3 {
    public TotalCaptureResult A00;

    public final Object A00(CaptureResult.Key key) {
        try {
            TotalCaptureResult totalCaptureResult = this.A00;
            if (totalCaptureResult != null) {
                return totalCaptureResult.get(key);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
