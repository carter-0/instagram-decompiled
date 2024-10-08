package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.IWd  reason: case insensitive filesystem */
public final class C57294IWd implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        Bundle A0B = DbV.A0B(uri, 0);
        A0B.putString("effect_id", uri.getQueryParameter("effect_id"));
        DbU.A0w(this.A00, A0B, this.A01, ModalActivity.class, "effects_page");
    }

    public C57294IWd(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
