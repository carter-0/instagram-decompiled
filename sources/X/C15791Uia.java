package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

/* renamed from: X.Uia  reason: case insensitive filesystem */
public final class C15791Uia extends C232222tE {
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final VPD A02;
    public final C17390VTr A03;

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v94, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r12v12, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0109, code lost:
        if (r9.A00.A01 == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x029e, code lost:
        if (r1 != null) goto L_0x026a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x029e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r28, X.C249703kE r29) {
        /*
            r27 = this;
            r8 = r29
            r9 = r28
            X.WST r9 = (X.WST) r9
            X.UEL r8 = (X.UEL) r8
            boolean r10 = X.AnonymousClass7TG.A1Z(r9, r8)
            r1 = r27
            X.VPD r0 = r1.A02
            r26 = r0
            X.0iw r2 = r1.A01
            androidx.fragment.app.Fragment r3 = r1.A00
            X.VTr r0 = r1.A03
            r25 = r0
            r7 = 0
            r17 = 4
            r6 = 2
            r0 = r26
            X.AnonymousClass7TF.A1C(r0, r6, r2)
            r1 = r17
            r0 = r25
            X.DbW.A1N(r3, r1, r0)
            com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton r5 = r8.A08
            r1 = 8
            r5.setVisibility(r1)
            r5.setEnabled(r10)
            r5.setToggled(r7)
            r11 = 0
            r5.setOnClickListener(r11)
            android.view.View r4 = r8.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r0)
            X.UKo r3 = r9.A01
            X.JwL r13 = r3.A01
            java.lang.Object r0 = r13.A01
            X.UxR r0 = (X.C16574UxR) r0
            int r0 = X.DbU.A02(r0, r7)
            if (r0 == r7) goto L_0x0089
            if (r0 == r10) goto L_0x0089
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r8.A06
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r12 = r8.A07
            r12.setVisibility(r7)
        L_0x005c:
            java.lang.Object r15 = r13.A00
            X.JwE r15 = (X.C61076JwE) r15
            java.lang.Object r0 = r15.A00
            r14 = r0
            X.Uwz r0 = X.C16552Uwz.UNKNOWN
            r16 = 0
            if (r14 == r0) goto L_0x0098
            android.content.Context r14 = r12.getContext()
            int r2 = X.Dbb.A01(r14)
            java.lang.Object r0 = r13.A00
            X.JwE r0 = (X.C61076JwE) r0
            java.lang.Object r0 = r0.A00
            X.Uwz r0 = (X.C16552Uwz) r0
            int r0 = X.DbU.A02(r0, r7)
            if (r0 == r7) goto L_0x00e0
            if (r0 == r10) goto L_0x0094
            if (r0 == r6) goto L_0x0094
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0089:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r12 = r8.A06
            r12.setVisibility(r7)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r8.A07
            r0.setVisibility(r1)
            goto L_0x005c
        L_0x0094:
            r0 = 2131240064(0x7f082480, float:1.8096453E38)
            goto L_0x00e3
        L_0x0098:
            java.lang.String r0 = r15.A01
            if (r0 == 0) goto L_0x00dc
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00dc
            X.UxE r14 = r3.A07
            X.UxE r0 = X.C16562UxE.PRODUCT
            if (r14 != r0) goto L_0x00ca
            android.widget.TextView r0 = r8.A03
            r18 = r0
            android.content.Context r15 = X.AnonymousClass7TE.A0S(r12)
            android.content.res.Resources r0 = r15.getResources()
            r14 = 2131165229(0x7f07002d, float:1.794467E38)
            int r0 = r0.getDimensionPixelSize(r14)
            X.0nA.A0f(r12, r0)
            int r0 = X.AnonymousClass7TF.A02(r15, r14)
            X.0nA.A0V(r12, r0)
            r0 = r18
            r0.setMaxLines(r6)
        L_0x00ca:
            java.lang.Object r0 = r13.A00
            X.JwE r0 = (X.C61076JwE) r0
            java.lang.String r14 = r0.A01
            X.0qQ.A0A(r14)
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r14)
            r12.setUrl(r0, r2)
            goto L_0x00f1
        L_0x00dc:
            r12.A09()
            goto L_0x00f1
        L_0x00e0:
            r0 = 2131240065(0x7f082481, float:1.8096455E38)
        L_0x00e3:
            android.graphics.drawable.Drawable r0 = r14.getDrawable(r0)
            X.0qQ.A0A(r0)
            android.graphics.Bitmap r0 = X.C62953Kp5.A00(r0, r2, r2)
            r12.setImageBitmap(r0)
        L_0x00f1:
            X.UxR r14 = X.C16574UxR.GRAYED_OUT_CIRCLE
            X.UxR r2 = X.C16574UxR.GRAYED_OUT_SQUARE
            X.UxR r0 = X.C16574UxR.GRAYED_OUT_SQUARE_WITH_LINE
            X.UxR[] r2 = new X.C16574UxR[]{r14, r2, r0}
            java.lang.Object r0 = r13.A01
            boolean r0 = X.03t.A0O(r0, r2)
            if (r0 != 0) goto L_0x010b
            X.JZA r0 = r9.A00
            boolean r2 = r0.A01
            r0 = 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x010d
        L_0x010b:
            r0 = 125(0x7d, float:1.75E-43)
        L_0x010d:
            r12.setImageAlpha(r0)
            java.lang.Object r0 = r13.A01
            X.UxR r0 = (X.C16574UxR) r0
            int r2 = r0.ordinal()
            r13 = 0
            r0 = r17
            if (r2 != r0) goto L_0x02d5
            X.0eM r0 = r8.A09
            android.graphics.drawable.Drawable r0 = X.JTO.A0D(r0)
        L_0x0123:
            r12.setForeground(r0)
            android.widget.TextView r12 = r8.A03
            android.content.Context r2 = r8.A00
            com.instagram.common.textwithentities.model.TextWithEntities r0 = r3.A03
            android.text.SpannableString r0 = X.C18186Vn0.A00(r2, r0)
            r12.setText(r0)
            com.instagram.common.textwithentities.model.TextWithEntities r0 = r3.A04
            android.widget.TextView r12 = r8.A04
            if (r0 == 0) goto L_0x02d0
            android.text.SpannableString r0 = X.C18186Vn0.A00(r2, r0)
            r12.setText(r0)
            r12.setVisibility(r7)
        L_0x0143:
            com.instagram.common.textwithentities.model.TextWithEntities r0 = r3.A05
            android.widget.TextView r12 = r8.A05
            if (r0 == 0) goto L_0x02cb
            android.text.SpannableString r0 = X.C18186Vn0.A00(r2, r0)
            r12.setText(r0)
            r12.setVisibility(r7)
        L_0x0153:
            X.JwC r0 = r3.A02
            if (r0 == 0) goto L_0x02c8
            java.lang.Object r14 = r0.A00
            X.Jw2 r14 = (X.C61064Jw2) r14
        L_0x015b:
            X.JZA r1 = r9.A00
            java.lang.String r0 = r1.A00
            r15 = r0
            if (r14 == 0) goto L_0x02c5
            java.lang.Object r0 = r14.A01
            X.BBV r0 = (X.BBV) r0
            if (r0 == 0) goto L_0x02c5
            java.lang.String r12 = r0.A00
        L_0x016a:
            X.WA9 r0 = new X.WA9
            r17 = r0
            r18 = r26
            r19 = r9
            r20 = r8
            r21 = r15
            r22 = r12
            r23 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23)
            if (r14 == 0) goto L_0x02c0
            boolean r12 = r3.A09
            if (r12 != 0) goto L_0x02c0
            r18 = 2131970969(0x7f134b99, float:1.9578904E38)
            r19 = 2131970971(0x7f134b9b, float:1.9578908E38)
            r20 = 2131970972(0x7f134b9c, float:1.957891E38)
            r21 = 2131970967(0x7f134b97, float:1.95789E38)
            r22 = 2131970968(0x7f134b98, float:1.9578902E38)
            r23 = 2131970970(0x7f134b9a, float:1.9578906E38)
            X.Glc r12 = new X.Glc
            r24 = r10
            r17 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            com.instagram.common.textwithentities.model.TextWithEntities r10 = r3.A03
            java.lang.String r10 = r10.A02
            X.C55145Hct.A00(r2, r12, r5, r10)
            r5.setVisibility(r7)
            boolean r14 = r1.A01
            r12 = 1065353216(0x3f800000, float:1.0)
            r10 = 1056964608(0x3f000000, float:0.5)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r14 == 0) goto L_0x01b4
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x01b4:
            r5.setAlpha(r7)
            boolean r1 = r1.A02
            r5.setToggled(r1)
            X.AnonymousClass0fU.A00(r0, r5)
            float r1 = r5.getAlpha()
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x02b8
            r4.setOnClickListener(r11)
        L_0x01ca:
            android.view.View r1 = r8.A01
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x01d2
            r16 = 8
        L_0x01d2:
            r0 = r16
            r1.setVisibility(r0)
            X.JwL r0 = r3.A00
            if (r0 == 0) goto L_0x02a1
            java.lang.Object r10 = r0.A01
            com.instagram.user.model.ProductDetailsProductItemDict r10 = (com.instagram.user.model.ProductDetailsProductItemDict) r10
            if (r10 == 0) goto L_0x02a1
            java.lang.String r1 = r10.A0a
            java.lang.String r0 = r10.A0U
            if (r1 == 0) goto L_0x02a1
            if (r0 == 0) goto L_0x02a1
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02a1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Boolean r0 = r10.A0O
            boolean r1 = X.AnonymousClass7TG.A1X(r0)
            r7 = 0
            java.lang.String r14 = r10.A0T
            java.lang.String r12 = r10.A0Z
            com.instagram.api.schemas.ProductAffiliateInformationDict r0 = r10.A03
            if (r0 == 0) goto L_0x0207
            java.lang.String r7 = r0.ApW()
        L_0x0207:
            java.lang.String r10 = " "
            if (r1 != 0) goto L_0x0211
            r0 = 2131974981(0x7f135b45, float:1.9587041E38)
            X.Dba.A0s(r2, r10, r5, r0)
        L_0x0211:
            r1 = 2131974979(0x7f135b43, float:1.9587037E38)
            com.instagram.common.textwithentities.model.TextWithEntities r0 = r3.A03
            java.lang.String r0 = r0.A02
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r14, r12}
            java.lang.String r0 = r2.getString(r1, r0)
            r5.append(r0)
            if (r7 == 0) goto L_0x0232
            r5.append(r10)
            r0 = 2131974980(0x7f135b44, float:1.958704E38)
            java.lang.String r0 = X.DbW.A0h(r2, r7, r0)
            r5.append(r0)
        L_0x0232:
            java.lang.String r0 = X.DbT.A10(r5)
        L_0x0236:
            r4.setContentDescription(r0)
            android.view.View r4 = r8.itemView
            X.0qQ.A06(r4)
            java.lang.String r7 = r9.A02
            java.lang.String r8 = r9.A03
            X.0qQ.A0B(r8, r6)
            r0 = r26
            X.Uam r1 = r0.A00
            X.Jhq r0 = X.C15337Uam.A01(r1)
            X.2Fk r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            X.0qQ.A0A(r0)
            X.ULE r0 = (X.ULE) r0
            X.Jw0 r2 = r0.A00
            java.lang.String r19 = X.C13991Tnr.A0i(r1)
            X.JwL r1 = r3.A00
            if (r1 == 0) goto L_0x029e
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            if (r0 == 0) goto L_0x029e
            com.instagram.api.schemas.ProductAffiliateInformationDict r11 = r0.A03
        L_0x026a:
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.ProductDetailsProductItemDict r0 = (com.instagram.user.model.ProductDetailsProductItemDict) r0
            if (r0 == 0) goto L_0x0272
            java.lang.String r13 = r0.A0h
        L_0x0272:
            X.Vat r5 = new X.Vat
            r14 = r5
            r15 = r2
            r16 = r11
            r17 = r7
            r18 = r8
            r20 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0 = r25
            X.2el r3 = r0.A00
            X.0gF r2 = X.C60340gF.A00
            java.lang.String r1 = "taggable_product_impression_"
            java.lang.String r0 = r5.A02
            java.lang.String r0 = X.002.A0R(r1, r0)
            X.30a r1 = X.AnonymousClass30Y.A00(r5, r2, r0)
            r0 = r25
            X.UkH r0 = r0.A01
            r1.A00(r0)
            X.C51967G9n.A0z(r4, r1, r3)
            return
        L_0x029e:
            if (r1 == 0) goto L_0x0272
            goto L_0x026a
        L_0x02a1:
            r5 = 2131974978(0x7f135b42, float:1.9587035E38)
            com.instagram.common.textwithentities.model.TextWithEntities r0 = r3.A03
            java.lang.String r1 = r0.A02
            com.instagram.common.textwithentities.model.TextWithEntities r0 = r3.A04
            if (r0 == 0) goto L_0x02b6
            java.lang.String r0 = r0.A02
        L_0x02ae:
            java.lang.String r0 = X.DbV.A0u(r2, r1, r0, r5)
            X.0qQ.A07(r0)
            goto L_0x0236
        L_0x02b6:
            r0 = 0
            goto L_0x02ae
        L_0x02b8:
            X.AnonymousClass0fU.A00(r0, r4)
            r4.setAlpha(r10)
            goto L_0x01ca
        L_0x02c0:
            X.AnonymousClass0fU.A00(r0, r4)
            goto L_0x01ca
        L_0x02c5:
            r12 = r11
            goto L_0x016a
        L_0x02c8:
            r14 = r11
            goto L_0x015b
        L_0x02cb:
            r12.setVisibility(r1)
            goto L_0x0153
        L_0x02d0:
            r12.setVisibility(r1)
            goto L_0x0143
        L_0x02d5:
            r0 = r11
            goto L_0x0123
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15791Uia.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return WST.class;
    }

    public C15791Uia(Fragment fragment, AnonymousClass0iw r2, VPD vpd, C17390VTr vTr) {
        this.A02 = vpd;
        this.A01 = r2;
        this.A00 = fragment;
        this.A03 = vTr;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new UEL(DbT.A0D(layoutInflater, viewGroup, R.layout.tagging_feed_commerce_item, false));
    }
}
