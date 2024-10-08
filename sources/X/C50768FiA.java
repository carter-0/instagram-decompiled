package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiA  reason: case insensitive filesystem */
public final class C50768FiA implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        if (AnonymousClass9B8.A07(userSession)) {
            AnonymousClass9B9.A00();
            C49951FGg.A01(this.A00, userSession, EV9.AI_HOME, C69503Nml.A0E.toString(), (String) null, false);
        }
    }

    public C50768FiA(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
