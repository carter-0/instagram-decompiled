package com.instagram.arlink.ui;

import X.AnonymousClass7TE;
import X.JTO;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public class CoachMarkOverlay extends View {
    public int A00 = getContext().getColor(R.color.black_60_transparent);
    public Bitmap A01;
    public final Paint A02 = JTO.A0C();
    public final RectF A03 = AnonymousClass7TE.A0Y();

    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.A00);
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            RectF rectF = this.A03;
            canvas.drawBitmap(bitmap, rectF.left, rectF.top, this.A02);
        }
        super.onDraw(canvas);
    }

    public void setSpotlightAlpha(int i) {
        this.A02.setAlpha(i);
        invalidate();
    }

    public CoachMarkOverlay(Context context) {
        super(context);
    }

    public CoachMarkOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CoachMarkOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
