package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fi0  reason: case insensitive filesystem */
public final class C50761Fi0 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Dbb.A11(new C16298UsI(), this.A00, this.A01);
    }

    public C50761Fi0(FragmentActivity fragmentActivity, UserSession userSession) {
        AnonymousClass7TG.A1O(fragmentActivity, userSession);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
