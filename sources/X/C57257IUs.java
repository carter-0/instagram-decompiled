package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IUs  reason: case insensitive filesystem */
public final class C57257IUs implements C253023q5 {
    public final 1Xj A00;
    public final 0sP A01;
    public final boolean A02;

    public final void D2o(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TG.A1U(str, view, clickableSpan);
        this.A01.invoke(new Object());
        if (this.A02) {
            new C253013q4(userSession, this.A00, false).D2o(clickableSpan, view, userSession, str);
        }
    }

    public C57257IUs(1Xj r1, 0sP r2, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = r2;
    }
}
