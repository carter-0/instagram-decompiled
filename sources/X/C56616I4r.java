package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.I4r  reason: case insensitive filesystem */
public abstract class C56616I4r {
    public static final void A00(C286575Wy r7, Modifier modifier, int i, long j) {
        int i2;
        int i3;
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier, 0);
        r7.ExV(-198695447);
        int i4 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r7, modifier) | i;
        } else {
            i2 = i;
        }
        long j2 = j;
        if ((i & 112) == 0) {
            i2 |= G9t.A0C(r7, j);
        }
        if ((i2 & 91) != 18 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2055387440, "com.instagram.compose.igds.components.segmentedtabs.Indicator (IgdsSegmentedTab.kt:162)");
            }
            if (C61670oa.A0E()) {
                r7.ExS(2094337534);
                i3 = R.dimen.abc_control_corner_material;
            } else {
                r7.ExS(2094421699);
                i3 = R.dimen.account_recs_header_image_margin;
            }
            float A01 = C287645aX.A01(r7, i3);
            C51965G9l.A1X(r7, false);
            C51969G9p.A14(r7, C287205Zk.A08(modifier, A01), j);
            if (0fL.A02()) {
                0fL.A00(-1220332711);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7K(j2, modifier2, i4, 1);
        }
    }

    public static final void A02(C286575Wy r9, String str, int i, int i2, int i3) {
        int i4;
        String str2 = str;
        C286575Wy r4 = r9;
        r9.ExV(583368074);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = G9t.A05(r9, i) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= G9t.A0P(r9, str);
        }
        if ((i4 & 91) != 18 || !r9.Bwn()) {
            if (i5 != 0) {
                str2 = null;
            }
            if (0fL.A02()) {
                0fL.A01(-477726937, "com.instagram.compose.igds.components.segmentedtabs.TabIcon (IgdsSegmentedTab.kt:147)");
            }
            C288165bT.A07(r4, C287205Zk.A0I(Modifier.A00, Float.NaN, Float.NaN, 24.0f, 24.0f), C51966G9m.A0Y(r9, i4, i), str2, (i4 & 112) | 392, ((AnonymousClass5RW) r9.AJO(C304856Fm.A00)).A00);
            if (0fL.A02()) {
                0fL.A00(187425340);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J79(i, str2, i2, i3);
        }
    }

    public static final void A01(C286575Wy r13, Modifier modifier, C53356Gmg gmg, int i, int i2, long j, boolean z) {
        int i3;
        boolean z2;
        long A0M;
        boolean z3 = z;
        Modifier modifier2 = modifier;
        C53356Gmg gmg2 = gmg;
        0qQ.A0B(gmg, 2);
        C286575Wy r2 = r13;
        r13.ExV(1074287620);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r13, modifier) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0Z(r13, z3);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 896) == 0) {
            i3 |= G9t.A0Q(r13, gmg);
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i3 |= G9t.A0E(r13, j2);
        }
        if ((i3 & 5851) != 1170 || !r13.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                z3 = false;
            }
            if (0fL.A02()) {
                0fL.A01(1055132609, "com.instagram.compose.igds.components.segmentedtabs.IgdsSegmentedTabImpl (IgdsSegmentedTab.kt:104)");
            }
            if (C51967G9n.A1U(r13, 884371092)) {
                0fL.A01(-580563335, "com.instagram.compose.igds.components.segmentedtabs.rememberContentColor (IgdsSegmentedTab.kt:183)");
            }
            if (z3) {
                r13.ExS(-299114751);
                z2 = false;
                A0M = C51966G9m.A0H(r13);
            } else {
                r13.ExS(-299061121);
                z2 = false;
                A0M = C51966G9m.A0M(r13);
            }
            C286565Wx A0H = C51965G9l.A0H(r13, z2);
            C284945Oz A00 = C287175Zh.A00(r13, C51965G9l.A0N(A0M));
            if (0fL.A02()) {
                0fL.A00(1668102199);
            }
            C286565Wx.A0L(A0H, z2);
            C51971G9r.A11(r2, C51969G9p.A0T(C304856Fm.A00, ((AnonymousClass5RW) A00.getValue()).A00), new J7M(j2, modifier2, gmg2, 5), 569338052);
            if (0fL.A02()) {
                0fL.A00(-49905430);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J99(modifier2, gmg2, i6, i4, 0, j2, z3);
        }
    }

    public static final void A03(String str, C286575Wy r5, int i) {
        int i2;
        r5.ExV(1463914649);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r5, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1047875626, "com.instagram.compose.igds.components.segmentedtabs.TabText (IgdsSegmentedTab.kt:142)");
            }
            AnonymousClass5ZZ.A0i(r5, (AnonymousClass5Z4) null, str, i2 & 14, 32766);
            if (0fL.A02()) {
                0fL.A00(-1789329222);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str, i, 3);
        }
    }
}
