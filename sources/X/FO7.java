package X;

import android.view.View;
import com.instagram.user.model.User;

public final class FO7 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C46848DmQ A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ boolean A04;

    public FO7(C46848DmQ dmQ, User user, Object obj, int i, boolean z) {
        this.A04 = z;
        this.A01 = dmQ;
        this.A02 = user;
        this.A00 = i;
        this.A03 = obj;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-621790861);
        boolean z = this.A04;
        C46848DmQ dmQ = this.A01;
        if (z) {
            E23 e23 = dmQ.A0A;
            User user = this.A02;
            String id = user.getId();
            Object A0r = DbV.A0r(user, dmQ.A0C);
            C46848DmQ.A00(dmQ, this.A00);
            E23.A01(e23, id);
            if (A0r != null && e23.A01 == null) {
                str = "discoverAccountsLogger";
            }
            AnonymousClass0fD.A0C(2102832540, A05);
            return;
        }
        E23 e232 = dmQ.A0A;
        Object obj = this.A03;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.api.schemas.SuggestedUserItem");
        C47217Dt4 dt4 = (C47217Dt4) obj;
        int A002 = C46848DmQ.A00(dmQ, this.A00);
        String A012 = C46848DmQ.A01(dmQ, this.A02.getId());
        0qQ.A0B(dt4, 0);
        User user2 = dt4.A00;
        if (user2 != null) {
            E23.A01(e232, user2.getId());
        }
        String str2 = dt4.A05;
        if (user2 != null) {
            C230012om r2 = e232.A02;
            if (r2 == null) {
                str = "recommendedUserLogger";
            } else {
                r2.A0B(new AnonymousClass6KN(E23.A00(dt4, user2, str2, A012, A002)));
            }
        }
        AnonymousClass0fD.A0C(2102832540, A05);
        return;
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
