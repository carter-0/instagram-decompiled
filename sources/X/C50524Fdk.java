package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Fdk  reason: case insensitive filesystem */
public final class C50524Fdk implements C13675Tek {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AnonymousClass0aP A01;
    public final /* synthetic */ G85 A02;
    public final /* synthetic */ C46634DiE A03;
    public final /* synthetic */ boolean A04;

    public C50524Fdk(Fragment fragment, AnonymousClass0aP r2, G85 g85, C46634DiE diE, boolean z) {
        this.A02 = g85;
        this.A00 = fragment;
        this.A03 = diE;
        this.A01 = r2;
        this.A04 = z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x002b: MOVE  (r1v2 com.instagram.base.activity.IgFragmentActivity) = (r1v0 com.instagram.base.activity.IgFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ void D5D(java.lang.Object r29) {
        /*
            r28 = this;
            r5 = r29
            X.FEn r5 = (X.C49914FEn) r5
            r0 = r28
            if (r5 != 0) goto L_0x0010
            X.G85 r8 = r0.A02
            java.lang.String r0 = "Response from SmartLock was null; indicates SmartLock not supported on device"
        L_0x000c:
            r8.CJG(r0)
        L_0x000f:
            return
        L_0x0010:
            androidx.fragment.app.Fragment r7 = r0.A00
            X.DiE r4 = r0.A03
            X.0aP r3 = r0.A01
            X.G85 r8 = r0.A02
            boolean r2 = r0.A04
            r14 = 0
            r12 = 4
            X.FXb r6 = new X.FXb
            r6.<init>(r5, r12)
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            if (r1 == 0) goto L_0x008b
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0032
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            if (r1 == 0) goto L_0x0032
            r1.registerOnActivityResultListener(r6)
        L_0x0032:
            androidx.fragment.app.FragmentActivity r16 = r7.getActivity()
            X.Fdl r20 = new X.Fdl
            r21 = r7
            r22 = r6
            r23 = r3
            r24 = r8
            r25 = r4
            r26 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r13 = 1
            X.Fdl r21 = new X.Fdl
            r22 = r7
            r23 = r6
            r24 = r3
            r25 = r8
            r26 = r4
            r27 = r13
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.A01 = r8
            X.Sx9 r1 = r5.A00
            if (r1 == 0) goto L_0x0086
            r7 = 0
            r0 = 3252(0xcb4, float:4.557E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String[] r11 = new java.lang.String[]{r0}
            com.google.android.gms.auth.api.credentials.CredentialRequest r6 = new com.google.android.gms.auth.api.credentials.CredentialRequest
            r8 = r7
            r9 = r7
            r10 = r7
            r15 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.Fdp r15 = new X.Fdp
            r17 = r6
            r22 = r4
            r23 = r2
            r18 = r3
            r19 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r1.A00(r15)
            return
        L_0x0086:
            if (r8 == 0) goto L_0x000f
            java.lang.String r0 = "ApiClientWrapper not bound"
            goto L_0x000c
        L_0x008b:
            java.lang.String r0 = "Passed in fragment activity is null; Activity required for fetch"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50524Fdk.D5D(java.lang.Object):void");
    }
}
