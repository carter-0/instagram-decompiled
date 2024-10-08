package X;

import java.util.Random;

/* renamed from: X.9B0  reason: invalid class name */
public abstract class AnonymousClass9B0 {
    public static final ThreadLocal A00 = new AnonymousClass9B1();

    public static byte[] A00(int i) {
        byte[] bArr = new byte[i];
        ((Random) A00.get()).nextBytes(bArr);
        return bArr;
    }
}
