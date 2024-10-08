package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class I7V {
    public static final Modifier A00(C286575Wy r11, Modifier modifier, boolean z) {
        Modifier A0P;
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier, 0);
        if (C51967G9n.A1U(r11, 233959867)) {
            0fL.A01(1900496751, "com.instagram.profilecard.ui.shadowOrBorder (ProfileCardContent.kt:468)");
        }
        if (z) {
            r11.ExS(-2121053377);
            A0P = C55093Hc2.A00(modifier2, 4.0f, 40.0f, 40.0f, AnonymousClass5aQ.A00(r11).A0y);
        } else {
            r11.ExS(-2120863936);
            A0P = C51968G9o.A0P(C51968G9o.A0Q(modifier, 40.0f, 0.5f, C51966G9m.A0F(r11)), 40.0f);
        }
        C286565Wx r112 = (C286565Wx) r11;
        if (C51967G9n.A1b(r112, false)) {
            0fL.A00(-369711409);
        }
        C286565Wx.A0L(r112, false);
        return A0P;
    }

    public static final void A04(C286575Wy r17, Modifier modifier, C53397GnU gnU, C62320sa r20, C62320sa r21, 0sP r22, float f, int i, boolean z) {
        int i2;
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier2, 0);
        C286575Wy r6 = r17;
        r6.ExV(-2011247409);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r6, modifier2) | i;
        } else {
            i2 = i3;
        }
        C53397GnU gnU2 = gnU;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r6, gnU2);
        }
        boolean z2 = z;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0a(r6, z2);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r6, r20);
        }
        C62320sa r19 = r21;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r6, r19);
        }
        0sP r18 = r22;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r6, r18);
        }
        float f2 = f;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A04(r6, f2);
        }
        if ((599187 & i2) != 599186 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(500342790, "com.instagram.profilecard.ui.ProfileSideContainer (ProfileCardContent.kt:801)");
            }
            Modifier A00 = C55092Hc1.A00(r6, C51966G9m.A0X(AnonymousClass6FZ.A00(A00(r6, modifier2, gnU2.A0I)), C51965G9l.A09(r6)), f2, (i2 >> 15) & 112);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r6, 0);
            int A002 = C287425a7.A00(r6);
            C286565Wx r14 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r14);
            Modifier A01 = C287435a8.A01(r6, A00);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r6, r14, r13);
            0sL r12 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r6, A0Z, A04, r12);
            0sL r10 = C287485aD.A02;
            if (r14.A0K || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r10, A002);
            }
            0sL A1K = C51966G9m.A1K(r6, A01);
            Modifier A003 = C304676Et.A00.A00(C51969G9p.A0U(), true);
            AnonymousClass5RD A012 = C291495hO.A01(C287275Zs.A03(C287215Zl.A04, 24.0f), r6, C287215Zl.A00);
            int A004 = C287425a7.A00(r6);
            AnonymousClass5RM A042 = C286565Wx.A04(r14);
            Modifier A013 = C287435a8.A01(r6, A003);
            C51973G9u.A0z(r6, r14, r13);
            C287595aO.A00(r6, A012, r12);
            if (C51965G9l.A1Y(r6, r14, A042, A0w) || !C51972G9s.A1Q(r6, A004)) {
                C51971G9r.A13(r6, r10, A004);
            }
            C287595aO.A00(r6, A013, A1K);
            A06(r6, gnU2.A04, gnU2.A0A, 0);
            String str = gnU2.A07;
            String str2 = gnU2.A09;
            List A18 = DbV.A18(gnU2.A06, "\n");
            StringBuilder A1A = AnonymousClass7TE.A1A();
            Iterator it = A18.iterator();
            while (it.hasNext()) {
                String A182 = AnonymousClass7TE.A18(it);
                if (DbV.A12(A182).length() > 0) {
                    A1A.append(DbV.A12(A182));
                    A1A.append("\n");
                }
            }
            A0E(r6, str, str2, DbT.A10(A1A), 0);
            r6.ASN();
            int i4 = i2 >> 6;
            A0D(r6, gnU2, r20, r19, r18, (i4 & 7168) | C51971G9r.A04(i4) | (57344 & (i2 << 9)), z2);
            if (C51967G9n.A1R(r6)) {
                0fL.A00(543643058);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59185J9p(modifier2, gnU2, r20, r19, r18, f2, i3, z2);
        }
    }

    public static final void A06(C286575Wy r19, ImageUrl imageUrl, String str, int i) {
        int i2;
        ImageUrl imageUrl2 = imageUrl;
        String str2 = str;
        AnonymousClass7TF.A1H(imageUrl2, str2);
        C286575Wy r11 = r19;
        r11.ExV(-787118754);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, imageUrl2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r11, str2);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1851815927, "com.instagram.profilecard.ui.ProfileSideInfoContainer (ProfileCardContent.kt:833)");
            }
            C285245Qk r14 = Modifier.A00;
            Modifier A0G = C287205Zk.A0G(r14, 296.0f, 258.0f);
            Alignment alignment = C287215Zl.A09;
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r11);
            C286565Wx r5 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r11, A0G);
            C62320sa r4 = C287485aD.A00;
            C51973G9u.A0z(r11, r5, r4);
            0sL r3 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r11, A00, A04, r3);
            0sL r2 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r11, A002)) {
                C51971G9r.A13(r11, r2, A002);
            }
            0sL A1K = C51966G9m.A1K(r11, A01);
            C289515dj r1 = C289515dj.A00;
            A02(r11, r1.AAz(alignment, r14), imageUrl2, (i2 << 3) & 112);
            Modifier A0X = C51966G9m.A0X(C55093Hc2.A00(C287205Zk.A08(HRH.A00(r1.AAz(C287215Zl.A06, r14), -2.0f), 36.0f), 1.0f, 3.0f, 8.0f, AnonymousClass5aQ.A00(r11).A0y), C51965G9l.A09(r11));
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r11);
            AnonymousClass5RM A042 = C286565Wx.A04(r5);
            Modifier A012 = C287435a8.A01(r11, A0X);
            C51973G9u.A0z(r11, r5, r4);
            C287595aO.A00(r11, A003, r3);
            if (C51965G9l.A1Y(r11, r5, A042, A0w) || !C51972G9s.A1Q(r11, A004)) {
                C51971G9r.A13(r11, r2, A004);
            }
            C287595aO.A00(r11, A012, A1K);
            A0I(str2, r11, (i2 >> 3) & 14);
            if (C51971G9r.A1R(r11)) {
                0fL.A00(-1248682077);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, imageUrl2, str2, i3, 13);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: X.IoJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v7, resolved type: X.IoJ} */
    /* JADX WARNING: type inference failed for: r8v2, types: [androidx.compose.ui.Modifier] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02f5, code lost:
        if (r3 == null) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02f7, code lost:
        r34 = r0;
        X.C288165bT.A00(r34, X.C287205Zk.A0C(r8, 12.0f), X.C287975bA.A00(r0, r3.intValue(), 0), (r5 & 7168) | 384, 18, r53);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0314, code lost:
        X.C286565Wx.A0L(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0319, code lost:
        r3 = com.instagram.android.R.drawable.instagram_donations_pano_outline_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x031d, code lost:
        r3 = com.instagram.android.R.drawable.instagram_channels_pano_outline_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0321, code lost:
        r3 = com.instagram.android.R.drawable.instagram_link_pano_outline_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0325, code lost:
        r3 = com.instagram.android.R.drawable.instagram_audio_wave_pano_outline_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        if (r64 == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        if (r65 == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0143, code lost:
        if (r3 == r10) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0145, code lost:
        r34 = new X.C58215IoJ(r7, r57, r56, r55, r12, r24);
        r0.FLL(r34);
        r34 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015b, code lost:
        r9 = X.C287635aW.A00(r4, r9, r8, r41, (java.lang.String) null, X.C51965G9l.A0y(r2, r3, false), true);
        r3 = X.C51966G9m.A0X(X.C55093Hc2.A00(X.C287195Zj.A07(X.HRH.A00(r8, r11), 3.0f), 1.0f, 2.0f, 8.0f, X.AnonymousClass5aQ.A00(r0).A0y), X.C51965G9l.A09(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0197, code lost:
        if (r23 != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0199, code lost:
        if (r16 == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x019b, code lost:
        r3 = r9.Ezh(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019f, code lost:
        r9 = X.C287215Zl.A04;
        r12 = X.C51965G9l.A0Q(r0, r9);
        r11 = X.C287425a7.A00(r0);
        r4 = X.C286565Wx.A04(r2);
        r10 = X.C287435a8.A01(r0, r3);
        r3 = X.C287485aD.A00;
        X.C51973G9u.A0z(r0, r2, r3);
        r14 = X.C287485aD.A03;
        r18 = X.C51969G9p.A0w(r0, r12, r4, r14);
        r13 = X.C287485aD.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01c0, code lost:
        if (r2.A0K != false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c6, code lost:
        if (X.C51972G9s.A1Q(r0, r11) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c8, code lost:
        X.C51971G9r.A13(r0, r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01cb, code lost:
        r12 = X.C287485aD.A04;
        X.C287595aO.A00(r0, r10, r12);
        r17 = X.C287195Zj.A09(r8, 10.0f, 6.0f);
        r16 = X.C287395a4.A00(X.C287275Zs.A01(4.0f), r0, r9);
        r10 = X.C287425a7.A00(r0);
        r9 = X.C286565Wx.A04(r2);
        r4 = X.C287435a8.A01(r0, r17);
        X.C51973G9u.A0z(r0, r2, r3);
        X.C287595aO.A00(r0, r16, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01fe, code lost:
        if (X.C51965G9l.A1Y(r0, r2, r9, r18) != false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0204, code lost:
        if (X.C51972G9s.A1Q(r0, r10) != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0206, code lost:
        X.C51971G9r.A13(r0, r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0209, code lost:
        X.C287595aO.A00(r0, r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x020c, code lost:
        if (r23 == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020e, code lost:
        r0.ExS(637519953);
        r4 = X.AnonymousClass6KK.A00(2.0f, (int) android.util.TypedValue.applyDimension(1, 10.0f, X.AnonymousClass7TF.A0E(r26)), false);
        r4.A05 = X.C51971G9r.A1W(r7);
        r4.invalidateSelf();
        X.C288165bT.A00(r0, X.C287205Zk.A0C(r8, 12.0f), X.C287995bC.A00(r4, r0), (r5 & 7168) | 384, 18, r53);
        X.C286565Wx.A0L(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x024a, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x024c, code lost:
        if (r15 != r25) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x024e, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0252, code lost:
        if (X.C51971G9r.A1W(r7) == false) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0254, code lost:
        r8 = r8.Ezh(new androidx.compose.foundation.MarqueeModifierElement(X.C55291HfK.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x025f, code lost:
        if (r24 == false) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0261, code lost:
        r2 = new X.11S("^https?://").A01(r57, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0276, code lost:
        if (X.00p.A0i(r2, "/", false) == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0278, code lost:
        r2 = X.C51967G9n.A0q(r2, 0, r2.length() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0282, code lost:
        r48 = X.AnonymousClass5Z7.A01(12);
        r3 = X.AnonymousClass0qo.A00(r26).A02(X.0qm.A0Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0290, code lost:
        if (r3 == null) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0292, code lost:
        r34 = X.C303946Bk.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0296, code lost:
        X.AnonymousClass5ZZ.A03(r0, r8, (X.AnonymousClass5Z4) null, r34, (X.C291715hl) null, (X.AnonymousClass5ZD) null, r2, (X.0sP) null, 0, 0, 1, 2, 3072, 390, 27568, X.AnonymousClass5aQ.A00(r0).A14, r48, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02c3, code lost:
        if (X.C51971G9r.A1R(r0) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02c5, code lost:
        X.0fL.A00(-176178477);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02cd, code lost:
        r34 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02d0, code lost:
        r2 = r57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02d3, code lost:
        r0.ExS(637892666);
        r4 = r15.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02dd, code lost:
        if (r4 == 0) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02e1, code lost:
        if (r4 == 2) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02e4, code lost:
        if (r4 == 3) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02e8, code lost:
        if (r4 == 4) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ec, code lost:
        if (r4 != 1) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ee, code lost:
        r3 = com.instagram.android.R.drawable.instagram_user_pano_outline_24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02f1, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C286575Wy r55, X.EVW r56, java.lang.String r57, X.C62320sa r58, X.0sP r59, int r60, int r61, long r62, boolean r64, boolean r65) {
        /*
            r1 = 0
            r27 = 2
            r15 = r56
            r0 = r27
            X.0qQ.A0B(r15, r0)
            r2 = -1661577922(0xffffffff9cf6553e, float:-1.6300949E-21)
            r0 = r55
            r0.ExV(r2)
            r6 = r61
            r2 = r61 & 6
            if (r2 != 0) goto L_0x0329
            r2 = r57
            int r5 = X.G9t.A0O(r0, r2)
            r5 = r5 | r61
        L_0x0020:
            r2 = r61 & 48
            r30 = r60
            if (r2 != 0) goto L_0x002d
            r2 = r30
            int r2 = X.G9t.A06(r0, r2)
            r5 = r5 | r2
        L_0x002d:
            r2 = r6 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0036
            int r2 = X.G9t.A0Q(r0, r15)
            r5 = r5 | r2
        L_0x0036:
            r2 = r6 & 3072(0xc00, float:4.305E-42)
            r53 = r62
            if (r2 != 0) goto L_0x0043
            r2 = r53
            int r2 = X.G9t.A0E(r0, r2)
            r5 = r5 | r2
        L_0x0043:
            r2 = r6 & 24576(0x6000, float:3.4438E-41)
            r29 = r64
            if (r2 != 0) goto L_0x0050
            r2 = r29
            int r2 = X.G9t.A0c(r0, r2)
            r5 = r5 | r2
        L_0x0050:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r61
            r28 = r65
            if (r2 != 0) goto L_0x005f
            r2 = r28
            int r2 = X.G9t.A0d(r0, r2)
            r5 = r5 | r2
        L_0x005f:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r61
            r56 = r58
            if (r2 != 0) goto L_0x006e
            r2 = r56
            int r2 = X.G9t.A0K(r0, r2)
            r5 = r5 | r2
        L_0x006e:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 & r61
            r55 = r59
            if (r2 != 0) goto L_0x007d
            r2 = r55
            int r2 = X.G9t.A0L(r0, r2)
            r5 = r5 | r2
        L_0x007d:
            r3 = 4793491(0x492493, float:6.717112E-39)
            r3 = r3 & r5
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r2) goto L_0x00ae
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x00ae
            r0.Evl()
        L_0x008f:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x00ad
            X.JAV r0 = new X.JAV
            r7 = r0
            r8 = r15
            r9 = r57
            r10 = r56
            r11 = r55
            r12 = r30
            r13 = r6
            r14 = r53
            r16 = r29
            r17 = r28
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r16, r17)
            r1.A06 = r0
        L_0x00ad:
            return
        L_0x00ae:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00bc
            r3 = -716638553(0xffffffffd548f6a7, float:-1.38101056E13)
            java.lang.String r2 = "com.instagram.profilecard.ui.ProfileCardTag (ProfileCardContent.kt:1065)"
            X.0fL.A01(r3, r2)
        L_0x00bc:
            android.content.Context r26 = X.C51970G9q.A0N(r0)
            int r2 = r60 % 2
            r11 = -1090519040(0xffffffffbf000000, float:-0.5)
            if (r2 != 0) goto L_0x00c8
            r11 = 1056964608(0x3f000000, float:0.5)
        L_0x00c8:
            X.EVW r25 = X.EVW.MUSIC
            r2 = r25
            boolean r12 = X.AnonymousClass7TF.A1W(r15, r2)
            X.EVW r2 = X.EVW.CUSTOM_LINK
            boolean r24 = X.AnonymousClass7TF.A1W(r15, r2)
            if (r12 == 0) goto L_0x00dc
            r23 = 1
            if (r64 != 0) goto L_0x00de
        L_0x00dc:
            r23 = 0
        L_0x00de:
            if (r24 == 0) goto L_0x00e4
            r16 = 1
            if (r65 != 0) goto L_0x00e6
        L_0x00e4:
            r16 = 0
        L_0x00e6:
            r2 = 439010622(0x1a2ac53e, float:3.5314507E-23)
            java.lang.Object r7 = X.C51967G9n.A0m(r0, r2)
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            r33 = 0
            if (r7 != r10) goto L_0x00fb
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = X.G9t.A0o(r0, r2)
        L_0x00fb:
            X.5Oz r7 = (X.C284945Oz) r7
            X.5Wx r2 = X.C51965G9l.A0H(r0, r1)
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            r3 = 439014404(0x1a2ad404, float:3.532644E-23)
            java.lang.Object r9 = X.C51974G9v.A0W(r0, r10, r3)
            X.5aT r9 = (X.C287605aT) r9
            X.C286565Wx.A0L(r2, r1)
            r3 = 1153138688(0x44bb8000, float:1500.0)
            X.5aR r4 = new X.5aR
            r4.<init>(r3, r3)
            X.5aV r41 = X.C51965G9l.A0R(r1)
            r3 = 439023638(0x1a2af816, float:3.5355578E-23)
            boolean r13 = X.C51967G9n.A1W(r0, r3, r12)
            boolean r3 = X.C51973G9u.A1K(r5)
            r13 = r13 | r3
            r3 = r24
            boolean r14 = X.C51966G9m.A1V(r0, r3, r13)
            boolean r3 = X.C51974G9v.A1V(r5)
            r14 = r14 | r3
            r13 = r5 & 14
            r22 = 4
            r3 = r22
            boolean r3 = X.AnonymousClass7TF.A1S(r13, r3)
            r14 = r14 | r3
            java.lang.Object r3 = r0.ECw()
            if (r14 != 0) goto L_0x0145
            if (r3 != r10) goto L_0x015b
        L_0x0145:
            X.IoJ r3 = new X.IoJ
            r34 = r3
            r35 = r7
            r36 = r57
            r37 = r56
            r38 = r55
            r39 = r12
            r40 = r24
            r34.<init>(r35, r36, r37, r38, r39, r40)
            r0.FLL(r3)
        L_0x015b:
            X.0sa r43 = X.C51965G9l.A0y(r2, r3, r1)
            r21 = 12
            r20 = 1
            r38 = r4
            r39 = r9
            r40 = r8
            r42 = r33
            r44 = r20
            androidx.compose.ui.Modifier r9 = X.C287635aW.A00(r38, r39, r40, r41, r42, r43, r44)
            androidx.compose.ui.Modifier r4 = X.HRH.A00(r8, r11)
            r3 = 1077936128(0x40400000, float:3.0)
            androidx.compose.ui.Modifier r34 = X.C287195Zj.A07(r4, r3)
            r35 = 1065353216(0x3f800000, float:1.0)
            r19 = 1073741824(0x40000000, float:2.0)
            X.5Yw r3 = X.AnonymousClass5aQ.A00(r0)
            long r3 = r3.A0y
            r37 = 1090519040(0x41000000, float:8.0)
            r36 = r19
            r38 = r3
            androidx.compose.ui.Modifier r10 = X.C55093Hc2.A00(r34, r35, r36, r37, r38)
            long r3 = X.C51965G9l.A09(r0)
            androidx.compose.ui.Modifier r3 = X.C51966G9m.A0X(r10, r3)
            if (r23 != 0) goto L_0x019b
            if (r16 == 0) goto L_0x019f
        L_0x019b:
            androidx.compose.ui.Modifier r3 = r9.Ezh(r3)
        L_0x019f:
            X.5Zp r9 = X.C287215Zl.A04
            X.5RD r12 = X.C51965G9l.A0Q(r0, r9)
            int r11 = X.C287425a7.A00(r0)
            X.5RM r4 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r0, r3)
            X.0sa r3 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r2, r3)
            X.0sL r14 = X.C287485aD.A03
            X.0sL r18 = X.C51969G9p.A0w(r0, r12, r4, r14)
            X.0sL r13 = X.C287485aD.A02
            boolean r4 = r2.A0K
            if (r4 != 0) goto L_0x01c8
            boolean r4 = X.C51972G9s.A1Q(r0, r11)
            if (r4 != 0) goto L_0x01cb
        L_0x01c8:
            X.C51971G9r.A13(r0, r13, r11)
        L_0x01cb:
            X.0sL r12 = X.C287485aD.A04
            X.C287595aO.A00(r0, r10, r12)
            r11 = 1092616192(0x41200000, float:10.0)
            r4 = 1086324736(0x40c00000, float:6.0)
            androidx.compose.ui.Modifier r17 = X.C287195Zj.A09(r8, r11, r4)
            r4 = 1082130432(0x40800000, float:4.0)
            X.6Fc r4 = X.C287275Zs.A01(r4)
            X.5RD r16 = X.C287395a4.A00(r4, r0, r9)
            int r10 = X.C287425a7.A00(r0)
            X.5RM r9 = X.C286565Wx.A04(r2)
            r4 = r17
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0z(r0, r2, r3)
            r3 = r16
            X.C287595aO.A00(r0, r3, r14)
            r3 = r18
            boolean r3 = X.C51965G9l.A1Y(r0, r2, r9, r3)
            if (r3 != 0) goto L_0x0206
            boolean r3 = X.C51972G9s.A1Q(r0, r10)
            if (r3 != 0) goto L_0x0209
        L_0x0206:
            X.C51971G9r.A13(r0, r13, r10)
        L_0x0209:
            X.C287595aO.A00(r0, r4, r12)
            if (r23 == 0) goto L_0x02d3
            r3 = 637519953(0x25ffc851, float:4.4371188E-16)
            r0.ExS(r3)
            android.util.DisplayMetrics r4 = X.AnonymousClass7TF.A0E(r26)
            r3 = r20
            float r3 = android.util.TypedValue.applyDimension(r3, r11, r4)
            int r4 = (int) r3
            r3 = r19
            X.6KL r4 = X.AnonymousClass6KK.A00(r3, r4, r1)
            boolean r3 = X.C51971G9r.A1W(r7)
            r4.A05 = r3
            r4.invalidateSelf()
            r3 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r35 = X.C287205Zk.A0C(r8, r3)
            X.2DO r36 = X.C287995bC.A00(r4, r0)
            r3 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 384(0x180, float:5.38E-43)
            r38 = 18
            r34 = r0
            r37 = r3
            r39 = r53
            X.C288165bT.A00(r34, r35, r36, r37, r38, r39)
            X.C286565Wx.A0L(r2, r1)
        L_0x024a:
            r2 = r25
            if (r15 != r2) goto L_0x025f
            boolean r2 = X.C51971G9r.A1W(r7)
            if (r2 == 0) goto L_0x025f
            X.JRQ r3 = X.C55291HfK.A00
            androidx.compose.foundation.MarqueeModifierElement r2 = new androidx.compose.foundation.MarqueeModifierElement
            r2.<init>(r3)
            androidx.compose.ui.Modifier r8 = r8.Ezh(r2)
        L_0x025f:
            if (r24 == 0) goto L_0x02d0
            java.lang.String r2 = "^https?://"
            X.11S r4 = new X.11S
            r4.<init>(r2)
            java.lang.String r3 = ""
            r2 = r57
            java.lang.String r2 = r4.A01(r2, r3)
            java.lang.String r3 = "/"
            boolean r3 = X.00p.A0i(r2, r3, r1)
            if (r3 == 0) goto L_0x0282
            int r3 = r2.length()
            int r3 = r3 + -1
            java.lang.String r2 = X.C51967G9n.A0q(r2, r1, r3)
        L_0x0282:
            long r48 = X.AnonymousClass5Z7.A01(r21)
            X.0qq r4 = X.AnonymousClass0qo.A00(r26)
            X.0qm r3 = X.0qm.A0Y
            android.graphics.Typeface r3 = r4.A02(r3)
            if (r3 == 0) goto L_0x02cd
            X.6Bo r34 = X.C303946Bk.A00(r3)
        L_0x0296:
            r42 = 2
            X.5Yw r3 = X.AnonymousClass5aQ.A00(r0)
            long r3 = r3.A14
            r50 = 0
            r43 = 3072(0xc00, float:4.305E-42)
            r44 = 390(0x186, float:5.47E-43)
            r45 = 27568(0x6bb0, float:3.8631E-41)
            r31 = r0
            r32 = r8
            r35 = r33
            r36 = r33
            r37 = r2
            r38 = r33
            r39 = r1
            r40 = r1
            r41 = r20
            r46 = r3
            r52 = r1
            X.AnonymousClass5ZZ.A03(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r50, r52)
            boolean r1 = X.C51971G9r.A1R(r0)
            if (r1 == 0) goto L_0x008f
            r1 = -176178477(0xfffffffff57fbad3, float:-3.2417601E32)
            X.0fL.A00(r1)
            goto L_0x008f
        L_0x02cd:
            r34 = 0
            goto L_0x0296
        L_0x02d0:
            r2 = r57
            goto L_0x0282
        L_0x02d3:
            r3 = 637892666(0x2605783a, float:4.630658E-16)
            r0.ExS(r3)
            int r4 = r15.ordinal()
            if (r4 == r1) goto L_0x0325
            r3 = r27
            if (r4 == r3) goto L_0x0321
            r3 = 3
            if (r4 == r3) goto L_0x031d
            r3 = r22
            if (r4 == r3) goto L_0x0319
            r3 = r20
            if (r4 != r3) goto L_0x0314
            r3 = 2131238956(0x7f08202c, float:1.8094205E38)
        L_0x02f1:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r3 == 0) goto L_0x0314
            int r4 = r3.intValue()
            r3 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r35 = X.C287205Zk.A0C(r8, r3)
            X.2DO r36 = X.C287975bA.A00(r0, r4, r1)
            r3 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 384(0x180, float:5.38E-43)
            r38 = 18
            r34 = r0
            r37 = r3
            r39 = r53
            X.C288165bT.A00(r34, r35, r36, r37, r38, r39)
        L_0x0314:
            X.C286565Wx.A0L(r2, r1)
            goto L_0x024a
        L_0x0319:
            r3 = 2131238222(0x7f081d4e, float:1.8092717E38)
            goto L_0x02f1
        L_0x031d:
            r3 = 2131238060(0x7f081cac, float:1.8092388E38)
            goto L_0x02f1
        L_0x0321:
            r3 = 2131238496(0x7f081e60, float:1.8093272E38)
            goto L_0x02f1
        L_0x0325:
            r3 = 2131237940(0x7f081c34, float:1.8092145E38)
            goto L_0x02f1
        L_0x0329:
            r5 = r6
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7V.A07(X.5Wy, X.EVW, java.lang.String, X.0sa, X.0sP, int, int, long, boolean, boolean):void");
    }

    public static final void A08(C286575Wy r16, C56532I0d i0d, String str, int i, boolean z) {
        int i2;
        C56532I0d i0d2 = i0d;
        String str2 = str;
        AnonymousClass7TF.A1B(str2, 0, i0d2);
        C286575Wy r3 = r16;
        r3.ExV(1582902070);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r3, str2) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r3, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r3, i0d2);
        }
        if ((i2 & 147) != 146 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(609949147, "com.instagram.profilecard.ui.QRCodeView (ProfileCardContent.kt:639)");
            }
            Context A0I = C51968G9o.A0I(r3);
            Integer num = AnonymousClass05K.A01;
            U16 u16 = new U16();
            u16.invalidateSelf();
            u16.A01 = num;
            U16.A00(u16);
            Paint paint = u16.A07;
            paint.setShader((Shader) null);
            u16.invalidateSelf();
            u16.A02 = null;
            U16.A00(u16);
            u16.A02 = str2;
            U16.A00(u16);
            if (i0d2.A00 != -1) {
                u16.setColorFilter(i0d2.A00(), PorterDuff.Mode.SRC_IN);
            } else if (!z) {
                float applyDimension = (float) ((int) TypedValue.applyDimension(1, 132.0f, A0I.getResources().getDisplayMetrics()));
                paint.setShader(C52416GRt.A00(G9t.A1D(C51967G9n.A0I(4293538672L), 4290187741L << 32), (List) null, 0, C289325dP.A00(0.0f, applyDimension), C289325dP.A00(applyDimension, 0.0f)));
                u16.invalidateSelf();
            }
            AnonymousClass6G3.A05(r3, C287205Zk.A0G(Modifier.A00, 132.0f, 132.0f), C287995bC.A00(u16, r3));
            if (0fL.A02()) {
                0fL.A00(-1410588135);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59140J7w(i0d2, str2, i3, 3, z2);
        }
    }

    public static final void A09(C286575Wy r9, C56532I0d i0d, String str, int i, boolean z) {
        int i2;
        C56532I0d i0d2 = i0d;
        String str2 = str;
        AnonymousClass7TF.A1B(str, 0, i0d);
        r9.ExV(209628235);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r9, str) | i;
        } else {
            i2 = i;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r9, z);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r9, i0d2);
        }
        if ((i2 & 147) != 146 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(347510640, "com.instagram.profilecard.ui.QrCodeCard (ProfileCardContent.kt:613)");
            }
            Modifier A01 = C304766Fd.A01(C287205Zk.A0G(HRH.A00(Modifier.A00, -6.0f), 180.0f, 180.0f), AnonymousClass5ZN.A00(), C51965G9l.A09(r9));
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A00 = C287425a7.A00(r9);
            C286565Wx r3 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A012 = C287435a8.A01(r9, A01);
            C51973G9u.A0y(r9, r3);
            C51971G9r.A12(r9, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r9, A00)) {
                C51971G9r.A13(r9, r1, A00);
            }
            C51965G9l.A18(r9, A012);
            A08(r9, i0d2, str, C51971G9r.A04(i2), z);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(1400797775);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59140J7w(i0d2, str2, i3, 4, z2);
        }
    }

    public static final void A0A(C286575Wy r29, C56532I0d i0d, String str, int i, boolean z) {
        int i2;
        long j;
        C303986Bo r15;
        long A08;
        C56532I0d i0d2 = i0d;
        String str2 = str;
        int A02 = DbW.A02(0, str2, i0d2);
        C286575Wy r12 = r29;
        r12.ExV(-1819180734);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, str2) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r12, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, i0d2);
        }
        if ((i2 & 147) != 146 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-693951647, "com.instagram.profilecard.ui.QrUsernameCard (ProfileCardContent.kt:679)");
            }
            Context A0I = C51968G9o.A0I(r12);
            C285245Qk r8 = Modifier.A00;
            Modifier A00 = C287205Zk.A00(C287215Zl.A00, C287205Zk.A08(HRH.A00(r8, 6.0f), 32.0f));
            r12.ExS(1951585681);
            if (z) {
                if (i0d2.A00 == -1) {
                    A08 = C51965G9l.A09(r12);
                } else {
                    A08 = C51965G9l.A08((long) i0d2.A00());
                }
                A00 = C51969G9p.A0X(A00, 8.0f, A08);
            }
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A002 = C287425a7.A00(r12);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r12, A00);
            C51973G9u.A0y(r12, A0H);
            C51971G9r.A12(r12, A0Z, A04);
            0sL r2 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r2, A002);
            }
            C51965G9l.A18(r12, A01);
            Modifier A0G = C51967G9n.A0G(r8, 8.0f);
            String A0D = 002.A0D(str2, '@');
            if (!z || i0d2.A00 != -1) {
                j = C51967G9n.A0a(r12, 1656328973).A13;
            } else {
                j = C51967G9n.A0a(r12, 1656327565).A14;
            }
            C286565Wx.A0L(A0H, false);
            long A012 = AnonymousClass5Z7.A01(26);
            Typeface A022 = AnonymousClass0qo.A00(A0I).A02(0qm.A0V);
            if (A022 != null) {
                r15 = C303946Bk.A00(A022);
            } else {
                r15 = null;
            }
            AnonymousClass5ZZ.A03(r12, A0G, (AnonymousClass5Z4) null, r15, (C291715hl) null, (AnonymousClass5ZD) null, A0D, (0sP) null, 0, 0, 1, A02, 3120, 390, 27568, j, A012, 0, false);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(1336310572);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59140J7w(i0d2, str2, i3, 5, z2);
        }
    }

    public static final void A0B(C286575Wy r13, C56532I0d i0d, 0sP r15, int i) {
        int i2;
        long j;
        C304786Ff r132;
        0sP r7 = r15;
        C56532I0d i0d2 = i0d;
        boolean A1U = AnonymousClass7TF.A1U(0, i0d, r15);
        C286575Wy r10 = r13;
        r13.ExV(1402219460);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, i0d) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r15);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1953226987, "com.instagram.profilecard.ui.ColorTray (ProfileCardContent.kt:713)");
            }
            C285245Qk r9 = Modifier.A00;
            AnonymousClass5RD A0V = C51968G9o.A0V(r13);
            int A00 = C287425a7.A00(r13);
            C286565Wx r5 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r13, r9);
            C51973G9u.A0y(r13, r5);
            C51971G9r.A12(r13, A0V, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r1, A00);
            }
            C51965G9l.A18(r13, A01);
            r13.ExS(740711059);
            List list = i0d.A01;
            ArrayList<C55649Hl8> A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0F = AnonymousClass7TG.A0F(it);
                String format = String.format("%06x", Arrays.copyOf(AnonymousClass7TF.A1b(A0F), A1U ? 1 : 0));
                0qQ.A07(format);
                A0r.add(new C55649Hl8(A0F, Color.parseColor(002.A0D(format, '#'))));
            }
            for (C55649Hl8 hl8 : A0r) {
                0qQ.A0B(hl8, 0);
                int i4 = i0d2.A00;
                int i5 = hl8.A00;
                if (i4 == i5) {
                    j = C51967G9n.A0a(r10, 474446630).A0n;
                } else {
                    j = C51967G9n.A0a(r10, 474447649).A0z;
                }
                C286565Wx.A0L(r5, false);
                if (i5 == -1) {
                    r132 = C51975G9x.A0K(G9t.A1D(C51967G9n.A0I(4293538672L), 4290187741L << 32));
                } else {
                    long j2 = AnonymousClass5RW.A01;
                    r132 = new C304776Fe(((long) hl8.A01) << 32);
                }
                Modifier A02 = C287195Zj.A02(C287205Zk.A0C(r9, 40.0f));
                AnonymousClass5ZQ r14 = AnonymousClass5ZN.A00;
                Modifier A002 = C304766Fd.A00(C304816Fi.A03(AnonymousClass6FZ.A01(A02, r14), r14, 2.0f, j), r132, AnonymousClass5S0.A00);
                Object A0m = C51967G9n.A0m(r10, 474467970);
                Object obj = AnonymousClass5XT.A00;
                C287605aT r3 = (C287605aT) C51972G9s.A0l(r10, A0m, obj);
                C286565Wx.A0L(r5, false);
                AnonymousClass5aR r2 = new AnonymousClass5aR(400.0f, 400.0f);
                boolean AGw = r10.AGw(hl8) | C51973G9u.A1O(r10, 474471087, i2);
                Object ECw = r10.ECw();
                if (AGw || ECw == obj) {
                    ECw = new MJ4(47, r7, hl8);
                    r10.FLL(ECw);
                }
                C287675aa.A02(r10, C287635aW.A02(r2, r3, A002, C51965G9l.A0y(r5, ECw, false)), 0);
            }
            if (C51971G9r.A1S(r10, r5, false)) {
                0fL.A00(107187361);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r7, i0d2, i3, 41);
        }
    }

    public static final void A0C(C286575Wy r34, C53397GnU gnU, C62320sa r36, int i) {
        int i2;
        C53397GnU gnU2 = gnU;
        C62320sa r5 = r36;
        boolean A1U = AnonymousClass7TF.A1U(0, r5, gnU2);
        C286575Wy r3 = r34;
        r3.ExV(1689654857);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r3, r5) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r3, gnU2);
        }
        if ((i2 & 19) != 18 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(798404651, "com.instagram.profilecard.ui.EditProfileTag (ProfileCardContent.kt:1161)");
            }
            Context A0I = C51968G9o.A0I(r3);
            long j = C291445hJ.A0K;
            float f = gnU2.A02;
            C285245Qk r7 = Modifier.A00;
            Modifier A00 = HRH.A00(r7, 1.0f);
            r3.ExS(-814406094);
            boolean AGr = r3.AGr(f);
            Object ECw = r3.ECw();
            if (AGr || ECw == AnonymousClass5XT.A00) {
                ECw = new C58726IwZ(f, 11);
                r3.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r3, false);
            Modifier A07 = C287195Zj.A07(C51970G9q.A0X(A00, (0sP) ECw), 4.0f);
            boolean A1N = C51973G9u.A1N(r3, -814403275, i2);
            Object ECw2 = r3.ECw();
            if (A1N || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C51795G2e(r5, 30);
                r3.FLL(ECw2);
            }
            Modifier A01 = C52638GaC.A01(r3, A07, C51965G9l.A0y(A0H, ECw2, false));
            r3.ExS(-814401084);
            boolean AGt = r3.AGt(j);
            Object ECw3 = r3.ECw();
            if (AGt || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new GQ2(j, 10);
                r3.FLL(ECw3);
            }
            Modifier A002 = C289575dp.A00(A01, C51965G9l.A0z(A0H, ECw3));
            C287245Zp r1 = C287215Zl.A04;
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r3, r1);
            int A003 = C287425a7.A00(r3);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r3, A002);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r3, A0H, r13);
            0sL r12 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r3, A0Q, A04, r12);
            0sL r10 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r3, A003)) {
                C51971G9r.A13(r3, r10, A003);
            }
            0sL r9 = C287485aD.A04;
            C287595aO.A00(r3, A012, r9);
            Modifier A0H2 = C51967G9n.A0H(r7, 10.0f);
            AnonymousClass5RD A004 = C287395a4.A00(C287275Zs.A01(4.0f), r3, r1);
            int A005 = C287425a7.A00(r3);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r3, A0H2);
            C51973G9u.A0z(r3, A0H, r13);
            C287595aO.A00(r3, A004, r12);
            if (C51965G9l.A1Y(r3, A0H, A042, A0w) || !C51972G9s.A1Q(r3, A005)) {
                C51971G9r.A13(r3, r10, A005);
            }
            C287595aO.A00(r3, A013, r9);
            String A006 = C304346Dc.A00(r3, 2131969905);
            long A014 = AnonymousClass5Z7.A01(12);
            AnonymousClass0qq A007 = AnonymousClass0qo.A00(A0I);
            AnonymousClass5ZZ.A03(r3, (Modifier) null, (AnonymousClass5Z4) null, C51973G9u.A0G(0qm.A0Y, A007), (C291715hl) null, (AnonymousClass5ZD) null, A006, (0sP) null, 0, 0, A1U ? 1 : 0, 2, 3072, 390, 27570, AnonymousClass5aQ.A00(r3).A14, A014, 0, false);
            if (C51971G9r.A1R(r3)) {
                0fL.A00(1732290800);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r5, gnU2, i3, 42);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.0rk] */
    public static final void A0D(C286575Wy r26, C53397GnU gnU, C62320sa r28, C62320sa r29, 0sP r30, int i, boolean z) {
        int i2;
        C62320sa r7 = r28;
        AnonymousClass7TF.A1B(r7, 1, r29);
        C53397GnU gnU2 = gnU;
        0sP r282 = r30;
        AnonymousClass7TF.A1D(r282, 3, gnU2);
        C286575Wy r5 = r26;
        r5.ExV(304345330);
        int i3 = i;
        boolean z2 = z;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r5, z2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r5, r7);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r5, r29);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r5, r282);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r5, gnU2);
        }
        if ((i2 & 9363) != 9362 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(638841933, "com.instagram.profilecard.ui.ProfileCardTagsContainer (ProfileCardContent.kt:1011)");
            }
            C304516Dt A01 = AnonymousClass62Q.A01(gnU2.A0B);
            AnonymousClass62O A04 = AnonymousClass62Q.A04(C51965G9l.A0N(AnonymousClass5aQ.A00(r5).A0P), C51965G9l.A0N(AnonymousClass5aQ.A00(r5).A0M), C51965G9l.A0N(AnonymousClass5aQ.A00(r5).A0O), C51965G9l.A0N(AnonymousClass5aQ.A00(r5).A0N));
            ? obj = new Object();
            C285245Qk r12 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r12, 24.0f, 0.0f, 24.0f, 24.0f);
            AnonymousClass5RD A0X = C51968G9o.A0X(r5);
            int A00 = C287425a7.A00(r5);
            C286565Wx r0 = (C286565Wx) r5;
            AnonymousClass5RM A042 = C286565Wx.A04(r0);
            Modifier A012 = C287435a8.A01(r5, A0B);
            C51973G9u.A0y(r5, r0);
            C51971G9r.A12(r5, A0X, A042);
            0sL r9 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r5, A00)) {
                C51971G9r.A13(r5, r9, A00);
            }
            C51965G9l.A18(r5, A012);
            C286575Wy r19 = r5;
            I5T.A02(C287275Zs.A02, (C287325Zx) null, (C56498HzU) null, r19, C51966G9m.A0T(r12), AnonymousClass5PI.A01(r5, new JH3(gnU2, r29, r282, obj, A04, A01), -881878025), 0, 0, 1572918, 60);
            r5.ExS(586596314);
            if (obj.A00 < 1 && z && !gnU2.A0K) {
                A0C(r5, gnU2, r7, ((i2 >> 3) & 14) | ((i2 >> 9) & 112));
            }
            if (C51971G9r.A1S(r5, r0, false)) {
                0fL.A00(1074468121);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9G(i3, 3, gnU2, r7, r282, r29, z2);
        }
    }

    public static final void A0E(C286575Wy r11, String str, String str2, String str3, int i) {
        int i2;
        String str4 = str;
        String str5 = str2;
        AnonymousClass7TG.A1N(str, str2);
        String str6 = str3;
        0qQ.A0B(str3, 2);
        r11.ExV(-337751265);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r11, str2);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0Q(r11, str3);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2113721777, "com.instagram.profilecard.ui.ProfileInfoContainer (ProfileCardContent.kt:930)");
            }
            Modifier A0G = C51967G9n.A0G(Modifier.A00, 24.0f);
            AnonymousClass5RD A01 = C291495hO.A01(C287275Zs.A03(C287215Zl.A04, 4.0f), r11, C287215Zl.A00);
            int A00 = C287425a7.A00(r11);
            C286565Wx r3 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A012 = C287435a8.A01(r11, A0G);
            C51973G9u.A0y(r11, r3);
            C51971G9r.A12(r11, A01, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r1, A00);
            }
            C51965G9l.A18(r11, A012);
            A0J(str, str2, r11, C51965G9l.A01(i2));
            A0F(str3, r11, (i2 >> 6) & 14);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(346956732);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J80(str4, str5, str6, i3, 2);
        }
    }

    public static final void A0F(String str, C286575Wy r24, int i) {
        int i2;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C286575Wy r4 = r24;
        r4.ExV(-928419692);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1094838750, "com.instagram.profilecard.ui.ProfileBioRow (ProfileCardContent.kt:987)");
            }
            Context A0I = C51968G9o.A0I(r4);
            int i4 = (i2 & 14) | 3072;
            AnonymousClass5ZZ.A03(r4, (Modifier) null, (AnonymousClass5Z4) null, C51973G9u.A0G(0qm.A0Y, AnonymousClass0qo.A00(A0I)), (C291715hl) null, (AnonymousClass5ZD) null, str2, (0sP) null, 3, 0, 3, 2, i4, 390, 27442, AnonymousClass5aQ.A00(r4).A14, AnonymousClass5Z7.A01(16), 0, false);
            if (0fL.A02()) {
                0fL.A00(501769983);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str2, i3, 11);
        }
    }

    public static final void A0G(String str, C286575Wy r26, int i) {
        int i2;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C286575Wy r6 = r26;
        r6.ExV(948369372);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r6, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2030381229, "com.instagram.profilecard.ui.ProfileFullName (ProfileCardContent.kt:954)");
            }
            Context A0I = C51968G9o.A0I(r6);
            AnonymousClass5ZZ.A03(r6, (Modifier) null, (AnonymousClass5Z4) null, C51973G9u.A0G(0qm.A0T, AnonymousClass0qo.A00(A0I)), (C291715hl) null, AnonymousClass5ZD.A01, str2, (0sP) null, 0, 0, 1, 2, (i2 & 14) | 199680, 390, 27538, AnonymousClass5aQ.A00(r6).A14, AnonymousClass5Z7.A01(16), 0, false);
            if (0fL.A02()) {
                0fL.A00(901366860);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str2, i3, 12);
        }
    }

    public static final void A0H(String str, C286575Wy r24, int i) {
        int i2;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C286575Wy r4 = r24;
        r4.ExV(-1562854573);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(828832393, "com.instagram.profilecard.ui.ProfilePronoun (ProfileCardContent.kt:971)");
            }
            Context A0I = C51968G9o.A0I(r4);
            int i4 = (i2 & 14) | 199680;
            AnonymousClass5ZZ.A03(r4, (Modifier) null, (AnonymousClass5Z4) null, C51973G9u.A0G(0qm.A0Y, AnonymousClass0qo.A00(A0I)), (C291715hl) null, AnonymousClass5ZD.A04, str2, (0sP) null, 0, 0, 1, 0, i4, 6, 31634, C291445hJ.A0M, AnonymousClass5Z7.A01(16), 0, false);
            if (0fL.A02()) {
                0fL.A00(1045236186);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str2, i3, 13);
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A0I(String str, C286575Wy r30, int i) {
        int i2;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C286575Wy r11 = r30;
        r11.ExV(1267243123);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1759336865, "com.instagram.profilecard.ui.ProfileSideUsernameLabel (ProfileCardContent.kt:872)");
            }
            Context A0I = C51968G9o.A0I(r11);
            AnonymousClass62O A04 = AnonymousClass62Q.A04(C51965G9l.A0N(AnonymousClass5aQ.A00(r11).A0R), C51965G9l.A0N(AnonymousClass5aQ.A00(r11).A0N), C51965G9l.A0N(AnonymousClass5aQ.A00(r11).A0O), C51965G9l.A0N(AnonymousClass5aQ.A00(r11).A0M), C51965G9l.A0N(AnonymousClass5aQ.A00(r11).A0P));
            float applyDimension = (float) ((int) TypedValue.applyDimension(1, 4.0f, A0I.getResources().getDisplayMetrics()));
            float applyDimension2 = ((float) ((int) TypedValue.applyDimension(1, 12.0f, A0I.getResources().getDisplayMetrics()))) + applyDimension;
            float applyDimension3 = ((float) ((int) TypedValue.applyDimension(1, 20.0f, A0I.getResources().getDisplayMetrics()))) + applyDimension;
            Object A0m = C51967G9n.A0m(r11, -291625959);
            if (A0m == AnonymousClass5XT.A00) {
                A0m = new C52920Geu(A04, applyDimension, applyDimension2, applyDimension3);
                r11.FLL(A0m);
            }
            C51965G9l.A1X(r11, false);
            Modifier A05 = C287195Zj.A05(Modifier.A00);
            C303876Bd A0b = C51969G9p.A0b();
            C291735hn r5 = new C291735hn(0.12f);
            long j = AnonymousClass5Z5.A01;
            C303986Bo r15 = null;
            int A00 = A0b.A00(new AnonymousClass5ZB((C291805hu) null, (C289645dx) null, (C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C286155Ud) null, r5, (C291795ht) null, AnonymousClass5ZA.A00.A01((C304786Ff) A0m, Float.NaN), (C291745ho) null, (String) null, j, j, AnonymousClass5RW.A08));
            try {
                A0b.A09("@ ");
                A0b.A04(A00);
                A0b.A09(str2);
                C286025Tq A02 = A0b.A02();
                long A01 = AnonymousClass5Z7.A01(20);
                Typeface A022 = AnonymousClass0qo.A00(A0I).A02(0qm.A0V);
                if (A022 != null) {
                    r15 = C303946Bk.A00(A022);
                }
                AnonymousClass5ZZ.A02(r11, A05, A02, (AnonymousClass5Z4) null, r15, (C291715hl) null, (AnonymousClass5ZD) null, (Map) null, (0sP) null, 3, 0, 1, 0, 3120, 6, 31536, AnonymousClass5aQ.A00(r11).A14, A01, false);
                if (0fL.A02()) {
                    0fL.A00(-288871363);
                }
            } catch (Throwable th) {
                A0b.A04(A00);
                throw th;
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str2, i3, 14);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.graphics.Bitmap r32, android.view.View r33, X.C286575Wy r34, androidx.compose.ui.Modifier r35, X.L3W r36, X.C53397GnU r37, com.instagram.profilecard.domain.ProfileCardViewModel r38, X.AnonymousClass62P r39, int r40, int r41, boolean r42, boolean r43, boolean r44) {
        /*
            r0 = r35
            r1 = 1
            r5 = r37
            r8 = r38
            r7 = r39
            X.DbZ.A0t(r1, r8, r5, r7)
            r2 = 6
            r12 = r36
            X.0qQ.A0B(r12, r2)
            r2 = 1343126544(0x500e7c10, float:9.5619809E9)
            r6 = r34
            r6.ExV(r2)
            r3 = r41
            r9 = r41 & 1
            r4 = r40
            r2 = r42
            if (r9 == 0) goto L_0x0185
            r9 = r40 | 6
        L_0x0026:
            r10 = r41 & 2
            if (r10 == 0) goto L_0x017a
            r9 = r9 | 48
        L_0x002c:
            r10 = r41 & 4
            if (r10 == 0) goto L_0x016f
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r10 = r41 & 8
            if (r10 == 0) goto L_0x0164
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r10 = r41 & 16
            r15 = r33
            if (r10 == 0) goto L_0x0159
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0040:
            r17 = r41 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r17 != 0) goto L_0x004e
            r10 = r10 & r40
            if (r10 != 0) goto L_0x004f
            int r10 = X.G9t.A0T(r6, r0)
        L_0x004e:
            r9 = r9 | r10
        L_0x004f:
            r10 = r41 & 64
            r16 = 1572864(0x180000, float:2.204052E-39)
            if (r10 == 0) goto L_0x0146
            r9 = r9 | r16
        L_0x0057:
            r11 = r3 & 128(0x80, float:1.794E-43)
            r10 = 12582912(0xc00000, float:1.7632415E-38)
            r42 = r32
            if (r11 != 0) goto L_0x0069
            r10 = r40 & r10
            if (r10 != 0) goto L_0x006a
            r10 = r42
            int r10 = X.G9t.A0L(r6, r10)
        L_0x0069:
            r9 = r9 | r10
        L_0x006a:
            r11 = r3 & 256(0x100, float:3.59E-43)
            r10 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = r43
            if (r11 != 0) goto L_0x007a
            r10 = r40 & r10
            if (r10 != 0) goto L_0x007b
            int r10 = X.G9t.A0g(r6, r14)
        L_0x007a:
            r9 = r9 | r10
        L_0x007b:
            r11 = r3 & 512(0x200, float:7.175E-43)
            r10 = 805306368(0x30000000, float:4.656613E-10)
            r13 = r44
            if (r11 != 0) goto L_0x008b
            r10 = r40 & r10
            if (r10 != 0) goto L_0x008c
            int r10 = X.G9t.A0h(r6, r13)
        L_0x008b:
            r9 = r9 | r10
        L_0x008c:
            r10 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r9 & r10
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r10) goto L_0x00c4
            boolean r10 = r6.Bwn()
            if (r10 == 0) goto L_0x00c4
            r6.Evl()
        L_0x009f:
            X.5Xd r9 = r6.ASQ()
            if (r9 == 0) goto L_0x00c3
            X.JCK r6 = new X.JCK
            r22 = r13
            r23 = r2
            r19 = r3
            r20 = r1
            r21 = r14
            r16 = r12
            r17 = r15
            r18 = r4
            r13 = r7
            r14 = r5
            r15 = r8
            r10 = r6
            r11 = r42
            r12 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r9.A06 = r6
        L_0x00c3:
            return
        L_0x00c4:
            if (r17 == 0) goto L_0x00c8
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
        L_0x00c8:
            boolean r10 = X.0fL.A02()
            if (r10 == 0) goto L_0x00d6
            r11 = -964788538(0xffffffffc67e7ec6, float:-16287.693)
            java.lang.String r10 = "com.instagram.profilecard.ui.ProfileCardContent (ProfileCardContent.kt:168)"
            X.0fL.A01(r11, r10)
        L_0x00d6:
            r10 = 0
            if (r2 == 0) goto L_0x013c
            r11 = 743071128(0x2c4a5d98, float:2.8757881E-12)
            r6.ExS(r11)
            r11 = 2131238245(0x7f081d65, float:1.8092763E38)
        L_0x00e2:
            X.2DO r22 = X.C287975bA.A00(r6, r11, r10)
            X.C51965G9l.A1X(r6, r10)
            boolean r10 = r5.A0J
            float r10 = X.C51971G9r.A00(r10)
            r30 = 0
            r35 = 0
            X.4gU r20 = X.I69.A03(r6, r10)
            r11 = 1684631570(0x64697012, float:1.7224668E22)
            X.JC9 r10 = new X.JC9
            r17 = r10
            r18 = r42
            r19 = r15
            r21 = r0
            r23 = r12
            r24 = r5
            r25 = r8
            r26 = r7
            r27 = r2
            r28 = r13
            r29 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.5PJ r34 = X.AnonymousClass5PI.A01(r6, r10, r11)
            int r9 = r9 >> 15
            r36 = r9 & 14
            r36 = r36 | r16
            r37 = 62
            r38 = 0
            r31 = r6
            r32 = r0
            r33 = r30
            r40 = r38
            X.C304846Fl.A01(r30, r31, r32, r33, r34, r35, r36, r37, r38, r40)
            boolean r9 = X.0fL.A02()
            if (r9 == 0) goto L_0x009f
            r9 = -531907642(0xffffffffe04bbbc6, float:-5.872218E19)
            X.0fL.A00(r9)
            goto L_0x009f
        L_0x013c:
            r11 = 743073443(0x2c4a66a3, float:2.8762901E-12)
            r6.ExS(r11)
            r11 = 2131238564(0x7f081ea4, float:1.809341E38)
            goto L_0x00e2
        L_0x0146:
            r10 = r40 & r16
            if (r10 != 0) goto L_0x0057
            r10 = 2097152(0x200000, float:2.938736E-39)
            boolean r11 = X.G9t.A1V(r6, r12, r10, r4)
            r10 = 524288(0x80000, float:7.34684E-40)
            if (r11 == 0) goto L_0x0156
            r10 = 1048576(0x100000, float:1.469368E-39)
        L_0x0156:
            r9 = r9 | r10
            goto L_0x0057
        L_0x0159:
            r10 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0040
            int r10 = X.G9t.A0I(r6, r15)
            r9 = r9 | r10
            goto L_0x0040
        L_0x0164:
            r10 = r4 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0038
            int r10 = X.G9t.A0H(r6, r7)
            r9 = r9 | r10
            goto L_0x0038
        L_0x016f:
            r10 = r4 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0032
            int r10 = X.G9t.A0G(r6, r5)
            r9 = r9 | r10
            goto L_0x0032
        L_0x017a:
            r10 = r40 & 48
            if (r10 != 0) goto L_0x002c
            int r10 = X.G9t.A0F(r6, r8)
            r9 = r9 | r10
            goto L_0x002c
        L_0x0185:
            r9 = r40 & 6
            if (r9 != 0) goto L_0x0191
            int r9 = X.G9t.A0Y(r6, r2)
            r9 = r9 | r40
            goto L_0x0026
        L_0x0191:
            r9 = r4
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7V.A01(android.graphics.Bitmap, android.view.View, X.5Wy, androidx.compose.ui.Modifier, X.L3W, X.GnU, com.instagram.profilecard.domain.ProfileCardViewModel, X.62P, int, int, boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.0rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: X.0rh} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C286575Wy r39, androidx.compose.ui.Modifier r40, X.C53397GnU r41, X.C62320sa r42, X.C62320sa r43, X.0sP r44, X.0sP r45, X.0sP r46, int r47, int r48, boolean r49) {
        /*
            r22 = r40
            r21 = 1
            r13 = r41
            r38 = r42
            r1 = r21
            r0 = r38
            X.AnonymousClass7TF.A1C(r13, r1, r0)
            r20 = 4
            r36 = r44
            r1 = r36
            r0 = r20
            X.0qQ.A0B(r1, r0)
            r10 = 5
            r37 = r43
            r0 = r37
            X.0qQ.A0B(r0, r10)
            r35 = r45
            r34 = r46
            r1 = r35
            r0 = r34
            X.C51972G9s.A1E(r1, r0)
            r0 = 1064591044(0x3f745ec4, float:0.954571)
            r3 = r39
            r3.ExV(r0)
            r8 = r48
            r0 = r48 & 1
            r4 = r47
            r33 = r49
            if (r0 == 0) goto L_0x0351
            r2 = r47 | 6
        L_0x0041:
            r0 = r48 & 2
            if (r0 == 0) goto L_0x0346
            r2 = r2 | 48
        L_0x0047:
            r5 = r48 & 4
            if (r5 == 0) goto L_0x0339
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r0 = r48 & 8
            if (r0 == 0) goto L_0x032c
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0053:
            r0 = r48 & 16
            if (r0 == 0) goto L_0x031f
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0059:
            r1 = r48 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r1 != 0) goto L_0x0069
            r0 = r47 & r0
            if (r0 != 0) goto L_0x006a
            r0 = r37
            int r0 = X.G9t.A0J(r3, r0)
        L_0x0069:
            r2 = r2 | r0
        L_0x006a:
            r1 = r48 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r1 != 0) goto L_0x007a
            r0 = r47 & r0
            if (r0 != 0) goto L_0x007b
            r0 = r35
            int r0 = X.G9t.A0K(r3, r0)
        L_0x007a:
            r2 = r2 | r0
        L_0x007b:
            r1 = r8 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != 0) goto L_0x008b
            r0 = r47 & r0
            if (r0 != 0) goto L_0x008c
            r0 = r34
            int r0 = X.G9t.A0L(r3, r0)
        L_0x008b:
            r2 = r2 | r0
        L_0x008c:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r2
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x00c0
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x00c0
            r3.Evl()
        L_0x009e:
            X.5Xd r1 = r3.ASQ()
            if (r1 == 0) goto L_0x00bf
            X.JBk r0 = new X.JBk
            r14 = r35
            r15 = r22
            r16 = r36
            r17 = r34
            r18 = r4
            r19 = r8
            r21 = r33
            r10 = r0
            r11 = r13
            r12 = r37
            r13 = r38
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.A06 = r0
        L_0x00bf:
            return
        L_0x00c0:
            if (r5 == 0) goto L_0x00c4
            X.5Qk r22 = androidx.compose.ui.Modifier.A00
        L_0x00c4:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00d2
            r1 = -1941761461(0xffffffff8c43124b, float:-1.5027758E-31)
            java.lang.String r0 = "com.instagram.profilecard.ui.FlippableProfileCard (ProfileCardContent.kt:337)"
            X.0fL.A01(r1, r0)
        L_0x00d2:
            X.0rh r19 = new X.0rh
            r19.<init>()
            float r1 = r13.A00
            r0 = r19
            r0.A00 = r1
            r0 = -1034040646(0xffffffffc25dcaba, float:-55.447975)
            java.lang.Object r0 = X.C51967G9n.A0m(r3, r0)
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            r1 = 0
            java.lang.Object r14 = X.C51974G9v.A0Z(r3, r0, r7, r1)
            X.5Oz r14 = (X.C284945Oz) r14
            X.5Wx r0 = X.C51965G9l.A0H(r3, r1)
            r5 = r19
            float r9 = r5.A00
            boolean r5 = X.C51971G9r.A1W(r14)
            if (r5 == 0) goto L_0x031b
            r6 = 1176256512(0x461c4000, float:10000.0)
        L_0x00fe:
            r18 = 0
            r5 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            X.5b7 r23 = X.C51965G9l.A0F(r5, r11, r6)
            r27 = 3072(0xc00, float:4.305E-42)
            r28 = 20
            r24 = r3
            r25 = r5
            r26 = r9
            X.4gU r11 = X.I69.A02(r23, r24, r25, r26, r27, r28)
            r6 = -1034027808(0xffffffffc25dfce0, float:-55.49695)
            java.lang.Object r6 = X.C51967G9n.A0m(r3, r6)
            if (r6 != r7) goto L_0x0129
            r9 = 34
            X.G2e r6 = new X.G2e
            r6.<init>(r11, r9)
            X.5TX r6 = X.C51969G9p.A0R(r3, r6)
        L_0x0129:
            X.4gU r6 = (X.C270284gU) r6
            X.C286565Wx.A0L(r0, r1)
            X.4bM r9 = X.AnonymousClass5YA.A01
            java.lang.Object r26 = r3.AJO(r9)
            r27 = 1057354776(0x3f05f418, float:0.5232558)
            X.J6Z r11 = new X.J6Z
            r23 = r11
            r24 = r36
            r25 = r19
            r28 = r10
            r23.<init>((java.lang.Object) r24, (java.lang.Object) r25, (java.lang.Object) r26, (float) r27, (int) r28)
            X.JNP r26 = X.GQV.A00(r3, r11)
            r10 = -1034013403(0xffffffffc25e3525, float:-55.5519)
            java.lang.Object r12 = X.C51967G9n.A0m(r3, r10)
            if (r12 != r7) goto L_0x015c
            r11 = 33
            X.G2e r10 = new X.G2e
            r10.<init>(r6, r11)
            X.5TX r12 = X.C51969G9p.A0R(r3, r10)
        L_0x015c:
            X.4gU r12 = (X.C270284gU) r12
            X.C286565Wx.A0L(r0, r1)
            X.4cd r9 = X.C51966G9m.A0j(r3, r9)
            r11 = 1140916224(0x44010000, float:516.0)
            float r10 = r9.F06(r11)
            boolean r9 = r13.A0D
            if (r9 == 0) goto L_0x0170
            r10 = 0
        L_0x0170:
            X.4gU r10 = X.I69.A03(r3, r10)
            X.5Qk r17 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r15 = X.C51966G9m.A0U(r17)
            r9 = -1033998201(0xffffffffc25e7087, float:-55.60989)
            boolean r16 = X.G9t.A1X(r3, r13, r10, r9)
            java.lang.Object r9 = r3.ECw()
            if (r16 != 0) goto L_0x0189
            if (r9 != r7) goto L_0x018f
        L_0x0189:
            r9 = 21
            X.J6m r9 = X.C59104J6m.A00(r3, r6, r10, r13, r9)
        L_0x018f:
            androidx.compose.ui.Modifier r24 = X.C51973G9u.A0D(r0, r15, r9)
            r10 = r17
            r9 = r18
            androidx.compose.ui.Modifier r10 = X.C287205Zk.A0H(r10, r9, r11)
            androidx.compose.ui.Modifier r10 = X.C287205Zk.A0F(r10, r9, r11)
            r9 = 1059760811(0x3f2aaaab, float:0.6666667)
            androidx.compose.ui.Modifier r16 = X.C54739HQw.A00(r10, r9, r1)
            X.6Gj r27 = X.AnonymousClass6Gj.Horizontal
            r9 = -1033978159(0xffffffffc25ebed1, float:-55.686344)
            java.lang.Object r11 = X.C51967G9n.A0m(r3, r9)
            if (r11 != r7) goto L_0x01bb
            r9 = 8
            X.MHh r11 = new X.MHh
            r11.<init>(r14, r5, r9)
            r3.FLL(r11)
        L_0x01bb:
            X.0sK r11 = (X.0sK) r11
            X.C286565Wx.A0L(r0, r1)
            com.instagram.profilecard.ui.ProfileCardContentKt$FlippableProfileCard$2 r15 = new com.instagram.profilecard.ui.ProfileCardContentKt$FlippableProfileCard$2
            r10 = r36
            r9 = r19
            r15.<init>(r14, r5, r10, r9)
            androidx.compose.foundation.gestures.DraggableElement r9 = new androidx.compose.foundation.gestures.DraggableElement
            r25 = r9
            r28 = r5
            r29 = r11
            r30 = r15
            r31 = r21
            r32 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r10 = r16
            androidx.compose.ui.Modifier r10 = r10.Ezh(r9)
            r9 = r22
            androidx.compose.ui.Modifier r11 = r10.Ezh(r9)
            X.5RD r10 = X.C51966G9m.A0Z(r1)
            int r14 = X.C287425a7.A00(r3)
            X.5RM r9 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r3, r11)
            X.C51973G9u.A0y(r3, r0)
            X.C51971G9r.A12(r3, r10, r9)
            X.0sL r10 = X.C287485aD.A02
            boolean r9 = r0.A0K
            if (r9 != 0) goto L_0x0208
            boolean r9 = X.C51972G9s.A1Q(r3, r14)
            if (r9 != 0) goto L_0x020b
        L_0x0208:
            X.C51971G9r.A13(r3, r10, r14)
        L_0x020b:
            X.C51965G9l.A18(r3, r11)
            X.5dj r16 = X.C289515dj.A00
            boolean r9 = X.C51971G9r.A1X(r12)
            if (r9 == 0) goto L_0x02e7
            r9 = -1761431914(0xffffffff9702ae96, float:-4.2225624E-25)
            r3.ExS(r9)
            float r26 = X.C51971G9r.A03(r6)
            r27 = r2 & 112(0x70, float:1.57E-43)
            r9 = 8388608(0x800000, float:1.17549435E-38)
            r23 = r3
            r25 = r13
            r28 = r1
            A03(r23, r24, r25, r26, r27, r28)
            X.C286565Wx.A0L(r0, r1)
        L_0x0230:
            r10 = 358833657(0x15635df9, float:4.5916416E-26)
            r3.ExS(r10)
            float r6 = X.C51971G9r.A03(r6)
            float r10 = java.lang.Math.abs(r6)
            r6 = 1127481344(0x43340000, float:180.0)
            float r10 = r10 % r6
            r6 = 1106247680(0x41f00000, float:30.0)
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x025b
            r6 = 1125515264(0x43160000, float:150.0)
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x025b
        L_0x024d:
            boolean r0 = X.C51971G9r.A1S(r3, r0, r1)
            if (r0 == 0) goto L_0x009e
            r0 = 1523701600(0x5ad1d760, float:2.95325387E16)
            X.0fL.A00(r0)
            goto L_0x009e
        L_0x025b:
            r11 = 1048576000(0x3e800000, float:0.25)
            r6 = r17
            androidx.compose.ui.Modifier r6 = X.C287205Zk.A07(r6, r11)
            androidx.compose.foundation.layout.FillElement r10 = X.C287205Zk.A00
            androidx.compose.ui.Modifier r14 = r6.Ezh(r10)
            androidx.compose.ui.Alignment r12 = X.C287215Zl.A0B
            r6 = r16
            androidx.compose.ui.Modifier r12 = r6.AAz(r12, r14)
            r6 = r18
            androidx.compose.ui.Modifier r14 = X.HRF.A00(r12, r6)
            r6 = 358840785(0x156379d1, float:4.593838E-26)
            r3.ExS(r6)
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r6
            boolean r6 = X.AnonymousClass7TF.A1S(r2, r9)
            java.lang.Object r12 = r3.ECw()
            if (r6 != 0) goto L_0x028c
            if (r12 != r7) goto L_0x0298
        L_0x028c:
            r15 = 31
            X.G2e r12 = new X.G2e
            r6 = r34
            r12.<init>(r6, r15)
            r3.FLL(r12)
        L_0x0298:
            X.0sa r12 = X.C51965G9l.A0y(r0, r12, r1)
            r6 = r21
            androidx.compose.ui.Modifier r6 = X.C287635aW.A05(r14, r5, r5, r12, r6)
            X.C287675aa.A02(r3, r6, r1)
            r6 = r17
            androidx.compose.ui.Modifier r6 = X.C287205Zk.A07(r6, r11)
            androidx.compose.ui.Modifier r10 = r6.Ezh(r10)
            r6 = r18
            androidx.compose.ui.Modifier r11 = X.HRF.A00(r10, r6)
            androidx.compose.ui.Alignment r10 = X.C287215Zl.A0A
            r6 = r16
            androidx.compose.ui.Modifier r10 = r6.AAz(r10, r11)
            r6 = 358848530(0x15639812, float:4.5962247E-26)
            boolean r2 = X.C51970G9q.A1X(r3, r6, r2, r9)
            java.lang.Object r9 = r3.ECw()
            if (r2 != 0) goto L_0x02cc
            if (r9 != r7) goto L_0x02d8
        L_0x02cc:
            r6 = 32
            X.G2e r9 = new X.G2e
            r2 = r34
            r9.<init>(r2, r6)
            r3.FLL(r9)
        L_0x02d8:
            X.0sa r6 = X.C51965G9l.A0y(r0, r9, r1)
            r2 = r21
            androidx.compose.ui.Modifier r2 = X.C287635aW.A05(r10, r5, r5, r6, r2)
            X.C287675aa.A02(r3, r2, r1)
            goto L_0x024d
        L_0x02e7:
            r9 = 8388608(0x800000, float:1.17549435E-38)
            r10 = -1761306209(0xffffffff9704999f, float:-4.2845397E-25)
            r3.ExS(r10)
            float r29 = X.C51971G9r.A03(r6)
            r12 = r2 & 112(0x70, float:1.57E-43)
            int r10 = r2 << 6
            r10 = r10 & 896(0x380, float:1.256E-42)
            r12 = r12 | r10
            r10 = r2 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r10
            r11 = 57344(0xe000, float:8.0356E-41)
            int r10 = r2 >> 3
            r11 = r11 & r10
            int r30 = X.C51969G9p.A05(r12, r11, r10)
            r23 = r3
            r25 = r13
            r26 = r38
            r27 = r37
            r28 = r35
            r31 = r33
            A04(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.C286565Wx.A0L(r0, r1)
            goto L_0x0230
        L_0x031b:
            float r6 = r13.A01
            goto L_0x00fe
        L_0x031f:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0059
            r0 = r36
            int r0 = X.G9t.A0I(r3, r0)
            r2 = r2 | r0
            goto L_0x0059
        L_0x032c:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0053
            r0 = r38
            int r0 = X.G9t.A0H(r3, r0)
            r2 = r2 | r0
            goto L_0x0053
        L_0x0339:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x004d
            r0 = r22
            int r0 = X.G9t.A0Q(r3, r0)
            r2 = r2 | r0
            goto L_0x004d
        L_0x0346:
            r0 = r47 & 48
            if (r0 != 0) goto L_0x0047
            int r0 = X.G9t.A0F(r3, r13)
            r2 = r2 | r0
            goto L_0x0047
        L_0x0351:
            r0 = r47 & 6
            if (r0 != 0) goto L_0x035f
            r0 = r33
            int r2 = X.G9t.A0Y(r3, r0)
            r2 = r2 | r47
            goto L_0x0041
        L_0x035f:
            r2 = r4
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7V.A05(X.5Wy, androidx.compose.ui.Modifier, X.GnU, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, int, int, boolean):void");
    }

    public static final void A02(C286575Wy r6, Modifier modifier, ImageUrl imageUrl, int i) {
        int i2;
        AnonymousClass7TG.A1N(modifier, imageUrl);
        r6.ExV(151656924);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r6, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r6, imageUrl);
        }
        if ((i2 & 19) != 18 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(444846829, "com.instagram.profilecard.ui.ProfilePicture (ProfileCardContent.kt:859)");
            }
            GRY.A02(r6, modifier, C51966G9m.A0o(r6, imageUrl, i2 >> 3), new GS6(240.0f, 240.0f, 2.0f, 1.0f), ((i2 << 6) & 896) | 48);
            if (0fL.A02()) {
                0fL.A00(1677450562);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, modifier, imageUrl, i, 43);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r2 == 0) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r11, androidx.compose.ui.Modifier r12, X.C53397GnU r13, float r14, int r15, int r16) {
        /*
            r1 = 1326584730(0x4f12139a, float:2.45075814E9)
            r0 = r11
            r11.ExV(r1)
            r3 = r16 & 1
            if (r3 == 0) goto L_0x011a
            r4 = r15 | 6
        L_0x000d:
            r1 = r16 & 2
            if (r1 == 0) goto L_0x010f
            r4 = r4 | 48
        L_0x0013:
            r1 = r16 & 4
            if (r1 == 0) goto L_0x0104
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0019:
            r2 = r4 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r2 != r1) goto L_0x0036
            boolean r1 = r11.Bwn()
            if (r1 == 0) goto L_0x0036
            r11.Evl()
        L_0x0028:
            X.5Xd r0 = r0.ASQ()
            if (r0 == 0) goto L_0x0035
            X.J7h r11 = new X.J7h
            r11.<init>(r12, r13, r14, r15, r16)
            r0.A06 = r11
        L_0x0035:
            return
        L_0x0036:
            if (r3 == 0) goto L_0x003a
            X.5Qk r12 = androidx.compose.ui.Modifier.A00
        L_0x003a:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0048
            r2 = 627088839(0x25609dc7, float:1.948236E-16)
            java.lang.String r1 = "com.instagram.profilecard.ui.QrCodeContainer (ProfileCardContent.kt:489)"
            X.0fL.A01(r2, r1)
        L_0x0048:
            com.instagram.common.typedurl.ImageUrl r6 = r13.A03
            r5 = 0
            if (r6 == 0) goto L_0x005a
            java.lang.String r1 = r6.getUrl()
            if (r1 == 0) goto L_0x005a
            int r2 = r1.length()
            r1 = 1
            if (r2 != 0) goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            X.J4L r2 = X.J4L.A00
            androidx.compose.ui.Modifier r3 = X.C51970G9q.A0X(r12, r2)
            boolean r2 = r13.A0I
            androidx.compose.ui.Modifier r2 = A00(r11, r3, r2)
            androidx.compose.ui.Modifier r3 = X.AnonymousClass6FZ.A00(r2)
            int r2 = r4 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            androidx.compose.ui.Modifier r4 = X.C55092Hc1.A00(r11, r3, r14, r2)
            r2 = 765829778(0x2da5a292, float:1.8830524E-11)
            r11.ExS(r2)
            if (r1 == 0) goto L_0x00df
            r8 = 0
            X.2DN r9 = X.1zC.A00(r11, r6)
        L_0x0080:
            X.5bM r10 = X.C288075bK.A00
            androidx.compose.ui.Alignment r7 = X.C287215Zl.A09
            r11 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.draw.PainterElement r6 = new androidx.compose.ui.draw.PainterElement
            r6.<init>(r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r4 = r4.Ezh(r6)
        L_0x008f:
            X.5Wx r7 = X.C51965G9l.A0H(r0, r5)
            r3 = 1108344832(0x42100000, float:36.0)
            X.5Zp r2 = X.C287215Zl.A04
            X.6Fc r3 = X.C287275Zs.A03(r2, r3)
            X.5Zr r2 = X.C287215Zl.A00
            X.5RD r3 = X.C291495hO.A01(r3, r0, r2)
            int r6 = X.C287425a7.A00(r0)
            X.5RM r2 = X.C286565Wx.A04(r7)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0y(r0, r7)
            X.C51971G9r.A12(r0, r3, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r7.A0K
            if (r2 != 0) goto L_0x00bf
            boolean r2 = X.C51972G9s.A1Q(r0, r6)
            if (r2 != 0) goto L_0x00c2
        L_0x00bf:
            X.C51971G9r.A13(r0, r3, r6)
        L_0x00c2:
            X.C51965G9l.A18(r0, r4)
            java.lang.String r2 = r13.A08
            X.I0d r3 = r13.A05
            A09(r0, r3, r2, r5, r1)
            java.lang.String r2 = r13.A0A
            A0A(r0, r3, r2, r5, r1)
            boolean r1 = X.C51967G9n.A1R(r0)
            if (r1 == 0) goto L_0x0028
            r1 = 2089181914(0x7c8662da, float:5.582182E36)
            X.0fL.A00(r1)
            goto L_0x0028
        L_0x00df:
            X.I0d r6 = r13.A05
            int r3 = r6.A00
            r2 = -1
            if (r3 != r2) goto L_0x00f3
            X.J4J r2 = X.J4J.A00
            androidx.compose.ui.Modifier r3 = X.C51970G9q.A0X(r4, r2)
            X.J4K r2 = X.J4K.A00
            androidx.compose.ui.Modifier r4 = X.C289575dp.A00(r3, r2)
            goto L_0x008f
        L_0x00f3:
            int r2 = r6.A00()
            long r2 = (long) r2
            long r2 = X.C51965G9l.A08(r2)
            r8 = 0
            X.Gf2 r9 = new X.Gf2
            r9.<init>(r2)
            goto L_0x0080
        L_0x0104:
            r1 = r15 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0019
            int r1 = X.G9t.A01(r11, r14)
            r4 = r4 | r1
            goto L_0x0019
        L_0x010f:
            r1 = r15 & 48
            if (r1 != 0) goto L_0x0013
            int r1 = X.G9t.A0F(r11, r13)
            r4 = r4 | r1
            goto L_0x0013
        L_0x011a:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0125
            int r4 = X.G9t.A0O(r11, r12)
            r4 = r4 | r15
            goto L_0x000d
        L_0x0125:
            r4 = r15
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7V.A03(X.5Wy, androidx.compose.ui.Modifier, X.GnU, float, int, int):void");
    }

    public static final void A0J(String str, String str2, C286575Wy r8, int i) {
        int i2;
        AnonymousClass7TG.A1N(str, str2);
        r8.ExV(27503768);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r8, str2);
        }
        if ((i2 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1456540294, "com.instagram.profilecard.ui.ProfileNameAndPronounRow (ProfileCardContent.kt:942)");
            }
            Modifier A08 = C287205Zk.A08(Modifier.A00, 22.0f);
            AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A01(4.0f), r8, C287215Zl.A04);
            int A002 = C287425a7.A00(r8);
            C286565Wx r3 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r8, A08);
            C51973G9u.A0y(r8, r3);
            C51971G9r.A12(r8, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r8, A002)) {
                C51971G9r.A13(r8, r1, A002);
            }
            C51965G9l.A18(r8, A01);
            A0G(str, r8, i2 & 14);
            A0H(str2, r8, (i2 >> 3) & 14);
            if (C51967G9n.A1R(r8)) {
                0fL.A00(1017151317);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7S(str, str2, i, 3);
        }
    }
}
