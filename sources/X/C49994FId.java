package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FId  reason: case insensitive filesystem */
public final class C49994FId implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C2363133g A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ User A04;

    public C49994FId(FragmentActivity fragmentActivity, C2363133g r2, 1Xj r3, AnonymousClass3W1 r4, User user) {
        this.A01 = r2;
        this.A04 = user;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = fragmentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C2363133g r4 = this.A01;
        UserSession userSession = r4.A02;
        AnonymousClass4DU r3 = r4.A04;
        0Aj A0G = DbZ.A0G(AnonymousClass0kN.A01(r3, userSession), this.A04, "unfollow_dialog_confirmed");
        DbW.A15(A0G, r3);
        A0G.Cgf();
        C2363133g.A00(this.A00, r4, this.A02, this.A03);
    }
}
