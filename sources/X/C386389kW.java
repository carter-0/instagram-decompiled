package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9kW  reason: invalid class name and case insensitive filesystem */
public final class C386389kW extends C355408Pw {
    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        canvas.drawRoundRect((float) A0L.left, (float) A0L.top, (float) A0L.right, (float) A0L.bottom, (float) (A0L.width() / 2), (float) (A0L.width() / 2), this.A03);
        Drawable drawable = this.A00;
        if (drawable != null) {
            canvas.save();
            AnonymousClass7TF.A15(canvas, drawable, (float) (A0L.left + (A0L.width() / 2)), (float) (A0L.top + (A0L.height() / 2)));
        }
    }
}
