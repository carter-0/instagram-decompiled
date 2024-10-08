package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Lvk  reason: case insensitive filesystem */
public final class C65560Lvk implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C65560Lvk(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("ARGUMENT_CAMERA_SETTINGS_MODE", C62497Kgn.LIVE);
        DbU.A0w(this.A00, A0a, this.A01, ModalActivity.class, "camera_settings");
    }
}
