package X;

import android.content.Context;
import android.graphics.PointF;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;

/* renamed from: X.KaG  reason: case insensitive filesystem */
public final class C62109KaG extends C60046JeE implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "ProductTagView";
    public PointF A00;
    public ViewGroup A01;
    public ImageView A02;
    public ImageView A03;
    public TightTextView A04;
    public 1Xj A05;
    public ImageInfo A06;
    public ImageInfo A07;
    public boolean A08;
    public String A09;
    public final C258103yT A0A;
    public final UserSession A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final 1Ng A0E;

    public String getModuleName() {
        return "product_tag_view";
    }

    public FrameLayout.LayoutParams getThumbnailParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        Context context = getContext();
        DbT.A1B(context.getResources(), layoutParams, R.dimen.abc_dropdownitem_icon_width);
        layoutParams.width = AnonymousClass7TF.A02(context, R.dimen.abc_dropdownitem_icon_width);
        return layoutParams;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r1v9, types: [com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r12v0, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r7v5, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r9v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62109KaG(android.content.Context r23, android.graphics.PointF r24, com.instagram.common.session.UserSession r25, X.1Xj r26, com.instagram.model.mediasize.ImageInfo r27, com.instagram.model.mediasize.ImageInfo r28, java.lang.Boolean r29, java.lang.Boolean r30, boolean r31) {
        /*
            r22 = this;
            r15 = r22
            r0 = r23
            r15.<init>(r0)
            r1 = r25
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r1)
            r15.A0E = r0
            r15.A0B = r1
            r0 = r26
            r15.A05 = r0
            r0 = r31
            r15.A08 = r0
            r0 = r24
            r15.A00 = r0
            X.3yT r0 = new X.3yT
            r0.<init>(r1)
            r15.A0A = r0
            r0 = r29
            r15.A0C = r0
            r0 = r30
            r15.A0D = r0
            r0 = r27
            r15.A06 = r0
            r0 = r28
            r15.A07 = r0
            android.content.Context r3 = r15.getContext()
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r3)
            r15.A01 = r2
            com.instagram.common.session.UserSession r13 = r15.A0B
            X.1Xj r1 = r15.A05
            boolean r0 = r15.A08
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C64178LSg.A00(r2, r13, r1, r0)
            com.instagram.model.mediasize.ImageInfo r6 = r15.A06
            if (r6 == 0) goto L_0x0059
            int r1 = X.AnonymousClass7TG.A05(r3)
            android.view.ViewGroup r0 = r15.A01
            r0.setPadding(r1, r1, r1, r1)
        L_0x0059:
            com.instagram.common.ui.text.TightTextView r0 = new com.instagram.common.ui.text.TightTextView
            r0.<init>(r3)
            r15.A04 = r0
            r0 = 0
            if (r6 == 0) goto L_0x01d1
            int r7 = X.JTR.A07(r3)
            int r1 = X.JTR.A05(r3)
            int r7 = r7 + r1
        L_0x006c:
            com.instagram.common.ui.text.TightTextView r4 = r15.A04
            android.view.ViewGroup r1 = r15.A01
            int r2 = r1.getPaddingLeft()
            int r1 = r7 / 2
            int r2 = r2 + r1
            java.lang.Boolean r1 = r15.A0C
            boolean r1 = r1.booleanValue()
            X.C64178LSg.A03(r4, r2, r1)
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r3)
            r15.A03 = r2
            r1 = 1
            X.C64178LSg.A01(r2, r1)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r3)
            r15.A02 = r1
            X.C64178LSg.A01(r1, r0)
            r4 = -2
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r4, r4)
            r1 = 16
            r5.gravity = r1
            r5.leftMargin = r7
            android.view.ViewGroup r2 = r15.A01
            com.instagram.common.ui.text.TightTextView r1 = r15.A04
            r2.addView(r1, r5)
            if (r6 == 0) goto L_0x013b
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r7 = r15.A02(r6)
            com.instagram.model.mediasize.ImageInfo r1 = r15.A07
            if (r1 == 0) goto L_0x01c6
            r10 = 1000(0x3e8, float:1.401E-42)
            r5 = 1001(0x3e9, float:1.403E-42)
            r2 = 1002(0x3ea, float:1.404E-42)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r9 = r15.A02(r1)
            r1 = 2130970259(0x7f040693, float:1.7549223E38)
            int r1 = X.AnonymousClass7TF.A03(r3, r1)
            r9.setStrokeColor(r1)
            r7.setId(r5)
            r9.setId(r2)
            X.2dQ r8 = r15.getStackedThumbnailParams()
            X.2dQ r5 = r15.getStackedThumbnailParams()
            androidx.constraintlayout.widget.ConstraintLayout r6 = new androidx.constraintlayout.widget.ConstraintLayout
            r6.<init>(r3)
            r6.setId(r10)
            int r2 = X.JTR.A07(r3)
            X.2dQ r1 = new X.2dQ
            r1.<init>(r2, r2)
            r6.setLayoutParams(r1)
            r6.addView(r9, r5)
            r6.addView(r7, r8)
            android.view.ViewGroup r1 = r15.A01
            r1.addView(r6)
            X.4gb r5 = new X.4gb
            r5.<init>()
            int r21 = X.AnonymousClass7TG.A03(r3)
            r5.A0I(r6)
            int r8 = r9.getId()
            r2 = 1
            int r1 = r6.getId()
            r5.A0D(r8, r2, r1, r2)
            int r8 = r9.getId()
            r2 = 3
            int r1 = r6.getId()
            r5.A0D(r8, r2, r1, r2)
            int r17 = r7.getId()
            r18 = 1
            int r19 = r6.getId()
            r16 = r5
            r20 = r18
            r16.A0E(r17, r18, r19, r20, r21)
            int r8 = r7.getId()
            int r10 = r6.getId()
            r7 = r5
            r9 = r2
            r11 = r2
            r12 = r21
            r7.A0E(r8, r9, r10, r11, r12)
            r5.A0G(r6)
        L_0x013b:
            X.3yT r1 = r15.A0A
            r1.A00(r3)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r4, r4)
            android.view.ViewGroup r1 = r15.A01
            r15.addView(r1, r2)
            java.lang.Boolean r1 = r15.A0D
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x019e
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>(r2, r1)
            int r16 = X.AnonymousClass7TG.A05(r3)
            android.view.ViewGroup r9 = r15.A01
            com.instagram.common.ui.text.TightTextView r12 = r15.A04
            android.widget.ImageView r10 = r15.A03
            android.widget.ImageView r11 = r15.A02
            X.1Xj r14 = r15.A05
            X.LPG r7 = new X.LPG
            r17 = r16
            r18 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0171:
            r15.A02 = r7
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314871905651563(0x81042f00000b6b, double:3.029009449161561E-306)
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x019b
            java.lang.Object r0 = r15.getTag()
            com.instagram.tagging.model.Tag r0 = (com.instagram.tagging.model.Tag) r0
            X.3Ds r4 = X.C238863Ds.PRODUCT_TAG
            r3 = 0
            if (r0 == 0) goto L_0x019c
            java.lang.String r2 = r0.getId()
        L_0x018f:
            X.3Dp r1 = X.C238833Dp.A00(r13)
            X.3Dt r0 = new X.3Dt
            r0.<init>(r3, r4, r3, r2)
            r1.A08(r15, r0)
        L_0x019b:
            return
        L_0x019c:
            r2 = 0
            goto L_0x018f
        L_0x019e:
            android.widget.ImageView r1 = r15.A03
            r15.addView(r1, r2)
            android.widget.ImageView r1 = r15.A02
            r15.addView(r1, r2)
            android.view.ViewGroup r6 = r15.A01
            com.instagram.common.ui.text.TightTextView r5 = r15.A04
            android.widget.ImageView r4 = r15.A03
            android.widget.ImageView r3 = r15.A02
            android.graphics.PointF r2 = r15.A00
            X.1Xj r1 = r15.A05
            X.LPG r7 = new X.LPG
            r8 = r2
            r9 = r6
            r10 = r4
            r11 = r3
            r12 = r5
            r14 = r1
            r16 = r0
            r17 = r0
            r18 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0171
        L_0x01c6:
            android.widget.FrameLayout$LayoutParams r2 = r15.getThumbnailParams()
            android.view.ViewGroup r1 = r15.A01
            r1.addView(r7, r2)
            goto L_0x013b
        L_0x01d1:
            r7 = 0
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62109KaG.<init>(android.content.Context, android.graphics.PointF, com.instagram.common.session.UserSession, X.1Xj, com.instagram.model.mediasize.ImageInfo, com.instagram.model.mediasize.ImageInfo, java.lang.Boolean, java.lang.Boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public CharSequence getText() {
        return this.A04.getText();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public 0rN getTextLayoutParams() {
        return C60046JeE.A00(Layout.Alignment.ALIGN_NORMAL, this.A04);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    public int getTextLineHeight() {
        return this.A04.getLineHeight();
    }

    private RoundedCornerImageView A02(ImageInfo imageInfo) {
        Context context = getContext();
        IgImageView roundedCornerImageView = new RoundedCornerImageView(context);
        roundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        roundedCornerImageView.setStrokeEnabled(true);
        roundedCornerImageView.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top));
        roundedCornerImageView.setRadius((float) AnonymousClass7TG.A03(context));
        roundedCornerImageView.setStrokeColor(context.getColor(R.color.bright_foreground_disabled_material_dark));
        ExtendedImageUrl A042 = 1iI.A04(imageInfo, AnonymousClass05K.A0C);
        if (A042 != null) {
            roundedCornerImageView.setUrl(A042, this);
            roundedCornerImageView.setVisibility(0);
        }
        return roundedCornerImageView;
    }

    public C71492dQ getStackedThumbnailParams() {
        int dimensionPixelSize = DbU.A05(this).getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        return new C71492dQ(dimensionPixelSize, dimensionPixelSize);
    }

    public String getTaggedId() {
        return ((Tag) DbT.A0o(this)).getId();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        String str2;
        int A052 = AnonymousClass0fD.A05(1407789811);
        if (motionEvent.getAction() == 1) {
            ProductTag productTag = (ProductTag) DbT.A0o(this);
            1Xj media = getMedia();
            media.getClass();
            if (this.A07 != null) {
                1Ng r4 = this.A0E;
                int i = this.A00;
                Product A0q = JTO.A0q(productTag);
                String str3 = this.A09;
                AnonymousClass3W1 r3 = this.A01;
                if (r3 != null) {
                    str2 = r3.A1W;
                } else {
                    str2 = null;
                }
                r4.A00(new C240213Ka(media, A0q, true, str3, str2, i));
            } else {
                AnonymousClass3W1 r5 = this.A01;
                if (r5 != null) {
                    r5.A07(this.A00, -1).A04 = true;
                }
                C55951HqF hqF = new C55951HqF(C238863Ds.PRODUCT_TAG);
                hqF.A02 = productTag.getId();
                C238833Dp.A00(this.A0B).A09(this, hqF.A00(), new String[0], 1);
                1Ng r42 = this.A0E;
                int i2 = this.A00;
                Product A0q2 = JTO.A0q(productTag);
                String str4 = this.A09;
                AnonymousClass3W1 r32 = this.A01;
                if (r32 != null) {
                    str = r32.A1W;
                } else {
                    str = null;
                }
                r42.A00(new C240213Ka(media, A0q2, false, str4, str, i2));
            }
            UserSession userSession = this.A0B;
            if (VKH.A00.A04(userSession, media)) {
                AnonymousClass3KE.A00();
                AnonymousClass3KD.A00(getContext(), userSession, media.A1e(userSession), new C65672Lxn(), "tags");
            } else {
                AnonymousClass3KD.A05.put(media.A1e(userSession).A2n(), (Object) null);
            }
        }
        AnonymousClass0fD.A0C(-279989494, A052);
        return true;
    }

    public void setPriorModule(String str) {
        this.A09 = str;
    }
}
