package com.instagram.avatars.coinflip;

import X.0qQ;
import X.C321016tR;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CoinFlipAvatarImageView extends IgImageView {
    public boolean A00;
    public float A01;
    public float A02;
    public final Path A03;
    public final RectF A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CoinFlipAvatarImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.avatars.coinflip.CoinFlipAvatarImageView, android.widget.ImageView, android.view.View] */
    public final void onDraw(Canvas canvas) {
        C321016tR r1;
        0qQ.A0B(canvas, 0);
        float width = (float) getWidth();
        Path path = this.A03;
        path.reset();
        RectF rectF = this.A04;
        rectF.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, width, width, width, width}, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.A00) {
            float f = this.A01;
            canvas.scale(f, f);
        } else {
            Drawable drawable = getDrawable();
            if ((drawable instanceof C321016tR) && (r1 = (C321016tR) drawable) != null) {
                float f2 = r1.A00;
                if (Float.valueOf(f2) != null) {
                    float f3 = f2 * this.A02;
                    float height = (((float) getHeight()) / (f2 - f3)) * this.A01;
                    canvas.translate(0.0f, (-f3) * height);
                    canvas.scale(this.A01, height);
                }
            }
        }
        canvas.translate((((float) getWidth()) * ((1.0f / this.A01) - 1.0f)) / 2.0f, ((float) getHeight()) * ((1.0f / this.A01) - 1.0f));
        CoinFlipAvatarImageView.super.onDraw(canvas);
    }

    public final float getAvatarScale() {
        return this.A01;
    }

    public final float getTopMarginRatio() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.avatars.coinflip.CoinFlipAvatarImageView, android.view.View] */
    public final void setAvatarScale(float f) {
        this.A01 = f;
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.avatars.coinflip.CoinFlipAvatarImageView, android.view.View] */
    public final void setTopMarginRatio(float f) {
        this.A02 = f;
        invalidate();
    }

    public final void set440x400AssetsEnabled(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipAvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A03 = new Path();
        this.A04 = new RectF();
        this.A01 = 1.0f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoinFlipAvatarImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CoinFlipAvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
