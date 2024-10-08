package X;

/* renamed from: X.Nvw  reason: case insensitive filesystem */
public abstract class C70018Nvw {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r2v0 int) = (r27v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static void A00(X.AnonymousClass7Ws r25, X.C328667Fr r26, int r27) {
        /*
            r1 = 0
            r0 = r26
            X.0qQ.A0B(r0, r1)
            java.util.List r3 = r0.A0b
            if (r3 == 0) goto L_0x002b
            int r1 = r3.size()
            r2 = r27
            if (r1 <= r2) goto L_0x002b
            java.lang.Object r1 = r3.get(r2)
            X.9JN r1 = (X.AnonymousClass9JN) r1
            java.lang.String r11 = r1.A04
            java.lang.String r8 = r1.A05
            java.lang.String r10 = r1.A06
            java.lang.String r7 = r1.A02
            java.lang.String r6 = r1.A03
            if (r8 != 0) goto L_0x002c
            java.lang.String r1 = "GenericXmaCtaClickDelegate"
            java.lang.String r0 = "Null XMA CTA Type"
            X.0wb.A03(r1, r0)
        L_0x002b:
            return
        L_0x002c:
            r12 = r25
            r1 = r12
            X.7Xr r1 = (X.C333107Xr) r1
            boolean r1 = r1.CPk()
            if (r1 != 0) goto L_0x002b
            X.9J6 r1 = r0.A08
            java.lang.String r5 = r1.A00
            com.instagram.model.direct.messageid.DirectMessageIdentifier r15 = r0.A0L
            r1 = r12
            X.7Wu r1 = (X.C332877Wu) r1
            java.lang.String r24 = r1.C6X()
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)
            X.7FT r1 = r0.A0B
            X.2FW r14 = r1.A04
            r13 = 0
            java.lang.String r4 = r0.A0Y
            boolean r1 = r0.A0e
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = r0.A0V
            if (r1 != 0) goto L_0x006f
            r27 = r13
        L_0x0059:
            r16 = r13
            r23 = r5
            r25 = r13
            r26 = r4
            r21 = r7
            r22 = r6
            r19 = r8
            r20 = r10
            r18 = r11
            r12.CJS(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        L_0x006f:
            java.lang.String r2 = "content_type"
            java.lang.String r1 = "ai_bot_search_plugin"
            X.0eP r9 = X.AnonymousClass7TE.A1L(r2, r1)
            java.lang.String r1 = "agent_id"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r5)
            java.lang.String r1 = r0.A0V
            if (r1 != 0) goto L_0x0083
            java.lang.String r1 = ""
        L_0x0083:
            java.lang.String r0 = "bot_response_id"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = "xma_tap_index"
            java.lang.String r0 = "4"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r1, r0, r9, r3, r2)
            java.util.LinkedHashMap r27 = X.0Yt.A06(r0)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70018Nvw.A00(X.7Ws, X.7Fr, int):void");
    }
}
