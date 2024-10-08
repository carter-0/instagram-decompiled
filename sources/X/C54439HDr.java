package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2;
import com.instagram.barcelona.permalink.data.BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.HDr  reason: case insensitive filesystem */
public final class C54439HDr extends C252733pa {
    public final C54433HDg A00;
    public final AnonymousClass4HW A01;
    public final UserSession A02;
    public final AnonymousClass1L1 A03 = 1L2.A00();
    public final String A04;
    public final String A05;
    public final AnonymousClass0r6 A06;
    public final 05G A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x017c, code lost:
        if (r3 != null) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C54439HDr(com.instagram.common.session.UserSession r39, java.lang.String r40, java.lang.String r41) {
        /*
            r38 = this;
            r13 = 0
            r10 = r39
            X.0qQ.A0B(r10, r13)
            r0 = 15
            X.IwG r1 = new X.IwG
            r1.<init>((java.lang.Object) r10, (int) r0)
            java.lang.Class<X.HDg> r0 = X.C54433HDg.class
            java.lang.Object r8 = r10.A01(r0, r1)
            X.HDg r8 = (X.C54433HDg) r8
            r0 = 14
            X.IwG r1 = new X.IwG
            r1.<init>((java.lang.Object) r10, (int) r0)
            java.lang.Class<X.Hzb> r0 = X.C56505Hzb.class
            java.lang.Object r3 = r10.A01(r0, r1)
            X.Hzb r3 = (X.C56505Hzb) r3
            X.1E8 r5 = X.1E7.A00(r10)
            r4 = 1
            r6 = r40
            r9 = r41
            int r14 = X.DbW.A02(r4, r6, r9)
            r0 = 6
            X.C51973G9u.A0s(r0, r8, r3, r5)
            r35 = 0
            r1 = 0
            r0 = 1340669765(0x4fe8ff45, float:7.8180869E9)
            X.19S r2 = X.AnonymousClass43D.A00(r0)
            r0 = 2688(0xa80, float:3.767E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7 = r38
            r7.<init>(r0, r2)
            r7.A05 = r6
            r7.A04 = r9
            r7.A02 = r10
            r7.A00 = r8
            X.1L1 r0 = X.1L2.A00()
            r7.A03 = r0
            r34 = 1
            X.4HU r0 = X.AnonymousClass4HU.A00
            X.4HW r0 = X.C335967dq.A00(r0)
            r7.A01 = r0
            X.0sn r21 = X.0sn.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.GnG r22 = new X.GnG
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r1
            r27 = r0
            r28 = r0
            r29 = r21
            r30 = r13
            r31 = r13
            r32 = r13
            r33 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.02z r2 = X.DbS.A10(r22)
            r7.A07 = r2
            X.0r6 r9 = r3.A01
            X.0qQ.A0B(r9, r13)
            r8 = 7
            X.MH4 r3 = new X.MH4
            r3.<init>((java.lang.Object) r9, (java.lang.Object) r10, (X.AnonymousClass4D7) r1, (int) r8)
            X.05E r8 = new X.05E
            r8.<init>(r3)
            X.MHi r3 = new X.MHi
            r3.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r1, (int) r4)
            X.0pm r11 = X.AnonymousClass10H.A03(r3, r2, r8)
            X.1Ng r9 = X.AnonymousClass1Nd.A00(r10)
            r8 = 5
            X.MH4 r3 = new X.MH4
            r3.<init>((java.lang.Object) r9, (java.lang.Object) r11, (X.AnonymousClass4D7) r1, (int) r8)
            X.05S r3 = X.AnonymousClass0Zq.A01(r3)
            r8 = -1
            X.0r6 r12 = X.11M.A00(r0, r3, r8)
            X.J1K r11 = X.J1K.A00
            X.0qQ.A0B(r12, r13)
            X.0qQ.A0B(r11, r4)
            r9 = 43
            X.MHH r3 = new X.MHH
            r3.<init>((java.lang.Object) r12, (java.lang.Object) r11, (X.AnonymousClass4D7) r1, (int) r9)
            X.05S r3 = X.AnonymousClass0Zq.A01(r3)
            X.0r6 r18 = X.11M.A00(r0, r3, r8)
            X.1Ng r19 = X.AnonymousClass1Nd.A00(r10)
            r20 = 24
            X.MHG r15 = new X.MHG
            r16 = r1
            r17 = r7
            r15.<init>((X.AnonymousClass4D7) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (int) r20)
            X.05S r3 = X.AnonymousClass0Zq.A01(r15)
            X.0r6 r3 = X.11M.A00(r0, r3, r8)
            r7.A06 = r3
            X.4Cq r9 = r7.A01
            X.MH8 r8 = new X.MH8
            r8.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r1, (int) r14)
            X.19B r3 = X.19B.A00
            X.1Eo.A03(r0, r3, r8, r9)
            X.1Xj r3 = r5.A02(r6)
            if (r3 == 0) goto L_0x017a
            int r5 = r3.A00
            if (r5 == 0) goto L_0x017a
        L_0x00f9:
            X.4oA r5 = X.C51966G9m.A0x(r3)
            if (r5 == 0) goto L_0x0109
            java.lang.Boolean r5 = r5.COr()
            if (r5 == 0) goto L_0x0109
            boolean r35 = r5.booleanValue()
        L_0x0109:
            java.lang.Object r5 = r2.getValue()
            r8 = r5
            X.GnG r8 = (X.C53384GnG) r8
            if (r3 == 0) goto L_0x0176
            X.GpN r7 = new X.GpN
            r7.<init>(r3)
            X.GpN r6 = new X.GpN
            r6.<init>(r3)
            X.1Xj r9 = r6.A00
            java.lang.String r27 = r9.A2n()
            if (r27 == 0) goto L_0x0180
            com.instagram.api.schemas.LineType r15 = com.instagram.api.schemas.LineType.LINE
            com.instagram.api.schemas.ThreadItemType r16 = com.instagram.api.schemas.ThreadItemType.DEFAULT
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r13)
            X.Gm6 r14 = new X.Gm6
            r20 = r1
            r23 = r13
            r24 = r13
            r25 = r13
            r26 = r13
            r18 = r1
            r22 = r4
            r17 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.util.List r29 = X.AnonymousClass7TE.A1I(r14)
            com.instagram.api.schemas.ThreadContainerType r24 = com.instagram.api.schemas.ThreadContainerType.THREAD
            X.GlW r6 = new X.GlW
            r23 = r6
            r25 = r1
            r26 = r1
            r28 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29)
            X.Gl5 r9 = new X.Gl5
            r9.<init>(r6, r0)
            java.util.List r32 = X.AnonymousClass7TE.A1I(r9)
        L_0x015d:
            r33 = 2004(0x7d4, float:2.808E-42)
            r28 = r1
            r29 = r8
            r30 = r7
            r31 = r1
            r36 = r13
            r37 = r13
            X.GnG r6 = X.C53384GnG.A00(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            boolean r5 = r2.AIY(r5, r6)
            if (r5 == 0) goto L_0x0109
            return
        L_0x0176:
            r7 = r1
            r32 = r21
            goto L_0x015d
        L_0x017a:
            r34 = 0
            if (r3 == 0) goto L_0x0109
            goto L_0x00f9
        L_0x0180:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54439HDr.<init>(com.instagram.common.session.UserSession, java.lang.String, java.lang.String):void");
    }

    public final Object A03(AnonymousClass4D7 r10, boolean z, boolean z2) {
        boolean z3;
        AnonymousClass4HW r0;
        0sP barcelonaPermalinkRepository$handleLegacyNetworkRequest$2;
        if (z) {
            C54433HDg hDg = this.A00;
            05G r02 = (05G) hDg.A00.get(C51965G9l.A0u(this.A05));
            if (r02 == null) {
                if (182.A06(0Tu.A05, this.A02, 36319158287801321L)) {
                    r0 = this.A01;
                    barcelonaPermalinkRepository$handleLegacyNetworkRequest$2 = new BarcelonaPermalinkRepository$handleNetworkStreamingRequest$2(this, (List) null, (AnonymousClass4D7) null);
                } else {
                    z3 = true;
                    r0 = this.A01;
                    barcelonaPermalinkRepository$handleLegacyNetworkRequest$2 = new BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2(this, (List) null, (AnonymousClass4D7) null, z3, z2);
                }
            } else {
                r02.getValue();
                throw AnonymousClass7TE.A1K();
            }
        } else {
            z3 = false;
            r0 = this.A01;
            barcelonaPermalinkRepository$handleLegacyNetworkRequest$2 = new BarcelonaPermalinkRepository$handleLegacyNetworkRequest$2(this, (List) null, (AnonymousClass4D7) null, z3, z2);
        }
        C60340gF r2 = C60340gF.A00;
        Object A002 = r0.A00(r2, r10, barcelonaPermalinkRepository$handleLegacyNetworkRequest$2);
        1Hj r03 = 1Hj.A02;
        if (A002 != r03) {
            A002 = r2;
        }
        if (A002 != r03) {
            return r2;
        }
        return A002;
    }

    public static final void A01(C53323Gm9 gm9, C54439HDr hDr, boolean z, boolean z2, boolean z3) {
        C53257Gl5 gl5;
        C53467Goz goz;
        Object value;
        C53384GnG gnG;
        List A0X;
        String str;
        String str2;
        Object obj;
        ArrayList arrayList;
        Object value2;
        C53384GnG gnG2;
        List A0X2;
        String str3;
        Object value3;
        List A0X3;
        JV7 jv7;
        C53491GpN gpN;
        N49 n49;
        boolean z4;
        Integer num;
        Integer num2;
        boolean z5;
        boolean z6;
        boolean z7;
        1Xj r1;
        List list;
        Object obj2;
        C53323Gm9 gm92 = gm9;
        BBL bbl = gm92.A01;
        if (bbl != null) {
            gl5 = new C53257Gl5(C44599ChX.A00(bbl), AnonymousClass05K.A00);
        } else {
            gl5 = null;
        }
        List<BBL> list2 = gm92.A05;
        ArrayList A0p = AnonymousClass7TF.A0p(list2);
        for (BBL A002 : list2) {
            A0p.add(new C53257Gl5(C44599ChX.A00(A002), AnonymousClass05K.A01));
        }
        String str4 = gm92.A02;
        if (bbl == null || (list = bbl.A05) == null) {
            goz = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (0qQ.A0K(((C53467Goz) obj2).A02.A0C.getPk(), str4)) {
                    break;
                }
            }
            goz = (C53467Goz) obj2;
        }
        C54439HDr hDr2 = hDr;
        if (z) {
            ArrayList A0S = 00k.A0S(A0p, AnonymousClass7TE.A1I(gl5));
            05G r14 = hDr2.A07;
            do {
                value3 = r14.getValue();
                C53384GnG gnG3 = (C53384GnG) value3;
                A0X3 = 00k.A0X(A0S);
                N49 n492 = gm92.A00;
                jv7 = new JV7((Object) Boolean.valueOf(gm92.A06), n492.A00, n492.A01, 9);
                if (goz != null) {
                    gpN = new C53491GpN(goz.A02);
                } else {
                    gpN = null;
                }
                n49 = new N49(gm92.A04, gm92.A03, 16);
                z4 = gm92.A08;
                if (gm92.A07) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A01;
                }
                if (z3) {
                    num2 = AnonymousClass05K.A01;
                } else {
                    num2 = AnonymousClass05K.A0C;
                }
                z5 = gnG3.A08;
                z6 = gnG3.A07;
                z7 = gnG3.A09;
                r1 = gnG3.A03;
                0qQ.A0B(A0X3, 5);
                0qQ.A0B(num, 9);
                0qQ.A0B(num2, 10);
            } while (!r14.AIY(value3, new C53384GnG(n49, jv7, gpN, r1, num, num2, A0X3, z5, z6, z7, z4)));
        } else if (z2) {
            05G r4 = hDr2.A07;
            JV7 jv72 = ((C53384GnG) r4.getValue()).A01;
            if (jv72 == null || !AnonymousClass7TF.A1Y(jv72.A00, true) || !AnonymousClass7TE.A1b(A0p) || !AnonymousClass7TE.A1b(((C53384GnG) r4.getValue()).A06)) {
                arrayList = 00k.A0S(00k.A0S(A0p, AnonymousClass7TE.A1I(gl5)), ((C53384GnG) r4.getValue()).A06);
            } else {
                C53257Gl5 gl52 = (C53257Gl5) 00k.A0K(((C53384GnG) r4.getValue()).A06);
                List list3 = ((C53384GnG) r4.getValue()).A06;
                0qQ.A0B(list3, 0);
                int A022 = DbT.A02(list3, 1);
                if (A022 < 0) {
                    A022 = 0;
                }
                List A0d = 00k.A0d(list3, A022);
                C53257Gl5 gl53 = (C53257Gl5) 00k.A0I(A0p);
                List A0c = 00k.A0c(A0p, 1);
                C53284GlW glW = gl53.A00;
                ArrayList A0S2 = 00k.A0S(glW.A05, gl52.A00.A05);
                String str5 = glW.A04;
                String str6 = glW.A03;
                ThreadHeaderStyle threadHeaderStyle = glW.A01;
                ThreadContainerType threadContainerType = glW.A00;
                BBD bbd = glW.A02;
                AnonymousClass7TG.A0w(0, str5, A0S2, threadContainerType);
                C53284GlW glW2 = new C53284GlW(threadContainerType, threadHeaderStyle, bbd, str5, str6, A0S2);
                Integer num3 = gl53.A01;
                0qQ.A0B(num3, 1);
                arrayList = 00k.A0S(A0c, 00k.A0T(new C53257Gl5(glW2, num3), A0d));
            }
            do {
                value2 = r4.getValue();
                gnG2 = (C53384GnG) value2;
                A0X2 = 00k.A0X(arrayList);
                JV7 jv73 = gnG2.A01;
                if (jv73 != null) {
                    str3 = jv73.A02;
                } else {
                    str3 = null;
                }
            } while (!r4.AIY(value2, C53384GnG.A00(new JV7((Object) Boolean.valueOf(gm92.A06), gm92.A00.A00, str3, 9), gnG2, (JRG) null, AnonymousClass05K.A0C, A0X2, 671, false, false, false, gm92.A08)));
        } else {
            ArrayList A0S3 = 00k.A0S(A0p, AnonymousClass7TE.A1I(gl5));
            05G r6 = hDr2.A07;
            ArrayList A0S4 = 00k.A0S(((C53384GnG) r6.getValue()).A06, A0S3);
            do {
                value = r6.getValue();
                gnG = (C53384GnG) value;
                A0X = 00k.A0X(A0S4);
                str = gm92.A00.A01;
                JV7 jv74 = gnG.A01;
                if (jv74 != null) {
                    str2 = jv74.A01;
                    obj = jv74.A00;
                } else {
                    str2 = null;
                    obj = null;
                }
            } while (!r6.AIY(value, C53384GnG.A00(new JV7(obj, str2, str, 9), gnG, (JRG) null, AnonymousClass05K.A0C, A0X, 671, false, false, false, gm92.A08)));
        }
    }

    public static final void A02(C54439HDr hDr, String str) {
        Object value;
        05G r2 = hDr.A07;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C53384GnG.A00((JV7) null, (C53384GnG) value, (JRG) null, AnonymousClass05K.A0N, (List) null, 1019, false, false, 0qQ.A0K(str, AnonymousClass000.A00(3194)), false)));
    }

    public static final ArrayList A00(C54439HDr hDr, String str, List list, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        LinkedHashSet A0y = DbS.A0y();
        for (C53257Gl5 gl5 : ((C53384GnG) hDr.A07.getValue()).A06) {
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            C53284GlW glW = gl5.A00;
            for (C53320Gm6 gm6 : glW.A05) {
                JRG jrg = gm6.A02;
                if (0qQ.A0K(jrg.getId(), str)) {
                    List list2 = list;
                    if (AnonymousClass7TE.A1b(list2)) {
                        A1C2.addAll(list2);
                    } else {
                        LineType lineType = gm6.A00;
                        ThreadItemType threadItemType = gm6.A01;
                        List list3 = gm6.A06;
                        User user = gm6.A03;
                        boolean z2 = gm6.A0A;
                        boolean z3 = gm6.A07;
                        String str2 = gm6.A05;
                        Boolean bool = gm6.A04;
                        boolean z4 = gm6.A09;
                        boolean z5 = gm6.A0B;
                        C51974G9v.A1K(lineType, threadItemType, list3);
                        Boolean bool2 = bool;
                        String str3 = str2;
                        List list4 = list3;
                        ThreadItemType threadItemType2 = threadItemType;
                        JRG jrg2 = jrg;
                        User user2 = user;
                        LineType lineType2 = lineType;
                        A1C2.add(new C53320Gm6(lineType2, threadItemType2, jrg2, user2, bool2, str3, list4, z2, z3, z, z4, z5));
                    }
                } else {
                    A1C2.add(gm6);
                }
            }
            String str4 = glW.A04;
            String str5 = glW.A03;
            ThreadHeaderStyle threadHeaderStyle = glW.A01;
            ThreadContainerType threadContainerType = glW.A00;
            BBD bbd = glW.A02;
            AnonymousClass7TF.A1D(str4, 0, threadContainerType);
            ThreadHeaderStyle threadHeaderStyle2 = threadHeaderStyle;
            BBD bbd2 = bbd;
            String str6 = str4;
            ThreadContainerType threadContainerType2 = threadContainerType;
            C53284GlW glW2 = new C53284GlW(threadContainerType2, threadHeaderStyle2, bbd2, str6, str5, A1C2);
            Integer num = gl5.A01;
            0qQ.A0B(num, 1);
            A1C.add(new C53257Gl5(glW2, num));
            Iterator it = A1C2.iterator();
            while (it.hasNext()) {
                A0y.add(((C53320Gm6) it.next()).A02.getId());
            }
        }
        return A1C;
    }

    public final void onUserSessionWillEnd(boolean z) {
        Object value;
        0sn r9;
        Integer num;
        close();
        05G r1 = this.A07;
        do {
            value = r1.getValue();
            r9 = 0sn.A00;
            num = AnonymousClass05K.A00;
        } while (!r1.AIY(value, new C53384GnG((N49) null, (JV7) null, (JRG) null, (1Xj) null, num, num, r9, false, false, false, false)));
    }
}
