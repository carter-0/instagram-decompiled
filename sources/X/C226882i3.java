package X;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.2i3  reason: invalid class name and case insensitive filesystem */
public abstract class C226882i3 {
    public static final AnonymousClass2i4 A00(PointF pointF, Rect rect, Object obj, String str, Map map, Map map2, Map map3, Map map4, Map map5) {
        AnonymousClass2i4 r1 = new AnonymousClass2i4();
        if (rect != null) {
            r1.A01 = rect.width();
            r1.A00 = rect.height();
        }
        r1.A06 = str;
        if (pointF != null) {
            r1.A03 = Float.valueOf(pointF.x);
            r1.A04 = Float.valueOf(pointF.y);
        }
        r1.A05 = obj;
        r1.A09 = map3;
        r1.A0A = map5;
        r1.A0C = map2;
        r1.A08 = map;
        r1.A0B = map4;
        return r1;
    }
}
