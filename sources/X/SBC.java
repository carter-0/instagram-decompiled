package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class SBC {
    public static final char[] A00 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String A00(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(str.getBytes());
        StringBuilder A14 = Pxe.A14(r5 * 2);
        for (byte b : messageDigest.digest()) {
            char[] cArr = A00;
            A14.append(cArr[(b & 240) >> 4]);
            A14.append(cArr[b & 15]);
        }
        return A14.toString();
    }
}
