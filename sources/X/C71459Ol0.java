package X;

import android.widget.CompoundButton;

/* renamed from: X.Ol0  reason: case insensitive filesystem */
public final class C71459Ol0 implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71459Ol0(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r20, boolean r21) {
        /*
            r19 = this;
            r3 = r19
            int r0 = r3.A00
            r8 = r20
            r1 = r21
            switch(r0) {
                case 0: goto L_0x01f3;
                case 1: goto L_0x01b4;
                case 2: goto L_0x015a;
                case 3: goto L_0x0091;
                case 4: goto L_0x0107;
                case 5: goto L_0x00a1;
                case 6: goto L_0x001d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Object r0 = r3.A02
            X.PR9 r0 = (X.PR9) r0
            r0.A0D = r1
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.A08
            if (r0 == 0) goto L_0x001c
            r0.onCheckedChanged(r8, r1)
        L_0x001c:
            return
        L_0x001d:
            r7 = 0
            X.0qQ.A0B(r8, r7)
            java.lang.Object r4 = r3.A02
            X.NgN r4 = (X.NgN) r4
            java.lang.Object r2 = r3.A01
            X.OTF r5 = r4.A00
            if (r5 != 0) goto L_0x0035
            java.lang.String r0 = "controller"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0035:
            r3 = 1
            java.util.Set r6 = r5.A01
            if (r21 == 0) goto L_0x005b
            r6.add(r2)
        L_0x003d:
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x0045:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r1.next()
            X.Nkv r0 = (X.C69415Nkv) r0
            int r0 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x0045
        L_0x005b:
            boolean r0 = r6.contains(r2)
            if (r0 == 0) goto L_0x0088
            int r0 = r6.size()
            if (r0 <= r3) goto L_0x0254
            r6.remove(r2)
            goto L_0x003d
        L_0x006b:
            java.lang.String[] r1 = X.DbU.A1b(r2, r7)
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.util.Set r2 = X.0sc.A07(r0)
            X.4kA r0 = r5.A00
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "pending_inbox_customized_top_filters"
            r1.E5h(r0, r2)
            r1.apply()
        L_0x0088:
            X.O8y r0 = r4.A01
            if (r0 == 0) goto L_0x001c
            X.NJW r0 = r0.A00
            r0.A05 = r3
            return
        L_0x0091:
            java.lang.Object r0 = r3.A02
            X.OMj r0 = (X.C70814OMj) r0
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x001c
            java.lang.Object r0 = r3.A01
            X.OJU r0 = (X.OJU) r0
            r0.A00(r2, r1)
            return
        L_0x00a1:
            java.lang.Object r0 = r3.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYl r4 = X.C69864NtS.A00(r0)
            java.lang.String r6 = r0.A06
            java.lang.Object r0 = r3.A01
            X.N9q r0 = (X.C68303N9q) r0
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r5 = r0.getId()
            r13 = 1
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1vn r3 = X.1vm.A01(r0)
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r14 = 0
            java.lang.String r0 = "business_ig_id"
            X.0Df r7 = X.C41845B3m.A03(r2, r6, r0)
            java.lang.String r0 = "consumer_ig_id"
            X.0Df.A00(r7, r5, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "opt_in_status"
            X.2IS r6 = X.JTQ.A0D(r7, r2, r0)
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "data"
            X.1vR r8 = X.C41847B3o.A04(r7, r6, r0)
            java.util.Map r10 = r6.getParamsCopy()
            java.util.Map r11 = r5.getParamsCopy()
            java.lang.Class<X.Bh5> r12 = X.C42708Bh5.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "AdsEventSharingSettingsSetConsumerOptInStatusMutation"
            r15 = 64
            java.lang.String r17 = "xfb_set_consumer_opt_in_status_for_biig_ads_event_sharing_settings"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.OnE r6 = X.C71577OnE.A00
            r5 = 0
            X.FRh r0 = new X.FRh
            r0.<init>(r5, r4, r1)
            r3.ATL(r0, r6, r7)
            r4.A02 = r2
            return
        L_0x0107:
            java.lang.Object r0 = r3.A02
            X.NO2 r0 = (X.NO2) r0
            X.OJe r0 = r0.A00
            java.lang.Object r7 = r3.A01
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r7 = (com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel) r7
            X.Oam r6 = r0.A00
            X.O76 r0 = r6.A06
            X.3sy r5 = r6.A07
            X.0wc r2 = r0.A00
            java.lang.String r0 = "change_vote"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            X.N0X r3 = new X.N0X
            r3.<init>()
            java.lang.String r2 = X.C66647MaG.A0B(r5)
            if (r2 == 0) goto L_0x0155
            java.lang.String r0 = "thread_id"
            r3.A06(r0, r2)
            X.C66583MXo.A13(r4, r3)
            long r4 = r7.A01
            java.util.Map r3 = r6.A0D
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r3.get(r2)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 != 0) goto L_0x0151
            r3.remove(r2)
        L_0x014d:
            X.C71067Oam.A00(r6)
            return
        L_0x0151:
            X.JTP.A1R(r2, r3, r1)
            goto L_0x014d
        L_0x0155:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x015a:
            java.lang.Object r1 = r3.A02
            X.NVA r1 = (X.NVA) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.O6G r2 = r1.A00
            java.lang.Object r0 = r3.A01
            X.P8Z r0 = (X.P8Z) r0
            com.instagram.model.direct.messageid.MessageIdentifier r1 = r0.A03
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.NKo r0 = r2.A00
            X.MuF r0 = r0.A0E()
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r0 = r0.A06
            java.lang.String r3 = r1.A01
            X.05G r2 = r0.A0F
            java.lang.Object r0 = r2.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r1 = 1
            if (r0 == 0) goto L_0x019f
            boolean r0 = r0.contains(r3)
            if (r0 != r1) goto L_0x019f
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = r2.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x0195
            X.0sn r0 = X.0sn.A00
        L_0x0195:
            r1.addAll(r0)
            r1.remove(r3)
        L_0x019b:
            r2.Epw(r1)
            return
        L_0x019f:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = r2.getValue()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L_0x01ad
            X.0sn r0 = X.0sn.A00
        L_0x01ad:
            r1.addAll(r0)
            r1.add(r3)
            goto L_0x019b
        L_0x01b4:
            if (r21 == 0) goto L_0x01c3
            java.lang.Object r0 = r3.A02
            X.Nga r0 = (X.C69184Nga) r0
            X.MuD r1 = X.C69184Nga.A07(r0)
            r0 = 1
            r1.A06(r0)
            return
        L_0x01c3:
            java.lang.Object r2 = r3.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r0 = 2131966509(0x7f133a2d, float:1.9569858E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Object r1 = r3.A01
            r0 = 9
            X.Plq r8 = X.C73915Plq.A00(r1, r8, r0)
            r0 = 32
            X.Pm6 r10 = new X.Pm6
            r10.<init>(r2, r0)
            r11 = 2131966508(0x7f133a2c, float:1.9569856E38)
            r0 = 2131975563(0x7f135d8b, float:1.9588222E38)
            r12 = 2131963104(0x7f132ce0, float:1.9562952E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            X.8ae r3 = X.C358278ae.RED_BOLD
            r7 = r6
            r9 = r6
            X.C71145Oe2.A06(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x01f3:
            java.lang.Object r0 = r3.A01
            X.N3o r0 = (X.C68173N3o) r0
            boolean r0 = r0.A04
            java.lang.Object r5 = r3.A02
            X.NgS r5 = (X.C69179NgS) r5
            if (r0 == 0) goto L_0x0249
            X.0eM r0 = r5.A04
            java.lang.String r4 = X.DbU.A0u(r0)
        L_0x0205:
            X.0eM r0 = r5.A02
            java.lang.Object r3 = r0.getValue()
            X.GPq r3 = (X.C52369GPq) r3
            if (r21 == 0) goto L_0x0246
            java.lang.String r2 = "thread_details_auto_reply_toggle_on"
        L_0x0211:
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r4)
            X.C52369GPq.A03(r3, r0, r2)
            X.0eM r0 = r5.A06
            java.lang.Object r3 = r0.getValue()
            X.Mtm r3 = (X.C67733Mtm) r3
            java.util.Map r0 = r3.A04
            java.util.LinkedHashMap r5 = X.0Yt.A03(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            com.instagram.common.session.UserSession r1 = r3.A00
            java.lang.String r0 = r1.A06
            r5.put(r0, r2)
            X.1Ou r4 = X.1Ou.A01(r1)
            java.lang.String r3 = r3.A03
            r2 = 1
            r1 = 0
            X.1py r0 = new X.1py
            r0.<init>(r1, r1, r2)
            r0.A01 = r5
            r0.A00 = r3
            r4.A0A(r0)
            return
        L_0x0246:
            java.lang.String r2 = "thread_details_auto_reply_toggle_off"
            goto L_0x0211
        L_0x0249:
            X.0eM r0 = r5.A03
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = X.DbS.A0q(r0)
            goto L_0x0205
        L_0x0254:
            r8.setChecked(r3)
            X.6ap r1 = X.DbV.A0X()
            r0 = 2131959915(0x7f13206b, float:1.9556484E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0D = r0
            X.DbY.A1N(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71459Ol0.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
