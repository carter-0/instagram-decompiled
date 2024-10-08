package X;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: X.9Az  reason: invalid class name and case insensitive filesystem */
public final class C374839Az implements AnonymousClass98Q {
    public final SecretKey A00;

    private byte[] A01(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr4 = new byte[(length + 12 + 16)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.A00);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr3, 0, length, bArr4, 12);
            System.arraycopy(instance.getIV(), 0, bArr4, 0, 12);
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            try {
                return A00(bArr, bArr2);
            } catch (AEADBadTagException e) {
                throw e;
            } catch (GeneralSecurityException | ProviderException e2) {
                Log.w("AndroidKeystoreAesGcm", "encountered a potentially transient KeyStore error, will wait and retry", e2);
                try {
                    Thread.sleep((long) ((int) (Math.random() * 100.0d)));
                } catch (InterruptedException unused) {
                }
                return A00(bArr, bArr2);
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    private byte[] A00(byte[] bArr, byte[] bArr2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.A00, gCMParameterSpec);
        instance.updateAAD(bArr2);
        return instance.doFinal(bArr, 12, bArr.length - 12);
    }

    public C374839Az(String str) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        SecretKey secretKey = (SecretKey) instance.getKey(str, (char[]) null);
        this.A00 = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(002.A0R("Keystore cannot load the key with ID: ", str));
        }
    }

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        try {
            return A01(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w("AndroidKeystoreAesGcm", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return A01(bArr, bArr2);
        }
    }
}
