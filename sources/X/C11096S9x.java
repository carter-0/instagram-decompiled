package X;

import android.os.Build;
import java.security.Signature;

/* renamed from: X.S9x  reason: case insensitive filesystem */
public abstract class C11096S9x {
    public static final String A00(Signature signature, byte[] bArr, boolean z) {
        int i;
        signature.update(bArr);
        byte[] sign = signature.sign();
        if (z) {
            0qQ.A07(sign);
            int length = sign.length;
            if (length < 8 || sign[0] != 48) {
                throw AnonymousClass7TE.A0w("Invalid ECDSA signature format");
            }
            byte b = sign[1];
            if (b > 0) {
                i = 2;
            } else if (b == -127) {
                i = 3;
            } else {
                throw AnonymousClass7TE.A0w("Invalid ECDSA signature format");
            }
            byte b2 = sign[i + 1];
            int i2 = b2;
            while (i2 > 0 && sign[((i + 2) + b2) - i2] == 0) {
                i2--;
            }
            int i3 = i + 2 + b2;
            byte b3 = sign[i3 + 1];
            int i4 = b3;
            while (i4 > 0 && sign[((i3 + 2) + b3) - i4] == 0) {
                i4--;
            }
            int max = Math.max(Math.max(i2, i4), 32);
            byte b4 = sign[i - 1] & 255;
            if (b4 == length - i && b4 == b2 + 2 + 2 + b3 && sign[i] == 2 && sign[i3] == 2) {
                int i5 = max * 2;
                byte[] bArr2 = new byte[i5];
                System.arraycopy(sign, i3 - i2, bArr2, max - i2, i2);
                System.arraycopy(sign, ((i3 + 2) + b3) - i4, bArr2, i5 - i4, i4);
                sign = bArr2;
            } else {
                throw AnonymousClass7TE.A0w("Invalid ECDSA signature format");
            }
        }
        return Pxg.A0z(sign);
    }

    public static final boolean A01() {
        return JTQ.A1P(Build.VERSION.SDK_INT, 30);
    }
}
