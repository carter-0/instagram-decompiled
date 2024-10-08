package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.33n  reason: invalid class name and case insensitive filesystem */
public final class C2363833n implements View.OnClickListener {
    public AnonymousClass5j1 A00;
    public String A01;
    public final UserSession A02;
    public final C2357130x A03;

    public C2363833n(UserSession userSession, C2357130x r2) {
        this.A02 = userSession;
        this.A03 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1675409204);
        C2357130x r1 = this.A03;
        C227802jw r4 = r1.A0O;
        r4.A0A().A0p();
        C2357130x.A01(r1, r4.A0A().A0p().A0U.A00);
        this.A00.getClass();
        "business_conversion_netego_click_convert_button".getClass();
        0xI A012 = 0xI.A01("business_conversion_netego_click_convert_button", (String) null);
        r4.A0A().A0p();
        A012.A08(Integer.valueOf(r4.A0A().A0p().A0U.A00), AnonymousClass000.A00(1310));
        A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A00.getId());
        A012.A0C("tracking_token", this.A00.C9L());
        A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, AnonymousClass000.A00(533));
        A012.A0C(Py2.A00(), this.A01);
        C60510iO.A00(this.A02).EFq(A012);
        AnonymousClass0fD.A0C(53589809, A05);
    }
}
