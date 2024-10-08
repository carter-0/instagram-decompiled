package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;

public abstract class HV1 {
    public static final void A00(C286575Wy r15, Modifier modifier, LineType lineType, String str, int i, int i2, boolean z, boolean z2) {
        int i3;
        String A14;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        LineType lineType2 = lineType;
        String str2 = str;
        boolean A1U = AnonymousClass7TF.A1U(0, str2, lineType2);
        r15.ExV(1419299040);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r15, str2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r15, lineType2);
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0a(r15, z4);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r15, modifier2);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0c(r15, z3);
        }
        if ((i3 & 9363) != 9362 || !r15.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = C51966G9m.A1Q(i7, z3);
            if (0fL.A02()) {
                0fL.A01(488025477, "com.instagram.barcelona.feed.post.ui.PostReplyToContext (PostReplyToContext.kt:25)");
            }
            if (z3) {
                r15.ExS(-1184676537);
                A14 = C288035bG.A00(r15, 2131953713);
            } else {
                r15.ExS(-1184673568);
                A14 = C51968G9o.A14(r15, str2, 2131953712);
            }
            C51965G9l.A1X(r15, false);
            AnonymousClass5ZZ.A0f(r15, C287195Zj.A0A(C304246Cs.A00(modifier2, C304236Cr.A00(lineType2, AnonymousClass05K.A01), z4, A1U), 12.0f, 0.0f, 16.0f), A14, C51966G9m.A0M(r15));
            if (0fL.A02()) {
                0fL.A00(1913841889);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA5(lineType2, modifier2, str2, i5, i4, 0, z4, z3);
        }
    }
}
