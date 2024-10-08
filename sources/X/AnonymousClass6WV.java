package X;

/* renamed from: X.6WV  reason: invalid class name */
public abstract class AnonymousClass6WV {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r1 = r4.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r12, X.C249693kD r13, X.C317536nQ r14, X.C317636na r15) {
        /*
            r10 = r13
            X.3ui r9 = X.AnonymousClass6YG.A02(r13)
            X.WaP r4 = X.AnonymousClass6YG.A03(r13)
            r11 = r14
            if (r9 == 0) goto L_0x00e1
            if (r4 == 0) goto L_0x00e1
            X.UNR r1 = r4.A00
            java.lang.Boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e1
            com.instagram.reels.question.constants.QuestionStickerType r1 = r1.A00
            if (r1 != 0) goto L_0x0020
            com.instagram.reels.question.constants.QuestionStickerType r1 = com.instagram.reels.question.constants.QuestionStickerType.TEXT
        L_0x0020:
            com.instagram.reels.question.constants.QuestionStickerType r0 = com.instagram.reels.question.constants.QuestionStickerType.PICS_PLEASE
            if (r1 == r0) goto L_0x00e1
            android.view.View r3 = r14.A01
            r7 = 0
            r3.setVisibility(r7)
            android.widget.ImageView r5 = r14.A02
            android.content.Context r2 = r5.getContext()
            boolean r0 = r4.A08()
            r8 = r12
            if (r0 == 0) goto L_0x00d7
            X.0qQ.A0A(r2)
            X.Upc r6 = new X.Upc
            r6.<init>(r2, r12, r4)
        L_0x003f:
            X.Upd r6 = (X.C16152Upd) r6
            r5.setImageDrawable(r6)
            r1 = 2131952038(0x7f1301a6, float:1.9540507E38)
            java.lang.String r0 = r4.A05()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            r5.setContentDescription(r0)
            boolean r1 = r6 instanceof X.C16151Upc
            if (r1 == 0) goto L_0x00d5
            r2 = r6
            X.Upc r2 = (X.C16151Upc) r2
        L_0x005d:
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x00cd
            if (r1 == 0) goto L_0x00cd
            android.view.View r5 = r14.A00
            r5.setVisibility(r7)
            X.Upc r6 = (X.C16151Upc) r6
            X.6Ly r7 = r6.A04
            if (r7 == 0) goto L_0x00cb
            int r1 = r7.A0A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00cb
            int r0 = r6.A01
            int r0 = r0 * 2
            int r1 = r1 + r0
        L_0x007d:
            X.0nA.A0f(r5, r1)
            if (r7 == 0) goto L_0x00c9
            int r1 = r7.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x00c9
            int r0 = r6.A01
            int r0 = r0 * 2
            int r1 = r1 + r0
        L_0x008f:
            X.0nA.A0V(r5, r1)
            int r0 = r6.A02
            int r1 = r0 * 2
            X.6Ly r0 = r6.A0E
            int r0 = r0.A06
            int r1 = r1 + r0
            if (r7 == 0) goto L_0x00c7
            int r0 = r7.A06
        L_0x009f:
            int r1 = r1 + r0
            int r0 = r6.A01
            int r0 = r0 / 2
            int r1 = r1 + r0
            X.0nA.A0T(r5, r1)
            X.IBb r0 = new X.IBb
            r0.<init>(r13, r4, r15)
            X.AnonymousClass0fU.A00(r0, r5)
        L_0x00b0:
            X.IC4 r0 = new X.IC4
            r0.<init>(r13, r4, r2, r15)
            X.AnonymousClass0fU.A00(r0, r3)
            android.view.ViewGroup r7 = X.C3019160o.A00(r3)
            if (r7 == 0) goto L_0x00c6
            X.IjN r6 = new X.IjN
            r6.<init>(r7, r8, r9, r10, r11)
            X.0nA.A0q(r7, r6)
        L_0x00c6:
            return
        L_0x00c7:
            r0 = 0
            goto L_0x009f
        L_0x00c9:
            r1 = 0
            goto L_0x008f
        L_0x00cb:
            r1 = 0
            goto L_0x007d
        L_0x00cd:
            android.view.View r1 = r14.A00
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00b0
        L_0x00d5:
            r2 = 0
            goto L_0x005d
        L_0x00d7:
            X.0qQ.A0A(r2)
            X.Upb r6 = new X.Upb
            r6.<init>(r2, r12, r4)
            goto L_0x003f
        L_0x00e1:
            android.view.View r1 = r14.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WV.A00(com.instagram.common.session.UserSession, X.3kD, X.6nQ, X.6na):void");
    }
}
