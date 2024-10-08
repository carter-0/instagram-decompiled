package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Jci  reason: case insensitive filesystem */
public final class C59973Jci extends Drawable {
    public String A00;
    public Drawable A01;
    public final Paint A02 = AnonymousClass7TE.A0V(3);
    public final float A03;
    public final float A04;
    public final Context A05;
    public final Paint A06;
    public final Rect A07;
    public final RectF A08;
    public final boolean A09;

    public C59973Jci(Context context, float f, boolean z, boolean z2) {
        this.A05 = context;
        this.A03 = f;
        this.A09 = z2;
        Paint A0V = AnonymousClass7TE.A0V(3);
        this.A06 = A0V;
        float A042 = 0nA.A04(context, 1);
        this.A04 = A042;
        this.A08 = AnonymousClass7TE.A0Y();
        this.A07 = AnonymousClass7TE.A0W();
        JTO.A1N(A0V);
        A0V.setStrokeWidth(A042);
        A0V.setColor(Color.argb(Math.round(25.5f), 255, 255, 255));
        if (z) {
            this.A01 = AnonymousClass3JT.A05(context, R.drawable.instagram_my_week_story_pano_outline_24, context.getColor(R.color.igds_icon_on_color));
        }
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Context context = this.A05;
        int A062 = AnonymousClass7TF.A06(this);
        int A063 = JTP.A06(this);
        String A012 = 002.A01('x', A062, A063);
        if (!(A062 == 0 || A063 == 0 || 0qQ.A0K(this.A00, A012))) {
            int i = R.drawable.lately_placeholder_card;
            if (A062 == A063) {
                i = R.drawable.lately_placeholder_default;
            }
            Drawable drawable = context.getDrawable(i);
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                0qQ.A07(bitmap);
                this.A00 = A012;
                Paint paint = this.A02;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                invalidateSelf();
            } else if (drawable instanceof C262364Dk) {
                ((C262364Dk) drawable).A01(new C64864LjQ(A012, this, 0));
            }
        }
        if (this.A00 != null) {
            if (this.A09) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), ((float) AnonymousClass7TF.A06(this)) / 2.0f, this.A02);
            } else {
                RectF rectF = this.A08;
                rectF.set((float) getBounds().left, (float) getBounds().top, (float) getBounds().right, (float) JTO.A06(this));
                float f = this.A03;
                canvas.drawRoundRect(rectF, f, f, this.A02);
                float f2 = this.A04 / 2.0f;
                rectF.inset(f2, f2);
                canvas.drawRoundRect(rectF, f, f, this.A06);
            }
            Drawable drawable2 = this.A01;
            if (drawable2 != null) {
                Rect rect = this.A07;
                rect.left = 0;
                rect.top = 0;
                rect.right = drawable2.getIntrinsicWidth();
                rect.bottom = drawable2.getIntrinsicHeight();
                drawable2.setBounds(rect);
                canvas.save();
                canvas.translate((((float) AnonymousClass7TF.A06(this)) / 2.0f) - (((float) AnonymousClass7TF.A06(drawable2)) / 2.0f), (((float) JTP.A06(this)) / 2.0f) - (((float) JTP.A06(drawable2)) / 2.0f));
                drawable2.draw(canvas);
                canvas.restore();
            }
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
