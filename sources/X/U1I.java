package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;

public final class U1I extends Drawable implements Drawable.Callback {
    public final C306386Ly A00;

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A00.A0A;
    }

    public final void onBoundsChange(Rect rect) {
        C306386Ly r6 = this.A00;
        r6.setBounds((int) (rect.exactCenterX() - (((float) r6.A0A) / 2.0f)), (int) (rect.exactCenterY() - (((float) r6.A06) / 2.0f)), (int) (rect.exactCenterX() + (((float) r6.A0A) / 2.0f)), (int) (rect.exactCenterY() + (((float) r6.A06) / 2.0f)));
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public U1I(Context context) {
        Resources resources = context.getResources();
        int color = context.getColor(R.color.clips_remix_camera_outer_container_default_background);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.backup_codes_text_size);
        C306386Ly r2 = new C306386Ly(context, resources.getDimensionPixelSize(R.dimen.browser_error_screen_description_width));
        this.A00 = r2;
        r2.A0K(Layout.Alignment.ALIGN_CENTER);
        r2.setCallback(this);
        r2.A0F(color);
        r2.A0A((float) dimensionPixelSize);
        ABM.A00(context, r2);
        r2.A0b.setLetterSpacing(-0.03f);
        r2.A0R();
    }

    public final void draw(Canvas canvas) {
        C306386Ly r3 = this.A00;
        float min = Math.min(1.0f, ((float) JTP.A06(this)) / ((float) r3.A06));
        canvas.save();
        canvas.scale(min, min, C66581MXm.A01(this), getBounds().exactCenterY());
        r3.draw(canvas);
        canvas.restore();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
