package X;

import java.security.KeyStore;

public final class TVB extends 0Yg implements C62320sa {
    public static final TVB A00 = new TVB();

    public TVB() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyStore keyStore = C11370SQb.A01;
        if (keyStore == null) {
            0qQ.A0F("keyStore");
            throw AnonymousClass00P.createAndThrow();
        }
        keyStore.deleteEntry("ecp-40bbaf72-50a8-11ec-bf63-0242ac130002");
        return C60340gF.A00;
    }
}
