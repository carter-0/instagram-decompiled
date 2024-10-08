package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class ECB extends 1P0 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final F1D A02;
    public final User A03;
    public final String A04;
    public final String A05;

    public ECB(FragmentActivity fragmentActivity, UserSession userSession, F1D f1d, User user, String str, String str2) {
        AnonymousClass7TG.A1O(userSession, user);
        this.A01 = userSession;
        this.A03 = user;
        this.A02 = f1d;
        this.A00 = fragmentActivity;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(1849417822);
        C59689JTv.A0F(this.A00, "fail_send_confirm_email", 2131961936);
        AnonymousClass0fD.A0A(-1447077169, A032);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = AnonymousClass0fD.A03(1041868783);
        Dw4 dw4 = (Dw4) obj;
        int A033 = AnonymousClass0fD.A03(-402880623);
        0qQ.A0B(dw4, 0);
        UserSession userSession = this.A01;
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        A002.A00(new Object());
        User user = this.A03;
        user.A0Z();
        DbT.A1S(userSession, user);
        F1D f1d = this.A02;
        A002.A00(new FWV(f1d.A0G, f1d.A0D));
        if (!dw4.A03 || (str = this.A04) == null) {
            AnonymousClass7TF.A0D().post(new C51393FtP(Dbc.A09(dw4.A01, dw4.A00), this));
        } else {
            C46447Df9.A03();
            String str2 = this.A05;
            AnonymousClass7TF.A1B(userSession, 0, str2);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("key_shared_email", str);
            DbU.A1D(A0a, userSession);
            A0a.putString("send_source", str2);
            AnonymousClass4DH r1 = new AnonymousClass4DH();
            r1.setArguments(A0a);
            DbY.A14(r1, this.A00, userSession);
        }
        AnonymousClass0fD.A0A(924767411, A033);
        AnonymousClass0fD.A0A(768974159, A032);
    }
}
