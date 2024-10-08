package X;

import android.widget.TextView;
import java.util.List;

/* renamed from: X.Vwi  reason: case insensitive filesystem */
public abstract class C18684Vwi {
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x024b, code lost:
        r0 = r2.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x024f, code lost:
        A01(r3, r11, (X.C17633VbP) r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0254, code lost:
        r6.A00.setVisibility(8);
        r0 = (X.C15966Uli) r9.A00;
        r3 = r0.A00;
        r2 = r0.A06;
        r1 = X.C253833rU.A02(r3);
        r0 = r6.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0269, code lost:
        if (r1 != false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x026b, code lost:
        r0.setVisibility(0);
        r6.A0B.setUrl(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0273, code lost:
        if (r2 == null) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0275, code lost:
        r6.A05.setText(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x027e, code lost:
        if (X.C253833rU.A02(r3) == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0280, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0282, code lost:
        r6.A00.setVisibility(0);
        r1 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0289, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0292, code lost:
        if (r1.findViewById(com.instagram.android.R.id.primary_button) == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0294, code lost:
        r5 = X.DbS.A0D(r6.A02);
        r5.setMargins(r5.leftMargin, r5.topMargin, r5.rightMargin, r15.getResources().getDimensionPixelOffset(com.instagram.android.R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        r6.A02.setLayoutParams(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02b3, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r15, android.view.View r16, X.AnonymousClass0iw r17, X.C230812qJ r18, X.C270374gd r19) {
        /*
            r9 = r19
            X.Eb1 r2 = r9.A00
            X.Uli r2 = (X.C15966Uli) r2
            java.lang.Object r6 = X.DbT.A0o(r16)
            X.Vcu r6 = (X.C17725Vcu) r6
            com.instagram.common.typedurl.ImageUrl r1 = r2.A01
            boolean r0 = X.C253833rU.A02(r1)
            r7 = r17
            if (r0 != 0) goto L_0x00fc
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A0C
            r0.setUrl(r1, r7)
        L_0x001b:
            java.lang.Integer r1 = r2.A04
            java.lang.Integer r8 = r2.A03
            java.lang.String r0 = r2.A0A
            java.lang.String r3 = "v3"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0054
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A0C
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x00e9
            if (r8 == 0) goto L_0x00e9
            int r0 = r1.intValue()
            float r0 = X.0nA.A04(r15, r0)
            double r0 = (double) r0
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r10
            int r4 = (int) r0
            r5.width = r4
            int r0 = r8.intValue()
            float r0 = X.0nA.A04(r15, r0)
            double r0 = (double) r0
            double r0 = r0 + r10
            int r4 = (int) r0
        L_0x004d:
            r5.height = r4
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A0C
            r0.setLayoutParams(r5)
        L_0x0054:
            android.widget.TextView r1 = r6.A09
            java.lang.String r0 = r2.A0D
            r1.setText(r0)
            android.widget.TextView r1 = r6.A08
            java.lang.String r0 = r2.A0B
            r1.setText(r0)
            boolean r0 = r2.A0H
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r6.A0A
            r11 = r18
            if (r0 != 0) goto L_0x00dd
            r0 = 4
            r1.setVisibility(r0)
        L_0x006e:
            java.lang.String r1 = r2.A0A
            boolean r0 = r3.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0122
            X.Eb1 r2 = r9.A00
            X.Uli r2 = (X.C15966Uli) r2
            android.widget.LinearLayout r5 = r6.A04
            android.view.ViewGroup r4 = r6.A03
            android.view.ViewGroup r3 = r6.A02
            X.Uxe r1 = r6.A0D
            X.Uxe r0 = r2.A02
            android.view.ViewGroup r0 = X.C17006VEg.A00(r5, r4, r3, r1, r0)
            r6.A02 = r0
            X.Uxe r4 = r2.A02
            r6.A0D = r4
            X.Uxe r3 = X.C16584Uxe.NO_BUTTON
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r4 != r3) goto L_0x009c
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
        L_0x009c:
            int r3 = r1.getDimensionPixelSize(r0)
            android.widget.TextView r0 = r6.A08
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbS.A0D(r0)
            r1.bottomMargin = r3
            android.widget.TextView r0 = r6.A08
            r0.setLayoutParams(r1)
            android.widget.LinearLayout r1 = r6.A04
            r0 = 2131440852(0x7f0b34d4, float:1.85037E38)
            android.widget.TextView r8 = X.AnonymousClass7TE.A0d(r1, r0)
            android.widget.LinearLayout r1 = r6.A04
            r0 = 2131438169(0x7f0b2a59, float:1.8498257E38)
            android.widget.TextView r4 = X.AnonymousClass7TE.A0d(r1, r0)
            android.widget.LinearLayout r1 = r6.A04
            r0 = 2131435004(0x7f0b1dfc, float:1.8491838E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r1, r0)
            java.util.List r2 = r2.A0G
            X.Uxe r0 = r6.A0D
            int r1 = r0.ordinal()
            r0 = 1
            r5 = 0
            switch(r1) {
                case 0: goto L_0x0254;
                case 1: goto L_0x0105;
                case 2: goto L_0x0105;
                case 3: goto L_0x010a;
                case 4: goto L_0x00d5;
                case 5: goto L_0x0110;
                case 6: goto L_0x0115;
                case 7: goto L_0x011d;
                case 8: goto L_0x0115;
                case 9: goto L_0x00d5;
                case 10: goto L_0x0244;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            java.lang.String r1 = "Unsupported button layout"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r0 = 0
            r1.setVisibility(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r6.A0A
            r0 = 68
            X.WBG.A01(r1, r0, r9, r11)
            goto L_0x006e
        L_0x00e9:
            android.content.res.Resources r0 = r15.getResources()
            r1 = 2131165236(0x7f070034, float:1.7944683E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r5.width = r0
            int r4 = X.AnonymousClass7TF.A02(r15, r1)
            goto L_0x004d
        L_0x00fc:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r6.A0C
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x001b
        L_0x0105:
            A02(r4, r11, r9, r2, r5)
            goto L_0x0254
        L_0x010a:
            java.lang.Object r0 = r2.get(r5)
            goto L_0x024f
        L_0x0110:
            A02(r4, r11, r9, r2, r5)
            goto L_0x024b
        L_0x0115:
            A02(r4, r11, r9, r2, r5)
            A02(r8, r11, r9, r2, r0)
            goto L_0x0254
        L_0x011d:
            A02(r8, r11, r9, r2, r5)
            goto L_0x024b
        L_0x0122:
            java.lang.String r0 = "v2"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x02b2
            X.Eb1 r10 = r9.A00
            X.Uli r10 = (X.C15966Uli) r10
            java.util.List r8 = r6.A0E
            int r1 = r8.size()
            java.util.List r0 = r10.A0G
            int r0 = r0.size()
            if (r1 == r0) goto L_0x0144
            r8.clear()
            android.view.ViewGroup r0 = r6.A01
            r0.removeAllViews()
        L_0x0144:
            boolean r0 = r8.isEmpty()
            r7 = 0
            if (r0 == 0) goto L_0x01f9
            r12 = 0
        L_0x014c:
            java.util.List r0 = r10.A0G
            int r0 = r0.size()
            if (r12 >= r0) goto L_0x01f9
            com.instagram.ui.widget.textview.ImageWithTitleTextView r5 = new com.instagram.ui.widget.textview.ImageWithTitleTextView
            r5.<init>(r15)
            java.lang.String r1 = r10.A07
            java.lang.String r0 = "vertical"
            boolean r0 = r0.equalsIgnoreCase(r1)
            boolean r13 = X.AnonymousClass7TF.A1P(r0)
            java.util.List r0 = r10.A0G
            int r0 = r0.size()
            r14 = 1
            int r0 = r0 - r14
            if (r12 < r0) goto L_0x0170
            r14 = 0
        L_0x0170:
            r1 = -1
            r0 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r1, r1, r0)
            r0 = 17
            r5.setGravity(r0)
            float r1 = X.C13989Tnp.A03(r15)
            r0 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 * r0
            int r3 = (int) r1
            r5.setPadding(r3, r3, r3, r3)
            android.view.ViewGroup r2 = r6.A01
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1 = 1
            r0 = 0
            if (r13 != r1) goto L_0x0191
            r0 = 1
        L_0x0191:
            r2.setOrientation(r0)
            if (r14 == 0) goto L_0x019b
            if (r13 != r1) goto L_0x01a9
            r4.setMargins(r7, r7, r7, r3)
        L_0x019b:
            r5.setLayoutParams(r4)
            android.view.ViewGroup r0 = r6.A01
            r0.addView(r5, r4)
            r8.add(r5)
            int r12 = r12 + 1
            goto L_0x014c
        L_0x01a9:
            r4.setMargins(r7, r7, r3, r7)
            goto L_0x019b
        L_0x01ad:
            java.lang.Object r6 = r8.get(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.util.List r0 = r10.A0G
            java.lang.Object r5 = r0.get(r7)
            X.VbP r5 = (X.C17633VbP) r5
            java.lang.String r1 = "#"
            java.lang.String r0 = r5.A02
            java.lang.String r0 = X.002.A0R(r1, r0)
            int r13 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = r5.A06
            java.lang.String r0 = X.002.A0R(r1, r0)
            int r4 = android.graphics.Color.parseColor(r0)
            X.Eb1 r0 = r9.A00
            X.Uli r0 = (X.C15966Uli) r0
            java.lang.String r1 = r0.A05
            java.lang.String r0 = r5.A02
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0202
            java.lang.String r0 = r5.A03
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0202
            r6.setBackgroundColor(r13)
        L_0x01ea:
            r6.setTextColor(r4)
            java.lang.String r0 = r5.A05
            r6.setText(r0)
            r0 = 43
            X.WB4.A00(r6, r11, r9, r5, r0)
            int r7 = r7 + 1
        L_0x01f9:
            java.util.List r0 = r10.A0G
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x02b2
            goto L_0x01ad
        L_0x0202:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            float r0 = r1.getDimension(r0)
            r3.setCornerRadius(r0)
            r0 = 2131100261(0x7f060265, float:1.7812898E38)
            int r12 = r15.getColor(r0)
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            r14 = 0
            int[] r2 = new int[]{r0}
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r1 = new int[]{r0}
            int[] r0 = new int[r14]
            int[][] r2 = new int[][]{r2, r1, r0}
            int[] r1 = new int[]{r12, r12, r13}
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r2, r1)
            r3.setColor(r0)
            r3.mutate()
            r6.setBackground(r3)
            goto L_0x01ea
        L_0x0244:
            A02(r4, r11, r9, r2, r5)
            A02(r8, r11, r9, r2, r0)
            r0 = 2
        L_0x024b:
            java.lang.Object r0 = r2.get(r0)
        L_0x024f:
            X.VbP r0 = (X.C17633VbP) r0
            A01(r3, r11, r0, r9)
        L_0x0254:
            android.view.ViewGroup r0 = r6.A00
            r4 = 8
            r0.setVisibility(r4)
            X.Eb1 r0 = r9.A00
            X.Uli r0 = (X.C15966Uli) r0
            com.instagram.common.typedurl.ImageUrl r3 = r0.A00
            java.lang.String r2 = r0.A06
            boolean r1 = X.C253833rU.A02(r3)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A0B
            if (r1 != 0) goto L_0x02b3
            r0.setVisibility(r5)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A0B
            r0.setUrl(r3, r7)
        L_0x0273:
            if (r2 == 0) goto L_0x027a
            android.widget.TextView r0 = r6.A05
            r0.setText(r2)
        L_0x027a:
            boolean r0 = X.C253833rU.A02(r3)
            if (r0 == 0) goto L_0x0282
            if (r2 == 0) goto L_0x02b2
        L_0x0282:
            android.view.ViewGroup r0 = r6.A00
            r0.setVisibility(r5)
            android.view.ViewGroup r1 = r6.A02
            if (r1 == 0) goto L_0x02b2
            r0 = 2131438169(0x7f0b2a59, float:1.8498257E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x02b2
            android.view.ViewGroup r0 = r6.A02
            android.view.ViewGroup$MarginLayoutParams r5 = X.DbS.A0D(r0)
            int r4 = r5.leftMargin
            int r3 = r5.topMargin
            int r2 = r5.rightMargin
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r5.setMargins(r4, r3, r2, r0)
            android.view.ViewGroup r0 = r6.A02
            r0.setLayoutParams(r5)
        L_0x02b2:
            return
        L_0x02b3:
            r0.setVisibility(r4)
            goto L_0x0273
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18684Vwi.A00(android.content.Context, android.view.View, X.0iw, X.2qJ, X.4gd):void");
    }

    public static void A01(TextView textView, C230812qJ r2, C17633VbP vbP, C270374gd r4) {
        textView.setText(vbP.A05);
        WB4.A00(textView, r2, r4, vbP, 42);
    }

    public static void A02(TextView textView, C230812qJ r2, C270374gd r3, List list, int i) {
        A01(textView, r2, (C17633VbP) list.get(i), r3);
    }
}
