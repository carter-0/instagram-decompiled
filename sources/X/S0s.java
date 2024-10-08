package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public final class S0s {
    public final Map A00 = AnonymousClass7TE.A1H();

    public final Path A00() {
        LinkedHashSet A0y = DbS.A0y();
        Path A0C = C51965G9l.A0C();
        Map map = this.A00;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            PointF pointF = (PointF) A1J.getKey();
            if (!A0y.contains(pointF)) {
                A0y.add(pointF);
                A0C.moveTo(pointF.x, pointF.y);
                ArrayDeque arrayDeque = new ArrayDeque(Pxe.A18(A1J));
                while (!arrayDeque.isEmpty()) {
                    PointF pointF2 = (PointF) arrayDeque.removeLast();
                    if (!A0y.contains(pointF2)) {
                        0qQ.A0A(pointF2);
                        A0y.add(pointF2);
                        A0C.lineTo(pointF2.x, pointF2.y);
                        Collection collection = (Collection) map.get(pointF2);
                        if (collection != null) {
                            arrayDeque.addAll(collection);
                        }
                    }
                }
                A0C.close();
            }
        }
        return A0C;
    }
}
