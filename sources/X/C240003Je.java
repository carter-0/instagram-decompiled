package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.fragment.NewsfeedFragment;

/* renamed from: X.3Je  reason: invalid class name and case insensitive filesystem */
public final class C240003Je implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass35Q A00;

    public C240003Je(AnonymousClass35Q r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1463987344);
        AnonymousClass35Q r0 = this.A00;
        FragmentActivity fragmentActivity = r0.A02;
        UserSession userSession = r0.A03;
        AB2.A01(userSession, r0.A04, "main_inbox");
        C309516Yo r2 = new C309516Yo(fragmentActivity, userSession);
        r2.A0B((Bundle) null, new NewsfeedFragment());
        r2.A08();
        r2.A05();
        AnonymousClass0fD.A0C(1573458106, A05);
    }
}
