package X;

import android.graphics.PointF;
import java.util.List;

public final class QGV extends QGW {
    public final PointF A00 = new PointF();

    public final PointF A0B(ST4 st4, float f, float f2, float f3) {
        Object obj;
        Object obj2 = st4.A0E;
        if (obj2 == null || (obj = st4.A08) == null) {
            throw AnonymousClass7TE.A0z("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        SIR sir = this.A03;
        if (sir != null) {
            PointF pointF3 = (PointF) sir.A01(pointF, pointF2, st4.A0A, st4.A07.floatValue(), f, A05(), this.A02);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.A00;
        float f4 = pointF.x;
        float f5 = pointF.y;
        pointF4.set(f4 + (f2 * (pointF2.x - f4)), f5 + (f3 * (pointF2.y - f5)));
        return pointF4;
    }

    public QGV(List list) {
        super(list);
    }
}
