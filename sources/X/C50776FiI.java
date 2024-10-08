package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiI  reason: case insensitive filesystem */
public final class C50776FiI implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C50776FiI(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        DbY.A14(C46447Df9.A02().A04("quick_promotion"), this.A00, this.A01);
    }
}
