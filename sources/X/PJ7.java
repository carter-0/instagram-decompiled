package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public final class PJ7 implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            DbS.A0b(fragment.requireActivity(), A0a, this.A01, ModalActivity.class, "story_template_discovery_surface").A0C(activity);
        }
    }

    public PJ7(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
