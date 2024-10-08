package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HZa  reason: case insensitive filesystem */
public abstract class C54944HZa {
    public static final void A00(View view, UserSession userSession, List list) {
        0qQ.A0B(userSession, 0);
        Context context = view.getContext();
        view.performHapticFeedback(0);
        0qQ.A0A(context);
        C355148Ov r3 = new C355148Ov(context, userSession, (Integer) null, false);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((JO3) it.next()).AEb(context));
        }
        r3.A02(A0r);
        r3.showAsDropDown(view);
    }
}
