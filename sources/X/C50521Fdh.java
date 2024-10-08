package X;

/* renamed from: X.Fdh  reason: case insensitive filesystem */
public final class C50521Fdh implements C13675Tek {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50521Fdh(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0076: MOVE  (r1v5 com.instagram.base.activity.IgFragmentActivity) = (r1v4 com.instagram.base.activity.IgFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void D5D(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0039;
                case 2: goto L_0x0066;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.F2p r7 = (X.C49704F2p) r7
            java.lang.Object r5 = r6.A02
            X.F1v r5 = (X.C49685F1v) r5
            if (r7 == 0) goto L_0x0062
            java.lang.String r4 = r7.A01
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0038
            java.lang.String r3 = r7.A00
            java.lang.String r2 = r7.A02
            X.6Tl r1 = X.DbS.A0P()
            java.lang.String r0 = "success"
            r1.A01(r0)
            r1.A02(r3)
            r0 = 2
            r1.A03(r2, r0)
            r0 = 3
            r1.A03(r4, r0)
            X.6Tm r2 = r1.A00()
            X.6Rx r1 = r5.A00
            X.4uI r0 = r5.A01
            X.C299275ur.A00(r1, r2, r0)
        L_0x0038:
            return
        L_0x0039:
            java.lang.Object r2 = r6.A01
            com.instagram.login.smartlock.impl.SmartLockPluginImpl r2 = (com.instagram.login.smartlock.impl.SmartLockPluginImpl) r2
            java.util.Map r0 = r2.A02
            java.lang.Object r1 = r6.A02
            r0.put(r1, r7)
            java.util.Map r0 = r2.A01
            java.lang.Object r0 = r0.remove(r1)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0038
            java.util.Iterator r1 = r0.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            X.Tek r0 = (X.C13675Tek) r0
            r0.D5D(r7)
            goto L_0x0052
        L_0x0062:
            r5.A00()
            return
        L_0x0066:
            java.lang.Object r1 = r6.A02
            X.Fdu r1 = (X.C50534Fdu) r1
            androidx.fragment.app.Fragment r0 = r1.A00
            X.3on r2 = r1.A01
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x007d
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            if (r1 == 0) goto L_0x007d
            r1.unregisterOnActivityResultListener(r2)
        L_0x007d:
            java.lang.Object r0 = r6.A01
            X.Tek r0 = (X.C13675Tek) r0
            r0.D5D(r7)
            return
        L_0x0085:
            java.lang.Object r1 = r6.A01
            X.Tek r1 = (X.C13675Tek) r1
            java.lang.Object r0 = r6.A02
            r1.D5D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50521Fdh.D5D(java.lang.Object):void");
    }
}
