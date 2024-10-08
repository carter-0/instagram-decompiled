package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.customerdetails.navigator.BusinessInboxCustomerDetailsNavigator$openToSDialog$tosDialog$1$onToSAccepted$1;

/* renamed from: X.LqO  reason: case insensitive filesystem */
public final class C65269LqO implements C66485MTo {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C62032KWk A02;
    public final /* synthetic */ String A03;

    public final void Drq() {
        UserSession userSession = this.A01;
        C62032KWk kWk = this.A02;
        OZ3.A00(userSession, "customer_details_tos_accept", kWk.A04, 0Yt.A0E());
        1ES.A07(JTP.A0V(AnonymousClass12T.A00, 994363717), new BusinessInboxCustomerDetailsNavigator$openToSDialog$tosDialog$1$onToSAccepted$1(this.A00, userSession, this, kWk, this.A03, (AnonymousClass4D7) null));
    }

    public C65269LqO(FragmentActivity fragmentActivity, UserSession userSession, C62032KWk kWk, String str) {
        this.A01 = userSession;
        this.A02 = kWk;
        this.A00 = fragmentActivity;
        this.A03 = str;
    }

    public final void Drr() {
        OZ3.A00(this.A01, "customer_details_tos_decline", this.A02.A04, 0Yt.A0E());
    }
}
