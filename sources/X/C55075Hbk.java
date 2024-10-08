package X;

import com.instagram.opal.impl.data.OpalProfileData;

/* renamed from: X.Hbk  reason: case insensitive filesystem */
public abstract class C55075Hbk {
    public static final void A00(C286575Wy r20, OpalProfileData opalProfileData, OpalProfileData opalProfileData2, String str, C62320sa r24, C62320sa r25, C62320sa r26, C62320sa r27, 0sP r28, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        C286575Wy r13 = r20;
        r13.ExV(1027226482);
        int i5 = i;
        C62320sa r12 = r24;
        if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r13, r12) | i;
        } else {
            i3 = i5;
        }
        C62320sa r11 = r25;
        if ((i & 48) == 0) {
            i3 |= G9t.A0F(r13, r11);
        }
        0sP r8 = r28;
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r13, r8);
        }
        C62320sa r10 = r26;
        if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r13, r10);
        }
        C62320sa r9 = r27;
        if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r13, r9);
        }
        if ((196608 & i) == 0) {
            i3 |= G9t.A0d(r13, z);
        }
        boolean z4 = z2;
        if ((i & 1572864) == 0) {
            i3 |= G9t.A0e(r13, z4);
        }
        boolean z5 = z3;
        if ((i & 12582912) == 0) {
            i3 |= G9t.A0f(r13, z5);
        }
        if ((i & 100663296) == 0) {
            i3 |= G9t.A0W(r13, str);
        }
        OpalProfileData opalProfileData3 = opalProfileData;
        if ((i & 805306368) == 0) {
            i3 |= G9t.A0N(r13, opalProfileData3);
        }
        int i6 = i2;
        OpalProfileData opalProfileData4 = opalProfileData2;
        if ((i2 & 6) == 0) {
            i4 = i2 | C41848B3p.A01(r13, opalProfileData4);
        } else {
            i4 = i6;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && r13.Bwn()) {
            r13.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(1470842297, "com.instagram.opal.impl.ui.OpalNavbarSurface (OpalFragment.kt:1177)");
            }
            if (z4) {
                boolean A1X = C51974G9v.A1X(r13, 135726990, i3);
                Object ECw = r13.ECw();
                if (A1X || ECw == AnonymousClass5XT.A00) {
                    ECw = G9w.A0s(r13, r12, 43);
                }
                C62320sa r5 = (C62320sa) ECw;
                C286565Wx A0G = C51965G9l.A0G(r13);
                boolean A1Y = C51974G9v.A1Y(r13, 135728961, i3);
                Object ECw2 = r13.ECw();
                if (A1Y || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = G9w.A0s(r13, r11, 44);
                }
                C62320sa r4 = (C62320sa) ECw2;
                C286565Wx.A0I(A0G);
                boolean A1Z = C51974G9v.A1Z(r13, 135730405, i3);
                Object ECw3 = r13.ECw();
                if (A1Z || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = C51970G9q.A0t(r13, r8, 44);
                }
                0sP r3 = (0sP) ECw3;
                C286565Wx.A0I(A0G);
                boolean A1a = C51974G9v.A1a(r13, 135732000, i3);
                Object ECw4 = r13.ECw();
                if (A1a || ECw4 == AnonymousClass5XT.A00) {
                    ECw4 = G9w.A0s(r13, r10, 45);
                }
                C62320sa r2 = (C62320sa) ECw4;
                C286565Wx.A0I(A0G);
                r13.ExS(135733669);
                boolean A1W = C51974G9v.A1W(i3);
                Object ECw5 = r13.ECw();
                if (A1W || ECw5 == AnonymousClass5XT.A00) {
                    ECw5 = new C51794G2d(r9, 46);
                    r13.FLL(ECw5);
                }
                C286565Wx.A0I(A0G);
                int i7 = i3 >> 3;
                C62320sa r242 = r5;
                C62320sa r252 = r4;
                C62320sa r262 = r2;
                C62320sa r272 = (C62320sa) ECw5;
                0sP r282 = r3;
                C56329Hwg.A01(r20, opalProfileData, opalProfileData2, str, r242, r252, r262, r272, r282, (i7 & 234881024) | (458752 & (i3 >> 6)) | ((i3 << 3) & 3670016) | (29360128 & i7) | ((i4 << 27) & 1879048192), z5, z);
            }
            if (0fL.A02()) {
                0fL.A00(-125699651);
            }
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            boolean z6 = z5;
            OpalProfileData opalProfileData5 = opalProfileData3;
            OpalProfileData opalProfileData6 = opalProfileData4;
            String str2 = str;
            ASQ.A06 = new JCF(opalProfileData5, opalProfileData6, str2, r12, r11, r10, r9, r8, i5, i6, z, z4, z6);
        }
    }
}
