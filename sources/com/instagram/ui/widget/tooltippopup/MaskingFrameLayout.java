package com.instagram.ui.widget.tooltippopup;

import X.AnonymousClass7TE;
import X.JTO;
import X.JTP;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.android.R;

public class MaskingFrameLayout extends FrameLayout {
    public float A00;
    public Bitmap A01;
    public final Paint A02 = JTP.A0D();
    public final Rect A03 = AnonymousClass7TE.A0W();
    public final Rect A04 = AnonymousClass7TE.A0W();

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Rect rect = this.A04;
            getGlobalVisibleRect(rect);
            float f = this.A00;
            rect.set(JTO.A04((float) rect.left, f), JTO.A04((float) rect.top, f), JTO.A04((float) rect.right, f), JTO.A04((float) rect.bottom, f));
            Rect rect2 = this.A03;
            rect2.set(0, 0, getWidth(), getHeight());
            Paint paint = this.A02;
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            paint.setAlpha(51);
            canvas2.drawRect(0.0f, 0.0f, AnonymousClass7TE.A02(this), AnonymousClass7TE.A03(this), paint);
            paint.setAlpha(255);
        }
    }

    private void A00() {
        Paint paint = this.A02;
        AnonymousClass7TE.A1N(getContext(), paint, R.color.grey_5);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
    }

    public MaskingFrameLayout(Context context) {
        super(context);
        A00();
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public MaskingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
