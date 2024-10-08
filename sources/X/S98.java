package X;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public final class S98 {
    public static final Context A00(SIU siu) {
        View view;
        List list = siu.A03;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        SIU siu2 = (SIU) it.next();
        if (!(siu2 instanceof C7817QYc)) {
            return A00(siu2);
        }
        C7817QYc qYc = (C7817QYc) siu2;
        View view2 = null;
        try {
            X9N x9n = qYc.A01;
            if (x9n != null) {
                view = x9n.resolveView(qYc.A00);
            } else {
                view = null;
            }
        } catch (Throwable th) {
            view = JTO.A1B(th);
        }
        if (!(view instanceof 0eQ)) {
            view2 = view;
        }
        View view3 = view2;
        if (view3 != null) {
            return view3.getContext();
        }
        return null;
    }
}
