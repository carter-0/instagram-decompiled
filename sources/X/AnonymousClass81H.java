package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.81H  reason: invalid class name */
public final class AnonymousClass81H {
    public Rect A00;
    public C301485zM A01;
    public Path A02;
    public final Context A03;
    public final Paint A04;
    public final Rect A05 = new Rect();
    public final View A06;
    public final int A07;
    public final int A08;

    public AnonymousClass81H(View view, Integer num, Integer num2) {
        int color;
        int color2;
        this.A06 = view;
        Paint paint = new Paint(1);
        this.A04 = paint;
        Context context = view.getContext();
        0qQ.A07(context);
        this.A03 = context;
        if (num != null) {
            color = num.intValue();
        } else {
            color = context.getColor(2Yu.A0H(context, R.attr.backgroundColorSecondary));
        }
        this.A08 = color;
        if (num2 != null) {
            color2 = num2.intValue();
        } else {
            color2 = context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_background));
        }
        this.A07 = color2;
        paint.setColor(context.getColor(2Yu.A0H(context, R.attr.cropHighlightBackground)));
        paint.setAlpha(204);
    }

    public final void A01(RectF rectF, boolean z, boolean z2) {
        float max = (float) Math.max(AnonymousClass1GB.A01(rectF.left), 0);
        float max2 = (float) Math.max(AnonymousClass1GB.A01(rectF.top), 0);
        int A012 = AnonymousClass1GB.A01(rectF.right);
        View view = this.A06;
        RectF rectF2 = new RectF(max, max2, (float) Math.min(A012, view.getWidth()), (float) Math.min(AnonymousClass1GB.A01(rectF.bottom), view.getHeight()));
        this.A00 = JW0.A05(rectF2);
        if (z) {
            Path path = new Path();
            this.A02 = path;
            path.setFillType(Path.FillType.EVEN_ODD);
            RectF rectF3 = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            Path path2 = this.A02;
            if (path2 != null) {
                path2.addRect(rectF3, Path.Direction.CW);
            }
            Path path3 = this.A02;
            if (path3 != null) {
                path3.addOval(rectF2, Path.Direction.CCW);
            }
            this.A01 = null;
            return;
        }
        this.A02 = null;
        int i = 1;
        if (((double) view.getResources().getDisplayMetrics().density) >= 1.5d) {
            i = 2;
        }
        C301485zM r7 = new C301485zM((float) i, 3, 3, this.A08, this.A07, z2);
        this.A01 = r7;
        Rect rect = this.A00;
        if (rect != null) {
            r7.A03(rect);
        }
        C301485zM r0 = this.A01;
        if (r0 != null) {
            r0.A04(0.0f);
        }
    }

    public final void A00(Canvas canvas) {
        Path path = this.A02;
        if (path != null) {
            canvas.drawPath(path, this.A04);
        } else {
            Rect rect = this.A00;
            if (rect != null) {
                View view = this.A06;
                Rect rect2 = this.A05;
                view.getDrawingRect(rect2);
                rect2.bottom = AnonymousClass1GB.A01((float) rect.top);
                Paint paint = this.A04;
                canvas.drawRect(rect2, paint);
                view.getDrawingRect(rect2);
                rect2.top = AnonymousClass1GB.A01((float) rect.bottom);
                canvas.drawRect(rect2, paint);
                boolean z = true;
                boolean z2 = false;
                if (rect2.left < rect.left) {
                    z2 = true;
                }
                if (rect2.right <= rect.right) {
                    z = false;
                }
                if (z2) {
                    view.getDrawingRect(rect2);
                    rect2.top = AnonymousClass1GB.A01((float) rect.top);
                    rect2.bottom = AnonymousClass1GB.A01((float) rect.bottom);
                    rect2.right = AnonymousClass1GB.A01((float) rect.left);
                    canvas.drawRect(rect2, paint);
                }
                if (z) {
                    view.getDrawingRect(rect2);
                    rect2.top = AnonymousClass1GB.A01((float) rect.top);
                    rect2.bottom = AnonymousClass1GB.A01((float) rect.bottom);
                    rect2.left = AnonymousClass1GB.A01((float) rect.right);
                    canvas.drawRect(rect2, paint);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C301485zM r0 = this.A01;
        if (r0 != null) {
            r0.A02(canvas);
        }
    }
}
