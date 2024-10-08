package com.instagram.creation.genai.magicmod.consentflow.api;

public final class MagicModConsentGraphQLApi {
    public static final MagicModConsentGraphQLApi A00 = new Object();

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME8, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r19, java.util.List r20, X.AnonymousClass4D7 r21) {
        /*
            r18 = this;
            r4 = 44
            r5 = r21
            boolean r0 = X.ME8.A03(r4, r5)
            if (r0 == 0) goto L_0x013b
            r3 = r5
            X.ME8 r3 = (X.ME8) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x013b
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x00c0
            if (r0 != r4) goto L_0x0156
            X.0eS.A00(r1)
        L_0x0026:
            r2 = r1
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0146
            X.3lr r3 = X.C41846B3n.A0R(r2)
            if (r3 == 0) goto L_0x014f
            java.lang.Class<X.Bvq> r2 = X.C43290Bvq.class
            r6 = 0
            java.lang.String r1 = "viewer"
            r0 = -737001083(0xffffffffd4124185, float:-2.51265784E12)
            X.3lr r3 = r3.getOptionalTreeField(r6, r1, r2, r0)
            if (r3 == 0) goto L_0x014f
            java.lang.Class<X.Bvp> r2 = X.C43289Bvp.class
            java.lang.String r1 = "flm_magic_mod_consent_states(products:$products)"
            r0 = 1625924359(0x60e9a307, float:1.3468246E20)
            X.3lr r3 = r3.getOptionalTreeField(r6, r1, r2, r0)
            if (r3 == 0) goto L_0x014f
            java.lang.Class<X.Bvo> r2 = X.C43288Bvo.class
            java.lang.String r1 = "nodes"
            r0 = 1665487911(0x63455427, float:3.6400724E21)
            com.google.common.collect.ImmutableList r1 = r3.getRequiredCompactedTreeListField(r6, r1, r2, r0)
            if (r1 == 0) goto L_0x014f
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r1.iterator()
        L_0x0063:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0151
            X.3lr r7 = X.C41845B3m.A0V(r8)
            if (r7 == 0) goto L_0x0063
            java.lang.String r1 = "product"
            java.lang.String r3 = r7.getOptionalStringField(r4, r1)
            if (r3 == 0) goto L_0x0063
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.String r1 = "magicmod_backdrop"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0095
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "magicmod_restyle"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0095
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            java.lang.String r1 = "magicmod_expander"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0063
        L_0x0095:
            int r1 = r2.intValue()
            if (r1 == r6) goto L_0x00bd
            if (r1 == r4) goto L_0x00ba
            X.8hK r5 = X.C362088hK.A0A
        L_0x009f:
            X.EWt r2 = X.C48127EWt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "consent_state"
            java.lang.Enum r3 = r7.getOptionalEnumField(r6, r1, r2)
            X.EWt r2 = X.C48127EWt.CONSENTED
            r1 = 0
            if (r3 != r2) goto L_0x00ad
            r1 = 1
        L_0x00ad:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            X.JVf r1 = new X.JVf
            r1.<init>((X.C362088hK) r5, (java.lang.Boolean) r2)
            r0.add(r1)
            goto L_0x0063
        L_0x00ba:
            X.8hK r5 = X.C362088hK.A0B
            goto L_0x009f
        L_0x00bd:
            X.8hK r5 = X.C362088hK.A09
            goto L_0x009f
        L_0x00c0:
            X.0eS.A00(r1)
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r20)
            java.util.Iterator r5 = r20.iterator()
        L_0x00cb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r0 = r5.next()
            X.8hK r0 = (X.C362088hK) r0
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00fb
            if (r1 == r4) goto L_0x00f8
            r0 = 2
            if (r1 != r0) goto L_0x015b
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x00e5:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00f2;
                case 1: goto L_0x00f5;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            java.lang.String r0 = "magicmod_expander"
        L_0x00ee:
            r7.add(r0)
            goto L_0x00cb
        L_0x00f2:
            java.lang.String r0 = "magicmod_backdrop"
            goto L_0x00ee
        L_0x00f5:
            java.lang.String r0 = "magicmod_restyle"
            goto L_0x00ee
        L_0x00f8:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x00e5
        L_0x00fb:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00e5
        L_0x00fe:
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
            java.lang.String r0 = "products"
            r6.A05(r0, r1)
            X.1vR r7 = X.C41845B3m.A05()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Bvr> r11 = X.C43291Bvr.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGSharingGenAIMagicModConsentQuery"
            r12 = 0
            java.lang.String r16 = "viewer"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = X.1vm.A01(r19)
            r3.A00 = r4
            java.lang.Object r1 = r0.A04(r6, r3)
            if (r1 != r2) goto L_0x0026
            return r2
        L_0x013b:
            r0 = 42
            X.ME8 r3 = new X.ME8
            r1 = r18
            r3.<init>(r1, r5, r4, r0)
            goto L_0x0018
        L_0x0146:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0155
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x014f:
            X.0sn r0 = X.0sn.A00
        L_0x0151:
            X.3Ih r2 = X.C41845B3m.A0d(r0)
        L_0x0155:
            return r2
        L_0x0156:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x015b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.magicmod.consentflow.api.MagicModConsentGraphQLApi.A00(com.instagram.common.session.UserSession, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME8, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r10, java.util.List r11, X.AnonymousClass4D7 r12, boolean r13) {
        /*
            r9 = this;
            r3 = 45
            boolean r0 = X.ME8.A03(r3, r12)
            if (r0 == 0) goto L_0x00d7
            r4 = r12
            X.ME8 r4 = (X.ME8) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d7
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 != r6) goto L_0x00e0
            X.0eS.A00(r1)
        L_0x0024:
            r5 = r1
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0052
            X.3lr r4 = X.C41846B3n.A0R(r5)
            if (r4 == 0) goto L_0x0050
            java.lang.Class<X.Bvm> r3 = X.C43286Bvm.class
            r2 = 0
            java.lang.String r1 = "xig_ig_magic_mod_set_flm_consent_mutation(params:$params)"
            r0 = -1614656019(0xffffffff9fc24ded, float:-8.2291113E-20)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0050
            java.lang.String r0 = "success"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 != r6) goto L_0x0050
        L_0x0047:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            X.3Ih r5 = X.C41845B3m.A0d(r0)
        L_0x004f:
            return r5
        L_0x0050:
            r6 = 0
            goto L_0x0047
        L_0x0052:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005b:
            X.0eS.A00(r1)
            if (r13 == 0) goto L_0x00ac
            java.lang.String r3 = "CONSENTED"
        L_0x0062:
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r11)
            java.util.Iterator r8 = r11.iterator()
        L_0x006a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r8.next()
            X.8hK r0 = (X.C362088hK) r0
            X.2IV r2 = new X.2IV
            r2.<init>()
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x00a9
            if (r1 == r6) goto L_0x00a6
            r0 = 2
            if (r1 != r0) goto L_0x00e5
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0089:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x00a0;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.String r1 = "magicmod_expander"
        L_0x0092:
            java.lang.String r0 = "product"
            r2.A09(r1, r0)
            java.lang.String r0 = "consent_state"
            r2.A09(r3, r0)
            r7.add(r2)
            goto L_0x006a
        L_0x00a0:
            java.lang.String r1 = "magicmod_restyle"
            goto L_0x0092
        L_0x00a3:
            java.lang.String r1 = "magicmod_backdrop"
            goto L_0x0092
        L_0x00a6:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0089
        L_0x00a9:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0089
        L_0x00ac:
            java.lang.String r3 = "WITHDRAWN"
            goto L_0x0062
        L_0x00af:
            X.2IV r3 = new X.2IV
            r3.<init>()
            java.lang.String r0 = "products"
            r3.A05(r0, r7)
            X.2IS r2 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "params"
            r2.A00(r3, r0)
            com.facebook.pando.PandoGraphQLRequest r1 = X.C45928DFi.A00(r2, r1)
            X.1vn r0 = X.1vm.A01(r10)
            r4.A00 = r6
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x00d7:
            r0 = 42
            X.ME8 r4 = new X.ME8
            r4.<init>(r9, r12, r3, r0)
            goto L_0x0016
        L_0x00e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00e5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.magicmod.consentflow.api.MagicModConsentGraphQLApi.A01(com.instagram.common.session.UserSession, java.util.List, X.4D7, boolean):java.lang.Object");
    }
}
