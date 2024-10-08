package X;

public final class SMQ {
    public static final SMQ A00 = new Object();

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0053: MOVE  (r9v0 int) = (r20v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static java.util.HashSet A00(X.C8907RFa r18, int r19, int r20, boolean r21, boolean r22) {
        /*
            r11 = 1
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
            r6 = 0
        L_0x0006:
            int r0 = android.media.MediaCodecList.getCodecCount()
            if (r6 >= r0) goto L_0x008c
            android.media.MediaCodecInfo r3 = android.media.MediaCodecList.getCodecInfoAt(r6)
            boolean r0 = r3.isEncoder()
            if (r0 != r11) goto L_0x0035
            r13 = r18
            java.lang.String r2 = r13.A00
            boolean r0 = X.Pxh.A1V(r3, r2)
            if (r0 == 0) goto L_0x0035
            if (r21 == 0) goto L_0x0038
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r0 = ".mtk."
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0038
            r3.getName()
        L_0x0035:
            int r6 = r6 + 1
            goto L_0x0006
        L_0x0038:
            android.media.MediaCodecInfo$CodecCapabilities r5 = r3.getCapabilitiesForType(r2)
            if (r5 == 0) goto L_0x0035
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r5.profileLevels
            if (r0 == 0) goto L_0x0035
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r5.profileLevels
            int r3 = r4.length
            r2 = 0
        L_0x0046:
            if (r2 >= r3) goto L_0x0035
            r8 = r4[r2]
            int r0 = r8.profile
            r1 = r19
            if (r0 != r1) goto L_0x0080
            int r1 = r8.level
            r0 = -1
            r9 = r20
            if (r1 >= r9) goto L_0x0059
            if (r9 != r0) goto L_0x0080
        L_0x0059:
            int r14 = r8.profile
            if (r9 == r0) goto L_0x0089
            r15 = r9
        L_0x005e:
            if (r22 == 0) goto L_0x0086
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x0086
            int[] r10 = r5.colorFormats
            if (r10 == 0) goto L_0x0086
            int r9 = r10.length
            r8 = 0
        L_0x006c:
            if (r8 >= r9) goto L_0x0086
            r1 = r10[r8]
            r0 = 54
            if (r1 != r0) goto L_0x0083
            r17 = 1
        L_0x0076:
            r16 = 0
            X.SJA r12 = new X.SJA
            r12.<init>(r13, r14, r15, r16, r17)
            r7.add(r12)
        L_0x0080:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0083:
            int r8 = r8 + 1
            goto L_0x006c
        L_0x0086:
            r17 = 0
            goto L_0x0076
        L_0x0089:
            int r15 = r8.level
            goto L_0x005e
        L_0x008c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMQ.A00(X.RFa, int, int, boolean, boolean):java.util.HashSet");
    }
}
