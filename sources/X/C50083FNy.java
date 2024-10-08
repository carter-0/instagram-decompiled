package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FNy  reason: case insensitive filesystem */
public final class C50083FNy implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public C50083FNy(View view, FragmentActivity fragmentActivity, UserSession userSession, User user) {
        this.A02 = userSession;
        this.A03 = user;
        this.A01 = fragmentActivity;
        this.A00 = view;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(327846802);
        UserSession userSession = this.A02;
        AnonymousClass708.A04(this.A01, userSession, this.A03);
        AnonymousClass708.A03(this.A00, userSession);
        AnonymousClass0fD.A0C(1201990353, A05);
    }
}
