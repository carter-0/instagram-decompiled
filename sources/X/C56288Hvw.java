package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Hvw  reason: case insensitive filesystem */
public abstract class C56288Hvw {
    public static final void A00(C286575Wy r18, String str, String str2, int i, int i2) {
        int i3;
        C286575Wy r0 = r18;
        r0.ExV(-1626875293);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 14) == 0) {
            i3 = G9t.A05(r0, i5) | i2;
        } else {
            i3 = i4;
        }
        int i6 = i2 & 112;
        String str3 = str;
        if (i6 == 0) {
            i3 |= G9t.A0P(r0, str3);
        }
        String str4 = str2;
        if ((i4 & 896) == 0) {
            i3 |= G9t.A0Q(r0, str4);
        }
        if ((i3 & 731) != 146 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-212988280, "com.instagram.creator.inspiration.fragment.audio.TopAudioBottomSheetRow (CreatorInspirationHubTopAudioBottomSheetFragment.kt:117)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(r6, 16.0f, 0.0f);
            AnonymousClass5RD A0S = C51971G9r.A0S(r0, 16.0f);
            int A00 = C287425a7.A00(r0);
            C286565Wx r9 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r0, A09);
            C62320sa r8 = C287485aD.A00;
            C51973G9u.A0z(r0, r9, r8);
            0sL r7 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0S, A04, r7);
            0sL r4 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r4, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C288165bT.A00(r0, (Modifier) null, C51966G9m.A0Y(r0, i3, i5), 56, 20, C51966G9m.A0G(r0));
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r9);
            Modifier A012 = C287435a8.A01(r0, r6);
            C51973G9u.A0z(r0, r9, r8);
            C287595aO.A00(r0, A0Z, r7);
            if (C51965G9l.A1Y(r0, r9, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r4, A002);
            }
            C287595aO.A00(r0, A012, A1K);
            C286575Wy r13 = r0;
            String str5 = str3;
            AnonymousClass5ZZ.A0M(r13, C287195Zj.A0A(r6, 0.0f, 0.0f, 0.0f), AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0h(r0), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 16646143, 0, 0, 0, AnonymousClass5Z7.A01(18)), str5, C51965G9l.A03(i3), C51966G9m.A0H(r0));
            C286575Wy r3 = r0;
            String str6 = str4;
            AnonymousClass5ZZ.A0n(r3, AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0c(r0), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 16646143, 0, 0, 0, AnonymousClass5Z7.A01(18)), str6, (i3 >> 6) & 14, C51966G9m.A0M(r0));
            if (C51971G9r.A1R(r0)) {
                0fL.A00(-128973154);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7E(i5, str3, str4, i4);
        }
    }

    public static final void A01(C286575Wy r6, ArrayList arrayList, int i) {
        int i2;
        String A00;
        int i3;
        if (C51967G9n.A1T(r6, 314412060)) {
            0fL.A01(1880252137, "com.instagram.creator.inspiration.fragment.audio.TopAudioBottomSheetContent (CreatorInspirationHubTopAudioBottomSheetFragment.kt:66)");
        }
        Modifier A0F = C51967G9n.A0F(Modifier.A00, 16.0f);
        AnonymousClass5RD A0L = G9w.A0L(C287275Zs.A01(16.0f), r6);
        int A002 = C287425a7.A00(r6);
        C286565Wx r1 = (C286565Wx) r6;
        AnonymousClass5RM A04 = C286565Wx.A04(r1);
        Modifier A01 = C287435a8.A01(r6, A0F);
        C51973G9u.A0y(r6, r1);
        C51971G9r.A12(r6, A0L, A04);
        0sL r3 = C287485aD.A02;
        if (r1.A0K || !C51972G9s.A1Q(r6, A002)) {
            C51971G9r.A13(r6, r3, A002);
        }
        C51965G9l.A18(r6, A01);
        r6.ExS(-593934188);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (0qQ.A0K(next, "trending")) {
                    r6.ExS(1075441364);
                    i2 = R.drawable.instagram_arrow_up_right_pano_outline_24;
                    A00 = C304346Dc.A00(r6, 2131957077);
                    i3 = 2131957076;
                } else if (0qQ.A0K(next, AnonymousClass000.A00(348))) {
                    r6.ExS(1075896351);
                    i2 = R.drawable.instagram_users_pano_outline_24;
                    A00 = C304346Dc.A00(r6, 2131957074);
                    i3 = 2131957073;
                } else if (0qQ.A0K(next, AnonymousClass000.A00(383))) {
                    r6.ExS(1076367768);
                    i2 = R.drawable.instagram_users_pano_outline_24;
                    A00 = C304346Dc.A00(r6, 2131957079);
                    i3 = 2131957078;
                } else {
                    r6.ExS(1281665039);
                    C286565Wx.A0L(r1, false);
                }
                A00(r6, A00, C304346Dc.A00(r6, i3), i2, 0);
                C286565Wx.A0L(r1, false);
            }
        }
        C286565Wx.A0L(r1, false);
        A00(r6, C304346Dc.A00(r6, 2131957072), C304346Dc.A00(r6, 2131957071), R.drawable.instagram_shield_star_pano_outline_24, 0);
        if (C51967G9n.A1R(r6)) {
            0fL.A00(-7550433);
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, arrayList, i, 7);
        }
    }
}
