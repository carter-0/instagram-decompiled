package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Hv3  reason: case insensitive filesystem */
public abstract class C56236Hv3 {
    public static final void A00(C286575Wy r8, Modifier modifier, int i) {
        int i2;
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier, 0);
        C286575Wy r4 = r8;
        r8.ExV(-595744493);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-282050137, "com.instagram.barcelona.location.ui.PinIcon (LocationTag.kt:43)");
            }
            C288165bT.A01(r4, modifier2, C287975bA.A00(r4, R.drawable.barcelona_location_outline_12, 0), ((i2 << 6) & 896) | 48, C51966G9m.A0L(r8));
            if (0fL.A02()) {
                0fL.A00(282436083);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, modifier2, i, 23);
        }
    }

    public static final void A01(C286575Wy r19, Modifier modifier, String str, C62320sa r22, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        C62320sa r4 = r22;
        boolean A1U = AnonymousClass7TF.A1U(0, str2, r4);
        C286575Wy r0 = r19;
        r0.ExV(480201501);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r0, str2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r0, r4);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r0, modifier2);
        }
        if ((i3 & 147) != 146 || !r0.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1143084675, "com.instagram.barcelona.location.ui.LocationTag (LocationTag.kt:21)");
            }
            Modifier A02 = C288235ba.A02(r0, modifier2, C51965G9l.A0R(0), r4);
            AnonymousClass5RD A0W = C51968G9o.A0W(r0);
            int A00 = C287425a7.A00(r0);
            C286565Wx r10 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r10);
            Modifier A01 = C287435a8.A01(r0, A02);
            C51973G9u.A0y(r0, r10);
            C51971G9r.A12(r0, A0W, A04);
            0sL r6 = C287485aD.A02;
            if (r10.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r6, A00);
            }
            C51965G9l.A18(r0, A01);
            AnonymousClass6FX r5 = AnonymousClass6FX.A00;
            AnonymousClass5Z4 A0C = AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0b(r0), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 16777213, 0, AnonymousClass5Z7.A01(13), 0, 0);
            long A0M = C51966G9m.A0M(r0);
            C285245Qk r7 = Modifier.A00;
            AnonymousClass5ZZ.A0L(r0, r5.FNR(r7, 1.0f, false), A0C, str2, i3 & 14, A0M);
            A00(r0, C51967G9n.A0E(r7, 1.0f), 6);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(111733719);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8Y(modifier2, r4, str2, i4, i5, A1U ? 1 : 0);
        }
    }
}
