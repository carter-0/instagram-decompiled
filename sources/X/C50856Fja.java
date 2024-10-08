package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fja  reason: case insensitive filesystem */
public final class C50856Fja implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        UserSession userSession = this.A01;
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0y = false;
        C331157Pu A002 = A0W.A00();
        FragmentActivity fragmentActivity = this.A00;
        FC8.A02();
        A002.A02(fragmentActivity, C49891FBs.A01(DbS.A0N(userSession), C46649DiU.A04("com.bloks.www.ig_subscriptions.creator_experience.welcome_message_send", AnonymousClass7TE.A1E())));
    }

    public C50856Fja(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
