package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Scu  reason: case insensitive filesystem */
public final class C11595Scu implements 1MD {
    public static final C11595Scu A00 = new C11595Scu();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr r5;
        C250663lr A03;
        C250663lr A01;
        String A07;
        if (!(obj instanceof C7791QXc) || (r5 = (C250663lr) obj) == null || (A03 = r5.A03(QVL.class, "shipping_address", 482258055)) == null || (A01 = A03.A01(QVN.class, -1235561061)) == null || (A07 = A01.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) == null) {
            return null;
        }
        return DbV.A0q(A07);
    }
}
