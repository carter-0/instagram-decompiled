package com.instagram.creator.agent.disclosure.inthread.repository;

import X.1vn;
import X.AnonymousClass43D;
import X.C252733pa;

public final class CreatorAIFanNuxRepository extends C252733pa {
    public int A00;
    public final 1vn A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r5 = 7
            r6 = r20
            boolean r0 = X.C66143MDv.A02(r5, r6)
            r4 = r19
            if (r0 == 0) goto L_0x00d2
            r3 = r6
            X.MDv r3 = (X.C66143MDv) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d2
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r3.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0080
            if (r0 != r2) goto L_0x00db
            X.0eS.A00(r1)
        L_0x0027:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r5 = 0
            if (r0 == 0) goto L_0x0076
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x0075
            java.lang.Class<X.Bep> r2 = X.C42570Bep.class
            r4 = 0
            java.lang.String r1 = "fetch__IGUser(igid:$igid)"
            r0 = 603513248(0x23f8e1a0, float:2.698377E-17)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0075
            java.lang.Class<X.Beo> r2 = X.C42569Beo.class
            java.lang.String r1 = "creator_ai"
            r0 = -1067306903(0xffffffffc0623069, float:-3.5342047)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0075
            java.lang.Class<X.Ben> r2 = X.C42568Ben.class
            java.lang.String r1 = "fan_onboarding"
            r0 = -1317404271(0xffffffffb17a0191, float:-3.6380678E-9)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0075
            java.lang.Class<X.Bem> r2 = X.C42567Bem.class
            java.lang.String r1 = "embodiment_tooltip_content"
            r0 = 1556150894(0x5cc0fa6e, float:4.34548367E17)
            X.3lr r1 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = "body"
            java.lang.String r5 = r1.getOptionalStringField(r4, r0)
        L_0x0075:
            return r5
        L_0x0076:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0075
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0080:
            X.0eS.A00(r1)
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "igid"
            r7.A04(r0, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Beq> r12 = X.C42571Beq.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "CreatorAIEmbodimentTooltipContent"
            r13 = 0
            java.lang.String r17 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.1Ef r6 = r7.setMaxToleratedCacheAgeMs(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            X.1Ef r1 = r6.setFreshCacheAgeMs(r0)
            X.1vn r0 = r4.A01
            r3.A00 = r2
            java.lang.Object r1 = r0.A04(r1, r3)
            if (r1 != r5) goto L_0x0027
            return r5
        L_0x00d2:
            r0 = 42
            X.MDv r3 = new X.MDv
            r3.<init>(r4, r6, r5, r0)
            goto L_0x0019
        L_0x00db:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository.A01(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r22) {
        /*
            r21 = this;
            r3 = 49
            r6 = r22
            boolean r0 = X.C66128MDg.A01(r3, r6)
            r5 = r21
            if (r0 == 0) goto L_0x00e7
            r4 = r6
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e7
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0085
            if (r0 != r2) goto L_0x00ee
            java.lang.Object r5 = r4.A01
            com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository r5 = (com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository) r5
            X.0eS.A00(r1)
        L_0x002c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007f
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0077
            java.lang.Class<X.Bf3> r3 = X.Bf3.class
            r6 = 0
            java.lang.String r1 = "fetch__IGUser(igid:$igid)"
            r0 = 1058648099(0x3f19b023, float:0.6003439)
            X.3lr r4 = r4.getOptionalTreeField(r6, r1, r3, r0)
            if (r4 == 0) goto L_0x0077
            java.lang.Class<X.Bf2> r3 = X.C42583Bf2.class
            java.lang.String r1 = "creator_ai"
            r0 = 1907362462(0x71b00a9e, float:1.7434303E30)
            X.3lr r4 = r4.getOptionalTreeField(r6, r1, r3, r0)
            if (r4 == 0) goto L_0x0077
            java.lang.Class<X.Bf1> r3 = X.C42582Bf1.class
            java.lang.String r1 = "fan_onboarding"
            r0 = 586977721(0x22fc91b9, float:6.8459027E-18)
            X.3lr r1 = r4.getOptionalTreeField(r6, r1, r3, r0)
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = "has_accepted_tos(request:$request)"
            boolean r1 = r1.getCoercedBooleanField(r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0077
            if (r1 != 0) goto L_0x0075
            r2 = 2
        L_0x0075:
            r5.A00 = r2
        L_0x0077:
            int r1 = r5.A00
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            return r0
        L_0x007f:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0077
            r2 = 0
            goto L_0x0075
        L_0x0085:
            X.0eS.A00(r1)
            int r0 = r5.A00
            if (r0 != 0) goto L_0x0077
            X.1vn r1 = r5.A01
            r16 = 0
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r9 = new X.2IS
            r9.<init>()
            java.lang.String r6 = r5.A02
            java.lang.String r0 = "igid"
            r8.A04(r0, r6)
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r6 = "BETA_02_24"
            java.lang.String r0 = "terms_type"
            X.0Df r7 = r7.A02()
            X.0Df.A00(r7, r6, r0)
            java.lang.String r6 = "request"
            X.2IV r0 = r8.A00
            X.0Df r0 = r0.A02()
            r0.A0E(r7, r6)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r10 = X.AnonymousClass1vS.A00()
            java.util.Map r12 = r8.getParamsCopy()
            java.util.Map r13 = r9.getParamsCopy()
            java.lang.Class<X.Bf4> r14 = X.C42584Bf4.class
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.lang.String r11 = "CreatorAIHasAcceptedTerms"
            r15 = 0
            java.lang.String r19 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = r1.A04(r9, r4)
            if (r1 != r3) goto L_0x002c
            return r3
        L_0x00e7:
            X.MDg r4 = new X.MDg
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x00ee:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository.A00(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r5 = 8
            r6 = r20
            boolean r0 = X.C66143MDv.A02(r5, r6)
            r4 = r19
            if (r0 == 0) goto L_0x00e6
            r3 = r6
            X.MDv r3 = (X.C66143MDv) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e6
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0094
            if (r0 != r2) goto L_0x0101
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ef
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            r5 = 0
            if (r4 == 0) goto L_0x0092
            java.lang.Class<X.Bek> r3 = X.C42565Bek.class
            java.lang.String r1 = "fetch__IGUser(igid:$igid)"
            r0 = -1915144867(0xffffffff8dd9355d, float:-1.3386504E-30)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0092
            java.lang.Class<X.Bej> r3 = X.C42564Bej.class
            java.lang.String r1 = "creator_ai"
            r0 = 513400869(0x1e99e025, float:1.6292209E-20)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0092
            java.lang.Class<X.Bei> r3 = X.C42563Bei.class
            java.lang.String r1 = "fan_onboarding"
            r0 = -1078804527(0xffffffffbfb2bfd1, float:-1.3964788)
            X.3lr r4 = r4.A03(r3, r1, r0)
            if (r4 == 0) goto L_0x0092
            java.lang.Class<X.Beh> r3 = X.C42562Beh.class
            java.lang.String r1 = "popup_content"
            r0 = 1149587897(0x448551b9, float:1066.5538)
            X.3lr r1 = r4.A03(r3, r1, r0)
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = "heading"
            java.lang.String r5 = r1.getOptionalStringField(r2, r0)
        L_0x0075:
            java.lang.String r2 = ""
            if (r5 != 0) goto L_0x007a
            r5 = r2
        L_0x007a:
            if (r1 == 0) goto L_0x0085
            java.lang.String r0 = "body"
            java.lang.String r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0085
            r2 = r0
        L_0x0085:
            r1 = 25
            X.N49 r0 = new X.N49
            r0.<init>(r5, r2, r1)
            X.3Ih r5 = new X.3Ih
            r5.<init>(r0)
            return r5
        L_0x0092:
            r1 = r5
            goto L_0x0075
        L_0x0094:
            X.0eS.A00(r1)
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "igid"
            r7.A04(r0, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Bel> r12 = X.C42566Bel.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "CreatorAIDisclosureContent"
            r13 = 0
            java.lang.String r17 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.1Ef r6 = r7.setMaxToleratedCacheAgeMs(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            X.1Ef r1 = r6.setFreshCacheAgeMs(r0)
            X.1vn r0 = r4.A01
            r3.A00 = r2
            java.lang.Object r1 = r0.A04(r1, r3)
            if (r1 != r5) goto L_0x0028
            return r5
        L_0x00e6:
            r0 = 42
            X.MDv r3 = new X.MDv
            r3.<init>(r4, r6, r5, r0)
            goto L_0x001a
        L_0x00ef:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00fb
            X.0gF r0 = X.C60340gF.A00
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
            return r5
        L_0x00fb:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0101:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository.A02(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r3 != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        if (r8 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r3 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r9 = r3.A0B("secure_section_link_text");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        if (r9 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (r3 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r0 = r3.A0A("secure_section_link");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (r0 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        r5 = X.0cp.A03(r1);
        X.0qQ.A07(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        return new X.C239793Ih(new X.QP8(r5, r6, r7, r8, r9));
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r3 = 9
            r6 = r20
            boolean r0 = X.C66143MDv.A02(r3, r6)
            r5 = r19
            if (r0 == 0) goto L_0x010d
            r4 = r6
            X.MDv r4 = (X.C66143MDv) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x00bb
            if (r0 != r2) goto L_0x0128
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0116
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            r6 = 0
            if (r4 == 0) goto L_0x00b9
            java.lang.Class<X.Beu> r3 = X.C42575Beu.class
            r5 = 0
            java.lang.String r1 = "fetch__IGUser(igid:$igid)"
            r0 = -1487279633(0xffffffffa759e9ef, float:-3.0241615E-15)
            X.3lr r4 = r4.getOptionalTreeField(r5, r1, r3, r0)
            if (r4 == 0) goto L_0x00b9
            java.lang.Class<X.Bet> r3 = X.C42574Bet.class
            java.lang.String r1 = "creator_ai"
            r0 = 1104383534(0x41d38e2e, float:26.444424)
            X.3lr r4 = r4.getOptionalTreeField(r5, r1, r3, r0)
            if (r4 == 0) goto L_0x00b9
            java.lang.Class<X.Bes> r3 = X.C42573Bes.class
            java.lang.String r1 = "fan_onboarding"
            r0 = -458907640(0xffffffffe4a5a008, float:-2.4441954E22)
            X.3lr r4 = r4.getOptionalTreeField(r5, r1, r3, r0)
            if (r4 == 0) goto L_0x00b9
            java.lang.Class<X.Ber> r3 = X.C42572Ber.class
            java.lang.String r1 = "bottom_sheet_content"
            r0 = -395045995(0xffffffffe8741395, float:-4.6104746E24)
            X.3lr r3 = r4.getOptionalTreeField(r5, r1, r3, r0)
            if (r3 == 0) goto L_0x0076
            java.lang.String r0 = "ai_section_body"
            java.lang.String r6 = r3.getOptionalStringField(r5, r0)
        L_0x0076:
            java.lang.String r1 = ""
            if (r6 != 0) goto L_0x007b
            r6 = r1
        L_0x007b:
            if (r3 == 0) goto L_0x0085
            java.lang.String r0 = "inaccurate_section_body"
            java.lang.String r7 = r3.getOptionalStringField(r2, r0)
            if (r7 != 0) goto L_0x0088
        L_0x0085:
            r7 = r1
            if (r3 == 0) goto L_0x0090
        L_0x0088:
            java.lang.String r0 = "secure_section_body"
            java.lang.String r8 = r3.A09(r0)
            if (r8 != 0) goto L_0x0093
        L_0x0090:
            r8 = r1
            if (r3 == 0) goto L_0x009b
        L_0x0093:
            java.lang.String r0 = "secure_section_link_text"
            java.lang.String r9 = r3.A0B(r0)
            if (r9 != 0) goto L_0x009e
        L_0x009b:
            r9 = r1
            if (r3 == 0) goto L_0x00a7
        L_0x009e:
            java.lang.String r0 = "secure_section_link"
            java.lang.String r0 = r3.A0A(r0)
            if (r0 == 0) goto L_0x00a7
            r1 = r0
        L_0x00a7:
            android.net.Uri r5 = X.0cp.A03(r1)
            X.0qQ.A07(r5)
            X.QP8 r4 = new X.QP8
            r4.<init>((android.net.Uri) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)
            X.3Ih r3 = new X.3Ih
            r3.<init>(r4)
            return r3
        L_0x00b9:
            r3 = r6
            goto L_0x0076
        L_0x00bb:
            X.0eS.A00(r1)
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "igid"
            r7.A04(r0, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Bev> r12 = X.C42576Bev.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "CreatorAIFanOnboardingBottomSheetQuery"
            r13 = 0
            java.lang.String r17 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.1Ef r6 = r7.setMaxToleratedCacheAgeMs(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            X.1Ef r1 = r6.setFreshCacheAgeMs(r0)
            X.1vn r0 = r5.A01
            r4.A00 = r2
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x010d:
            r0 = 42
            X.MDv r4 = new X.MDv
            r4.<init>(r5, r6, r3, r0)
            goto L_0x001a
        L_0x0116:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0122
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = new X.5sO
            r3.<init>(r0)
            return r3
        L_0x0122:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0128:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository.A03(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r1 != null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (r9 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r1 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        r10 = r1.A0B("participating_section_body");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        if (r10 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        if (r1 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r11 = r1.getOptionalStringField(7, "real_content_section_heading");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (r11 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (r1 == null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r12 = r1.getOptionalStringField(6, "real_content_section_body");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        if (r12 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b2, code lost:
        r12 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r1 == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b5, code lost:
        r13 = r1.getOptionalStringField(9, "respond_directly_section_heading");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
        if (r13 != null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bf, code lost:
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r1 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c2, code lost:
        r14 = r1.A0D("respond_directly_section_body");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        if (r14 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        r14 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cb, code lost:
        if (r1 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cd, code lost:
        r15 = r1.A07("footer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d3, code lost:
        if (r15 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d5, code lost:
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d6, code lost:
        if (r1 == null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d8, code lost:
        r16 = r1.A09("footer_link_text");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00de, code lost:
        if (r16 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e0, code lost:
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e2, code lost:
        if (r1 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e4, code lost:
        r0 = r1.getOptionalStringField(1, "footer_link");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ea, code lost:
        if (r0 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ec, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ed, code lost:
        r6 = X.0cp.A03(r3);
        X.0qQ.A07(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fe, code lost:
        return new X.C239793Ih(new X.C47164Drf(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16));
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r21) {
        /*
            r20 = this;
            r4 = 10
            r6 = r21
            boolean r0 = X.C66143MDv.A02(r4, r6)
            r5 = r20
            if (r0 == 0) goto L_0x0155
            r3 = r6
            X.MDv r3 = (X.C66143MDv) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0155
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r6 = 1
            if (r0 == 0) goto L_0x0102
            if (r0 != r6) goto L_0x0170
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x015e
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            r7 = 0
            if (r3 == 0) goto L_0x00ff
            java.lang.Class<X.Bez> r2 = X.C42580Bez.class
            java.lang.String r1 = "fetch__IGUser(igid:$igid)"
            r0 = -1699337007(0xffffffff9ab62cd1, float:-7.534584E-23)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x00ff
            java.lang.Class<X.Bey> r2 = X.C42579Bey.class
            java.lang.String r1 = "creator_ai"
            r0 = -1520883760(0xffffffffa55927d0, float:-1.8835239E-16)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x00ff
            java.lang.Class<X.Bex> r2 = X.C42578Bex.class
            java.lang.String r1 = "fan_onboarding"
            r0 = -369206554(0xffffffffe9fe5ae6, float:-3.8437052E25)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x00ff
            java.lang.Class<X.Bew> r2 = X.C42577Bew.class
            java.lang.String r1 = "interstitial_content"
            r0 = -296551642(0xffffffffee52fb26, float:-1.6323868E28)
            X.3lr r1 = r3.A03(r2, r1, r0)
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = "heading"
            java.lang.String r7 = r1.A0A(r0)
        L_0x0075:
            java.lang.String r3 = ""
            if (r7 != 0) goto L_0x007a
            r7 = r3
        L_0x007a:
            if (r1 == 0) goto L_0x0084
            java.lang.String r0 = "subheading"
            java.lang.String r8 = r1.getOptionalStringField(r4, r0)
            if (r8 != 0) goto L_0x0087
        L_0x0084:
            r8 = r3
            if (r1 == 0) goto L_0x008f
        L_0x0087:
            java.lang.String r0 = "participating_section_heading"
            java.lang.String r9 = r1.A0C(r0)
            if (r9 != 0) goto L_0x0092
        L_0x008f:
            r9 = r3
            if (r1 == 0) goto L_0x009a
        L_0x0092:
            java.lang.String r0 = "participating_section_body"
            java.lang.String r10 = r1.A0B(r0)
            if (r10 != 0) goto L_0x009d
        L_0x009a:
            r10 = r3
            if (r1 == 0) goto L_0x00a6
        L_0x009d:
            r2 = 7
            java.lang.String r0 = "real_content_section_heading"
            java.lang.String r11 = r1.getOptionalStringField(r2, r0)
            if (r11 != 0) goto L_0x00a9
        L_0x00a6:
            r11 = r3
            if (r1 == 0) goto L_0x00b2
        L_0x00a9:
            r2 = 6
            java.lang.String r0 = "real_content_section_body"
            java.lang.String r12 = r1.getOptionalStringField(r2, r0)
            if (r12 != 0) goto L_0x00b5
        L_0x00b2:
            r12 = r3
            if (r1 == 0) goto L_0x00bf
        L_0x00b5:
            r2 = 9
            java.lang.String r0 = "respond_directly_section_heading"
            java.lang.String r13 = r1.getOptionalStringField(r2, r0)
            if (r13 != 0) goto L_0x00c2
        L_0x00bf:
            r13 = r3
            if (r1 == 0) goto L_0x00ca
        L_0x00c2:
            java.lang.String r0 = "respond_directly_section_body"
            java.lang.String r14 = r1.A0D(r0)
            if (r14 != 0) goto L_0x00cd
        L_0x00ca:
            r14 = r3
            if (r1 == 0) goto L_0x00d5
        L_0x00cd:
            java.lang.String r0 = "footer"
            java.lang.String r15 = r1.A07(r0)
            if (r15 != 0) goto L_0x00d8
        L_0x00d5:
            r15 = r3
            if (r1 == 0) goto L_0x00e0
        L_0x00d8:
            java.lang.String r0 = "footer_link_text"
            java.lang.String r16 = r1.A09(r0)
            if (r16 != 0) goto L_0x00e4
        L_0x00e0:
            r16 = r3
            if (r1 == 0) goto L_0x00ed
        L_0x00e4:
            java.lang.String r0 = "footer_link"
            java.lang.String r0 = r1.getOptionalStringField(r6, r0)
            if (r0 == 0) goto L_0x00ed
            r3 = r0
        L_0x00ed:
            android.net.Uri r6 = X.0cp.A03(r3)
            X.0qQ.A07(r6)
            X.Drf r5 = new X.Drf
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.3Ih r2 = new X.3Ih
            r2.<init>(r5)
            return r2
        L_0x00ff:
            r1 = r7
            goto L_0x0075
        L_0x0102:
            X.0eS.A00(r1)
            r15 = 0
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r7 = new X.2IS
            r7.<init>()
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "igid"
            r8.A04(r0, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r9 = X.AnonymousClass1vS.A00()
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.Bf0> r13 = X.C42581Bf0.class
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.lang.String r10 = "CreatorAIFanOnboardingNuxQuery"
            r14 = 0
            java.lang.String r18 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.1Ef r7 = r8.setMaxToleratedCacheAgeMs(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            X.1Ef r1 = r7.setFreshCacheAgeMs(r0)
            X.1vn r0 = r5.A01
            r3.A00 = r6
            java.lang.Object r1 = r0.A04(r1, r3)
            if (r1 != r2) goto L_0x0028
            return r2
        L_0x0155:
            r0 = 42
            X.MDv r3 = new X.MDv
            r3.<init>(r5, r6, r4, r0)
            goto L_0x001a
        L_0x015e:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x016a
            X.0gF r0 = X.C60340gF.A00
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
            return r2
        L_0x016a:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0170:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository.A04(X.4D7):java.lang.Object");
    }

    public CreatorAIFanNuxRepository(1vn r3, String str) {
        super("creator_ai_fan_nux", AnonymousClass43D.A01(245403032, 3));
        this.A01 = r3;
        this.A02 = str;
    }
}
