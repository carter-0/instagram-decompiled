package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.9Xt  reason: invalid class name and case insensitive filesystem */
public final class C380379Xt extends View {
    public boolean A00 = true;
    public final float A01;
    public final int A02;
    public final Paint A03;
    public final Path A04 = new Path();
    public final Drawable A05;

    public C380379Xt(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A02 = context.getColor(R.color.black_40_transparent);
        Resources resources = getResources();
        this.A01 = resources.getDimension(R.dimen.abc_dialog_padding_material);
        Paint paint = new Paint();
        AnonymousClass7TE.A1N(context, paint, R.color.badge_color);
        paint.setStrokeWidth(resources.getDimension(R.dimen.abc_control_corner_material));
        this.A03 = paint;
        this.A05 = context.getDrawable(R.drawable.clips_stacked_timeline_video_preview_border);
    }

    public final boolean getShowGuide() {
        return this.A00;
    }

    public final void setShowGuide(boolean z) {
        this.A00 = z;
        invalidate();
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int A0D = AnonymousClass7TG.A0D(canvas, 645368815);
        super.draw(canvas);
        canvas.save();
        Path path = this.A04;
        0qQ.A0B(path, 1);
        canvas.clipOutPath(path);
        canvas.drawColor(this.A02);
        canvas.restore();
        if (this.A00) {
            Paint paint = this.A03;
            canvas2.drawLine(0.0f, AnonymousClass7TE.A03(this) / 2.0f, AnonymousClass7TE.A02(this), AnonymousClass7TE.A03(this) / 2.0f, paint);
            canvas2.drawLine(AnonymousClass7TE.A02(this) / 2.0f, 0.0f, AnonymousClass7TE.A02(this) / 2.0f, AnonymousClass7TE.A03(this), paint);
            Drawable drawable = this.A05;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        AnonymousClass0fD.A0A(-2077100106, A0D);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.setBounds(new Rect(0, 0, getWidth(), getHeight()));
        }
        Path path = this.A04;
        path.reset();
        float A022 = AnonymousClass7TE.A02(this);
        float A032 = AnonymousClass7TE.A03(this);
        float f = this.A01;
        path.addRoundRect(0.0f, 0.0f, A022, A032, f, f, Path.Direction.CW);
    }
}
