package X;

public abstract class V9B {
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0077: MOVE  (r1v9 X.X6Q) = (r1v8 X.X6Q)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final java.lang.Object A00(X.C307896Rx r9, X.AnonymousClass6Tm r10) {
        /*
            java.lang.Object r6 = r10.A02()
            boolean r0 = r6 instanceof java.lang.String
            r3 = 0
            if (r0 == 0) goto L_0x0114
            if (r6 == 0) goto L_0x0114
            r8 = 2
            java.lang.Object r7 = r10.A03(r8)
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L_0x0114
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L_0x0114
            r0 = 15
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)
            int r4 = r5.length
            r2 = 0
        L_0x0020:
            if (r2 >= r4) goto L_0x0060
            r1 = r5[r2]
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x0036;
                case 2: goto L_0x0039;
                case 3: goto L_0x003c;
                case 4: goto L_0x003f;
                case 5: goto L_0x0042;
                case 6: goto L_0x0045;
                case 7: goto L_0x0048;
                case 8: goto L_0x004b;
                case 9: goto L_0x004e;
                case 10: goto L_0x0051;
                case 11: goto L_0x0054;
                case 12: goto L_0x0057;
                case 13: goto L_0x005a;
                case 14: goto L_0x005d;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.String r0 = "unknown"
        L_0x002d:
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0062
            int r2 = r2 + 1
            goto L_0x0020
        L_0x0036:
            java.lang.String r0 = "pro2pro_fulcrum_disclosure_cancel"
            goto L_0x002d
        L_0x0039:
            java.lang.String r0 = "pro2pro_missing_viewer_context"
            goto L_0x002d
        L_0x003c:
            java.lang.String r0 = "pro2pro_igba_success"
            goto L_0x002d
        L_0x003f:
            java.lang.String r0 = "pro2pro_flow_can_promote_with_business_user"
            goto L_0x002d
        L_0x0042:
            java.lang.String r0 = "pro2pro_not_eligible_for_fulcrum_disclosure"
            goto L_0x002d
        L_0x0045:
            java.lang.String r0 = "pro2pro_pro_disclosure_cancel"
            goto L_0x002d
        L_0x0048:
            java.lang.String r0 = "pro2pro_not_eligible_for_pro_disclosure"
            goto L_0x002d
        L_0x004b:
            java.lang.String r0 = "pro2pro_pro_disclosure_promotion_payments"
            goto L_0x002d
        L_0x004e:
            java.lang.String r0 = "pro2pro_pro_disclosure_hardlink_success"
            goto L_0x002d
        L_0x0051:
            java.lang.String r0 = "pro2pro_pro_disclosure_hardlink_fail"
            goto L_0x002d
        L_0x0054:
            java.lang.String r0 = "promote_prevalidation_missing_bridge_to_promote_callsite"
            goto L_0x002d
        L_0x0057:
            java.lang.String r0 = "promote_prevalidation_resolution_cancel"
            goto L_0x002d
        L_0x005a:
            java.lang.String r0 = "promote_prevalidation_resolution_promotion_payments"
            goto L_0x002d
        L_0x005d:
            java.lang.String r0 = "promote_prevalidation_cal_fallback"
            goto L_0x002d
        L_0x0060:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0062:
            int r0 = r1.intValue()
            switch(r0) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00fc;
                case 3: goto L_0x006f;
                case 4: goto L_0x006f;
                case 5: goto L_0x00fc;
                case 6: goto L_0x00e3;
                case 7: goto L_0x007f;
                case 8: goto L_0x00eb;
                case 9: goto L_0x006f;
                case 10: goto L_0x007f;
                case 11: goto L_0x00e3;
                case 12: goto L_0x00e3;
                case 13: goto L_0x00eb;
                case 14: goto L_0x006f;
                default: goto L_0x0069;
            }
        L_0x0069:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x006f:
            androidx.fragment.app.FragmentActivity r1 = X.C308206Td.A04(r9)
            boolean r0 = r1 instanceof X.X6Q
            if (r0 == 0) goto L_0x0114
            X.X6Q r1 = (X.X6Q) r1
            if (r1 == 0) goto L_0x0114
            r1.AUr()
            return r3
        L_0x007f:
            java.lang.String r0 = "access_token"
            java.lang.String r6 = X.DbT.A11(r0, r7)
            if (r6 == 0) goto L_0x00e3
            int r0 = r6.length()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = "access_token_type"
            java.lang.Object r7 = r7.get(r0)
            if (r7 == 0) goto L_0x00e3
            r0 = 3
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)
            int r4 = r5.length
            r2 = 0
        L_0x009c:
            if (r2 >= r4) goto L_0x00e3
            r1 = r5[r2]
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x00d7;
                case 2: goto L_0x00da;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            java.lang.String r0 = "facebook_access_token_cal"
        L_0x00a9:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00d4
            int r1 = r1.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x00d1
            r0 = 1
            if (r1 == r0) goto L_0x00ce
            if (r1 != r8) goto L_0x00dd
            com.instagram.business.promote.model.LinkingAuthState r2 = com.instagram.business.promote.model.LinkingAuthState.BUSINESS_TOKEN_OR_UNKNOWN
        L_0x00bd:
            androidx.fragment.app.FragmentActivity r1 = X.C308206Td.A04(r9)
            boolean r0 = r1 instanceof X.X6Q
            if (r0 == 0) goto L_0x0114
            X.X6Q r1 = (X.X6Q) r1
            if (r1 == 0) goto L_0x0114
            r0 = 0
            r1.CIY(r2, r6, r0)
            return r3
        L_0x00ce:
            com.instagram.business.promote.model.LinkingAuthState r2 = com.instagram.business.promote.model.LinkingAuthState.PRO2PRO_NEW_AUTH
            goto L_0x00bd
        L_0x00d1:
            com.instagram.business.promote.model.LinkingAuthState r2 = com.instagram.business.promote.model.LinkingAuthState.NEW_AUTH
            goto L_0x00bd
        L_0x00d4:
            int r2 = r2 + 1
            goto L_0x009c
        L_0x00d7:
            java.lang.String r0 = "facebook_access_token_pro2pro"
            goto L_0x00a9
        L_0x00da:
            java.lang.String r0 = "business_user_access_token"
            goto L_0x00a9
        L_0x00dd:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e3:
            androidx.fragment.app.FragmentActivity r0 = X.C308206Td.A04(r9)
            r0.finish()
            return r3
        L_0x00eb:
            X.0lg r2 = X.C308206Td.A0B(r9)
            X.UsI r1 = new X.UsI
            r1.<init>()
            androidx.fragment.app.FragmentActivity r0 = X.C308206Td.A04(r9)
            X.Dbb.A0o(r3, r1, r0, r2)
            return r3
        L_0x00fc:
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A04(r9)
            boolean r0 = r2 instanceof X.X6Q
            if (r0 == 0) goto L_0x0114
            X.X6Q r2 = (X.X6Q) r2
            if (r2 == 0) goto L_0x0114
            com.instagram.business.promote.activity.PromoteActivity r2 = (com.instagram.business.promote.activity.PromoteActivity) r2
            r1 = 42
            X.Iwb r0 = new X.Iwb
            r0.<init>(r2, r1)
            com.instagram.business.promote.activity.PromoteActivity.A09(r2, r0)
        L_0x0114:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9B.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
