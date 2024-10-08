package X;

public abstract class VGX {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C53290Glc r20, X.JZA r21, X.AnonymousClass0iw r22, X.C20848X1a r23, X.UEF r24, X.VPB r25, X.C18043VkR r26, java.lang.String r27, boolean r28, boolean r29) {
        /*
            r11 = 0
            r12 = r24
            r18 = r26
            r0 = r18
            boolean r10 = X.AnonymousClass7TF.A1U(r11, r12, r0)
            r4 = r22
            r22 = r23
            r16 = r27
            r1 = r22
            r0 = r16
            X.C51974G9v.A1M(r4, r1, r0)
            X.VYg r0 = r18.A00()
            X.VTj r3 = r0.A02
            if (r3 == 0) goto L_0x01f5
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r3.A01
            if (r0 == 0) goto L_0x01f0
            com.instagram.user.model.Product r9 = X.C14502TxO.A00(r0)
            com.instagram.model.mediasize.ImageInfo r2 = r9.A07
            java.lang.String r13 = ""
            if (r2 == 0) goto L_0x0042
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = r12.A05
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A01(r0, r2)
            if (r0 != 0) goto L_0x003f
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r13)
        L_0x003f:
            r1.setUrl(r0, r4)
        L_0x0042:
            android.view.View r8 = r12.A00
            android.content.Context r7 = r8.getContext()
            X.VTk r6 = r3.A00
            if (r6 == 0) goto L_0x01e6
            java.lang.Boolean r0 = r6.A00
            boolean r1 = X.AnonymousClass7TF.A1Y(r0, r10)
        L_0x0052:
            X.Vuo r0 = X.C18597Vuo.A01
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r5 = r12.A05
            r0.A01(r5, r9)
            android.widget.TextView r4 = r12.A03
            java.lang.String r15 = r9.A0J
            r4.setText(r15)
            if (r1 == 0) goto L_0x0163
            if (r29 == 0) goto L_0x0163
            android.widget.TextView r14 = r12.A02
            r0 = 2131973760(0x7f135680, float:1.9584565E38)
            r14.setText(r0)
        L_0x006c:
            r2 = 0
            if (r6 == 0) goto L_0x0095
            java.lang.String r1 = r6.A01
            if (r1 == 0) goto L_0x0095
            r0 = 2131973812(0x7f1356b4, float:1.958467E38)
            java.lang.String r0 = X.DbY.A0c(r7, r1, r0)
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r0)
            r0 = 2131100261(0x7f060265, float:1.7812898E38)
            int r0 = r7.getColor(r0)
            X.0mq.A02(r13, r1, r0)
            r0 = 2131100272(0x7f060270, float:1.781292E38)
            int r1 = r7.getColor(r0)
            r0 = r16
            X.0mq.A02(r13, r0, r1)
        L_0x0095:
            X.3oV r0 = r12.A07
            android.view.View r0 = r0.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r0.setText(r13)
            boolean r0 = r9.A0Q
            if (r0 != 0) goto L_0x015f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00a8:
            int r13 = X.DbV.A01(r7)
            int r6 = X.C51968G9o.A04(r7)
            int r3 = r0.intValue()
            r1 = 8
            android.view.View r0 = r12.A01
            if (r3 == r10) goto L_0x0144
            r0.setVisibility(r1)
            r0 = 255(0xff, float:3.57E-43)
            r5.setImageAlpha(r0)
            r4.setTextColor(r6)
            r14.setTextColor(r6)
        L_0x00c8:
            X.3oV r0 = r12.A06
            r0.setVisibility(r1)
            r17 = 2
            X.WAE r4 = new X.WAE
            r0 = r20
            r5 = r21
            r19 = r0
            r20 = r18
            r21 = r9
            r23 = r7
            r16 = r4
            r18 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L_0x012c
            if (r5 == 0) goto L_0x012c
            com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton r3 = r12.A08
            X.2eS.A01(r3)
            X.0qQ.A0A(r7)
            X.C55145Hct.A00(r7, r0, r3, r15)
            boolean r0 = r5.A02
            r3.setToggled(r0)
            r3.setVisibility(r11)
            android.view.View r0 = r12.itemView
            r0.setBackground(r2)
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x011f
            r3.setEnabled(r11)
            r3.setOnClickListener(r2)
            r8.setClickable(r10)
            X.AnonymousClass0fU.A00(r4, r8)
        L_0x0110:
            com.instagram.common.ui.base.IgSimpleImageView r3 = r12.A04
            r4 = r25
            if (r25 == 0) goto L_0x01e9
            r3.setVisibility(r11)
            r0 = 66
            X.WBD.A00(r3, r0, r9, r4)
            return
        L_0x011f:
            r3.setEnabled(r10)
            X.AnonymousClass0fU.A00(r4, r3)
            r8.setOnClickListener(r2)
            r8.setClickable(r11)
            goto L_0x0110
        L_0x012c:
            com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton r0 = r12.A08
            r0.setVisibility(r1)
            X.AnonymousClass0fU.A00(r4, r8)
            r0.setOnClickListener(r2)
            android.view.View r4 = r12.itemView
            android.content.Context r3 = r4.getContext()
            r0 = 2130968710(0x7f040086, float:1.7546081E38)
            X.C13988Tno.A0q(r3, r4, r0)
            goto L_0x0110
        L_0x0144:
            if (r28 == 0) goto L_0x015b
            r0.setVisibility(r11)
        L_0x0149:
            r0 = 125(0x7d, float:1.75E-43)
            r5.setImageAlpha(r0)
            r4.setTextColor(r13)
            r14.setTextColor(r13)
            X.3oV r0 = r12.A06
            r0.setVisibility(r1)
            goto L_0x00c8
        L_0x015b:
            r0.setVisibility(r1)
            goto L_0x0149
        L_0x015f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00a8
        L_0x0163:
            boolean r0 = r9.A0Q
            if (r0 != 0) goto L_0x019c
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r0 = r7.getString(r0)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            int r0 = X.DbV.A02(r7)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r0)
            int r1 = r2.length()
            r0 = 33
            r2.setSpan(r3, r11, r1, r0)
            r0 = 2131970973(0x7f134b9d, float:1.9578912E38)
            android.text.SpannableStringBuilder r1 = X.DbW.A08(r7, r0)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            r0.append(r2)
            android.widget.TextView r14 = r12.A02
        L_0x0197:
            r14.setText(r1)
            goto L_0x006c
        L_0x019c:
            android.widget.TextView r14 = r12.A02
            X.0qQ.A0A(r7)
            r1 = 0
            X.0qQ.A0B(r7, r10)
            com.instagram.api.schemas.ProductReviewStatus r3 = r9.A05
            com.instagram.api.schemas.ProductReviewStatus r2 = com.instagram.api.schemas.ProductReviewStatus.APPROVED
            if (r3 == r2) goto L_0x01e1
            com.instagram.api.schemas.ProductReviewStatus r0 = com.instagram.api.schemas.ProductReviewStatus.PENDING
            if (r3 == r0) goto L_0x01e1
            r1 = 2132017986(0x7f140342, float:1.9674266E38)
            r0 = 2132017197(0x7f14002d, float:1.9672666E38)
            android.text.SpannableString r1 = X.C324476zN.A01(r7, r9, r1, r0)
        L_0x01b9:
            if (r3 != r2) goto L_0x0197
            boolean r0 = r9.A04()
            if (r0 == 0) goto L_0x0197
            boolean r0 = r9.A0P
            if (r0 != 0) goto L_0x0197
            r0 = 2131969827(0x7f134723, float:1.9576588E38)
            android.text.SpannableStringBuilder r0 = X.DbW.A08(r7, r0)
            java.lang.String r3 = " "
            android.text.SpannableStringBuilder r2 = r0.append(r3)
            java.lang.String r0 = "·"
            android.text.SpannableStringBuilder r0 = r2.append(r0)
            android.text.SpannableStringBuilder r0 = r0.append(r3)
            android.text.SpannableStringBuilder r1 = r0.append(r1)
            goto L_0x0197
        L_0x01e1:
            java.lang.CharSequence r1 = X.C324476zN.A08(r7, r9, r1, r1)
            goto L_0x01b9
        L_0x01e6:
            r1 = 0
            goto L_0x0052
        L_0x01e9:
            r3.setVisibility(r1)
            r3.setOnClickListener(r2)
            return
        L_0x01f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VGX.A00(X.Glc, X.JZA, X.0iw, X.X1a, X.UEF, X.VPB, X.VkR, java.lang.String, boolean, boolean):void");
    }
}
