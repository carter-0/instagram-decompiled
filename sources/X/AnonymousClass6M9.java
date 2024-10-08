package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Locale;

/* renamed from: X.6M9  reason: invalid class name */
public final class AnonymousClass6M9 implements C253023q5, C253043q7 {
    public final View A00;
    public final AnonymousClass6LR A01;
    public final C309706Zh A02;

    private final C255783ui A00(ClickableSpan clickableSpan, View view) {
        AnonymousClass59G A002 = VG3.A00(clickableSpan, view, false);
        int[] iArr = {0, 0};
        this.A00.getLocationOnScreen(iArr);
        int intValue = ((Number) A002.A00).intValue() - iArr[0];
        int intValue2 = ((Number) A002.A01).intValue() - iArr[1];
        C255783ui r1 = new C255783ui();
        r1.A03 = (float) intValue;
        r1.A04 = (float) intValue2;
        r1.A00 = (float) ((Number) A002.A02).intValue();
        return r1;
    }

    public final void D2e(ClickableSpan clickableSpan, View view, String str) {
        0qQ.A0B(str, 0);
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (clickableSpan != null) {
            C255783ui A002 = A00(clickableSpan, view);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            A002.A0k = C281965Ag.A00(lowerCase);
            A002.A11 = AnonymousClass3WT.HASHTAG;
            A002.A1f = "text";
            this.A02.D3F(A002);
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void D2o(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        User A022;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(view, 2);
        0qQ.A0B(clickableSpan, 3);
        boolean A023 = 1P7.A02(userSession);
        AnonymousClass6LR r0 = this.A01;
        if (A023) {
            A022 = W1z.A02(r0, str);
        } else {
            A022 = AnonymousClass6MG.A02(r0, str);
        }
        C255783ui A002 = A00(clickableSpan, view);
        A002.A1B = A022;
        A002.A11 = AnonymousClass3WT.MENTION;
        A002.A1f = "text";
        this.A02.D3F(A002);
    }

    public AnonymousClass6M9(View view, C255773uh r3, C309706Zh r4) {
        this.A00 = view;
        this.A02 = r4;
        this.A01 = r3.A0G();
    }
}
