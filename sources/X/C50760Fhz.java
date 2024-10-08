package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fhz  reason: case insensitive filesystem */
public final class C50760Fhz implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            DbU.A0w(activity, AnonymousClass7TE.A0a(), this.A01, ModalActivity.class, "profile_photo");
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C50760Fhz(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
