package X;

import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

public final class OTU {
    public final PrivacyContext A00;
    public final 1aU A01;
    public final Object A02 = new Object();
    public final 1a8 A03 = new 1a8((C269794fh) null);

    public static final void A00(OTU otu, 0sL r5) {
        otu.A03.A02(C72120Owf.A02(otu.A01, C74178PqK.A00(r5, 18), 63).A0H(), PTW.A00);
    }

    public OTU(1aU r4) {
        this.A01 = r4;
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative((SqliteHolder) null, "FBLegacyBroker", "681066249448173");
        0qQ.A07(newPrivacyContextNative);
        this.A00 = newPrivacyContextNative;
    }
}
