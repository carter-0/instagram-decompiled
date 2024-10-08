package X;

/* renamed from: X.VFv  reason: case insensitive filesystem */
public abstract class C17047VFv {
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C17801VgE r11, X.C20961X6o r12, X.C14901UEg r13, java.lang.Integer r14, int r15) {
        /*
            com.instagram.ui.widget.base.AspectRatioLinearLayout r2 = r13.A0E
            r1 = 2131239645(0x7f0822dd, float:1.8095603E38)
            r2.setBackgroundResource(r1)
            android.view.View r3 = r13.A03
            com.instagram.reels.question.model.QuestionResponseModel r1 = r11.A00
            boolean r2 = r1.A09
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0015
            r1 = 1058642330(0x3f19999a, float:0.6)
        L_0x0015:
            r3.setAlpha(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r13.A0B
            int r10 = r14.intValue()
            r0 = 1
            if (r0 == r10) goto L_0x00c5
            r2 = 0
        L_0x0022:
            r7 = 0
            r5 = 8
            int r1 = X.C13988Tno.A0E(r2)
            r6.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r13.A0A
            r1 = 0
            if (r2 == 0) goto L_0x0033
            r1 = 8
        L_0x0033:
            r3.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r13.A0C
            r0 = 1
            if (r0 == r10) goto L_0x00c1
            r9 = 0
            r1 = 8
        L_0x003e:
            r8.setVisibility(r1)
            X.3NM r1 = r13.A09
            r1.A02()
            r2 = 6
            X.WB3 r1 = new X.WB3
            r1.<init>(r15, r2, r12, r11)
            r13.A00 = r1
            r4 = 0
            if (r9 == 0) goto L_0x00bf
            r2 = 7
            X.WB3 r1 = new X.WB3
            r1.<init>(r15, r2, r12, r11)
        L_0x0057:
            X.AnonymousClass0fU.A00(r1, r8)
            android.widget.TextView r2 = r13.A08
            com.instagram.reels.question.model.QuestionResponseModel r1 = r11.A00
            com.instagram.user.model.User r1 = r1.A04
            X.DbU.A1H(r2, r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r1)
            com.instagram.reels.interactive.view.AvatarView r8 = r13.A0D
            com.instagram.reels.question.model.QuestionResponseModel r1 = r11.A00
            com.instagram.user.model.User r1 = r1.A04
            r8.setAvatarUser(r1)
            int r2 = r11.A00()
            android.content.Context r1 = X.DbS.A07(r13)
            int r1 = X.C19477WaP.A00(r1)
            if (r2 != r1) goto L_0x00b7
            r8.setStrokeColor(r7)
        L_0x0082:
            com.instagram.reels.question.model.QuestionResponseModel r1 = r11.A00
            java.lang.Boolean r1 = r1.A05
            if (r1 == 0) goto L_0x0093
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0093
            android.view.View r1 = r13.A06
            r1.setVisibility(r7)
        L_0x0093:
            int r10 = 1 - r10
            if (r10 != 0) goto L_0x00c8
            com.instagram.reels.question.model.QuestionResponseModel r1 = r11.A00
            com.instagram.user.model.User r1 = r1.A04
            java.lang.Integer r2 = r1.A0N()
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00c8
            android.view.View r1 = r13.A04
            r1.setVisibility(r5)
            android.widget.TextView r1 = r13.A07
            r1.setVisibility(r5)
            r6.setVisibility(r5)
            r13.A00 = r4
            return
        L_0x00b7:
            int r1 = r11.A00()
            r8.setStrokeColor(r1)
            goto L_0x0082
        L_0x00bf:
            r1 = r4
            goto L_0x0057
        L_0x00c1:
            r9 = 1
            r1 = 0
            goto L_0x003e
        L_0x00c5:
            r2 = 1
            goto L_0x0022
        L_0x00c8:
            android.view.View r8 = r13.A04
            r9 = 0
            r8.setVisibility(r7)
            android.widget.TextView r5 = r13.A07
            r5.setVisibility(r7)
            r6.setVisibility(r7)
            int r2 = r11.A00()
            android.content.Context r1 = X.DbS.A07(r13)
            int r1 = X.C19477WaP.A00(r1)
            r10 = 3
            boolean r6 = X.AnonymousClass7TF.A1S(r2, r1)
            com.instagram.reels.question.model.QuestionResponsesModel r1 = r11.A01
            X.0qQ.A0B(r1, r7)
            java.lang.String r1 = r1.A09
            int r4 = android.graphics.Color.parseColor(r1)
            r2 = 0
            com.instagram.reels.question.model.QuestionResponseModel r1 = r11.A00
            com.instagram.reels.question.model.responsetype.QuestionResponseType r1 = r1.A02
            int r1 = r1.ordinal()
            if (r1 == r10) goto L_0x0126
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x00ff:
            r4 = -1
            if (r2 == 0) goto L_0x012f
            android.graphics.drawable.GradientDrawable r1 = r13.A01
            android.graphics.drawable.Drawable r1 = r1.mutate()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            r1.setColors(r2)
        L_0x010d:
            r8.setBackground(r1)
            com.instagram.reels.question.model.QuestionResponseModel r1 = r11.A00
            boolean r2 = r1.A09
            r1 = 2131971042(0x7f134be2, float:1.9579052E38)
            if (r2 == 0) goto L_0x011c
            r1 = 2131971043(0x7f134be3, float:1.9579054E38)
        L_0x011c:
            r5.setText(r1)
            r5.setTextColor(r4)
            r3.setColorFilter(r4)
            return
        L_0x0126:
            if (r6 == 0) goto L_0x012b
            int[] r2 = X.C19477WaP.A02
            goto L_0x00ff
        L_0x012b:
            int r9 = r11.A00()
        L_0x012f:
            android.graphics.drawable.GradientDrawable r1 = r13.A02
            android.graphics.drawable.Drawable r1 = r1.mutate()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            r1.setColor(r9)
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17047VFv.A00(X.VgE, X.X6o, X.UEg, java.lang.Integer, int):void");
    }
}
