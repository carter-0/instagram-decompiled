package X;

import java.security.KeyStore;

public final class TVC extends 0Yg implements C62320sa {
    public static final TVC A00 = new TVC();

    public TVC() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        return instance;
    }
}
