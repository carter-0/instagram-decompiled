package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class T4M implements C13961TmO {
    public static final T4M A00 = new Object();
    public static final C11357SOt A01;
    public static final C11357SOt A02;
    public static final C11357SOt A03;
    public static final C11357SOt A04;
    public static final C11357SOt A05;
    public static final C11357SOt A06;
    public static final C11357SOt A07;
    public static final C11357SOt A08;
    public static final C11357SOt A09;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.T4M, java.lang.Object] */
    static {
        SUa A032 = SUa.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        RDN rdn = RDN.DEFAULT;
        A01 = SUa.A04(rdn, A032);
        A02 = SUa.A06(rdn, "version");
        A03 = SUa.A07(rdn, "source");
        A04 = SUa.A08(rdn, "uri");
        A05 = SUa.A09(rdn, "hash");
        A06 = SUa.A0A(rdn, "modelType");
        A07 = SUa.A0B(rdn, "size");
        A08 = SUa.A05(rdn, SUa.A03("hasLabelMap"), 8);
        A09 = SUa.A05(rdn, SUa.A03("isManifestModel"), 9);
    }

    public final /* bridge */ /* synthetic */ void ARq(Object obj, Object obj2) {
        throw null;
    }
}
