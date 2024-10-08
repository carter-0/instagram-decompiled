package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Fdr  reason: case insensitive filesystem */
public final class C50531Fdr implements G85 {
    public final void CJG(String str) {
    }

    public final void Cok() {
    }

    public final void Crh() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0015: MOVE  (r1v5 com.instagram.base.activity.IgFragmentActivity) = (r1v0 com.instagram.base.activity.IgFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void CJF(androidx.fragment.app.Fragment r24, X.C252243on r25, X.AnonymousClass0aP r26, X.C51879G5r r27, X.C46634DiE r28) {
        /*
            r23 = this;
            r2 = r25
            r8 = r26
            r4 = r24
            X.AnonymousClass7TG.A1Q(r8, r2)
            if (r24 == 0) goto L_0x00c1
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            if (r1 == 0) goto L_0x00c1
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x001c
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            if (r1 == 0) goto L_0x001c
            r1.unregisterOnActivityResultListener(r2)
        L_0x001c:
            if (r27 == 0) goto L_0x00c1
            X.G7c r1 = r27.BEz()
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = r1.getUsername()
            if (r0 == 0) goto L_0x00c1
            java.lang.String r14 = r1.getPassword()
            if (r14 == 0) goto L_0x00c1
            boolean r0 = r4 instanceof X.AnonymousClass4DH
            if (r0 == 0) goto L_0x00c1
            X.4DH r4 = (X.AnonymousClass4DH) r4
            java.lang.String r16 = r1.getUsername()
            X.0qQ.A07(r16)
            r5 = r28
            if (r28 == 0) goto L_0x00c2
            java.lang.String r7 = r5.A01
        L_0x0043:
            r9 = 0
            long r2 = java.lang.System.currentTimeMillis()
            X.0wc r1 = X.AnonymousClass0kN.A02(r8)
            java.lang.String r0 = "ig_android_smart_lock_login_attempt"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbZ.A1E(r6)
            long r0 = X.1Q0.A00()
            X.DbY.A1E(r6, r2, r0)
            double r0 = X.DbS.A00()
            X.DbW.A12(r6, r0)
            X.DbS.A1H(r6, r7)
            X.0qv r3 = X.0qv.A02
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r1 = r3.A04(r0)
            java.lang.String r0 = "guid"
            r6.AAJ(r0, r1)
            r6.Cgf()
            android.content.Context r0 = r4.getContext()
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x00d3
            java.lang.String r10 = X.0qv.A00(r0)
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x00ce
            java.lang.String r13 = r3.A05(r0)
            r18 = 0
            r11 = r9
            r12 = r9
            r15 = r9
            r17 = r9
            X.1OC r1 = X.FHA.A0D(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            android.content.Context r18 = r4.getContext()
            if (r18 == 0) goto L_0x00c9
            androidx.fragment.app.FragmentActivity r19 = r4.getActivity()
            if (r19 == 0) goto L_0x00c4
            X.EMN r13 = new X.EMN
            r20 = r4
            r21 = r8
            r22 = r5
            r17 = r13
            r17.<init>(r18, r19, r20, r21, r22)
            X.EMK r0 = new X.EMK
            r9 = r0
            r10 = r4
            r11 = r4
            r12 = r8
            r14 = r5
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.A00 = r0
            X.1ES.A03(r1)
        L_0x00c1:
            return
        L_0x00c2:
            r7 = 0
            goto L_0x0043
        L_0x00c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50531Fdr.CJF(androidx.fragment.app.Fragment, X.3on, X.0aP, X.G5r, X.DiE):void");
    }

    public final void CIv(Fragment fragment, C252243on r2, AnonymousClass0aP r3, C51879G5r g5r, C46634DiE diE) {
        AnonymousClass7TG.A1Q(r3, r2);
        CJF(fragment, r2, r3, g5r, diE);
    }
}
