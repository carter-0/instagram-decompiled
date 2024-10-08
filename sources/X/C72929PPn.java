package X;

/* renamed from: X.PPn  reason: case insensitive filesystem */
public final class C72929PPn implements 0Jp {
    public final int A00;
    public final Object A01;

    public C72929PPn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATC(com.instagram.common.session.UserSession r20, X.0Jv r21) {
        /*
            r19 = this;
            r7 = r19
            int r0 = r7.A00
            r4 = r20
            r3 = r21
            switch(r0) {
                case 0: goto L_0x02b1;
                case 1: goto L_0x00a5;
                case 2: goto L_0x0182;
                case 3: goto L_0x0139;
                case 4: goto L_0x0117;
                case 5: goto L_0x003f;
                case 6: goto L_0x0026;
                case 7: goto L_0x00f9;
                case 8: goto L_0x001c;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.Object r1 = r7.A01
            X.0sL r1 = (X.0sL) r1
            r0 = 13
            X.Pm5 r0 = X.C73925Pm5.A01(r3, r0)
            r1.invoke(r4, r0)
        L_0x001b:
            return
        L_0x001c:
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.Object r0 = r7.A01
            X.C51965G9l.A1W(r0, r4)
            goto L_0x00f4
        L_0x0026:
            X.AnonymousClass7TG.A1N(r4, r3)
            X.3H4 r0 = X.2J7.A00(r4)
            X.0qQ.A07(r0)
            java.lang.Object r2 = r7.A01
            java.util.Map r2 = (java.util.Map) r2
            X.2aD r1 = X.2aD.A0I
            X.3H3 r0 = r0.A00
            int r0 = r0.A02
            X.C66580MXl.A1T(r1, r2, r0)
            goto L_0x00f4
        L_0x003f:
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.Object r2 = r7.A01
            com.instagram.direct.notifications.armadillo.retry.ArmadilloPushNotificationRetryWorker r2 = (com.instagram.direct.notifications.armadillo.retry.ArmadilloPushNotificationRetryWorker) r2
            androidx.work.WorkerParameters r0 = r2.mWorkerParams
            int r0 = r0.A01
            int r1 = r2.A00
            if (r0 != r1) goto L_0x0051
            com.instagram.direct.notifications.armadillo.retry.ArmadilloPushNotificationRetryWorker.A00(r4, r2)
        L_0x0051:
            X.65S r7 = X.AnonymousClass6ED.A00(r4)
            androidx.work.WorkerParameters r0 = r2.mWorkerParams
            int r0 = r0.A01
            int r1 = r1 - r0
            r0 = 34
            X.PqK r0 = X.C74178PqK.A00(r4, r0)
            r7.A02(r1, r0)
            androidx.work.WorkerParameters r0 = r2.A01
            X.3tw r0 = r0.A02
            java.util.Map r0 = r0.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            X.0qQ.A07(r0)
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r0)
        L_0x0078:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0092
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            r6.put(r1, r0)
            goto L_0x0078
        L_0x0092:
            X.8zv r0 = X.C372178zu.A0A
            X.8zu r5 = r0.A01()
            java.lang.String r2 = r4.A06
            r1 = 33
            X.Opf r0 = new X.Opf
            r0.<init>((java.lang.Object) r4, (int) r1)
            r5.A04(r0, r7, r2, r6)
            goto L_0x00f4
        L_0x00a5:
            r2 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r2, r4, r3)
            java.lang.Object r9 = r7.A01
            X.OlK r9 = (X.C71476OlK) r9
            android.content.Context r1 = r9.A02
            int r0 = r9.A01
            android.content.SharedPreferences r8 = X.C66581MXm.A07(r1, r0)
            java.lang.String r7 = "com.instagram.direct.appwidget.IS_THREAD_LISTENER_ADDED"
            java.lang.String r5 = r4.A05
            java.lang.String r0 = X.002.A0R(r7, r5)
            boolean r0 = r8.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x001b
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.2Kb> r1 = X.2Kb.class
            X.1wn r0 = r9.A05
            r2.A01(r0, r1)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.2Ka> r1 = X.2Ka.class
            X.1wn r0 = r9.A04
            r2.A01(r0, r1)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.2Kd> r1 = X.2Kd.class
            X.1wn r0 = r9.A03
            r2.A01(r0, r1)
            android.content.SharedPreferences$Editor r1 = r8.edit()
            java.lang.String r0 = X.002.A0R(r7, r5)
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r6)
            r0.apply()
        L_0x00f4:
            r0 = 0
            r3.AId(r0)
            return
        L_0x00f9:
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.Object r6 = r7.A01
            com.instagram.rtc.activity.RtcCallActivity r6 = (com.instagram.rtc.activity.RtcCallActivity) r6
            r6.A01 = r4
            r5 = 0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323667999141234(0x810c2f00072d72, double:3.0345721341034544E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0113
            r6.A03 = r3
            return
        L_0x0113:
            r3.AId(r5)
            return
        L_0x0117:
            X.AnonymousClass7TG.A1N(r4, r3)
            X.02m r5 = X.02m.A0p
            r0 = 28
            X.PqK r3 = X.C74178PqK.A00(r3, r0)
            java.lang.Object r2 = r7.A01
            X.0sL r2 = (X.0sL) r2
            X.0qQ.A0A(r5)
            r0 = 31
            X.Opf r1 = new X.Opf
            r1.<init>((int) r0, (X.0sP) r3)
            X.OBt r0 = new X.OBt
            r0.<init>(r1, r4)
            r2.invoke(r5, r0)
            return
        L_0x0139:
            r5 = 0
            X.AnonymousClass7TF.A1H(r4, r3)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.2Kb> r1 = X.2Kb.class
            java.lang.Object r6 = r7.A01
            X.OlK r6 = (X.C71476OlK) r6
            X.1wn r0 = r6.A05
            r2.A02(r0, r1)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.2Ka> r1 = X.2Ka.class
            X.1wn r0 = r6.A04
            r2.A02(r0, r1)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.2Kd> r1 = X.2Kd.class
            X.1wn r0 = r6.A03
            r2.A02(r0, r1)
            r0 = 0
            r3.AId(r0)
            android.content.Context r1 = r6.A02
            int r0 = r6.A01
            android.content.SharedPreferences r0 = X.C66581MXm.A07(r1, r0)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r1 = "com.instagram.direct.appwidget.IS_THREAD_LISTENER_ADDED"
            java.lang.String r0 = r4.A05
            java.lang.String r0 = X.002.A0R(r1, r0)
            android.content.SharedPreferences$Editor r0 = r2.putBoolean(r0, r5)
            r0.apply()
            return
        L_0x0182:
            X.AnonymousClass7TG.A1N(r4, r3)
            X.2Dm r1 = X.1bJ.A00(r4)
            java.lang.String r0 = "DirectWidgetRemoteViews"
            r1.CnE(r0)
            java.lang.Object r7 = r7.A01
            X.OlK r7 = (X.C71476OlK) r7
            android.content.Context r0 = r7.A02
            int r11 = r7.A01
            android.content.SharedPreferences r12 = X.C66581MXm.A07(r0, r11)
            com.google.gson.Gson r10 = new com.google.gson.Gson
            r10.<init>()
            X.R2o r0 = new X.R2o
            r0.<init>()
            java.lang.reflect.Type r1 = r0.type
            X.0qQ.A07(r1)
            java.lang.String r9 = "current_custom_chat_list"
            java.lang.String r0 = X.002.A0O(r9, r11)
            java.lang.String r6 = ""
            java.lang.String r0 = r12.getString(r0, r6)
            java.lang.Object r8 = r10.A09(r0, r1)
            java.util.AbstractMap r8 = (java.util.AbstractMap) r8
            if (r8 != 0) goto L_0x01c1
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
        L_0x01c1:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            r5 = 0
            if (r0 == 0) goto L_0x022d
            java.util.HashSet r5 = r7.A06
            r5.clear()
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r8)
        L_0x01d3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r2 = X.C51971G9r.A0p(r3)
            com.instagram.direct.appwidget.DirectThreadWidgetItem r2 = (com.instagram.direct.appwidget.DirectThreadWidgetItem) r2
            java.lang.String r1 = r2.A02
            if (r1 == 0) goto L_0x01f7
            X.2Dm r0 = X.1bJ.A00(r4)
            X.3U9 r0 = X.C66580MXl.A0d(r0, r1)
            if (r0 == 0) goto L_0x01f7
            boolean r0 = r0.Cdv(r4)
            r2.A00 = r0
            r5.add(r1)
            goto L_0x01d3
        L_0x01f7:
            r3.remove()
            goto L_0x01d3
        L_0x01fb:
            int r0 = r8.size()
            java.util.ArrayList r2 = X.DbS.A0v(r0)
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r8)
        L_0x0207:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0215
            java.lang.Object r0 = X.C51971G9r.A0p(r1)
            r2.add(r0)
            goto L_0x0207
        L_0x0215:
            r7.A00 = r2
            android.content.SharedPreferences$Editor r2 = r12.edit()
            X.0qQ.A07(r2)
            java.lang.String r1 = X.002.A0O(r9, r11)
            java.lang.String r0 = r10.A0B(r8)
            r2.putString(r1, r0)
            r2.apply()
            return
        L_0x022d:
            X.2Dm r0 = X.1bJ.A00(r4)
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r1 = r0.A0C
            X.43A r0 = X.AnonymousClass43A.A00
            java.util.List r1 = r1.A0F(r0)
            java.util.HashSet r2 = r7.A06
            r2.clear()
            r0 = 4
            java.util.List r0 = X.00k.A0d(r1, r0)
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x024d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x02ab
            X.2Ep r8 = X.C66580MXl.A0c(r11)
            java.util.List r0 = r8.BRZ()
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0263:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x026d
            X.C66582MXn.A1O(r10, r9)
            goto L_0x0263
        L_0x026d:
            java.lang.String r0 = r8.C6C()
            r2.add(r0)
            java.lang.String r13 = r8.C6f()
            java.lang.String r0 = ", "
            r16 = 0
            java.lang.String r14 = X.00k.A0P(r0, r6, r6, r10, r5)
            X.34S r0 = X.AnonymousClass48N.A00(r4, r8)
            java.lang.Object r0 = r0.A00
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            java.lang.String r15 = X.JTP.A0o(r0)
            X.34S r0 = X.AnonymousClass48N.A00(r4, r8)
            java.lang.Object r0 = r0.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            if (r0 == 0) goto L_0x029a
            java.lang.String r16 = r0.getUrl()
        L_0x029a:
            java.lang.String r17 = r8.C6C()
            boolean r18 = r8.Cdv(r4)
            com.instagram.direct.appwidget.DirectThreadWidgetItem r12 = new com.instagram.direct.appwidget.DirectThreadWidgetItem
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.add(r12)
            goto L_0x024d
        L_0x02ab:
            r7.A00 = r1
            r3.AId(r5)
            return
        L_0x02b1:
            X.AnonymousClass7TG.A1N(r4, r3)
            X.2Dm r1 = X.1bJ.A00(r4)
            java.lang.String r0 = "DirectRecipientSearch"
            r1.CnE(r0)
            X.2Dm r0 = X.1bJ.A00(r4)
            X.2Dr r0 = (X.2Dr) r0
            X.2ED r1 = r0.A0C
            X.43A r0 = X.AnonymousClass43A.A00
            r2 = 0
            java.util.List r10 = r1.A0F(r0)
            java.lang.Object r1 = r7.A01
            com.instagram.direct.appwidget.DirectRecipientSearchActivity r1 = (com.instagram.direct.appwidget.DirectRecipientSearchActivity) r1
            X.0nO r0 = X.0nY.A00()
            X.NSU r5 = new X.NSU
            r6 = r1
            r7 = r4
            r8 = r1
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r0.ATE(r5)
            r3.AId(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72929PPn.ATC(com.instagram.common.session.UserSession, X.0Jv):void");
    }
}
