package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.instagram.common.session.UserSession;

/* renamed from: X.2xI  reason: invalid class name */
public final class AnonymousClass2xI {
    public C20218WnI A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final UserSession A02;
    public final C234192xF A03;
    public final AnonymousClass2xJ A04 = new AnonymousClass2xJ(this);

    public AnonymousClass2xI(UserSession userSession, C234192xF r4) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = r4;
    }

    public final void A00(ViewGroup viewGroup, String str, C62320sa r11, long j, boolean z) {
        ViewGroup viewGroup2 = viewGroup;
        if (this.A03.EtP()) {
            if (viewGroup instanceof ViewPager) {
                ViewParent parent = viewGroup.getParent();
                0qQ.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                viewGroup2 = (ViewGroup) parent;
            }
            if (viewGroup2 != null) {
                viewGroup2.post(new C20346Wpl(viewGroup2, this, str, r11, j, z));
            }
        }
    }
}
