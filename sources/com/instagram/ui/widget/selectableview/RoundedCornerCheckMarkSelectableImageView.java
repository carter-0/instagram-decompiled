package com.instagram.ui.widget.selectableview;

import X.2Yu;
import X.2cs;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.C47274Du2;
import X.C61340me;
import X.C71382cm;
import X.C71392co;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.List;

public class RoundedCornerCheckMarkSelectableImageView extends FrameLayout {
    public static final C71392co A07 = C71392co.A04(250.0d, 16.0d);
    public static final C71392co A08 = C71392co.A04(40.0d, 9.0d);
    public ImageView A00;
    public boolean A01 = false;
    public int A02;
    public ImageView A03;
    public 2cs A04;
    public RoundedCornerMediaFrameLayout A05;
    public final List A06;

    private void A01(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A21);
        if (!obtainStyledAttributes.hasValue(2) || !obtainStyledAttributes.hasValue(1)) {
            throw AnonymousClass7TE.A15("Width and height required");
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) LayoutInflater.from(context2).inflate(R.layout.rounded_corner_check_mark_selectable_image_view, this, false);
        this.A05 = roundedCornerMediaFrameLayout;
        if (dimensionPixelSize != 0) {
            roundedCornerMediaFrameLayout.getLayoutParams().width = dimensionPixelSize;
            this.A05.getLayoutParams().height = dimensionPixelSize2;
        }
        this.A05.setRadius(this.A02);
        this.A06.add(this.A05.findViewById(R.id.selectable_image));
        ImageView A0F = DbU.A0F(this.A05, R.id.select_check_mark);
        this.A00 = A0F;
        DbX.A12(context2, A0F, R.color.design_dark_default_color_on_background);
        this.A03 = DbU.A0F(this.A05, R.id.type_icon);
        addView(this.A05);
    }

    public final void A02() {
        List list = this.A06;
        ((ImageView) list.get(0)).setImageDrawable((Drawable) null);
        ((View) list.get(0)).setBackgroundResource(2Yu.A0H(getContext(), R.attr.elevatedImagePlaceholderColor));
    }

    public int getDisabledAlpha() {
        return 0;
    }

    public List getImageViews() {
        return this.A06;
    }

    public ImageView getOverlayImage() {
        return this.A00;
    }

    public void setImageDrawable(Drawable drawable) {
        ((ImageView) AnonymousClass7TE.A13(this.A06)).setImageDrawable(drawable);
    }

    public void setSelected(boolean z) {
        ColorFilter colorFilter;
        for (ImageView imageView : this.A06) {
            if (z) {
                colorFilter = getColorFilter();
            } else {
                colorFilter = null;
            }
            imageView.setColorFilter(colorFilter);
        }
        ImageView imageView2 = this.A00;
        if (imageView2 != null) {
            imageView2.setVisibility(DbW.A01(z ? 1 : 0));
        }
        invalidate();
        requestLayout();
    }

    public void setTypeIconDrawable(Drawable drawable) {
        ImageView imageView;
        int i;
        if (drawable != null) {
            this.A03.setImageDrawable(drawable);
            imageView = this.A03;
            i = 0;
        } else {
            imageView = this.A03;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setUrl(ImageUrl imageUrl, AnonymousClass0iw r3) {
        ((IgImageView) AnonymousClass7TE.A13(this.A06)).setUrl(imageUrl, r3);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context) {
        super(context);
        A00();
        this.A06 = AnonymousClass7TE.A1C();
        A01(context, (AttributeSet) null);
    }

    private void A00() {
        2cs A022 = C61340me.A00().A02();
        A022.A00 = 0.01d;
        A022.A0A(new C47274Du2(this));
        this.A04 = A022;
    }

    public ColorFilter getColorFilter() {
        return DbV.A06(getContext(), R.color.black_60_transparent);
    }

    public void setPressed(boolean z) {
        double d;
        super.setPressed(z);
        if (this.A01) {
            2cs r2 = this.A04;
            if (z) {
                r2.A09(A07);
                d = 1.0d;
            } else {
                r2.A09(A08);
                d = 0.0d;
            }
            r2.A06(d);
        }
    }

    public void setAnimatePress(boolean z) {
        this.A01 = z;
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A06 = AnonymousClass7TE.A1C();
        A01(context, attributeSet);
    }

    public RoundedCornerCheckMarkSelectableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A06 = AnonymousClass7TE.A1C();
        A01(context, attributeSet);
    }
}
