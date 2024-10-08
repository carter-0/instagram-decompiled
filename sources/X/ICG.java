package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

public final class ICG implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass5j1 A01;
    public final /* synthetic */ C53157GjT A02;
    public final /* synthetic */ C57249IUk A03;
    public final /* synthetic */ C266954ac A04;

    public ICG(UserSession userSession, AnonymousClass5j1 r2, C53157GjT gjT, C57249IUk iUk, C266954ac r5) {
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = iUk;
        this.A00 = userSession;
        this.A02 = gjT;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(850268959);
        "business_conversion_netego_selected_reason".getClass();
        0xI A012 = 0xI.A01("business_conversion_netego_selected_reason", (String) null);
        C266954ac r2 = this.A04;
        C266954ac r0 = C266954ac.NOT_BUSINESS;
        if (r2 == r0 || r2 == (r0 = C266954ac.NO_TIME)) {
            A012.A0C("reason", r0.toString());
        }
        AnonymousClass5j1 r22 = this.A01;
        A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r22.getId());
        A012.A0C("tracking_token", r22.C9L());
        A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AnonymousClass000.A00(533));
        C57249IUk iUk = this.A03;
        A012.A0C(C21058XCk.A00(), iUk.A04);
        DbU.A1R(A012, this.A00);
        iUk.EZ9(C266954ac.FINISHED);
        C2363733m.A06(this.A02);
        AnonymousClass0fD.A0C(1896317302, A05);
    }
}
