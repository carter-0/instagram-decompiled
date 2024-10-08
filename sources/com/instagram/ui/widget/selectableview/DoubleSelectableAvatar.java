package com.instagram.ui.widget.selectableview;

import X.0nA;
import X.0qQ;
import X.AnonymousClass7TG;
import X.C46719Djq;
import X.C52792Gcj;
import X.C71382cm;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbX;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public class DoubleSelectableAvatar extends C46719Djq {
    public int A00;
    public ImageView A01;
    public CircularImageView A02;
    public CircularImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DoubleSelectableAvatar(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v21, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v23, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v25, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v27, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    private void A00(Context context, AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0S);
        Context context2 = getContext();
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        this.A00 = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(0)) {
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            z = obtainStyledAttributes.getBoolean(1, true);
        } else {
            z = true;
        }
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.selectable_avatar_double, this, true);
        this.A03 = DbU.A0X(inflate, R.id.selectable_avatar_front);
        this.A02 = DbU.A0X(inflate, R.id.selectable_avatar_back);
        ImageView A0F = DbU.A0F(inflate, R.id.select_check_mark);
        this.A01 = A0F;
        DbX.A12(context2, A0F, R.color.design_dark_default_color_on_background);
        if (this.A00 != dimensionPixelSize) {
            this.A00 = (int) Math.floor((double) ((this.A00 * dimensionPixelSize) / context2.getResources().getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height)));
            this.A03.getLayoutParams().width = this.A00;
            this.A03.getLayoutParams().height = this.A00;
            this.A02.getLayoutParams().width = this.A00;
            this.A02.getLayoutParams().height = this.A00;
            View requireViewById = inflate.requireViewById(R.id.selectable_avatar_front_container);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            RectF rectF = 0nA.A01;
            int floor = (int) Math.floor((double) ((((int) TypedValue.applyDimension(1, 10.0f, displayMetrics)) * this.A00) / dimensionPixelSize));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(requireViewById.getLayoutParams());
            marginLayoutParams.setMargins(floor, floor, 0, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 0;
            requireViewById.setLayoutParams(layoutParams);
            View requireViewById2 = inflate.requireViewById(R.id.selectable_avatar_front_background);
            int A04 = this.A00 + (AnonymousClass7TG.A04(context2) * 2);
            requireViewById2.getLayoutParams().width = A04;
            requireViewById2.getLayoutParams().height = A04;
        }
        ViewGroup.MarginLayoutParams A0D = DbS.A0D(this.A02);
        if (z) {
            int A042 = AnonymousClass7TG.A04(context2);
            A0D.setMargins(A042, A042, 0, 0);
        } else {
            this.A01 = 0;
            A0D.setMargins(0, 0, 0, 0);
        }
        this.A02 = getStrokeDrawable();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public void setCheckmark(boolean z) {
        ImageView imageView;
        int i;
        if (z) {
            ColorFilter A06 = DbV.A06(getContext(), R.color.black_60_transparent);
            this.A03.setColorFilter(A06);
            this.A02.setColorFilter(A06);
            imageView = this.A01;
            i = 0;
        } else {
            this.A03.setColorFilter((ColorFilter) null);
            this.A02.setColorFilter((ColorFilter) null);
            imageView = this.A01;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A03.setAlpha(255);
        this.A02.setAlpha(255);
    }

    public Drawable getStrokeDrawable() {
        Context context = getContext();
        return new C52792Gcj(AnonymousClass7TG.A04(context), DbU.A01(context), this.A00, AnonymousClass7TG.A03(context));
    }

    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DoubleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }
}
