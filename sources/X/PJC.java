package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class PJC implements G6H {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1qK, java.lang.Object] */
    public final void CI0(Uri uri, Bundle bundle) {
        if (bundle != null && bundle.get("target_thread_id") != null) {
            AnonymousClass1Nd.A00(this.A02).A00(new Object());
        }
    }

    public PJC(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
    }
}
