package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HVo  reason: case insensitive filesystem */
public abstract class C54857HVo {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.IL8, X.3b1, java.lang.Object] */
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        View view;
        C276544tV r1;
        List list = r9.A00;
        Object obj = list.get(0);
        if (!(obj instanceof C276544tV) || (r1 = (C276544tV) obj) == null) {
            view = null;
        } else {
            view = r1.A05(r8.A03);
        }
        String A0t = DbU.A0t(list, 1);
        0lg A0B = C308206Td.A0B(r8);
        0lg r0 = null;
        if (A0B instanceof UserSession) {
            r0 = A0B;
        }
        if (!(view == null || r0 == null)) {
            C238833Dp A0X = C51967G9n.A0X(r0);
            0qQ.A0A(A0t);
            0qQ.A0B(A0t, 1);
            ? obj2 = new Object();
            obj2.A00 = A0t;
            obj2.A01 = true;
            A0X.A0A(view, obj2);
            A0X.A0B(view, new String[0]);
        }
        return null;
    }
}
