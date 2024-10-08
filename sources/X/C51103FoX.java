package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.FoX  reason: case insensitive filesystem */
public final class C51103FoX implements C51889G6e {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C46521DgO A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;

    public C51103FoX(Context context, C46521DgO dgO, User user, String str) {
        this.A01 = dgO;
        this.A02 = user;
        this.A03 = str;
        this.A00 = context;
    }

    public final void DwT(String str) {
        this.A02.A1E(true);
        C46521DgO dgO = this.A01;
        int i = C46521DgO.A0A;
        AnonymousClass73V.A0F(dgO.A02, "impression", "restrict_success_toast", this.A03);
        C59689JTv.A08(this.A00, 2131952092, 1);
    }
}
