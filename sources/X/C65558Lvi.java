package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Lvi  reason: case insensitive filesystem */
public final class C65558Lvi implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("persona_id");
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("persona_id", queryParameter);
        DbU.A0w(this.A00, A0a, this.A01, ModalActivity.class, "AI_SETTINGS");
    }

    public C65558Lvi(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
