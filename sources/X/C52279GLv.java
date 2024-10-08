package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GLv  reason: case insensitive filesystem */
public final class C52279GLv implements C253023q5 {
    public final /* synthetic */ List A00;
    public final /* synthetic */ C62320sa A01;
    public final /* synthetic */ 0sL A02;

    public C52279GLv(List list, C62320sa r2, 0sL r3) {
        this.A00 = list;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void D2o(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        AnonymousClass7TG.A1O(str, view);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            if (0qQ.A0K(C51971G9r.A0t(A0k), str)) {
                this.A02.invoke(A0k, view);
                return;
            }
        }
        this.A01.invoke();
    }
}
