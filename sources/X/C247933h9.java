package X;

import android.os.Build;

/* renamed from: X.3h9  reason: invalid class name and case insensitive filesystem */
public abstract class C247933h9 {
    public static final AnonymousClass0eM A00;
    public static final AnonymousClass0eM A01;
    public static final AnonymousClass0eM A02;
    public static final AnonymousClass0eM A03;

    static {
        0eO r1 = 0eO.A02;
        A03 = AnonymousClass0eN.A00(r1, C247943hA.A00);
        A00 = AnonymousClass0eN.A00(r1, C247953hB.A00);
        A01 = AnonymousClass0eN.A00(r1, C247963hC.A00);
        A02 = AnonymousClass0eN.A00(r1, C247973hD.A00);
    }

    public static final C247993hF A00() {
        C247993hF r0;
        if (Build.VERSION.SDK_INT < 34 || !((Boolean) A03.getValue()).booleanValue()) {
            r0 = C247983hE.A00;
        } else {
            r0 = C64848LjA.A00;
        }
        return r0;
    }
}
