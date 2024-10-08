package X;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class TPE implements HostnameVerifier {
    public static final TPE A00 = new Object();

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return A01(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean A01(String str, X509Certificate x509Certificate) {
        int length;
        if (DbV.A1b(str, SUS.A03)) {
            List A002 = A00(x509Certificate, 7);
            int size = A002.size();
            int i = 0;
            while (i < size) {
                if (!str.equalsIgnoreCase(AnonymousClass7TE.A19(A002, i))) {
                    i++;
                }
            }
            return false;
        }
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        Iterator it = A00(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            String str2 = lowerCase;
            if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && A18 != null && A18.length() != 0 && !A18.startsWith(".") && !A18.endsWith("..")) {
                if (!lowerCase.endsWith(".")) {
                    str2 = 002.A0C(lowerCase, '.');
                }
                if (!A18.endsWith(".")) {
                    A18 = 002.A0C(A18, '.');
                }
                String lowerCase2 = A18.toLowerCase(locale);
                if (!lowerCase2.contains("*")) {
                    if (str2.equals(lowerCase2)) {
                    }
                } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && (length = str2.length()) >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                    String substring = lowerCase2.substring(1);
                    if (!str2.endsWith(substring)) {
                        continue;
                    } else {
                        int length2 = length - substring.length();
                        if (length2 > 0 && str2.lastIndexOf(46, length2 - 1) != -1) {
                        }
                    }
                }
            }
        }
        return false;
        return true;
    }

    public static List A00(X509Certificate x509Certificate, int i) {
        Number number;
        Object obj;
        ArrayList A1C = AnonymousClass7TE.A1C();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (!(next == null || next.size() < 2 || (number = (Number) AnonymousClass7TE.A13(next)) == null || number.intValue() != i || (obj = next.get(1)) == null)) {
                    A1C.add(obj);
                }
            }
            return A1C;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }
}
