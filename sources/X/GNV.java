package X;

import android.content.Context;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class GNV {
    public static final GNV A00 = new Object();

    /* JADX WARNING: type inference failed for: r3v1, types: [X.JUK, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(android.content.Context r14, X.C53452Gok r15, X.C229352nF r16, com.instagram.common.session.UserSession r17, X.GNV r18, X.GD6 r19, X.C54575HJk r20, X.C52012GBj r21, java.lang.String r22, X.AnonymousClass4D7 r23) {
        /*
            r7 = r14
            r11 = r19
            r12 = r20
            r13 = r21
            r10 = r17
            r8 = r16
            r14 = r22
            r5 = 9
            r6 = r23
            boolean r0 = X.JUK.A02(r5, r6)
            r4 = r18
            if (r0 == 0) goto L_0x008f
            r3 = r6
            X.JUK r3 = (X.JUK) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008f
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0027:
            java.lang.Object r9 = r3.A09
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x0071
            if (r0 != r1) goto L_0x0095
            java.lang.Object r14 = r3.A08
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r8 = r3.A07
            X.2nF r8 = (X.C229352nF) r8
            java.lang.Object r10 = r3.A06
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.Object r13 = r3.A05
            X.GBj r13 = (X.C52012GBj) r13
            java.lang.Object r12 = r3.A04
            X.HJk r12 = (X.C54575HJk) r12
            java.lang.Object r11 = r3.A03
            X.GD6 r11 = (X.GD6) r11
            java.lang.Object r7 = r3.A02
            android.content.Context r7 = (android.content.Context) r7
            X.0eS.A00(r9)
        L_0x0051:
            X.GmI r9 = (X.C53332GmI) r9
            if (r9 == 0) goto L_0x006e
            com.instagram.api.schemas.InstagramMidcardType r1 = r9.A05
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A05
            if (r1 == r0) goto L_0x006e
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0a
            if (r1 == r0) goto L_0x006e
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0b
            if (r1 == r0) goto L_0x006e
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0F
            if (r1 == r0) goto L_0x006e
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0E
            if (r1 == r0) goto L_0x006e
            A02(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x006e:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0071:
            X.0eS.A00(r9)
            X.I7H r0 = X.I7H.A00
            r3.A01 = r4
            r3.A02 = r7
            r3.A03 = r11
            r3.A04 = r12
            r3.A05 = r13
            r3.A06 = r10
            r3.A07 = r8
            r3.A08 = r14
            r3.A00 = r1
            java.lang.Object r9 = r0.A09(r7, r15, r10, r3)
            if (r9 != r2) goto L_0x0051
            return r2
        L_0x008f:
            X.JUK r3 = new X.JUK
            r3.<init>(r4, r6, r5)
            goto L_0x0027
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GNV.A01(android.content.Context, X.Gok, X.2nF, com.instagram.common.session.UserSession, X.GNV, X.GD6, X.HJk, X.GBj, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final void A03(C229352nF r7, C53332GmI gmI, GD6 gd6, C54575HJk hJk, String str, int i) {
        0qQ.A0B(gmI, 0);
        C267324bN r1 = new C267324bN((C267334bO) new GYP(gmI));
        C295365o2 r0 = r1.A01;
        C295365o2 r6 = C295365o2.MIDCARD;
        if (r0 == r6) {
            gd6.A0A.A0b(r1, i);
        }
        if (str != null && r7 != null) {
            List A0I = hJk.A0I();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : A0I) {
                C295365o2 r12 = ((C267324bN) next).A01;
                if (r12 == C295365o2.ORGANIC || r12 == C295365o2.AD || r12 == C295365o2.AD_PREVIEW || r12 == C295365o2.MULTI_ADS || r12 == r6) {
                    A1C.add(next);
                }
            }
            r7.A08(str, A1C, false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r1 != X.C295365o2.MULTI_ADS) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(X.C53332GmI r9, com.instagram.common.session.UserSession r10, X.C54575HJk r11, X.C52012GBj r12) {
        /*
            int r5 = r9.A01
            X.5o2 r0 = X.C295365o2.MIDCARD
            java.util.List r1 = r11.A0K(r0)
            boolean r0 = r1.isEmpty()
            r9 = 0
            if (r0 == 0) goto L_0x0023
            r0 = 8
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0015:
            r8 = r9
        L_0x0016:
            java.util.List r0 = r11.A0I()
            int r0 = r0.size()
            int r4 = r0 + -2
            if (r5 <= r4) goto L_0x0034
            return r9
        L_0x0023:
            java.lang.Object r0 = X.00k.A0L(r1)
            X.4bN r0 = (X.C267324bN) r0
            if (r0 == 0) goto L_0x0015
            int r0 = r11.A0B(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L_0x0016
        L_0x0034:
            int r0 = r12.A06()
            int r0 = r0 + 2
            if (r5 >= r0) goto L_0x003d
            r5 = r0
        L_0x003d:
            if (r5 > r4) goto L_0x00b9
            int r6 = r12.A06()
            X.4bN r0 = r11.A0E(r5)
            X.5o2 r1 = r0.A01
            X.5o2 r3 = X.C295365o2.AD
            if (r1 == r3) goto L_0x0059
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 == r0) goto L_0x0059
            X.5o2 r0 = X.C295365o2.MULTI_ADS
            if (r1 == r0) goto L_0x0059
            X.5o2 r0 = X.C295365o2.ORGANIC
            if (r1 != r0) goto L_0x0095
        L_0x0059:
            int r2 = r5 + -1
            X.4bN r0 = r11.A0E(r2)
            X.5o2 r1 = r0.A01
            if (r1 == r3) goto L_0x006f
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 == r0) goto L_0x006f
            X.5o2 r0 = X.C295365o2.MULTI_ADS
            if (r1 == r0) goto L_0x006f
            X.5o2 r0 = X.C295365o2.ORGANIC
            if (r1 != r0) goto L_0x0095
        L_0x006f:
            int r0 = r6 + 1
            if (r0 >= r5) goto L_0x0095
            if (r5 <= 0) goto L_0x0098
            X.4bN r0 = r11.A0E(r2)
            X.4bN r2 = r11.A0E(r5)
            X.5o2 r1 = r0.A01
            if (r1 == r3) goto L_0x0089
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 == r0) goto L_0x0089
            X.5o2 r0 = X.C295365o2.MULTI_ADS
            if (r1 != r0) goto L_0x0098
        L_0x0089:
            X.5o2 r1 = r2.A01
            if (r1 == r3) goto L_0x0095
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 == r0) goto L_0x0095
            X.5o2 r0 = X.C295365o2.MULTI_ADS
            if (r1 != r0) goto L_0x0098
        L_0x0095:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0098:
            if (r8 == 0) goto L_0x00b4
            int r0 = r8.intValue()
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            long r2 = (long) r0
            X.0Tu r6 = X.0Tu.A05
            r0 = 36602634714878655(0x8209e7000612bf, double:3.2109918084446004E-306)
            long r6 = X.182.A01(r6, r10, r0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0095
        L_0x00b4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            return r0
        L_0x00b9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GNV.A00(X.GmI, com.instagram.common.session.UserSession, X.HJk, X.GBj):java.lang.Integer");
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(android.content.Context r25, X.C229352nF r26, com.instagram.common.session.UserSession r27, X.B5G r28, X.GD6 r29, X.C54575HJk r30, X.C52012GBj r31, java.lang.String r32, X.AnonymousClass4D7 r33) {
        /*
            r24 = this;
            r12 = r25
            r1 = r29
            r2 = r30
            r3 = r31
            r15 = r27
            r14 = r26
            r4 = r32
            r8 = 8
            r9 = r33
            boolean r0 = X.JUK.A02(r8, r9)
            if (r0 == 0) goto L_0x00da
            r7 = r9
            X.JUK r7 = (X.JUK) r7
            int r6 = r7.A00
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r5
            if (r0 == 0) goto L_0x00da
            int r6 = r6 - r5
            r7.A00 = r6
        L_0x0026:
            java.lang.Object r9 = r7.A09
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0085
            if (r0 != r5) goto L_0x00e3
            java.lang.Object r8 = r7.A08
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r4 = r7.A07
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r14 = r7.A06
            X.2nF r14 = (X.C229352nF) r14
            java.lang.Object r15 = r7.A05
            com.instagram.common.session.UserSession r15 = (com.instagram.common.session.UserSession) r15
            java.lang.Object r3 = r7.A04
            X.GBj r3 = (X.C52012GBj) r3
            java.lang.Object r2 = r7.A03
            X.HJk r2 = (X.C54575HJk) r2
            java.lang.Object r1 = r7.A02
            X.GD6 r1 = (X.GD6) r1
            java.lang.Object r12 = r7.A01
            android.content.Context r12 = (android.content.Context) r12
            X.0eS.A00(r9)
        L_0x0054:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r13 = r8.next()
            X.Gok r13 = (X.C53452Gok) r13
            X.GNV r16 = A00
            r7.A01 = r12
            r7.A02 = r1
            r7.A03 = r2
            r7.A04 = r3
            r7.A05 = r15
            r7.A06 = r14
            r7.A07 = r4
            r7.A08 = r8
            r7.A00 = r5
            r21 = r7
            r20 = r4
            r19 = r3
            r18 = r2
            r17 = r1
            java.lang.Object r0 = A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r0 != r6) goto L_0x0054
            return r6
        L_0x0085:
            X.0eS.A00(r9)
            r10 = r28
            java.util.List r0 = r10.A00
            if (r0 == 0) goto L_0x00d0
            java.util.Iterator r11 = r0.iterator()
        L_0x0092:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r8 = r11.next()
            X.HpD r8 = (X.C55892HpD) r8
            X.I7H r0 = X.I7H.A00
            X.GmI r9 = r0.A08(r12, r15, r8)
            if (r9 == 0) goto L_0x0092
            com.instagram.api.schemas.InstagramMidcardType r8 = r9.A05
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A05
            if (r8 == r0) goto L_0x0092
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0a
            if (r8 == r0) goto L_0x0092
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0b
            if (r8 == r0) goto L_0x0092
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0F
            if (r8 == r0) goto L_0x0092
            com.instagram.api.schemas.InstagramMidcardType r0 = com.instagram.api.schemas.InstagramMidcardType.A0E
            if (r8 == r0) goto L_0x0092
            r16 = r12
            r17 = r14
            r18 = r9
            r19 = r15
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            A02(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0092
        L_0x00d0:
            java.util.List r0 = r10.A01
            if (r0 == 0) goto L_0x00e8
            java.util.Iterator r8 = r0.iterator()
            goto L_0x0054
        L_0x00da:
            X.JUK r7 = new X.JUK
            r0 = r24
            r7.<init>(r0, r9, r8)
            goto L_0x0026
        L_0x00e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e8:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GNV.A04(android.content.Context, X.2nF, com.instagram.common.session.UserSession, X.B5G, X.GD6, X.HJk, X.GBj, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final void A02(Context context, C229352nF r12, C53332GmI gmI, UserSession userSession, GD6 gd6, C54575HJk hJk, C52012GBj gBj, String str) {
        String str2;
        List list;
        C53332GmI gmI2 = gmI;
        C52266GLh.A00(userSession).A01(gmI);
        C52267GLi A002 = C52266GLh.A00(userSession);
        C267324bN r3 = new C267324bN((C267334bO) new GYP(gmI));
        AnonymousClass7TF.A1H(userSession, context);
        if (r3.A01 == C295365o2.MIDCARD) {
            InstagramMidcardType instagramMidcardType = r3.A01().A05;
            if (instagramMidcardType == InstagramMidcardType.A0a || instagramMidcardType == InstagramMidcardType.A0F) {
                str2 = r3.A01().A0C;
                list = r3.A01().A0I;
            } else {
                str2 = null;
                list = null;
            }
            I75 i75 = new I75(context, userSession, 1Au.A00(userSession));
            A002.A00 = i75;
            if (!(str2 == null || list == null)) {
                if (I75.A06(i75, str2)) {
                    I75.A02(i75, str2);
                } else {
                    i75.A01.put(str2, list);
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    I75.A04(i75, list, A1C, A1H);
                    AnonymousClass72Q r32 = i75.A00;
                    ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                    Iterator it = A1C.iterator();
                    while (it.hasNext()) {
                        A0r.add(r32.A00(C51966G9m.A0t(it)));
                    }
                    C290815g0 A01 = r32.A01(A0r, (List) null);
                    A01.A00 = new C385909jj(A1H, i75, str2, 2);
                    1ES.A06(A01, 1394228119, false);
                }
            }
        }
        C54575HJk hJk2 = hJk;
        Integer A003 = A00(gmI, userSession, hJk2, gBj);
        if (A003 != null) {
            A03(r12, gmI2, gd6, hJk2, str, A003.intValue());
        }
    }
}
