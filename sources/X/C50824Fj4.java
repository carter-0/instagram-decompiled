package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fj4  reason: case insensitive filesystem */
public final class C50824Fj4 implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        if (AnonymousClass7TF.A1V(C66571pQ.A02)) {
            C309516Yo A0M = DbS.A0M(this.A00.requireActivity(), this.A01);
            FC6.A01();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putBoolean(C273654mx.A00(35), false);
            DbW.A0x(A0a, new E3O(), A0M);
        }
    }

    public C50824Fj4(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
