package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Hwi  reason: case insensitive filesystem */
public abstract class C56331Hwi {
    public static final void A00(C286575Wy r24, Modifier modifier, C61082JwK jwK, H1R h1r, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C61082JwK jwK2 = jwK;
        H1R h1r2 = h1r;
        boolean A1U = AnonymousClass7TF.A1U(0, jwK2, h1r2);
        C286575Wy r14 = r24;
        r14.ExV(9453926);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r14, jwK2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r14, h1r2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0Q(r14, modifier2);
        }
        if ((i3 & 731) != 146 || !r14.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1008851129, "com.instagram.potato.profile.PotatoProfileTabGrid (PotatoProfileTabGrid.kt:49)");
            }
            LazyGridState A00 = C56383Hxc.A00(r14);
            Modifier A0V = C51970G9q.A0V(C51966G9m.A0V(modifier2), GRV.A02(r14), (NestedScrollDispatcher) null);
            IF4 if4 = new IF4(2);
            HQz.A00((AnonymousClass6HS) null, C287275Zs.A01(16.0f), C287275Zs.A01(20.0f), new C304826Fj(16.0f, 16.0f, 16.0f, 16.0f), if4, A00, r14, A0V, new MPB(46, (Object) h1r2, (Object) jwK2), 1772544, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, false, false);
            C52381GQg.A03(A00, r14, new C51802G2l(h1r2, 26), 0, 0, A1U ? 1 : 0);
            if (0fL.A02()) {
                0fL.A00(-1399188759);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 36, h1r2, jwK2, modifier2);
        }
    }

    public static final void A01(C286575Wy r20, Modifier modifier, H1R h1r, C53297Glj glj, int i, int i2) {
        int i3;
        ImageInfo imageInfo;
        ExtendedImageUrl A04;
        Modifier modifier2 = modifier;
        H1R h1r2 = h1r;
        C53297Glj glj2 = glj;
        boolean A1U = AnonymousClass7TF.A1U(0, glj2, h1r2);
        C286575Wy r10 = r20;
        r10.ExV(-20468567);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r10, glj2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r10, h1r2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0Q(r10, modifier2);
        }
        if ((i3 & 731) != 146 || !r10.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1890604310, "com.instagram.potato.profile.GridItem (PotatoProfileTabGrid.kt:87)");
            }
            Object A0m = C51967G9n.A0m(r10, 1631597932);
            if (A0m == AnonymousClass5XT.A00) {
                AnonymousClass62P r0 = glj2.A04;
                if (r0 == null || (imageInfo = (ImageInfo) 00k.A0I(r0)) == null || (A04 = 1iI.A04(imageInfo, AnonymousClass05K.A0C)) == null) {
                    A0m = null;
                } else {
                    A0m = new SimpleImageUrl(A04);
                }
                r10.FLL(A0m);
            }
            ImageUrlBase imageUrlBase = (ImageUrlBase) A0m;
            C286565Wx A0H = C51965G9l.A0H(r10, false);
            String str = null;
            Modifier A05 = C287635aW.A05(modifier2, C51965G9l.A0R(0), (String) null, new MJ4(12, h1r2, glj2), A1U);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r10, 0);
            int A00 = C287425a7.A00(r10);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r10, A05);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r10, A0H, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r10, A0Z, A042, r11);
            0sL r6 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r6, A00);
            }
            0sL A1K = C51966G9m.A1K(r10, A01);
            AnonymousClass2DN A012 = 1zC.A01(r10, imageUrlBase, 6);
            C285245Qk r5 = Modifier.A00;
            AnonymousClass6G3.A04(r10, C54739HQw.A00(C51966G9m.A0X(C51968G9o.A0P(r5, 16.0f), AnonymousClass5aQ.A00(r10).A0c), 1.0f, false).Ezh(C287205Zk.A01), A012);
            C43447ByN byN = glj2.A00;
            if (byN != null) {
                str = byN.getRequiredStringField(2, "text");
            }
            if (str == null) {
                str = "";
            }
            AnonymousClass5ZZ.A0Q(r20, C287195Zj.A0B(r5, 8.0f, 8.0f, 8.0f, 4.0f), C51966G9m.A0h(r10), str, C51966G9m.A0H(r10));
            Modifier A0B = C287195Zj.A0B(r5, 8.0f, 0.0f, 8.0f, 0.0f);
            AnonymousClass5RD A0S = C51971G9r.A0S(r10, 4.0f);
            int A002 = C287425a7.A00(r10);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r10, A0B);
            C51973G9u.A0z(r10, A0H, r12);
            C287595aO.A00(r10, A0S, r11);
            if (C51965G9l.A1Y(r10, A0H, A043, A0w) || !C51972G9s.A1Q(r10, A002)) {
                C51971G9r.A13(r10, r6, A002);
            }
            C287595aO.A00(r10, A013, A1K);
            AnonymousClass6G3.A04(r10, C287205Zk.A0C(C51966G9m.A0W(r5), 16.0f), C51975G9x.A0W(r10, glj2.A02));
            String str2 = glj2.A03;
            if (str2 == null) {
                str2 = "";
            }
            C51975G9x.A15(r10, str2);
            if (C51971G9r.A1R(r10)) {
                0fL.A00(1052121382);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 35, h1r2, modifier2, glj2);
        }
    }
}
