package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjv  reason: case insensitive filesystem */
public final class C50877Fjv implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    public C50877Fjv(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        0qQ.A0B(str, 3);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        FH7.A08(this.A00, this.A01, 2EG.A35, DbT.A10(uri), this.A02);
    }
}
