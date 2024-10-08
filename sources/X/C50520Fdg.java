package X;

/* renamed from: X.Fdg  reason: case insensitive filesystem */
public final class C50520Fdg implements C13675Tek {
    public final int A00;
    public final Object A01;

    public C50520Fdg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0039: MOVE  (r1v8 com.instagram.base.activity.IgFragmentActivity) = (r1v6 com.instagram.base.activity.IgFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ void D5D(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            r12 = r22
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x00aa;
                case 2: goto L_0x0096;
                case 3: goto L_0x0071;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.FEn r12 = (X.C49914FEn) r12
            if (r12 == 0) goto L_0x0026
            java.lang.Object r0 = r1.A01
            X.EHQ r0 = (X.EHQ) r0
            java.lang.Object r9 = r0.A01
            android.app.Activity r9 = (android.app.Activity) r9
            java.lang.Object r1 = r0.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.Object r14 = r0.A05
            X.DiE r14 = (X.C46634DiE) r14
            java.lang.Object r3 = r0.A04
            X.F1v r3 = (X.C49685F1v) r3
            if (r9 != 0) goto L_0x0027
            r3.A00()
        L_0x0026:
            return
        L_0x0027:
            r0 = 4
            X.FXb r2 = new X.FXb
            r2.<init>(r12, r0)
            r6 = 0
            X.0qQ.A0B(r1, r6)
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0040
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            if (r1 == 0) goto L_0x0040
            r1.registerOnActivityResultListener(r2)
        L_0x0040:
            r0 = 3
            X.Fdh r13 = new X.Fdh
            r13.<init>(r0, r9, r3)
            r2 = 0
            r17 = 1
            r5 = 2
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r1 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig
            r15 = r1
            r16 = r5
            r18 = r6
            r19 = r17
            r20 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.String r0 = "https://accounts.google.com"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            com.google.android.gms.auth.api.credentials.HintRequest r0 = new com.google.android.gms.auth.api.credentials.HintRequest
            r3 = r2
            r7 = r6
            r8 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            X.Sx9 r11 = r12.A00
            if (r11 == 0) goto L_0x0026
            X.Fdm r8 = new X.Fdm
            r10 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x0092
        L_0x0071:
            X.FEn r12 = (X.C49914FEn) r12
            if (r12 == 0) goto L_0x0026
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.FragmentActivity r2 = X.DbZ.A0E(r0)
            if (r2 == 0) goto L_0x0026
            X.G5r r0 = X.C46632DiC.A00
            if (r0 == 0) goto L_0x0026
            X.G7c r1 = r0.BEz()
            if (r1 == 0) goto L_0x0026
            X.Fdq r0 = X.C50530Fdq.A00
            X.Sx9 r11 = r12.A00
            if (r11 == 0) goto L_0x0026
            X.Fdj r8 = new X.Fdj
            r8.<init>(r2, r1, r12, r0)
        L_0x0092:
            r11.A00(r8)
            return
        L_0x0096:
            java.lang.Object r0 = r1.A01
            X.Fdv r0 = (X.C50535Fdv) r0
            java.lang.Object r2 = r0.A01
            X.EMG r2 = (X.EMG) r2
            java.lang.Object r1 = r0.A02
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r0 = r0.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.EMG.A01(r0, r2, r1)
            return
        L_0x00aa:
            java.lang.Object r0 = r1.A01
            X.Fdt r0 = (X.C50533Fdt) r0
            X.E57 r0 = r0.A01
            X.E57.A00(r0)
            return
        L_0x00b4:
            java.lang.Object r0 = r1.A01
            X.Fds r0 = (X.C50532Fds) r0
            X.EDi r0 = r0.A00
            java.lang.Object r0 = r0.A01
            X.E75 r0 = (X.E75) r0
            X.E75.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50520Fdg.D5D(java.lang.Object):void");
    }
}
