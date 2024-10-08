package X;

public final class FSC implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;

    public FSC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03c9, code lost:
        if (r7 != null) goto L_0x0386;
     */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            r6 = r16
            switch(r0) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x0007;
                case 2: goto L_0x0411;
                case 3: goto L_0x0085;
                case 4: goto L_0x0074;
                case 5: goto L_0x0402;
                case 6: goto L_0x03eb;
                case 7: goto L_0x0045;
                case 8: goto L_0x00e8;
                case 9: goto L_0x0007;
                case 10: goto L_0x03e0;
                case 11: goto L_0x0007;
                case 12: goto L_0x031d;
                case 13: goto L_0x0303;
                case 14: goto L_0x0007;
                case 15: goto L_0x000f;
                case 16: goto L_0x0216;
                case 17: goto L_0x01cd;
                case 18: goto L_0x0192;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r15.A01
            X.2IR r0 = (X.2IR) r0
            r0.onSuccess(r6)
        L_0x000e:
            return
        L_0x000f:
            if (r16 == 0) goto L_0x000e
            X.3lr r3 = X.C41845B3m.A0U(r6)
            if (r3 == 0) goto L_0x000e
            java.lang.Class<com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsQueryResponseImpl$Viewer> r2 = com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsQueryResponseImpl.Viewer.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = 1887838281(0x70862049, float:3.3208017E29)
            java.lang.String r0 = "viewer"
            X.3lr r3 = r3.A03(r2, r0, r1)
            if (r3 == 0) goto L_0x000e
            java.lang.Class<com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsQueryResponseImpl$Viewer$User> r2 = com.instagram.settings.privacy.messages.privacysettings.graphql.IGDirectPrivacySettingsQueryResponseImpl.Viewer.User.class
            r1 = 510894145(0x1e73a041, float:1.2897453E-20)
            java.lang.String r0 = "user"
            X.3lr r5 = r3.A03(r2, r0, r1)
            if (r5 == 0) goto L_0x000e
            java.lang.Object r4 = r15.A01
            X.3pa r4 = (X.C252733pa) r4
            X.4Cq r3 = r4.A01
            r2 = 0
            r1 = 25
            X.MGf r0 = new X.MGf
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        L_0x0045:
            X.3lr r3 = X.C41845B3m.A0U(r6)
            if (r3 == 0) goto L_0x000e
            java.lang.Class<X.Bh1> r2 = X.C42704Bh1.class
            r4 = 0
            r0 = 829(0x33d, float:1.162E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1101492816(0xffffffffbe588db0, float:-0.211478)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x000e
            java.lang.Object r2 = r15.A01
            X.FYl r2 = (X.C50331FYl) r2
            r0 = 499(0x1f3, float:6.99E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r3.hasFieldValue(r1)
            if (r0 == 0) goto L_0x000e
            java.lang.Boolean r0 = X.C41846B3n.A0d(r3, r1, r4)
            r2.A01 = r0
            return
        L_0x0074:
            java.lang.Object r2 = r15.A01
            X.NIQ r2 = (X.NIQ) r2
            android.view.View r1 = r2.mView
            if (r1 == 0) goto L_0x000e
            X.Fsi r0 = new X.Fsi
            r0.<init>(r6, r2)
            r1.post(r0)
            return
        L_0x0085:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            if (r16 == 0) goto L_0x00ee
            X.3lr r4 = X.C41845B3m.A0U(r6)
            if (r4 == 0) goto L_0x00ee
            java.lang.Class<com.instagram.creator.inspiration.repository.graphql.GetTopAudioTrendsEligibleCategoriesResponseImpl$XdtTopAudioTrendsEligibleTabs> r2 = com.instagram.creator.inspiration.repository.graphql.GetTopAudioTrendsEligibleCategoriesResponseImpl.XdtTopAudioTrendsEligibleTabs.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = 546305915(0x208ff77b, float:2.438891E-19)
            r0 = 1947(0x79b, float:2.728E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r4 = r4.A05(r2, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creator.inspiration.repository.graphql.GetTopAudioTrendsEligibleCategoriesResponseImpl.XdtTopAudioTrendsEligibleTabs"
            X.0qQ.A0C(r4, r0)
            if (r4 == 0) goto L_0x00ee
            X.EWk r2 = X.C48118EWk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            r0 = 3046(0xbe6, float:4.268E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.google.common.collect.ImmutableList r0 = r4.getOptionalCompactedEnumListField(r1, r0, r2)
            if (r0 == 0) goto L_0x00ee
            X.3kO r2 = r0.iterator()
            X.0qQ.A07(r2)
        L_0x00bf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r2.next()
            X.EWk r0 = (X.C48118EWk) r0
            if (r0 == 0) goto L_0x00bf
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x00e5
            r0 = 1
            if (r1 == r0) goto L_0x00e2
            r0 = 4
            if (r1 != r0) goto L_0x00bf
            X.EZw r0 = X.C48154EZw.TRENDING_WITH_SIMILAR_ACCOUNTS
        L_0x00dc:
            java.lang.String r0 = r0.A00
            r3.add(r0)
            goto L_0x00bf
        L_0x00e2:
            X.EZw r0 = X.C48154EZw.POPULAR
            goto L_0x00dc
        L_0x00e5:
            X.EZw r0 = X.C48154EZw.TRENDING
            goto L_0x00dc
        L_0x00e8:
            java.lang.Object r3 = r6.Bny()
            if (r3 == 0) goto L_0x000e
        L_0x00ee:
            java.lang.Object r0 = r15.A01
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r3)
            return
        L_0x00f6:
            java.lang.Object r3 = r15.A01
            X.E88 r3 = (X.E88) r3
            X.6Rx r0 = r3.A02
            r7 = 0
            if (r0 == 0) goto L_0x000e
            X.6Rm r0 = r0.A03
            if (r0 == 0) goto L_0x000e
            if (r16 == 0) goto L_0x018f
            X.3lr r4 = X.C41845B3m.A0U(r6)
            if (r4 == 0) goto L_0x018f
            java.lang.Class<X.Bme> r2 = X.C42910Bme.class
            r0 = 3596(0xe0c, float:5.039E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1877186104(0xffffffff901c69c8, float:-3.0847066E-29)
            X.3lr r4 = r4.A03(r2, r1, r0)
            if (r4 == 0) goto L_0x018f
            java.lang.Class<X.Bmd> r2 = X.C42909Bmd.class
            java.lang.String r1 = "edges"
            r0 = -1423785097(0xffffffffab22c377, float:-5.7825224E-13)
            com.google.common.collect.ImmutableList r4 = r4.A06(r2, r1, r0)
            if (r4 == 0) goto L_0x018f
        L_0x0129:
            int r1 = r3.A00
            int r0 = r4.size()
            java.util.List r0 = r4.subList(r1, r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0137:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x041d
            X.3lr r5 = X.C41845B3m.A0V(r6)
            java.lang.Class<X.9ek> r2 = X.C382929ek.class
            java.lang.String r1 = "node"
            r0 = 88772458(0x54a8f6a, float:9.524335E-36)
            X.3lr r2 = r5.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x018d
            java.lang.Class<X.9en> r1 = X.C382959en.class
            r0 = 1583155594(0x5e5d098a, float:3.98185332E18)
            X.3lr r1 = r2.A01(r1, r0)
            X.9en r1 = (X.C382959en) r1
        L_0x0159:
            X.8ew r0 = r3.A03
            X.4dm r2 = r0.A00(r1)
            boolean r0 = r2 instanceof X.C268674do
            if (r0 == 0) goto L_0x0184
            X.4do r2 = (X.C268674do) r2
            java.lang.Object r9 = r2.A00
            X.Di0 r9 = (X.C46620Di0) r9
            r10 = 1
            r11 = 0
            X.9Vi r8 = new X.9Vi
            r13 = r11
            r8.<init>(r9, r10, r11, r13)
            X.4do r2 = new X.4do
            r2.<init>(r8)
        L_0x0177:
            X.1TZ r1 = X.1TZ.A00()
            X.AmU r0 = new X.AmU
            r0.<init>(r3, r2)
            r1.A01(r0)
            goto L_0x0137
        L_0x0184:
            boolean r0 = r2 instanceof X.C268664dn
            if (r0 != 0) goto L_0x0177
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x018d:
            r1 = r7
            goto L_0x0159
        L_0x018f:
            X.0sn r4 = X.0sn.A00
            goto L_0x0129
        L_0x0192:
            java.lang.Object r0 = r15.A01
            X.E2y r0 = (X.C47452E2y) r0
            X.5Oz r4 = r0.A05
            if (r16 == 0) goto L_0x01cb
            X.3lr r3 = X.C41845B3m.A0U(r6)
            if (r3 == 0) goto L_0x01cb
            java.lang.Class<X.C7L> r2 = X.C7L.class
            r0 = 827(0x33b, float:1.159E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1823822863(0xffffffff934aabf1, float:-2.5580758E-27)
            X.3lr r3 = r3.A05(r2, r1, r0)
            if (r3 == 0) goto L_0x01cb
            java.lang.Class<X.C7K> r2 = X.C7K.class
            java.lang.String r1 = "user"
            r0 = -175464755(0xfffffffff58a9ecd, float:-3.5144425E32)
            X.3lr r2 = r3.A05(r2, r1, r0)
            if (r2 == 0) goto L_0x01cb
            java.lang.Class<X.C7J> r1 = X.C7J.class
            r0 = 619595891(0x24ee4873, float:1.0333878E-16)
            X.3lr r0 = r2.A01(r1, r0)
        L_0x01c7:
            r4.Epw(r0)
            return
        L_0x01cb:
            r0 = 0
            goto L_0x01c7
        L_0x01cd:
            r3 = 0
            if (r16 == 0) goto L_0x0214
            java.lang.Object r2 = r6.Bny()
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            if (r2 == 0) goto L_0x0214
            java.lang.Class<X.9pa> r1 = X.C389419pa.class
            r0 = 827(0x33b, float:1.159E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            X.5uH r1 = (X.C298935uH) r1
            if (r1 == 0) goto L_0x0214
            java.lang.Object r0 = r15.A01
            X.E2y r0 = (X.C47452E2y) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1E5 r0 = X.1E4.A00(r0)
            X.5uG r0 = r1.FD9(r0)
            X.92k r1 = new X.92k
            r1.<init>()
            r1.A02 = r0
        L_0x0201:
            java.lang.Object r0 = r15.A01
            X.E2y r0 = (X.C47452E2y) r0
            X.5Oz r0 = r0.A04
            r0.Epw(r3)
            if (r1 == 0) goto L_0x0210
            com.instagram.user.model.User r3 = X.C324696zk.A00(r1)
        L_0x0210:
            r0.Epw(r3)
            return
        L_0x0214:
            r1 = r3
            goto L_0x0201
        L_0x0216:
            java.lang.Object r5 = r15.A01
            X.FV9 r5 = (X.FV9) r5
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = X.DbS.A0R()
            if (r16 == 0) goto L_0x02cf
            java.lang.Object r3 = r6.Bny()
            if (r3 == 0) goto L_0x02cf
            X.3lr r3 = (X.C250663lr) r3
            com.instagram.common.session.UserSession r8 = r5.A06
            java.lang.Class<X.C68> r2 = X.C68.class
            r10 = 0
            r0 = 4245(0x1095, float:5.949E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1013330306(0xffffffffc399ce7e, float:-307.61322)
            X.3lr r3 = r3.getRequiredTreeField(r10, r1, r2, r0)
            java.lang.Class<X.C67> r2 = X.C67.class
            r0 = 3801(0xed9, float:5.326E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1254648042(0x4ac868ea, float:6567029.0)
            com.google.common.collect.ImmutableList r1 = r3.getRequiredCompactedTreeListField(r10, r1, r2, r0)
            int r0 = r1.size()
            java.util.ArrayList r7 = X.DbS.A0v(r0)
            X.3kO r9 = r1.iterator()
        L_0x0255:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0294
            X.3lr r3 = X.C41845B3m.A0V(r9)
            java.lang.Class<X.C66> r2 = X.C66.class
            java.lang.String r1 = "user"
            r0 = 1837611658(0x6d87ba8a, float:5.2507485E27)
            X.3lr r2 = r3.getRequiredTreeField(r10, r1, r2, r0)
            java.lang.Class<X.C6A> r1 = X.C6A.class
            r0 = -37926212(0xfffffffffdbd4abc, float:-3.1451517E37)
            X.3lr r2 = r2.reinterpretRequired(r10, r1, r0)
            X.1E5 r1 = X.1E4.A00(r8)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r0 = X.Dbc.A0A(r2, r1)
            java.util.List r6 = X.DbW.A0n(r0)
            X.5gg r3 = new X.5gg
            r3.<init>(r6)
            java.lang.String r2 = X.AnonymousClass50n.A07(r0)
            r1 = 1
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r0.<init>(r3, r2, r6, r1)
            r7.add(r0)
            goto L_0x0255
        L_0x0294:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r7)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02cf
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            com.google.common.collect.ImmutableList$Builder r7 = new com.google.common.collect.ImmutableList$Builder
            r7.<init>()
            X.3kO r6 = r1.iterator()
        L_0x02ab:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02e1
            com.instagram.model.direct.DirectShareTarget r2 = X.DbT.A0f(r6)
            boolean r0 = r2.A0O()
            if (r0 == 0) goto L_0x02ab
            java.util.ArrayList r0 = r2.A0B()
            java.lang.Object r1 = r0.get(r10)
            java.lang.String r0 = r5.mResponsibleUserId
            boolean r0 = X.2Ob.A00(r1, r0)
            if (r0 != 0) goto L_0x02ab
            r7.add(r2)
            goto L_0x02ab
        L_0x02cf:
            android.content.Context r1 = r5.A05
            r0 = 2131968486(0x7f1341e6, float:1.9573868E38)
            java.lang.String r1 = r1.getString(r0)
            X.EGY r0 = new X.EGY
            r0.<init>(r1)
            r4.A00(r0)
            goto L_0x02fd
        L_0x02e1:
            com.google.common.collect.ImmutableList r8 = r7.build()
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x02fa
            r9 = 12
            r11 = -1
            r12 = r10
            r13 = r10
            java.util.ArrayList r0 = X.FYR.A00(r8, r9, r10, r11, r12, r13)
            r3.addAll(r0)
            r8.size()
        L_0x02fa:
            r4.A01(r3)
        L_0x02fd:
            X.2t9 r0 = r5.A00
            r0.A05(r4)
            return
        L_0x0303:
            if (r16 == 0) goto L_0x0315
            java.lang.Object r1 = r6.Bny()
            if (r1 == 0) goto L_0x0315
            java.lang.Object r0 = r15.A01
            X.G7G r0 = (X.G7G) r0
            X.C8L r1 = (X.C8L) r1
            r0.DoT(r1)
            return
        L_0x0315:
            java.lang.Object r0 = r15.A01
            X.G7G r0 = (X.G7G) r0
            r0.DED()
            return
        L_0x031d:
            if (r16 == 0) goto L_0x03cc
            java.lang.Object r7 = r6.Bny()
            if (r7 == 0) goto L_0x03cc
            java.lang.Object r0 = r15.A01
            X.EuY r0 = (X.C49370EuY) r0
            X.3lr r7 = (X.C250663lr) r7
            X.E5h r5 = r0.A00
            X.EEK r0 = r5.A01
            if (r0 == 0) goto L_0x0334
            r0.A00()
        L_0x0334:
            r6 = 1
            if (r7 == 0) goto L_0x036b
            java.lang.Class<X.Bxr> r2 = X.C43415Bxr.class
            r0 = 825(0x339, float:1.156E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1305955866(0xffffffffb228b1e6, float:-9.8193365E-9)
            X.3lr r2 = r7.A05(r2, r1, r0)
            if (r2 == 0) goto L_0x036b
            r1 = 2
            r0 = 138(0x8a, float:1.93E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.getRequiredBooleanField(r1, r0)
            if (r0 != r6) goto L_0x036b
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "contact_point_confirmed"
            r2.putBoolean(r0, r6)
            X.0hq r1 = r5.getParentFragmentManager()
            java.lang.String r0 = "conf_code_response_request_code"
            r1.A0z(r0, r2)
            X.DbT.A1I(r5)
            return
        L_0x036b:
            r3 = 0
            if (r7 == 0) goto L_0x03c8
            java.lang.Class<X.Bxr> r4 = X.C43415Bxr.class
            r2 = 0
            r0 = 825(0x339, float:1.156E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1305955866(0xffffffffb228b1e6, float:-9.8193365E-9)
            X.3lr r1 = r7.getRequiredTreeField(r2, r1, r4, r0)
            if (r1 == 0) goto L_0x03c8
            java.lang.String r0 = "error"
            java.lang.String r4 = r1.getOptionalStringField(r2, r0)
        L_0x0386:
            java.lang.Class<X.Bxr> r2 = X.C43415Bxr.class
            r0 = 825(0x339, float:1.156E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1305955866(0xffffffffb228b1e6, float:-9.8193365E-9)
            X.3lr r1 = r7.A05(r2, r1, r0)
            if (r1 == 0) goto L_0x039d
            java.lang.String r0 = "exception"
            java.lang.String r3 = r1.getOptionalStringField(r6, r0)
        L_0x039d:
            X.0eM r0 = r5.A08
            X.0lg r2 = X.DbT.A0X(r0)
            java.lang.String r1 = "contact_point_confirmation"
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x03c5
            java.lang.String r0 = "phone"
        L_0x03ab:
            X.C49218ErN.A00(r2, r1, r0, r4, r3)
            if (r4 == 0) goto L_0x03d9
            int r0 = r4.length()
            if (r0 == 0) goto L_0x03d9
            X.1xC r1 = X.1xC.A01
            X.6ap r0 = X.DbS.A0a()
            r0.A0D = r4
            r0.A06()
            X.DbY.A1K(r1, r0)
            return
        L_0x03c5:
            java.lang.String r0 = "email"
            goto L_0x03ab
        L_0x03c8:
            r4 = r3
            if (r7 == 0) goto L_0x039d
            goto L_0x0386
        L_0x03cc:
            java.lang.Object r0 = r15.A01
            X.EuY r0 = (X.C49370EuY) r0
            X.E5h r5 = r0.A00
            X.EEK r0 = r5.A01
            if (r0 == 0) goto L_0x03d9
            r0.A00()
        L_0x03d9:
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            X.C47502E5h.A00(r5, r0)
            return
        L_0x03e0:
            X.FGz r2 = X.C49966FGz.A00
            java.lang.Object r1 = r15.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            r2.A07(r1, r0)
            return
        L_0x03eb:
            java.lang.Object r0 = r15.A01
            X.E5z r0 = (X.C47516E5z) r0
            X.0eM r0 = r0.A01
            java.lang.Object r2 = r0.getValue()
            X.1Av r2 = (X.1Av) r2
            r1 = 1
            r0 = 1698(0x6a2, float:2.38E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A13(r0, r1)
            return
        L_0x0402:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r2 = X.1Au.A00(r0)
            java.lang.String r1 = "ai_agent_character_disclaimer_server_flag"
            r0 = 1
            r2.A13(r1, r0)
            return
        L_0x0411:
            java.lang.Object r1 = r15.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.invoke(r0)
            return
        L_0x041d:
            int r0 = r4.size()
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSC.invoke(X.3JD):void");
    }
}
