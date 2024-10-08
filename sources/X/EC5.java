package X;

import com.instagram.common.session.UserSession;

public final class EC5 extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public EC5(UserSession userSession, String str, String str2, String str3, int i) {
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A02 = str3;
    }

    public final void onFail(C268654dm r8) {
        int A032 = AnonymousClass0fD.A03(-1110107045);
        0qQ.A0B(r8, 0);
        EC5.super.onFail(r8);
        AnonymousClass1Nd.A00(this.A01).A00(new AnonymousClass7P2(this.A04, this.A03, this.A00, false));
        AnonymousClass0fD.A0A(-1926575050, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = AnonymousClass0fD.A03(-98625440);
        AnonymousClass1XT r10 = (AnonymousClass1XT) obj;
        int A0D = AnonymousClass7TG.A0D(r10, 63436318);
        EC5.super.onSuccess(r10);
        UserSession userSession = this.A01;
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        String str2 = this.A04;
        String str3 = this.A03;
        A002.A00(new AnonymousClass7P2(str2, str3, this.A00, true));
        C49339Etu etu = ((C47337Dv4) r10).A00;
        if (!(etu == null || (str = etu.A00) == null)) {
            C69909NuB.A00(userSession).A04(str3, this.A02, str);
        }
        AnonymousClass0fD.A0A(1158808983, A0D);
        AnonymousClass0fD.A0A(-308200525, A032);
    }
}
