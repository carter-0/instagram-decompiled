package X;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: X.SOu  reason: case insensitive filesystem */
public final class C11358SOu {
    public static final C11358SOu A02 = new C11358SOu(new LinkedHashSet(AnonymousClass7TE.A1C()), (C9113RPk) null);
    public final Set A00;
    public final C9113RPk A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C11358SOu)) {
                return false;
            }
            C11358SOu sOu = (C11358SOu) obj;
            if (!2Ob.A00(this.A01, sOu.A01) || !this.A00.equals(sOu.A00)) {
                return false;
            }
        }
        return true;
    }

    public static String A00(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            try {
                return 002.A0R("sha256/", TAH.A03(MessageDigest.getInstance("SHA-256").digest(TAH.A03(certificate.getPublicKey().getEncoded()).data)).A06());
            } catch (NoSuchAlgorithmException e) {
                throw Pxe.A0e(e);
            }
        } else {
            throw AnonymousClass7TE.A0w("Certificate pinning requires X509 certificates");
        }
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + this.A00.hashCode();
    }

    public C11358SOu(Set set, C9113RPk rPk) {
        this.A00 = set;
        this.A01 = rPk;
    }

    public final void A01(String str, List list) {
        List emptyList = Collections.emptyList();
        Iterator it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("matches");
        } else if (!emptyList.isEmpty()) {
            C9113RPk rPk = this.A01;
            ArrayList arrayList = list;
            if (rPk != null) {
                if (rPk instanceof TZ1) {
                    TZ1 tz1 = (TZ1) rPk;
                    ArrayDeque arrayDeque = new ArrayDeque(list);
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    A1C.add(arrayDeque.removeFirst());
                    int i = 0;
                    boolean z = false;
                    do {
                        X509Certificate x509Certificate = (X509Certificate) A1C.get(A1C.size() - 1);
                        X509Certificate AVD = tz1.A00.AVD(x509Certificate);
                        if (AVD != null) {
                            if (A1C.size() > 1 || !x509Certificate.equals(AVD)) {
                                A1C.add(AVD);
                            }
                            if (AVD.getIssuerDN().equals(AVD.getSubjectDN())) {
                                try {
                                    AVD.verify(AVD.getPublicKey());
                                    arrayList = A1C;
                                } catch (GeneralSecurityException unused) {
                                }
                            }
                            z = true;
                        } else {
                            Iterator it2 = arrayDeque.iterator();
                            while (it2.hasNext()) {
                                X509Certificate x509Certificate2 = (X509Certificate) it2.next();
                                if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                                    try {
                                        x509Certificate.verify(x509Certificate2.getPublicKey());
                                        it2.remove();
                                        A1C.add(x509Certificate2);
                                    } catch (GeneralSecurityException unused2) {
                                        continue;
                                    }
                                }
                            }
                            arrayList = A1C;
                            if (!z) {
                                throw new SSLPeerUnverifiedException(AnonymousClass7TG.A0m(x509Certificate, "Failed to find a trusted cert that signed ", AnonymousClass7TE.A1A()));
                            }
                        }
                        i++;
                    } while (i < 9);
                    throw new SSLPeerUnverifiedException(AnonymousClass7TG.A0m(A1C, "Certificate chain too long: ", AnonymousClass7TE.A1A()));
                }
                TZ2 tz2 = (TZ2) rPk;
                try {
                    arrayList = (List) tz2.A01.invoke(tz2.A00, new Object[]{list.toArray(new X509Certificate[list.size()]), "RSA", str});
                } catch (InvocationTargetException e) {
                    SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                    sSLPeerUnverifiedException.initCause(e);
                    throw sSLPeerUnverifiedException;
                } catch (IllegalAccessException e2) {
                    throw Pxe.A0e(e2);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.get(i2);
                if (0 < emptyList.size()) {
                    emptyList.get(0);
                    throw AnonymousClass7TE.A11("hashAlgorithm");
                }
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Certificate pinning failure!");
            A1A.append("\n  Peer certificate chain:");
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                X509Certificate x509Certificate3 = (X509Certificate) arrayList.get(i3);
                A1A.append("\n    ");
                A1A.append(A00(x509Certificate3));
                A1A.append(": ");
                A1A.append(x509Certificate3.getSubjectDN().getName());
            }
            A1A.append("\n  Pinned certificates for ");
            A1A.append(str);
            A1A.append(":");
            int size3 = emptyList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                emptyList.get(i4);
                A1A.append("\n    ");
                A1A.append((Object) null);
            }
            throw new SSLPeerUnverifiedException(A1A.toString());
        }
    }
}
