package X;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class SAA {
    public static List A01(zzf zzf) {
        Point[] pointArr = new Point[4];
        double radians = Math.toRadians((double) zzf.A00);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        int i = zzf.A01;
        int i2 = zzf.A02;
        pointArr[0] = new Point(i, i2);
        double d = (double) zzf.A03;
        Point point = new Point((int) (((double) i) + (d * cos)), (int) (((double) i2) + (d * sin)));
        pointArr[1] = point;
        double d2 = (double) point.x;
        double d3 = (double) zzf.A04;
        pointArr[2] = new Point((int) (d2 - (d3 * sin)), (int) (((double) pointArr[1].y) + (d3 * cos)));
        Point point2 = pointArr[0];
        int i3 = point2.x;
        Point point3 = pointArr[2];
        int i4 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point(i3 + (i4 - point4.x), point2.y + (point3.y - point4.y));
        return Arrays.asList(pointArr);
    }

    public static Rect A00(List list) {
        Iterator it = list.iterator();
        int i = AnonymousClass972.MUTABLE_FLAG_MASK;
        int i2 = AnonymousClass972.MUTABLE_FLAG_MASK;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            int i5 = point.x;
            i3 = Math.min(i3, i5);
            i = Math.max(i, i5);
            int i6 = point.y;
            i4 = Math.min(i4, i6);
            i2 = Math.max(i2, i6);
        }
        return new Rect(i3, i4, i, i2);
    }
}
