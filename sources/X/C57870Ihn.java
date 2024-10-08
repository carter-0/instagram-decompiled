package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ihn  reason: case insensitive filesystem */
public final class C57870Ihn implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public C57870Ihn(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void run() {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
        A0Q.A0B((Bundle) null, C55243HeY.A00((C59725JVj) null, userSession, false));
        A0Q.A04();
    }
}
