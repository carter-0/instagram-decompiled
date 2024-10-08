package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Lvh  reason: case insensitive filesystem */
public final class C65557Lvh implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        DbS.A0b(fragment.requireActivity(), bundle, this.A01, ModalActivity.class, C273654mx.A00(860)).A0C(fragment.getContext());
    }

    public C65557Lvh(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
