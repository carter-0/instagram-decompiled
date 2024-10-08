package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.Oqt  reason: case insensitive filesystem */
public final class C71792Oqt implements AnonymousClass47P {
    public long A00;
    public long A01;
    public long A02;
    public C257263x7 A03;
    public File A04;
    public OutputStream A05;
    public final long A06;
    public final C251073mW A07;

    private void A00() {
        if (this.A05 != null) {
            try {
                27d.A01("cacheDataSinkSync");
                this.A05.flush();
                27d.A00();
                OutputStream outputStream = this.A05;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.A05 = null;
                File file = this.A04;
                this.A04 = null;
                this.A07.AIT(file, this.A02);
            } catch (Throwable th) {
                27d.A00();
                OutputStream outputStream2 = this.A05;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A05 = null;
                File file2 = this.A04;
                this.A04 = null;
                file2.delete();
                throw th;
            }
        }
    }

    private void A01(C257263x7 r9) {
        long j = r9.A03;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.A00, this.A01);
        }
        File Ewy = this.A07.Ewy(r9.A08, r9.A04 + this.A00, j2);
        this.A04 = Ewy;
        this.A05 = new FileOutputStream(Ewy);
        this.A02 = 0;
    }

    public final void E0i(C257263x7 r6) {
        long j;
        r6.A08.getClass();
        if (r6.A03 == -1 && (r6.A00 & 2) == 2) {
            this.A03 = null;
            return;
        }
        this.A03 = r6;
        if ((r6.A00 & 4) == 4) {
            j = this.A06;
        } else {
            j = Long.MAX_VALUE;
        }
        this.A01 = j;
        this.A00 = 0;
        try {
            27d.A01("exo-opencachedatasink");
            A01(r6);
            27d.A00();
        } catch (IOException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            27d.A00();
            throw th;
        }
    }

    public final void close() {
        if (this.A03 != null) {
            try {
                A00();
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        C257263x7 r7 = this.A03;
        if (r7 != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.A02 == this.A01) {
                        A00();
                        A01(r7);
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.A01 - this.A02);
                    this.A05.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.A02 += j;
                    this.A00 += j;
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r7 == -1) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C71792Oqt(X.C251073mW r6, long r7) {
        /*
            r5 = this;
            r5.<init>()
            r3 = -1
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r1 = 1
        L_0x0011:
            java.lang.String r0 = "fragmentSize must be positive or C.LENGTH_UNSET."
            if (r1 == 0) goto L_0x0038
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0027
            r1 = 2097152(0x200000, double:1.0361308E-317)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0027
            java.lang.String r1 = "CacheDataSinkV2"
            java.lang.String r0 = "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance."
            X.2AG.A04(r1, r0)
        L_0x0027:
            r6.getClass()
            r5.A07 = r6
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0035:
            r5.A06 = r7
            return
        L_0x0038:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71792Oqt.<init>(X.3mW, long):void");
    }
}
