package X;

import android.util.Base64;
import java.util.Random;

/* renamed from: X.XzI  reason: case insensitive filesystem */
public final class C22308XzI implements C635813i {
    public final int A00;

    public C22308XzI(int i) {
        this.A00 = i;
    }

    public final Object get() {
        byte[] bArr;
        Random random;
        switch (this.A00) {
            case 0:
                return new C22075Xv1();
            case 1:
                bArr = new byte[12];
                random = C22082Xv8.A09;
                break;
            default:
                bArr = new byte[12];
                random = C22284Xyt.A07;
                break;
        }
        random.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
