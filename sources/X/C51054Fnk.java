package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fnk  reason: case insensitive filesystem */
public final class C51054Fnk implements G7R {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass17A A03;
    public final /* synthetic */ C49936FFp A04;
    public final /* synthetic */ 1Z4 A05;
    public final /* synthetic */ C51922G7q A06;
    public final /* synthetic */ G8B A07;

    public C51054Fnk(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass17A r4, C49936FFp fFp, 1Z4 r6, C51922G7q g7q, G8B g8b) {
        this.A05 = r6;
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = fragmentActivity;
        this.A03 = r4;
        this.A07 = g8b;
        this.A04 = fFp;
        this.A06 = g7q;
    }

    public final void D5T(int i, boolean z) {
        1Z4 r0 = this.A05;
        UserSession userSession = this.A02;
        r0.A01(this.A00, this.A01, userSession, this.A03, this.A04, this.A06, this.A07, i);
    }

    public final void onCancel() {
        G8B g8b = this.A07;
        if (g8b != null) {
            g8b.onCancel();
        }
        UserSession userSession = this.A02;
        User user = this.A03;
        C49962FGu.A05(userSession, this.A04, user.getId(), !user.CXO());
    }
}
