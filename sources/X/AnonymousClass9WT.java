package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9WT  reason: invalid class name */
public final class AnonymousClass9WT extends Drawable {
    public final int A00;
    public final Layout A01;

    public AnonymousClass9WT(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, String str) {
        Context context2 = context;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.font_large);
        int A0F = AnonymousClass7TE.A0F(context2.getResources());
        this.A00 = A0F;
        int A002 = AnonymousClass81W.A00(targetViewSizeProvider) - (A0F * 2);
        Resources resources = context2.getResources();
        int color = context2.getColor(R.color.debug_overlay_white_70_transparent);
        int color2 = context2.getColor(2Yu.A0A(context2));
        TextPaint textPaint = new TextPaint(1);
        textPaint.density = resources.getDisplayMetrics().density;
        textPaint.linkColor = color;
        textPaint.setTextSize((float) dimensionPixelSize);
        textPaint.setColor(color2);
        textPaint.setShadowLayer(0nA.A03(context2, 1.0f), 0.0f, 0nA.A03(context2, 1.0f), context2.getColor(R.color.black_25_transparent));
        DDf A003 = C65211bM.A00.A00();
        A003.A0t = str;
        A003.A0f = 1;
        C247733gp r14 = new C247733gp(A003.A02());
        r14.A06 = C252883pr.Success;
        UserSession userSession2 = userSession;
        this.A01 = C252923pv.A01(context2, userSession2, new 0rN(Layout.Alignment.ALIGN_NORMAL, textPaint, (String) null, AnonymousClass7TE.A01(resources, R.dimen.abc_control_corner_material), 1.0f, A002, false), r14, 1sy.A0X, (Integer) null, Integer.valueOf(color), Integer.valueOf(color2), 0, false, false);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Layout layout = this.A01;
        if (layout != null) {
            int save = canvas.save();
            try {
                Rect A0X = AnonymousClass7TE.A0X(this);
                int i = A0X.left;
                int i2 = this.A00;
                canvas.translate((float) (i + i2), (float) ((A0X.bottom - layout.getHeight()) - i2));
                layout.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
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
