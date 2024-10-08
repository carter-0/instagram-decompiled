package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fix  reason: case insensitive filesystem */
public final class C50817Fix implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        C309516Yo A0Q = DbU.A0Q(this.A00.requireActivity(), this.A01);
        C49892FBu.A02();
        DbW.A0x(AnonymousClass7TE.A0a(), new E47(), A0Q);
    }

    public C50817Fix(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
