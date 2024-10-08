package X;

/* renamed from: X.4Wk  reason: invalid class name and case insensitive filesystem */
public abstract class C265814Wk {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r9.A0F(r0) != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass9JD r15, com.instagram.common.session.UserSession r16, X.C265794Wh r17, X.C265804Wi r18, X.C249693kD r19, java.lang.String r20, java.lang.String r21, int r22, boolean r23) {
        /*
            r8 = 0
            r14 = r18
            X.0qQ.A0B(r14, r8)
            r0 = 1
            r11 = r15
            X.0qQ.A0B(r15, r0)
            r2 = 8
            java.lang.Object r1 = r15.A01
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0156
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0156
            android.view.View r7 = r14.A03
            r7.setVisibility(r8)
            r12 = r16
            X.2fF r9 = X.C225972fF.A00(r12)
            java.lang.Object r6 = r1.get(r8)
            X.3ui r6 = (X.C255783ui) r6
            X.WaK r15 = r6.A0G()
            if (r15 == 0) goto L_0x014e
            X.BHJ r0 = r15.A00
            java.lang.String r0 = r0.A08
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = ""
        L_0x0038:
            r0.getClass()
            boolean r0 = r9.A0F(r0)
            r10 = 0
            if (r0 == 0) goto L_0x010d
            X.Cvz r0 = r9.A0L(r15)
            if (r0 == 0) goto L_0x004a
            X.BIu r10 = r0.A01
        L_0x004a:
            android.content.Context r2 = r14.A02
            X.UpW r0 = new X.UpW
            r0.<init>(r2, r12, r15)
            r14.A01 = r0
            X.UpW r3 = r14.A00()
            X.BHJ r0 = r15.A00
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L_0x007b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007b
            boolean r0 = r15.A03()
            if (r0 != 0) goto L_0x007b
            X.BHJ r0 = r15.A00
            java.lang.String r0 = r0.A08
            if (r0 != 0) goto L_0x0071
            java.lang.String r0 = ""
        L_0x0071:
            r0.getClass()
            boolean r0 = r9.A0F(r0)
            r1 = 1
            if (r0 == 0) goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            X.0eM r0 = r3.A0F
            java.lang.Object r0 = r0.getValue()
            X.U1V r0 = (X.U1V) r0
            r0.A08 = r1
            X.UpW r1 = r14.A00()
            java.lang.Object r0 = r11.A00
            X.9IE r0 = (X.AnonymousClass9IE) r0
            java.lang.Object r0 = r0.A00
            X.0sL r0 = (X.0sL) r0
            r3 = r19
            java.lang.Object r0 = r0.invoke(r3, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.A00 = r0
            r1.invalidateSelf()
            X.UpW r0 = r14.A00()
            r0.A01 = r10
            X.C16145UpW.A00(r0)
            X.UpW r0 = r14.A00()
            X.Vt5 r10 = new X.Vt5
            r13 = r17
            r16 = r20
            r17 = r21
            r18 = r22
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            X.0eM r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            X.U1V r0 = (X.U1V) r0
            r0.A07 = r10
            android.widget.ImageView r1 = r14.A05
            X.UpW r0 = r14.A00()
            r1.setImageDrawable(r0)
            r1.requestLayout()
            if (r23 == 0) goto L_0x0104
            X.IDD r0 = new X.IDD
            r0.<init>(r12, r14, r6, r3)
            r7.addOnLayoutChangeListener(r0)
        L_0x00dd:
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r14.A06
            X.UpW r0 = r14.A00()
            r1.A00(r14, r0)
            X.U1U r1 = new X.U1U
            r1.<init>(r2)
            r14.A00 = r1
            X.BHJ r0 = r15.A00
            java.lang.String r0 = r0.A06
            if (r0 != 0) goto L_0x00f5
            java.lang.String r0 = "😍"
        L_0x00f5:
            X.0qQ.A0B(r0, r8)
            r1.A04 = r0
            android.view.View r1 = r14.A04
            X.U1U r0 = r14.A00
            if (r0 == 0) goto L_0x0144
            r1.setBackground(r0)
            return
        L_0x0104:
            X.Ij4 r0 = new X.Ij4
            r0.<init>(r12, r14, r6, r3)
            X.0nA.A0q(r1, r0)
            goto L_0x00dd
        L_0x010d:
            boolean r0 = r15.A03()
            if (r0 == 0) goto L_0x004a
            X.1hu r1 = new X.1hu
            r1.<init>(r10)
            r5 = 6
            X.1E9 r0 = new X.1E9
            r0.<init>(r1, r5, r8)
            X.BIu r0 = new X.BIu
            r0.<init>(r10, r10, r10)
            java.lang.Integer r4 = r0.A02
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r3 = r0.A01(r12)
            float r0 = r15.A00()
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            X.1hu r1 = new X.1hu
            r1.<init>(r10)
            X.1E9 r0 = new X.1E9
            r0.<init>(r1, r5, r8)
            X.BIu r10 = new X.BIu
            r10.<init>(r3, r2, r4)
            goto L_0x004a
        L_0x0144:
            java.lang.String r0 = "sliderParticleSystem"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x014e:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0156:
            android.view.View r0 = r14.A03
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265814Wk.A00(X.9JD, com.instagram.common.session.UserSession, X.4Wh, X.4Wi, X.3kD, java.lang.String, java.lang.String, int, boolean):void");
    }
}
