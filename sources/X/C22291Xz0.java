package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Xz0  reason: case insensitive filesystem */
public final class C22291Xz0 implements C257113ws {
    public int A00;
    public C250813m6 A01;
    public C257263x7 A02;
    public final int A03;
    public final boolean A04;
    public final byte[] A05;

    public final /* synthetic */ void cancel() {
    }

    public final Uri getUri() {
        return null;
    }

    public final void close() {
        C250813m6 r2 = this.A01;
        if (r2 != null) {
            C257263x7 r1 = this.A02;
            C257263x7 r0 = C257263x7.A0B;
            if (r1 == null) {
                r1 = C257263x7.A0B;
            }
            r2.DtX(this, r1, false);
            this.A01 = null;
        }
    }

    public final long open(C257263x7 r3) {
        this.A02 = r3;
        C250813m6 r1 = this.A01;
        if (r1 != null) {
            r1.Dtd(C257183wz.CACHED, r3);
        }
        this.A00 = 0;
        C250813m6 r0 = this.A01;
        if (r0 != null) {
            r0.Dtf(this, r3, false, false);
        }
        return (long) this.A03;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.A03;
        int i4 = this.A00;
        int i5 = i3 - i4;
        if (i5 == 0) {
            return -1;
        }
        if (i2 > i5) {
            i2 = i5;
        }
        byte[] bArr2 = this.A05;
        if (bArr2 == null) {
            return 0;
        }
        if (i2 > 0) {
            System.arraycopy(bArr2, i4, bArr, i, i2);
            this.A00 += i2;
            C250813m6 r2 = this.A01;
            if (r2 != null) {
                C257263x7 r1 = this.A02;
                C257263x7 r0 = C257263x7.A0B;
                if (r1 == null) {
                    r1 = C257263x7.A0B;
                }
                r2.Czk(this, r1, i2, false);
            }
        }
        return i2;
    }

    public C22291Xz0(C250813m6 r1, byte[] bArr, int i, boolean z) {
        this.A05 = bArr;
        this.A03 = i;
        this.A01 = r1;
        this.A04 = z;
    }

    public final void addTransferListener(C250823m7 r2) {
        C250813m6 xx0;
        r2.getClass();
        if (r2 instanceof C250813m6) {
            xx0 = (C250813m6) r2;
        } else {
            xx0 = new C22189Xx0(r2);
        }
        this.A01 = xx0;
    }

    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
