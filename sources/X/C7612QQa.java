package X;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.QQa  reason: case insensitive filesystem */
public final class C7612QQa extends TPF implements 0UK, 0uk {
    public final X509TrustManagerExtensions A00 = new X509TrustManagerExtensions((X509TrustManager) this.A01[0]);
    public final 0UK A01;

    public final void AH6(String str, String str2, X509Certificate[] x509CertificateArr) {
        try {
            this.A01.AH6("ECDHE_ECDSA", str2, x509CertificateArr);
        } catch (CertificateException unused) {
            this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2);
        }
    }

    public final void AH7(String str, String str2, X509Certificate[] x509CertificateArr, boolean z) {
        0uk r1 = this.A01;
        if (r1 instanceof 0uk) {
            try {
                r1.AH7("ECDHE_ECDSA", str2, x509CertificateArr, z);
            } catch (CertificateException unused) {
                this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2);
            }
        } else {
            AH6("ECDHE_ECDSA", str2, x509CertificateArr);
        }
    }

    public C7612QQa(0UK r3) {
        super(r3);
        this.A01 = r3;
    }
}
