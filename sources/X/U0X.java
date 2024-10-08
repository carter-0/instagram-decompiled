package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;

public final class U0X extends Drawable {
    public StaticLayout A00;

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        this.A00.draw(canvas);
    }
}
