package X;

import android.media.MediaDataSource;
import android.util.SparseArray;
import java.io.IOException;

public final class XF2 extends MediaDataSource {
    public int A00 = -1;
    public XF3 A01;
    public final Q13 A02 = new Q13();
    public final String A03;

    private final void A00() {
        if (this.A01 == null) {
            XF3 xf3 = new XF3(new XF5(this));
            this.A01 = xf3;
            SparseArray sparseArray = xf3.A00;
            XF4 xf4 = (XF4) sparseArray.get(0);
            if (xf4 == null) {
                xf4 = new XF4();
                sparseArray.put(0, xf4);
            }
            int A002 = this.A02.A00(this.A03, 0, xf4.A00);
            this.A00 = A002;
            if (A002 <= 0) {
                throw new IOException("could not resolve content length");
            }
        }
    }

    public final void close() {
        XF3 xf3 = this.A01;
        if (xf3 != null) {
            xf3.A00.clear();
        }
    }

    public final long getSize() {
        if (this.A00 < 0) {
            A00();
        }
        return (long) this.A00;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = i2;
        byte[] bArr2 = bArr;
        0qQ.A0B(bArr2, 1);
        A00();
        XF3 xf3 = this.A01;
        if (xf3 != null) {
            long j2 = j;
            int i6 = this.A00;
            if (((long) i5) + j > ((long) i6)) {
                i5 = i6 - ((int) j2);
            }
            int i7 = (int) j2;
            if (i + i5 <= bArr2.length) {
                int i8 = i7 / 162760;
                int i9 = (i5 + i7) - 1;
                int i10 = i9 / 162760;
                if (i8 > i10) {
                    return 0;
                }
                int i11 = i8;
                int i12 = 0;
                while (true) {
                    SparseArray sparseArray = xf3.A00;
                    XF4 xf4 = (XF4) sparseArray.get(i11);
                    if (xf4 == null) {
                        xf4 = new XF4();
                        XF5 xf5 = xf3.A01;
                        byte[] bArr3 = xf4.A00;
                        0qQ.A0B(bArr3, 0);
                        XF2 xf2 = xf5.A00;
                        xf2.A02.A00(xf2.A03, i11 * 162760, bArr3);
                        sparseArray.put(i11, xf4);
                    }
                    boolean z = false;
                    if (i11 == i8) {
                        z = true;
                    }
                    boolean z2 = false;
                    if (i11 == i10) {
                        z2 = true;
                    }
                    if (z) {
                        i3 = i7 % 162760;
                    } else {
                        i3 = 0;
                    }
                    if (z2) {
                        i4 = i9 % 162760;
                    } else {
                        i4 = 162759;
                    }
                    int i13 = (i4 - i3) + 1;
                    System.arraycopy(xf4.A00, i3, bArr2, i + i12, i13);
                    i12 += i13;
                    if (i11 == i10) {
                        return i12;
                    }
                    i11++;
                }
            } else {
                throw new IllegalStateException("requested destination is out of range");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public XF2(String str) {
        this.A03 = str;
    }
}
