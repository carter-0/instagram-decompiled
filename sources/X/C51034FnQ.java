package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.FnQ  reason: case insensitive filesystem */
public final class C51034FnQ implements G81 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C46521DgO A02;
    public final /* synthetic */ C283155Gi A03;
    public final /* synthetic */ User A04;

    public C51034FnQ(Context context, C46521DgO dgO, C283155Gi r3, User user, int i) {
        this.A02 = dgO;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = user;
        this.A01 = context;
    }

    public final void D5S() {
        C46521DgO.A04(this.A02, this.A03, "remove_follower_confirmed", this.A00);
    }

    public final void DED() {
        C46521DgO dgO = this.A02;
        if (C46521DgO.A05(dgO)) {
            C358248ab A0Y = DbS.A0Y(this.A01);
            A0Y.A08(2131974093);
            A0Y.A04();
            DbT.A1V(A0Y);
        }
        C46521DgO.A04(dgO, this.A03, "remove_follower_failed", this.A00);
    }

    public final void onCancel() {
        C46521DgO.A04(this.A02, this.A03, "remove_follower_canceled", this.A00);
    }

    public final void onSuccess() {
        C46521DgO dgO = this.A02;
        C283155Gi r4 = this.A03;
        C46521DgO.A04(dgO, r4, "remove_follower_success", this.A00);
        this.A04.A13(false);
        C59689JTv.A08(this.A01, 2131968336, 1);
        if (r4.A00 == 101) {
            dgO.A06.EEA(r4, false);
        }
    }
}
