package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hw5  reason: case insensitive filesystem */
public abstract class C56292Hw5 {
    public static final void A01(C286575Wy r18, Modifier modifier, ImageUrl imageUrl, String str, String str2, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r4 = r18;
        r4.ExV(-1678912732);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r4, modifier2) | i;
        } else {
            i3 = i6;
        }
        String str3 = str;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r4, str3);
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0Q(r4, str4);
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0R(r4, imageUrl2);
        }
        if ((i3 & 1171) != 1170 || !r4.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1543889380, "com.instagram.direct.fragment.thread.threadmedia.SharedLinkItem (DirectThreadSharedLinksFragment.kt:88)");
            }
            Modifier A07 = C287195Zj.A07(C51966G9m.A0V(C51969G9p.A0X(modifier2, 16.0f, C51966G9m.A0B(r4))), 12.0f);
            AnonymousClass5RD A0L = C51975G9x.A0L(r4);
            int A00 = C287425a7.A00(r4);
            C286565Wx r12 = (C286565Wx) r4;
            AnonymousClass5RM A04 = C286565Wx.A04(r12);
            Modifier A01 = C287435a8.A01(r4, A07);
            C62320sa r11 = C287485aD.A00;
            C51973G9u.A0z(r4, r12, r11);
            0sL r10 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A0L, A04, r10);
            0sL r8 = C287485aD.A02;
            if (r12.A0K || !C51972G9s.A1Q(r4, A00)) {
                C51971G9r.A13(r4, r8, A00);
            }
            0sL A1K = C51966G9m.A1K(r4, A01);
            AnonymousClass2DN A0o = C51966G9m.A0o(r4, imageUrl2, i3 >> 9);
            C285245Qk r1 = Modifier.A00;
            AnonymousClass6G3.A03(r4, C51968G9o.A0P(C287205Zk.A0C(r1, 56.0f), 16.0f), A0o);
            Modifier A0B = C287195Zj.A0B(r1, 12.0f, 0.0f, 0.0f, 0.0f);
            AnonymousClass5RD A0L2 = G9w.A0L(C287275Zs.A01(4.0f), r4);
            int A002 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(r12);
            Modifier A012 = C287435a8.A01(r4, A0B);
            C51973G9u.A0z(r4, r12, r11);
            C287595aO.A00(r4, A0L2, r10);
            if (C51965G9l.A1Y(r4, r12, A042, A0w) || !C51972G9s.A1Q(r4, A002)) {
                C51971G9r.A13(r4, r8, A002);
            }
            C287595aO.A00(r4, A012, A1K);
            C286575Wy r6 = r4;
            String str5 = str3;
            AnonymousClass5ZZ.A0j(r6, C51966G9m.A0h(r4), str5, 2, 2, (i3 >> 3) & 14, 11258, C51966G9m.A0H(r4));
            int i7 = (i3 >> 6) & 14;
            AnonymousClass5ZZ.A0n(r4, C51966G9m.A0b(r4), str4, i7, C51966G9m.A0M(r4));
            if (C51971G9r.A1R(r4)) {
                0fL.A00(1737348995);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9Q(modifier2, imageUrl2, str3, str4, i6, i4, 8);
        }
    }

    public static final void A00(C286575Wy r17, int i) {
        C286575Wy r11 = r17;
        r11.ExV(-982376839);
        int i2 = i;
        if (i != 0 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-702439263, "com.instagram.direct.fragment.thread.threadmedia.SharedLinksScreen (DirectThreadSharedLinksFragment.kt:59)");
            }
            LazyListState A00 = C305066Gi.A00(r11, 0, 0, 0, 3);
            GSY gsy = new GSY((Object) null, (Object) DbS.A0V("file://test_image"), "pitchfork.com", "Pitchfork Music Festival 2024: What to Know Before You Go", 8);
            Modifier A0V = C51970G9q.A0V(C287195Zj.A09(Modifier.A00, 16.0f, 0.0f), GRV.A02(r11), (NestedScrollDispatcher) null);
            C287265Zr r12 = C287215Zl.A00;
            C304756Fc A002 = C287275Zs.A00();
            C304826Fj r9 = new C304826Fj(0.0f, 16.0f, 0.0f, 16.0f);
            boolean A1Z = C51967G9n.A1Z(r11, gsy, 537349617);
            Object ECw = r11.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new C73934PmE(gsy, 28);
                r11.FLL(ECw);
            }
            C51965G9l.A1X(r11, false);
            AnonymousClass6HY.A01((AnonymousClass6HS) null, A002, r9, A00, r11, r12, A0V, (0sP) ECw, 12804480, 72, false, true);
            if (0fL.A02()) {
                0fL.A00(975638248);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i2, 44);
        }
    }
}
