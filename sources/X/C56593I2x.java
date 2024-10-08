package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.I2x  reason: case insensitive filesystem */
public abstract class C56593I2x {
    public static final void A00(C286575Wy r10, C61079JwH jwH, 0sP r12, 0sP r13, 0sP r14, int i) {
        int i2;
        C61079JwH jwH2 = jwH;
        0sP r7 = r12;
        0sP r6 = r13;
        0sP r5 = r14;
        C51974G9v.A1O(jwH, r12, r13, r14);
        r10.ExV(-1961540315);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r10, jwH) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r10, r12);
        }
        if ((i & 896) == 0) {
            i2 |= G9t.A0G(r10, r6);
        }
        if ((i & 7168) == 0) {
            i2 |= G9t.A0H(r10, r14);
        }
        if ((i2 & 5851) != 1170 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(987533417, "com.instagram.potato.reply.PotatoReplyLikesList (PotatoReplyLikesList.kt:29)");
            }
            Object obj = jwH.A01;
            Modifier A0U = C51969G9p.A0U();
            AnonymousClass5RD A0K = G9w.A0K(C287275Zs.A02, r10);
            int A00 = C287425a7.A00(r10);
            C286565Wx r3 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r10, A0U);
            C51973G9u.A0y(r10, r3);
            C51971G9r.A12(r10, A0K, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r1, A00);
            }
            C51965G9l.A18(r10, A01);
            AnonymousClass5ZZ.A0q(r10, C51965G9l.A0S(r10), jwH.A02, C51966G9m.A0H(r10));
            r10.ASN();
            AnonymousClass6HY.A08(r10, new C58790Ixb(20, r5, r6, r7, obj, jwH2));
            if (0fL.A02()) {
                0fL.A00(2049489358);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(jwH2, r5, r6, r12, i3, 18);
        }
    }

    public static final void A01(C62320sa r11, C286575Wy r12, int i) {
        int i2;
        0qQ.A0B(r11, 0);
        C286575Wy r5 = r12;
        r12.ExV(-39733129);
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r12, r11) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-745185273, "com.instagram.potato.reply.PotatoReplyLikesListFollowButton (PotatoReplyLikesList.kt:62)");
            }
            C288165bT.A01(r5, C287635aW.A05(Modifier.A00, C51965G9l.A0R(0), (String) null, r11, true), C287975bA.A00(r12, R.drawable.instagram_user_follow_pano_outline_24, 0), 56, C51966G9m.A0G(r12));
            if (0fL.A02()) {
                0fL.A00(1090277330);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r11, i, 36);
        }
    }

    public static final void A02(C62320sa r11, C286575Wy r12, int i) {
        int i2;
        0qQ.A0B(r11, 0);
        C286575Wy r5 = r12;
        r12.ExV(1182690955);
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r12, r11) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-875633825, "com.instagram.potato.reply.PotatoReplyLikesListMessageButton (PotatoReplyLikesList.kt:71)");
            }
            C288165bT.A01(r5, C287635aW.A05(Modifier.A00, C51965G9l.A0R(0), (String) null, r11, true), C287975bA.A00(r12, R.drawable.instagram_app_messenger_pano_outline_24, 0), 56, C51966G9m.A0G(r12));
            if (0fL.A02()) {
                0fL.A00(-87633567);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r11, i, 37);
        }
    }
}
