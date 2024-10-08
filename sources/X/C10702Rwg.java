package X;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.List;

/* renamed from: X.Rwg  reason: case insensitive filesystem */
public abstract class C10702Rwg {
    public final Rect A00;
    public final String A01;
    public final String A02;
    public final Point[] A03;

    public C10702Rwg(Rect rect, String str, String str2, List list) {
        this.A01 = str;
        this.A00 = new Rect(rect);
        Point[] pointArr = new Point[list.size()];
        for (int i = 0; i < list.size(); i++) {
            pointArr[i] = new Point((Point) list.get(i));
        }
        this.A03 = pointArr;
        this.A02 = str2;
    }
}
