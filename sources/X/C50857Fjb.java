package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjb  reason: case insensitive filesystem */
public final class C50857Fjb implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        new FGL(this.A00, DbS.A0O("sync_contacts_action_handler"), userSession, (C51950G8t) null, (C49498Ewd) null).A05((G7Y) null, EX9.QP, true, false, false);
    }

    public C50857Fjb(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
