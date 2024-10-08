package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.H7q  reason: case insensitive filesystem */
public final class C54321H7q extends IgImageView {
    public float A00;
    public PathMeasure A01;
    public final float A02;
    public final Path A03;
    public final ShapeDrawable A04 = new ShapeDrawable(new OvalShape());
    public final Paint A05;

    public C54321H7q(Context context) {
        super(context);
        int color = context.getColor(R.color.gallery_item_selection_circle_default_color);
        this.A03 = C51965G9l.A0C();
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A05 = A0V;
        this.A02 = C61380mr.A00(context, 4.0f);
        this.A00 = C61380mr.A00(context, 0.15f);
        A0V.setColor(color);
        A0V.setStyle(Paint.Style.STROKE);
        A0V.setStrokeWidth(this.A02);
        A0V.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C54321H7q.super.onDraw(canvas);
        canvas.drawPath(this.A03, this.A05);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(275216834);
        Path path = this.A03;
        path.reset();
        float f = (float) i;
        float f2 = (f - this.A02) / 2.0f;
        float f3 = f / 2.0f;
        float f4 = ((float) i2) / 2.0f;
        path.addArc(new RectF(f3 - f2, f4 - f2, f3 + f2, f4 + f2), 270.0f, 360.0f);
        this.A01 = new PathMeasure(path, true);
        AnonymousClass0fD.A0D(203046375, A06);
    }
}
