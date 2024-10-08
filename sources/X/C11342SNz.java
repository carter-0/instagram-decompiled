package X;

import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* renamed from: X.SNz  reason: case insensitive filesystem */
public final class C11342SNz {
    public SoftReference A00 = new SoftReference((Object) null);

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[][] A02() {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            java.lang.ref.SoftReference r0 = r7.A00     // Catch:{ all -> 0x0065 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0065 }
            java.security.cert.X509Certificate[] r1 = (java.security.cert.X509Certificate[]) r1     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x005b
            r5 = 0
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ NoSuchAlgorithmException -> 0x0027, KeyStoreException -> 0x001d }
            javax.net.ssl.TrustManagerFactory r3 = javax.net.ssl.TrustManagerFactory.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0027, KeyStoreException -> 0x001d }
            r3.init(r5)     // Catch:{ NoSuchAlgorithmException -> 0x001b, KeyStoreException -> 0x0019 }
            goto L_0x0030
        L_0x0019:
            r2 = move-exception
            goto L_0x001f
        L_0x001b:
            r2 = move-exception
            goto L_0x0029
        L_0x001d:
            r2 = move-exception
            r3 = r5
        L_0x001f:
            java.lang.Class<X.SNz> r1 = X.C11342SNz.class
            java.lang.String r0 = "Failed to create TrustManagerFactory"
            X.0KC.A05(r1, r0, r2)     // Catch:{ all -> 0x0059 }
            goto L_0x0030
        L_0x0027:
            r2 = move-exception
            r3 = r5
        L_0x0029:
            java.lang.Class<X.SNz> r1 = X.C11342SNz.class
            java.lang.String r0 = "Failed to create TrustManagerFactory"
            X.0KC.A05(r1, r0, r2)     // Catch:{ all -> 0x0059 }
        L_0x0030:
            if (r3 == 0) goto L_0x0047
            javax.net.ssl.TrustManager[] r4 = r3.getTrustManagers()     // Catch:{ all -> 0x0059 }
            int r3 = r4.length     // Catch:{ all -> 0x0059 }
            r2 = 0
        L_0x0038:
            if (r2 >= r3) goto L_0x0047
            r1 = r4[r2]     // Catch:{ all -> 0x0059 }
            boolean r0 = r1 instanceof javax.net.ssl.X509TrustManager     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0043
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1     // Catch:{ all -> 0x0059 }
            goto L_0x0046
        L_0x0043:
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0046:
            r5 = r1
        L_0x0047:
            if (r5 != 0) goto L_0x004d
            r0 = 0
            java.security.cert.X509Certificate[] r1 = new java.security.cert.X509Certificate[r0]     // Catch:{ all -> 0x0065 }
            goto L_0x005b
        L_0x004d:
            java.security.cert.X509Certificate[] r1 = r5.getAcceptedIssuers()     // Catch:{ all -> 0x0065 }
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x0065 }
            r0.<init>(r1)     // Catch:{ all -> 0x0065 }
            r7.A00 = r0     // Catch:{ all -> 0x0065 }
            goto L_0x005b
        L_0x0059:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x005b:
            monitor-exit(r6)
            java.util.List r0 = java.util.Arrays.asList(r1)
            byte[][] r0 = A01(r0)
            return r0
        L_0x0065:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11342SNz.A02():byte[][]");
    }

    public static synchronized ArrayList A00() {
        ArrayList A1C;
        Class<C11342SNz> cls = C11342SNz.class;
        synchronized (cls) {
            A1C = AnonymousClass7TE.A1C();
            try {
                KeyStore instance = KeyStore.getInstance("AndroidCAStore");
                instance.load((InputStream) null, (char[]) null);
                Enumeration<String> aliases = instance.aliases();
                while (aliases.hasMoreElements()) {
                    String nextElement = aliases.nextElement();
                    if (nextElement.startsWith("user:")) {
                        Certificate certificate = instance.getCertificate(nextElement);
                        if (certificate instanceof X509Certificate) {
                            A1C.add((X509Certificate) certificate);
                        }
                    }
                }
            } catch (KeyStoreException e) {
                0KC.A06(cls, "Failed to get user Root CA", e);
            } catch (Throwable th) {
                0KC.A06(cls, "Failed to load AndroidCAStore", th);
            }
        }
        return A1C;
    }

    public static byte[][] A01(List list) {
        byte[][] bArr = new byte[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            try {
                bArr[i] = ((Certificate) list.get(i)).getEncoded();
            } catch (CertificateEncodingException e) {
                0KC.A06(C11342SNz.class, "Failed to encode Root CA", e);
            }
        }
        return bArr;
    }
}
