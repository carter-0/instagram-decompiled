package X;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Xod  reason: case insensitive filesystem */
public final class C21983Xod {
    public final List A00;
    public final C22015Xr8 A01;
    public final List A02;
    public final C21256XRb A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21983Xod)) {
            return false;
        }
        C21983Xod xod = (C21983Xod) obj;
        if (!this.A03.equals(xod.A03) || !this.A01.equals(xod.A01) || !this.A00.equals(xod.A00) || !this.A02.equals(xod.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A01, C21056XCh.A01(this.A03)) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }

    public C21983Xod(List list, List list2, C22015Xr8 xr8, C21256XRb xRb) {
        this.A03 = xRb;
        this.A01 = xr8;
        this.A00 = list;
        this.A02 = list2;
    }

    public static ArrayList A00(List list) {
        String type;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            if (certificate instanceof X509Certificate) {
                type = String.valueOf(((X509Certificate) certificate).getSubjectDN());
            } else {
                type = certificate.getType();
            }
            A1C.add(type);
        }
        return A1C;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Handshake{tlsVersion=");
        A1A.append(this.A03);
        A1A.append(" cipherSuite=");
        A1A.append(this.A01);
        A1A.append(" peerCertificates=");
        A1A.append(A00(this.A00));
        A1A.append(" localCertificates=");
        return Pxg.A0p(A00(this.A02), A1A);
    }
}
