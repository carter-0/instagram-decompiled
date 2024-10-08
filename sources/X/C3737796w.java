package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Base64;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: X.96w  reason: invalid class name and case insensitive filesystem */
public final class C3737796w {
    public static volatile C3737796w A01;
    public Context A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.96w, java.lang.Object] */
    public static C3737796w A00(Context context) {
        if (A01 == null) {
            synchronized (C3737796w.class) {
                if (A01 == null) {
                    ? obj = new Object();
                    obj.A00 = context.getApplicationContext();
                    A01 = obj;
                }
            }
        }
        return A01;
    }

    public final KeyPair A01(String str) {
        try {
            AnonymousClass96z A002 = C3737896x.A00(this.A00);
            String string = A002.getString(002.A0R("pk_", str), (String) null);
            String string2 = A002.getString(002.A0R("sk_", str), (String) null);
            if (string == null || string2 == null) {
                throw new Resources.NotFoundException(002.A0g("Key specified by keyAlias: ", str, " does not exist in EncryptedSharedPreferences"));
            }
            try {
                byte[] decode = Base64.decode(string, 0);
                KeyFactory instance = KeyFactory.getInstance("EC");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(string2, 0))));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new KeyStoreException(e);
            }
        } catch (IllegalArgumentException | SecurityException | GeneralSecurityException e2) {
            throw new KeyStoreException(e2);
        }
    }
}
