package com.instagram.ui.widget.stackedavatar;

import X.AnonymousClass0iw;
import X.AnonymousClass37O;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C253833rU;
import X.C71382cm;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbY;
import X.WTN;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public class StackedAvatarView extends IgFrameLayout {
    public int A00;
    public int A01 = -1;
    public CircularImageView A02;
    public int A03;
    public int A04 = -1;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public CircularImageView A08;
    public boolean A09;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    private void A00() {
        this.A02.getLayoutParams().width = this.A03;
        this.A02.getLayoutParams().height = this.A03;
        this.A08.getLayoutParams().width = this.A03;
        this.A08.getLayoutParams().height = this.A03;
    }

    private void A01() {
        int i = this.A03 + (this.A00 * 2);
        this.A06.getLayoutParams().width = i;
        this.A06.getLayoutParams().height = i;
        this.A05.getLayoutParams().width = i;
        this.A05.getLayoutParams().height = i;
    }

    private void A02(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A2D);
        try {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
            this.A03 = dimensionPixelSize;
            if (obtainStyledAttributes.hasValue(0)) {
                this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, this.A03);
            }
            if (obtainStyledAttributes.hasValue(2)) {
                this.A04 = obtainStyledAttributes.getDimensionPixelSize(2, DbY.A01(context));
            }
            if (obtainStyledAttributes.hasValue(3)) {
                this.A01 = obtainStyledAttributes.getDimensionPixelSize(3, DbY.A01(context));
            }
            this.A09 = obtainStyledAttributes.getBoolean(5, true);
            View inflate = DbV.A0D(this).inflate(R.layout.stacked_avatar, this, true);
            this.A02 = DbU.A0X(inflate, R.id.avatar_front);
            this.A08 = DbU.A0X(inflate, R.id.avatar_back);
            this.A06 = inflate.requireViewById(R.id.avatar_front_background);
            this.A05 = inflate.requireViewById(R.id.avatar_back_background);
            this.A07 = DbU.A0C(inflate, R.id.avatar_front_container);
            if (!(this.A03 == dimensionPixelSize && this.A04 == -1 && this.A01 == -1)) {
                A00();
                A03(true);
                this.A00 = obtainStyledAttributes.getDimensionPixelSize(1, AnonymousClass7TG.A04(context));
                A01();
            }
            View view = this.A05;
            int i = 0;
            if (!obtainStyledAttributes.getBoolean(4, false)) {
                i = 8;
            }
            view.setVisibility(i);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    private void A03(boolean z) {
        int i;
        int i2;
        this.A08.setVisibility(DbW.A01(z ? 1 : 0));
        int i3 = this.A01;
        if (i3 != -1) {
            i = 0;
        } else if (z) {
            int i4 = this.A04;
            if (i4 == -1) {
                Resources resources = getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                i4 = (int) Math.floor((double) ((dimensionPixelSize * this.A03) / resources.getDimensionPixelSize(R.dimen.abc_star_medium)));
            }
            i2 = i4;
            i = 0;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A07.getLayoutParams());
            marginLayoutParams.setMargins(i4, i2, 0, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = i;
            this.A07.setLayoutParams(layoutParams);
        } else {
            i = 17;
            i3 = 0;
        }
        i2 = 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(this.A07.getLayoutParams());
        marginLayoutParams2.setMargins(i4, i2, 0, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(marginLayoutParams2);
        layoutParams2.gravity = i;
        this.A07.setLayoutParams(layoutParams2);
    }

    public void setBackAvatarDrawable(Drawable drawable) {
        IgImageView igImageView = this.A08;
        if (drawable != null) {
            igImageView.setImageDrawable(drawable);
        } else {
            igImageView.A09();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public void setColorFilterOnFrontIcon(ColorFilter colorFilter) {
        if (this.A02.getDrawable() != null) {
            AnonymousClass7TG.A10(colorFilter, this.A02.getDrawable());
        }
        this.A02.A0E = new WTN(4, colorFilter, this);
    }

    public void setFrontAvatarDrawable(Drawable drawable) {
        IgImageView igImageView = this.A02;
        if (drawable != null) {
            igImageView.setImageDrawable(drawable);
        } else {
            igImageView.A09();
        }
    }

    public StackedAvatarView(Context context) {
        super(context);
        A02(context, (AttributeSet) null);
    }

    public final void A04(Context context, int i) {
        this.A03 = AnonymousClass7TF.A02(context, i);
        A00();
        A01();
    }

    public void setBackAvatarUrl(ImageUrl imageUrl, AnonymousClass0iw r3) {
        boolean z;
        if (!C253833rU.A02(imageUrl)) {
            this.A08.setUrl(imageUrl, r3);
            z = true;
        } else {
            this.A08.A09();
            z = this.A09;
        }
        A03(z);
    }

    public void setRingColor(int i) {
        ColorFilter A002 = AnonymousClass37O.A00(i);
        Drawable background = this.A06.getBackground();
        background.getClass();
        background.setColorFilter(A002);
        Drawable background2 = this.A05.getBackground();
        background2.getClass();
        background2.setColorFilter(A002);
    }

    public void setUrls(ImageUrl imageUrl, ImageUrl imageUrl2, AnonymousClass0iw r5) {
        boolean z;
        if (!C253833rU.A02(imageUrl)) {
            this.A02.setUrl(imageUrl, r5);
        } else {
            this.A02.A09();
        }
        boolean A022 = C253833rU.A02(imageUrl2);
        CircularImageView circularImageView = this.A08;
        if (!A022) {
            circularImageView.setUrl(imageUrl2, r5);
            z = true;
        } else {
            circularImageView.A09();
            z = this.A09;
        }
        A03(z);
    }

    public void setBorderSize(int i) {
        this.A00 = i;
    }

    public void setHorizontalAvatarOffset(int i) {
        this.A01 = i;
    }

    public StackedAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(context, attributeSet);
    }

    public StackedAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }
}
