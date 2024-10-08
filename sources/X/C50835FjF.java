package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjF  reason: case insensitive filesystem */
public final class C50835FjF implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        C49202Er7.A00(uri, this.A00, this.A01);
    }

    public C50835FjF(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
