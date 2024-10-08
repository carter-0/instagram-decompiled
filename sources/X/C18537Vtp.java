package X;

/* renamed from: X.Vtp  reason: case insensitive filesystem */
public final class C18537Vtp {
    public static final C18537Vtp A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r1 = r0.intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass0iw r10, X.C18519VtJ r11, X.X84 r12, X.UEX r13) {
        /*
            r9 = this;
            r4 = 0
            X.0qQ.A0B(r13, r4)
            android.view.View r6 = r13.A01
            r0 = 39
            X.WB0.A00(r6, r0, r12)
            android.widget.TextView r5 = r13.A02
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            X.HsR r1 = r11.A00
            if (r1 == 0) goto L_0x0024
            android.content.res.Resources r0 = X.C66580MXl.A0B(r5)
            java.lang.String r0 = X.C56259HvT.A00(r0, r1)
            android.text.SpannableStringBuilder r0 = r3.append(r0)
            if (r0 != 0) goto L_0x002b
        L_0x0024:
            java.lang.String r0 = r11.A0C
            if (r0 == 0) goto L_0x002b
            r3.append(r0)
        L_0x002b:
            java.lang.Integer r0 = r11.A0A
            if (r0 == 0) goto L_0x0058
            int r1 = r0.intValue()
            android.content.Context r0 = r5.getContext()
            android.graphics.drawable.Drawable r8 = r0.getDrawable(r1)
            if (r8 == 0) goto L_0x0058
            r7 = 0
            X.AnonymousClass7TG.A13(r8)
            boolean r0 = X.0mk.A02(r0)
            java.lang.String r1 = "  "
            if (r0 == 0) goto L_0x012e
            r3.insert(r4, r1)
        L_0x004c:
            X.46l r2 = new X.46l
            r2.<init>(r8)
            int r1 = r7 + 1
            r0 = 33
            r3.setSpan(r2, r7, r1, r0)
        L_0x0058:
            r2 = 0
            X.HsR r1 = r11.A03
            if (r1 == 0) goto L_0x0073
            java.lang.String r0 = "\n"
            r3.append(r0)
            android.content.res.Resources r0 = X.C66580MXl.A0B(r5)
            java.lang.String r0 = X.C56259HvT.A00(r0, r1)
            android.text.SpannableStringBuilder r0 = r3.append(r0)
            if (r0 != 0) goto L_0x0073
            r3.append(r2)
        L_0x0073:
            r5.setText(r3)
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r13.A03
            java.lang.Integer r0 = r11.A09
            if (r0 == 0) goto L_0x0096
            int r0 = r0.intValue()
            android.content.Context r3 = r5.getContext()
            android.graphics.drawable.Drawable r1 = r3.getDrawable(r0)
            java.lang.Integer r0 = r11.A08
            if (r0 == 0) goto L_0x0093
            int r0 = r0.intValue()
            X.DbX.A12(r3, r5, r0)
        L_0x0093:
            r5.setImageDrawable(r1)
        L_0x0096:
            com.instagram.common.typedurl.ImageUrl r0 = r11.A05
            if (r0 == 0) goto L_0x009d
            r5.setUrl(r0, r10)
        L_0x009d:
            android.content.Context r1 = r5.getContext()
            java.lang.Integer r0 = r11.A07
            if (r0 == 0) goto L_0x0129
            int r0 = r0.intValue()
        L_0x00a9:
            X.DbU.A11(r1, r5, r0)
            com.instagram.common.typedurl.ImageUrl r7 = r11.A04
            X.3oV r0 = r13.A06
            android.view.View r1 = r0.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            if (r7 == 0) goto L_0x0123
            android.view.animation.Animation r0 = r11.A01
            if (r0 != 0) goto L_0x0123
            r1.setVisibility(r4)
            r1.setUrl(r7, r10)
        L_0x00c2:
            android.view.animation.Animation r5 = r11.A01
            X.3oV r1 = r13.A05
            if (r5 == 0) goto L_0x011d
            android.view.View r3 = r1.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            if (r7 == 0) goto L_0x00d3
            r3.setUrl(r7, r10)
        L_0x00d3:
            r1 = 1
            X.Lyc r0 = new X.Lyc
            r0.<init>(r1, r5, r3, r12)
            X.C64179LSh.A02(r3, r0)
        L_0x00dc:
            X.3oV r0 = r13.A07
            r5 = 8
            r0.setVisibility(r5)
            X.HsR r7 = r11.A02
            if (r7 != 0) goto L_0x013d
            java.lang.String r0 = r11.A0B
            if (r0 != 0) goto L_0x013d
            android.view.View r4 = r13.A00
            android.content.Context r3 = r4.getContext()
            r0 = 2131231287(0x7f080237, float:1.807865E38)
            X.DbU.A11(r3, r4, r0)
            int r2 = X.C51972G9s.A08(r3)
            int r1 = r4.getPaddingLeft()
            int r0 = r4.getPaddingRight()
            r4.setPadding(r1, r2, r0, r2)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r4.setMinimumHeight(r0)
            X.0nA.A0T(r4, r2)
            X.3oV r0 = r13.A04
            r0.setVisibility(r5)
            return
        L_0x011d:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00dc
        L_0x0123:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00c2
        L_0x0129:
            r0 = 2131231568(0x7f080350, float:1.807922E38)
            goto L_0x00a9
        L_0x012e:
            int r0 = r3.length()
            r3.insert(r0, r1)
            int r0 = r3.length()
            int r7 = r0 + -1
            goto L_0x004c
        L_0x013d:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.lang.CharSequence r0 = r11.A06
            if (r0 == 0) goto L_0x014f
            android.text.SpannableStringBuilder r1 = r3.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
        L_0x014f:
            if (r7 == 0) goto L_0x015c
            android.content.res.Resources r0 = X.C66580MXl.A0B(r6)
            java.lang.String r0 = X.C56259HvT.A00(r0, r7)
            r3.append(r0)
        L_0x015c:
            java.lang.String r0 = r11.A0B
            if (r0 == 0) goto L_0x0163
            r3.append(r0)
        L_0x0163:
            X.3oV r0 = r13.A04
            android.view.View r1 = r0.getView()
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r1
            r1.setVisibility(r4)
            r1.setLabel(r3)
            r0 = 40
            X.WB0.A00(r1, r0, r12)
            android.view.View r3 = r13.A00
            r3.setBackground(r2)
            r3.setMinimumHeight(r4)
            android.content.Context r0 = r3.getContext()
            int r2 = X.C51972G9s.A08(r0)
            int r1 = r3.getPaddingLeft()
            int r0 = r3.getPaddingRight()
            r3.setPadding(r1, r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18537Vtp.A00(X.0iw, X.VtJ, X.X84, X.UEX):void");
    }
}
