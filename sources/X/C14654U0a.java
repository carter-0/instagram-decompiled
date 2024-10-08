package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.maps.ui.IgStaticMapView;

/* renamed from: X.U0a  reason: case insensitive filesystem */
public final class C14654U0a extends Drawable {
    public final /* synthetic */ IgStaticMapView A00;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C14654U0a(IgStaticMapView igStaticMapView) {
        this.A00 = igStaticMapView;
    }

    public final void draw(Canvas canvas) {
        IgStaticMapView igStaticMapView = this.A00;
        Drawable drawable = igStaticMapView.A04;
        if (drawable == null) {
            drawable = igStaticMapView.getInfoGlyph();
            igStaticMapView.A04 = drawable;
        }
        if (drawable != null) {
            Rect rect = igStaticMapView.A0H;
            drawable.setBounds(rect);
            canvas.drawCircle((float) rect.centerX(), (float) rect.centerY(), (float) (rect.width() >> 1), igStaticMapView.A0F);
            igStaticMapView.A04.setAlpha(76);
            igStaticMapView.A04.draw(canvas);
        }
    }
}
