package X;

import android.os.Build;

/* renamed from: X.39m  reason: invalid class name and case insensitive filesystem */
public final class C2378539m extends C2378139i {
    public final boolean A01(AnonymousClass3DG r4) {
        Integer num = r4.A0B.A02;
        if (num == AnonymousClass05K.A0C) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 30 || num != AnonymousClass05K.A0j) {
            return false;
        }
        return true;
    }
}
