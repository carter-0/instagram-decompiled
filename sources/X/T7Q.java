package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class T7Q implements AnonymousClass0lh {
    public C61046Jvk A00;
    public T7R A01;
    public String A02 = "";
    public boolean A03;
    public final FragmentActivity A04;
    public final C61046Jvk A05;
    public final UserSession A06;
    public final String A07;

    public final void onSessionWillEnd() {
        T7R t7r = this.A01;
        if (t7r != null) {
            t7r.A01();
        }
    }

    public T7Q(FragmentActivity fragmentActivity, C61046Jvk jvk, UserSession userSession, String str) {
        this.A07 = str;
        this.A04 = fragmentActivity;
        this.A06 = userSession;
        this.A05 = jvk;
    }
}
