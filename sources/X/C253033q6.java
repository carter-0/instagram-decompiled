package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.3q6  reason: invalid class name and case insensitive filesystem */
public final class C253033q6 implements C253043q7 {
    public final 1Ng A00;
    public final 1Xj A01;
    public final boolean A02;

    public C253033q6(UserSession userSession, 1Xj r3, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A01 = r3;
        this.A02 = z;
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }

    public final void D2e(ClickableSpan clickableSpan, View view, String str) {
        0qQ.A0B(str, 0);
        1Xj r4 = this.A01;
        if (r4 != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            this.A00.A00(new C240323Kl(clickableSpan, view, r4, lowerCase, this.A02));
        }
    }
}
