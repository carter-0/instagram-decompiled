package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;

public final class UFL extends 08m {
    public final ImmutableList A00;
    public final AnonymousClass0iw A01;
    public final C279284yO A02;
    public final C18486Vsh A03;

    public UFL(ImmutableList immutableList, AnonymousClass0iw r3, C279284yO r4, C18486Vsh vsh) {
        0qQ.A0B(immutableList, 3);
        this.A01 = r3;
        this.A03 = vsh;
        this.A00 = immutableList;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0108, code lost:
        if (r5 != r9) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010c, code lost:
        if (r5 != com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING_TEST) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010e, code lost:
        r14.A02 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0112, code lost:
        r0 = r2.A05;
        X.DbU.A15(r15, r0, 1, false);
        r0.setAdapter(r14);
        r7.addView(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0121, code lost:
        if (r7.getChildCount() != 1) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0123, code lost:
        r7.getViewTreeObserver().addOnPreDrawListener(new X.WCE(r7, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013e, code lost:
        if (r11 != false) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object instantiateItem(android.view.ViewGroup r23, int r24) {
        /*
            r22 = this;
            r6 = 0
            r7 = r23
            X.0qQ.A0B(r7, r6)
            r2 = r22
            com.google.common.collect.ImmutableList r0 = r2.A00
            r8 = r24
            java.lang.Object r5 = r0.get(r8)
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration r5 = (com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration) r5
            X.Vsh r4 = r2.A03
            r1 = 2131625310(0x7f0e055e, float:1.8877824E38)
            android.view.LayoutInflater r0 = X.DbV.A0D(r7)
            android.view.View r3 = r0.inflate(r1, r7, r6)
            r1 = 2131432257(0x7f0b1341, float:1.8486266E38)
            X.Vc1 r0 = new X.Vc1
            r0.<init>(r3)
            r3.setTag(r1, r0)
            X.0iw r11 = r2.A01
            java.lang.Object r2 = r3.getTag(r1)
            r2.getClass()
            X.Vc1 r2 = (X.C17670Vc1) r2
            r2.A00 = r8
            android.view.View r0 = r2.A01
            android.content.Context r15 = r0.getContext()
            com.instagram.model.effect.AREffect r0 = r5.A04
            java.lang.String r8 = r0.A05()
            X.6Ku r9 = r5.A02
            r1 = 1
            r0 = 2
            r10 = -1
            if (r9 == 0) goto L_0x01d2
            int r9 = r9.ordinal()
            if (r9 == r0) goto L_0x01c6
            r0 = 4
            if (r9 == r0) goto L_0x01c6
            r0 = 3
            if (r9 != r0) goto L_0x01d2
            r0 = 2131958452(0x7f131ab4, float:1.9553517E38)
            java.lang.String r8 = r15.getString(r0)
            r12 = 2131237320(0x7f0819c8, float:1.8090887E38)
        L_0x0060:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r13 = r5.A01
            if (r13 != 0) goto L_0x0066
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r13 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.NORMAL
        L_0x0066:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r9 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING
            if (r13 == r9) goto L_0x006e
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r0 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING_TEST
            if (r13 != r0) goto L_0x0078
        L_0x006e:
            com.instagram.model.shopping.ProductAREffectContainer r13 = r5.A05
            if (r13 == 0) goto L_0x0078
            boolean r0 = r13.A01
            if (r0 == 0) goto L_0x01aa
            java.lang.String r8 = ""
        L_0x0078:
            if (r12 == r10) goto L_0x0160
            android.graphics.drawable.Drawable r10 = r15.getDrawable(r12)
            if (r10 == 0) goto L_0x0085
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.A06
            r0.setImageDrawable(r10)
        L_0x0085:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.A06
            r0.setVisibility(r6)
            if (r8 == 0) goto L_0x0091
            android.widget.TextView r0 = r2.A04
            r0.setText(r8)
        L_0x0091:
            java.lang.String r10 = r5.A06
            android.content.res.Resources r8 = r15.getResources()
            r0 = 2131961545(0x7f1326c9, float:1.955979E38)
            android.text.Spanned r8 = X.DbU.A07(r8, r10, r0)
            android.widget.TextView r0 = r2.A02
            r0.setText(r8)
            X.WBG.A01(r0, r1, r5, r4)
            java.lang.String r12 = r5.A09
            com.instagram.model.effect.AREffect r0 = r5.A04
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x00be
            com.instagram.model.shopping.ProductAREffectContainer r0 = r5.A05
            if (r0 == 0) goto L_0x015d
            com.instagram.api.schemas.DynamicEffectState r8 = com.instagram.api.schemas.DynamicEffectState.TEST
            com.instagram.model.shopping.ProductItemWithAR r0 = r0.A00
            com.instagram.model.shopping.ProductArEffectMetadata r0 = r0.A00
            com.instagram.api.schemas.DynamicEffectState r0 = r0.A01
            if (r8 != r0) goto L_0x015d
        L_0x00be:
            r0 = 1
        L_0x00bf:
            boolean r11 = r5.A0A
            r10 = 8
            android.widget.TextView r8 = r2.A03
            if (r12 == 0) goto L_0x0133
            if (r11 != 0) goto L_0x0145
            r8.setText(r12)
            r8.setVisibility(r6)
        L_0x00cf:
            com.instagram.igds.components.banner.IgdsBanner r0 = r2.A07
            r0.setVisibility(r10)
        L_0x00d4:
            com.instagram.model.effect.AREffect r0 = r5.A04
            java.lang.String r8 = r0.A02()
            java.lang.String r0 = "25025320"
            boolean r21 = X.2PP.A00(r0, r8)
            com.instagram.common.session.UserSession r10 = r4.A00
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration r0 = r4.A01
            int r8 = r0.A00
            com.instagram.model.effect.AREffect r0 = r5.A04
            java.util.List r18 = r0.A0A()
            r18.getClass()
            com.instagram.model.effect.AREffect r0 = r5.A04
            java.util.List r19 = r0.A0B()
            X.UAO r14 = new X.UAO
            r20 = r8
            r17 = r5
            r16 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            X.WPf r0 = r4.A03
            r14.A01 = r0
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r5 = r5.A01
            if (r5 == 0) goto L_0x0130
            if (r5 == r9) goto L_0x010e
        L_0x010a:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r0 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.SHOPPING_TEST
            if (r5 != r0) goto L_0x0112
        L_0x010e:
            X.WPf r0 = r4.A04
            r14.A02 = r0
        L_0x0112:
            androidx.recyclerview.widget.RecyclerView r0 = r2.A05
            X.DbU.A15(r15, r0, r1, r6)
            r0.setAdapter(r14)
            r7.addView(r3)
            int r0 = r7.getChildCount()
            if (r0 != r1) goto L_0x012f
            android.view.ViewTreeObserver r2 = r7.getViewTreeObserver()
            X.WCE r0 = new X.WCE
            r0.<init>(r7, r1)
            r2.addOnPreDrawListener(r0)
        L_0x012f:
            return r3
        L_0x0130:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r5 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.NORMAL
            goto L_0x010a
        L_0x0133:
            if (r0 == 0) goto L_0x0141
            r0 = 2131975075(0x7f135ba3, float:1.9587232E38)
            r8.setText(r0)
            r8.setVisibility(r6)
        L_0x013e:
            if (r11 == 0) goto L_0x00cf
            goto L_0x0148
        L_0x0141:
            r8.setVisibility(r10)
            goto L_0x013e
        L_0x0145:
            r8.setVisibility(r10)
        L_0x0148:
            com.instagram.igds.components.banner.IgdsBanner r8 = r2.A07
            r8.setVisibility(r6)
            int r0 = X.DbV.A01(r15)
            r8.setBodyColor(r0)
            X.FcH r0 = new X.FcH
            r0.<init>(r1, r15, r4)
            r8.A00 = r0
            goto L_0x00d4
        L_0x015d:
            r0 = 0
            goto L_0x00bf
        L_0x0160:
            com.instagram.model.shopping.ProductAREffectContainer r0 = r5.A05
            if (r0 == 0) goto L_0x019f
            com.instagram.model.shopping.ProductItemWithAR r0 = r0.A00
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            com.instagram.model.mediasize.ImageInfo r0 = r0.A08
            if (r0 == 0) goto L_0x019f
            com.instagram.model.shopping.ProductAREffectContainer r0 = r5.A05
            com.instagram.model.shopping.ProductItemWithAR r0 = r0.A00
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            com.instagram.model.mediasize.ImageInfo r0 = r0.A08
            X.0qQ.A0B(r0, r6)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A03(r0)
            if (r0 == 0) goto L_0x019f
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r2.A06
            com.instagram.model.shopping.ProductAREffectContainer r0 = r5.A05
            com.instagram.model.shopping.ProductItemWithAR r0 = r0.A00
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            com.instagram.model.mediasize.ImageInfo r0 = r0.A08
            X.0qQ.A0B(r0, r6)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A03(r0)
        L_0x019a:
            r10.setUrl(r0, r11)
            goto L_0x0085
        L_0x019f:
            com.instagram.model.effect.AREffect r0 = r5.A04
            com.instagram.common.typedurl.ImageUrl r0 = r0.A01()
            if (r0 == 0) goto L_0x0085
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r2.A06
            goto L_0x019a
        L_0x01aa:
            com.instagram.common.session.UserSession r14 = r4.A00
            com.instagram.model.shopping.ProductItemWithAR r13 = r13.A00
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration r0 = r4.A01
            boolean r8 = r0.A05
            X.0qQ.A0B(r14, r6)
            X.0qQ.A0B(r13, r1)
            com.instagram.user.model.ProductDetailsProductItemDictIntf r0 = r13.BgJ()
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            java.lang.String r8 = X.C16910VAn.A00(r0, r8)
            goto L_0x0078
        L_0x01c6:
            r0 = 2131958453(0x7f131ab5, float:1.9553519E38)
            java.lang.String r8 = r15.getString(r0)
            r12 = 2131240042(0x7f08246a, float:1.8096408E38)
            goto L_0x0060
        L_0x01d2:
            r12 = -1
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFL.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        DbY.A1S(viewGroup, obj);
        viewGroup.removeView((View) obj);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        AnonymousClass7TG.A1N(view, obj);
        return AnonymousClass7TF.A1W(view, obj);
    }
}
