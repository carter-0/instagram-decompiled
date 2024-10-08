package X;

import java.security.cert.X509Certificate;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.TPa  reason: case insensitive filesystem */
public final class C13194TPa implements C13682Ter {
    public final Map A00 = AnonymousClass7TE.A1H();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C13194TPa) && ((C13194TPa) obj).A00.equals(this.A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C13194TPa(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.A00.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.A00.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public final X509Certificate AVD(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.A00.get(x509Certificate.getIssuerX500Principal());
        if (set != null) {
            for (X509Certificate x509Certificate2 : set) {
                try {
                    x509Certificate.verify(x509Certificate2.getPublicKey());
                    return x509Certificate2;
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }
}
