package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public abstract class N0B extends C67638MrR {
    public final ValueAnimator.AnimatorUpdateListener animatorListener = C71169Oei.A00;
    public final Context context;

    public N0B(Context context2) {
        0qQ.A0B(context2, 1);
        this.context = context2;
    }

    private final Rect getBoundsForBrandingDrawable(int i, int i2) {
        return new Rect(0, 0, i, (int) (((float) i2) * 0.35f));
    }

    public void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        0eP displayMetrics = getDisplayMetrics();
        int A0B = C51970G9q.A0B(displayMetrics);
        int A0A = C51969G9p.A0A(displayMetrics);
        Drawable brandingDrawable = getBrandingDrawable();
        brandingDrawable.setBounds(getBoundsForBrandingDrawable(A0B, A0A));
        Drawable iconDrawable = getIconDrawable();
        if (iconDrawable != null) {
            iconDrawable.setBounds(getBoundsForAppLogo(A0B, A0A));
        }
        new LayerDrawable(new Drawable[]{brandingDrawable, iconDrawable}).draw(canvas);
    }

    public abstract Drawable getBrandingDrawable();

    public abstract Drawable getIconDrawable();

    public int getOpacity() {
        return -1;
    }

    public final float getRatioForBranding() {
        return 0.35f;
    }

    public void initializeUnderlay(Context context2, C307796Rn r2) {
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public ValueAnimator.AnimatorUpdateListener getAnimatorListener() {
        return this.animatorListener;
    }

    public final 0eP getDisplayMetrics() {
        int i = Build.VERSION.SDK_INT;
        Context context2 = this.context;
        if (i >= 30) {
            Object systemService = context2.getSystemService("window");
            0qQ.A0C(systemService, AnonymousClass000.A00(14));
            Rect bounds = ((WindowManager) systemService).getCurrentWindowMetrics().getBounds();
            0qQ.A07(bounds);
            return AnonymousClass7TF.A0x(Integer.valueOf(bounds.width()), bounds.height());
        }
        Object systemService2 = context2.getSystemService("display");
        0qQ.A0C(systemService2, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display display = ((DisplayManager) systemService2).getDisplay(0);
        0qQ.A07(display);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return AnonymousClass7TF.A0x(Integer.valueOf(displayMetrics.widthPixels), displayMetrics.heightPixels);
    }

    public 0eP getIconSize() {
        return AnonymousClass7TF.A0x(Integer.valueOf(((int) AnonymousClass7TF.A0E(this.context).density) * 60), ((int) AnonymousClass7TF.A0E(this.context).density) * 60);
    }

    private final Rect getBoundsForAppLogo(int i, int i2) {
        0eP iconSize = getIconSize();
        int i3 = i / 2;
        int A0B = C51970G9q.A0B(iconSize) / 2;
        int i4 = (int) (((float) i2) * (0.35f / 2.33f));
        int A0A = C51969G9p.A0A(iconSize) / 2;
        return C66580MXl.A0C(i3 - A0B, i4 - A0A, i3 + A0B, i4 + A0A);
    }
}
