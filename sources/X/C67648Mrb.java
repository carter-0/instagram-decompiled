package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Mrb  reason: case insensitive filesystem */
public final class C67648Mrb extends Drawable implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public final ValueAnimator A01;
    public final Resources A02;
    public final Bitmap A03;
    public final Bitmap A04;
    public final Paint A05 = JTO.A0C();

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        Canvas canvas2 = canvas;
        canvas2.save();
        double A002 = C66580MXl.A00(bounds);
        Bitmap bitmap = this.A04;
        bitmap.getClass();
        canvas2.translate((float) AnonymousClass37Q.A04((double) this.A00, 1.0d, 0.0d, A002, (double) (-bitmap.getWidth())), 0.0f);
        Paint paint = this.A05;
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas2.restore();
        canvas2.save();
        float f2 = this.A00;
        if (((double) f2) > 0.5d) {
            f = f2 - 0.5f;
        } else {
            f = f2 + 0.5f;
        }
        this.A00 = f;
        double A003 = C66580MXl.A00(bounds);
        Bitmap bitmap2 = this.A03;
        bitmap2.getClass();
        canvas2.translate((float) AnonymousClass37Q.A04((double) f, 1.0d, 0.0d, A003, (double) (-bitmap2.getWidth())), 0.0f);
        canvas2.drawBitmap(bitmap2, 0.0f, this.A02.getDimension(R.dimen.abc_edit_text_inset_top_material), paint);
        canvas2.restore();
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    public C67648Mrb(Resources resources) {
        this.A02 = resources;
        this.A04 = BitmapFactory.decodeResource(resources, R.drawable.small_cloud);
        this.A03 = BitmapFactory.decodeResource(resources, R.drawable.big_cloud);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.A01 = ofFloat;
        ofFloat.setInterpolator((TimeInterpolator) null);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(this);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00 = AnonymousClass7TE.A04(valueAnimator.getAnimatedValue());
        invalidateSelf();
    }
}
