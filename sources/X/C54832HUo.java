package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

/* renamed from: X.HUo  reason: case insensitive filesystem */
public abstract class C54832HUo {
    public static final void A00(C286575Wy r11, Modifier modifier, LineType lineType, int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        LineType lineType2 = lineType;
        0qQ.A0B(lineType, 1);
        C286575Wy r12 = r11;
        r11.ExV(920683081);
        int i4 = i2;
        int i5 = i;
        boolean z4 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0Y(r12, z4) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r12, lineType);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= G9t.A0Q(r12, modifier2);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= G9t.A0b(r12, z3);
        }
        if ((i3 & 1171) != 1170 || !r12.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = C51966G9m.A1Q(i7, z3);
            if (0fL.A02()) {
                0fL.A01(-2007934029, "com.instagram.barcelona.feed.post.ui.PaidPartnershipLabel (PaidPartnershipLabel.kt:24)");
            }
            String A00 = C288035bG.A00(r12, 2131953667);
            long A0M = C51966G9m.A0M(r12);
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r12);
            Modifier A002 = C304246Cs.A00(modifier2, C304236Cr.A00(lineType, AnonymousClass05K.A0C), z4, true);
            float f = 4.0f;
            if (z3) {
                f = 0.0f;
            }
            AnonymousClass5ZZ.A0Q(r12, C287195Zj.A0B(A002, 12.0f, 0.0f, 0.0f, f), A0c, A00, A0M);
            if (0fL.A02()) {
                0fL.A00(-1791584310);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9A(lineType2, modifier2, i5, i4, 0, z3, z4);
        }
    }
}
