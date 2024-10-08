package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.KJj  reason: case insensitive filesystem */
public final class C61718KJj extends C59974Jcj {
    public Integer A00;
    public final Paint A01;
    public final RectF A02 = AnonymousClass7TE.A0Y();

    public final void draw(Canvas canvas) {
        int intValue = this.A00.intValue();
        RectF rectF = this.A02;
        Paint paint = this.A01;
        if (intValue != 0) {
            canvas.drawOval(rectF, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        super.draw(canvas);
    }

    public C61718KJj(Resources resources, Drawable drawable, Integer num) {
        super(drawable);
        Paint A0D = JTP.A0D();
        this.A01 = A0D;
        A0D.setColor(resources.getColor(R.color.grey_2));
        A0D.setStrokeWidth((float) resources.getDimensionPixelOffset(R.dimen.account_recs_header_image_margin));
        JTO.A1N(A0D);
        drawable.getClass();
        AnonymousClass7TE.A1R(drawable, resources.getColor(R.color.grey_9));
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.A00 = num;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A02.set(rect);
    }
}
