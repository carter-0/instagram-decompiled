package X;

import android.graphics.Picture;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedElement;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.I6x  reason: case insensitive filesystem */
public abstract class C56668I6x {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.IoC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: X.IoC} */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0109, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x010b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r19, X.AnonymousClass4DH r20, X.C55952HqG r21, X.C53027GhI r22, X.OJf r23, int r24) {
        /*
            r12 = 0
            r3 = r23
            X.0qQ.A0B(r3, r12)
            r6 = r20
            r5 = r21
            r4 = r22
            X.AnonymousClass7TG.A1U(r4, r6, r5)
            r0 = -177912250(0xfffffffff5654646, float:-2.9063996E32)
            r7 = r19
            r7.ExV(r0)
            r2 = r24
            r0 = r24 & 6
            r15 = 4
            if (r0 != 0) goto L_0x01d2
            boolean r0 = X.G9t.A1T(r7, r3, r2)
            int r13 = X.C51970G9q.A05(r0)
            r13 = r13 | r24
        L_0x0028:
            r0 = r24 & 48
            if (r0 != 0) goto L_0x0031
            int r0 = X.G9t.A0F(r7, r4)
            r13 = r13 | r0
        L_0x0031:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003a
            int r0 = X.G9t.A0G(r7, r6)
            r13 = r13 | r0
        L_0x003a:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0043
            int r0 = X.G9t.A0H(r7, r5)
            r13 = r13 | r0
        L_0x0043:
            r1 = r13 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x0068
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0068
            r7.Evl()
        L_0x0052:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x0067
            r13 = 13
            X.JG7 r0 = new X.JG7
            r7 = r0
            r8 = r4
            r9 = r5
            r10 = r3
            r11 = r6
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.A06 = r0
        L_0x0067:
            return
        L_0x0068:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0076
            r1 = -1472120524(0xffffffffa8413934, float:-1.0726056E-14)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.threaddetail.customization.CustomGroupNameAndImage (DirectCustomGroupNameAndImage.kt:93)"
            X.0fL.A01(r1, r0)
        L_0x0076:
            androidx.compose.ui.Modifier r8 = X.C51968G9o.A0O()
            X.5RD r1 = X.C51968G9o.A0X(r7)
            int r9 = X.C287425a7.A00(r7)
            r11 = r7
            X.5Wx r11 = (X.C286565Wx) r11
            X.5RM r0 = X.C286565Wx.A04(r11)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r7, r8)
            X.C51973G9u.A0y(r7, r11)
            X.C51971G9r.A12(r7, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r11.A0K
            if (r0 != 0) goto L_0x009f
            boolean r0 = X.C51972G9s.A1Q(r7, r9)
            if (r0 != 0) goto L_0x00a2
        L_0x009f:
            X.C51971G9r.A13(r7, r1, r9)
        L_0x00a2:
            X.C51965G9l.A18(r7, r8)
            X.0Ud r0 = r4.A07
            r17 = 1
            X.4gU r16 = X.AnonymousClass6FW.A02(r7, r0, r12)
            java.lang.Object r10 = X.C51966G9m.A16(r7)
            java.lang.Object r0 = r16.getValue()
            X.GnO r0 = (X.C53391GnO) r0
            boolean r8 = r0.A07
            r0 = -303871097(0xffffffffede34b87, float:-8.7930505E27)
            boolean r1 = X.C51967G9n.A1Z(r7, r5, r0)
            r9 = r13 & 14
            if (r9 == r15) goto L_0x00ce
            r0 = r13 & 8
            if (r0 == 0) goto L_0x01cf
            boolean r0 = r7.AGw(r3)
            if (r0 == 0) goto L_0x01cf
        L_0x00ce:
            r0 = 1
        L_0x00cf:
            r1 = r1 | r0
            java.lang.Object r0 = r7.ECw()
            if (r1 != 0) goto L_0x00da
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x00e4
        L_0x00da:
            r1 = 37
            X.Phe r0 = new X.Phe
            r0.<init>(r1, r5, r3)
            r7.FLL(r0)
        L_0x00e4:
            X.0sa r1 = X.C51965G9l.A0y(r11, r0, r12)
            r0 = -303865242(0xffffffffede36266, float:-8.796507E27)
            boolean r0 = X.C51973G9u.A1S(r7, r5, r4, r0)
            boolean r14 = X.C51966G9m.A1U(r7, r10, r0)
            if (r9 == r15) goto L_0x00ff
            r0 = r13 & 8
            if (r0 == 0) goto L_0x01cb
            boolean r0 = r7.AGw(r3)
            if (r0 == 0) goto L_0x01cb
        L_0x00ff:
            r14 = r14 | r17
            java.lang.Object r0 = r7.ECw()
            if (r14 != 0) goto L_0x010b
            java.lang.Object r14 = X.AnonymousClass5XT.A00
            if (r0 != r14) goto L_0x011f
        L_0x010b:
            r18 = 39
            X.IoC r0 = new X.IoC
            r17 = r0
            r19 = r10
            r20 = r4
            r21 = r3
            r22 = r5
            r17.<init>(r18, r19, r20, r21, r22)
            r7.FLL(r0)
        L_0x011f:
            X.0sa r0 = X.C51965G9l.A0y(r11, r0, r12)
            A07(r7, r1, r0, r12, r8)
            java.lang.Object r0 = r16.getValue()
            X.GnO r0 = (X.C53391GnO) r0
            java.lang.Object r14 = r0.A02
            java.io.File r14 = (java.io.File) r14
            java.lang.Object r0 = r16.getValue()
            X.GnO r0 = (X.C53391GnO) r0
            boolean r12 = r0.A08
            java.lang.Object r0 = r16.getValue()
            X.GnO r0 = (X.C53391GnO) r0
            java.lang.Object r8 = r0.A01
            com.instagram.common.typedurl.ImageUrl r8 = (com.instagram.common.typedurl.ImageUrl) r8
            java.lang.Object r0 = r16.getValue()
            X.GnO r0 = (X.C53391GnO) r0
            java.lang.Object r1 = r0.A03
            java.util.List r1 = (java.util.List) r1
            r15 = 458752(0x70000, float:6.42848E-40)
            int r0 = r13 << 6
            r15 = r15 & r0
            r23 = r9 | r15
            r22 = r1
            r24 = r12
            r18 = r8
            r19 = r5
            r20 = r3
            r21 = r14
            r17 = r7
            A03(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r0 = r16.getValue()
            X.GnO r0 = (X.C53391GnO) r0
            java.lang.String r8 = r0.A05
            int r12 = r13 << 3
            r1 = r12 & 112(0x70, float:1.57E-43)
            int r0 = r13 >> 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r0
            A04(r7, r5, r3, r8, r1)
            java.lang.Object r0 = r7.ECw()
            java.lang.Object r14 = X.AnonymousClass5XT.A00
            java.lang.Object r0 = X.C51974G9v.A0Y(r7, r0, r14)
            X.6FV r0 = (X.AnonymousClass6FV) r0
            X.4Cq r13 = r0.A00
            java.lang.Object r0 = r16.getValue()
            X.GnO r0 = (X.C53391GnO) r0
            java.lang.Object r8 = r0.A04
            java.util.List r8 = (java.util.List) r8
            r0 = -303835615(0xffffffffede3d621, float:-8.8139954E27)
            boolean r0 = X.C51973G9u.A1S(r7, r13, r10, r0)
            boolean r1 = X.C51966G9m.A1U(r7, r4, r0)
            java.lang.Object r0 = r7.ECw()
            if (r1 != 0) goto L_0x01a3
            if (r0 != r14) goto L_0x01ad
        L_0x01a3:
            r1 = 10
            X.PqU r0 = new X.PqU
            r0.<init>((int) r1, (java.lang.Object) r13, (java.lang.Object) r10, (java.lang.Object) r4)
            r7.FLL(r0)
        L_0x01ad:
            X.0sP r14 = X.C51965G9l.A0z(r11, r0)
            int r15 = X.C51972G9s.A04(r12, r9)
            r9 = r7
            r10 = r6
            r11 = r5
            r12 = r3
            r13 = r8
            A02(r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = X.C51967G9n.A1R(r7)
            if (r0 == 0) goto L_0x0052
            r0 = 648708372(0x26aa8114, float:1.1831106E-15)
            X.0fL.A00(r0)
            goto L_0x0052
        L_0x01cb:
            r17 = 0
            goto L_0x00ff
        L_0x01cf:
            r0 = 0
            goto L_0x00cf
        L_0x01d2:
            r13 = r2
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56668I6x.A01(X.5Wy, X.4DH, X.HqG, X.GhI, X.OJf, int):void");
    }

    public static final void A03(C286575Wy r25, ImageUrl imageUrl, C55952HqG hqG, OJf oJf, File file, List list, int i, boolean z) {
        int i2;
        ImageUrl imageUrl2;
        boolean z2;
        OJf oJf2 = oJf;
        0qQ.A0B(oJf2, 0);
        C55952HqG hqG2 = hqG;
        DbW.A1N(list, 4, hqG2);
        C286575Wy r1 = r25;
        r1.ExV(1307114443);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r1, oJf2, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        File file2 = file;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r1, file2);
        }
        boolean z3 = z;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0a(r1, z3);
        }
        ImageUrl imageUrl3 = imageUrl;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r1, imageUrl3);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r1, list);
        }
        if ((196608 & i3) == 0) {
            i2 |= G9t.A0J(r1, hqG2);
        }
        if ((74899 & i2) != 74898 || !r1.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-986025622, "com.instagram.direct.fragment.thread.threaddetail.customization.PendingProfilePhoto (DirectCustomGroupNameAndImage.kt:146)");
            }
            0qQ.A0C(C51966G9m.A16(r1), "null cannot be cast to non-null type android.app.Activity");
            0lg A0j = C51969G9p.A0j(r1);
            C285245Qk r10 = Modifier.A00;
            AnonymousClass5ZQ r11 = AnonymousClass5ZN.A00;
            Modifier A0C = C287205Zk.A0C(AnonymousClass6FZ.A01(r10, r11), 96.0f);
            String A00 = C288035bG.A00(r1, 2131963152);
            boolean A1Y = C51967G9n.A1Y(r1, A00, -752397060);
            Object ECw = r1.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0x(r1, A00, 27);
            }
            C286565Wx A0H = C51965G9l.A0H(r1, false);
            Modifier A002 = AnonymousClass5R5.A00(r10, (0sP) ECw, false);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A003 = C287425a7.A00(r1);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r1, A002);
            C51973G9u.A0y(r1, A0H);
            C51971G9r.A12(r1, A0a, A04);
            0sL r3 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r1, A003)) {
                C51971G9r.A13(r1, r3, A003);
            }
            C51965G9l.A18(r1, A01);
            C289515dj r32 = C289515dj.A00;
            if (file != null) {
                imageUrl2 = C253833rU.A01(file2);
            } else {
                imageUrl2 = imageUrl3;
            }
            if (imageUrl2 != null) {
                r1.ExS(197668722);
                AnonymousClass6G3.A03(r1, A0C, 1zC.A00(r1, imageUrl2));
                AnonymousClass2DO A004 = C287975bA.A00(r1, R.drawable.instagram_circle_x_pano_filled_24, 0);
                String A005 = C288035bG.A00(r1, 2131955133);
                Modifier A012 = C304766Fd.A01(C304816Fi.A03(r32.AAz(C287215Zl.A0D, r10), r11, 3.0f, C51966G9m.A0A(r1)), r11, C51966G9m.A0A(r1));
                C287625aV A0R = C51965G9l.A0R(0);
                boolean A1S = C51973G9u.A1S(r1, hqG2, file2, 1807515103);
                if ((i2 & 14) == 4 || ((i2 & 8) != 0 && r1.AGw(oJf2))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = A1S | z2;
                Object ECw2 = r1.ECw();
                if (z4 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C58195Inz(2, oJf2, hqG2, file2);
                    r1.FLL(ECw2);
                }
                C288165bT.A08(r1, C288235ba.A02(r1, A012, A0R, C51965G9l.A0y(A0H, ECw2, false)), A004, A005, C51966G9m.A0G(r1));
            } else if (!z || !182.A06(0Tu.A05, A0j, 36327670908205671L)) {
                r1.ExS(199204369);
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    if (next != null) {
                        A1C.add(next);
                    }
                }
                if (DbT.A1b(A1C)) {
                    A06(r1, A1C, (i2 >> 6) & 14, z3);
                }
            } else {
                r1.ExS(198904196);
                AnonymousClass62P A006 = AnonymousClass62Q.A00(list);
                C286575Wy r18 = r1;
                HXN.A00(r18, C54654HMl.TYPE_0213, HMS.TYPE_012, A006, 112.0f, 0, 28080, 224, 0, false, false);
            }
            if (C51971G9r.A1S(r1, A0H, false)) {
                0fL.A00(-1958344122);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA0(imageUrl3, oJf2, hqG2, file2, list, i3, 4, z3);
        }
    }

    public static final void A04(C286575Wy r26, C55952HqG hqG, OJf oJf, String str, int i) {
        int i2;
        String str2;
        C55952HqG hqG2 = hqG;
        OJf oJf2 = oJf;
        AnonymousClass7TF.A1B(oJf2, 1, hqG2);
        C286575Wy r14 = r26;
        r14.ExV(-1671256732);
        int i3 = i;
        String str3 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, str3) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= C51970G9q.A06(G9t.A1U(r14, oJf2, i3) ? 1 : 0);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r14, hqG2);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1991586881, "com.instagram.direct.fragment.thread.threaddetail.customization.GroupName (DirectCustomGroupNameAndImage.kt:382)");
            }
            Object A0m = C51967G9n.A0m(r14, -265986117);
            Object obj = AnonymousClass5XT.A00;
            C56547I1b i1b = (C56547I1b) C51972G9s.A0k(r14, A0m, obj);
            C286565Wx A0G = C51965G9l.A0G(r14);
            if (str == null) {
                str2 = "";
            } else {
                str2 = str3;
            }
            r14.ExS(-265982604);
            boolean z = true;
            boolean A1S = AnonymousClass7TF.A1S(i2 & 14, 4);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !r14.AGw(oJf2))) {
                z = false;
            }
            boolean z2 = A1S | z;
            Object ECw = r14.ECw();
            if (z2 || ECw == obj) {
                ECw = new C73943PmN(str3, oJf2, 39);
                r14.FLL(ECw);
            }
            0sP r6 = (0sP) ECw;
            C286565Wx.A0I(A0G);
            String A00 = C288035bG.A00(r14, 2131959421);
            Modifier A0U = C51970G9q.A0U(C287195Zj.A0A(Modifier.A00, 0.0f, 16.0f, 0.0f), i1b);
            boolean A1Z = C51967G9n.A1Z(r14, hqG2, -265969079);
            Object ECw2 = r14.ECw();
            if (A1Z || ECw2 == obj) {
                ECw2 = new C73934PmE(hqG2, 21);
                r14.FLL(ECw2);
            }
            C286565Wx.A0I(A0G);
            I7P.A01((C287605aT) null, (I4S) null, (I23) null, r14, A0U.Ezh(new FocusChangedElement((0sP) ECw2)), (C59485JLj) null, (Boolean) null, (Integer) null, (Integer) null, str2, A00, (String) null, (C62320sa) null, r6, 0, 0, 805306368, 0, 65008, true);
            if (0fL.A02()) {
                0fL.A00(782747373);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(hqG2, oJf2, str3, i3, 11);
        }
    }

    public static final void A06(C286575Wy r19, List list, int i, boolean z) {
        int i2;
        ImageUrl imageUrl;
        AnonymousClass2DN r11;
        List list2 = list;
        0qQ.A0B(list2, 1);
        C286575Wy r8 = r19;
        r8.ExV(-1277023244);
        int i3 = i;
        boolean z2 = z;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r8, z2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r8, list2);
        }
        if ((i2 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(530948318, "com.instagram.direct.fragment.thread.threaddetail.customization.MembersFacepile (DirectCustomGroupNameAndImage.kt:195)");
            }
            ImageUrl imageUrl2 = (ImageUrl) list2.get(0);
            if (list2.size() > 1) {
                imageUrl = (ImageUrl) list2.get(1);
            } else {
                imageUrl = null;
            }
            AnonymousClass2DN A00 = 1zC.A00(r8, imageUrl2);
            r8.ExS(-878893680);
            if (imageUrl != null) {
                r11 = 1zC.A00(r8, imageUrl);
            } else {
                r11 = null;
            }
            C51965G9l.A1X(r8, false);
            GSL.A01(r8, (Modifier) null, A00, r11, 100.0f, 0.0f, 0.75f, (1879048192 & (i2 << 27)) | 12582918, 340, C51966G9m.A0A(r8), 0, false, z);
            if (0fL.A02()) {
                0fL.A00(-736956213);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, list2, i3, 11, z2);
        }
    }

    public static final void A07(C286575Wy r21, C62320sa r22, C62320sa r23, int i, boolean z) {
        int i2;
        AnonymousClass5Z4 r4;
        long j;
        boolean z2 = true;
        C62320sa r8 = r22;
        C62320sa r7 = r23;
        AnonymousClass7TF.A1B(r8, 1, r7);
        C286575Wy r15 = r21;
        r15.ExV(-668654654);
        int i3 = i;
        boolean z3 = z;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r15, z3) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r8);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r7);
        }
        if ((i2 & 147) != 146 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1737789035, "com.instagram.direct.fragment.thread.threaddetail.customization.ActionButtonsHeader (DirectCustomGroupNameAndImage.kt:215)");
            }
            C285245Qk r42 = Modifier.A00;
            Modifier A0V = C51966G9m.A0V(C287195Zj.A01(r42));
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A04, r15, C287215Zl.A05, 6);
            int A00 = C287425a7.A00(r15);
            C286565Wx r0 = (C286565Wx) r15;
            AnonymousClass5RM A04 = C286565Wx.A04(r0);
            Modifier A01 = C287435a8.A01(r15, A0V);
            C51973G9u.A0y(r15, r0);
            C51971G9r.A12(r15, A02, A04);
            0sL r11 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r11, A00);
            }
            C51965G9l.A18(r15, A01);
            String A002 = C288035bG.A00(r15, 2131954722);
            boolean A1O = C51973G9u.A1O(r15, -1720623458, i2);
            Object ECw = r15.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = new C73902Pld(r8, 40);
                r15.FLL(ECw);
            }
            AnonymousClass5ZZ.A0G(r15, C287195Zj.A07(C287635aW.A05(r42, (C287625aV) null, (String) null, C51965G9l.A0y(r0, ECw, false), true), 4.0f), C51966G9m.A0g(r15), A002, 5, 3072, 16240, C51966G9m.A0H(r15), AnonymousClass5Z7.A01(17));
            String A003 = C288035bG.A00(r15, 2131960992);
            r15.ExS(-1720613668);
            if ((i2 & 896) != 256) {
                z2 = false;
            }
            Object ECw2 = r15.ECw();
            if (z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C73902Pld(r7, 41);
                r15.FLL(ECw2);
            }
            Modifier A07 = C287195Zj.A07(C287635aW.A05(r42, (C287625aV) null, (String) null, C51965G9l.A0y(r0, ECw2, false), z3), 4.0f);
            long A012 = AnonymousClass5Z7.A01(17);
            if (z3) {
                r4 = C51967G9n.A0b(r15, -1720609574).A07;
            } else {
                r4 = C51967G9n.A0b(r15, -1720608304).A06;
            }
            C286565Wx.A0L(r0, false);
            if (z3) {
                j = C51967G9n.A0a(r15, -1720605992).A0l;
            } else {
                j = C51967G9n.A0a(r15, -1720604904).A0t;
            }
            C286565Wx.A0L(r0, false);
            AnonymousClass5ZZ.A0G(r15, A07, r4, A003, 6, 3072, 16240, j, A012);
            if (C51967G9n.A1R(r15)) {
                0fL.A00(533700712);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 13, r7, r8, z3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: X.Iod} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: X.Iod} */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e2, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x00e4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r28, X.AnonymousClass4DH r29, X.C55952HqG r30, X.HAD r31, com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem r32, X.OJf r33, int r34) {
        /*
            r0 = 1319947604(0x4eaccd54, float:1.44956877E9)
            r6 = r28
            r6.ExV(r0)
            r3 = r34
            r0 = r34 & 6
            r4 = r33
            if (r0 != 0) goto L_0x015c
            boolean r0 = X.G9t.A1T(r6, r4, r3)
            int r12 = X.C51970G9q.A05(r0)
            r12 = r12 | r34
        L_0x001a:
            r0 = r34 & 48
            r7 = 32
            r5 = r31
            if (r0 != 0) goto L_0x0027
            int r0 = X.G9t.A0P(r6, r5)
            r12 = r12 | r0
        L_0x0027:
            r0 = r3 & 384(0x180, float:5.38E-43)
            r23 = r29
            if (r0 != 0) goto L_0x0034
            r0 = r23
            int r0 = X.G9t.A0G(r6, r0)
            r12 = r12 | r0
        L_0x0034:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            r15 = r32
            if (r0 != 0) goto L_0x003f
            int r0 = X.G9t.A0H(r6, r15)
            r12 = r12 | r0
        L_0x003f:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            r19 = r30
            if (r0 != 0) goto L_0x004c
            r0 = r19
            int r0 = X.G9t.A0I(r6, r0)
            r12 = r12 | r0
        L_0x004c:
            r1 = r12 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x0073
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x0073
            r6.Evl()
        L_0x005b:
            X.5Xd r1 = r6.ASQ()
            if (r1 == 0) goto L_0x0072
            r8 = 4
            X.J9H r0 = new X.J9H
            r6 = r0
            r7 = r3
            r9 = r15
            r10 = r4
            r11 = r23
            r12 = r5
            r13 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r1.A06 = r0
        L_0x0072:
            return
        L_0x0073:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0081
            r1 = -1383366477(0xffffffffad8b80b3, float:-1.5859624E-11)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.threaddetail.customization.ButtonItem (DirectCustomGroupNameAndImage.kt:279)"
            X.0fL.A01(r1, r0)
        L_0x0081:
            java.lang.Object r11 = X.C51966G9m.A16(r6)
            java.lang.Object r10 = X.C51965G9l.A0r(r6)
            X.4bM r0 = X.AnonymousClass5YA.A0A
            java.lang.Object r9 = r6.AJO(r0)
            X.4bM r0 = X.AnonymousClass5YA.A02
            java.lang.Object r8 = r6.AJO(r0)
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
            r0 = 1116471296(0x428c0000, float:70.0)
            androidx.compose.ui.Modifier r13 = X.C51971G9r.A0Q(r1, r0)
            r2 = 0
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r6)
            long r0 = r0.A0C
            r27 = 0
            androidx.compose.ui.Modifier r13 = X.C51966G9m.A0X(r13, r0)
            r0 = -381288353(0xffffffffe946005f, float:-1.4960567E25)
            r6.ExS(r0)
            r0 = r12 & 112(0x70, float:1.57E-43)
            r14 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r7)
            r0 = r19
            boolean r0 = r6.AGw(r0)
            boolean r7 = X.C51973G9u.A1T(r6, r10, r15, r1, r0)
            r1 = r12 & 14
            r0 = 4
            if (r1 == r0) goto L_0x00d0
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0159
            boolean r0 = r6.AGw(r4)
            if (r0 == 0) goto L_0x0159
        L_0x00d0:
            r0 = r23
            boolean r0 = X.C51973G9u.A1T(r6, r11, r0, r7, r14)
            boolean r1 = X.C51972G9s.A1W(r6, r8, r9, r0)
            java.lang.Object r0 = r6.ECw()
            if (r1 != 0) goto L_0x00e4
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x00fe
        L_0x00e4:
            r26 = 1
            X.Iod r0 = new X.Iod
            r24 = r11
            r25 = r5
            r20 = r10
            r21 = r9
            r22 = r15
            r17 = r4
            r18 = r8
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6.FLL(r0)
        L_0x00fe:
            X.0sa r0 = (X.C62320sa) r0
            X.5Wx r9 = X.C51965G9l.A0H(r6, r2)
            androidx.compose.ui.Modifier r7 = X.C287635aW.A06(r13, r0)
            X.5RD r1 = X.G9w.A0M(r6)
            int r8 = X.C287425a7.A00(r6)
            X.5RM r0 = X.C286565Wx.A04(r9)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r6, r7)
            X.C51973G9u.A0y(r6, r9)
            X.C51971G9r.A12(r6, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r9.A0K
            if (r0 != 0) goto L_0x012a
            boolean r0 = X.C51972G9s.A1Q(r6, r8)
            if (r0 != 0) goto L_0x012d
        L_0x012a:
            X.C51971G9r.A13(r6, r1, r8)
        L_0x012d:
            X.C51965G9l.A18(r6, r7)
            int r0 = r5.A01
            X.2DO r28 = X.C287975bA.A00(r6, r0, r2)
            int r0 = r5.A00
            java.lang.String r30 = X.C288035bG.A00(r6, r0)
            long r33 = X.C51966G9m.A0G(r6)
            r32 = 20
            r26 = r6
            r29 = r27
            r31 = r2
            X.C288165bT.A06(r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r0 = X.C51967G9n.A1R(r6)
            if (r0 == 0) goto L_0x005b
            r0 = 1832252015(0x6d35f26f, float:3.519367E27)
            X.0fL.A00(r0)
            goto L_0x005b
        L_0x0159:
            r14 = 0
            goto L_0x00d0
        L_0x015c:
            r12 = r3
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56668I6x.A00(X.5Wy, X.4DH, X.HqG, X.HAD, com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem, X.OJf, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.Ixk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: X.Ixk} */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        if (r0 == r5) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        r21 = new X.C58799Ixk(10, r13, r6, r29, r8, r14, r15);
        r9.FLL(r21);
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
        X.C286565Wx.A0L(r3, false);
        X.HQz.A00((X.AnonymousClass6HS) null, r17, r18, r2, r20, (androidx.compose.foundation.lazy.grid.LazyGridState) null, r9, (androidx.compose.ui.Modifier) null, (X.0sP) r0, 1772544, 406, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010f, code lost:
        if (X.0fL.A02() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0111, code lost:
        X.0fL.A00(952658034);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r23, X.AnonymousClass4DH r24, X.C55952HqG r25, X.OJf r26, java.util.List r27, X.0sP r28, int r29) {
        /*
            r0 = -1631854783(0xffffffff9ebbdf41, float:-1.989173E-20)
            r9 = r23
            r9.ExV(r0)
            r7 = r29
            r0 = r29 & 6
            r12 = 4
            r13 = r26
            if (r0 != 0) goto L_0x011b
            boolean r0 = X.G9t.A1T(r9, r13, r7)
            int r11 = X.C51970G9q.A05(r0)
            r11 = r11 | r29
        L_0x001b:
            r0 = r29 & 48
            r8 = r27
            if (r0 != 0) goto L_0x0026
            int r0 = X.G9t.A0F(r9, r8)
            r11 = r11 | r0
        L_0x0026:
            r0 = r7 & 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            r29 = r28
            if (r0 != 0) goto L_0x0035
            r0 = r29
            int r0 = X.G9t.A0G(r9, r0)
            r11 = r11 | r0
        L_0x0035:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            r15 = r24
            if (r0 != 0) goto L_0x0040
            int r0 = X.G9t.A0H(r9, r15)
            r11 = r11 | r0
        L_0x0040:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            r14 = r25
            if (r0 != 0) goto L_0x004b
            int r0 = X.G9t.A0I(r9, r14)
            r11 = r11 | r0
        L_0x004b:
            r1 = r11 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x0071
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x0071
            r9.Evl()
        L_0x005a:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x0070
            r4 = 5
            X.J9H r0 = new X.J9H
            r2 = r0
            r3 = r7
            r5 = r8
            r6 = r13
            r7 = r15
            r8 = r29
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.A06 = r0
        L_0x0070:
            return
        L_0x0071:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007f
            r1 = 295699693(0x11a004ed, float:2.5246585E-28)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.threaddetail.customization.GridOfOptions (DirectCustomGroupNameAndImage.kt:248)"
            X.0fL.A01(r1, r0)
        L_0x007f:
            r0 = 2089725302(0x7c8ead76, float:5.926595E36)
            java.lang.Object r6 = X.C51967G9n.A0m(r9, r0)
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            r4 = 0
            if (r6 != r5) goto L_0x008f
            androidx.compose.runtime.ParcelableSnapshotMutableState r6 = X.G9t.A0o(r9, r4)
        L_0x008f:
            X.5Wx r3 = X.C51965G9l.A0G(r9)
            X.IF3 r20 = new X.IF3
            r20.<init>()
            r1 = 1098907648(0x41800000, float:16.0)
            r0 = 1090519040(0x41000000, float:8.0)
            X.6Fj r2 = new X.6Fj
            r2.<init>(r1, r0, r1, r0)
            r0 = 1096810496(0x41600000, float:14.0)
            X.6Fc r18 = X.C287275Zs.A01(r0)
            X.5a0 r17 = X.C287275Zs.A05
            r0 = 2089735788(0x7c8ed66c, float:5.933241E36)
            boolean r1 = X.C51967G9n.A1Z(r9, r8, r0)
            r0 = r11 & 14
            r16 = 0
            if (r0 == r12) goto L_0x00c0
            r0 = r11 & 8
            if (r0 == 0) goto L_0x0119
            boolean r0 = r9.AGw(r13)
            if (r0 == 0) goto L_0x0119
        L_0x00c0:
            r0 = 1
        L_0x00c1:
            boolean r1 = X.C51973G9u.A1T(r9, r15, r14, r1, r0)
            r0 = r11 & 896(0x380, float:1.256E-42)
            if (r0 != r10) goto L_0x00cb
            r16 = 1
        L_0x00cb:
            r1 = r1 | r16
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x00d5
            if (r0 != r5) goto L_0x00ed
        L_0x00d5:
            r22 = 10
            X.Ixk r0 = new X.Ixk
            r21 = r0
            r23 = r13
            r24 = r6
            r25 = r29
            r26 = r8
            r27 = r14
            r28 = r15
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r9.FLL(r0)
        L_0x00ed:
            X.0sP r0 = (X.0sP) r0
            r1 = 0
            X.C286565Wx.A0L(r3, r1)
            r26 = 406(0x196, float:5.69E-43)
            r25 = 1772544(0x1b0c00, float:2.483863E-39)
            r21 = r4
            r23 = r4
            r24 = r0
            r27 = r1
            r28 = r1
            r19 = r2
            r22 = r9
            r16 = r4
            X.HQz.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x005a
            r0 = 952658034(0x38c86872, float:9.5561976E-5)
            X.0fL.A00(r0)
            goto L_0x005a
        L_0x0119:
            r0 = 0
            goto L_0x00c1
        L_0x011b:
            r11 = r7
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56668I6x.A02(X.5Wy, X.4DH, X.HqG, X.OJf, java.util.List, X.0sP, int):void");
    }

    public static final void A05(C286575Wy r17, ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem, 0sP r19, int i) {
        int i2;
        C286575Wy r13 = r17;
        r13.ExV(1689394619);
        int i3 = i;
        ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem2 = threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem2) | i;
        } else {
            i2 = i3;
        }
        0sP r5 = r19;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r5);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1369112341, "com.instagram.direct.fragment.thread.threaddetail.customization.EmojiItem (DirectCustomGroupNameAndImage.kt:333)");
            }
            Object A0m = C51967G9n.A0m(r13, 275990211);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = new Picture();
                r13.FLL(A0m);
            }
            C286565Wx r9 = (C286565Wx) r13;
            C286565Wx.A0L(r9, false);
            Modifier A0C = C287205Zk.A0C(C51966G9m.A0W(Modifier.A00), 70.0f);
            boolean A1Z = C51967G9n.A1Z(r13, A0m, 276003966);
            Object ECw = r13.ECw();
            if (A1Z || ECw == obj) {
                ECw = new C73934PmE(A0m, 19);
                r13.FLL(ECw);
            }
            Modifier A00 = C304766Fd.A00(C51975G9x.A0H(r9, A0C, ECw), C304796Fg.A00(threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem2.A01, 0, 9187343241974906880L), AnonymousClass5S0.A00);
            boolean A1U = C51966G9m.A1U(r13, A0m, C51973G9u.A1O(r13, 276025132, i2));
            Object ECw2 = r13.ECw();
            if (A1U || ECw2 == obj) {
                ECw2 = new C73665Phe(38, r5, A0m);
                r13.FLL(ECw2);
            }
            Modifier A0C2 = G9w.A0C(r13, r9, A00, ECw2);
            AnonymousClass5RD A0M = G9w.A0M(r13);
            int A002 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r13, A0C2);
            C51973G9u.A0y(r13, r9);
            C51971G9r.A12(r13, A0M, A04);
            0sL r3 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r13, A002)) {
                C51971G9r.A13(r13, r3, A002);
            }
            C51965G9l.A18(r13, A01);
            AnonymousClass5ZZ.A0p(r13, C51966G9m.A0g(r13), threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem2.A00, 16374, 0, AnonymousClass5Z7.A01(30));
            if (C51967G9n.A1R(r13)) {
                0fL.A00(-1211457349);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r5, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem2, i3, 7);
        }
    }
}
