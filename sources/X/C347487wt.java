package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7wt  reason: invalid class name and case insensitive filesystem */
public final class C347487wt extends ConstraintLayout {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Drawable A04;
    public final IgTextView A05 = findViewById(R.id.dial_ar_effect_subtitle);
    public final IgTextView A06 = findViewById(R.id.dial_ar_effect_title);
    public final IgImageView A07 = findViewById(R.id.dial_ar_effect_bookmark);
    public final IgImageView A08 = findViewById(R.id.dial_ar_effect_close);
    public final C347477ws A09;
    public final boolean A0A;
    public final ColorFilter A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C347487wt(Context context, C347477ws r5, boolean z) {
        super(context);
        0qQ.A0B(context, 1);
        this.A09 = r5;
        this.A0A = z;
        Drawable drawable = context.getResources().getDrawable(R.drawable.dial_ar_effect_footer_background, context.getTheme());
        this.A04 = drawable;
        this.A0B = AnonymousClass37O.A00(context.getColor(2Yu.A0H(context, R.attr.igds_color_secondary_icon)));
        View.inflate(context, R.layout.dial_ar_effect_footer, this);
        setBookmarkIcon(false);
        A00(this);
        IgImageView igImageView = this.A07;
        AnonymousClass3NG r1 = new AnonymousClass3NG(igImageView);
        r1.A01(igImageView);
        r1.A04 = new C347527wx(this);
        r1.A00();
        if (!z && drawable != null) {
            drawable.setAlpha(150);
        }
        setBackground(drawable);
        setVisibility(8);
    }

    public void setComponentMaxWidth(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r1 == 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r4.length() == 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 == 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentTitle(X.C342507oi r8) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.setAlpha(r0)
            boolean r0 = r7.A02
            r5 = 8
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x001a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x001c
        L_0x001a:
            r0 = 8
        L_0x001c:
            r7.setVisibility(r0)
            boolean r0 = r8.A04
            r7.A00 = r0
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x0032
            int r1 = r0.length()
            r0 = 1
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r7.A03 = r0
            com.instagram.common.ui.base.IgTextView r6 = r7.A06
            java.lang.String r4 = r8.A01
            if (r4 == 0) goto L_0x0042
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x0044
        L_0x0042:
            r0 = 8
        L_0x0044:
            r6.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r7.A07
            boolean r1 = r7.A03
            r2 = 4
            r0 = 4
            if (r1 == 0) goto L_0x0050
            r0 = 0
        L_0x0050:
            r3.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r7.A08
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x005a
            r2 = 0
        L_0x005a:
            r1.setVisibility(r2)
            r6.setText(r4)
            com.instagram.common.ui.base.IgTextView r2 = r7.A05
            if (r4 == 0) goto L_0x0075
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L_0x0075
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0075
            r5 = 0
        L_0x0075:
            r2.setVisibility(r5)
            java.lang.String r0 = r8.A00
            r2.setText(r0)
            boolean r1 = r8.A02
            boolean r0 = r8.A03
            if (r1 == 0) goto L_0x008c
            r7.setBookmarkIconExpanded(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r2.setTextSize(r0)
            return
        L_0x008c:
            r7.setBookmarkIcon(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r0)
            android.graphics.drawable.Drawable r0 = r7.A04
            r7.setBackground(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347487wt.setCurrentTitle(X.7oi):void");
    }

    public final void A0D() {
        setAlpha(1.0f);
        setVisibility(0);
        this.A06.setVisibility(8);
        this.A07.setVisibility(4);
        this.A08.setVisibility(4);
        IgTextView igTextView = this.A05;
        igTextView.setVisibility(0);
        igTextView.setText((CharSequence) null);
    }

    public final void A0E() {
        this.A06.setTextSize(16.0f);
        this.A05.setTextSize(14.0f);
        setBackground((Drawable) null);
        this.A01 = true;
        Resources resources = getResources();
        Drawable drawable = resources.getDrawable(R.drawable.instagram_effect_page_pano_outline_24);
        Context context = getContext();
        drawable.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A0H(context, R.attr.igds_color_icon_on_color))));
        IgImageView igImageView = this.A08;
        igImageView.setImageDrawable(drawable);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        igImageView.setOnClickListener(new AnonymousClass90D(this));
    }

    public void setGroupAlpha(float f) {
        if (this.A06.getVisibility() == 0) {
            int i = 0;
            if (f == 0.0f || this.A02) {
                i = 8;
            }
            setVisibility(i);
            setAlpha(f);
        }
    }

    public static final void A00(C347487wt r4) {
        Resources resources = r4.getResources();
        Drawable drawable = resources.getDrawable(R.drawable.instagram_circle_x_outline_16);
        drawable.mutate().setColorFilter(r4.A0B);
        IgImageView igImageView = r4.A08;
        igImageView.setImageDrawable(drawable);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        igImageView.setOnClickListener(new C347517ww(r4));
    }

    public final void A0F() {
        A0D();
        this.A05.setText(getContext().getString(2131973029));
    }

    public void setBookmarkIcon(boolean z) {
        Resources resources = getResources();
        int i = R.drawable.instagram_save_pano_outline_16;
        if (z) {
            i = R.drawable.instagram_save_pano_filled_16;
        }
        Drawable drawable = resources.getDrawable(i);
        drawable.mutate().setColorFilter(this.A0B);
        IgImageView igImageView = this.A07;
        igImageView.setImageDrawable(drawable);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        Context context = getContext();
        int i2 = 2131952378;
        if (z) {
            i2 = 2131972032;
        }
        igImageView.setContentDescription(02K.A01(context).getString(i2));
    }

    public void setBookmarkIconExpanded(boolean z) {
        Resources resources = getResources();
        int i = R.drawable.instagram_save_pano_outline_24;
        if (z) {
            i = R.drawable.instagram_save_pano_filled_24;
        }
        Drawable drawable = resources.getDrawable(i);
        Context context = getContext();
        drawable.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A0H(context, R.attr.igds_color_icon_on_color))));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        IgImageView igImageView = this.A07;
        igImageView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        igImageView.setImageDrawable(drawable);
    }

    public void setHorizontalMargin(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -1;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            int dimension = (int) getContext().getResources().getDimension(R.dimen.abc_button_padding_horizontal_material);
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, dimension, i, dimension);
        }
        setLayoutParams(layoutParams);
    }

    public void setIsHidden(boolean z) {
        this.A02 = z;
    }
}
