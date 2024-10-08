package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

public abstract class I30 {
    public static final void A00(C286575Wy r11, 2bv r12, AnonymousClass4UC r13, int i) {
        int i2;
        C286575Wy r6 = r11;
        r11.ExV(-2125438819);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, r13) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r11, r12);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1320906363, "com.instagram.quickpromotion.ui.megaphone.compose.BloksMegaphoneRowCompat (MegaphoneRow.kt:38)");
            }
            Object A0m = C51967G9n.A0m(r11, -172508869);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = new Object();
                r11.FLL(A0m);
            }
            C286565Wx r2 = (C286565Wx) r6;
            C286565Wx.A0L(r2, false);
            Modifier A0T = C51966G9m.A0T(Modifier.A00);
            boolean A1Z = C51967G9n.A1Z(r6, A0m, -172505209);
            Object ECw = r6.ECw();
            if (A1Z || ECw == obj) {
                ECw = new G4S(A0m, 38);
                r6.FLL(ECw);
            }
            0sP A0z = C51965G9l.A0z(r2, ECw);
            boolean A1Z2 = C51967G9n.A1Z(r6, A0m, -172501960) | C51972G9s.A1L(i2) | C51968G9o.A1Q(i2);
            Object ECw2 = r6.ECw();
            if (A1Z2 || ECw2 == obj) {
                ECw2 = C59104J6m.A00(r6, r13, A0m, r12, 22);
            }
            I63.A02(r6, A0T, A0z, C51965G9l.A0z(r2, ECw2), 48, 0);
            if (0fL.A02()) {
                0fL.A00(-841244525);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r13, r12, i, 46);
        }
    }

    public static final void A01(C286575Wy r3, 2bv r4, AnonymousClass4UC r5, int i) {
        int i2;
        AnonymousClass7TG.A1N(r5, r4);
        r3.ExV(-1411192912);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r3, r5) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r3, r4);
        }
        if ((i2 & 19) != 18 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1696007234, "com.instagram.quickpromotion.ui.megaphone.compose.MegaphoneRow (MegaphoneRow.kt:26)");
            }
            if (r5.A08.A00() != null) {
                r3.ExS(1829816925);
                A00(r3, r4, r5, C51965G9l.A01(i2));
            } else {
                r3.ExS(1829900098);
                A02(r3, r4, r5, C51965G9l.A01(i2));
            }
            if (C51970G9q.A1Z(r3)) {
                0fL.A00(-1506563913);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r5, r4, i, 47);
        }
    }

    public static final void A02(C286575Wy r20, 2bv r21, AnonymousClass4UC r22, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        0sL jgm;
        JQC jqc;
        C62320sa r0;
        ImageUrl imageUrl;
        AnonymousClass2DN A00;
        String str;
        JV7 jv7;
        JV7 jv72;
        C286575Wy r13 = r20;
        r13.ExV(1787854681);
        int i4 = i;
        AnonymousClass4UC r8 = r22;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r13, r8) | i;
        } else {
            i2 = i4;
        }
        2bv r9 = r21;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r13, r9);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-681503002, "com.instagram.quickpromotion.ui.megaphone.compose.NativeMegaphoneRow (MegaphoneRow.kt:53)");
            }
            AnonymousClass4V7 r1 = r8.A08;
            String A0n = DbZ.A0n(r1.A09);
            C283845Jo r02 = r1.A03;
            if (r02 != null) {
                String A0n2 = DbZ.A0n(r02);
                String str2 = r8.A09.A00;
                if (0qQ.A0K(str2, C66579MXk.A00(114))) {
                    jqc = IPZ.A00;
                } else if (0qQ.A0K(str2, AnonymousClass000.A00(1836))) {
                    jqc = C57111IPa.A00;
                } else {
                    if (0fL.A02()) {
                        0fL.A00(-1509278203);
                    }
                    ASQ = r13.ASQ();
                    if (ASQ != null) {
                        jgm = new JGM(i4, 0, (Object) r9, (Object) r8);
                        ASQ.A06 = jgm;
                    }
                    return;
                }
                JQC jqc2 = jqc;
                AnonymousClass4VG r12 = r8.A08.A00;
                r13.ExS(1685178539);
                if (r12 == null) {
                    r0 = null;
                } else {
                    boolean A1O = C51973G9u.A1O(r13, 222312276, i2) | AnonymousClass7TF.A1S(i2 & 14, 4);
                    Object ECw = r13.ECw();
                    if (A1O || ECw == AnonymousClass5XT.A00) {
                        ECw = new MJ8(1, r8, r9);
                        r13.FLL(ECw);
                    }
                    r0 = (C62320sa) ECw;
                    C51965G9l.A1V(r13);
                }
                C286565Wx r3 = (C286565Wx) r13;
                C286565Wx.A0L(r3, false);
                C283905Ju r14 = r8.A08.A07;
                if (r14 != null) {
                    imageUrl = r14.A00;
                } else {
                    imageUrl = null;
                }
                r13.ExS(1685183280);
                if (imageUrl == null) {
                    A00 = null;
                } else {
                    A00 = 1zC.A00(r13, imageUrl);
                }
                C286565Wx.A0L(r3, false);
                AnonymousClass4V7 r15 = r8.A08;
                C283865Jq r10 = r15.A05;
                if (r10 != null) {
                    str = DbZ.A0n(r10);
                } else {
                    str = null;
                }
                AnonymousClass4VG r102 = r15.A01;
                r13.ExS(1685188781);
                if (r102 == null) {
                    jv7 = null;
                } else {
                    String A0n3 = DbZ.A0n(r102.A00);
                    boolean A1O2 = C51973G9u.A1O(r13, 222324377, i2) | AnonymousClass7TF.A1S(i2 & 14, 4);
                    Object ECw2 = r13.ECw();
                    if (A1O2 || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = new MJ8(2, r8, r9);
                        r13.FLL(ECw2);
                    }
                    C286565Wx.A0I(r3);
                    jv7 = new JV7(A0n3, (C62320sa) ECw2);
                }
                C286565Wx.A0L(r3, false);
                AnonymousClass4VG r16 = r8.A08.A02;
                r13.ExS(1685198415);
                if (r16 == null) {
                    jv72 = null;
                } else {
                    String A0n4 = DbZ.A0n(r16.A00);
                    boolean A1O3 = C51973G9u.A1O(r13, 222334011, i2) | AnonymousClass7TF.A1S(i2 & 14, 4);
                    Object ECw3 = r13.ECw();
                    if (A1O3 || ECw3 == AnonymousClass5XT.A00) {
                        ECw3 = new MJ8(3, r8, r9);
                        r13.FLL(ECw3);
                    }
                    jv72 = new JV7(A0n4, C51965G9l.A0y(r3, ECw3, false));
                }
                C286565Wx.A0L(r3, false);
                I6N.A03(r13, A00, jv7, jv72, jqc2, A0n, A0n2, str, r0, 0, 0);
                C60340gF r2 = C60340gF.A00;
                boolean A1O4 = C51973G9u.A1O(r13, 1685214386, i2) | C51968G9o.A1Q(i2);
                Object ECw4 = r13.ECw();
                if (A1O4 || ECw4 == AnonymousClass5XT.A00) {
                    ECw4 = new C51648Fy7(r9, r8, (AnonymousClass4D7) null, 40);
                    r13.FLL(ECw4);
                }
                if (C51972G9s.A1S(r13, r3, ECw4, r2)) {
                    0fL.A00(-300172919);
                }
            } else {
                if (0fL.A02()) {
                    0fL.A00(-2079121733);
                }
                ASQ = r13.ASQ();
                if (ASQ != null) {
                    i3 = 49;
                    jgm = new JGO(i4, i3, (Object) r8, (Object) r9);
                    ASQ.A06 = jgm;
                }
                return;
            }
        } else {
            r13.Evl();
        }
        ASQ = r13.ASQ();
        if (ASQ != null) {
            i3 = 48;
            jgm = new JGO(i4, i3, (Object) r8, (Object) r9);
            ASQ.A06 = jgm;
        }
    }
}
