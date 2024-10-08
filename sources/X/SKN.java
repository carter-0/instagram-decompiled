package X;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class SKN {
    public static final String A00(String str, String str2, String str3, long j) {
        try {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            String A0R = 002.A0R(str, str2);
            0qQ.A0B(A0R, 0);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            0qQ.A07(instance);
            Charset A17 = Pxe.A17();
            0qQ.A07(A17);
            byte[] digest = instance.digest(Pxf.A1V(A0R, A17));
            0qQ.A07(digest);
            A1A.append(A01(digest));
            A1A.append('-');
            A1A.append(0);
            A1A.append('-');
            A1A.append(j);
            A1A.append('-');
            A1A.append(str3);
            A1A.append("");
            return A1A.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final String A01(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString((b & 255) | 256);
            0qQ.A07(hexString);
            stringBuffer.append(C51967G9n.A0q(hexString, 1, 3));
        }
        return DbT.A10(stringBuffer);
    }
}
