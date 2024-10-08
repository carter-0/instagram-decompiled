package X;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyStore;

public final class SEF {
    public final Context A00;
    public final KeyStore A01;

    public static void A00(KeyGenParameterSpec.Builder builder, C10785Ry6 ry6) {
        if (ry6.A05) {
            builder.setUserAuthenticationParameters(300, 2);
        }
    }

    public SEF(Context context) {
        try {
            context.getMainExecutor().execute(new TAV());
        } catch (Exception unused) {
        }
        this.A00 = context;
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        this.A01 = instance;
    }
}
