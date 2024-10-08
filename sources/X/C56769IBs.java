package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IBs  reason: case insensitive filesystem */
public final class C56769IBs implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public C56769IBs(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, User user) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = user;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1149240966);
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            C56585I2p.A02(fragmentActivity, this.A01, this.A02, this.A03, (C62320sa) null, false);
        }
        AnonymousClass0fD.A0C(-1968068565, A05);
    }
}
