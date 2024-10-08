package X;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.util.Collections;
import java.util.List;

/* renamed from: X.SvI  reason: case insensitive filesystem */
public final class C12486SvI implements C13738TgA {
    public final /* synthetic */ C11029S6h A00;

    public final void AWF(SJB sjb) {
    }

    public C12486SvI(C11029S6h s6h) {
        this.A00 = s6h;
    }

    public final 2Fk Bsc(C10784Ry5 ry5) {
        0sn r1 = this.A00.A06;
        if (r1 == null) {
            r1 = 0sn.A00;
        }
        List unmodifiableList = Collections.unmodifiableList(r1);
        try {
            CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(C66582MXn.A1a(0rw.A0t(002.A0g("\n            -----BEGIN CERTIFICATE-----\n            ", (String) AnonymousClass7TE.A13(r1), "\n            -----END CERTIFICATE-----\n            ")))));
        } catch (Throwable unused) {
        }
        return new 2Fk(SUj.A09(AnonymousClass7TE.A13(unmodifiableList)));
    }
}
