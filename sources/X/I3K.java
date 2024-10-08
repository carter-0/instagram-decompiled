package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;
import java.util.Arrays;

public abstract class I3K {
    public static final void A00(C286575Wy r7, int i) {
        C286575Wy r2 = r7;
        r7.ExV(554783197);
        if (i != 0 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1654447796, "instagram.features.clips.pivot.header.impl.compose.NativeShimmerView (ComposePivotPageDefaultHeaderFragmentImpl.kt:84)");
            }
            I63.A02(r2, (Modifier) null, C59076J5j.A00, (0sP) null, 6, 6);
            if (0fL.A02()) {
                0fL.A00(-736500969);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 23);
        }
    }

    public static final void A01(C286575Wy r13, C53388GnK gnK, C74302Psc psc, int i) {
        int i2;
        C60340gF r0;
        C286625Xd ASQ;
        int i3;
        C286575Wy r7 = r13;
        r13.ExV(-786801180);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, gnK) | i;
        } else {
            i2 = i4;
        }
        C74302Psc psc2 = psc;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, psc);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1620163253, "instagram.features.clips.pivot.header.impl.compose.UserNameAttribution (ComposePivotPageDefaultHeaderFragmentImpl.kt:102)");
            }
            r13.ExS(-181061719);
            String str = "";
            if (!gnK.A09) {
                I62.A03(r13, str, C58572Iu5.A00, 438, false);
                if (C51970G9q.A1a(r13, false)) {
                    0fL.A00(-156084301);
                }
                ASQ = r13.ASQ();
                if (ASQ != null) {
                    i3 = 32;
                    JGM.A01(ASQ, gnK, psc, i4, i3);
                }
                return;
            }
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            String str2 = gnK.A08;
            r13.ExS(-181056271);
            String str3 = null;
            if (str2 == null) {
                r0 = null;
            } else {
                A02(r7, psc2, (C56078HsR) gnK.A04, (ImageUrl) gnK.A03, str2, (i2 << 9) & 57344, AnonymousClass7TG.A1X((Boolean) gnK.A01));
                r0 = C60340gF.A00;
            }
            C286565Wx.A0L(A0H, false);
            if (r0 == null) {
                C56078HsR hsR = (C56078HsR) gnK.A05;
                r7.ExS(-181046105);
                if (hsR != null) {
                    str3 = C51968G9o.A14(r7, hsR.A01, hsR.A00);
                }
                C286565Wx.A0L(A0H, false);
                if (str3 != null) {
                    str = str3;
                }
                I62.A03(r7, str, C58573Iu6.A00, 432, false);
            }
            if (0fL.A02()) {
                0fL.A00(270005570);
            }
        } else {
            r13.Evl();
        }
        ASQ = r7.ASQ();
        if (ASQ != null) {
            i3 = 33;
            JGM.A01(ASQ, gnK, psc, i4, i3);
        }
    }

    public static final void A02(C286575Wy r30, C74302Psc psc, C56078HsR hsR, ImageUrl imageUrl, String str, int i, boolean z) {
        int i2;
        String A01;
        C286575Wy r14 = r30;
        r14.ExV(1452827138);
        int i3 = i;
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, str2) | i;
        } else {
            i2 = i3;
        }
        C56078HsR hsR2 = hsR;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, hsR2);
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r14, imageUrl2);
        }
        boolean z2 = z;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0b(r14, z2);
        }
        C74302Psc psc2 = psc;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r14, psc2);
        }
        if ((i2 & 9363) != 9362 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-655904081, "instagram.features.clips.pivot.header.impl.compose.ClickableUserNameAttribution (ComposePivotPageDefaultHeaderFragmentImpl.kt:136)");
            }
            C287245Zp r2 = C287215Zl.A04;
            C285245Qk r10 = Modifier.A00;
            Modifier A0D = C51967G9n.A0D(r10, 6.0f);
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r14, r2);
            int A00 = C287425a7.A00(r14);
            C286565Wx r0 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r0);
            Modifier A012 = C287435a8.A01(r14, A0D);
            C51973G9u.A0y(r14, r0);
            C51971G9r.A12(r14, A0Q, A04);
            0sL r6 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r6, A00);
            }
            C51965G9l.A18(r14, A012);
            String A19 = G9t.A19();
            r14.ExS(-1155618861);
            C303876Bd A0b = C51969G9p.A0b();
            r14.ExS(-1155616911);
            if (hsR == null) {
                A01 = null;
            } else {
                int i4 = hsR2.A00;
                Object[] objArr = hsR2.A01;
                A01 = C288035bG.A01(r14, Arrays.copyOf(objArr, objArr.length), i4);
            }
            C286565Wx.A0L(r0, false);
            if (A01 == null) {
                A01 = str2;
            }
            A0b.A09(A01);
            if (00l.A0d(A01, str2, false)) {
                0qQ.A0B(A01, 0);
                int A0G = C51971G9r.A0G(A01, str2);
                int A05 = C51966G9m.A05(str2, A0G);
                A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A01, (C291795ht) null, 65531, 0, 0, 0), A0G, A05);
                A0b.A0A(A19, "Clickable username", A0G, A05);
            }
            C286025Tq A02 = A0b.A02();
            C286565Wx.A0L(r0, false);
            r14.ExS(-1155596358);
            if (imageUrl != null) {
                I62.A01(r14, imageUrl2, 0);
            }
            C286565Wx.A0L(r0, false);
            long A0H = C51966G9m.A0H(r14);
            long A013 = AnonymousClass5Z7.A01(14);
            boolean A1Y = G9t.A1Y(r14, A02, psc2, -1155590323);
            Object ECw = r14.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new C73949PmT(psc2, A02, A19, 43);
                r14.FLL(ECw);
            }
            IgClickableTextKt.A01(r14, (Modifier) null, A02, (AnonymousClass5Z4) null, (C291715hl) null, (AnonymousClass5ZD) null, (0sP) null, C51965G9l.A0z(r0, ECw), (0sP) null, (C304516Dt) null, 0, 0, 0, 0, 3072, 0, 114674, A0H, A013, false, false);
            r14.ExS(-1155584290);
            if (z2 && hsR2 == null) {
                AnonymousClass6FU.A00(r14, C287195Zj.A0B(r10, 4.0f, 0.0f, 0.0f, 0.0f), 0.0f, 6, 2);
            }
            if (C51971G9r.A1S(r14, r0, false)) {
                0fL.A00(249622002);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9O(hsR2, imageUrl2, psc2, str2, i3, 3, z2);
        }
    }
}
