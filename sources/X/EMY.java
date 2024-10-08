package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class EMY extends C47907EMb {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Double A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EMY(Fragment fragment, AnonymousClass0iw r11, AnonymousClass0aP r12, UserSession userSession, G8H g8h, C46634DiE diE, Double d, String str, String str2, String str3, String str4, String str5) {
        super(fragment, r11, r12, g8h, diE, str, str2);
        this.A00 = userSession;
        this.A01 = d;
        this.A03 = str3;
        this.A04 = str4;
        this.A02 = str5;
    }

    public final void A04(EM4 em4) {
        int A032 = AnonymousClass0fD.A03(1572492987);
        super.A04(em4);
        UserSession userSession = this.A00;
        userSession.getClass();
        double doubleValue = this.A01.doubleValue();
        String str = this.A03;
        String str2 = this.A04;
        C46400DeN.A03(userSession, DbV.A0q(str2), DbV.A0q(str2), "intra_app", str, this.A02, (String) null, (String) null, (String) null, (String) null, doubleValue, false, true, true);
        AnonymousClass0fD.A0A(1909963606, A032);
    }

    public final void onFail(C268654dm r3) {
        int A032 = AnonymousClass0fD.A03(-379191514);
        super.onFail(r3);
        AnonymousClass0fD.A0A(746284879, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0fD.A0A(2049177287, C47695EDe.A00(this, obj, -558343583));
    }
}
