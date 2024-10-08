package X;

import android.graphics.Bitmap;
import android.graphics.Point;

/* renamed from: X.Vau  reason: case insensitive filesystem */
public final class C17602Vau {
    public long A00;
    public final double A01;
    public final double A02;
    public final Bitmap A03;
    public final Point A04;
    public final Point A05;

    public C17602Vau(Bitmap bitmap, Point point, Point point2, Point point3, float f) {
        AnonymousClass7TG.A1O(point, point2);
        this.A03 = bitmap;
        Point point4 = point3;
        Point point5 = new Point(point.x - point4.x, point.y - point4.y);
        this.A05 = point5;
        Point point6 = new Point(point2.x - point4.x, point2.y - point4.y);
        this.A04 = point6;
        double d = -Math.sin(0.879645943005142d);
        float f2 = ((float) point5.y) - f;
        double d2 = -Math.sin(5.277875658030852d);
        int i = point6.y;
        double d3 = d2 - d;
        double d4 = ((double) (((float) i) - f2)) / d3;
        double d5 = ((d2 * ((double) f2)) - (d * ((double) i))) / d3;
        this.A01 = (-d4) + d5;
        this.A02 = d4 + d5;
    }
}
