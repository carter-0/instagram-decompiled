package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.3q4  reason: invalid class name and case insensitive filesystem */
public final class C253013q4 implements C253023q5 {
    public final 1Ng A00;
    public final 1Xj A01;
    public final boolean A02;

    public C253013q4(UserSession userSession, 1Xj r3, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A01 = r3;
        this.A02 = z;
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }

    public final void D2o(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        0qQ.A0B(str, 1);
        View view2 = view;
        0qQ.A0B(view, 2);
        ClickableSpan clickableSpan2 = clickableSpan;
        0qQ.A0B(clickableSpan, 3);
        1Xj r4 = this.A01;
        if (r4 != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            this.A00.A00(new C240303Kj(clickableSpan2, view2, r4, lowerCase, this.A02));
        }
    }
}
