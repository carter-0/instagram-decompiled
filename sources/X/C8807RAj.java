package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.RAj  reason: case insensitive filesystem */
public final class C8807RAj extends 1DU {
    public byte[] A00;
    public final KeyStore.PrivateKeyEntry A01;
    public final SharedPreferences A02;
    public final String A03;

    public final String A03() {
        return "AsymmetricTransformer";
    }

    public final SharedPreferences A02() {
        return this.A02;
    }

    public final SecretKey A04(boolean z) {
        SecretKey secretKey;
        byte[] bArr;
        byte[] bArr2 = this.A00;
        if ((bArr2 != null || this.A02.contains(this.A03)) && !z) {
            if (bArr2 == null) {
                bArr2 = Base64.decode(this.A02.getString(this.A03, (String) null), 0);
            }
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(4, this.A01.getPrivateKey());
                secretKey = (SecretKey) instance.unwrap(bArr2, "AES", 3);
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                0wb.A07("AsymmetricTransformer", e);
                secretKey = null;
            }
            if (secretKey == null) {
                throw new InvalidKeyException("No key found");
            }
        } else {
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            secretKey = new SecretKeySpec(bArr3, AnonymousClass000.A00(858));
            try {
                Cipher instance2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance2.init(3, this.A01.getCertificate().getPublicKey());
                bArr = instance2.wrap(secretKey);
            } catch (InvalidKeyException | NoSuchAlgorithmException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                0wb.A07("AsymmetricTransformer", e2);
                bArr = null;
            }
            this.A00 = bArr;
            Pxf.A13(this.A02.edit(), this.A03, Base64.encodeToString(this.A00, 0));
        }
        return secretKey;
    }

    public final Integer CAo() {
        return AnonymousClass05K.A01;
    }

    public final String getName() {
        return this.A03;
    }

    public C8807RAj(Context context, String str, KeyStore.PrivateKeyEntry privateKeyEntry) {
        this.A03 = str;
        this.A01 = privateKeyEntry;
        this.A02 = Pxe.A0H(context, "pair_prefs");
    }
}
