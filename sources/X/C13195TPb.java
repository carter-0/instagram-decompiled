package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.TPb  reason: case insensitive filesystem */
public final class C13195TPb implements C13682Ter {
    public final Method A00;
    public final X509TrustManager A01;

    public final X509Certificate AVD(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.A00.invoke(this.A01, new Object[]{x509Certificate});
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException unused) {
            throw Pxe.A0e("unable to get issues and signature");
        } catch (InvocationTargetException unused2) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13195TPb)) {
            return false;
        }
        C13195TPb tPb = (C13195TPb) obj;
        return this.A01.equals(tPb.A01) && this.A00.equals(tPb.A00);
    }

    public final int hashCode() {
        return this.A01.hashCode() + AnonymousClass7TE.A0K(this.A00);
    }

    public C13195TPb(Method method, X509TrustManager x509TrustManager) {
        this.A00 = method;
        this.A01 = x509TrustManager;
    }
}
