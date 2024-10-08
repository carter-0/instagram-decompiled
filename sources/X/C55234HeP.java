package X;

import android.text.style.ForegroundColorSpan;

/* renamed from: X.HeP  reason: case insensitive filesystem */
public abstract class C55234HeP {
    public static final void A00(C52813Gd5 gd5, HNO hno, 0sP r6) {
        C59535JNh A01 = I3I.A01(gd5.A00);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(I41.A00(A01).EIY(hno, A01.CRB()));
        int length = gd5.length();
        r6.invoke(gd5);
        gd5.setSpan(foregroundColorSpan, length, gd5.length(), 17);
    }
}
