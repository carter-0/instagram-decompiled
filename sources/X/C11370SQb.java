package X;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyStore;
import javax.crypto.Cipher;

/* renamed from: X.SQb  reason: case insensitive filesystem */
public final class C11370SQb {
    public static KeyPair A00;
    public static KeyStore A01;
    public static Cipher A02;
    public static final C11370SQb A03 = new Object();

    public static final void A01(Context context) {
        if (A01 == null || A00 == null || A02 == null) {
            KeyStore keyStore = (KeyStore) A00(TVC.A00);
            if (keyStore != null) {
                A01 = keyStore;
            }
            if (A01 != null) {
                Cipher cipher = (Cipher) A00(TVD.A00);
                if (cipher != null) {
                    A02 = cipher;
                }
                KeyPair keyPair = (KeyPair) A00(new C13346TVt(context, 14));
                if (keyPair != null) {
                    A00 = keyPair;
                }
            }
        }
    }

    public static final Object A00(C62320sa r2) {
        try {
            return r2.invoke();
        } catch (GeneralSecurityException e) {
            0KC.A0F("CryptographyUtil", "Security Exception:", e);
            return null;
        }
    }
}
