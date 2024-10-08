package X;

import com.instagram.common.session.UserSession;

public final class OZ9 {
    public static final OZ9 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0051, code lost:
        if (X.C70305O1j.A00(r6, r0.A0G.A00()) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015e, code lost:
        if (X.C70305O1j.A00(r6, r8.A0G.A00()) == false) goto L_0x0160;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019c A[SYNTHETIC, Splitter:B:52:0x019c] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0260  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.LinearLayout A01(android.content.Context r37, X.AnonymousClass0iw r38, com.instagram.common.session.UserSession r39, com.instagram.direct.capabilities.Capabilities r40, X.AnonymousClass7LQ r41, X.C262224Cq r42) {
        /*
            r36 = this;
            r2 = 0
            r18 = 0
            r5 = 0
            r15 = 1
            X.9HD r0 = X.AnonymousClass9HC.A1b
            r6 = r39
            r1 = r40
            X.9HC r14 = r0.A00(r6, r1)
            X.7Kt r3 = X.C329927Kt.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            com.instagram.direct.model.DirectThreadThemeInfo r0 = X.AnonymousClass6BI.A0D
            r7 = r37
            X.7L2 r10 = r3.A01(r7, r14, r0, r1)
            int r0 = r10.A01
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper
            r4.<init>(r7, r0)
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r0 = 2132017855(0x7f1402bf, float:1.9674E38)
            r1.applyStyle(r0, r15)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r4)
            boolean r0 = X.0mk.A02(r4)
            r3.setLayoutDirection(r0)
            X.7LD r13 = new X.7LD
            r13.<init>(r4)
            r0 = r41
            boolean r1 = A00(r6, r0)
            if (r1 == 0) goto L_0x0053
            X.7SD r1 = r0.A0G
            boolean r1 = r1.A00()
            boolean r1 = X.C70305O1j.A00(r6, r1)
            r30 = 1
            if (r1 != 0) goto L_0x0055
        L_0x0053:
            r30 = 0
        L_0x0055:
            X.OZS r17 = new X.OZS
            r23 = r38
            r29 = r42
            r19 = r17
            r20 = r4
            r21 = r3
            r22 = r2
            r24 = r6
            r25 = r13
            r26 = r14
            r27 = r0
            r28 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            android.view.View r7 = r17.A02()
            if (r7 != 0) goto L_0x0077
            return r2
        L_0x0077:
            X.3su r1 = r0.A0e
            X.7AG r8 = r1.A0Q
            boolean r8 = X.AnonymousClass7TF.A1V(r8)
            if (r8 == 0) goto L_0x0198
            X.7SD r8 = r0.A0G
            boolean r8 = r8.A00()
            if (r8 == 0) goto L_0x018b
            java.lang.Boolean r8 = X.C70306O1k.A00(r6)
            boolean r8 = r8.booleanValue()
        L_0x0091:
            if (r8 == 0) goto L_0x0198
            X.7AG r8 = r1.A0Q
            if (r8 == 0) goto L_0x0187
            java.lang.String r9 = r8.A04
            if (r9 == 0) goto L_0x0187
            X.PgN r11 = X.C73587PgN.A00
            java.lang.Class<X.OyZ> r8 = X.C72209OyZ.class
            java.lang.Object r8 = r6.A01(r8, r11)
            X.OyZ r8 = (X.C72209OyZ) r8
            java.util.HashMap r8 = r8.A00
            java.lang.Object r8 = r8.get(r9)
            X.7LQ r8 = (X.AnonymousClass7LQ) r8
            if (r8 != 0) goto L_0x014c
            r16 = 0
        L_0x00b1:
            X.2FW r11 = r1.A10
            X.2FW r9 = X.2FW.A0k
            r8 = 0
            if (r11 == r9) goto L_0x0117
            boolean r11 = A00(r6, r0)
            if (r11 != 0) goto L_0x0117
            X.7CR r11 = X.AnonymousClass7CQ.A01
            boolean r11 = r11.A04(r1)
            if (r11 != 0) goto L_0x0117
            com.instagram.user.model.User r12 = r0.A0K
            if (r12 == 0) goto L_0x0117
            java.lang.String r23 = X.AnonymousClass50n.A08(r12)
            X.0qQ.A07(r23)
            long r29 = r1.C7c()
            int r11 = r10.A00
            r26 = r11
            X.7Bp r11 = r0.A0F
            r21 = r11
            X.4Cl r11 = r12.A03
            com.instagram.api.schemas.IGAIAgentType r12 = r11.AaX()
            com.instagram.api.schemas.IGAIAgentType r11 = com.instagram.api.schemas.IGAIAgentType.A04
            boolean r33 = X.AnonymousClass7TF.A1W(r12, r11)
            boolean r34 = r10.A00()
            r28 = 8388611(0x800003, float:1.1754948E-38)
            X.7F4 r10 = new X.7F4
            r22 = r8
            r24 = r8
            r25 = r8
            r27 = r26
            r31 = r5
            r32 = r5
            r35 = r5
            r19 = r10
            r20 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35)
            X.7PZ r11 = new X.7PZ
            r11.<init>(r4, r6, r8, r14)
            android.view.LayoutInflater r8 = r13.A00
            X.7Pa r8 = r11.createViewHolder(r8, r3)
            r11.bind(r8, r10)
            android.view.View r8 = r8.itemView
        L_0x0117:
            r3.setOrientation(r15)
            if (r8 == 0) goto L_0x0130
            r3.addView(r8)
            int r8 = X.C51972G9s.A08(r4)
            int r10 = r8 / 2
            android.widget.Space r8 = new android.widget.Space
            r8.<init>(r4)
            r8.setMinimumHeight(r10)
            r3.addView(r8)
        L_0x0130:
            if (r16 == 0) goto L_0x0146
            r8 = r18
            r3.addView(r8)
            int r10 = X.C51972G9s.A08(r4)
            android.widget.Space r8 = new android.widget.Space
            r8.<init>(r4)
            r8.setMinimumHeight(r10)
            r3.addView(r8)
        L_0x0146:
            X.2FW r8 = r1.A10
            r10 = -2
            if (r8 != r9) goto L_0x01cc
            goto L_0x019c
        L_0x014c:
            boolean r9 = A00(r6, r8)
            if (r9 == 0) goto L_0x0160
            X.7SD r9 = r8.A0G
            boolean r9 = r9.A00()
            boolean r9 = X.C70305O1j.A00(r6, r9)
            r30 = 1
            if (r9 != 0) goto L_0x0162
        L_0x0160:
            r30 = 0
        L_0x0162:
            com.instagram.user.model.User r9 = r0.A0K
            if (r9 == 0) goto L_0x016c
            X.4Cl r9 = r9.A03
            com.instagram.api.schemas.IGAIAgentType r22 = r9.AaX()
        L_0x016c:
            X.OZS r9 = new X.OZS
            r19 = r9
            r27 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            android.view.View r8 = r9.A02()
            if (r8 != 0) goto L_0x017f
            r16 = 0
            goto L_0x00b1
        L_0x017f:
            android.view.View r2 = r9.A00
            r18 = r8
            r16 = 1
            goto L_0x00b1
        L_0x0187:
            r16 = 0
            goto L_0x00b1
        L_0x018b:
            X.0Tu r11 = X.0Tu.A05
            r8 = 36325613619262547(0x810df400063453, double:3.035802552102556E-306)
            boolean r8 = X.DbY.A1Z(r11, r6, r8)
            goto L_0x0091
        L_0x0198:
            r16 = 0
            goto L_0x00b1
        L_0x019c:
            int r6 = X.AnonymousClass7TG.A02(r4)     // Catch:{ NotFoundException -> 0x01c0 }
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ NotFoundException -> 0x01c0 }
            r0 = 2131165260(0x7f07004c, float:1.7944732E38)
            int r2 = r1.getDimensionPixelSize(r0)     // Catch:{ NotFoundException -> 0x01c0 }
            int r1 = X.AnonymousClass0nB.A01(r4)     // Catch:{ NotFoundException -> 0x01c0 }
            int r0 = r6 * 2
            int r1 = r1 - r0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch:{ NotFoundException -> 0x01c0 }
            r0.<init>(r1, r10)     // Catch:{ NotFoundException -> 0x01c0 }
            r3.addView(r7, r0)     // Catch:{ NotFoundException -> 0x01c0 }
            int r1 = -r6
            int r0 = -r2
            r7.setPaddingRelative(r1, r0, r1, r5)     // Catch:{ NotFoundException -> 0x01c0 }
            return r3
        L_0x01c0:
            r4 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r0 = "Could not get value of direct_poll_message_content_horizontal_padding."
            X.AnonymousClass7TG.A1I(r2, r0, r4, r1)
            return r3
        L_0x01cc:
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r10, r10)
            r3.addView(r7, r8)
            X.7CR r8 = X.AnonymousClass7CQ.A01
            boolean r8 = r8.A04(r1)
            r1 = r17
            android.view.View r9 = r1.A00
            if (r8 == 0) goto L_0x0230
            if (r9 == 0) goto L_0x020d
            r3.measure(r5, r5)
            X.C66582MXn.A13(r3, r5)
            int r6 = r9.getLeft()
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            r1 = 2
            int r0 = X.AnonymousClass7PV.A00(r0, r5)
            int r6 = r6 + r0
            int r0 = r7.getWidth()
            int r6 = r6 - r0
            int r6 = r6 / r1
            if (r6 >= r5) goto L_0x01ff
            r6 = 0
        L_0x01ff:
            r7.setPaddingRelative(r6, r5, r6, r5)
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x020d
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L_0x020d
            r7.setClipToPadding(r5)
        L_0x020d:
            if (r16 == 0) goto L_0x022f
            if (r2 == 0) goto L_0x022f
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r2.getDrawingRect(r0)
            r3.offsetDescendantRectToMyCoords(r2, r0)
            int r2 = r3.getWidth()
            int r0 = r0.right
            int r2 = r2 - r0
            int r1 = X.AnonymousClass7TG.A02(r4)
            int r1 = r1 - r2
            if (r1 >= r5) goto L_0x022a
            r1 = 0
        L_0x022a:
            r0 = r18
            r0.setPaddingRelative(r5, r5, r1, r5)
        L_0x022f:
            return r3
        L_0x0230:
            boolean r1 = A00(r6, r0)
            if (r1 == 0) goto L_0x0292
            X.7SD r0 = r0.A0G
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0286
            java.lang.Boolean r0 = X.C70306O1k.A00(r6)
            boolean r0 = r0.booleanValue()
        L_0x0246:
            if (r0 == 0) goto L_0x0292
            int r6 = X.AnonymousClass0nB.A01(r4)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r0 * 2
            int r6 = r6 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x025e:
            if (r9 == 0) goto L_0x020d
            r3.measure(r5, r5)
            X.C66582MXn.A13(r3, r5)
            if (r0 == 0) goto L_0x0278
            int r6 = r0.intValue()
        L_0x026c:
            int r0 = r7.getWidth()
            int r6 = r6 - r0
            if (r6 >= r5) goto L_0x0274
            r6 = 0
        L_0x0274:
            r7.setPaddingRelative(r5, r5, r6, r5)
            goto L_0x020d
        L_0x0278:
            int r1 = r9.getLeft()
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            int r6 = X.AnonymousClass7PV.A00(r0, r5)
            int r6 = r6 + r1
            goto L_0x026c
        L_0x0286:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36325613619328084(0x810df400073454, double:3.035802552144002E-306)
            boolean r0 = X.DbY.A1Z(r8, r6, r0)
            goto L_0x0246
        L_0x0292:
            r0 = 0
            goto L_0x025e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZ9.A01(android.content.Context, X.0iw, com.instagram.common.session.UserSession, com.instagram.direct.capabilities.Capabilities, X.7LQ, X.4Cq):android.widget.LinearLayout");
    }

    public static final boolean A00(UserSession userSession, AnonymousClass7LQ r4) {
        C254703su r2 = r4.A0e;
        0qQ.A07(r2);
        if (AnonymousClass48O.A06(Integer.valueOf(r4.A0G.A08))) {
            return true;
        }
        if (r2.A0Q == null) {
            return false;
        }
        if (r2.A1u.equals(C3262475z.A00(userSession))) {
            return true;
        }
        return false;
    }
}
