package X;

/* renamed from: X.6LZ  reason: invalid class name */
public abstract class AnonymousClass6LZ {
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015c, code lost:
        if (r5 != null) goto L_0x015e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r32, X.C255773uh r33, X.C250973mM r34, X.C309756Zm r35, X.AnonymousClass6PD r36, java.lang.String r37) {
        /*
            r15 = 0
            r10 = 1
            r9 = 4
            r8 = 2
            r7 = 3
            r6 = 6
            r25 = r37
            r0 = r25
            X.0qQ.A0B(r0, r7)
            r5 = 5
            r11 = r36
            X.3oV r14 = r11.A03
            android.view.View r0 = r14.getView()
            r0.setVisibility(r15)
            android.view.View r0 = r11.A00
            if (r0 == 0) goto L_0x01a1
            android.content.Context r4 = r0.getContext()
            r12 = r33
            X.1Xj r13 = r12.A0b
            r3 = 0
            if (r13 == 0) goto L_0x0197
            X.1Xy r0 = r13.A0C
            com.instagram.user.model.User r1 = r0.CCd()
            X.1Xy r0 = r13.A0C
            java.util.List r0 = r0.BxO()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r2 = X.00k.A0J(r0)
            X.3yf r2 = (X.C258223yf) r2
        L_0x003c:
            if (r1 == 0) goto L_0x0197
            if (r2 == 0) goto L_0x0197
            java.util.List r26 = r2.BxQ()
            com.instagram.api.schemas.SocialContextType r0 = r2.BxW()
            X.0qQ.A0A(r4)
            int r1 = r0.ordinal()
            r0 = 9
            if (r1 == r0) goto L_0x00dd
            r0 = 7
            if (r1 == r0) goto L_0x00e1
            r1 = 0
        L_0x0057:
            java.lang.Object r0 = X.00k.A0J(r26)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0063
            java.lang.String r3 = r0.getUsername()
        L_0x0063:
            boolean r0 = r26.isEmpty()
            r33 = r32
            if (r0 != 0) goto L_0x0178
            if (r1 == 0) goto L_0x0178
            if (r3 == 0) goto L_0x0178
            java.lang.Integer r0 = r11.A04
            int r0 = r0.intValue()
            switch(r0) {
                case 3: goto L_0x00d7;
                case 4: goto L_0x00da;
                case 5: goto L_0x00d7;
                case 6: goto L_0x00da;
                default: goto L_0x0078;
            }
        L_0x0078:
            r13 = 0
        L_0x0079:
            float r14 = (float) r13
            android.content.res.Resources r13 = r4.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = android.util.TypedValue.applyDimension(r10, r14, r13)
            int r13 = (int) r13
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            r16 = 0
            r17 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r27 = r13
            r28 = r15
            r29 = r15
            r30 = r15
            r31 = r10
            r32 = r15
            r15 = r4
            X.3b0 r13 = X.C244283aw.A04(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            android.widget.ImageView r10 = r11.A01
            if (r10 == 0) goto L_0x0175
            r10.setImageDrawable(r13)
            int r14 = r2.getSocialContextUsersCount()
            r13 = r34
            r10 = r35
            if (r0 == r9) goto L_0x00ed
            if (r0 == r7) goto L_0x00ed
            if (r0 == r6) goto L_0x00f5
            if (r0 == r5) goto L_0x015a
            if (r0 != r8) goto L_0x00d6
            android.widget.TextView r0 = r11.A02
            if (r0 == 0) goto L_0x01a4
            r0.setText(r1)
            android.view.View r1 = r11.A00
            if (r1 == 0) goto L_0x01a1
            X.FNh r0 = new X.FNh
            r0.<init>(r12, r13, r10)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00d6:
            return
        L_0x00d7:
            r13 = 16
            goto L_0x0079
        L_0x00da:
            r13 = 32
            goto L_0x0079
        L_0x00dd:
            r0 = 2131964958(0x7f13341e, float:1.9566712E38)
            goto L_0x00e4
        L_0x00e1:
            r0 = 2131962593(0x7f132ae1, float:1.9561916E38)
        L_0x00e4:
            java.lang.String r1 = r4.getString(r0)
            goto L_0x0057
        L_0x00ea:
            r2 = r3
            goto L_0x003c
        L_0x00ed:
            android.widget.TextView r0 = r11.A02
            if (r0 == 0) goto L_0x01a4
            r0.setText(r1)
            goto L_0x013b
        L_0x00f5:
            android.widget.TextView r5 = r11.A02
            if (r5 == 0) goto L_0x01a4
            int r2 = r3.length()
            r0 = 9
            if (r2 <= r0) goto L_0x015e
            r0 = 19
            X.I0r r6 = X.I0r.A00
            if (r2 < r0) goto L_0x014a
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            java.lang.String r7 = "\n"
            android.text.SpannableStringBuilder r2 = r0.append(r7)
            java.lang.String r1 = "<b>"
            java.lang.String r0 = "</b>"
            java.lang.String r0 = X.002.A0g(r1, r3, r0)
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = ""
        L_0x011e:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            X.0qQ.A07(r0)
            android.text.SpannableStringBuilder r0 = r2.append(r0)
            android.text.SpannableStringBuilder r1 = r0.append(r7)
            android.text.Spanned r0 = r6.A01(r4, r14)
        L_0x0131:
            android.text.SpannableStringBuilder r2 = r1.append(r0)
            X.0qQ.A07(r2)
        L_0x0138:
            r5.setText(r2)
        L_0x013b:
            android.view.View r2 = r11.A00
            if (r2 == 0) goto L_0x01a1
            X.AP8 r1 = new X.AP8
            r0 = r33
            r1.<init>(r0, r12, r13, r10)
            r2.setOnTouchListener(r1)
            return
        L_0x014a:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r1)
            java.lang.String r0 = "\n"
            android.text.SpannableStringBuilder r1 = r2.append(r0)
            android.text.SpannableStringBuilder r0 = r6.A00(r4, r3, r14)
            goto L_0x0131
        L_0x015a:
            android.widget.TextView r5 = r11.A02
            if (r5 == 0) goto L_0x01a4
        L_0x015e:
            X.I0r r6 = X.I0r.A00
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r0 = " "
            r2.append(r0)
            android.text.SpannableStringBuilder r0 = r6.A00(r4, r3, r14)
            r2.append(r0)
            goto L_0x0138
        L_0x0175:
            java.lang.String r0 = "facepile"
            goto L_0x01a6
        L_0x0178:
            X.0wj r2 = X.0wj.A01
            r1 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r0 = "STORIES_AD_SOCIAL_CONTEXT"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.String r1 = "Server sent a SocialContext object with incomplete data "
            r0 = r33
            java.lang.String r0 = X.C231122qu.A07(r0, r13)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "message"
            r2.ABQ(r0, r1)
            r2.report()
        L_0x0197:
            android.view.View r1 = r14.getView()
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x01a1:
            java.lang.String r0 = "socialContextContainer"
            goto L_0x01a6
        L_0x01a4:
            java.lang.String r0 = "socialContextSummary"
        L_0x01a6:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6LZ.A00(com.instagram.common.session.UserSession, X.3uh, X.3mM, X.6Zm, X.6PD, java.lang.String):void");
    }
}
