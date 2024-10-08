package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.Fio  reason: case insensitive filesystem */
public final class C50808Fio implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C49805F7r.A01(activity, 28D.A4B, this.A01, (PendingRecipient) null, true, true);
        }
    }

    public C50808Fio(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
