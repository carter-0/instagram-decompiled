package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.fragment.NewsfeedFragment;

/* renamed from: X.3Jf  reason: invalid class name and case insensitive filesystem */
public final class C240013Jf implements AnonymousClass2gW {
    public final /* synthetic */ AnonymousClass35Q A00;

    public C240013Jf(AnonymousClass35Q r1) {
        this.A00 = r1;
    }

    public final void DsA() {
        AnonymousClass35Q r0 = this.A00;
        FragmentActivity fragmentActivity = r0.A02;
        UserSession userSession = r0.A03;
        AB2.A01(userSession, r0.A04, "main_inbox");
        C309516Yo r2 = new C309516Yo(fragmentActivity, userSession);
        r2.A0B((Bundle) null, new NewsfeedFragment());
        r2.A08();
        r2.A05();
    }
}
