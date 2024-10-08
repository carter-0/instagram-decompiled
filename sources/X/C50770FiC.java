package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiC  reason: case insensitive filesystem */
public final class C50770FiC implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C50770FiC(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        AnonymousClass9B9.A00();
        AnonymousClass9BA.A00(this.A01).A01(this.A00, new C50368FaT(this));
    }
}
