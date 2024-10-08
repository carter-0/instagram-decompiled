package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.Vx2  reason: case insensitive filesystem */
public abstract class C18701Vx2 {
    public static final Handler A00 = new C14686U1l(Looper.getMainLooper(), 0);

    public static GradientDrawable A00(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof GradientDrawable) {
            return (GradientDrawable) drawable;
        }
        if (drawable instanceof ScaleDrawable) {
            return A00(((DrawableWrapper) drawable).getDrawable());
        }
        if (!(drawable instanceof StateListDrawable) || drawable.getConstantState() == null) {
            return null;
        }
        DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) drawable.getConstantState();
        for (int i = 0; i < drawableContainerState.getChildCount(); i++) {
            GradientDrawable A002 = A00(drawableContainerState.getChild(i));
            if (A002 != null) {
                return A002;
            }
        }
        return null;
    }

    public static void A01(C17728Vcx vcx, int i) {
        GradientDrawable gradientDrawable = vcx.A09;
        if (gradientDrawable != null && vcx.A0A != null && vcx.A0B != null) {
            gradientDrawable.setSize(-1, i);
            vcx.A0A.setSize(-1, i);
            vcx.A0B.setSize(-1, i);
        }
    }
}
