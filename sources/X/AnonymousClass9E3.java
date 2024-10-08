package X;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.9E3  reason: invalid class name */
public abstract class AnonymousClass9E3 {
    public static final C3739197l A00 = C3739197l.A01;
    public static final ThreadLocal A01 = new AnonymousClass9E4();

    public static AlgorithmParameterSpec A00(byte[] bArr) {
        Integer A002;
        int length = bArr.length;
        if (!2Ob.A00(System.getProperty("java.vendor"), "The Android Project") || (A002 = AnonymousClass9E5.A00()) == null || A002.intValue() > 19) {
            return new GCMParameterSpec(128, bArr, 0, length);
        }
        return new IvParameterSpec(bArr, 0, length);
    }
}
