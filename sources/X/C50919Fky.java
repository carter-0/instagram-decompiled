package X;

/* renamed from: X.Fky  reason: case insensitive filesystem */
public final class C50919Fky implements C337237fw {
    public final int A00;
    public final Object A01;

    public C50919Fky(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b2, code lost:
        if (r0.length() == 0) goto L_0x01b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dam(X.C337257fy r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x019f;
                case 1: goto L_0x0136;
                case 2: goto L_0x0188;
                case 3: goto L_0x00a4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r11.BiY()
            if (r0 == 0) goto L_0x0057
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0057
            java.lang.Object r8 = r10.A01
            X.F04 r8 = (X.F04) r8
            com.instagram.common.session.UserSession r7 = r8.A01
            java.lang.Object r0 = r11.Bo1()
            java.util.List r0 = (java.util.List) r0
        L_0x001d:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r0.iterator()
        L_0x0025:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006a
            com.instagram.model.direct.DirectShareTarget r3 = X.DbT.A0f(r4)
            if (r3 == 0) goto L_0x0025
            java.util.List r0 = X.DbT.A14(r3)
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L_0x0025
            boolean r1 = r3.A0U()
            java.util.List r0 = X.DbT.A14(r3)
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            X.0qQ.A0B(r0, r2)
            r0.A0L = r1
            com.instagram.user.model.User r0 = X.AnonymousClass48M.A00(r7, r0)
            r9.add(r0)
            goto L_0x0025
        L_0x0057:
            java.lang.Object r8 = r10.A01
            X.F04 r8 = (X.F04) r8
            com.instagram.common.session.UserSession r7 = r8.A01
            X.5fe r1 = X.C290635fd.A00(r7)
            java.lang.String r0 = "direct_user_search_nullstate"
            X.5g5 r0 = r1.A01(r0)
            java.util.List r0 = r0.A02
            goto L_0x001d
        L_0x006a:
            X.E2l r6 = r8.A04
            com.instagram.common.recyclerview.ViewModelListUpdate r5 = X.DbS.A0R()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r9.iterator()
        L_0x0078:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x012a
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            java.lang.String r0 = r2.getId()
            boolean r0 = X.2R8.A05(r7, r0)
            if (r0 != 0) goto L_0x0078
            boolean r0 = r2.CXO()
            if (r0 != 0) goto L_0x0078
            X.EUP r1 = new X.EUP
            r1.<init>()
            X.F8C.A01(r2, r1)
            X.F1s r0 = r8.A03
            X.FYL r0 = r0.A00(r1)
            r4.add(r0)
            goto L_0x0078
        L_0x00a4:
            r6 = 0
            X.0qQ.A0B(r11, r6)
            java.lang.Object r2 = r10.A01
            X.FGB r2 = (X.FGB) r2
            java.lang.Object r3 = r11.Bo1()
            java.util.List r3 = (java.util.List) r3
            java.lang.String r1 = r11.BjE()
            boolean r0 = r11.isLoading()
            X.FGB.A03(r2, r1, r3, r0)
            java.lang.String r5 = r11.BiY()
            if (r5 == 0) goto L_0x0135
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x0135
            boolean r0 = r11.isLoading()
            if (r0 != 0) goto L_0x0135
            java.lang.String r4 = r11.BjE()
            java.lang.String r0 = "@"
            boolean r0 = X.00p.A0k(r5, r0, r6)
            if (r0 == 0) goto L_0x0118
            java.lang.String r8 = "user"
        L_0x00dd:
            X.Ewk r1 = r2.A0E
            X.0JR r0 = r1.A01
            long r6 = r0.now()
            long r0 = r1.A00
            long r6 = r6 - r0
            X.0iw r1 = r2.A0A
            com.instagram.common.session.UserSession r0 = r2.A0D
            X.0xN r3 = X.C60510iO.A00(r0)
            java.lang.String r0 = "profile_tagging_search_results_shown"
            X.0xI r2 = X.0xI.A00(r1, r0)
            java.lang.String r0 = "link_type"
            r2.A0C(r0, r8)
            r0 = 3931(0xf5b, float:5.509E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0C(r0, r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.lang.String r0 = "request_time_ms"
            r2.A0B(r0, r1)
            java.lang.String r0 = "rank_token"
            if (r4 == 0) goto L_0x0114
            r2.A0C(r0, r4)
        L_0x0114:
            r3.EFq(r2)
            return
        L_0x0118:
            java.lang.String r0 = "#"
            boolean r0 = X.00p.A0k(r5, r0, r6)
            if (r0 == 0) goto L_0x0123
            java.lang.String r8 = "hashtag"
            goto L_0x00dd
        L_0x0123:
            java.lang.String r0 = "Impossible query term: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r5)
            throw r0
        L_0x012a:
            r5.A01(r4)
            X.2t9 r0 = r6.A00
            X.0qQ.A0A(r0)
            r0.A05(r5)
        L_0x0135:
            return
        L_0x0136:
            java.lang.Object r5 = r10.A01
            X.EEP r5 = (X.EEP) r5
            java.lang.Object r1 = r11.B3J()
            boolean r0 = r11.BBY()
            X.EEP.A0D(r5, r1, r0)
            java.lang.String r3 = r11.BiY()
            if (r3 == 0) goto L_0x0151
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0190
        L_0x0151:
            X.7fy r0 = r5.A0E
            r0.getClass()
            java.lang.Object r4 = r0.Bo1()
            java.util.List r4 = (java.util.List) r4
            com.instagram.model.direct.DirectShareTarget r1 = X.EEP.A01(r5, r11)
            if (r1 == 0) goto L_0x0166
            r0 = 0
            r4.add(r0, r1)
        L_0x0166:
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0181
            java.lang.String r3 = r5.A0M()
            java.lang.Integer r2 = X.EEP.A03(r5, r11)
        L_0x0172:
            java.util.ArrayList r1 = X.EEP.A05(r5, r4)
        L_0x0176:
            r0 = 1
            X.EEP.A0C(r5, r2, r3, r1, r0)
            java.lang.String r0 = r11.BnF()
            r5.A0I = r0
            return
        L_0x0181:
            java.lang.String r3 = r11.BiY()
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x0172
        L_0x0188:
            java.lang.Object r5 = r10.A01
            X.EEP r5 = (X.EEP) r5
            java.lang.String r3 = r11.BiY()
        L_0x0190:
            java.lang.Object r0 = r11.Bo1()
            java.util.List r0 = (java.util.List) r0
            java.lang.Integer r2 = X.EEP.A03(r5, r11)
            java.util.ArrayList r1 = X.EEP.A05(r5, r0)
            goto L_0x0176
        L_0x019f:
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.lang.Object r5 = r10.A01
            X.F15 r5 = (X.F15) r5
            java.lang.String r0 = r11.BiY()
            if (r0 == 0) goto L_0x01b4
            int r0 = r0.length()
            r7 = 0
            if (r0 != 0) goto L_0x01b5
        L_0x01b4:
            r7 = 1
        L_0x01b5:
            java.lang.Object r0 = r11.Bo1()
            java.util.List r0 = (java.util.List) r0
            java.util.HashSet r6 = X.AnonymousClass7TE.A1F()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x01c7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            java.lang.String r0 = r0.A06()
            boolean r0 = r6.add(r0)
            if (r0 == 0) goto L_0x01c7
            r4.add(r1)
            goto L_0x01c7
        L_0x01e2:
            r8 = r4
            boolean r0 = r11.isLoading()
            if (r0 == 0) goto L_0x01f9
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x01eb:
            X.FRO r6 = r5.A00
            java.lang.String r0 = "dataController"
            if (r6 != 0) goto L_0x020e
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01f9:
            boolean r0 = r11.CT5()
            if (r0 == 0) goto L_0x0202
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            goto L_0x01eb
        L_0x0202:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x020b
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            goto L_0x01eb
        L_0x020b:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x01eb
        L_0x020e:
            X.0qQ.A0B(r1, r2)
            r6.A00 = r1
            if (r7 == 0) goto L_0x0244
            java.util.Map r3 = r5.A0B
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0240
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r8.iterator()
        L_0x0227:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0240
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            java.lang.String r0 = r0.A06()
            boolean r0 = r3.containsKey(r0)
            X.DbV.A1U(r1, r4, r0)
            goto L_0x0227
        L_0x0240:
            r6.A05(r4)
            goto L_0x0252
        L_0x0244:
            java.lang.String r0 = r11.BiY()
            if (r0 != 0) goto L_0x024c
            java.lang.String r0 = ""
        L_0x024c:
            r6.A01()
            r6.A04(r0, r4)
        L_0x0252:
            X.2t9 r0 = r5.A03
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50919Fky.Dam(X.7fy):void");
    }
}
