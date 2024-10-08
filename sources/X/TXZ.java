package X;

import android.security.keystore.KeyGenParameterSpec;

public final class TXZ extends 0Yg implements 0sP {
    public static final TXZ A00 = new TXZ();

    public TXZ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        KeyGenParameterSpec.Builder builder = (KeyGenParameterSpec.Builder) obj;
        0qQ.A0B(builder, 0);
        builder.setDigests(new String[]{"SHA-256", "SHA-1"});
        builder.setEncryptionPaddings(new String[]{"OAEPPadding"});
        return C60340gF.A00;
    }
}
