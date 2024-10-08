package X;

import java.util.Map;

/* renamed from: X.DEl  reason: case insensitive filesystem */
public final class C45906DEl implements 1MD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C45906DEl(SIS sis, C11214SFo sFo, String str, int i) {
        this.A00 = i;
        this.A01 = sis;
        switch (i) {
            case 1:
            case 2:
                this.A03 = str;
                this.A02 = sFo;
                break;
            default:
                this.A02 = sFo;
                this.A03 = str;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0119, code lost:
        if (r1.length() != 0) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0137, code lost:
        if (r1.length() != 0) goto L_0x013a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0311;
                case 1: goto L_0x02af;
                case 2: goto L_0x0250;
                case 3: goto L_0x01db;
                case 4: goto L_0x00ad;
                case 5: goto L_0x0059;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.34S r11 = (X.AnonymousClass34S) r11
            java.lang.Object r0 = r10.A01
            X.SIS r0 = (X.SIS) r0
            X.RvS r1 = r0.A02
            java.lang.Object r6 = r11.A01
            X.S4g r6 = (X.S4g) r6
            java.lang.Object r0 = r10.A02
            X.SFo r0 = (X.C11214SFo) r0
            java.lang.String r7 = r10.A03
            java.lang.Object r5 = r11.A00
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map r0 = r0.A08
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.common.session.UserSession r0 = r1.A00
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = r0.A06
            java.lang.Class<X.CxC> r0 = X.C45476CxC.class
            java.lang.Object r3 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004c }
            X.DG0 r3 = (X.DG0) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x004c }
            X.QNI r2 = new X.QNI
            r2.<init>()
            A00(r2, r1, r5, r7, r4)
            X.2IS r1 = r3.A00
            java.lang.String r0 = "input"
            r1.A00(r2, r0)
            r0 = 1
            r3.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r3 = r3.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C41847B3o.A0t()
            r1 = 3
            goto L_0x02f7
        L_0x004c:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0052:
            java.lang.String r0 = "No user session found"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0059:
            X.34S r11 = (X.AnonymousClass34S) r11
            java.lang.Object r0 = r10.A01
            X.SIS r0 = (X.SIS) r0
            X.RvS r1 = r0.A02
            java.lang.Object r6 = r11.A01
            X.S4g r6 = (X.S4g) r6
            java.lang.Object r0 = r10.A02
            X.SFo r0 = (X.C11214SFo) r0
            java.lang.String r7 = r10.A03
            java.lang.Object r5 = r11.A00
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map r0 = r0.A08
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.common.session.UserSession r0 = r1.A00
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = r0.A06
            java.lang.Class<X.CxD> r0 = X.C45477CxD.class
            java.lang.Object r3 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00a0 }
            X.DG1 r3 = (X.DG1) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x00a0 }
            X.QNI r2 = new X.QNI
            r2.<init>()
            A00(r2, r1, r5, r7, r4)
            X.2IS r1 = r3.A00
            java.lang.String r0 = "input"
            r1.A00(r2, r0)
            r0 = 1
            r3.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r3 = r3.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C41847B3o.A0t()
            r1 = 2
            goto L_0x02f7
        L_0x00a0:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x00a6:
            java.lang.String r0 = "No user session found"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x00ad:
            X.34S r11 = (X.AnonymousClass34S) r11
            java.lang.Object r0 = r10.A01
            X.SIS r0 = (X.SIS) r0
            X.RvS r1 = r0.A02
            java.lang.Object r4 = r11.A01
            X.S4g r4 = (X.S4g) r4
            java.lang.Object r0 = r10.A02
            X.SFo r0 = (X.C11214SFo) r0
            java.lang.String r6 = r0.A03
            java.lang.String r8 = r10.A03
            java.lang.Object r2 = r11.A00
            r2.getClass()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r0 = r0.A08
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.common.session.UserSession r0 = r1.A00
            if (r0 == 0) goto L_0x018b
            java.lang.String r7 = r0.A06
            X.Szq r5 = X.C12607Szq.A00
            java.lang.String r0 = "0"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x018d
            X.QNI r3 = new X.QNI
            r3.<init>()
            X.C41848B3p.A1N(r3)
            java.lang.String r1 = X.C2818159r.A04(r9)
            java.lang.String r0 = "logging_id"
            r3.A07(r1, r0)
            java.lang.String r0 = "payment_type"
            r3.A07(r8, r0)
            java.lang.String r0 = "platform_trust_token"
            r3.A07(r2, r0)
            r2 = 0
            X.0qQ.A0B(r9, r2)
            r0 = 805(0x325, float:1.128E-42)
            java.lang.String r8 = X.C273654mx.A00(r0)
            boolean r0 = r9.containsKey(r8)
            if (r0 == 0) goto L_0x011b
            java.lang.Object r0 = r9.get(r8)
            com.facebookpay.logging.FBPayLoggerData r0 = (com.facebookpay.logging.FBPayLoggerData) r0
            if (r0 == 0) goto L_0x0186
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x011b
            int r0 = r1.length()
            if (r0 != 0) goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            java.lang.String r0 = "product_id"
            r3.A07(r1, r0)
            boolean r0 = r9.containsKey(r8)
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r9.get(r8)
            com.facebookpay.logging.FBPayLoggerData r0 = (com.facebookpay.logging.FBPayLoggerData) r0
            if (r0 == 0) goto L_0x0181
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x0139
            int r0 = r1.length()
            if (r0 != 0) goto L_0x013a
        L_0x0139:
            r1 = 0
        L_0x013a:
            java.lang.String r0 = "receiver_id"
            r3.A07(r1, r0)
            java.lang.String r0 = "actor_id"
            r3.A07(r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0153
            r0 = 275(0x113, float:3.85E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r3.A07(r6, r0)
        L_0x0153:
            java.lang.Class<X.CxH> r1 = X.C45481CxH.class
            java.lang.String r0 = "create"
            java.lang.Object r2 = X.C41847B3o.A17(r1, r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x017b }
            X.DG5 r2 = (X.DG5) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x017b }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            r1.A00(r3, r0)
            r0 = 1
            r2.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r3 = r2.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C41847B3o.A0t()
            r1 = 7
            X.DGZ r0 = new X.DGZ
            r0.<init>(r1)
            X.Qna r0 = X.C8294Qna.A01(r4, r2, r3, r0, r5)
            goto L_0x0300
        L_0x017b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0181:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0186:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x018b:
            X.Szr r5 = X.Szr.A00
        L_0x018d:
            X.QNI r3 = new X.QNI
            r3.<init>()
            X.C41848B3p.A1N(r3)
            java.lang.String r0 = "payment_type"
            r3.A07(r8, r0)
            java.lang.String r0 = "platform_trust_token"
            r3.A07(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x01ae
            r0 = 833(0x341, float:1.167E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r3.A07(r6, r0)
        L_0x01ae:
            java.lang.Class<X.Cx5> r0 = X.C45469Cx5.class
            java.lang.Object r2 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01d5 }
            X.DFt r2 = (X.C45939DFt) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x01d5 }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "data"
            r1.A00(r3, r0)
            r0 = 1
            r2.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r3 = r2.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C41847B3o.A0t()
            r1 = 8
            X.DGZ r0 = new X.DGZ
            r0.<init>(r1)
            X.Qna r0 = X.C8294Qna.A01(r4, r2, r3, r0, r5)
            goto L_0x0300
        L_0x01d5:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x01db:
            X.34S r11 = (X.AnonymousClass34S) r11
            java.lang.Object r0 = r10.A01
            X.SIS r0 = (X.SIS) r0
            X.RvS r1 = r0.A02
            java.lang.Object r6 = r11.A01
            X.S4g r6 = (X.S4g) r6
            java.lang.Object r0 = r10.A02
            X.SFo r0 = (X.C11214SFo) r0
            java.lang.String r5 = r10.A03
            java.lang.Object r7 = r11.A00
            r7.getClass()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r0 = r0.A08
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.common.session.UserSession r0 = r1.A00
            if (r0 == 0) goto L_0x0249
            java.lang.String r2 = r0.A06
            X.QNI r3 = new X.QNI
            r3.<init>()
            X.C41848B3p.A1N(r3)
            java.lang.String r1 = "NUM_4_DIGITS"
            java.lang.String r0 = "format_type"
            r3.A07(r1, r0)
            java.lang.String r1 = X.C2818159r.A04(r4)
            java.lang.String r0 = "logging_id"
            r3.A07(r1, r0)
            java.lang.String r0 = "actor_id"
            r3.A07(r2, r0)
            java.lang.String r0 = "platform_trust_token"
            r3.A07(r7, r0)
            java.lang.String r0 = "payment_type"
            r3.A07(r5, r0)
            java.lang.Class<X.Cx7> r0 = X.C45471Cx7.class
            java.lang.Object r2 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0243 }
            X.DFv r2 = (X.C45941DFv) r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0243 }
            X.2IS r1 = r2.A00
            java.lang.String r0 = "input"
            r1.A00(r3, r0)
            r1 = 1
            r2.A01 = r1
            com.facebook.pando.PandoGraphQLRequest r3 = r2.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C41847B3o.A0t()
            goto L_0x02f7
        L_0x0243:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0249:
            java.lang.String r0 = "No user session found"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0250:
            X.34S r11 = (X.AnonymousClass34S) r11
            java.lang.Object r0 = r10.A01
            X.SIS r0 = (X.SIS) r0
            X.RvS r1 = r0.A02
            java.lang.Object r5 = r11.A01
            X.S4g r5 = (X.S4g) r5
            java.lang.String r7 = r10.A03
            java.lang.Object r6 = r11.A00
            r6.getClass()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r10.A02
            X.SFo r0 = (X.C11214SFo) r0
            java.util.Map r0 = r0.A08
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.common.session.UserSession r0 = r1.A00
            if (r0 == 0) goto L_0x02a8
            java.lang.String r1 = r0.A06
            java.lang.Class<X.Cx6> r0 = X.C45470Cx6.class
            java.lang.Object r3 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x02a2 }
            X.DFu r3 = (X.C45940DFu) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x02a2 }
            X.QNI r2 = new X.QNI
            r2.<init>()
            A00(r2, r1, r6, r7, r4)
            X.2IS r1 = r3.A00
            java.lang.String r0 = "input"
            r1.A00(r2, r0)
            r0 = 1
            r3.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r3 = r3.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C41847B3o.A0t()
            r1 = 5
            X.DGZ r0 = new X.DGZ
            r0.<init>(r1)
            X.Qna r0 = X.C8294Qna.A00(r5, r2, r3, r0)
            goto L_0x0300
        L_0x02a2:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x02a8:
            java.lang.String r0 = "No user session found"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x02af:
            X.34S r11 = (X.AnonymousClass34S) r11
            java.lang.Object r0 = r10.A01
            X.SIS r0 = (X.SIS) r0
            X.RvS r1 = r0.A02
            java.lang.Object r6 = r11.A01
            X.S4g r6 = (X.S4g) r6
            java.lang.String r7 = r10.A03
            java.lang.Object r5 = r11.A00
            r5.getClass()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r10.A02
            X.SFo r0 = (X.C11214SFo) r0
            java.util.Map r0 = r0.A08
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r0)
            com.instagram.common.session.UserSession r0 = r1.A00
            if (r0 == 0) goto L_0x030a
            java.lang.String r1 = r0.A06
            java.lang.Class<X.Cx6> r0 = X.C45470Cx6.class
            java.lang.Object r3 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0304 }
            X.DFu r3 = (X.C45940DFu) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0304 }
            X.QNI r2 = new X.QNI
            r2.<init>()
            A00(r2, r1, r5, r7, r4)
            X.2IS r1 = r3.A00
            java.lang.String r0 = "input"
            r1.A00(r2, r0)
            r0 = 1
            r3.A01 = r0
            com.facebook.pando.PandoGraphQLRequest r3 = r3.build()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C41847B3o.A0t()
            r1 = 4
        L_0x02f7:
            X.DGZ r0 = new X.DGZ
            r0.<init>(r1)
            X.Qna r0 = X.C8294Qna.A00(r6, r2, r3, r0)
        L_0x0300:
            X.0qQ.A0A(r0)
            return r0
        L_0x0304:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x030a:
            java.lang.String r0 = "No user session found"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0311:
            X.S4g r11 = (X.S4g) r11
            java.lang.Object r0 = r10.A02
            X.Stw r0 = (X.Stw) r0
            X.0eM r0 = r0.A00
            r0.getValue()
            java.lang.String r5 = r10.A03
            r0 = 149(0x95, float:2.09E-43)
            java.lang.String r4 = X.Pxd.A00(r0)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r1 = 1
            java.lang.Class<X.CxU> r0 = X.C45494CxU.class
            java.lang.Object r3 = X.C41847B3o.A16(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x038e }
            X.DFo r3 = (X.C45934DFo) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x038e }
            X.2IS r2 = r3.A00
            java.lang.String r0 = "id"
            r2.A04(r0, r5)
            r3.A02 = r1
            r0 = 782(0x30e, float:1.096E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.A04(r0, r4)
            r3.A03 = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0 = 650(0x28a, float:9.11E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r0, r1)
            r0 = 653(0x28d, float:9.15E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r0, r1)
            r0 = 654(0x28e, float:9.16E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r0, r1)
            r0 = 656(0x290, float:9.19E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r0, r1)
            r0 = 652(0x28c, float:9.14E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r0, r1)
            r0 = 655(0x28f, float:9.18E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A02(r0, r1)
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r2 = X.C41847B3o.A0t()
            X.1Ef r1 = r3.build()
            X.DGN r0 = X.DGN.A00
            X.Qna r0 = X.C8294Qna.A00(r11, r2, r1, r0)
            return r0
        L_0x038e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45906DEl.apply(java.lang.Object):java.lang.Object");
    }

    public static void A00(QNI qni, String str, String str2, String str3, Map map) {
        qni.A07(AnonymousClass0HM.A00().toString(), "client_mutation_id");
        qni.A07(str, "actor_id");
        qni.A07(str2, "platform_trust_token");
        qni.A07(str3, "payment_type");
        qni.A07(C2818159r.A04(map), "logging_id");
    }

    public C45906DEl(Stw stw, Integer num, String str) {
        this.A00 = 0;
        this.A02 = stw;
        this.A03 = str;
        this.A01 = num;
    }
}
