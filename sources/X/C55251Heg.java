package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Heg  reason: case insensitive filesystem */
public abstract class C55251Heg {
    public static final void A00(C286575Wy r14, C62320sa r15, int i, boolean z) {
        int i2;
        AnonymousClass2DO A00;
        String A002;
        long A0G;
        C62320sa r4 = r15;
        0qQ.A0B(r15, 0);
        C286575Wy r8 = r14;
        r14.ExV(-2073500664);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r15) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r14, z2);
        }
        if ((i2 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2117379739, "instagram.features.clips.spins.feedback.ui.ClipsSpinsReplyBottomSheetLikeIcon (ClipsSpinsReplyBottomSheetLikeIcon.kt:20)");
            }
            Modifier A0I = G9w.A0I(Modifier.A00, 16.0f);
            boolean A1N = C51973G9u.A1N(r14, -1321741589, i2);
            Object ECw = r14.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = C58712IwL.A01(r15, 26);
                r14.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r14, false);
            Modifier A06 = C287635aW.A06(A0I, (C62320sa) ECw);
            AnonymousClass5RD A0V = C51968G9o.A0V(r14);
            int A003 = C287425a7.A00(r14);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r14, A06);
            C51973G9u.A0y(r14, A0H);
            C51971G9r.A12(r14, A0V, A04);
            0sL r5 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r14, A003)) {
                C51971G9r.A13(r14, r5, A003);
            }
            C51965G9l.A18(r14, A01);
            if (z) {
                r14.ExS(1002369787);
                A00 = C287975bA.A00(r14, R.drawable.instagram_heart_pano_filled_24, 0);
                A002 = C304346Dc.A00(r14, 2131964931);
                A0G = AnonymousClass5aQ.A00(r14).A0Q;
            } else {
                r14.ExS(1002584152);
                A00 = C287975bA.A00(r14, R.drawable.instagram_heart_pano_outline_24, 0);
                A002 = C304346Dc.A00(r14, 2131975945);
                A0G = C51966G9m.A0G(r14);
            }
            C288165bT.A06(r8, (Modifier) null, A00, (C288095bM) null, A002, 0, 20, A0G);
            if (C51971G9r.A1S(r8, A0H, false)) {
                0fL.A00(-1209458241);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, r4, i3, 17, z2);
        }
    }
}
