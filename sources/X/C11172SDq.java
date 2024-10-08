package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.SDq  reason: case insensitive filesystem */
public final class C11172SDq {
    public static final C11172SDq A01 = new C11172SDq();
    public final 0xa A00;

    public C11172SDq() {
        Context context = C60960kU.A00;
        SharedPreferences A0H = Pxe.A0H(context, 002.A0R(context.getPackageName(), "_preferences"));
        0qQ.A07(A0H);
        this.A00 = new 0tX(A0H, "IgPapayaSharedPreferences");
    }
}
