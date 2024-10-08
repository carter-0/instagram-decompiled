package X;

import android.graphics.Picture;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Iterator;
import java.util.List;

public abstract class I78 {
    public static final void A01(Picture picture, C286575Wy r14, C317486nL r15, List list, int i) {
        int i2;
        String str;
        Picture picture2 = picture;
        0qQ.A0B(picture, 2);
        C286575Wy r7 = r14;
        r14.ExV(924566998);
        int i3 = i;
        List list2 = list;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, list2) | i;
        } else {
            i2 = i3;
        }
        C317486nL r3 = r15;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r15);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r14, picture);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(865274626, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiProfilePhoto (CustomGroupEmojiImagePicker.kt:123)");
            }
            C285245Qk r6 = Modifier.A00;
            boolean A1Z = C51967G9n.A1Z(r14, picture, 1776747760);
            Object ECw = r14.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new C73934PmE(picture, 18);
                r14.FLL(ECw);
            }
            C51968G9o.A1N(r14);
            Modifier A07 = C287195Zj.A07(C304766Fd.A00(C51966G9m.A0W(C289575dp.A01(r6, (0sP) ECw)), A00(r14, list2), AnonymousClass5S0.A00), 20.0f);
            if (r15 != null) {
                str = r15.A02;
            } else {
                str = "";
            }
            AnonymousClass5ZZ.A0G(r7, A07, C51966G9m.A0g(r14), str, 3, 3072, 16244, 0, AnonymousClass5Z7.A01(48));
            if (0fL.A02()) {
                0fL.A00(-430498304);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(list2, picture2, r3, i3, 36);
        }
    }

    public static final void A03(C286575Wy r11, C61072JwA jwA, C62320sa r13, int i, boolean z) {
        int i2;
        long j;
        AnonymousClass7TF.A1B(jwA, 0, r13);
        r11.ExV(1337638997);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, jwA) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        boolean z2 = z;
        if (i4 == 0) {
            i2 |= G9t.A0Z(r11, z);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r11, r13);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2000100216, "com.instagram.direct.fragment.thread.threaddetail.customization.ColorThemeOption (CustomGroupEmojiImagePicker.kt:172)");
            }
            String A00 = C288035bG.A00(r11, jwA.A01);
            Modifier A0C = C287205Zk.A0C(Modifier.A00, 40.0f);
            boolean A1Y = C51967G9n.A1Y(r11, A00, -936162547);
            Object ECw = r11.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0x(r11, A00, 26);
            }
            C286565Wx A0H = C51965G9l.A0H(r11, false);
            boolean z3 = true;
            Modifier A002 = AnonymousClass5R5.A00(A0C, (0sP) ECw, false);
            AnonymousClass5ZQ r7 = AnonymousClass5ZN.A00;
            Modifier A01 = AnonymousClass6FZ.A01(A002, r7);
            float f = 0.0f;
            if (z) {
                f = 2.0f;
            }
            r11.ExS(-936156658);
            if (z) {
                j = C51966G9m.A0N(r11);
            } else {
                j = AnonymousClass5RW.A07;
            }
            C286565Wx.A0L(A0H, false);
            Modifier A03 = C304816Fi.A03(A01, r7, f, j);
            boolean A1O = C51973G9u.A1O(r11, -936152238, i2);
            if ((i2 & 896) != 256) {
                z3 = false;
            }
            boolean z4 = A1O | z3;
            Object ECw2 = r11.ECw();
            if (z4 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = GA1.A00(r11, r13, 28, z);
            }
            if (C51967G9n.A1X(r11, C304766Fd.A00(C51969G9p.A0V(A0H, A03, ECw2), A00(r11, (List) jwA.A02), AnonymousClass5S0.A00))) {
                0fL.A00(-2101354840);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 12, jwA, r13, z2);
        }
    }

    public static final void A04(C286575Wy r20, JVH jvh, C317486nL r22, 0sP r23, int i) {
        int i2;
        JVH jvh2 = jvh;
        0sP r2 = r23;
        AnonymousClass7TF.A1B(jvh2, 0, r2);
        C286575Wy r5 = r20;
        r5.ExV(-1055442747);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r5, jvh2) | i;
        } else {
            i2 = i3;
        }
        C317486nL r3 = r22;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r5, r3);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r5, r2);
        }
        if ((i2 & 147) != 146 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-202772529, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiPicker (CustomGroupEmojiImagePicker.kt:192)");
            }
            Iterable iterable = (Iterable) jvh2.A01;
            boolean A1Y = C51967G9n.A1Y(r5, iterable, 863578927);
            Object ECw = r5.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = 00k.A0Q(iterable, 6);
                r5.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r5, false);
            boolean z = false;
            LazyListState A00 = C305066Gi.A00(r5, 0, 0, 0, 3);
            Modifier Ezh = C51966G9m.A0T(Modifier.A00).Ezh(C287205Zk.A00);
            C304826Fj r15 = new C304826Fj(16.0f, 16.0f, 16.0f, 16.0f);
            C304756Fc A01 = C287275Zs.A01(16.0f);
            C287265Zr r18 = C287215Zl.A00;
            boolean A1S = C51973G9u.A1S(r5, ECw, r3, 863590988);
            if ((i2 & 896) == 256) {
                z = true;
            }
            boolean z2 = A1S | z;
            Object ECw2 = r5.ECw();
            if (z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C74188PqU(9, (Object) r2, ECw, (Object) r3);
                r5.FLL(ECw2);
            }
            AnonymousClass6HY.A01((AnonymousClass6HS) null, A01, r15, A00, r5, r18, Ezh, C51965G9l.A0z(A0H, ECw2), 12804486, 72, false, true);
            if (0fL.A02()) {
                0fL.A00(-2071118900);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(jvh2, r2, r3, i3, 35);
        }
    }

    public static final void A06(C286575Wy r14, C53002Ggt ggt, C55952HqG hqG, List list, List list2, int i) {
        int i2;
        C53002Ggt ggt2 = ggt;
        List list3 = list;
        AnonymousClass7TF.A1H(list3, ggt);
        C55952HqG hqG2 = hqG;
        0qQ.A0B(hqG2, 3);
        C286575Wy r5 = r14;
        r14.ExV(-1762320195);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, list3) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, ggt2);
        }
        List list4 = list2;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r5, list4);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r5, hqG2);
        }
        if ((i2 & 1171) != 1170 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1855012873, "com.instagram.direct.fragment.thread.threaddetail.customization.ThemesPicker (CustomGroupEmojiImagePicker.kt:151)");
            }
            LazyListState A00 = C305066Gi.A00(r5, 0, 0, 0, 3);
            Modifier A0D = C51967G9n.A0D(C51969G9p.A0U(), 24.0f);
            C287245Zp r6 = C287215Zl.A04;
            C304826Fj r3 = new C304826Fj(16.0f, 8.0f, 16.0f, 8.0f);
            C304756Fc A01 = C287275Zs.A01(16.0f);
            boolean A1U = C51966G9m.A1U(r5, hqG2, C51966G9m.A1U(r5, ggt2, C51973G9u.A1S(r5, list3, list4, -1079325817)));
            Object ECw = r5.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = new C58769IxG(40, list4, ggt2, list3, hqG2);
                r5.FLL(ECw);
            }
            C51965G9l.A1X(r5, false);
            AnonymousClass6HY.A02(A01, r3, A00, r5, r6, A0D, (0sP) ECw, 12804486, 72);
            if (0fL.A02()) {
                0fL.A00(-974686462);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(ggt2, list3, hqG2, list4, i3, 12);
        }
    }

    public static final void A08(C286575Wy r21, C62320sa r22, C62320sa r23, int i) {
        int i2;
        C62320sa r6 = r22;
        C62320sa r5 = r23;
        boolean A1U = AnonymousClass7TF.A1U(0, r6, r5);
        C286575Wy r14 = r21;
        r14.ExV(1149708792);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r6) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r5);
        }
        if ((i2 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2114359695, "com.instagram.direct.fragment.thread.threaddetail.customization.TopRow (CustomGroupEmojiImagePicker.kt:284)");
            }
            C285245Qk r8 = Modifier.A00;
            Modifier A0V = C51966G9m.A0V(C287195Zj.A01(r8));
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A04, r14, C287215Zl.A05, 6);
            int A00 = C287425a7.A00(r14);
            C286565Wx r0 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r0);
            Modifier A01 = C287435a8.A01(r14, A0V);
            C51973G9u.A0y(r14, r0);
            C51971G9r.A12(r14, A02, A04);
            0sL r11 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r11, A00);
            }
            C51965G9l.A18(r14, A01);
            String A002 = C288035bG.A00(r14, 2131954722);
            boolean A1N = C51973G9u.A1N(r14, 752425379, i2);
            Object ECw = r14.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new C73902Pld(r6, 38);
                r14.FLL(ECw);
            }
            AnonymousClass5ZZ.A0G(r14, C287195Zj.A07(C287635aW.A05(r8, (C287625aV) null, (String) null, C51965G9l.A0y(r0, ECw, false), A1U), 4.0f), C51966G9m.A0g(r14), A002, 5, 3072, 16240, C51966G9m.A0H(r14), AnonymousClass5Z7.A01(17));
            String A003 = C288035bG.A00(r14, 2131960992);
            boolean A1Y = C51974G9v.A1Y(r14, 752434593, i2);
            Object ECw2 = r14.ECw();
            if (A1Y || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C73902Pld(r5, 39);
                r14.FLL(ECw2);
            }
            AnonymousClass5ZZ.A0G(r14, C287195Zj.A07(C287635aW.A05(r8, (C287625aV) null, (String) null, C51965G9l.A0y(r0, ECw2, false), A1U), 4.0f), C51966G9m.A0g(r14), A003, 6, 3072, 16240, C51966G9m.A0N(r14), AnonymousClass5Z7.A01(17));
            if (C51967G9n.A1R(r14)) {
                0fL.A00(151519385);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGO(r6, r5, i3, 6);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: X.IoM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.IoM} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0129, code lost:
        if (r8 == r0) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012b, code lost:
        r19 = new X.C58218IoM(20, r11, r15, r5, r13, r25);
        r7.FLL(r19);
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        A08(r7, r9, X.C51965G9l.A0y(r1, r8, false), 0);
        A01(r13, r7, (X.C317486nL) ((X.JVH) r17.getValue()).A02, (java.util.List) ((X.JVH) r17.getValue()).A03, 0);
        r19 = r7;
        A06(r19, r6, r5, (java.util.List) ((X.JVH) r17.getValue()).A04, (java.util.List) ((X.JVH) r17.getValue()).A03, (r12 & 112) | ((r12 << 3) & 7168));
        X.C56618I4t.A02(r19, X.C287195Zj.A09(r16, 0.0f, 8.0f), 0.0f, 6, 4, X.AnonymousClass5aQ.A00(r7).A0D);
        r11 = ((X.JVH) r17.getValue()).A05;
        r12 = X.C51967G9n.A1Z(r7, r6, 1479412552);
        r10 = r7.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b3, code lost:
        if (r12 != false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b5, code lost:
        if (r10 != r0) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b7, code lost:
        r10 = new X.C73934PmE(r6, 17);
        r7.FLL(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c1, code lost:
        X.C52751Gc3.A00((X.C287605aT) null, r19, X.C287195Zj.A0B(X.C51966G9m.A0T(r16), 16.0f, 8.0f, 16.0f, 0.0f), (X.AnonymousClass2DO) null, r11, (java.lang.String) null, X.C51965G9l.A0z(r1, r10), 0, 56);
        r11 = (X.JVH) r17.getValue();
        r10 = (X.C317486nL) ((X.JVH) r17.getValue()).A02;
        r9 = X.C51973G9u.A1S(r7, r6, r5, 1479420185);
        r8 = r7.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f7, code lost:
        if (r9 != false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f9, code lost:
        if (r8 != r0) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01fb, code lost:
        r8 = new X.C74185PqR(13, (java.lang.Object) r5, (java.lang.Object) r6);
        r7.FLL(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0205, code lost:
        A04(r7, r11, r10, X.C51965G9l.A0z(r1, r8), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0210, code lost:
        if (X.C51967G9n.A1R(r7) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0212, code lost:
        X.0fL.A00(-260100953);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C286575Wy r22, X.C53002Ggt r23, X.C55952HqG r24, X.OJf r25, int r26) {
        /*
            r6 = r23
            r5 = r24
            X.AnonymousClass7TG.A1O(r6, r5)
            r0 = 1836554396(0x6d77989c, float:4.7892057E27)
            r7 = r22
            r7.ExV(r0)
            r3 = r26
            r0 = r26 & 6
            r10 = 4
            r4 = r25
            if (r0 != 0) goto L_0x0220
            boolean r0 = X.G9t.A1T(r7, r4, r3)
            int r12 = X.C51970G9q.A05(r0)
            r12 = r12 | r26
        L_0x0022:
            r0 = r26 & 48
            if (r0 != 0) goto L_0x002b
            int r0 = X.G9t.A0F(r7, r6)
            r12 = r12 | r0
        L_0x002b:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0034
            int r0 = X.G9t.A0G(r7, r5)
            r12 = r12 | r0
        L_0x0034:
            r1 = r12 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x0052
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0052
            r7.Evl()
        L_0x0043:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x0051
            r0 = 34
            X.JGN r0 = X.JGN.A01(r6, r4, r5, r3, r0)
            r1.A06 = r0
        L_0x0051:
            return
        L_0x0052:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0060
            r1 = 295458098(0x119c5532, float:2.4664966E-28)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.threaddetail.customization.CustomGroupEmojiImagePicker (CustomGroupEmojiImagePicker.kt:73)"
            X.0fL.A01(r1, r0)
        L_0x0060:
            X.0Ud r0 = r6.A04
            r18 = 0
            r2 = 0
            X.4gU r17 = X.AnonymousClass6FW.A02(r7, r0, r2)
            X.5Qk r16 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r9 = X.C51966G9m.A0U(r16)
            X.5RD r8 = X.C51968G9o.A0X(r7)
            int r11 = X.C287425a7.A00(r7)
            r1 = r7
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r0 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r9 = X.C287435a8.A01(r7, r9)
            X.C51973G9u.A0y(r7, r1)
            X.C51971G9r.A12(r7, r8, r0)
            X.0sL r8 = X.C287485aD.A02
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x0094
            boolean r0 = X.C51972G9s.A1Q(r7, r11)
            if (r0 != 0) goto L_0x0097
        L_0x0094:
            X.C51971G9r.A13(r7, r8, r11)
        L_0x0097:
            X.C51965G9l.A18(r7, r9)
            java.lang.Object r0 = r17.getValue()
            X.JVH r0 = (X.JVH) r0
            java.lang.Object r9 = r0.A02
            java.lang.Object r0 = r17.getValue()
            X.JVH r0 = (X.JVH) r0
            java.lang.Object r8 = r0.A03
            r0 = 1479371848(0x582d6c48, float:7.627223E14)
            boolean r0 = X.G9t.A1Z(r7, r9, r8, r0)
            java.lang.Object r13 = r7.ECw()
            if (r0 != 0) goto L_0x00bb
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r13 != r0) goto L_0x00c3
        L_0x00bb:
            android.graphics.Picture r13 = new android.graphics.Picture
            r13.<init>()
            r7.FLL(r13)
        L_0x00c3:
            android.graphics.Picture r13 = (android.graphics.Picture) r13
            X.C286565Wx.A0L(r1, r2)
            java.lang.Object r8 = r7.ECw()
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            java.lang.Object r8 = X.C51974G9v.A0Y(r7, r8, r0)
            X.6FV r8 = (X.AnonymousClass6FV) r8
            X.4Cq r15 = r8.A00
            java.lang.Object r11 = X.C51966G9m.A16(r7)
            r8 = 1479378136(0x582d84d8, float:7.6314428E14)
            boolean r14 = X.C51967G9n.A1Z(r7, r5, r8)
            r8 = r12 & 14
            if (r8 == r10) goto L_0x00ef
            r9 = r12 & 8
            if (r9 == 0) goto L_0x021d
            boolean r9 = r7.AGw(r4)
            if (r9 == 0) goto L_0x021d
        L_0x00ef:
            r9 = 1
        L_0x00f0:
            r14 = r14 | r9
            java.lang.Object r9 = r7.ECw()
            if (r14 != 0) goto L_0x00f9
            if (r9 != r0) goto L_0x0103
        L_0x00f9:
            r14 = 35
            X.Phe r9 = new X.Phe
            r9.<init>(r14, r5, r4)
            r7.FLL(r9)
        L_0x0103:
            X.0sa r9 = X.C51965G9l.A0y(r1, r9, r2)
            r14 = 1479383909(0x582d9b65, float:7.635317E14)
            boolean r14 = X.C51967G9n.A1Z(r7, r5, r14)
            if (r8 == r10) goto L_0x011a
            r8 = r12 & 8
            if (r8 == 0) goto L_0x021a
            boolean r8 = r7.AGw(r4)
            if (r8 == 0) goto L_0x021a
        L_0x011a:
            r8 = 1
        L_0x011b:
            boolean r8 = X.C51973G9u.A1T(r7, r15, r13, r14, r8)
            boolean r14 = X.C51966G9m.A1U(r7, r11, r8)
            java.lang.Object r8 = r7.ECw()
            if (r14 != 0) goto L_0x012b
            if (r8 != r0) goto L_0x013f
        L_0x012b:
            r20 = 20
            X.IoM r8 = new X.IoM
            r19 = r8
            r21 = r11
            r22 = r15
            r23 = r5
            r24 = r13
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r7.FLL(r8)
        L_0x013f:
            X.0sa r8 = X.C51965G9l.A0y(r1, r8, r2)
            A08(r7, r9, r8, r2)
            java.lang.Object r8 = r17.getValue()
            X.JVH r8 = (X.JVH) r8
            java.lang.Object r9 = r8.A03
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r17.getValue()
            X.JVH r8 = (X.JVH) r8
            java.lang.Object r8 = r8.A02
            X.6nL r8 = (X.C317486nL) r8
            A01(r13, r7, r8, r9, r2)
            java.lang.Object r8 = r17.getValue()
            X.JVH r8 = (X.JVH) r8
            java.lang.Object r11 = r8.A04
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r8 = r17.getValue()
            X.JVH r8 = (X.JVH) r8
            java.lang.Object r9 = r8.A03
            java.util.List r9 = (java.util.List) r9
            r24 = r12 & 112(0x70, float:1.57E-43)
            int r8 = r12 << 3
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r24 = r24 | r8
            r19 = r7
            r20 = r6
            r21 = r5
            r22 = r11
            r23 = r9
            A06(r19, r20, r21, r22, r23, r24)
            X.5Yw r8 = X.AnonymousClass5aQ.A00(r7)
            long r11 = r8.A0D
            r9 = 0
            r8 = 1090519040(0x41000000, float:8.0)
            r13 = r16
            androidx.compose.ui.Modifier r20 = X.C287195Zj.A09(r13, r9, r8)
            r22 = 6
            r21 = r9
            r23 = r10
            r24 = r11
            X.C56618I4t.A02(r19, r20, r21, r22, r23, r24)
            java.lang.Object r10 = r17.getValue()
            X.JVH r10 = (X.JVH) r10
            java.lang.String r11 = r10.A05
            r10 = 1479412552(0x582e0b48, float:7.654539E14)
            boolean r12 = X.C51967G9n.A1Z(r7, r6, r10)
            java.lang.Object r10 = r7.ECw()
            if (r12 != 0) goto L_0x01b7
            if (r10 != r0) goto L_0x01c1
        L_0x01b7:
            r12 = 17
            X.PmE r10 = new X.PmE
            r10.<init>(r6, r12)
            r7.FLL(r10)
        L_0x01c1:
            X.0sP r24 = X.C51965G9l.A0z(r1, r10)
            androidx.compose.ui.Modifier r12 = X.C51966G9m.A0T(r16)
            r10 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r20 = X.C287195Zj.A0B(r12, r10, r8, r10, r9)
            r26 = 56
            r21 = r18
            r23 = r18
            r22 = r11
            r25 = r2
            X.C52751Gc3.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r11 = r17.getValue()
            X.JVH r11 = (X.JVH) r11
            java.lang.Object r8 = r17.getValue()
            X.JVH r8 = (X.JVH) r8
            java.lang.Object r10 = r8.A02
            X.6nL r10 = (X.C317486nL) r10
            r8 = 1479420185(0x582e2919, float:7.6596615E14)
            boolean r9 = X.C51973G9u.A1S(r7, r6, r5, r8)
            java.lang.Object r8 = r7.ECw()
            if (r9 != 0) goto L_0x01fb
            if (r8 != r0) goto L_0x0205
        L_0x01fb:
            r0 = 13
            X.PqR r8 = new X.PqR
            r8.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r6)
            r7.FLL(r8)
        L_0x0205:
            X.0sP r0 = X.C51965G9l.A0z(r1, r8)
            A04(r7, r11, r10, r0, r2)
            boolean r0 = X.C51967G9n.A1R(r7)
            if (r0 == 0) goto L_0x0043
            r0 = -260100953(0xfffffffff07f2ca7, float:-3.1589064E29)
            X.0fL.A00(r0)
            goto L_0x0043
        L_0x021a:
            r8 = 0
            goto L_0x011b
        L_0x021d:
            r9 = 0
            goto L_0x00f0
        L_0x0220:
            r12 = r3
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I78.A05(X.5Wy, X.Ggt, X.HqG, X.OJf, int):void");
    }

    public static final C52924Gey A00(C286575Wy r4, List list) {
        C52924Gey A0K;
        int i;
        if (C51967G9n.A1U(r4, 576839376)) {
            0fL.A01(-989298340, "com.instagram.direct.fragment.thread.threaddetail.customization.getBackgroundColorMapping (CustomGroupEmojiImagePicker.kt:267)");
        }
        if (list != null) {
            A0K = C51975G9x.A0K(list);
            if (0fL.A02()) {
                i = -189129788;
            }
            C51965G9l.A1V(r4);
            return A0K;
        }
        A0K = C51975G9x.A0K(0sr.A1P(new AnonymousClass5RW[]{C51967G9n.A0I(4283814143L), C51967G9n.A0I(4285896663L), C51967G9n.A0I(4294942643L)}));
        if (0fL.A02()) {
            i = 1211868616;
        }
        C51965G9l.A1V(r4);
        return A0K;
        0fL.A00(i);
        C51965G9l.A1V(r4);
        return A0K;
    }

    public static final void A02(C286575Wy r18, Modifier modifier, C317486nL r20, C317486nL r21, 0sP r22, int i) {
        int i2;
        long j;
        C286575Wy r13 = r18;
        r13.ExV(490240670);
        int i3 = i;
        C317486nL r5 = r20;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, r5) | i;
        } else {
            i2 = i3;
        }
        Modifier modifier2 = modifier;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r13, modifier2);
        }
        C317486nL r4 = r21;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r13, r4);
        }
        0sP r8 = r22;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r13, r8);
        }
        if ((i2 & 1171) != 1170 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1069594008, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiImage (CustomGroupEmojiImagePicker.kt:230)");
            }
            Object A0m = C51967G9n.A0m(r13, -252844734);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r7 = (C284945Oz) C51974G9v.A0Z(r13, A0m, obj, true);
            C286565Wx r6 = (C286565Wx) r13;
            C286565Wx.A0L(r6, false);
            if (r21 == null || !r4.equals(r5)) {
                j = C51967G9n.A0a(r13, -252837908).A17;
            } else {
                j = C51967G9n.A0a(r13, -252839620).A0C;
            }
            C286565Wx.A0L(r6, false);
            boolean A1U = C51966G9m.A1U(r13, r5, C51973G9u.A1Q(r13, -252834952, i2));
            Object ECw = r13.ECw();
            if (A1U || ECw == obj) {
                ECw = new C73665Phe(36, r8, r5);
                r13.FLL(ECw);
            }
            Modifier A0X = C51966G9m.A0X(C51966G9m.A0W(G9w.A0C(r13, r6, modifier2, ECw)), j);
            AnonymousClass5RD A0M = G9w.A0M(r13);
            int A00 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r13, A0X);
            C51973G9u.A0y(r13, r6);
            C51971G9r.A12(r13, A0M, A04);
            0sL r1 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r1, A00);
            }
            C51965G9l.A18(r13, A01);
            String str = r5.A01;
            String str2 = r5.A02;
            SimpleImageUrl A002 = C336957fS.A00(str, str2);
            long A0J = C51966G9m.A0J(r13);
            Object A0m2 = C51967G9n.A0m(r13, 678783290);
            if (A0m2 == obj) {
                A0m2 = new C73902Pld(r7, 37);
                r13.FLL(A0m2);
            }
            AnonymousClass2DN A02 = 1zC.A02(r13, A002, (C62320sa) null, C51965G9l.A0y(r6, A0m2, false), (C62320sa) null, 3072, 116, A0J, false, false);
            C285245Qk r11 = Modifier.A00;
            AnonymousClass6G3.A0B(r13, C51966G9m.A0U(r11), A02, str2, 384);
            r13.ExS(678787831);
            if (C51971G9r.A1W(r7)) {
                GQD.A01(r13, C287205Zk.A04(r11));
            }
            if (C51971G9r.A1S(r13, r6, false)) {
                0fL.A00(1747250208);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(r8, modifier2, r4, r5, i3, 11);
        }
    }

    public static final void A07(C286575Wy r12, C317486nL r13, List list, 0sP r15, int i) {
        int i2;
        C286575Wy r11 = r12;
        r12.ExV(646012860);
        int i3 = i;
        List list2 = list;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, list) | i;
        } else {
            i2 = i3;
        }
        C317486nL r14 = r13;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r13);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r15);
        }
        if ((i2 & 147) != 146 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1757075010, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiRow (CustomGroupEmojiImagePicker.kt:208)");
            }
            int size = 6 - list2.size();
            C285245Qk r5 = Modifier.A00;
            int i4 = 1;
            Modifier A0T = C51966G9m.A0T(r5);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A03, r12, C287215Zl.A05, 6);
            int A00 = C287425a7.A00(r12);
            C286565Wx r1 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r12, A0T);
            C51973G9u.A0y(r12, r1);
            C51971G9r.A12(r12, A02, A04);
            0sL r7 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r7, A00);
            }
            C51965G9l.A18(r12, A01);
            Iterator A17 = C51968G9o.A17(r12, list2, -800544999);
            while (A17.hasNext()) {
                int i5 = i2 << 3;
                A02(r11, C287205Zk.A0C(r5, 48.0f), (C317486nL) A17.next(), r14, r15, (i5 & 896) | 48 | (i5 & 7168));
            }
            C286565Wx.A0I(r1);
            r11.ExS(-800537983);
            if (1 <= size) {
                while (true) {
                    C289585dr.A00(r11, C287205Zk.A0C(r5, 48.0f));
                    if (i4 == size) {
                        break;
                    }
                    i4++;
                }
            }
            C286565Wx.A0I(r1);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(696419844);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(r14, list2, r15, i3, 37);
        }
    }
}
