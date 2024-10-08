package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.5qd  reason: invalid class name and case insensitive filesystem */
public final class C296785qd implements C266204Xy {
    public byte[] A00;
    public final long A01 = AnonymousClass4Y0.A03.getAndIncrement();
    public final C257263x7 A02;
    public final C266214Xz A03;

    public final void AGO() {
    }

    public final void Cg1() {
        int i;
        byte[] bArr;
        C266214Xz r3 = this.A03;
        r3.A00 = 0;
        try {
            r3.open(this.A02);
            do {
                i = (int) r3.A00;
                bArr = this.A00;
                if (bArr == null) {
                    bArr = new byte[1024];
                } else {
                    int length = bArr.length;
                    if (i == length) {
                        bArr = Arrays.copyOf(bArr, length * 2);
                    }
                }
                this.A00 = bArr;
            } while (r3.read(bArr, i, bArr.length - i) != -1);
        } finally {
            try {
                r3.close();
            } catch (IOException unused) {
            }
        }
    }

    public C296785qd(C257113ws r3, C257263x7 r4) {
        this.A02 = r4;
        this.A03 = new C266214Xz(r3);
    }
}
