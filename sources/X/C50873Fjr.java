package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fjr  reason: case insensitive filesystem */
public final class C50873Fjr implements G6H {
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A02;
        new FGL(this.A00, this.A01, userSession, (C51950G8t) null, (C49498Ewd) null).A07(EX9.QP);
    }

    public C50873Fjr(Fragment fragment, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = r2;
        this.A02 = userSession;
    }
}
