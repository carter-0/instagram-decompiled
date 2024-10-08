package com.instagram.wellbeing.limitsplus.data;

import X.05G;
import X.0qQ;
import X.1NY;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C53389GnL;
import X.C54051Gya;
import X.C56212Huf;
import X.C66579MXk;
import X.DbS;
import X.G9w;
import com.instagram.common.session.UserSession;
import java.util.TimeZone;

public final class LimitsPlusRepository extends C252733pa {
    public String A00 = "";
    public final 05G A01 = DbS.A10(new C53389GnL());
    public final UserSession A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LimitsPlusRepository(UserSession userSession) {
        super("LimitsPlus", AnonymousClass43D.A00(533022723));
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDt, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r17) {
        /*
            r16 = this;
            r4 = 6
            r5 = r17
            boolean r0 = X.C66141MDt.A02(r4, r5)
            r3 = r16
            if (r0 == 0) goto L_0x00fa
            r7 = r5
            X.MDt r7 = (X.C66141MDt) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fa
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0019:
            java.lang.Object r12 = r7.A08
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 2
            r14 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 == r14) goto L_0x0082
            if (r0 != r5) goto L_0x0101
            java.lang.Object r4 = r7.A07
            X.05G r4 = (X.05G) r4
            java.lang.Object r13 = r7.A06
            java.lang.Long r13 = (java.lang.Long) r13
            java.lang.Object r9 = r7.A05
            X.YBJ r9 = (X.YBJ) r9
            java.lang.Object r8 = r7.A04
            X.5mX r8 = (X.C294485mX) r8
            java.lang.Object r11 = r7.A03
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Object r2 = r7.A02
            X.GnL r2 = (X.C53389GnL) r2
            java.lang.Object r3 = r7.A01
            X.JRb r3 = (X.C59633JRb) r3
            X.0eS.A00(r12)
        L_0x0046:
            java.lang.Long r12 = (java.lang.Long) r12
        L_0x0048:
            X.Gof r3 = (X.C53447Gof) r3
            com.instagram.api.schemas.LimitedInteractionsVersions r10 = r3.A02
            boolean r15 = r2.A08
            r0 = 5
            X.0qQ.A0B(r10, r0)
            X.GnL r7 = new X.GnL
            r7.<init>((X.C294485mX) r8, (X.YBJ) r9, (com.instagram.api.schemas.LimitedInteractionsVersions) r10, (java.lang.Boolean) r11, (java.lang.Long) r12, (java.lang.Long) r13, (boolean) r14, (boolean) r15)
            r4.Epw(r7)
        L_0x005a:
            X.0gF r6 = X.C60340gF.A00
        L_0x005c:
            return r6
        L_0x005d:
            X.0eS.A00(r12)
            com.instagram.common.session.UserSession r0 = r3.A02
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "users/get_limited_interactions_settings/"
            r2.A0A(r0)
            java.lang.Class<X.Gya> r1 = X.C54051Gya.class
            java.lang.Class<X.Huf> r0 = X.C56212Huf.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r7.A01 = r3
            r7.A00 = r14
            r0 = 966525209(0x399c0119, float:2.9755456E-4)
            java.lang.Object r12 = r1.A00(r0, r7)
            if (r12 == r6) goto L_0x005c
            r1 = r3
            goto L_0x0089
        L_0x0082:
            java.lang.Object r1 = r7.A01
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r1 = (com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository) r1
            X.0eS.A00(r12)
        L_0x0089:
            X.3Ii r12 = (X.C239803Ii) r12
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a1
            X.3Ih r12 = (X.C239793Ih) r12
            java.lang.Object r0 = r12.A00
            X.Gya r0 = (X.C54051Gya) r0
            X.JRb r0 = r0.A02
            if (r0 != 0) goto L_0x00aa
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a1:
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ae
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00aa:
            X.3Ih r12 = X.C41845B3m.A0d(r0)
        L_0x00ae:
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r12 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0106
            X.5sO r12 = X.DbU.A0f()
        L_0x00ba:
            boolean r0 = r12 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005a
            X.3Ih r12 = (X.C239793Ih) r12
            java.lang.Object r3 = r12.A00
            X.JRb r3 = (X.C59633JRb) r3
            X.05G r4 = r1.A01
            java.lang.Object r2 = r4.getValue()
            X.GnL r2 = (X.C53389GnL) r2
            r1 = r3
            X.Gof r1 = (X.C53447Gof) r1
            java.lang.Boolean r11 = r1.A03
            X.5mW r8 = r1.A00
            X.Goe r9 = r1.A01
            java.lang.Long r13 = r1.A05
            boolean r0 = X.AnonymousClass7TF.A1Y(r11, r14)
            if (r0 == 0) goto L_0x00e1
            java.lang.Long r12 = r1.A04
            goto L_0x0048
        L_0x00e1:
            java.lang.Long r0 = r1.A04
            r7.A01 = r3
            r7.A02 = r2
            r7.A03 = r11
            r7.A04 = r8
            r7.A05 = r9
            r7.A06 = r13
            r7.A07 = r4
            r7.A00 = r5
            java.lang.Long r12 = A00(r0, r13)
            if (r12 != r6) goto L_0x0046
            return r6
        L_0x00fa:
            X.MDt r7 = new X.MDt
            r7.<init>(r3, r5, r4)
            goto L_0x0019
        L_0x0101:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0106:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A02(X.4D7):java.lang.Object");
    }

    private final Object A01(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Long l, AnonymousClass4D7 r13) {
        1NY A0a = AnonymousClass7TG.A0a(this.A02);
        A0a.A0A(C66579MXk.A00(1188));
        A0a.A0Q(C54051Gya.class, C56212Huf.class);
        A0a.A0E("is_enabled", bool);
        A0a.A0E("non_followers", bool2);
        A0a.A0E("new_followers", bool3);
        A0a.A0E("non_close_friends", bool4);
        A0a.A0E("some_interactions", bool5);
        A0a.A0E("most_interactions", bool6);
        A0a.A9m("version", G9w.A0P(this.A01).A06.toString());
        if (l != null) {
            A0a.A0C("reminder_date", (int) l.longValue());
        }
        return A0a.A0M().A00(503283951, r13);
    }

    /* JADX WARNING: type inference failed for: r23v0, types: [X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if ((r2 instanceof X.C239793Ih) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r25, long r26) {
        /*
            r24 = this;
            r0 = r26
            r3 = 1
            r6 = r25
            boolean r2 = r6 instanceof X.C58072Il4
            r15 = r24
            if (r2 == 0) goto L_0x0116
            r7 = r6
            X.Il4 r7 = (X.C58072Il4) r7
            int r2 = r7.A05
            if (r2 != r3) goto L_0x0116
            int r5 = r7.A00
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r5 & r4
            if (r2 == 0) goto L_0x0116
            int r5 = r5 - r4
            r7.A00 = r5
        L_0x001d:
            java.lang.Object r2 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r4 = r7.A00
            r14 = 0
            if (r4 == 0) goto L_0x00c5
            if (r4 != r3) goto L_0x011d
            long r0 = r7.A01
            java.lang.Object r4 = r7.A02
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r4 = (com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository) r4
            X.0eS.A00(r2)
        L_0x0031:
            boolean r2 = r2 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x00c2
        L_0x0035:
            X.05G r5 = r4.A01
            java.lang.Object r2 = r5.getValue()
            X.GnL r2 = (X.C53389GnL) r2
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r0)
            X.GnL r0 = X.G9w.A0P(r5)
            java.lang.Object r0 = r0.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0050
            boolean r14 = r0.booleanValue()
        L_0x0050:
            java.lang.Object r10 = r2.A01
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r7 = r2.A02
            X.5mX r7 = (X.C294485mX) r7
            java.lang.Object r8 = r2.A03
            X.YBJ r8 = (X.YBJ) r8
            java.lang.Object r12 = r2.A05
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r9 = r2.A06
            com.instagram.api.schemas.LimitedInteractionsVersions r9 = (com.instagram.api.schemas.LimitedInteractionsVersions) r9
            boolean r13 = r2.A07
            r0 = 5
            X.0qQ.A0B(r9, r0)
            X.GnL r6 = new X.GnL
            r6.<init>((X.C294485mX) r7, (X.YBJ) r8, (com.instagram.api.schemas.LimitedInteractionsVersions) r9, (java.lang.Boolean) r10, (java.lang.Long) r11, (java.lang.Long) r12, (boolean) r13, (boolean) r14)
            r5.Epw(r6)
            X.GnL r0 = X.G9w.A0P(r5)
            java.lang.Object r0 = r0.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x00c2
            com.instagram.common.session.UserSession r0 = r4.A02
            X.0wc r6 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r4 = r4.A00
            X.GnL r0 = X.G9w.A0P(r5)
            java.lang.Object r2 = r0.A06
            com.instagram.api.schemas.LimitedInteractionsVersions r2 = (com.instagram.api.schemas.LimitedInteractionsVersions) r2
            X.GnL r0 = X.G9w.A0P(r5)
            java.lang.Object r0 = r0.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "reminder_date"
            r3.put(r0, r1)
            X.C51975G9x.A1B(r2, r3)
            X.C51975G9x.A1K(r3)
            java.lang.String r0 = "instagram_wellbeing_limited_interactions_action"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r6, r0)
            X.G9w.A1C(r2, r4)
            r0 = 4157(0x103d, float:5.825E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "step"
            X.C51969G9p.A1F(r2, r0, r1, r3)
            r2.Cgf()
        L_0x00c2:
            X.0gF r6 = X.C60340gF.A00
        L_0x00c4:
            return r6
        L_0x00c5:
            X.0eS.A00(r2)
            X.05G r8 = r15.A01
            java.lang.Object r2 = r8.getValue()
            if (r2 == 0) goto L_0x00c2
            X.GnL r2 = X.G9w.A0P(r8)
            java.lang.Object r2 = r2.A04
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x00e3
            long r4 = r2.longValue()
            int r2 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x00e3
            goto L_0x00c2
        L_0x00e3:
            X.GnL r2 = X.G9w.A0P(r8)
            java.lang.Object r2 = r2.A01
            boolean r2 = X.AnonymousClass7TF.A1Y(r2, r14)
            if (r2 != 0) goto L_0x0113
            r16 = 0
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r7.A02 = r15
            r7.A01 = r0
            r7.A00 = r3
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r2
            r23 = r7
            java.lang.Object r2 = r15.A01(r16, r17, r18, r19, r20, r21, r22, r23)
            if (r2 == r6) goto L_0x00c4
            r4 = r15
            goto L_0x0031
        L_0x0113:
            r4 = r15
            goto L_0x0035
        L_0x0116:
            X.Il4 r7 = new X.Il4
            r7.<init>(r15, r6, r3)
            goto L_0x001d
        L_0x011d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A03(X.4D7, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r22, long r23, long r25, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r21 = this;
            r2 = r23
            r0 = r25
            r8 = r33
            r9 = r22
            boolean r4 = r9 instanceof X.C58066Iky
            r7 = r21
            if (r4 == 0) goto L_0x00af
            r10 = r9
            X.Iky r10 = (X.C58066Iky) r10
            int r6 = r10.A00
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r6 & r5
            if (r4 == 0) goto L_0x00af
            int r6 = r6 - r5
            r10.A00 = r6
        L_0x001c:
            java.lang.Object r4 = r10.A07
            X.1Hj r9 = X.1Hj.A02
            int r5 = r10.A00
            r6 = 1
            if (r5 == 0) goto L_0x006e
            if (r5 != r6) goto L_0x00b6
            boolean r8 = r10.A06
            long r0 = r10.A01
            r27 = 0
            java.lang.Object r5 = r10.A05
            X.05G r5 = (X.05G) r5
            java.lang.Object r14 = r10.A04
            X.Goe r14 = (X.C53446Goe) r14
            java.lang.Object r13 = r10.A03
            X.5mW r13 = (X.C294475mW) r13
            java.lang.Object r7 = r10.A02
            X.GnL r7 = (X.C53389GnL) r7
            X.0eS.A00(r4)
        L_0x0040:
            long r2 = X.AnonymousClass7TE.A0R(r4)
        L_0x0044:
            if (r8 == 0) goto L_0x006b
            com.instagram.api.schemas.LimitedInteractionsVersions r15 = com.instagram.api.schemas.LimitedInteractionsVersions.V2_CUSTOMIZABLE
        L_0x0048:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r27)
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            boolean r0 = r7.A08
            X.GnL r12 = new X.GnL
            r17 = r4
            r18 = r2
            r19 = r6
            r20 = r0
            r12.<init>((X.C294485mX) r13, (X.YBJ) r14, (com.instagram.api.schemas.LimitedInteractionsVersions) r15, (java.lang.Boolean) r16, (java.lang.Long) r17, (java.lang.Long) r18, (boolean) r19, (boolean) r20)
            r5.Epw(r12)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x006b:
            com.instagram.api.schemas.LimitedInteractionsVersions r15 = com.instagram.api.schemas.LimitedInteractionsVersions.V2_NOT_CUSTOMIZABLE
            goto L_0x0048
        L_0x006e:
            X.0eS.A00(r4)
            X.05G r5 = r7.A01
            X.GnL r7 = X.G9w.A0P(r5)
            X.5mW r13 = new X.5mW
            r12 = r28
            r11 = r29
            r4 = r30
            r13.<init>(r11, r4, r12)
            X.Goe r14 = new X.Goe
            r11 = r31
            r4 = r32
            r14.<init>(r4, r11)
            if (r27 != 0) goto L_0x0044
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r10.A02 = r7
            r10.A03 = r13
            r10.A04 = r14
            r10.A05 = r5
            r10.A01 = r0
            r10.A06 = r8
            r10.A00 = r6
            java.lang.Long r4 = A00(r4, r2)
            if (r4 != r9) goto L_0x00ac
            return r9
        L_0x00ac:
            r27 = 0
            goto L_0x0040
        L_0x00af:
            X.Iky r10 = new X.Iky
            r10.<init>(r7, r9)
            goto L_0x001c
        L_0x00b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A04(X.4D7, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r17v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass4D7 r19, X.0sP r20) {
        /*
            r18 = this;
            r3 = r20
            r4 = 6
            r5 = r19
            boolean r0 = X.C66132MDk.A01(r4, r5)
            r9 = r18
            if (r0 == 0) goto L_0x0136
            r6 = r5
            X.MDk r6 = (X.C66132MDk) r6
            int r2 = r6.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0136
            int r2 = r2 - r1
            r6.A01 = r2
        L_0x001b:
            java.lang.Object r1 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r2 = r6.A01
            r0 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00a1
            if (r2 != r4) goto L_0x013d
            int r2 = r6.A00
            java.lang.Object r3 = r6.A03
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r6 = r6.A02
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r6 = (com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository) r6
            X.0eS.A00(r1)
        L_0x0034:
            boolean r5 = r1 instanceof X.C239793Ih
            if (r5 == 0) goto L_0x0098
            boolean r1 = X.AnonymousClass7TF.A1Q(r2)
            X.C51968G9o.A1O(r3, r1)
            X.05G r5 = r6.A01
            java.lang.Object r1 = r5.getValue()
            X.GnL r1 = (X.C53389GnL) r1
            if (r2 == 0) goto L_0x004a
            r4 = 0
        L_0x004a:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r8 = r1.A02
            X.5mX r8 = (X.C294485mX) r8
            java.lang.Object r9 = r1.A03
            X.YBJ r9 = (X.YBJ) r9
            java.lang.Object r12 = r1.A04
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r13 = r1.A05
            java.lang.Long r13 = (java.lang.Long) r13
            java.lang.Object r10 = r1.A06
            com.instagram.api.schemas.LimitedInteractionsVersions r10 = (com.instagram.api.schemas.LimitedInteractionsVersions) r10
            boolean r14 = r1.A07
            boolean r15 = r1.A08
            r1 = 5
            X.0qQ.A0B(r10, r1)
            X.GnL r7 = new X.GnL
            r7.<init>((X.C294485mX) r8, (X.YBJ) r9, (com.instagram.api.schemas.LimitedInteractionsVersions) r10, (java.lang.Boolean) r11, (java.lang.Long) r12, (java.lang.Long) r13, (boolean) r14, (boolean) r15)
            r5.Epw(r7)
            X.I4R r7 = X.I4R.A00
            com.instagram.common.session.UserSession r1 = r6.A02
            X.0wc r4 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r3 = r6.A00
            X.GnL r1 = X.G9w.A0P(r5)
            java.lang.Object r2 = r1.A06
            com.instagram.api.schemas.LimitedInteractionsVersions r2 = (com.instagram.api.schemas.LimitedInteractionsVersions) r2
            X.GnL r1 = X.G9w.A0P(r5)
            java.lang.Object r1 = r1.A01
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x0092
            boolean r0 = r1.booleanValue()
        L_0x0092:
            r7.A02(r2, r4, r3, r0)
        L_0x0095:
            X.0gF r5 = X.C60340gF.A00
        L_0x0097:
            return r5
        L_0x0098:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0095
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a1:
            X.0eS.A00(r1)
            X.05G r8 = r9.A01
            X.GnL r1 = X.G9w.A0P(r8)
            java.lang.Object r1 = r1.A01
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = X.AnonymousClass7TG.A1X(r1)
            java.lang.Boolean r10 = X.DbT.A0l(r2)
            X.GnL r1 = X.G9w.A0P(r8)
            java.lang.Object r1 = r1.A02
            X.5mX r1 = (X.C294485mX) r1
            r15 = 0
            if (r1 == 0) goto L_0x0134
            X.5mW r1 = (X.C294475mW) r1
            boolean r1 = r1.A02
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
        L_0x00c9:
            X.GnL r1 = X.G9w.A0P(r8)
            java.lang.Object r1 = r1.A02
            X.5mX r1 = (X.C294485mX) r1
            if (r1 == 0) goto L_0x0132
            X.5mW r1 = (X.C294475mW) r1
            boolean r1 = r1.A00
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
        L_0x00db:
            X.GnL r1 = X.G9w.A0P(r8)
            java.lang.Object r1 = r1.A02
            X.5mX r1 = (X.C294485mX) r1
            if (r1 == 0) goto L_0x0130
            X.5mW r1 = (X.C294475mW) r1
            boolean r1 = r1.A01
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r1)
        L_0x00ed:
            X.GnL r1 = X.G9w.A0P(r8)
            java.lang.Object r7 = r1.A04
            java.lang.Long r7 = (java.lang.Long) r7
            X.GnL r1 = X.G9w.A0P(r8)
            java.lang.Object r1 = r1.A03
            X.YBJ r1 = (X.YBJ) r1
            if (r1 == 0) goto L_0x012e
            X.Goe r1 = (X.C53446Goe) r1
            boolean r1 = r1.A01
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
        L_0x0107:
            X.GnL r1 = X.G9w.A0P(r8)
            java.lang.Object r1 = r1.A03
            X.YBJ r1 = (X.YBJ) r1
            if (r1 == 0) goto L_0x0119
            X.Goe r1 = (X.C53446Goe) r1
            boolean r1 = r1.A00
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r1)
        L_0x0119:
            r6.A02 = r9
            r6.A03 = r3
            r6.A00 = r2
            r6.A01 = r4
            r16 = r7
            r17 = r6
            java.lang.Object r1 = r9.A01(r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 == r5) goto L_0x0097
            r6 = r9
            goto L_0x0034
        L_0x012e:
            r14 = r15
            goto L_0x0107
        L_0x0130:
            r13 = r15
            goto L_0x00ed
        L_0x0132:
            r12 = r15
            goto L_0x00db
        L_0x0134:
            r11 = r15
            goto L_0x00c9
        L_0x0136:
            X.MDk r6 = new X.MDk
            r6.<init>(r9, r5, r4)
            goto L_0x001b
        L_0x013d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A05(X.4D7, X.0sP):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if ((r0 instanceof X.C239793Ih) == false) goto L_0x00d7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(X.AnonymousClass4D7 r26, boolean r27, boolean r28) {
        /*
            r25 = this;
            r3 = r26
            r6 = r27
            r5 = r28
            boolean r0 = r3 instanceof X.C58060Iks
            r7 = r25
            if (r0 == 0) goto L_0x0141
            r4 = r3
            X.Iks r4 = (X.C58060Iks) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0141
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r0 = r4.A05
            X.1Hj r3 = X.1Hj.A02
            int r2 = r4.A00
            r15 = 0
            r1 = 1
            if (r2 == 0) goto L_0x00df
            if (r2 != r1) goto L_0x0148
            boolean r5 = r4.A04
            boolean r6 = r4.A03
            java.lang.Object r2 = r4.A02
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Object r3 = r4.A01
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r3 = (com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository) r3
            X.0eS.A00(r0)
        L_0x0035:
            boolean r0 = r0 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d7
        L_0x0039:
            X.05G r0 = r3.A01
            java.lang.Object r7 = r0.getValue()
            X.GnL r7 = (X.C53389GnL) r7
            X.GnL r4 = X.G9w.A0P(r0)
            java.lang.Object r4 = r4.A03
            if (r4 == 0) goto L_0x00dc
            X.Goe r9 = new X.Goe
            r9.<init>(r5, r6)
        L_0x004e:
            if (r2 == 0) goto L_0x0054
            boolean r15 = r2.booleanValue()
        L_0x0054:
            java.lang.Object r11 = r7.A01
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Object r8 = r7.A02
            X.5mX r8 = (X.C294485mX) r8
            java.lang.Object r12 = r7.A04
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r13 = r7.A05
            java.lang.Long r13 = (java.lang.Long) r13
            java.lang.Object r10 = r7.A06
            com.instagram.api.schemas.LimitedInteractionsVersions r10 = (com.instagram.api.schemas.LimitedInteractionsVersions) r10
            boolean r14 = r7.A07
            r4 = 5
            X.0qQ.A0B(r10, r4)
            X.GnL r7 = new X.GnL
            r7.<init>((X.C294485mX) r8, (X.YBJ) r9, (com.instagram.api.schemas.LimitedInteractionsVersions) r10, (java.lang.Boolean) r11, (java.lang.Long) r12, (java.lang.Long) r13, (boolean) r14, (boolean) r15)
            r0.Epw(r7)
            boolean r1 = X.AnonymousClass7TF.A1Y(r2, r1)
            if (r1 == 0) goto L_0x00d7
            com.instagram.common.session.UserSession r1 = r3.A02
            X.0wc r7 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r6 = r3.A00
            X.GnL r1 = X.G9w.A0P(r0)
            java.lang.Object r5 = r1.A06
            com.instagram.api.schemas.LimitedInteractionsVersions r5 = (com.instagram.api.schemas.LimitedInteractionsVersions) r5
            X.GnL r0 = X.G9w.A0P(r0)
            java.lang.Object r4 = r0.A03
            X.YBJ r4 = (X.YBJ) r4
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r0 = 0
            if (r4 == 0) goto L_0x00da
            r1 = r4
            X.Goe r1 = (X.C53446Goe) r1
            boolean r1 = r1.A01
        L_0x00a0:
            java.lang.String r2 = java.lang.Boolean.toString(r1)
            X.0qQ.A07(r2)
            java.lang.String r1 = "some_interactions"
            r3.put(r1, r2)
            if (r4 == 0) goto L_0x00b2
            X.Goe r4 = (X.C53446Goe) r4
            boolean r0 = r4.A00
        L_0x00b2:
            java.lang.String r1 = java.lang.Boolean.toString(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = "most_interactions"
            r3.put(r0, r1)
            X.C51975G9x.A1B(r5, r3)
            X.C51975G9x.A1K(r3)
            java.lang.String r0 = "instagram_wellbeing_limited_interactions_action"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r7, r0)
            X.G9w.A1C(r2, r6)
            java.lang.String r1 = "update_what_to_limit"
            java.lang.String r0 = "step"
            X.C51969G9p.A1F(r2, r0, r1, r3)
            r2.Cgf()
        L_0x00d7:
            X.0gF r3 = X.C60340gF.A00
        L_0x00d9:
            return r3
        L_0x00da:
            r1 = 0
            goto L_0x00a0
        L_0x00dc:
            r9 = 0
            goto L_0x004e
        L_0x00df:
            X.0eS.A00(r0)
            X.05G r8 = r7.A01
            java.lang.Object r0 = r8.getValue()
            if (r0 == 0) goto L_0x00d7
            X.GnL r0 = X.G9w.A0P(r8)
            java.lang.Object r0 = r0.A03
            if (r0 == 0) goto L_0x00d7
            X.GnL r0 = X.G9w.A0P(r8)
            java.lang.Object r2 = r0.A03
            X.YBJ r2 = (X.YBJ) r2
            if (r2 == 0) goto L_0x00d7
            X.Goe r2 = (X.C53446Goe) r2
            boolean r0 = r2.A00
            if (r5 != r0) goto L_0x0107
            boolean r0 = r2.A01
            if (r6 != r0) goto L_0x0107
            goto L_0x00d7
        L_0x0107:
            X.GnL r0 = X.G9w.A0P(r8)
            java.lang.Object r2 = r0.A01
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = X.AnonymousClass7TF.A1Y(r2, r15)
            if (r0 != 0) goto L_0x013e
            r17 = 0
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r5)
            r4.A01 = r7
            r4.A02 = r2
            r4.A03 = r6
            r4.A04 = r5
            r4.A00 = r1
            r18 = r17
            r19 = r17
            r20 = r17
            r23 = r17
            r24 = r4
            r16 = r7
            java.lang.Object r0 = r16.A01(r17, r18, r19, r20, r21, r22, r23, r24)
            if (r0 == r3) goto L_0x00d9
            r3 = r7
            goto L_0x0035
        L_0x013e:
            r3 = r7
            goto L_0x0039
        L_0x0141:
            X.Iks r4 = new X.Iks
            r4.<init>(r7, r3)
            goto L_0x001a
        L_0x0148:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A06(X.4D7, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if ((r0 instanceof X.C239793Ih) == false) goto L_0x00f2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(X.AnonymousClass4D7 r20, boolean r21, boolean r22, boolean r23) {
        /*
            r19 = this;
            r3 = r20
            r7 = r21
            r6 = r22
            r5 = r23
            boolean r0 = r3 instanceof X.C58064Ikw
            r10 = r19
            if (r0 == 0) goto L_0x0162
            r8 = r3
            X.Ikw r8 = (X.C58064Ikw) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0162
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001c:
            java.lang.Object r0 = r8.A06
            X.1Hj r4 = X.1Hj.A02
            int r1 = r8.A00
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L_0x00fc
            if (r1 != r2) goto L_0x0169
            boolean r5 = r8.A05
            boolean r6 = r8.A04
            boolean r7 = r8.A03
            java.lang.Object r1 = r8.A02
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r4 = r8.A01
            com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository r4 = (com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository) r4
            X.0eS.A00(r0)
        L_0x0039:
            boolean r0 = r0 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00f2
        L_0x003d:
            X.05G r0 = r4.A01
            java.lang.Object r9 = r0.getValue()
            X.GnL r9 = (X.C53389GnL) r9
            X.GnL r8 = X.G9w.A0P(r0)
            java.lang.Object r8 = r8.A02
            if (r8 == 0) goto L_0x00f9
            X.5mW r10 = new X.5mW
            r10.<init>(r7, r5, r6)
        L_0x0052:
            if (r1 == 0) goto L_0x0058
            boolean r3 = r1.booleanValue()
        L_0x0058:
            java.lang.Object r13 = r9.A01
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            java.lang.Object r11 = r9.A03
            X.YBJ r11 = (X.YBJ) r11
            java.lang.Object r14 = r9.A04
            java.lang.Long r14 = (java.lang.Long) r14
            java.lang.Object r15 = r9.A05
            java.lang.Long r15 = (java.lang.Long) r15
            java.lang.Object r12 = r9.A06
            com.instagram.api.schemas.LimitedInteractionsVersions r12 = (com.instagram.api.schemas.LimitedInteractionsVersions) r12
            boolean r6 = r9.A07
            r5 = 5
            X.0qQ.A0B(r12, r5)
            X.GnL r9 = new X.GnL
            r17 = r3
            r16 = r6
            r9.<init>((X.C294485mX) r10, (X.YBJ) r11, (com.instagram.api.schemas.LimitedInteractionsVersions) r12, (java.lang.Boolean) r13, (java.lang.Long) r14, (java.lang.Long) r15, (boolean) r16, (boolean) r17)
            r0.Epw(r9)
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r2)
            if (r1 == 0) goto L_0x00f2
            com.instagram.common.session.UserSession r1 = r4.A02
            X.0wc r5 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r4 = r4.A00
            X.GnL r1 = X.G9w.A0P(r0)
            java.lang.Object r6 = r1.A06
            com.instagram.api.schemas.LimitedInteractionsVersions r6 = (com.instagram.api.schemas.LimitedInteractionsVersions) r6
            X.GnL r0 = X.G9w.A0P(r0)
            java.lang.Object r7 = r0.A02
            X.5mX r7 = (X.C294485mX) r7
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            r0 = 0
            if (r7 == 0) goto L_0x00f7
            r1 = r7
            X.5mW r1 = (X.C294475mW) r1
            boolean r1 = r1.A00
        L_0x00a8:
            java.lang.String r2 = java.lang.Boolean.toString(r1)
            X.0qQ.A07(r2)
            java.lang.String r1 = "new_followers"
            r3.put(r1, r2)
            if (r7 == 0) goto L_0x00f5
            r1 = r7
            X.5mW r1 = (X.C294475mW) r1
            boolean r1 = r1.A02
        L_0x00bb:
            java.lang.String r2 = java.lang.Boolean.toString(r1)
            X.0qQ.A07(r2)
            java.lang.String r1 = "non_followers"
            r3.put(r1, r2)
            if (r7 == 0) goto L_0x00cd
            X.5mW r7 = (X.C294475mW) r7
            boolean r0 = r7.A01
        L_0x00cd:
            java.lang.String r1 = java.lang.Boolean.toString(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = "non_close_friends"
            r3.put(r0, r1)
            X.C51975G9x.A1B(r6, r3)
            X.C51975G9x.A1K(r3)
            java.lang.String r0 = "instagram_wellbeing_limited_interactions_action"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r5, r0)
            X.G9w.A1C(r2, r4)
            java.lang.String r1 = "update_who_to_limit"
            java.lang.String r0 = "step"
            X.C51969G9p.A1F(r2, r0, r1, r3)
            r2.Cgf()
        L_0x00f2:
            X.0gF r4 = X.C60340gF.A00
        L_0x00f4:
            return r4
        L_0x00f5:
            r1 = 0
            goto L_0x00bb
        L_0x00f7:
            r1 = 0
            goto L_0x00a8
        L_0x00f9:
            r10 = 0
            goto L_0x0052
        L_0x00fc:
            X.0eS.A00(r0)
            X.05G r9 = r10.A01
            java.lang.Object r0 = r9.getValue()
            if (r0 == 0) goto L_0x00f2
            X.GnL r0 = X.G9w.A0P(r9)
            java.lang.Object r0 = r0.A02
            if (r0 == 0) goto L_0x00f2
            X.GnL r0 = X.G9w.A0P(r9)
            java.lang.Object r1 = r0.A02
            X.5mX r1 = (X.C294485mX) r1
            if (r1 == 0) goto L_0x00f2
            X.5mW r1 = (X.C294475mW) r1
            boolean r0 = r1.A00
            if (r7 != r0) goto L_0x0128
            boolean r0 = r1.A02
            if (r6 != r0) goto L_0x0128
            boolean r0 = r1.A01
            if (r5 != r0) goto L_0x0128
            goto L_0x00f2
        L_0x0128:
            X.GnL r0 = X.G9w.A0P(r9)
            java.lang.Object r1 = r0.A01
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r3)
            if (r0 != 0) goto L_0x015f
            r11 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r5)
            r8.A01 = r10
            r8.A02 = r1
            r8.A03 = r7
            r8.A04 = r6
            r8.A05 = r5
            r8.A00 = r2
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r8
            java.lang.Object r0 = r10.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r0 == r4) goto L_0x00f4
            r4 = r10
            goto L_0x0039
        L_0x015f:
            r4 = r10
            goto L_0x003d
        L_0x0162:
            X.Ikw r8 = new X.Ikw
            r8.<init>(r10, r3)
            goto L_0x001c
        L_0x0169:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository.A07(X.4D7, boolean, boolean, boolean):java.lang.Object");
    }

    public static final Long A00(Long l, Long l2) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        long A0P = AnonymousClass7TE.A0P(currentTimeMillis - ((((long) TimeZone.getDefault().getOffset(currentTimeMillis)) + currentTimeMillis) % 86400000));
        if (l != null) {
            long longValue = l.longValue();
            if (!new Integer((int) longValue).equals(new Integer(0)) && l2 != null) {
                j = longValue - l2.longValue();
                return new Long(A0P + j);
            }
        }
        j = 604800;
        return new Long(A0P + j);
    }
}
