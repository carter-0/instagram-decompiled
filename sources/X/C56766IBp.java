package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.IBp  reason: case insensitive filesystem */
public final class C56766IBp implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3W1 A03;

    public C56766IBp(Fragment fragment, UserSession userSession, 1Xj r3, AnonymousClass3W1 r4) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(988193402);
        UserSession userSession = this.A01;
        Fragment fragment = this.A00;
        2EG r9 = 2EG.A27;
        AnonymousClass2kQ A012 = C227942kP.A01("instagram_deeplink", true, true);
        1Xj r2 = this.A02;
        AnonymousClass3W1 r1 = this.A03;
        Q03 q03 = new Q03(fragment, userSession, new C271794jb(userSession, r2, r1.A06()), A012, r9);
        q03.A01(r2);
        q03.A09 = r1.A03;
        q03.A0B = r1.getPosition();
        q03.A0K = r1;
        C51969G9p.A1L(q03);
        AnonymousClass0fD.A0C(-42711815, A05);
    }
}
