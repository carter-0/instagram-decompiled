package X;

import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HUu  reason: case insensitive filesystem */
public abstract class C54838HUu {
    public static final void A00(C286575Wy r23, Modifier modifier, C62320sa r25, AnonymousClass62P r26, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Modifier modifier2 = modifier;
        AnonymousClass62P r5 = r26;
        int A03 = DbW.A03(2, r5, r25);
        C286575Wy r6 = r23;
        r6.ExV(1060365947);
        int i7 = i4;
        int i8 = i;
        int i9 = i3;
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = G9t.A05(r6, i8) | i3;
        } else {
            i5 = i9;
        }
        int i10 = i2;
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= G9t.A06(r6, i10);
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i9 & 384) == 0) {
            i5 |= G9t.A0Q(r6, r5);
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i9 & 3072) == 0) {
            i5 |= G9t.A0H(r6, r25);
        }
        int i11 = i4 & 16;
        if (i11 != 0) {
            i5 |= 24576;
        } else if ((i9 & 24576) == 0) {
            i5 |= G9t.A0S(r6, modifier2);
        }
        if ((i5 & 9363) != 9362 || !r6.Bwn()) {
            if (i11 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(2004928754, "com.instagram.barcelona.feed.post.ui.PostFediverseRepliesRow (PostFediverseRepliesRow.kt:38)");
            }
            Modifier A0B = C287195Zj.A0B(modifier2, 12.0f, 13.0f, 16.0f, 13.0f);
            boolean A1Q = C51973G9u.A1Q(r6, -485787760, i5);
            Object ECw = r6.ECw();
            if (A1Q || ECw == AnonymousClass5XT.A00) {
                ECw = C58713IwM.A01(r6, r25, 27);
            }
            C286565Wx r8 = (C286565Wx) r6;
            Modifier A0D = G9w.A0D(r6, r8, A0B, (C62320sa) ECw);
            AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A00(), r6, C287215Zl.A04);
            int A002 = C287425a7.A00(r6);
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r6, A0D);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r6, r8, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r6, A00, A04, r11);
            0sL r7 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r7, A002);
            }
            0sL A1K = C51966G9m.A1K(r6, A01);
            AnonymousClass6FX r18 = AnonymousClass6FX.A00;
            C285245Qk r3 = Modifier.A00;
            Modifier A0C = C287205Zk.A0C(r3, 36.0f);
            if (r5.size() >= A03) {
                r6.ExS(1248403341);
                C304336Db.A00(r6, A0C, r5, ((i5 >> 6) & 14) | 48, 0);
            } else {
                r6.ExS(1248517173);
                AnonymousClass2DO A003 = C287975bA.A00(r6, R.drawable.barcelona_fediverse_outline_44, 0);
                long A0G = C51966G9m.A0G(r6);
                AnonymousClass5ZQ r14 = AnonymousClass5ZN.A00;
                C288165bT.A05(r6, C287195Zj.A07(C304816Fi.A03(AnonymousClass6FZ.A01(A0C, r14), r14, 0.5f, C51966G9m.A0F(r6)), 4.0f), A003, A0G);
            }
            C286565Wx.A0L(r8, false);
            Modifier A004 = r18.A00(r3);
            AnonymousClass5RD A0L = G9w.A0L(C287275Zs.A02, r6);
            int A005 = C287425a7.A00(r6);
            AnonymousClass5RM A042 = C286565Wx.A04(r8);
            Modifier A012 = C287435a8.A01(r6, A004);
            C51973G9u.A0z(r6, r8, r12);
            C287595aO.A00(r6, A0L, r11);
            if (C51965G9l.A1Y(r6, r8, A042, A0w) || !C51972G9s.A1Q(r6, A005)) {
                C51971G9r.A13(r6, r7, A005);
            }
            C287595aO.A00(r6, A012, A1K);
            Resources A0B2 = C51975G9x.A0B(r6);
            0qQ.A0A(A0B2);
            0qQ.A0B(A0B2, 0);
            AnonymousClass5ZZ.A0r(r6, C51966G9m.A0h(r6), DbY.A0e(A0B2, C253673rC.A04(A0B2, Integer.valueOf(i8), 1000000000, true, false), R.plurals.barcelona_replies_from_fediverse_users, i8), C51966G9m.A0H(r6));
            C51975G9x.A16(r6, DbY.A0e(A0B2, C253673rC.A04(A0B2, Integer.valueOf(i10), 1000000000, true, false), R.plurals.barcelona_replies_from_fediverse_platforms, i10));
            r6.ASN();
            if (C51966G9m.A15(r6) == AnonymousClass5Q8.Rtl) {
                r6.ExS(1249918094);
                i6 = R.drawable.instagram_chevron_left_pano_outline_24;
            } else {
                r6.ExS(1250021293);
                i6 = R.drawable.instagram_chevron_right_pano_outline_24;
            }
            AnonymousClass2DO A006 = C287975bA.A00(r6, i6, 0);
            C286565Wx.A0L(r8, false);
            C51970G9q.A14(r6, C287205Zk.A0C(r3, 12.0f), A006);
            if (C51967G9n.A1R(r6)) {
                0fL.A00(2078180898);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59153J8j(modifier2, r25, r5, i8, i10, i9, i7);
        }
    }
}
