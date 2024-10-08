package X;

import android.security.keystore.KeyGenParameterSpec;

@Deprecated
/* renamed from: X.96y  reason: invalid class name and case insensitive filesystem */
public abstract class C3737996y {
    public static final KeyGenParameterSpec A00 = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
}
