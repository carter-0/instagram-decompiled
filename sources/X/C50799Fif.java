package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fif  reason: case insensitive filesystem */
public final class C50799Fif implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        Fragment fragment = this.A00;
        DbU.A1K(fragment, DbW.A0W(fragment.requireActivity(), A0a, this.A01, ModalActivity.class, C273654mx.A00(955)));
    }

    public C50799Fif(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
