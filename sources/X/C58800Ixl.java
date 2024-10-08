package X;

/* renamed from: X.Ixl  reason: case insensitive filesystem */
public final class C58800Ixl extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58800Ixl(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, long j) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A06 = str;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A01 = j;
        this.A04 = obj4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x007d: MOVE  (r0v50 int) = (r23v2 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r31) {
        /*
            r30 = this;
            r13 = r30
            r12 = r31
            int r0 = r13.A00
            if (r0 == 0) goto L_0x013f
            X.6GH r12 = (X.AnonymousClass6GH) r12
            r14 = 0
            X.0qQ.A0B(r12, r14)
            java.lang.Object r11 = r13.A03
            X.62f r11 = (X.C3022462f) r11
            if (r11 == 0) goto L_0x0113
            X.62Y r0 = r11.A04
            X.5Q8 r1 = r0.A07
        L_0x0018:
            X.5Q8 r0 = X.AnonymousClass5Q8.Rtl
            r27 = 0
            boolean r28 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.String r0 = r13.A06
            int r26 = X.DbX.A05(r0)
            java.lang.Object r0 = r13.A05
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r25 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r24 = r0.iterator()
        L_0x0032:
            boolean r0 = r24.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r10 = r24.next()
            com.instagram.barcelona.creation.voiceclips.model.TranscriptionToken r10 = (com.instagram.barcelona.creation.voiceclips.model.TranscriptionToken) r10
            java.lang.String r0 = r10.A02
            int r9 = X.DbX.A05(r0)
            if (r11 == 0) goto L_0x0116
            r1 = r27
            int r23 = r27 + r9
            r22 = 1
            int r23 = r23 - r22
            X.62d r8 = r11.A03
            int r0 = r10.A01
            r29 = r0
            r21 = r0
            int r7 = r8.A06(r1)
            r0 = r23
            int r20 = r8.A06(r0)
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            int r0 = r8.A02
            r15 = 2
            if (r0 != 0) goto L_0x010b
            r16 = 0
        L_0x006b:
            r0 = r20
            if (r7 > r0) goto L_0x00fe
            r0 = r16
            if (r1 >= r0) goto L_0x00fe
            int r6 = r8.A07(r7, r14)
            int r6 = r6 - r22
            r0 = r20
            if (r7 != r0) goto L_0x0082
            r0 = r23
            if (r6 <= r0) goto L_0x0082
            r6 = r0
        L_0x0082:
            int r0 = r6 - r1
            int r0 = r0 + 1
            float r5 = (float) r0
            float r0 = (float) r9
            float r5 = r5 / r0
            int r0 = r10.A00
            int r0 = r0 - r21
            float r0 = (float) r0
            float r5 = r5 * r0
            r0 = r29
            float r0 = (float) r0
            float r5 = r5 + r0
            X.5VN r2 = r11.A05(r1)
            X.5VN r1 = r11.A05(r6)
            float[] r3 = new float[r15]
            float r0 = r2.A01
            r3[r14] = r0
            float r0 = r1.A01
            r3[r22] = r0
            r3 = r3[r14]
            float r4 = java.lang.Math.min(r3, r0)
            float[] r3 = new float[r15]
            float r0 = r2.A02
            r3[r14] = r0
            float r0 = r1.A02
            r3[r22] = r0
            r3 = r3[r14]
            float r18 = java.lang.Math.max(r3, r0)
            float[] r3 = new float[r15]
            float r0 = r2.A03
            r3[r14] = r0
            float r0 = r1.A03
            r3[r22] = r0
            r3 = r3[r14]
            float r3 = java.lang.Math.min(r3, r0)
            float[] r0 = new float[r15]
            float r2 = r2.A00
            r0[r14] = r2
            float r1 = r1.A00
            r0[r22] = r1
            r0 = r0[r14]
            float r0 = java.lang.Math.max(r0, r1)
            X.5VN r17 = new X.5VN
            r2 = r18
            r1 = r0
            r0 = r17
            r0.<init>(r4, r3, r2, r1)
            int r0 = (int) r5
            r5 = r0
            r4 = 4
            X.Jw3 r3 = new X.Jw3
            r2 = r29
            r0 = r17
            r3.<init>((java.lang.Object) r0, (int) r5, (int) r2, (int) r4)
            r0 = r19
            r0.add(r3)
            int r7 = r7 + 1
            int r1 = r6 + 1
            r29 = r5
            goto L_0x006b
        L_0x00fe:
            int r9 = r9 + r26
            int r27 = r27 + r9
            r1 = r25
            r0 = r19
            r1.add(r0)
            goto L_0x0032
        L_0x010b:
            int r0 = r0 - r22
            int r16 = r8.A07(r0, r14)
            goto L_0x006b
        L_0x0113:
            r1 = 0
            goto L_0x0018
        L_0x0116:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x011b:
            java.util.ArrayList r0 = X.0Yv.A1F(r25)
            X.62P r25 = X.AnonymousClass62Q.A00(r0)
            java.lang.Object r4 = r13.A02
            X.0sa r4 = (X.C62320sa) r4
            long r1 = r13.A01
            java.lang.Object r3 = r13.A04
            X.0sP r3 = (X.0sP) r3
            X.Ix2 r0 = new X.Ix2
            r24 = r3
            r26 = r1
            r22 = r0
            r23 = r4
            r22.<init>(r23, r24, r25, r26, r28)
            X.64W r12 = r12.A00(r0)
            return r12
        L_0x013f:
            X.1Ln r12 = (X.1Ln) r12
            X.GkJ r5 = new X.GkJ
            r5.<init>()
            java.lang.Object r6 = r13.A05
            com.facebookpay.logging.LoggingContext r6 = (com.facebookpay.logging.LoggingContext) r6
            X.C51971G9r.A1B(r5, r6)
            X.GkS r2 = new X.GkS
            r2.<init>()
            long r0 = r13.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "credential_id"
            r2.A05(r0, r1)
            java.lang.Object r0 = r13.A03
            X.C51975G9x.A19(r2, r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r0 = "credential_container"
            r5.A07(r0, r1)
            java.lang.Object r0 = r13.A02
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x018b
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0179:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = X.AnonymousClass7TE.A18(r4)
            long r2 = java.lang.Long.parseLong(r0)
            X.AnonymousClass7TE.A1Y(r1, r2)
            goto L_0x0179
        L_0x018b:
            X.0sn r1 = X.0sn.A00
        L_0x018d:
            java.lang.String r0 = "container_ids"
            X.G9t.A1L(r5, r6, r0, r1)
            java.lang.String r1 = r13.A06
            java.lang.String r0 = "view_name"
            r5.A06(r0, r1)
            java.lang.String r0 = "event_payload"
            r12.A0N(r5, r0)
            java.lang.Object r0 = r13.A04
            X.C51969G9p.A1G(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58800Ixl.invoke(java.lang.Object):java.lang.Object");
    }
}
