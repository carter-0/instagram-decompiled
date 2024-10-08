package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Vzl  reason: case insensitive filesystem */
public final class C18750Vzl {
    public static final C17747VdG A03 = new Object();
    public final long A00;
    public final long A01;
    public final C16479UvZ A02;

    private final byte[] A00(long j) {
        int i;
        C16479UvZ uvZ = this.A02;
        if (uvZ instanceof C14962UHa) {
            i = 3;
        } else if (uvZ instanceof UHZ) {
            i = 20;
        } else if (uvZ instanceof UHY) {
            i = 64;
        } else {
            i = 8;
        }
        int A012 = JTP.A01((double) i, 8.0d);
        ByteBuffer A12 = Pxg.A12(8);
        A12.putLong(j);
        byte[] array = A12.array();
        0qQ.A07(array);
        byte[] bArr = new byte[A012];
        System.arraycopy(array, 0, bArr, 0, A012);
        return bArr;
    }

    public final byte[] A01() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(A00(this.A00));
        byteArrayOutputStream.write(A00(this.A01));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        0qQ.A07(byteArray);
        return byteArray;
    }

    public C18750Vzl(C16479UvZ uvZ, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = uvZ;
    }
}
