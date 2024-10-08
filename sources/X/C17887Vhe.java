package X;

import android.graphics.PointF;
import com.instagram.ui.widget.drawing.common.Point2;

/* renamed from: X.Vhe  reason: case insensitive filesystem */
public final class C17887Vhe {
    public Point2 A00;
    public Point2 A01;
    public final C18618VvB A02;
    public final long A03;
    public final Point2 A04;

    /* JADX WARNING: type inference failed for: r0v8, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    public final void A00(PointF pointF, long j) {
        if (j >= this.A03) {
            Point2 point2 = this.A00;
            Point2 point22 = this.A01;
            if (point2 == point22) {
                this.A00 = new PointF(pointF.x, pointF.y);
                return;
            }
            Point2 point23 = this.A04;
            float f = pointF.x - point22.x;
            point23.x = f;
            float f2 = pointF.y - point22.y;
            point23.y = f2;
            point23.x = f * 0.5f;
            point23.y = f2 * 0.5f;
            this.A02.A00(point2, point23, (float) j);
            this.A01.set(this.A00);
            this.A00.set(pointF);
            return;
        }
        throw new IllegalStateException("events must deliver in order");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    /* JADX WARNING: type inference failed for: r1v0, types: [android.graphics.PointF, com.instagram.ui.widget.drawing.common.Point2] */
    public C17887Vhe(PointF pointF, long j) {
        C18618VvB vvB = new C18618VvB();
        this.A02 = vvB;
        ? pointF2 = new PointF(0.0f, 0.0f);
        this.A04 = pointF2;
        ? pointF3 = new PointF(pointF.x, pointF.y);
        this.A00 = pointF3;
        this.A01 = pointF3;
        this.A03 = j;
        vvB.A00(pointF3, pointF2, (float) j);
    }
}
