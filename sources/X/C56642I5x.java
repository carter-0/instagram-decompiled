package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;

/* renamed from: X.I5x  reason: case insensitive filesystem */
public abstract class C56642I5x {
    public static final void A00(C286575Wy r37, ImmutableList immutableList, HM6 hm6, C55528HjA hjA, String str, String str2, C62320sa r43, C62320sa r44, C62320sa r45, C62320sa r46, C62320sa r47, C62320sa r48, 0sP r49, int i, int i2, boolean z) {
        int i3;
        int i4;
        C62320sa r12 = r43;
        C62320sa r9 = r44;
        AnonymousClass7TF.A1H(r12, r9);
        0sP r4 = r49;
        C62320sa r5 = r48;
        C62320sa r6 = r47;
        C62320sa r8 = r45;
        C62320sa r7 = r46;
        C51974G9v.A1S(r8, r7, r6, r5, r4);
        ImmutableList immutableList2 = immutableList;
        C55528HjA hjA2 = hjA;
        DbW.A1P(immutableList2, 10, hjA2);
        C286575Wy r10 = r37;
        r10.ExV(1009942569);
        int i5 = i;
        int i6 = 2;
        if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r10, r12) | i;
        } else {
            i3 = i5;
        }
        int i7 = 32;
        if ((i & 48) == 0) {
            i3 |= G9t.A0F(r10, r9);
        }
        int i8 = 256;
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r10, r8);
        }
        if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r10, r7);
        }
        if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r10, r6);
        }
        if ((196608 & i) == 0) {
            i3 |= G9t.A0J(r10, r5);
        }
        if ((1572864 & i) == 0) {
            i3 |= G9t.A0K(r10, r4);
        }
        String str3 = str;
        if ((12582912 & i) == 0) {
            i3 |= G9t.A0V(r10, str3);
        }
        String str4 = str2;
        if ((i & 100663296) == 0) {
            i3 |= G9t.A0W(r10, str4);
        }
        HM6 hm62 = hm6;
        if ((i & 805306368) == 0) {
            i3 |= G9t.A0X(r10, hm62);
        }
        int i9 = i2;
        if ((i2 & 6) == 0) {
            if (r10.AGu(immutableList2)) {
                i6 = 4;
            }
            i4 = i6 | i2;
        } else {
            i4 = i9;
        }
        boolean z2 = z;
        if ((i2 & 48) == 0) {
            if (!r10.AGv(z2)) {
                i7 = 16;
            }
            i4 |= i7;
        }
        if ((i9 & 384) == 0) {
            if (!r10.AGu(hjA2)) {
                i8 = 128;
            }
            i4 |= i8;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 147) == 146 && r10.Bwn()) {
            r10.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(1574948175, "com.instagram.schools.management.ui.SchoolOnboardingStudentEmailContent (SchoolOnboardingStudentEmailContent.kt:57)");
            }
            C286575Wy r27 = r10;
            ImmutableList immutableList3 = immutableList2;
            C62320sa r30 = r12;
            C62320sa r32 = r7;
            C62320sa r33 = r6;
            I58.A03(r27, immutableList3, HMD.STUDENT_EMAIL, r30, C58493Iso.A00, r32, r33, AnonymousClass5PI.A01(r10, new JHV(hm62, hjA2, str3, str4, r12, r9, r8, r5, r4, z2), 844824292), C51969G9p.A04(i3 >> 3, 1597488 | (i3 & 14)) | (458752 & (i4 << 15)), 0);
            if (0fL.A02()) {
                0fL.A00(-1756150372);
            }
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            boolean z3 = z2;
            HM6 hm63 = hm62;
            C55528HjA hjA3 = hjA2;
            String str5 = str3;
            String str6 = str4;
            C62320sa r19 = r12;
            ASQ.A06 = new C59266JCs(immutableList2, hm63, hjA3, str5, str6, r19, r9, r8, r7, r6, r5, r4, i5, i9, z3);
        }
    }

    public static final void A01(C286575Wy r16, HM6 hm6, C55528HjA hjA, String str, String str2, C62320sa r21, C62320sa r22, C62320sa r23, C62320sa r24, 0sP r25, int i, boolean z) {
        int i2;
        C286575Wy r11 = r16;
        r11.ExV(-896911834);
        int i3 = i;
        C62320sa r7 = r21;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, r7) | i;
        } else {
            i2 = i3;
        }
        C62320sa r6 = r22;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r6);
        }
        0sP r3 = r25;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r11, r3);
        }
        C62320sa r5 = r23;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r11, r5);
        }
        C62320sa r4 = r24;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r11, r4);
        }
        String str3 = str;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0T(r11, str3);
        }
        String str4 = str2;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0U(r11, str4);
        }
        HM6 hm62 = hm6;
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0V(r11, hm62);
        }
        boolean z2 = z;
        if ((100663296 & i) == 0) {
            i2 |= G9t.A0g(r11, z2);
        }
        C55528HjA hjA2 = hjA;
        if ((805306368 & i) == 0) {
            i2 |= G9t.A0X(r11, hjA2);
        }
        if ((306783379 & i2) != 306783378 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1311807252, "com.instagram.schools.management.ui.StudentEmailContent (SchoolOnboardingStudentEmailContent.kt:94)");
            }
            Modifier A02 = I28.A02(r11, C51969G9p.A0U());
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r11, 0);
            int A00 = C287425a7.A00(r11);
            C286565Wx r15 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r15);
            Modifier A01 = C287435a8.A01(r11, A02);
            C51973G9u.A0y(r11, r15);
            C51971G9r.A12(r11, A0Z, A04);
            0sL r12 = C287485aD.A02;
            if (r15.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r12, A00);
            }
            C51965G9l.A18(r11, A01);
            A03(r11, hjA2, str3, r4, C51965G9l.A02(i2 >> 12) | ((i2 >> 21) & 896));
            int i4 = i2 >> 9;
            A04(r5, r11, i4 & 14);
            A02(r11, hm62, str4, r7, r6, r3, C51973G9u.A03(C51971G9r.A04(i2), i4 & 7168, i4), z2);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(1697997586);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            C62320sa r18 = r5;
            C62320sa r19 = r4;
            C62320sa r162 = r7;
            C62320sa r17 = r6;
            String str5 = str3;
            String str6 = str4;
            HM6 hm63 = hm62;
            C55528HjA hjA3 = hjA2;
            ASQ.A06 = new C59226JBe(hm63, hjA3, str5, str6, r162, r17, r18, r19, r3, i3, z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: X.MH5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.MH5} */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e8, code lost:
        if (r0 != r6) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ea, code lost:
        r19 = new X.MH5(r2, r39, r40, (X.AnonymousClass4D7) null, 43);
        r4.FLL(r19);
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fe, code lost:
        X.C51968G9o.A1E(r4, r8, r0, r2);
        r7 = X.C288035bG.A00(r4, 2131968801);
        X.AnonymousClass5ZZ.A0W(r4, X.C287195Zj.A09(r5, 24.0f, 8.0f), X.C51966G9m.A0b(r4), r7, X.C51966G9m.A0M(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021b, code lost:
        if (X.C51967G9n.A1R(r4) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021d, code lost:
        X.0fL.A00(-735807899);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r41, X.HM6 r42, java.lang.String r43, X.C62320sa r44, X.C62320sa r45, X.0sP r46, int r47, boolean r48) {
        /*
            r0 = 1943363941(0x73d56165, float:3.3811482E31)
            r4 = r41
            r4.ExV(r0)
            r3 = r47
            r0 = r47 & 6
            r2 = 4
            r16 = 2
            r41 = r44
            if (r0 != 0) goto L_0x0231
            r0 = r41
            int r10 = X.C41848B3p.A01(r4, r0)
            r10 = r10 | r47
        L_0x001b:
            r0 = r47 & 48
            r40 = r45
            if (r0 != 0) goto L_0x0028
            r0 = r40
            int r0 = X.G9t.A0F(r4, r0)
            r10 = r10 | r0
        L_0x0028:
            r0 = r3 & 384(0x180, float:5.38E-43)
            r32 = r46
            if (r0 != 0) goto L_0x0035
            r0 = r32
            int r0 = X.G9t.A0G(r4, r0)
            r10 = r10 | r0
        L_0x0035:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            r17 = r43
            if (r0 != 0) goto L_0x0042
            r0 = r17
            int r0 = X.G9t.A0R(r4, r0)
            r10 = r10 | r0
        L_0x0042:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            r18 = r42
            if (r0 != 0) goto L_0x004f
            r0 = r18
            int r0 = X.G9t.A0S(r4, r0)
            r10 = r10 | r0
        L_0x004f:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r47
            r15 = r48
            if (r0 != 0) goto L_0x005c
            int r0 = X.G9t.A0d(r4, r15)
            r10 = r10 | r0
        L_0x005c:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r10
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x008b
            boolean r0 = r4.Bwn()
            if (r0 == 0) goto L_0x008b
            r4.Evl()
        L_0x006e:
            X.5Xd r1 = r4.ASQ()
            if (r1 == 0) goto L_0x008a
            X.JA9 r0 = new X.JA9
            r4 = r0
            r5 = r18
            r6 = r40
            r7 = r32
            r8 = r41
            r9 = r17
            r10 = r3
            r11 = r16
            r12 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.A06 = r0
        L_0x008a:
            return
        L_0x008b:
            boolean r0 = X.0fL.A02()
            r5 = -1
            if (r0 == 0) goto L_0x009a
            r1 = -645747195(0xffffffffd982ae05, float:-4.5978854E15)
            java.lang.String r0 = "com.instagram.schools.management.ui.EmailEntryUnit (SchoolOnboardingStudentEmailContent.kt:176)"
            X.0fL.A01(r1, r0)
        L_0x009a:
            if (r42 != 0) goto L_0x00b9
            r1 = -1
        L_0x009d:
            r9 = 0
            if (r1 == r5) goto L_0x00dc
            if (r1 == r9) goto L_0x00d2
            r0 = r16
            if (r1 == r0) goto L_0x00c8
            r0 = 3
            if (r1 == r0) goto L_0x00be
            if (r1 == r2) goto L_0x00e6
            r2 = 1
            r0 = -1544518471(0xffffffffa3f084b9, float:-2.6077062E-17)
            if (r1 == r2) goto L_0x00df
            r0 = -1544535193(0xffffffffa3f04367, float:-2.6049398E-17)
            X.Wub r0 = X.C51973G9u.A0n(r4, r0)
            throw r0
        L_0x00b9:
            int r1 = r18.ordinal()
            goto L_0x009d
        L_0x00be:
            r0 = -1544525133(0xffffffffa3f06ab3, float:-2.6066041E-17)
            r4.ExS(r0)
            r0 = 2131972721(0x7f135271, float:1.9582458E38)
            goto L_0x00ef
        L_0x00c8:
            r0 = -1544529320(0xffffffffa3f05a58, float:-2.6059114E-17)
            r4.ExS(r0)
            r0 = 2131964469(0x7f133235, float:1.956572E38)
            goto L_0x00ef
        L_0x00d2:
            r0 = -1544533069(0xffffffffa3f04bb3, float:-2.6052912E-17)
            r4.ExS(r0)
            r0 = 2131961730(0x7f132782, float:1.9560165E38)
            goto L_0x00ef
        L_0x00dc:
            r0 = -1544517159(0xffffffffa3f089d9, float:-2.6079233E-17)
        L_0x00df:
            X.5Wx r8 = X.C51970G9q.A0R(r4, r0)
            X.IPY r7 = X.IPY.A00
            goto L_0x00fc
        L_0x00e6:
            r0 = -1544521226(0xffffffffa3f079f6, float:-2.6072505E-17)
            r4.ExS(r0)
            r0 = 2131961577(0x7f1326e9, float:1.9559855E38)
        L_0x00ef:
            java.lang.String r0 = X.C288035bG.A00(r4, r0)
            X.Gpg r7 = new X.Gpg
            r7.<init>(r0)
            X.5Wx r8 = X.C51965G9l.A0H(r4, r9)
        L_0x00fc:
            X.JLj r7 = (X.C59485JLj) r7
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            X.5RD r1 = X.C51969G9p.A0Z(r4, r9)
            int r6 = X.C287425a7.A00(r4)
            X.5RM r0 = X.C286565Wx.A04(r8)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r4, r5)
            X.C51973G9u.A0y(r4, r8)
            X.C51971G9r.A12(r4, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r8.A0K
            if (r0 != 0) goto L_0x0122
            boolean r0 = X.C51972G9s.A1Q(r4, r6)
            if (r0 != 0) goto L_0x0125
        L_0x0122:
            X.C51971G9r.A13(r4, r1, r6)
        L_0x0125:
            X.C51965G9l.A18(r4, r2)
            r0 = 2131968799(0x7f13431f, float:1.9574503E38)
            java.lang.String r2 = X.C288035bG.A00(r4, r0)
            X.5Z4 r1 = X.C51965G9l.A0S(r4)
            r11 = 0
            r14 = 1103101952(0x41c00000, float:24.0)
            androidx.compose.ui.Modifier r0 = X.C51967G9n.A0G(r5, r14)
            X.AnonymousClass5ZZ.A05(r4, r0, r1, r2)
            r0 = 735057063(0x2bd014a7, float:1.4785021E-12)
            java.lang.Object r0 = X.C51967G9n.A0m(r4, r0)
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            java.lang.Object r2 = X.C51972G9s.A0l(r4, r0, r6)
            X.5aT r2 = (X.C287605aT) r2
            X.C286565Wx.A0L(r8, r9)
            java.lang.Object r0 = r4.ECw()
            java.lang.Object r0 = X.C51974G9v.A0Y(r4, r0, r6)
            X.6FV r0 = (X.AnonymousClass6FV) r0
            X.4Cq r0 = r0.A00
            r39 = r0
            if (r43 != 0) goto L_0x022d
            java.lang.String r28 = ""
        L_0x0161:
            r0 = 2131961566(0x7f1326de, float:1.9559833E38)
            java.lang.String r29 = X.C288035bG.A00(r4, r0)
            if (r48 == 0) goto L_0x0229
            X.I23 r0 = X.I23.A04
            r13 = 6
            r12 = -1
            java.lang.Boolean r0 = r0.A03
            X.I23 r1 = new X.I23
            r1.<init>(r0, r12, r13, r13)
        L_0x0175:
            r0 = 735076119(0x2bd05f17, float:1.4805682E-12)
            r4.ExS(r0)
            if (r48 == 0) goto L_0x0225
            r0 = 735079036(0x2bd06a7c, float:1.4808844E-12)
            boolean r0 = X.C51973G9u.A1N(r4, r0, r10)
            java.lang.Object r13 = r4.ECw()
            if (r0 != 0) goto L_0x018c
            if (r13 != r6) goto L_0x0198
        L_0x018c:
            r12 = 37
            X.PqM r13 = new X.PqM
            r0 = r41
            r13.<init>(r0, r12)
            r4.FLL(r13)
        L_0x0198:
            X.0sP r12 = X.C51965G9l.A0z(r8, r13)
            X.I4S r0 = new X.I4S
            r0.<init>(r11, r12, r11)
        L_0x01a1:
            X.C286565Wx.A0L(r8, r9)
            r12 = 1090519040(0x41000000, float:8.0)
            androidx.compose.ui.Modifier r23 = X.C51967G9n.A0G(r5, r12)
            int r13 = r10 >> 3
            r13 = r13 & 112(0x70, float:1.57E-43)
            r13 = r13 | 3072(0xc00, float:4.305E-42)
            r36 = 6
            r37 = 64096(0xfa60, float:8.9818E-41)
            r26 = r11
            r27 = r11
            r30 = r11
            r31 = r11
            r33 = r9
            r34 = r9
            r35 = r13
            r38 = r9
            r19 = r2
            r20 = r0
            r21 = r1
            r22 = r4
            r24 = r7
            r25 = r11
            X.I7P.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1 = 735088825(0x2bd090b9, float:1.4819458E-12)
            r0 = r39
            boolean r1 = X.C51967G9n.A1Z(r4, r0, r1)
            boolean r0 = X.C51973G9u.A1H(r10)
            r1 = r1 | r0
            java.lang.Object r0 = r4.ECw()
            if (r1 != 0) goto L_0x01ea
            if (r0 != r6) goto L_0x01fe
        L_0x01ea:
            r24 = 43
            X.MH5 r0 = new X.MH5
            r19 = r0
            r20 = r2
            r21 = r39
            r22 = r40
            r23 = r11
            r19.<init>(r20, r21, r22, r23, r24)
            r4.FLL(r0)
        L_0x01fe:
            X.C51968G9o.A1E(r4, r8, r0, r2)
            r0 = 2131968801(0x7f134321, float:1.9574507E38)
            java.lang.String r7 = X.C288035bG.A00(r4, r0)
            X.5Z4 r6 = X.C51966G9m.A0b(r4)
            long r8 = X.C51966G9m.A0M(r4)
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A09(r5, r14, r12)
            X.AnonymousClass5ZZ.A0W(r4, r5, r6, r7, r8)
            boolean r0 = X.C51967G9n.A1R(r4)
            if (r0 == 0) goto L_0x006e
            r0 = -735807899(0xffffffffd4247665, float:-2.82544387E12)
            X.0fL.A00(r0)
            goto L_0x006e
        L_0x0225:
            X.I4S r0 = X.I4S.A03
            goto L_0x01a1
        L_0x0229:
            X.I23 r1 = X.I23.A04
            goto L_0x0175
        L_0x022d:
            r28 = r17
            goto L_0x0161
        L_0x0231:
            r10 = r3
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56642I5x.A02(X.5Wy, X.HM6, java.lang.String, X.0sa, X.0sa, X.0sP, int, boolean):void");
    }

    public static final void A03(C286575Wy r14, C55528HjA hjA, String str, C62320sa r17, int i) {
        int i2;
        String str2;
        C286575Wy r13 = r14;
        r14.ExV(424860065);
        int i3 = i;
        C62320sa r3 = r17;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r3) | i;
        } else {
            i2 = i3;
        }
        String str3 = str;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r14, str3);
        }
        C55528HjA hjA2 = hjA;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r14, hjA);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-97501208, "com.instagram.schools.management.ui.ChangeSchoolDialog (SchoolOnboardingStudentEmailContent.kt:114)");
            }
            if (C51971G9r.A1W(hjA.A00)) {
                String A00 = C288035bG.A00(r14, 2131956706);
                Integer num = AnonymousClass05K.A01;
                r14.ExS(1423110534);
                int i4 = i2 & 896;
                boolean A1S = AnonymousClass7TF.A1S(i2 & 14, 4) | AnonymousClass7TF.A1S(i4, 256);
                Object ECw = r14.ECw();
                if (A1S || ECw == AnonymousClass5XT.A00) {
                    ECw = C58691Iw0.A00(r14, r3, hjA, 23);
                }
                C286565Wx A0H = C51965G9l.A0H(r14, false);
                C53398GnV gnV = new C53398GnV(num, A00, (C62320sa) ECw, 12);
                String A002 = C288035bG.A00(r13, 2131968513);
                Integer num2 = AnonymousClass05K.A00;
                boolean A1R = C51972G9s.A1R(r13, 1423118956, i4, 256);
                Object ECw2 = r13.ECw();
                if (A1R || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = C58681Ivq.A00(r13, hjA, 23);
                }
                C53398GnV gnV2 = new C53398GnV(num2, A002, C51965G9l.A0y(A0H, ECw2, false), 12);
                boolean A1R2 = C51972G9s.A1R(r13, 1423121548, i4, 256);
                Object ECw3 = r13.ECw();
                if (A1R2 || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = C58681Ivq.A00(r13, hjA2, 22);
                }
                C62320sa A0y = C51965G9l.A0y(A0H, ECw3, false);
                String A003 = C288035bG.A00(r13, 2131974868);
                if (str3 == null) {
                    str2 = "";
                } else {
                    str2 = str3;
                }
                C56632I5m.A02(r13, gnV, gnV2, A003, C51968G9o.A14(r13, str2, 2131974867), A0y);
            }
            if (0fL.A02()) {
                0fL.A00(1777872566);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(hjA2, r3, str3, i3, 14);
        }
    }

    public static final void A04(C62320sa r24, C286575Wy r25, int i) {
        int i2;
        C286575Wy r10 = r25;
        r10.ExV(1548269537);
        int i3 = i;
        C62320sa r3 = r24;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r3) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-884791676, "com.instagram.schools.management.ui.StudentEmailHeadline (SchoolOnboardingStudentEmailContent.kt:145)");
            }
            String A00 = C288035bG.A00(r10, 2131964884);
            String A14 = C51968G9o.A14(r10, A00, 2131968798);
            long A0D = C51966G9m.A0D(r10);
            Object A0m = C51967G9n.A0m(r10, 1345781328);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = I58.A00((AnonymousClass5ZD) null, A00, A14, A0D);
                r10.FLL(A0m);
            }
            C286025Tq r15 = (C286025Tq) A0m;
            C286565Wx r6 = (C286565Wx) r10;
            C286565Wx.A0L(r6, false);
            String A002 = C288035bG.A00(r10, 2131968800);
            C53512Gpi gpi = new C53512Gpi(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_confirm_student_status, 96.0f);
            r10.ExS(1345798452);
            boolean A1R = C51968G9o.A1R(i2);
            Object ECw = r10.ECw();
            if (A1R || ECw == obj) {
                ECw = new C74180PqM(r3, 38);
                r10.FLL(ECw);
            }
            I7M.A01(r10, (Modifier) null, gpi, (HL5) null, (HL6) null, r15, (CharSequence) null, A002, (String) null, (C62320sa) null, C51965G9l.A0z(r6, ECw), (0sP) null, 24576, 0, 4006, 0);
            if (0fL.A02()) {
                0fL.A00(-532375513);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r3, i3, 46);
        }
    }
}
