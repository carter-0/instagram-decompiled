package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.4i3  reason: invalid class name */
public final class AnonymousClass4i3 implements C253023q5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass53Z A01;
    public final /* synthetic */ C381479bp A02;

    public final void D2o(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        String str2;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(view, 2);
        C381479bp r4 = this.A02;
        for (User user : r4.A03) {
            if (user != null) {
                str2 = user.getUsername();
            } else {
                str2 = null;
            }
            if (0qQ.A0K(str2, str)) {
                C238833Dp.A00(userSession).A0B(view, new String[0]);
                AnonymousClass53Z r0 = this.A01;
                int i = this.A00;
                0qQ.A0B(user, 1);
                C271164i0 r02 = r0.A00;
                1Xj r5 = r4.A01;
                AnonymousClass3W1 r6 = r4.A02;
                0qQ.A0B(r5, 0);
                0qQ.A0B(r6, 1);
                r02.A00.D3K(r5, r6, user.getId(), i, false);
                return;
            }
        }
        C271164i0 r03 = this.A01.A00;
        1Xj r2 = r4.A01;
        AnonymousClass3W1 r1 = r4.A02;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r1, 1);
        r03.A00.D3I(r2, r1, true);
    }

    public AnonymousClass4i3(AnonymousClass53Z r1, C381479bp r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
