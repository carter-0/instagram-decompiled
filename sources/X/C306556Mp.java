package X;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Mp  reason: invalid class name and case insensitive filesystem */
public abstract class C306556Mp {
    public static ArrayList A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Path path = new Path();
            for (C306526Mm r0 : ((C306506Mk) it.next()).A00) {
                Object obj = r0.A03;
                if (obj == null && (obj = r0.A02) == null && (obj = r0.A01) == null && (obj = r0.A00) == null) {
                    throw new IllegalArgumentException("Unsupported Path action.");
                } else if (obj instanceof C306516Ml) {
                    C306516Ml r7 = (C306516Ml) obj;
                    path.moveTo(r7.A00, r7.A01);
                } else if (obj instanceof C306536Mn) {
                    C306536Mn r72 = (C306536Mn) obj;
                    path.lineTo(r72.A00, r72.A01);
                } else if (obj instanceof C306566Mq) {
                    C306566Mq r73 = (C306566Mq) obj;
                    path.addRoundRect(new RectF(r73.A03, r73.A05, r73.A04, r73.A02), r73.A00, r73.A01, r73.A06);
                } else if (obj instanceof C306546Mo) {
                    path.close();
                }
            }
            arrayList.add(path);
        }
        return arrayList;
    }
}
