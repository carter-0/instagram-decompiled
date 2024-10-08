package X;

import com.instagram.common.session.UserSession;

public final class EBC extends 1P0 {
    public String A00;
    public final UserSession A01;

    public EBC(UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1464613762);
        int A032 = AnonymousClass0fD.A03(1138591808);
        AnonymousClass1Nd.A00(this.A01).A00(new C323986yQ(((CF2) obj).A00, this.A00));
        AnonymousClass0fD.A0A(1030550540, A032);
        AnonymousClass0fD.A0A(2077553248, A03);
    }
}
