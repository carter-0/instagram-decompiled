package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.android.R;

public abstract class F62 {
    public static final BitmapDrawable A00(Context context, int i) {
        0qQ.A0B(context, 0);
        int[] iArr = new int[5];
        C267014am.A03(context, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
        Paint paint = AnonymousClass3JT.A00;
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            0qQ.A07(bounds);
            int width = bounds.width();
            int height = bounds.height();
            if (width <= 0 || height <= 0) {
                width = drawable.getIntrinsicWidth();
                height = drawable.getIntrinsicWidth();
            }
            return AnonymousClass3JT.A00(context, new LinearGradient(0.0f, 0.0f, (float) width, (float) height, iArr, (float[]) null, Shader.TileMode.REPEAT), drawable);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final Drawable A01(Context context, int i) {
        0qQ.A0B(context, 0);
        int A03 = AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_red);
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_pink);
        Paint paint = AnonymousClass3JT.A00;
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            return AnonymousClass3JT.A02(context, drawable, A03, A032);
        }
        throw AnonymousClass7TE.A0y();
    }
}
