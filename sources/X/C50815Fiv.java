package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fiv  reason: case insensitive filesystem */
public final class C50815Fiv implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            DbS.A0b(fragment.requireActivity(), A0a, this.A01, ModalActivity.class, "ads_data_preferences_notice").A0C(activity);
        }
    }

    public C50815Fiv(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
