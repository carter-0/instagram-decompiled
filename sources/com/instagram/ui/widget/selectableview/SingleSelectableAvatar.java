package com.instagram.ui.widget.selectableview;

import X.0qQ;
import X.AnonymousClass0iw;
import X.AnonymousClass7TG;
import X.C226582hK;
import X.C46719Djq;
import X.C71382cm;
import X.DbU;
import X.DbX;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public class SingleSelectableAvatar extends C46719Djq {
    public ImageView A00;
    public CircularImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleSelectableAvatar(Context context) {
        super(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A2B);
        int i = 0;
        if (obtainStyledAttributes.hasValue(0)) {
            i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.selectable_avatar_single, this, true);
        this.A01 = DbU.A0X(inflate, R.id.selectable_avatar);
        ImageView A0F = DbU.A0F(inflate, R.id.select_check_mark);
        this.A00 = A0F;
        DbX.A12(context2, A0F, R.color.design_dark_default_color_on_background);
        if (i != 0) {
            this.A01.getLayoutParams().width = i;
            this.A01.getLayoutParams().height = i;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public void setCheckmark(boolean z) {
        ImageView imageView;
        int i;
        ? r2 = this.A01;
        if (z) {
            DbX.A12(getContext(), r2, R.color.black_60_transparent);
            imageView = this.A00;
            i = 0;
        } else {
            r2.setColorFilter((ColorFilter) null);
            imageView = this.A00;
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public void setImageDrawable(Drawable drawable) {
        this.A01.setImageDrawable(drawable);
    }

    public void setUrl(ImageUrl imageUrl, AnonymousClass0iw r3) {
        this.A01.setUrl(imageUrl, r3);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A01.setAlpha(255);
    }

    public Drawable getStrokeDrawable() {
        Context context = getContext();
        return new C226582hK(AnonymousClass7TG.A04(context), DbU.A01(context));
    }

    public SingleSelectableAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleSelectableAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }
}
