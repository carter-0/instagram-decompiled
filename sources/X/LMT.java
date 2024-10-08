package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class LMT {
    public boolean A00;
    public final UserSession A01;
    public final Activity A02;

    public LMT(Activity activity, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = activity;
    }

    public static final void A00(View view, LMT lmt, C234222xL r6, C226262fy r7, String str) {
        AnonymousClass5Gt r0 = new AnonymousClass5Gt(lmt.A02, new C315476jx((CharSequence) str));
        r0.A03(view);
        r0.A06(r7);
        r0.A04 = r6;
        view.getViewTreeObserver().addOnScrollChangedListener(new C50124FPo(1, view, r0.A00()));
    }
}
