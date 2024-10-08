package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HwG  reason: case insensitive filesystem */
public abstract class C56303HwG {
    public static final void A01(C286575Wy r17, Modifier modifier, AnonymousClass2DO r19, C62320sa r20, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        AnonymousClass2DO r15 = r19;
        C62320sa r9 = r20;
        boolean A1U = AnonymousClass7TF.A1U(0, r15, r9);
        C286575Wy r11 = r17;
        r11.ExV(951498);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r11, r15) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r11, r9);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r11, modifier2);
        }
        if ((i3 & 147) != 146 || !r11.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1196880483, "com.instagram.feed.adapter.row.ufi.compose.ComposeContentNotesNux (ComposeContentNotesNux.kt:37)");
            }
            Modifier A0B = C287195Zj.A0B(modifier2, 4.0f, 0.0f, 0.0f, 0.0f);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r11);
            C286565Wx r12 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r12);
            Modifier A01 = C287435a8.A01(r11, A0B);
            C51973G9u.A0y(r11, r12);
            C51971G9r.A12(r11, A0a, A04);
            0sL r2 = C287485aD.A02;
            if (r12.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r2, A00);
            }
            C51965G9l.A18(r11, A01);
            String A002 = C304346Dc.A00(r11, 2131956634);
            C285245Qk r6 = Modifier.A00;
            Modifier A003 = HRH.A00(C287205Zk.A08(C287205Zk.A0D(C287195Zj.A0B(r6, 4.0f, 2.0f, 0.0f, 0.0f), 28.0f), 32.0f), 10.0f);
            AnonymousClass5aQ.A02(r11);
            AnonymousClass5ZQ r5 = AnonymousClass5ZM.A01;
            Modifier A012 = AnonymousClass6FZ.A01(A003, r5);
            long A0F = C51966G9m.A0F(r11);
            AnonymousClass5aQ.A02(r11);
            Modifier A03 = C304816Fi.A03(A012, r5, 0.5f, A0F);
            boolean A1O = C51973G9u.A1O(r11, 486083503, i3);
            Object ECw = r11.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = new C58684Ivt(r9, 39);
                r11.FLL(ECw);
            }
            AnonymousClass6G3.A0A(r17, C287635aW.A05(A03, (C287625aV) null, (String) null, C51965G9l.A0y(r12, ECw, false), A1U), r19, C288075bK.A00, A002, (i3 & 14) | 24576);
            A00(r11, HRH.A00(r6, -6.0f), 0);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(1188310374);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            int i7 = i5;
            ASQ.A06 = new JG6(i7, i4, 30, modifier2, r19, r9);
        }
    }

    public static final void A00(C286575Wy r20, Modifier modifier, int i) {
        int i2;
        C286575Wy r5 = r20;
        r5.ExV(-427697010);
        int i3 = i;
        Modifier modifier2 = modifier;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r5, modifier2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1395054750, "com.instagram.feed.adapter.row.ufi.compose.PlusBubble (ComposeContentNotesNux.kt:66)");
            }
            long A08 = C51966G9m.A08(r5);
            boolean A1W = AnonymousClass7TF.A1W(C51966G9m.A15(r5), AnonymousClass5Q8.Rtl);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r5);
            C286565Wx r2 = (C286565Wx) r5;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r5, modifier2);
            C51973G9u.A0y(r5, r2);
            C51971G9r.A12(r5, A0a, A04);
            0sL r10 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r5, A00)) {
                C51971G9r.A13(r5, r10, A00);
            }
            C51965G9l.A18(r5, A01);
            AnonymousClass2DO A002 = C287975bA.A00(r5, R.drawable.instagram_add_pano_outline_24, 0);
            C285245Qk r7 = Modifier.A00;
            Modifier A03 = C287205Zk.A03(r7);
            AnonymousClass5aQ.A02(r5);
            AnonymousClass5ZQ r11 = AnonymousClass5ZM.A02;
            long j = AnonymousClass5RV.A00;
            Modifier A012 = C56169Hty.A01(A03, r11, 4.0f, j, j, false);
            AnonymousClass5aQ.A02(r5);
            C288165bT.A00(r5, C287195Zj.A07(C304766Fd.A01(A012, r11, A08), 4.0f), A002, 0, 26, 0);
            Modifier A0H = C287205Zk.A0H(r7, 24.0f, Float.NaN);
            boolean A1T = C51966G9m.A1T(r5, A08, C51967G9n.A1W(r5, 428322067, A1W));
            Object ECw = r5.ECw();
            if (A1T || ECw == AnonymousClass5XT.A00) {
                ECw = new C58722IwV(A08, A1W);
                r5.FLL(ECw);
            }
            C289565do.A00(r5, A0H, C51965G9l.A0z(r2, ECw), 6);
            if (C51967G9n.A1R(r5)) {
                0fL.A00(1419142892);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, modifier2, i3, 18);
        }
    }
}
