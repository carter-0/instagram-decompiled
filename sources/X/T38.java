package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class T38 implements C13961TmO {
    public static final T38 A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;
    public static final C11357SOt A03;
    public static final C11357SOt A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.T38] */
    static {
        SUa A032 = SUa.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        RDN rdn = RDN.DEFAULT;
        A01 = SUa.A04(rdn, A032);
        A02 = SUa.A06(rdn, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A03 = SUa.A07(rdn, "version");
        A04 = SUa.A08(rdn, "featureLevel");
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        throw null;
    }
}
