package X;

import java.io.ByteArrayInputStream;

/* renamed from: X.9w8  reason: invalid class name and case insensitive filesystem */
public abstract class C393249w8 {
    /* JADX INFO: finally extract failed */
    public static C375239Cu A00(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            AnonymousClass972 A01 = AnonymousClass972.A01(new AnonymousClass9BY(byteArrayInputStream), C3738397d.A00(), C3738097a.DEFAULT_INSTANCE);
            AnonymousClass972.A05(A01);
            C3738097a r0 = (C3738097a) A01;
            byteArrayInputStream.close();
            return C375239Cu.A00(AnonymousClass9BV.A01(r0));
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }
}
