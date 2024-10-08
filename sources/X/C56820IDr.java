package X;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.IDr  reason: case insensitive filesystem */
public final class C56820IDr implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C316396la A00;
    public final /* synthetic */ C308976Wk A01;

    public C56820IDr(C316396la r1, C308976Wk r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onGlobalLayout() {
        I40 i40 = I40.A01;
        C308976Wk r0 = this.A01;
        UserSession userSession = r0.A01;
        AnonymousClass5Gv r02 = r0.A00;
        C316396la r4 = this.A00;
        TextView textView = r4.A01;
        synchronized (i40) {
            if (textView != null) {
                textView.postDelayed(new C57867Ihk(userSession, r02), 500);
            }
        }
        TextView textView2 = r4.A01;
        if (textView2 != null) {
            C51971G9r.A0z(textView2, this);
        }
    }
}
