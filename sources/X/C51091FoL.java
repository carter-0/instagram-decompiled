package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.FoL  reason: case insensitive filesystem */
public final class C51091FoL implements G83 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C46521DgO A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C51091FoL(Context context, C46521DgO dgO, User user, String str) {
        this.A01 = dgO;
        this.A02 = user;
        this.A03 = str;
        this.A00 = context;
    }

    public final void DEH(Integer num) {
        if (C46521DgO.A05(this.A01)) {
            C358248ab A0Y = DbS.A0Y(this.A00);
            A0Y.A08(2131974093);
            A0Y.A04();
            DbT.A1V(A0Y);
        }
    }

    public final void onSuccess() {
        this.A02.A1E(false);
        C46521DgO dgO = this.A01;
        int i = C46521DgO.A0A;
        AnonymousClass73V.A0F(dgO.A02, "impression", "unrestrict_success_toast", this.A03);
        C59689JTv.A08(this.A00, 2131952113, 1);
    }
}
