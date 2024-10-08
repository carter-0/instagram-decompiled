package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjS  reason: case insensitive filesystem */
public final class C50848FjS implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("should_hide_like_and_view_count", false);
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("accounts/set_like_and_view_counts/");
        A0a.A0I(AnonymousClass000.A00(4845), booleanQueryParameter);
        1OC A0S = DbU.A0S(A0a, 1XP.class, 1XY.class);
        A0S.A00 = new EDQ((Context) fragmentActivity, userSession, 2, booleanQueryParameter);
        1ES.A03(A0S);
    }

    public C50848FjS(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
