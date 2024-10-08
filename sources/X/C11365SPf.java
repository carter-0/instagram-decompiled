package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.SPf  reason: case insensitive filesystem */
public abstract class C11365SPf {
    public static BiometricPrompt.CryptoObject A00(SR5 sr5) {
        IdentityCredential A00;
        if (sr5 == null) {
            return null;
        }
        Cipher cipher = sr5.A01;
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = sr5.A00;
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = sr5.A02;
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (A00 = sr5.A00()) == null) {
            return null;
        }
        return S7q.A00(A00);
    }

    public static SR5 A02(BiometricPrompt.CryptoObject cryptoObject) {
        IdentityCredential A01;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new SR5(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new SR5(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new SR5(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (A01 = S7q.A01(cryptoObject)) == null) {
            return null;
        }
        return new SR5(A01);
    }

    public static SNP A03(SR5 sr5) {
        if (sr5 == null) {
            return null;
        }
        Cipher cipher = sr5.A01;
        if (cipher != null) {
            return new SNP(cipher);
        }
        Signature signature = sr5.A00;
        if (signature != null) {
            return new SNP(signature);
        }
        Mac mac = sr5.A02;
        if (mac != null) {
            return new SNP(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || sr5.A00() == null) {
            return null;
        }
        Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
        return null;
    }

    public static SR5 A01() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("androidxBiometric", 3);
            builder.setBlockModes(new String[]{"CBC"});
            builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance2.init(builder.build());
            instance2.generateKey();
            Key key = instance.getKey("androidxBiometric", (char[]) null);
            Cipher instance3 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance3.init(1, key);
            return new SR5(instance3);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }
}
