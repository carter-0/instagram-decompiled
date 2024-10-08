package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* renamed from: X.U4a  reason: case insensitive filesystem */
public final class C14719U4a extends FrameLayout {
    public PointF A00 = new PointF();
    public C17319VQy A01 = new C17319VQy();
    public String A02 = "rectangle";
    public final Path A03 = new Path();

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    private final void A00(int i, int i2) {
        Path path = this.A03;
        path.reset();
        RectF rectF = new RectF();
        float f = (float) i;
        PointF pointF = this.A00;
        float f2 = pointF.x;
        float f3 = (float) i2;
        float f4 = pointF.y;
        C17319VQy vQy = this.A01;
        rectF.set(f2 * f, f4 * f3, (f2 + vQy.A01) * f, (f4 + vQy.A00) * f3);
        if (0qQ.A0K(this.A02, "ellipse")) {
            float width = rectF.left - ((rectF.width() - f) / 2.0f);
            float height = rectF.top - ((rectF.height() - f3) / 2.0f);
            rectF.set(width, height, rectF.width() + width, rectF.height() + height);
        }
        boolean A0K = 0qQ.A0K(this.A02, "ellipse");
        Path.Direction direction = Path.Direction.CW;
        if (A0K) {
            path.addOval(rectF, direction);
        } else {
            path.addRect(rectF, direction);
        }
    }

    public final void setMaskShape(String str) {
        this.A02 = str;
        A00(getWidth(), getHeight());
        invalidate();
    }

    public C14719U4a(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public final void dispatchDraw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        canvas.clipPath(this.A03);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(1802435030);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        AnonymousClass0fD.A0D(-1436131389, A06);
    }

    public final void setMaskBounds(PointF pointF, C17319VQy vQy) {
        AnonymousClass7TG.A1N(pointF, vQy);
        this.A00 = pointF;
        this.A01 = vQy;
        A00(getWidth(), getHeight());
        invalidate();
    }
}
