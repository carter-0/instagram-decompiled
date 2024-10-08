package com.instagram.creator.agent.settings.content.sources.fetch;

import X.0qQ;
import X.1vn;
import X.AnonymousClass43D;
import X.C252733pa;

public final class IGCreatorAIContentCategoriesRepository extends C252733pa {
    public final 1vn A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGCreatorAIContentCategoriesRepository(1vn r3, String str) {
        super("content_categories", AnonymousClass43D.A00(245403032));
        0qQ.A0B(r3, 1);
        this.A00 = r3;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        r11 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r19) {
        /*
            r18 = this;
            r3 = 4
            r6 = r19
            boolean r0 = X.C66129MDh.A01(r3, r6)
            r5 = r18
            if (r0 == 0) goto L_0x0100
            r4 = r6
            X.MDh r4 = (X.C66129MDh) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0100
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0019:
            java.lang.Object r3 = r4.A02
            X.1Hj r0 = X.1Hj.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x00c1
            if (r2 != r1) goto L_0x0113
            X.0eS.A00(r3)
        L_0x0027:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0107
            X.3lr r5 = X.C41846B3n.A0R(r3)
            if (r5 == 0) goto L_0x0110
            java.lang.Class<X.Bfb> r3 = X.C42617Bfb.class
            r4 = 0
            java.lang.String r2 = "xig_ig_creator_ai_content_categories_query(request:$request)"
            r0 = 182595875(0xae23123, float:2.1781492E-32)
            X.3lr r5 = r5.getOptionalTreeField(r4, r2, r3, r0)
            if (r5 == 0) goto L_0x0110
            java.lang.Class<X.Bfa> r3 = X.C42616Bfa.class
            java.lang.String r2 = "categories"
            r0 = 2003412643(0x7769a6a3, float:4.7390038E33)
            com.google.common.collect.ImmutableList r2 = r5.getRequiredCompactedTreeListField(r4, r2, r3, r0)
            if (r2 == 0) goto L_0x0110
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r8 = r2.iterator()
        L_0x0056:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0112
            X.3lr r7 = X.C41845B3m.A0V(r8)
            X.HND r6 = X.HND.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r5 = "key"
            java.lang.Enum r10 = r7.getOptionalEnumField(r4, r5, r6)
            X.HND r10 = (X.HND) r10
            if (r10 != 0) goto L_0x006d
            r10 = r6
        L_0x006d:
            java.lang.String r2 = "label"
            java.lang.String r12 = r7.getOptionalStringField(r1, r2)
            java.lang.String r3 = ""
            if (r12 != 0) goto L_0x0078
            r12 = r3
        L_0x0078:
            java.lang.String r2 = "description"
            java.lang.String r13 = r7.A09(r2)
            if (r13 != 0) goto L_0x0081
            r13 = r3
        L_0x0081:
            r3 = 3
            java.lang.String r2 = "value"
            boolean r14 = r7.getCoercedBooleanField(r3, r2)
            java.lang.Enum r2 = r7.getOptionalEnumField(r4, r5, r6)
            X.HND r2 = (X.HND) r2
            if (r2 == 0) goto L_0x0097
            int r2 = r2.ordinal()
            switch(r2) {
                case 1: goto L_0x00ad;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00a1;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00b1;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00ad;
                case 9: goto L_0x00a9;
                default: goto L_0x0097;
            }
        L_0x0097:
            r11 = 0
        L_0x0098:
            X.GnV r9 = new X.GnV
            r9.<init>((X.HND) r10, (java.lang.Integer) r11, (java.lang.String) r12, (java.lang.String) r13, (boolean) r14)
            r0.add(r9)
            goto L_0x0056
        L_0x00a1:
            r2 = 2131238060(0x7f081cac, float:1.8092388E38)
            goto L_0x00bc
        L_0x00a5:
            r2 = 2131238367(0x7f081ddf, float:1.809301E38)
            goto L_0x00bc
        L_0x00a9:
            r2 = 2131237898(0x7f081c0a, float:1.809206E38)
            goto L_0x00bc
        L_0x00ad:
            r2 = 2131238856(0x7f081fc8, float:1.8094003E38)
            goto L_0x00bc
        L_0x00b1:
            r2 = 2131238690(0x7f081f22, float:1.8093666E38)
            goto L_0x00bc
        L_0x00b5:
            r2 = 2131238631(0x7f081ee7, float:1.8093546E38)
            goto L_0x00bc
        L_0x00b9:
            r2 = 2131238148(0x7f081d04, float:1.8092567E38)
        L_0x00bc:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            goto L_0x0098
        L_0x00c1:
            X.0eS.A00(r3)
            X.1vn r3 = r5.A00
            r13 = 0
            X.2IS r9 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r6 = r5.A01
            java.lang.String r2 = "creator_id"
            X.0Df r6 = X.C41845B3m.A03(r7, r6, r2)
            java.lang.String r2 = "request"
            X.1vR r7 = X.C41847B3o.A04(r6, r9, r2)
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<X.Bfc> r11 = X.C42618Bfc.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGCreatorAIContentCategoriesQuery"
            r12 = 0
            java.lang.String r16 = "xig_ig_creator_ai_content_categories_query"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = X.C41846B3n.A0h(r6, r3, r5, r4)
            if (r3 != r0) goto L_0x0027
            return r0
        L_0x0100:
            X.MDh r4 = new X.MDh
            r4.<init>(r5, r6, r3)
            goto L_0x0019
        L_0x0107:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0110
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0110:
            X.0sn r0 = X.0sn.A00
        L_0x0112:
            return r0
        L_0x0113:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository.A01(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.HND r18, X.AnonymousClass4D7 r19, boolean r20) {
        /*
            r17 = this;
            r3 = 18
            r5 = r19
            boolean r0 = X.C66143MDv.A02(r3, r5)
            r9 = r17
            if (r0 == 0) goto L_0x00ab
            r4 = r5
            X.MDv r4 = (X.C66143MDv) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ab
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r11 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 != r11) goto L_0x00b1
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            r1 = 0
            if (r0 == 0) goto L_0x004d
            X.3lr r4 = X.C41846B3n.A0R(r2)
            if (r4 == 0) goto L_0x0048
            java.lang.Class<X.Bfd> r3 = X.C42619Bfd.class
            java.lang.String r2 = "xig_ig_creator_ai_set_content_category_value_mutation(mutation:{\"creator_id\":$creator_fbid,\"key\":$key,\"value\":$value})"
            r0 = 756614164(0x2d190414, float:8.697949E-12)
            X.3lr r2 = r4.getOptionalTreeField(r1, r2, r3, r0)
            if (r2 == 0) goto L_0x0048
            java.lang.String r0 = "success"
            boolean r1 = r2.getCoercedBooleanField(r1, r0)
        L_0x0048:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L_0x004d:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0048
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0056:
            X.0eS.A00(r2)
            X.1vn r2 = r9.A00
            r12 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r1 = r18.toString()
            java.lang.String r0 = "key"
            boolean r6 = X.C41848B3p.A1Z(r8, r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r20)
            java.lang.String r0 = "value"
            r8.A02(r0, r1)
            boolean r5 = X.AnonymousClass7TF.A1V(r1)
            java.lang.String r1 = r9.A01
            java.lang.String r0 = "creator_fbid"
            r8.A04(r0, r1)
            X.17k.A0E(r6)
            X.1vR r6 = X.C41845B3m.A06(r5)
            java.util.Map r8 = r8.getParamsCopy()
            java.util.Map r9 = r7.getParamsCopy()
            java.lang.Class<X.Bfe> r10 = X.C42620Bfe.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "IGCreatorAISetContentCategoryValueMutation"
            r13 = 0
            java.lang.String r15 = "xig_ig_creator_ai_set_content_category_value_mutation"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A00 = r11
            java.lang.Object r2 = r2.A04(r5, r4)
            if (r2 != r3) goto L_0x0028
            return r3
        L_0x00ab:
            X.MDv r4 = X.C41847B3o.A1H(r9, r5, r3)
            goto L_0x001a
        L_0x00b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository.A00(X.HND, X.4D7, boolean):java.lang.Object");
    }
}
