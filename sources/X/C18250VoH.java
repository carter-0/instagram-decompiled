package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;

/* renamed from: X.VoH  reason: case insensitive filesystem */
public abstract class C18250VoH {
    /* JADX WARNING: type inference failed for: r2v1, types: [X.3kE, X.UBc] */
    public static final C14823UBc A00(ViewGroup viewGroup) {
        View A0D = DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.publishing_product_row, false);
        ? r2 = new C249703kE(A0D);
        r2.A00 = A0D;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) A0D.requireViewById(R.id.product_image);
        r2.A03 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        TextView A0G = DbU.A0G(r2.A00, R.id.product_name);
        r2.A02 = A0G;
        C13988Tno.A16(A0G, true);
        r2.A01 = AnonymousClass7TE.A0d(r2.A00, R.id.product_details);
        r2.A05 = DbU.A0Y(r2.A00, R.id.product_sku_info);
        r2.A04 = DbU.A0Y(r2.A00, R.id.product_picker_checkbox);
        r2.A06 = (AutoWidthToggleButton) r2.A00.findViewById(R.id.product_action_button);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00df, code lost:
        if (r6 != null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C53290Glc r16, X.JZA r17, X.AnonymousClass0iw r18, X.X1Z r19, X.C14823UBc r20, X.C18043VkR r21, java.lang.String r22, boolean r23) {
        /*
            r3 = 0
            r12 = r20
            r14 = r21
            boolean r4 = X.AnonymousClass7TF.A1U(r3, r12, r14)
            r5 = r18
            r13 = r19
            r7 = r22
            X.C51974G9v.A1M(r5, r13, r7)
            X.VYg r0 = r14.A00()
            X.VWo r15 = r0.A01
            java.lang.String r1 = "Required value was null."
            if (r15 == 0) goto L_0x010d
            com.instagram.model.shopping.ProductGroup r0 = r15.A00
            if (r0 == 0) goto L_0x0107
            java.util.List r0 = r0.A00()
            if (r0 == 0) goto L_0x0107
            java.lang.Object r11 = r0.get(r3)
            com.instagram.user.model.Product r11 = (com.instagram.user.model.Product) r11
            com.instagram.model.mediasize.ImageInfo r2 = r11.A07
            if (r2 == 0) goto L_0x003f
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = r12.A03
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r1)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A01(r0, r2)
            if (r0 == 0) goto L_0x003f
            r1.setUrl(r0, r5)
        L_0x003f:
            android.view.View r2 = r12.A00
            android.content.Context r9 = r2.getContext()
            X.Vuo r1 = X.C18597Vuo.A01
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r12.A03
            r1.A01(r0, r11)
            android.widget.TextView r0 = r12.A02
            java.lang.String r1 = r11.A0J
            r0.setText(r1)
            X.VTk r6 = r15.A01
            if (r6 == 0) goto L_0x00d0
            java.lang.Boolean r0 = r6.A00
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x00d0
            if (r23 == 0) goto L_0x00d0
            android.widget.TextView r4 = r12.A01
            r0 = 2131973760(0x7f135680, float:1.9584565E38)
            r4.setText(r0)
        L_0x0069:
            java.lang.String r5 = r6.A01
            if (r5 == 0) goto L_0x00e2
            r0 = 2131973811(0x7f1356b3, float:1.9584668E38)
            java.lang.String r0 = X.DbY.A0c(r9, r5, r0)
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            r0 = 2131100261(0x7f060265, float:1.7812898E38)
            int r0 = r9.getColor(r0)
            X.0mq.A02(r4, r5, r0)
            r0 = 2131100272(0x7f060270, float:1.781292E38)
            int r0 = r9.getColor(r0)
            X.0mq.A02(r4, r7, r0)
            X.3oV r0 = r12.A05
            android.view.View r0 = r0.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r4)
        L_0x0098:
            r4 = 8
            X.3oV r0 = r12.A04
            r0.setVisibility(r4)
            r7 = 2
            X.WAH r6 = new X.WAH
            r8 = r16
            r10 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r16 == 0) goto L_0x00ee
            if (r17 == 0) goto L_0x00ee
            com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton r4 = r12.A06
            X.2eS.A01(r4)
            X.0qQ.A0A(r9)
            X.C55145Hct.A00(r9, r8, r4, r1)
            boolean r0 = r10.A02
            r4.setToggled(r0)
            r4.setVisibility(r3)
            r1 = 0
            r2.setOnClickListener(r1)
            r2.setClickable(r3)
            X.AnonymousClass0fU.A00(r6, r4)
            android.view.View r0 = r12.itemView
            r0.setBackground(r1)
            return
        L_0x00d0:
            android.widget.TextView r8 = r12.A01
            java.lang.String r5 = r11.A0L
            java.lang.String r4 = r15.A02
            java.lang.String r0 = "%s ∙ %s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r5, r4)
            r8.setText(r0)
            if (r6 == 0) goto L_0x00e2
            goto L_0x0069
        L_0x00e2:
            X.3oV r0 = r12.A05
            android.view.View r0 = r0.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            X.DbS.A1C(r0)
            goto L_0x0098
        L_0x00ee:
            r1 = 0
            com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton r0 = r12.A06
            r0.setVisibility(r4)
            X.AnonymousClass0fU.A00(r6, r2)
            r0.setOnClickListener(r1)
            android.view.View r2 = r12.itemView
            android.content.Context r1 = r2.getContext()
            r0 = 2130968710(0x7f040086, float:1.7546081E38)
            X.C13988Tno.A0q(r1, r2, r0)
            return
        L_0x0107:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x010d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18250VoH.A01(X.Glc, X.JZA, X.0iw, X.X1Z, X.UBc, X.VkR, java.lang.String, boolean):void");
    }
}
