package X;

public final class NgC extends C262934Go {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public NgC(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: X.0wW} */
    /* JADX WARNING: type inference failed for: r0v18, types: [X.OL2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0264, code lost:
        if (r0 != null) goto L_0x00f3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9d() {
        /*
            r23 = this;
            r4 = r23
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0031
            java.lang.Object r2 = r4.A01
            X.E6S r2 = (X.E6S) r2
            com.instagram.common.session.UserSession r1 = r2.A02
            java.lang.String r0 = r2.A04
            X.E1D r3 = X.C49793F7b.A00(r1, r0)
            com.instagram.common.session.UserSession r0 = r2.A02
            X.7Pr r2 = X.DbS.A0W(r0)
            java.lang.Object r1 = r4.A03
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            r0 = 2131952260(0x7f130284, float:1.9540958E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0d = r0
            X.7Pu r1 = r2.A00()
            java.lang.Object r0 = r4.A02
            android.app.Activity r0 = (android.app.Activity) r0
            r1.A02(r0, r3)
            return
        L_0x0031:
            java.lang.Object r7 = r4.A03
            X.ERb r7 = (X.C48014ERb) r7
            java.lang.Object r8 = r4.A01
            android.app.Activity r8 = (android.app.Activity) r8
            X.0wW r6 = r7.getSession()
            java.lang.Object r5 = r4.A02
            com.instagram.bugreporter.BugReportComposerViewModel r5 = (com.instagram.bugreporter.BugReportComposerViewModel) r5
            java.lang.String r1 = r7.A06
            X.2cc r0 = X.C71342cb.A00(r6)
            r0.A06(r8)
            X.OWB r9 = new X.OWB
            r9.<init>()
            r12 = r6
            boolean r10 = r6 instanceof com.instagram.common.session.UserSession
            if (r10 == 0) goto L_0x00cf
            X.3Wh r3 = X.C242853Wg.A00(r6)
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            r4 = 0
            X.0qQ.A0B(r12, r4)
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            java.util.List r0 = r3.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0068:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r2.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.3Wf r0 = (X.C242843Wf) r0
            if (r0 != 0) goto L_0x0080
            r2.remove()
            goto L_0x0068
        L_0x0080:
            java.util.Map r0 = r0.B3T()
            if (r0 == 0) goto L_0x0068
            r11.putAll(r0)
            goto L_0x0068
        L_0x008a:
            java.util.List r0 = r3.A01
            java.util.Iterator r15 = r0.iterator()
        L_0x0090:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r15.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x00a6
            r15.remove()
            goto L_0x0090
        L_0x00a6:
            boolean r0 = X.C66611MYx.A00(r12)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "msys_decoupling_is_main_db_needed"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r2)
            r13 = 36325965806581148(0x810e460006359c, double:3.036025276780984E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r13)
            boolean r0 = X.C3027865g.A00(r12, r0, r4)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "msys_decoupling_enabled"
            java.util.LinkedHashMap r0 = X.DbY.A0p(r0, r2, r3)
            r11.putAll(r0)
            goto L_0x0090
        L_0x00cf:
            X.0sm r11 = X.0Yt.A0E()
        L_0x00d3:
            r4 = 0
            r9.A0N = r11
            java.lang.String r0 = r7.A08
            r9.A0H = r0
            java.lang.String r0 = r7.A07
            r9.A0B = r0
            if (r10 == 0) goto L_0x00e7
            r0 = r6
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.lang.String r0 = r0.A06
            r9.A0I = r0
        L_0x00e7:
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x0262
            boolean r0 = X.0oI.A09(r8)
            if (r0 == 0) goto L_0x025e
            com.instagram.bugreporter.source.BugReportSource r0 = com.instagram.bugreporter.source.BugReportSource.BARCELONA_RAGE_SHAKE
        L_0x00f3:
            r9.A00 = r0
        L_0x00f5:
            if (r1 == 0) goto L_0x00f9
            r9.A06 = r1
        L_0x00f9:
            com.instagram.bugreporter.model.BugReport r3 = r9.A01()
            X.Pwg r10 = r7.A02
            java.lang.String r16 = "userFlowLoggerV2"
            r2 = 0
            if (r10 == 0) goto L_0x0268
            com.instagram.bugreporter.source.BugReportSource r1 = r3.A00
            java.lang.String r0 = r3.A0G
            r10.AW2(r1, r0)
            X.Pwg r10 = r7.A02
            if (r10 == 0) goto L_0x0268
            java.lang.String r0 = "view_hierarchy_start"
            r10.AVy(r0)
            X.0Tu r11 = X.0Tu.A05
            r0 = 36327889951734546(0x81100600033b12, double:3.0372421139239034E-306)
            boolean r0 = X.182.A06(r11, r6, r0)
            r11 = 0
            if (r0 != 0) goto L_0x0183
            java.lang.String r0 = "view_hierarchy_skipped"
            r10.AVy(r0)
        L_0x0127:
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x015b
            X.Pwg r1 = r7.A02
            if (r1 == 0) goto L_0x0268
            java.lang.String r0 = "automatic_take_screenshot_start"
            r1.AVy(r0)
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r1 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource.BUG_REPORTER
            com.meta.flytrap.attachment.model.AttachmentCounter r0 = r9.A01
            X.0qQ.A0B(r1, r4)
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            X.LRG r0 = X.LRG.A00
            java.lang.Object r11 = r0.A01(r8, r6)
            boolean r10 = r11 instanceof X.0eQ
            r0 = r10 ^ 1
            X.Pwg r9 = r7.A02
            if (r0 == 0) goto L_0x0174
            if (r9 == 0) goto L_0x0268
            java.lang.String r0 = "automatic_take_screenshot_success"
            r9.AVy(r0)
        L_0x0155:
            if (r10 == 0) goto L_0x0158
            r11 = r2
        L_0x0158:
            r2 = r11
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
        L_0x015b:
            X.Mqv r0 = X.C67620Mqs.A04
            X.Pwg r0 = r7.A02
            if (r0 == 0) goto L_0x0268
            X.NMP r9 = new X.NMP
            r13 = r0
            r14 = r3
            r15 = r6
            r12 = r5
            r11 = r2
            r10 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.lang.Void[] r0 = new java.lang.Void[r4]
            r9.A02(r0)
            r7.A00 = r9
            return
        L_0x0174:
            if (r9 == 0) goto L_0x0268
            r0 = 32
            X.Iwb r1 = new X.Iwb
            r1.<init>(r11, r0)
            java.lang.String r0 = "automatic_take_screenshot_failure"
            r9.AW0(r0, r1)
            goto L_0x0155
        L_0x0183:
            X.OL2 r0 = new X.OL2     // Catch:{ all -> 0x021d }
            r0.<init>()     // Catch:{ all -> 0x021d }
            java.util.ArrayList r0 = r0.A00()     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x0216
            java.util.List r15 = X.00k.A0X(r0)     // Catch:{ all -> 0x021d }
            X.Nsb r0 = X.OV8.A01     // Catch:{ all -> 0x021d }
            java.lang.String r12 = "view_hierarchy"
            java.lang.String r14 = "txt"
            java.io.File r1 = X.OV8.A02     // Catch:{ all -> 0x021d }
            java.lang.String r0 = "temp"
            java.io.File r13 = X.JTO.A0s(r1, r0)     // Catch:{ all -> 0x021d }
            r13.mkdirs()     // Catch:{ all -> 0x021d }
            java.lang.StringBuilder r12 = X.AnonymousClass7TF.A0n(r12)     // Catch:{ all -> 0x021d }
            r0 = 45
            r12.append(r0)     // Catch:{ all -> 0x021d }
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x021d }
            r12.append(r0)     // Catch:{ all -> 0x021d }
            r0 = 46
            r12.append(r0)     // Catch:{ all -> 0x021d }
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r14, r12)     // Catch:{ all -> 0x021d }
            java.io.File r12 = X.JTO.A0s(r13, r0)     // Catch:{ all -> 0x021d }
            java.io.PrintWriter r13 = new java.io.PrintWriter     // Catch:{ all -> 0x021d }
            r13.<init>(r12)     // Catch:{ all -> 0x021d }
            X.W21 r18 = X.W21.A01     // Catch:{ all -> 0x020f }
            java.util.ArrayList r1 = X.00k.A0U(r15)     // Catch:{ all -> 0x020f }
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0201 }
            if (r0 == 0) goto L_0x01d6
            java.lang.String r0 = "No roots view found"
            r13.println(r0)     // Catch:{ Exception -> 0x0201 }
        L_0x01d6:
            java.util.Collections.reverse(r1)     // Catch:{ Exception -> 0x0201 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ Exception -> 0x0201 }
        L_0x01dd:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0201 }
            if (r0 == 0) goto L_0x020b
            java.lang.Object r0 = r14.next()     // Catch:{ Exception -> 0x0201 }
            X.OAj r0 = (X.C70535OAj) r0     // Catch:{ Exception -> 0x0201 }
            android.view.View r1 = r0.A00     // Catch:{ Exception -> 0x0201 }
            if (r1 == 0) goto L_0x01dd
            int r0 = r1.getVisibility()     // Catch:{ Exception -> 0x0201 }
            if (r0 != 0) goto L_0x01dd
            r17 = r1
            r19 = r13
            r20 = r4
            r21 = r4
            r22 = r4
            X.W21.A01(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0201 }
            goto L_0x01dd
        L_0x0201:
            r1 = move-exception
            java.lang.String r0 = "Failure in view hierarchy dump: "
            java.lang.String r0 = X.AnonymousClass7TF.A0m(r0, r1)     // Catch:{ all -> 0x020f }
            r13.println(r0)     // Catch:{ all -> 0x020f }
        L_0x020b:
            r13.close()     // Catch:{ all -> 0x021d }
            goto L_0x0223
        L_0x020f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0211 }
        L_0x0211:
            r0 = move-exception
            X.1zE.A00(r13, r1)     // Catch:{ all -> 0x021d }
            goto L_0x021c
        L_0x0216:
            java.lang.String r0 = "View roots were null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x021d }
        L_0x021c:
            throw r0     // Catch:{ all -> 0x021d }
        L_0x021d:
            r0 = move-exception
            X.0eQ r12 = new X.0eQ
            r12.<init>(r0)
        L_0x0223:
            java.lang.Throwable r13 = X.0eR.A00(r12)
            if (r13 == 0) goto L_0x023c
            r0 = 31
            X.Iwb r1 = new X.Iwb
            r1.<init>(r13, r0)
            java.lang.String r0 = "view_hierarchy_failure"
            r10.AW0(r0, r1)
            java.lang.String r1 = "RageshakeBottomSheetFragment"
            java.lang.String r0 = "Failed to collect view hierarchy"
            X.0KC.A0F(r1, r0, r13)
        L_0x023c:
            boolean r1 = r12 instanceof X.0eQ
            r0 = r1 ^ 1
            if (r0 == 0) goto L_0x0247
            java.lang.String r0 = "view_hierarchy_success"
            r10.AVy(r0)
        L_0x0247:
            if (r1 != 0) goto L_0x024a
            r11 = r12
        L_0x024a:
            java.io.File r11 = (java.io.File) r11
            if (r11 == 0) goto L_0x0127
            X.OWB r0 = new X.OWB
            r0.<init>()
            r0.A02(r3)
            r0.A05 = r11
            com.instagram.bugreporter.model.BugReport r3 = r0.A01()
            goto L_0x0127
        L_0x025e:
            com.instagram.bugreporter.source.BugReportSource r0 = com.instagram.bugreporter.source.BugReportSource.RAGE_SHAKE
            goto L_0x00f3
        L_0x0262:
            com.instagram.bugreporter.source.BugReportSource r0 = r7.A04
            if (r0 == 0) goto L_0x00f5
            goto L_0x00f3
        L_0x0268:
            X.0qQ.A0F(r16)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NgC.D9d():void");
    }
}
