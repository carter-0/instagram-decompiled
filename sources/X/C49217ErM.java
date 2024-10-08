package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.ErM  reason: case insensitive filesystem */
public abstract class C49217ErM {
    public static final void A00(0lg r6, String str) {
        double A00 = Dbb.A00(r6);
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "look_up_with_google_id_tokens");
        Dbc.A0X(A0e, A00, A002);
        DbS.A1H(A0e, "user_lookup");
        A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        DbW.A11(A0e);
        FH8.A04(A0e);
        FH8.A09(A0e, r6);
        DbT.A1P(A0e);
        A0e.Cgf();
    }
}
