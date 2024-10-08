package X;

import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;

/* renamed from: X.RsQ  reason: case insensitive filesystem */
public final class C10449RsQ {
    public final X509Certificate A00;
    public final List A01;

    public C10449RsQ(List list) {
        this.A01 = Collections.unmodifiableList(list);
        X509Certificate x509Certificate = null;
        try {
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(002.A0g("-----BEGIN CERTIFICATE-----\n", (String) AnonymousClass7TE.A13(list), "\n-----END CERTIFICATE-----").getBytes()));
            if (generateCertificate instanceof X509Certificate) {
                x509Certificate = (X509Certificate) generateCertificate;
            }
        } catch (Throwable unused) {
        }
        this.A00 = x509Certificate;
    }
}
