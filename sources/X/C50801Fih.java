package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fih  reason: case insensitive filesystem */
public final class C50801Fih implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        FHB.A0C(AnonymousClass7TG.A0P("media_id", uri.getQueryParameter("media_id"), AnonymousClass7TE.A1L("entryPoint", DbZ.A0h(uri))), this.A00.requireActivity(), this.A01);
    }

    public C50801Fih(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
