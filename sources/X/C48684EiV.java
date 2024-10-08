package X;

/* renamed from: X.EiV  reason: case insensitive filesystem */
public abstract class C48684EiV {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00af: MOVE  (r3v2 X.3jp) = (r3v1 X.3jp)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    public static final java.lang.Object A00(X.C307896Rx r12, X.AnonymousClass6Tm r13) {
        /*
            r2 = 1
            r0 = 0
            java.util.List r1 = r13.A00
            java.lang.String r7 = X.DbU.A0t(r1, r0)
            if (r7 != 0) goto L_0x000c
            java.lang.String r7 = ""
        L_0x000c:
            java.lang.String r6 = X.DbU.A0t(r1, r2)
            r0 = 2
            java.lang.String r9 = X.DbU.A0t(r1, r0)
            java.lang.String r5 = X.Dba.A0d(r1)
            r0 = 4
            X.4uI r4 = X.DbV.A0R(r1, r0)
            r0 = 5
            java.lang.String r11 = X.DbU.A0t(r1, r0)
            r0 = 6
            java.lang.Object r3 = r1.get(r0)
            r0 = 7
            java.lang.Object r8 = r1.get(r0)
            java.lang.Number r8 = (java.lang.Number) r8
            X.6ap r2 = X.DbS.A0a()
            if (r9 == 0) goto L_0x00eb
            int r1 = r9.hashCode()
            r0 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r1 == r0) goto L_0x00df
            r0 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r1 != r0) goto L_0x00eb
            java.lang.String r0 = "error"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00eb
            X.6aq r0 = X.C310346aq.ERROR
        L_0x004d:
            r2.A0D = r7
            r2.A0I = r6
            r2.A0C = r0
            if (r8 == 0) goto L_0x0066
            long r9 = r8.longValue()
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            long r0 = r8.longValue()
            int r6 = (int) r0
            r2.A01 = r6
        L_0x0066:
            if (r5 == 0) goto L_0x007b
            int r0 = r5.length()
            if (r0 == 0) goto L_0x007b
            r1 = 1
            r2.A0L = r1
            r2.A0G = r5
            X.FdJ r0 = new X.FdJ
            r0.<init>((X.C307896Rx) r12, (X.C277014uI) r4, (int) r1)
            r2.A0A(r0)
        L_0x007b:
            X.6ar r1 = X.C310356ar.SQUARE
            if (r3 == 0) goto L_0x0089
            java.lang.String r0 = "circle"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d9
            X.6ar r1 = X.C310356ar.CIRCULAR
        L_0x0089:
            if (r11 == 0) goto L_0x009e
            int r0 = r11.length()
            if (r0 == 0) goto L_0x009e
            r2.A0B = r1
            android.net.Uri r1 = X.DbT.A09(r11)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r1, r0, r0)
            r2.A09 = r0
        L_0x009e:
            X.2nI r5 = X.C308206Td.A06(r12)
            X.Dc2 r4 = r2.A00()
            androidx.fragment.app.FragmentActivity r3 = X.C308206Td.A04(r12)
            boolean r0 = r3 instanceof X.C249463jp
            r2 = 0
            if (r0 == 0) goto L_0x00d8
            X.3jp r3 = (X.C249463jp) r3
            if (r3 == 0) goto L_0x00d8
            X.3M8 r0 = r3.Bx5()
            if (r0 == 0) goto L_0x00bc
            r0.A0A(r4)
        L_0x00bc:
            X.3M8 r0 = r3.Bx5()
            if (r0 == 0) goto L_0x00d8
            int r1 = r4.A00
            if (r1 != 0) goto L_0x00cc
            X.0eM r0 = X.Dc2.A0T
            int r1 = X.DbX.A07(r0)
        L_0x00cc:
            r0 = -1
            if (r1 != r0) goto L_0x00d8
            r1 = 2
            X.EED r0 = new X.EED
            r0.<init>(r1, r4, r5, r3)
            X.C308206Td.A0K(r12, r0)
        L_0x00d8:
            return r2
        L_0x00d9:
            java.lang.String r0 = "square"
            r3.equals(r0)
            goto L_0x0089
        L_0x00df:
            java.lang.String r0 = "success"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00eb
            X.6aq r0 = X.C310346aq.SUCCESS
            goto L_0x004d
        L_0x00eb:
            X.6aq r0 = X.C310346aq.DEFAULT
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48684EiV.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
