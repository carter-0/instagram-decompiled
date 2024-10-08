package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OdH  reason: case insensitive filesystem */
public final class C71123OdH {
    public C47167Dri A00;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008e, code lost:
        r2 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C71123OdH(com.instagram.common.session.UserSession r51, X.N4P r52) {
        /*
            r50 = this;
            r0 = 1
            r2 = r51
            X.0qQ.A0B(r2, r0)
            r49 = r50
            r49.<init>()
            r0 = r52
            X.3t3 r1 = r0.A0L
            r23 = r1
            java.lang.String r1 = r0.A0Q
            r21 = r1
            X.3sy r20 = r0.A08()
            java.lang.String r1 = r0.A0P
            r22 = r1
            boolean r1 = r0.A0x
            r19 = r1
            java.util.List r1 = r0.A0T
            java.util.List r27 = X.00k.A0a(r1)
            X.0eM r1 = r0.A0c
            java.util.List r28 = X.JTO.A15(r1)
            java.lang.String r5 = r2.A06
            java.util.List r6 = r0.A0S
            boolean r33 = r6.contains(r5)
            X.3Te r4 = r0.A0E
            if (r4 == 0) goto L_0x00ec
            java.util.List r1 = r4.A0E
            if (r1 == 0) goto L_0x00ec
            boolean r34 = r1.contains(r5)
        L_0x0041:
            int r3 = r0.A09
            X.N3u r1 = r0.A0J
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.String r2 = r1.A09
            r18 = r2
            int r2 = r1.A04
            r17 = r2
            java.lang.String r15 = r1.A0A
            int r14 = r1.A03
            int r13 = r1.A01
            int[] r12 = r1.A0C
            int[] r11 = r1.A0B
            int r10 = r1.A02
            int r9 = r1.A00
            java.lang.String r8 = r1.A08
            java.lang.String r7 = r1.A06
            java.lang.String r2 = r1.A07
            java.lang.String r1 = r1.A05
            com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate r16 = new com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate
            r35 = r16
            r36 = r18
            r37 = r15
            r38 = r8
            r39 = r7
            r40 = r2
            r41 = r1
            r42 = r12
            r43 = r11
            r44 = r17
            r45 = r14
            r46 = r13
            r47 = r10
            r48 = r9
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r1 = 29
            if (r3 != r1) goto L_0x0092
            if (r4 == 0) goto L_0x0092
            com.instagram.common.typedurl.ImageUrl r2 = r4.A04
            if (r2 != 0) goto L_0x0094
        L_0x0092:
            com.instagram.common.typedurl.ImageUrl r2 = r0.A0C
        L_0x0094:
            java.lang.String r1 = r0.A0N
            r24 = r1
            boolean r15 = r0.A0v
            boolean r14 = r0.A0n
            boolean r13 = r0.A0k
            boolean r38 = X.N4P.A05(r0)
            boolean r39 = r0.A0D()
            boolean r40 = r0.A0C()
            boolean r12 = r0.A0e
            boolean r11 = r0.A12
            if (r4 == 0) goto L_0x00ea
            java.lang.String r1 = r4.A07
        L_0x00b2:
            boolean r10 = r0.A0j
            java.lang.String r9 = r0.A0O
            int r31 = r0.A06()
            X.7Cl r8 = r0.A0I
            boolean r7 = r0.A0m
            X.Dri r0 = new X.Dri
            r30 = r3
            r32 = r19
            r35 = r15
            r36 = r14
            r37 = r13
            r41 = r12
            r42 = r11
            r43 = r10
            r44 = r7
            r14 = r0
            r15 = r2
            r17 = r4
            r18 = r8
            r19 = r23
            r23 = r5
            r25 = r1
            r26 = r9
            r29 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r1 = r49
            r1.A00 = r0
            return
        L_0x00ea:
            r1 = 0
            goto L_0x00b2
        L_0x00ec:
            r34 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71123OdH.<init>(com.instagram.common.session.UserSession, X.N4P):void");
    }

    public static C47167Dri A00(UserSession userSession, N4P n4p) {
        return new C71123OdH(userSession, n4p).A03();
    }

    public static C242243Te A01(C376519Ih r0) {
        if (r0 != null) {
            return (C242243Te) r0.A02;
        }
        return null;
    }

    public final C47167Dri A03() {
        C47167Dri dri = this.A00;
        if (dri != null) {
            return dri;
        }
        0qQ.A0F("nullStateThreadViewData");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00da, code lost:
        if (r3 == 8) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A02(X.C376519Ih r30, com.instagram.common.session.UserSession r31, X.C333517Zg r32) {
        /*
            X.7S7 r9 = r32.C6l()
            X.7SD r0 = r9.C6Q()
            java.util.List r8 = r0.A0Z
            r1 = r31
            com.instagram.user.model.User r11 = X.DbT.A0j(r1)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.lang.String r4 = r1.A06
            boolean r13 = r9.COR(r4)
            int r3 = X.C66580MXl.A05(r9)
            r1 = r30
            X.3Te r2 = A01(r1)
            boolean r14 = X.C329997La.A05(r2, r4, r3)
            int r3 = X.C66580MXl.A05(r9)
            X.3Te r2 = A01(r1)
            boolean r15 = X.C329997La.A03(r2, r4, r3)
            if (r30 == 0) goto L_0x014e
            java.lang.Object r3 = r1.A04
            java.util.List r3 = (java.util.List) r3
        L_0x003a:
            r18 = 0
            if (r3 == 0) goto L_0x004c
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x004c
            boolean r2 = X.JTQ.A1T(r11, r3)
            if (r2 == 0) goto L_0x004c
            r18 = 1
        L_0x004c:
            int r3 = X.C66580MXl.A05(r9)
            X.3Te r2 = A01(r1)
            boolean r19 = X.C329997La.A06(r2, r4, r3)
            int r3 = X.C66580MXl.A05(r9)
            X.3Te r2 = A01(r1)
            boolean r20 = X.C329997La.A04(r2, r4, r3)
            r12 = 0
            r16 = 0
            r25 = 0
            X.N9q r10 = new X.N9q
            r17 = r16
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.add(r10)
            java.util.List r2 = r9.BRZ()
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r11 = r2.iterator()
        L_0x0087:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0151
            com.instagram.user.model.User r4 = X.DbT.A0k(r11)
            X.0qQ.A0A(r4)
            boolean r21 = X.JTQ.A1T(r4, r8)
            java.lang.String r6 = r4.getId()
            int r3 = X.C66580MXl.A05(r9)
            X.3Te r2 = A01(r1)
            boolean r22 = X.C329997La.A05(r2, r6, r3)
            java.lang.String r6 = r4.getId()
            int r3 = X.C66580MXl.A05(r9)
            X.3Te r2 = A01(r1)
            boolean r23 = X.C329997La.A03(r2, r6, r3)
            java.lang.String r10 = r4.getId()
            int r7 = X.C66580MXl.A05(r9)
            X.7SD r2 = r9.C6Q()
            int r3 = r2.A07
            X.3Te r6 = A01(r1)
            boolean r2 = X.C329997La.A02(r6, r10, r7)
            if (r2 != 0) goto L_0x00d6
            boolean r2 = X.C329997La.A06(r6, r10, r7)
            if (r2 == 0) goto L_0x00dc
        L_0x00d6:
            r2 = 8
            r24 = 1
            if (r3 != r2) goto L_0x00de
        L_0x00dc:
            r24 = 0
        L_0x00de:
            if (r1 == 0) goto L_0x014c
            java.lang.Object r3 = r1.A04
            java.util.List r3 = (java.util.List) r3
        L_0x00e4:
            r26 = 0
            if (r3 == 0) goto L_0x00f6
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00f6
            boolean r2 = X.JTQ.A1T(r4, r3)
            if (r2 == 0) goto L_0x00f6
            r26 = 1
        L_0x00f6:
            java.lang.String r6 = r4.getId()
            int r3 = X.C66580MXl.A05(r9)
            X.3Te r2 = A01(r1)
            boolean r27 = X.C329997La.A06(r2, r6, r3)
            java.lang.String r6 = r4.getId()
            int r3 = X.C66580MXl.A05(r9)
            X.3Te r2 = A01(r1)
            boolean r28 = X.C329997La.A04(r2, r6, r3)
            java.lang.String r6 = r4.getId()
            int r3 = X.C66580MXl.A05(r9)
            X.7SD r2 = r9.C6Q()
            int r7 = r2.A07
            X.3Te r2 = A01(r1)
            boolean r2 = X.C329997La.A02(r2, r6, r3)
            if (r2 == 0) goto L_0x0134
            r2 = 8
            r29 = 1
            if (r7 != r2) goto L_0x0136
        L_0x0134:
            r29 = 0
        L_0x0136:
            X.N9q r2 = new X.N9q
            r20 = r12
            r30 = r25
            r31 = r25
            r32 = r25
            r18 = r2
            r19 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r5.add(r2)
            goto L_0x0087
        L_0x014c:
            r3 = 0
            goto L_0x00e4
        L_0x014e:
            r3 = 0
            goto L_0x003a
        L_0x0151:
            r0.addAll(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71123OdH.A02(X.9Ih, com.instagram.common.session.UserSession, X.7Zg):java.util.ArrayList");
    }

    public C71123OdH(C376519Ih r48, UserSession userSession, C333517Zg r50) {
        boolean z;
        C67256Mkq mkq;
        boolean z2;
        boolean z3;
        String str;
        C242243Te r2;
        List list;
        C333517Zg r22 = r50;
        0qQ.A0B(r22, 2);
        AnonymousClass7S7 C6l = r22.C6l();
        C254793t3 CBU = C6l.CBU();
        String C6k = C6l.C6k();
        C254743sy B8S = C6l.B8S();
        String str2 = C6l.C6Q().A0W;
        boolean z4 = C6l.C6Q().A1B;
        C376519Ih r0 = r48;
        UserSession userSession2 = userSession;
        ArrayList A02 = A02(r0, userSession2, r22);
        ArrayList A022 = A02(r0, userSession2, r22);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            DbY.A1T(((C68303N9q) next).A00.getId(), userSession2.A06, next, A1C);
        }
        String str3 = userSession2.A06;
        List list2 = C6l.C6Q().A0Z;
        boolean COR = C6l.COR(str3);
        if (r48 == null || (r2 = (C242243Te) r0.A02) == null || (list = r2.A0E) == null) {
            z = false;
        } else {
            z = list.contains(str3);
        }
        int A05 = C66580MXl.A05(C6l);
        ThemeViewModelDelegate A002 = OSB.A00(C6l.C6Q().A0J);
        ImageUrl imageUrl = C6l.C6Q().A0F;
        if (C6l.CZ0()) {
            mkq = C67256Mkq.PENDING;
        } else {
            2EN C3d = C6l.C3d();
            if (C3d == null || C3d.ordinal() != 3) {
                int C68 = C6l.C68(C6l.C6Q().A0w);
                if (C68 == 0) {
                    mkq = C67256Mkq.PRIMARY;
                } else if (C68 == 1) {
                    mkq = C67256Mkq.GENERAL;
                } else if (C68 != 2) {
                    mkq = C67256Mkq.INBOX;
                } else {
                    mkq = C67256Mkq.TOP_THREADS;
                }
            } else {
                mkq = C67256Mkq.BC_PARTNERSHIP;
            }
        }
        String str4 = mkq.A00;
        boolean z5 = C6l.C6Q().A1A;
        boolean CVr = C6l.CVr();
        boolean CVE = C6l.CVE();
        boolean CUO = C6l.CUO();
        boolean z6 = C6l.C6Q().A16;
        boolean CZ0 = C6l.CZ0();
        boolean CdK = C6l.CdK();
        if (r48 != null) {
            z2 = r0.A05;
        } else {
            z2 = false;
        }
        String BiB = C6l.BiB();
        if (C6l instanceof AnonymousClass7S6) {
            0qQ.A0C(C6l, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.open.DirectThreadViewDataLoader");
            AnonymousClass7S6 r23 = (AnonymousClass7S6) C6l;
            AnonymousClass2Ep r7 = r23.A07;
            r7.getClass();
            z3 = r7.CUJ();
            0qQ.A0C(C6l, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.open.DirectThreadViewDataLoader");
            AnonymousClass2Ep r24 = r23.A07;
            r24.getClass();
            str = r24.BA0();
        } else {
            z3 = false;
            str = null;
        }
        ArrayList arrayList = A1C;
        List list3 = list2;
        String str5 = str2;
        String str6 = str3;
        String str7 = str4;
        ImageUrl imageUrl2 = imageUrl;
        this.A00 = new C47167Dri(imageUrl2, A002, A01(r0), C327847Ck.A00(C6l.BA1()), CBU, B8S, C6k, str5, str6, str7, BiB, str, A02, arrayList, list3, A05, C6l.AdN(), z4, COR, z, z5, CVr, CVE, CUO, z6, CZ0, CdK, z2, z3, C331057Pi.A02(C6l.C6Q().A0H));
    }

    public C71123OdH() {
    }
}
