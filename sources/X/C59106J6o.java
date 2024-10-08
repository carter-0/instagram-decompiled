package X;

import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.J6o  reason: case insensitive filesystem */
public final class C59106J6o extends 0Yg implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Modifier A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59106J6o(Modifier modifier, long j) {
        super(2);
        this.A00 = j;
        this.A01 = modifier;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy r13 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1591191130, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:64)");
            }
            long j = this.A00;
            if (j != 9205357640488583168L) {
                r13.ExS(1828881000);
                Modifier Ezh = this.A01.Ezh(new SizeElement(C287655aY.A00, C51971G9r.A01(j), C51972G9s.A00(j), Float.NaN, Float.NaN, false));
                AnonymousClass5RD A002 = C287675aa.A00(C287215Zl.A0C, false);
                int A003 = C287425a7.A00(r13);
                C286565Wx r3 = (C286565Wx) r13;
                AnonymousClass5RM A04 = C286565Wx.A04(r3);
                Modifier A012 = C287435a8.A01(r13, Ezh);
                C51973G9u.A0y(r13, r3);
                C51971G9r.A12(r13, A002, A04);
                0sL r1 = C287485aD.A02;
                if (r3.A0K || !C51972G9s.A1Q(r13, A003)) {
                    C51971G9r.A13(r13, r1, A003);
                }
                C51965G9l.A18(r13, A012);
                I3R.A01((Modifier) null, r13, 0, 1);
                r13.ASN();
            } else {
                r13.ExS(1829217412);
                I3R.A01(this.A01, r13, 0, 0);
            }
            if (C51970G9q.A1a(r13, false)) {
                0fL.A00(91904371);
            }
        } else {
            r13.Evl();
        }
        return C60340gF.A00;
    }
}
