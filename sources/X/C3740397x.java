package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* renamed from: X.97x  reason: invalid class name and case insensitive filesystem */
public abstract class C3740397x {
    public static final Charset A00 = Charset.forName(ReactWebViewManager.HTML_ENCODING);

    public static boolean A02(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        int length2 = bArr.length;
        if (length < length2) {
            return false;
        }
        for (int i = 0; i < length2; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int A00() {
        byte b;
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        do {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        } while (b == 0);
        return b;
    }

    public static final C3740497y A01(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new RuntimeException(002.A0C("Not a printable ASCII character: ", charAt));
            }
            bArr[i] = (byte) charAt;
        }
        return new C3740497y(bArr, length);
    }
}
