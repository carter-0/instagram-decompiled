package com.instagram.creator.agent.settings.keyword;

import X.0qQ;
import X.1vn;
import X.AnonymousClass43D;
import X.AnonymousClass7TF;
import X.C252733pa;

public final class KeywordRepository extends C252733pa {
    public final 1vn A00;
    public final String A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeywordRepository(1vn r3, String str, String str2) {
        super("creator_ai_keyword_response_repository", AnonymousClass43D.A01(245403032, 3));
        0qQ.A0B(str, 2);
        AnonymousClass7TF.A1D(str2, 3, r3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r7 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        r2 = java.lang.Long.valueOf(r7.getCoercedTimeField(4, "expiration_time"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return new X.QP8(r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r6 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.QP8 A00(X.C42641Bfz r7) {
        /*
            r2 = 0
            if (r7 == 0) goto L_0x003d
            java.lang.String r3 = X.C41845B3m.A0k(r7)
        L_0x0007:
            java.lang.String r1 = ""
            if (r3 != 0) goto L_0x000c
            r3 = r1
        L_0x000c:
            if (r7 == 0) goto L_0x0016
            java.lang.String r0 = "keyword"
            java.lang.String r4 = r7.A08(r0)
            if (r4 != 0) goto L_0x002e
        L_0x0016:
            r4 = r1
            if (r7 != 0) goto L_0x002e
            r5 = r2
        L_0x001a:
            r6 = r1
            if (r7 == 0) goto L_0x0028
        L_0x001d:
            r1 = 4
            java.lang.String r0 = "expiration_time"
            long r0 = r7.getCoercedTimeField(r1, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x0028:
            X.QP8 r1 = new X.QP8
            r1.<init>((java.lang.Long) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6)
            return r1
        L_0x002e:
            java.lang.String r0 = "link"
            java.lang.String r5 = r7.A09(r0)
            java.lang.String r0 = "description"
            java.lang.String r6 = r7.A0A(r0)
            if (r6 != 0) goto L_0x001d
            goto L_0x001a
        L_0x003d:
            r3 = r2
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A00(X.Bfz):X.QP8");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00eb, code lost:
        if (r6 != null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0143, code lost:
        if (r8 != null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b6, code lost:
        if (r7 != null) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c0, code lost:
        if (r9 != null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c3, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c4, code lost:
        if (r9 == null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01cb, code lost:
        if (r8 == null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01cd, code lost:
        r2 = r9.A04(X.C42649Bg8.class, "page_info", -1996912542);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d8, code lost:
        if (r2 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01da, code lost:
        r6 = r2.getCoercedBooleanField(0, "has_next_page");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e0, code lost:
        r2 = r9.A04(X.C42649Bg8.class, "page_info", -1996912542);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01eb, code lost:
        if (r2 == null) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ed, code lost:
        r3 = r2.getOptionalStringField(1, "end_cursor");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f3, code lost:
        r0 = r9.getCoercedIntField(0, "count");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0205, code lost:
        return new X.C59721JVf(48, (java.lang.Object) r7, (java.lang.Object) new X.C66787McY(r3, r8, r0, r6));
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.String r21, java.lang.String r22, X.AnonymousClass4D7 r23) {
        /*
            r20 = this;
            r4 = 7
            r6 = r23
            boolean r0 = X.C66129MDh.A01(r4, r6)
            r5 = r20
            if (r0 == 0) goto L_0x0138
            r3 = r6
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0138
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x00ee
            if (r0 != r4) goto L_0x0210
            X.0eS.A00(r1)
        L_0x0027:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r3 = 0
            if (r0 == 0) goto L_0x0206
            X.3lr r6 = X.C41846B3n.A0R(r1)
            if (r6 == 0) goto L_0x00ea
            java.lang.Class<X.BgD> r2 = X.C42654BgD.class
            java.lang.String r1 = "fetch__IGUser(igid:$igid)"
            r0 = 35239526(0x219b666, float:1.129301E-37)
            X.3lr r5 = r6.A03(r2, r1, r0)
            if (r5 == 0) goto L_0x00ea
            java.lang.Class<X.BgC> r2 = X.C42653BgC.class
            java.lang.String r1 = "creator_ai"
            r0 = -891386965(0xffffffffcade83ab, float:-7291349.5)
            X.3lr r5 = r5.A03(r2, r1, r0)
            if (r5 == 0) goto L_0x00ea
            java.lang.Class<X.BgB> r2 = X.C42652BgB.class
            java.lang.String r1 = "ai"
            r0 = -1461421577(0xffffffffa8e479f7, float:-2.5365979E-14)
            X.3lr r5 = r5.A03(r2, r1, r0)
            if (r5 == 0) goto L_0x00ea
            java.lang.Class<X.BgA> r2 = X.C42651BgA.class
            java.lang.String r1 = "link_keyword_set"
            r0 = 1933388978(0x733d2cb2, float:1.4987955E31)
            X.3lr r5 = r5.A03(r2, r1, r0)
            if (r5 == 0) goto L_0x00ea
            java.lang.Class<X.Bg9> r2 = X.C42650Bg9.class
            java.lang.String r1 = "link_keywords(after:$active_end_cursor)"
            r0 = 1275472810(0x4c062baa, float:3.5172008E7)
            X.3lr r9 = r5.A03(r2, r1, r0)
        L_0x0073:
            java.lang.Class<X.BgD> r2 = X.C42654BgD.class
            java.lang.String r1 = "fetch__IGUser(igid:$igid)"
            r0 = 35239526(0x219b666, float:1.129301E-37)
            X.3lr r5 = r6.A03(r2, r1, r0)
            if (r5 == 0) goto L_0x0146
            java.lang.Class<X.BgC> r2 = X.C42653BgC.class
            java.lang.String r1 = "creator_ai"
            r0 = -891386965(0xffffffffcade83ab, float:-7291349.5)
            X.3lr r5 = r5.A03(r2, r1, r0)
            if (r5 == 0) goto L_0x0146
            java.lang.Class<X.BgB> r2 = X.C42652BgB.class
            java.lang.String r1 = "ai"
            r0 = -1461421577(0xffffffffa8e479f7, float:-2.5365979E-14)
            X.3lr r5 = r5.A03(r2, r1, r0)
            if (r5 == 0) goto L_0x0146
            java.lang.Class<X.BgA> r2 = X.C42651BgA.class
            java.lang.String r1 = "link_keyword_set"
            r0 = 1933388978(0x733d2cb2, float:1.4987955E31)
            X.3lr r5 = r5.A03(r2, r1, r0)
            if (r5 == 0) goto L_0x0146
            java.lang.Class<X.Bg6> r2 = X.C42647Bg6.class
            java.lang.String r1 = "expired_link_keywords(after:$expired_end_cursor)"
            r0 = 196081104(0xbaff5d0, float:6.7777406E-32)
            X.3lr r7 = r5.getOptionalTreeField(r4, r1, r2, r0)
            if (r7 == 0) goto L_0x0147
            java.lang.Class<X.Bg4> r2 = X.C42645Bg4.class
            java.lang.String r1 = "nodes"
            r0 = 662975806(0x2784353e, float:3.6695085E-15)
            com.google.common.collect.ImmutableList r0 = r7.getRequiredCompactedTreeListField(r4, r1, r2, r0)
            if (r0 == 0) goto L_0x0147
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r0.iterator()
        L_0x00c9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x013f
            X.3lr r2 = X.C41845B3m.A0V(r5)
            if (r2 == 0) goto L_0x00e8
            java.lang.Class<X.Bfz> r1 = X.C42641Bfz.class
            r0 = 202909926(0xc1828e6, float:1.1721961E-31)
            X.3lr r0 = r2.A01(r1, r0)
            X.Bfz r0 = (X.C42641Bfz) r0
        L_0x00e0:
            X.QP8 r0 = A00(r0)
            r6.add(r0)
            goto L_0x00c9
        L_0x00e8:
            r0 = r3
            goto L_0x00e0
        L_0x00ea:
            r9 = r3
            if (r6 == 0) goto L_0x0146
            goto L_0x0073
        L_0x00ee:
            X.0eS.A00(r1)
            X.1vn r1 = r5.A00
            r15 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r6 = r5.A02
            java.lang.String r0 = "igid"
            r8.A04(r0, r6)
            java.lang.String r0 = "active_end_cursor"
            r6 = r21
            r8.A04(r0, r6)
            java.lang.String r0 = "expired_end_cursor"
            r6 = r22
            r8.A04(r0, r6)
            X.1vR r9 = X.C41845B3m.A05()
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.BgE> r13 = X.C42655BgE.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "KeywordResponseListQuery"
            r14 = 0
            java.lang.String r18 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = X.C41846B3n.A0h(r8, r1, r5, r3)
            if (r1 != r2) goto L_0x0027
            return r2
        L_0x0138:
            X.MDh r3 = new X.MDh
            r3.<init>(r5, r6, r4)
            goto L_0x0019
        L_0x013f:
            X.62P r8 = X.AnonymousClass62Q.A00(r6)
            if (r8 == 0) goto L_0x0147
            goto L_0x0149
        L_0x0146:
            r7 = r3
        L_0x0147:
            X.62M r8 = X.AnonymousClass62M.A01
        L_0x0149:
            r0 = 0
            if (r7 == 0) goto L_0x01b5
            java.lang.Class<X.Bg5> r5 = X.C42646Bg5.class
            java.lang.String r2 = "page_info"
            r1 = -312577344(0xffffffffed5e72c0, float:-4.3027748E27)
            X.3lr r2 = r7.A04(r5, r2, r1)
            if (r2 == 0) goto L_0x01b5
            java.lang.String r1 = "has_next_page"
            boolean r6 = r2.getCoercedBooleanField(r0, r1)
        L_0x015f:
            java.lang.Class<X.Bg5> r5 = X.C42646Bg5.class
            java.lang.String r2 = "page_info"
            r1 = -312577344(0xffffffffed5e72c0, float:-4.3027748E27)
            X.3lr r2 = r7.A04(r5, r2, r1)
            if (r2 == 0) goto L_0x01b9
            java.lang.String r1 = "end_cursor"
            java.lang.String r2 = r2.getOptionalStringField(r4, r1)
        L_0x0172:
            java.lang.String r1 = "count"
            int r1 = r7.getCoercedIntField(r0, r1)
        L_0x0178:
            X.McY r7 = new X.McY
            r7.<init>((java.lang.String) r2, (X.AnonymousClass62P) r8, (int) r1, (boolean) r6)
            if (r9 == 0) goto L_0x01be
            java.lang.Class<X.Bg7> r5 = X.C42648Bg7.class
            java.lang.String r2 = "nodes"
            r1 = 1864093985(0x6f1bd121, float:4.8223E28)
            com.google.common.collect.ImmutableList r1 = r9.getRequiredCompactedTreeListField(r4, r2, r5, r1)
            if (r1 == 0) goto L_0x01be
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r1.iterator()
        L_0x0194:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x01c7
            X.3lr r5 = X.C41845B3m.A0V(r6)
            if (r5 == 0) goto L_0x01b3
            java.lang.Class<X.Bfz> r2 = X.C42641Bfz.class
            r1 = 202909926(0xc1828e6, float:1.1721961E-31)
            X.3lr r1 = r5.reinterpretRequired(r0, r2, r1)
            X.Bfz r1 = (X.C42641Bfz) r1
        L_0x01ab:
            X.QP8 r1 = A00(r1)
            r8.add(r1)
            goto L_0x0194
        L_0x01b3:
            r1 = r3
            goto L_0x01ab
        L_0x01b5:
            r6 = 0
            if (r7 == 0) goto L_0x01b9
            goto L_0x015f
        L_0x01b9:
            r2 = r3
            if (r7 != 0) goto L_0x0172
            r1 = 0
            goto L_0x0178
        L_0x01be:
            X.62M r8 = X.AnonymousClass62M.A01
            if (r9 == 0) goto L_0x01c3
            goto L_0x01cd
        L_0x01c3:
            r6 = 0
            if (r9 == 0) goto L_0x01f9
            goto L_0x01e0
        L_0x01c7:
            X.62P r8 = X.AnonymousClass62Q.A00(r8)
            if (r8 == 0) goto L_0x01be
        L_0x01cd:
            java.lang.Class<X.Bg8> r5 = X.C42649Bg8.class
            java.lang.String r2 = "page_info"
            r1 = -1996912542(0xffffffff88f98862, float:-1.5018206E-33)
            X.3lr r2 = r9.A04(r5, r2, r1)
            if (r2 == 0) goto L_0x01c3
            java.lang.String r1 = "has_next_page"
            boolean r6 = r2.getCoercedBooleanField(r0, r1)
        L_0x01e0:
            java.lang.Class<X.Bg8> r5 = X.C42649Bg8.class
            java.lang.String r2 = "page_info"
            r1 = -1996912542(0xffffffff88f98862, float:-1.5018206E-33)
            X.3lr r2 = r9.A04(r5, r2, r1)
            if (r2 == 0) goto L_0x01f3
            java.lang.String r1 = "end_cursor"
            java.lang.String r3 = r2.getOptionalStringField(r4, r1)
        L_0x01f3:
            java.lang.String r1 = "count"
            int r0 = r9.getCoercedIntField(r0, r1)
        L_0x01f9:
            X.McY r2 = new X.McY
            r2.<init>((java.lang.String) r3, (X.AnonymousClass62P) r8, (int) r0, (boolean) r6)
            r1 = 48
            X.JVf r0 = new X.JVf
            r0.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r2)
            return r0
        L_0x0206:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x020b
            return r3
        L_0x020b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0210:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A04(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r15 = this;
            r8 = r18
            r4 = 10
            r5 = r20
            boolean r0 = X.C66129MDh.A01(r4, r5)
            if (r0 == 0) goto L_0x00cd
            r2 = r5
            X.MDh r2 = (X.C66129MDh) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00cd
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r3 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0069
            if (r0 != r9) goto L_0x00d4
            X.0eS.A00(r3)
        L_0x0029:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0060
            X.3lr r3 = X.C41846B3n.A0R(r3)
            if (r3 == 0) goto L_0x005f
            java.lang.Class<X.BgG> r2 = X.C42657BgG.class
            r4 = 0
            java.lang.String r1 = "xig_update_creator_ai_link_keyword(data:$data)"
            r0 = 5851428(0x594924, float:8.199597E-39)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x005f
            java.lang.Class<X.BgF> r2 = X.C42656BgF.class
            java.lang.String r1 = "creator_ai_link_keyword"
            r0 = -1140801944(0xffffffffbc00be68, float:-0.007857896)
            X.3lr r2 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r2 == 0) goto L_0x005f
            java.lang.Class<X.Bfz> r1 = X.C42641Bfz.class
            r0 = 202909926(0xc1828e6, float:1.1721961E-31)
            X.3lr r0 = r2.reinterpretRequired(r4, r1, r0)
            X.Bfz r0 = (X.C42641Bfz) r0
            X.QP8 r10 = A00(r0)
        L_0x005f:
            return r10
        L_0x0060:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x005f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0069:
            X.0eS.A00(r3)
            X.1vn r0 = r15.A00
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r3 = 576(0x240, float:8.07E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            r5 = r17
            X.0Df r5 = X.C41845B3m.A03(r4, r5, r3)
            if (r18 == 0) goto L_0x008c
            int r3 = r8.length()
            if (r3 != 0) goto L_0x008d
        L_0x008c:
            r8 = r10
        L_0x008d:
            java.lang.String r3 = "link"
            X.0Df.A00(r5, r8, r3)
            java.lang.String r3 = "description"
            r4 = r19
            X.0Df.A00(r5, r4, r3)
            if (r16 == 0) goto L_0x00cb
            java.lang.String r4 = r16.toString()
        L_0x009f:
            java.lang.String r3 = "expiration_time"
            X.0Df.A00(r5, r4, r3)
            java.lang.String r3 = "data"
            X.1vR r4 = X.C41847B3o.A04(r5, r6, r3)
            java.util.Map r6 = r6.getParamsCopy()
            java.util.Map r7 = r7.getParamsCopy()
            java.lang.Class<X.BgH> r8 = X.C42658BgH.class
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.lang.String r5 = "UpdateKeywordResponseMutation"
            r11 = 64
            java.lang.String r13 = "xig_update_creator_ai_link_keyword"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = X.C41846B3n.A0h(r3, r0, r15, r2)
            if (r3 != r1) goto L_0x0029
            return r1
        L_0x00cb:
            r4 = r10
            goto L_0x009f
        L_0x00cd:
            X.MDh r2 = new X.MDh
            r2.<init>(r15, r5, r4)
            goto L_0x001a
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A02(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (r2.length() == 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (r5 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        r8 = r5.getOptionalStringField(1, "preview_title");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r8 != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r8 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0097, code lost:
        if (r5 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        r9 = r5.A07("preview_description");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009f, code lost:
        if (r9 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r5 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a4, code lost:
        r7 = r5.getOptionalStringField(2, "preview_image_url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r7 != null) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ad, code lost:
        if (r15 == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        if (r5 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        r2 = r5.getOptionalStringField(2, "preview_image_url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        if (r2 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00be, code lost:
        if (r2.length() != 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r5 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c3, code lost:
        r13 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d1, code lost:
        return new X.C53531Gq1(r7, r8, r9, r1, r4.getOptionalStringField(1, androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE), r12, r13, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d2, code lost:
        r13 = r5.getCoercedIntField(3, "preview_image_height");
        r12 = r5.getCoercedIntField(4, "preview_image_width");
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r22, java.lang.String r23, java.lang.String r24, X.AnonymousClass4D7 r25) {
        /*
            r21 = this;
            r1 = r22
            r4 = 8
            r6 = r25
            boolean r0 = X.C66129MDh.A01(r4, r6)
            r10 = r21
            if (r0 == 0) goto L_0x013d
            r5 = r6
            X.MDh r5 = (X.C66129MDh) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x013d
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x001c:
            java.lang.Object r3 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r2 = r5.A00
            r0 = 1
            if (r2 == 0) goto L_0x00e1
            if (r2 != r0) goto L_0x014e
            java.lang.Object r1 = r5.A01
            java.lang.String r1 = (java.lang.String) r1
            X.0eS.A00(r3)
        L_0x002e:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r2 = r3 instanceof X.C239793Ih
            r8 = 0
            if (r2 == 0) goto L_0x0144
            X.3lr r5 = X.C41846B3n.A0R(r3)
            if (r5 == 0) goto L_0x014d
            java.lang.Class<X.Bfm> r4 = X.C42628Bfm.class
            r6 = 0
            java.lang.String r3 = "xig_creator_ai_fact_preview_query(request:$request)"
            r2 = -244373840(0xfffffffff16f26b0, float:-1.184219E30)
            X.3lr r5 = r5.getOptionalTreeField(r6, r3, r4, r2)
            if (r5 == 0) goto L_0x014d
            java.lang.Class<X.Bfl> r4 = X.C42627Bfl.class
            java.lang.String r3 = "examples"
            r2 = -694846178(0xffffffffd6957d1e, float:-8.2182303E13)
            com.google.common.collect.ImmutableList r2 = r5.getRequiredCompactedTreeListField(r6, r3, r4, r2)
            if (r2 == 0) goto L_0x014d
            java.lang.Object r4 = X.00k.A0J(r2)
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x014d
            java.lang.Class<X.Bfk> r5 = X.C42626Bfk.class
            r6 = 2
            java.lang.String r3 = "link_preview"
            r2 = -1452875699(0xffffffffa966e04d, float:-5.126481E-14)
            X.3lr r5 = r4.getOptionalTreeField(r6, r3, r5, r2)
            if (r5 == 0) goto L_0x0089
            java.lang.String r2 = "preview_title"
            java.lang.String r2 = r5.getOptionalStringField(r0, r2)
            if (r2 == 0) goto L_0x0089
            int r2 = r2.length()
            if (r2 == 0) goto L_0x0089
            java.lang.String r2 = "preview_description"
            java.lang.String r2 = r5.A07(r2)
            if (r2 == 0) goto L_0x0089
            int r2 = r2.length()
            r15 = 1
            if (r2 != 0) goto L_0x008c
        L_0x0089:
            r15 = 0
            if (r5 == 0) goto L_0x0092
        L_0x008c:
            java.lang.String r2 = "preview_title"
            java.lang.String r8 = r5.getOptionalStringField(r0, r2)
        L_0x0092:
            java.lang.String r3 = ""
            if (r8 != 0) goto L_0x0097
            r8 = r3
        L_0x0097:
            if (r5 == 0) goto L_0x00a1
            java.lang.String r2 = "preview_description"
            java.lang.String r9 = r5.A07(r2)
            if (r9 != 0) goto L_0x00a4
        L_0x00a1:
            r9 = r3
            if (r5 == 0) goto L_0x00ac
        L_0x00a4:
            java.lang.String r2 = "preview_image_url"
            java.lang.String r7 = r5.getOptionalStringField(r6, r2)
            if (r7 != 0) goto L_0x00ad
        L_0x00ac:
            r7 = r3
        L_0x00ad:
            if (r15 == 0) goto L_0x00c0
            if (r5 == 0) goto L_0x00c0
            java.lang.String r2 = "preview_image_url"
            java.lang.String r2 = r5.getOptionalStringField(r6, r2)
            if (r2 == 0) goto L_0x00c0
            int r2 = r2.length()
            r14 = 1
            if (r2 != 0) goto L_0x00d2
        L_0x00c0:
            r14 = 0
            if (r5 != 0) goto L_0x00d2
            r13 = 0
            r12 = 0
        L_0x00c5:
            java.lang.String r2 = "response"
            java.lang.String r11 = r4.getOptionalStringField(r0, r2)
            X.Gq1 r6 = new X.Gq1
            r10 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r6
        L_0x00d2:
            r3 = 3
            java.lang.String r2 = "preview_image_height"
            int r13 = r5.getCoercedIntField(r3, r2)
            r3 = 4
            java.lang.String r2 = "preview_image_width"
            int r12 = r5.getCoercedIntField(r3, r2)
            goto L_0x00c5
        L_0x00e1:
            X.0eS.A00(r3)
            X.1vn r3 = r10.A00
            r16 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r9 = X.C41845B3m.A04()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r2 = "prompt"
            r7 = r24
            X.0Df r7 = X.C41845B3m.A03(r6, r7, r2)
            java.lang.String r2 = "response"
            r6 = r23
            X.0Df.A00(r7, r6, r2)
            java.lang.String r2 = "link"
            X.0Df.A00(r7, r1, r2)
            java.lang.String r6 = "KEYWORD"
            java.lang.String r2 = "response_type"
            X.0Df.A00(r7, r6, r2)
            java.lang.String r6 = r10.A01
            java.lang.String r2 = "creator_id"
            X.0Df.A00(r7, r6, r2)
            java.lang.String r2 = "request"
            X.1vR r10 = X.C41847B3o.A04(r7, r8, r2)
            java.util.Map r12 = r8.getParamsCopy()
            java.util.Map r13 = r9.getParamsCopy()
            java.lang.Class<X.Bfn> r14 = X.C42629Bfn.class
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.lang.String r11 = "IGCreatorAIFactPreviewQuery"
            r15 = 0
            java.lang.String r19 = "xig_creator_ai_fact_preview_query"
            com.facebook.pando.PandoGraphQLRequest r9 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r18 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r3 = X.C41846B3n.A0h(r9, r3, r1, r5)
            if (r3 != r4) goto L_0x002e
            return r4
        L_0x013d:
            X.MDh r5 = new X.MDh
            r5.<init>(r10, r6, r4)
            goto L_0x001c
        L_0x0144:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x014d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x014d:
            return r8
        L_0x014e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A03(java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(java.lang.String r20, X.AnonymousClass4D7 r21) {
        /*
            r19 = this;
            r4 = r20
            r5 = 6
            r6 = r21
            boolean r0 = X.C66129MDh.A01(r5, r6)
            r7 = r19
            if (r0 == 0) goto L_0x009e
            r3 = r6
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009e
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r13 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 != r13) goto L_0x00aa
            java.lang.Object r4 = r3.A01
            X.0eS.A00(r1)
        L_0x002b:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0056
            X.3lr r5 = X.C41846B3n.A0R(r1)
            if (r5 == 0) goto L_0x0054
            java.lang.Class<X.Bfx> r3 = X.C42639Bfx.class
            r2 = 0
            java.lang.String r1 = "xig_delete_creator_ai_link_keyword_schema(data:$data)"
            r0 = -219307622(0xfffffffff2eda19a, float:-9.413544E30)
            X.3lr r1 = r5.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = "deleted_id"
            java.lang.String r0 = r1.getOptionalStringField(r2, r0)
        L_0x004b:
            boolean r0 = X.0qQ.A0K(r0, r4)
        L_0x004f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0054:
            r0 = 0
            goto L_0x004b
        L_0x0056:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a5
            r0 = 0
            goto L_0x004f
        L_0x005c:
            X.0eS.A00(r1)
            X.1vn r1 = r7.A00
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r0 = 576(0x240, float:8.07E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Df r5 = X.C41845B3m.A03(r5, r4, r0)
            java.lang.String r0 = "data"
            X.1vR r8 = X.C41847B3o.A04(r5, r7, r0)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Bfy> r12 = X.C42640Bfy.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "DeleteKeywordResponseMutation"
            r15 = 64
            java.lang.String r17 = "xig_delete_creator_ai_link_keyword_schema"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = X.C41846B3n.A0h(r7, r1, r4, r3)
            if (r1 != r2) goto L_0x002b
            return r2
        L_0x009e:
            X.MDh r3 = new X.MDh
            r3.<init>(r7, r6, r5)
            goto L_0x001b
        L_0x00a5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A05(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r3 = 21
            r6 = r19
            boolean r0 = X.C66143MDv.A02(r3, r6)
            r5 = r17
            if (r0 == 0) goto L_0x00b1
            r4 = r6
            X.MDv r4 = (X.C66143MDv) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b1
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0069
            if (r0 != r2) goto L_0x00c3
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b7
            X.3lr r5 = X.C41846B3n.A0R(r1)
            if (r5 == 0) goto L_0x00c0
            java.lang.Class<X.Bg0> r3 = X.C42642Bg0.class
            r4 = 0
            java.lang.String r1 = "xig_creator_ai_validate_keyword(data:$data)"
            r0 = 1764791147(0x6930936b, float:1.3341694E25)
            X.3lr r3 = r5.getOptionalTreeField(r4, r1, r3, r0)
            if (r3 == 0) goto L_0x00c0
            java.lang.String r0 = "is_valid"
            boolean r0 = r3.getCoercedBooleanField(r4, r0)
            if (r0 != 0) goto L_0x00c0
            X.EWz r1 = X.C48133EWz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "reason"
            java.lang.Enum r1 = r3.getOptionalEnumField(r2, r0, r1)
            X.EWz r0 = X.C48133EWz.NON_UNIQUE_KEYWORD
            r2 = 2131965064(0x7f133488, float:1.9566927E38)
            if (r1 != r0) goto L_0x005c
            r2 = 2131965067(0x7f13348b, float:1.9566933E38)
        L_0x005c:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.GKO r0 = new X.GKO
            r0.<init>(r1, r2)
            X.Gq5 r3 = new X.Gq5
            r3.<init>(r0)
            return r3
        L_0x0069:
            X.0eS.A00(r1)
            X.1vn r1 = r5.A00
            r12 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r5 = r5.A02
            java.lang.String r0 = "creator_igid"
            X.0Df r5 = X.C41845B3m.A03(r6, r5, r0)
            java.lang.String r0 = "keyword"
            r6 = r18
            X.0Df.A00(r5, r6, r0)
            java.lang.String r0 = "data"
            X.1vR r6 = X.C41847B3o.A04(r5, r8, r0)
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.Bg1> r10 = X.Bg1.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "KeywordResponseKeywordValidation"
            r11 = 0
            java.lang.String r15 = "xig_creator_ai_validate_keyword"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A00 = r2
            java.lang.Object r1 = r1.A04(r5, r4)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x00b1:
            X.MDv r4 = X.C41847B3o.A1H(r5, r6, r3)
            goto L_0x001a
        L_0x00b7:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00c0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c0:
            X.IQj r3 = X.C57145IQj.A00
            return r3
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A06(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(java.lang.String r20, X.AnonymousClass4D7 r21) {
        /*
            r19 = this;
            r3 = 22
            r4 = r21
            boolean r0 = X.C66143MDv.A02(r3, r4)
            r6 = r19
            if (r0 == 0) goto L_0x009c
            r5 = r4
            X.MDv r5 = (X.C66143MDv) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x005a
            if (r0 != r3) goto L_0x00ae
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a2
            X.3lr r4 = X.C41846B3n.A0R(r1)
            if (r4 == 0) goto L_0x00ab
            java.lang.Class<X.Bg2> r3 = X.C42643Bg2.class
            r2 = 0
            java.lang.String r1 = "xig_creator_ai_validate_link(data:$data)"
            r0 = 1223150942(0x48e7cd5e, float:474730.94)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x00ab
            java.lang.String r0 = "is_valid"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 != 0) goto L_0x00ab
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1 = 2131965066(0x7f13348a, float:1.9566931E38)
            X.GKO r0 = new X.GKO
            r0.<init>(r2, r1)
            X.Gq5 r1 = new X.Gq5
            r1.<init>(r0)
            return r1
        L_0x005a:
            X.0eS.A00(r1)
            X.1vn r2 = r6.A00
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "link"
            r8 = r20
            X.0Df r1 = X.C41845B3m.A03(r1, r8, r0)
            java.lang.String r0 = "data"
            X.1vR r8 = X.C41847B3o.A04(r1, r7, r0)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Bg3> r12 = X.C42644Bg3.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "KeywordResponseLinkValidation"
            r13 = 0
            java.lang.String r17 = "xig_creator_ai_validate_link"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5.A00 = r3
            java.lang.Object r1 = r2.A04(r7, r5)
            if (r1 != r4) goto L_0x0028
            return r4
        L_0x009c:
            X.MDv r5 = X.C41847B3o.A1H(r6, r4, r3)
            goto L_0x001a
        L_0x00a2:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00ab
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ab:
            X.IQj r1 = X.C57145IQj.A00
            return r1
        L_0x00ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A07(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.Long r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, X.AnonymousClass4D7 r21) {
        /*
            r15 = this;
            r7 = r18
            r4 = 9
            r5 = r21
            boolean r0 = X.C66129MDh.A01(r4, r5)
            if (r0 == 0) goto L_0x00d6
            r2 = r5
            X.MDh r2 = (X.C66129MDh) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00d6
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x001a:
            java.lang.Object r3 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            r10 = 0
            if (r0 == 0) goto L_0x0069
            if (r0 != r9) goto L_0x00dd
            X.0eS.A00(r3)
        L_0x0029:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0060
            X.3lr r3 = X.C41846B3n.A0R(r3)
            if (r3 == 0) goto L_0x005f
            java.lang.Class<X.Bfv> r2 = X.C42637Bfv.class
            r4 = 0
            java.lang.String r1 = "xig_create_creator_ai_link_keyword(data:$data)"
            r0 = 1961438951(0x74e92ee7, float:1.4779742E32)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x005f
            java.lang.Class<X.Bfu> r2 = X.C42636Bfu.class
            java.lang.String r1 = "creator_ai_link_keyword"
            r0 = -1991474348(0xffffffff894c8354, float:-2.4617357E-33)
            X.3lr r2 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r2 == 0) goto L_0x005f
            java.lang.Class<X.Bfz> r1 = X.C42641Bfz.class
            r0 = 202909926(0xc1828e6, float:1.1721961E-31)
            X.3lr r0 = r2.reinterpretRequired(r4, r1, r0)
            X.Bfz r0 = (X.C42641Bfz) r0
            X.QP8 r10 = A00(r0)
        L_0x005f:
            return r10
        L_0x0060:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x005f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0069:
            X.0eS.A00(r3)
            X.1vn r0 = r15.A00
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r4 = r15.A02
            java.lang.String r3 = "creator_igid"
            X.0Df r6 = X.C41845B3m.A03(r6, r4, r3)
            java.lang.String r3 = "keyword"
            r4 = r17
            X.0Df.A00(r6, r4, r3)
            if (r18 == 0) goto L_0x008f
            int r3 = r7.length()
            if (r3 != 0) goto L_0x0090
        L_0x008f:
            r7 = r10
        L_0x0090:
            java.lang.String r3 = "link"
            X.0Df.A00(r6, r7, r3)
            java.lang.String r3 = "description"
            r4 = r19
            X.0Df.A00(r6, r4, r3)
            java.lang.String r3 = "entrypoint"
            r4 = r20
            X.0Df.A00(r6, r4, r3)
            if (r16 == 0) goto L_0x00d4
            java.lang.String r4 = r16.toString()
        L_0x00a9:
            java.lang.String r3 = "expiration_time"
            X.0Df.A00(r6, r4, r3)
            java.lang.String r3 = "data"
            X.1vR r4 = X.C41847B3o.A04(r6, r5, r3)
            java.util.Map r6 = r5.getParamsCopy()
            java.util.Map r7 = r8.getParamsCopy()
            java.lang.Class<X.Bfw> r8 = X.C42638Bfw.class
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.lang.String r5 = "CreateNewKeywordResponseMutation"
            r11 = 0
            java.lang.String r13 = "xig_create_creator_ai_link_keyword"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r3 = X.C41846B3n.A0h(r3, r0, r15, r2)
            if (r3 != r1) goto L_0x0029
            return r1
        L_0x00d4:
            r4 = r10
            goto L_0x00a9
        L_0x00d6:
            X.MDh r2 = new X.MDh
            r2.<init>(r15, r5, r4)
            goto L_0x001a
        L_0x00dd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.keyword.KeywordRepository.A01(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
