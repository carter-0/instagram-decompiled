package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.JBj  reason: case insensitive filesystem */
public final class C59231JBj extends 0Yg implements 0sL {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59231JBj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, float f, int i, int i2, int i3) {
        super(2);
        this.A01 = i3;
        this.A03 = i;
        this.A05 = obj;
        this.A00 = f;
        this.A04 = obj2;
        this.A07 = obj3;
        this.A0A = obj4;
        this.A08 = obj5;
        this.A06 = obj6;
        this.A09 = obj7;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.A01 != 0) {
            C286575Wy A0R = C51966G9m.A0R(obj3, obj4);
            int i = this.A03;
            float f = this.A00;
            C54907HXp.A00((Bitmap) this.A04, A0R, (AnonymousClass5S2) this.A05, (C62320sa) this.A07, (C62320sa) this.A0A, (C62320sa) this.A06, (C62320sa) this.A09, (0sP) this.A08, f, i, C51966G9m.A01(this.A02));
        } else {
            C286575Wy r1 = (C286575Wy) obj3;
            if (C51968G9o.A0B(obj4) != 2 || !r1.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(1927887614, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoCreationPostCaptureScreen.<anonymous> (PotatoCreationPostCaptureScreen.kt:55)");
                }
                C62320sa r4 = (C62320sa) this.A07;
                C62320sa r10 = (C62320sa) this.A0A;
                Bitmap bitmap = (Bitmap) this.A04;
                AnonymousClass5S2 r19 = (AnonymousClass5S2) this.A05;
                float f2 = this.A00;
                C62320sa r18 = (C62320sa) this.A09;
                int i2 = this.A02;
                C62320sa r7 = (C62320sa) this.A06;
                int i3 = this.A03;
                0sP r6 = (0sP) this.A08;
                C285245Qk r3 = Modifier.A00;
                Alignment alignment = C287215Zl.A0E;
                AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
                int A003 = C287425a7.A00(r1);
                C286565Wx r2 = (C286565Wx) r1;
                AnonymousClass5RM A042 = C286565Wx.A04(r2);
                Modifier A012 = C287435a8.A01(r1, r3);
                C62320sa r13 = C287485aD.A00;
                C51973G9u.A0z(r1, r2, r13);
                0sL r12 = C287485aD.A03;
                0sL A0w = C51969G9p.A0w(r1, A002, A042, r12);
                0sL r11 = C287485aD.A02;
                if (r2.A0K || !C51972G9s.A1Q(r1, A003)) {
                    C51971G9r.A13(r1, r11, A003);
                }
                0sL A1K = C51966G9m.A1K(r1, A012);
                C289515dj r5 = C289515dj.A00;
                Modifier AAz = r5.AAz(alignment, C287195Zj.A01(r3));
                Object A0m = C51967G9n.A0m(r1, -659092396);
                Object obj5 = AnonymousClass5XT.A00;
                C286565Wx.A0L(r2, false);
                C286575Wy r21 = r1;
                C288165bT.A00(r21, G9w.A0B((C287605aT) C51972G9s.A0l(r1, A0m, obj5), AAz, r4), C287975bA.A00(r1, R.drawable.instagram_chevron_left_pano_outline_24, 0), 0, 18, C51966G9m.A0E(r1));
                Modifier A072 = C287195Zj.A07(r5.AAz(C287215Zl.A0D, r3), 16.0f);
                C286565Wx.A0L(r2, false);
                Modifier A0B = G9w.A0B((C287605aT) C51974G9v.A0W(r1, obj5, -659076044), A072, r10);
                String A004 = C288035bG.A00(r1, 2131973441);
                long A013 = AnonymousClass5Z7.A01(17);
                AnonymousClass5ZZ.A0K(r21, A0B, C51965G9l.A0S(r1), A004, 3072, 16368, G9w.A05(r1), A013);
                Modifier A0L = C51965G9l.A0L(r5, JJP.A00(C287195Zj.A0B(r3, 34.0f, 0.0f, 34.0f, 0.0f).Ezh(C287205Zk.A01), C287655aY.A00, 0));
                AnonymousClass5RD A0M = G9w.A0M(r1);
                int A005 = C287425a7.A00(r1);
                AnonymousClass5RM A043 = C286565Wx.A04(r2);
                Modifier A014 = C287435a8.A01(r1, A0L);
                C51973G9u.A0z(r1, r2, r13);
                C287595aO.A00(r1, A0M, r12);
                if (C51965G9l.A1Y(r1, r2, A043, A0w) || !C51972G9s.A1Q(r1, A005)) {
                    C51971G9r.A13(r1, r11, A005);
                }
                C287595aO.A00(r1, A014, A1K);
                C54906HXo.A00(bitmap, r1, r19, r18, f2, 0, 0);
                G9w.A15(r1, r3, 24.0f);
                C54904HXm.A00(r1, r7, i2, 0);
                G9w.A15(r1, r3, 16.0f);
                C54905HXn.A00(r1, r6, i3, 0);
                G9w.A15(r1, r3, 16.0f);
                if (C51971G9r.A1R(r1)) {
                    0fL.A00(-1226931972);
                }
            } else {
                r1.Evl();
            }
        }
        return C60340gF.A00;
    }
}
