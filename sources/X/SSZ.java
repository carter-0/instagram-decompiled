package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.security.auth.x500.X500Principal;

public final class SSZ {
    public final SharedPreferences A00;
    public final C8274QnG A01;
    public final SEF A02;
    public final String A03;
    public final List A04 = new CopyOnWriteArrayList();

    public static synchronized PublicKey A01(SSZ ssz, String str) {
        PublicKey publicKey;
        synchronized (ssz) {
            SEF sef = ssz.A02;
            sef.getClass();
            Certificate certificate = sef.A01.getCertificate(002.A0R(ssz.A03, str));
            if (certificate == null) {
                publicKey = null;
            } else {
                publicKey = certificate.getPublicKey();
            }
        }
        return publicKey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.0KC.A0F("DefaultAuthTicketManager", "Delete AT", r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Exception A07(java.lang.String r7) {
        /*
            r6 = this;
            r5 = r6
            monitor-enter(r5)
            android.content.SharedPreferences r0 = r6.A00     // Catch:{ all -> 0x0044 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = r6.A03     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = X.002.A0R(r4, r7)     // Catch:{ all -> 0x0044 }
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch:{ all -> 0x0044 }
            r0.apply()     // Catch:{ all -> 0x0044 }
            X.SEF r0 = r6.A02     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = X.002.A0R(r4, r7)     // Catch:{ all -> 0x0044 }
            java.security.KeyStore r0 = r0.A01     // Catch:{ all -> 0x0044 }
            r0.deleteEntry(r1)     // Catch:{ all -> 0x0044 }
        L_0x0022:
            java.util.List r3 = r6.A04     // Catch:{ all -> 0x0044 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0028:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x004f
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0044 }
            X.SNj r1 = (X.C11330SNj) r1     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = X.002.A0R(r4, r0)     // Catch:{ all -> 0x0044 }
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0028
            r3.remove(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0028
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            java.lang.String r1 = "DefaultAuthTicketManager"
            java.lang.String r0 = "Delete AT"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x0052 }
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            monitor-exit(r5)
            return r2
        L_0x0052:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSZ.A07(java.lang.String):java.lang.Exception");
    }

    public static SSZ A00(Context context, SharedPreferences sharedPreferences, AnonymousClass5A3 r5, C10305Rq3 rq3, String str) {
        SEF sef;
        try {
            sef = new SEF(context);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            0KC.A0F("DefaultAuthTicketManager", "Failed to create store", e);
            sef = null;
        }
        return new SSZ(sharedPreferences, sef, r5, rq3, str);
    }

    public static Signature A02(SSZ ssz, String str) {
        PrivateKey privateKey;
        String str2;
        Signature instance;
        if (str.equalsIgnoreCase("MFT_TRUSTED_DEVICE")) {
            2Mg r2 = new 2Mg("autofill_key");
            instance = Signature.getInstance("SHA256withRSA");
            privateKey = r2.A01.getPrivate();
        } else {
            SEF sef = ssz.A02;
            if (sef != null) {
                privateKey = (PrivateKey) sef.A01.getKey(002.A0R(ssz.A03, str), (char[]) null);
                if (privateKey.getAlgorithm().equalsIgnoreCase("RSA")) {
                    str2 = "SHA256withRSA";
                } else {
                    str2 = "SHA256withECDSA";
                }
                instance = Signature.getInstance(str2);
            } else {
                throw new GeneralSecurityException("Key Store is null!");
            }
        }
        instance.initSign(privateKey);
        return instance;
    }

    public final C11330SNj A04() {
        PublicKey A012 = A01(this, "MFT_TRUSTED_DEVICE");
        if (A012 == null) {
            return null;
        }
        String encodeToString = Base64.encodeToString(A012.getEncoded(), 2);
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(A012.getEncoded());
        return C11330SNj.A01(AnonymousClass05K.A00, "MFT_TRUSTED_DEVICE", Pxg.A0z(instance.digest()), encodeToString, "MFT_TRUSTED_DEVICE", AnonymousClass7TE.A1C());
    }

    public final C11330SNj A05(C11024S6b s6b, C11330SNj sNj) {
        02V.A06(sNj.A05.equalsIgnoreCase(s6b.A04), "Local Auth Ticket and Server At fingerprint does not match");
        02V.A06(sNj.A03.equalsIgnoreCase(s6b.A02), "Auth Ticket and Server AT Type is differ!");
        C11330SNj A002 = C11330SNj.A00(s6b, sNj.A00, sNj.A02, sNj.A07, System.currentTimeMillis());
        String str = A002.A02;
        Pxf.A13(this.A00.edit(), 002.A0R(this.A03, str), A002.A06);
        this.A04.add(A002);
        return A002;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.Rwc, java.lang.Object] */
    public final C11330SNj A06(String str, List list) {
        Integer num;
        String A0z;
        String encodeToString;
        String str2 = "MFT_TRUSTED_DEVICE";
        String str3 = str;
        if (str2.equalsIgnoreCase(str3)) {
            2Mg r0 = new 2Mg("autofill_key");
            num = AnonymousClass05K.A0C;
            KeyPair keyPair = r0.A01;
            PublicKey publicKey = keyPair.getPublic();
            0qQ.A07(publicKey);
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(publicKey.getEncoded());
            A0z = Pxg.A0z(instance.digest());
            PublicKey publicKey2 = keyPair.getPublic();
            0qQ.A07(publicKey2);
            encodeToString = Base64.encodeToString(publicKey2.getEncoded(), 2);
        } else {
            str2 = AnonymousClass7TF.A0c();
            num = AnonymousClass05K.A00;
            boolean equalsIgnoreCase = "BIO".equalsIgnoreCase(str3);
            synchronized (this) {
                this.A02.getClass();
                String A0R = 002.A0R(this.A03, str2);
                ? obj = new Object();
                obj.A00 = A0R;
                obj.A03 = equalsIgnoreCase;
                Calendar instance2 = Calendar.getInstance();
                Calendar instance3 = Calendar.getInstance();
                instance3.add(1, 20);
                if (obj.A01 == null) {
                    obj.A01 = BigInteger.ONE;
                }
                if (obj.A02 == null) {
                    obj.A02 = new X500Principal(002.A0g("CN=", obj.A00, " CA Certificate"));
                }
                String str4 = obj.A00;
                str4.getClass();
                C10785Ry6 ry6 = new C10785Ry6(str4, obj.A01, instance2.getTime(), instance3.getTime(), obj.A02, obj.A03);
                KeyGenParameterSpec.Builder digests = new KeyGenParameterSpec.Builder(ry6.A00, 12).setKeySize(256).setCertificateSerialNumber(ry6.A01).setCertificateSubject(ry6.A04).setCertificateNotBefore(ry6.A03).setCertificateNotAfter(ry6.A02).setUserAuthenticationRequired(ry6.A05).setDigests(new String[]{"SHA-256"});
                digests.setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1"));
                if (C11096S9x.A01()) {
                    SEF.A00(digests, ry6);
                }
                KeyGenParameterSpec build = digests.build();
                KeyPairGenerator instance4 = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                instance4.initialize(build);
                PublicKey publicKey3 = instance4.generateKeyPair().getPublic();
                MessageDigest instance5 = MessageDigest.getInstance("SHA-256");
                instance5.update(publicKey3.getEncoded());
                A0z = Pxg.A0z(instance5.digest());
            }
            synchronized (this) {
                PublicKey A012 = A01(this, str2);
                if (A012 != null) {
                    encodeToString = Base64.encodeToString(A012.getEncoded(), 2);
                } else {
                    0KC.A0O("DefaultAuthTicketManager", "No public key found for alias %s", new Object[]{str2});
                    throw new KeyStoreException(002.A0R("No public key found for alias ", str2));
                }
            }
        }
        return C11330SNj.A01(num, str3, A0z, encodeToString, str2, list);
    }

    public final String A08(C11330SNj sNj, byte[] bArr) {
        PrivateKey privateKey;
        boolean equalsIgnoreCase;
        String str;
        Signature instance;
        String str2 = sNj.A02;
        if (str2.equalsIgnoreCase("MFT_TRUSTED_DEVICE")) {
            2Mg r2 = new 2Mg("autofill_key");
            equalsIgnoreCase = true;
            instance = Signature.getInstance("SHA256withRSA");
            privateKey = r2.A01.getPrivate();
        } else {
            SEF sef = this.A02;
            if (sef != null) {
                privateKey = (PrivateKey) sef.A01.getKey(002.A0R(this.A03, str2), (char[]) null);
                equalsIgnoreCase = privateKey.getAlgorithm().equalsIgnoreCase("RSA");
                if (equalsIgnoreCase) {
                    str = "SHA256withRSA";
                } else {
                    str = "SHA256withECDSA";
                }
                instance = Signature.getInstance(str);
            } else {
                throw new GeneralSecurityException("Key Store is null!");
            }
        }
        instance.initSign(privateKey);
        return C11096S9x.A00(instance, bArr, !equalsIgnoreCase);
    }

    public SSZ(SharedPreferences sharedPreferences, SEF sef, AnonymousClass5A3 r4, C10305Rq3 rq3, String str) {
        this.A03 = str;
        this.A02 = sef;
        this.A00 = sharedPreferences;
        this.A01 = new C8274QnG(this, r4, rq3);
    }

    public static HashMap A03(SSZ ssz) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0u = AnonymousClass7TF.A0u(ssz.A00.getAll());
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (A1J.getValue() instanceof String) {
                String A13 = DbT.A13(A1J);
                String str = ssz.A03;
                if (A13.startsWith(str)) {
                    A1E.put(DbT.A13(A1J).substring(str.length()), A1J.getValue());
                }
            }
        }
        return A1E;
    }
}
