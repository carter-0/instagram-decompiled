package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.MrX  reason: case insensitive filesystem */
public final class C67644MrX extends Drawable {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final Path A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        int A062 = AnonymousClass7TF.A06(this);
        int i = this.A01 * 2;
        float f = (float) (A062 - i);
        float A063 = (float) (JTP.A06(this) - i);
        Path path = this.A05;
        Paint paint = this.A02;
        canvas.drawPath(path, paint);
        path.close();
        canvas.translate(f, 0.0f);
        Path path2 = this.A06;
        canvas.drawPath(path2, paint);
        path2.close();
        canvas.translate(0.0f, A063);
        Path path3 = this.A04;
        canvas.drawPath(path3, paint);
        path3.close();
        canvas.translate(-f, 0.0f);
        Path path4 = this.A03;
        canvas.drawPath(path4, paint);
        path4.close();
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static Path A00(Path.Direction direction, Region.Op op, Region region, float f) {
        Path path = new Path();
        path.addCircle(f, f, f, direction);
        Region region2 = new Region();
        region2.setPath(path, region);
        region.op(region2, op);
        Path boundaryPath = region.getBoundaryPath();
        0qQ.A07(boundaryPath);
        return boundaryPath;
    }

    public C67644MrX(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        Paint A0C = JTO.A0C();
        A0C.setColor(A0C.getColor());
        this.A02 = A0C;
        Region region = new Region(0, 0, i, i);
        Path A0C2 = C51965G9l.A0C();
        float f = (float) i;
        Path.Direction direction = Path.Direction.CW;
        A0C2.addCircle(f, f, f, direction);
        Region region2 = new Region();
        region2.setPath(A0C2, region);
        Region.Op op = Region.Op.DIFFERENCE;
        region.op(region2, op);
        Path boundaryPath = region.getBoundaryPath();
        0qQ.A07(boundaryPath);
        this.A05 = boundaryPath;
        int i3 = i * 2;
        this.A06 = A00(direction, op, new Region(i, 0, i3, i), f);
        this.A03 = A00(direction, op, new Region(0, i, i, i3), f);
        this.A04 = A00(direction, op, new Region(i, i, i3, i3), f);
    }
}
