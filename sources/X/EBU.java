package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EBU extends 1P0 {
    public final /* synthetic */ C48255Eba A00;

    public EBU(C48255Eba eba) {
        this.A00 = eba;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-1571565771);
        C59689JTv.A08(this.A00.A01, 2131961935, 0);
        AnonymousClass0fD.A0A(-1112237237, A03);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1131793410);
        C47355Dvp dvp = (C47355Dvp) obj;
        int A032 = AnonymousClass0fD.A03(-1282762359);
        C48255Eba eba = this.A00;
        UserSession userSession = eba.A02;
        if (userSession instanceof UserSession) {
            UserSession userSession2 = userSession;
            User A0j = DbT.A0j(userSession2);
            A0j.A0Z();
            DbT.A1S(userSession2, A0j);
            AnonymousClass1Nd.A00(userSession2).A00(new Object());
        }
        eba.A00.post(new C51382FtE(Dbc.A09(dvp.A01, dvp.A00), this));
        AnonymousClass0fD.A0A(-690971758, A032);
        AnonymousClass0fD.A0A(-1142724741, A03);
    }
}
