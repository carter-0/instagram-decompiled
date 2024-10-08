package X;

import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.Modifier;

public final class J75 extends 0Yg implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ JNV A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J75(JNV jnv, Modifier modifier, long j, boolean z) {
        super(2);
        this.A00 = j;
        this.A03 = z;
        this.A02 = modifier;
        this.A01 = jnv;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C287295Zu r4;
        C286575Wy r13 = (C286575Wy) obj;
        if (C51968G9o.A0B(obj2) != 2 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1403892287, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)");
            }
            long j = this.A00;
            if (j != 9205357640488583168L) {
                r13.ExS(-837727128);
                boolean z = this.A03;
                if (z) {
                    r4 = C55370Hgc.A01;
                } else {
                    r4 = C55370Hgc.A00;
                }
                Modifier Ezh = this.A02.Ezh(new SizeElement(C287655aY.A00, C51971G9r.A01(j), C51972G9s.A00(j), Float.NaN, Float.NaN, false));
                JNV jnv = this.A01;
                AnonymousClass5RD A022 = C287395a4.A02(r4, r13, C287215Zl.A05, 0);
                int A002 = C287425a7.A00(r13);
                C286565Wx r42 = (C286565Wx) r13;
                AnonymousClass5RM A04 = C286565Wx.A04(r42);
                Modifier A012 = C287435a8.A01(r13, Ezh);
                C51973G9u.A0y(r13, r42);
                C51971G9r.A12(r13, A022, A04);
                0sL r1 = C287485aD.A02;
                if (r42.A0K || !C51972G9s.A1Q(r13, A002)) {
                    C51971G9r.A13(r13, r1, A002);
                }
                C51965G9l.A18(r13, A012);
                C285245Qk r2 = Modifier.A00;
                boolean AGw = r13.AGw(jnv);
                Object ECw = r13.ECw();
                if (AGw || ECw == AnonymousClass5XT.A00) {
                    ECw = new C58682Ivr(jnv, 39);
                    r13.FLL(ECw);
                }
                C56607I4g.A03(r13, r2, (C62320sa) ECw, 6, z);
                r13.ASN();
            } else {
                r13.ExS(-836867312);
                Modifier modifier = this.A02;
                JNV jnv2 = this.A01;
                boolean AGw2 = r13.AGw(jnv2);
                Object ECw2 = r13.ECw();
                if (AGw2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C58682Ivr(jnv2, 40);
                    r13.FLL(ECw2);
                }
                C56607I4g.A03(r13, modifier, (C62320sa) ECw2, 0, this.A03);
            }
            if (C51970G9q.A1a(r13, false)) {
                0fL.A00(1201407438);
            }
        } else {
            r13.Evl();
        }
        return C60340gF.A00;
    }
}
