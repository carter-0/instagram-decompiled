package X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.Oqu  reason: case insensitive filesystem */
public final class C71793Oqu implements AnonymousClass47P {
    public long A00;
    public long A01;
    public long A02;
    public C257263x7 A03;
    public RC0 A04;
    public File A05;
    public OutputStream A06;
    public final C251073mW A07;

    private void A00() {
        OutputStream outputStream = this.A06;
        if (outputStream != null) {
            try {
                outputStream.flush();
                OutputStream outputStream2 = this.A06;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused) {
                    }
                }
                this.A06 = null;
                File file = this.A05;
                this.A05 = null;
                this.A07.AIT(file, this.A02);
            } catch (Throwable th) {
                OutputStream outputStream3 = this.A06;
                if (outputStream3 != null) {
                    try {
                        outputStream3.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A06 = null;
                File file2 = this.A05;
                this.A05 = null;
                file2.delete();
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.RC0, java.io.BufferedOutputStream] */
    private void A01(C257263x7 r9) {
        RC0 rc0;
        long j = r9.A03;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.A00, this.A01);
        }
        File Ewy = this.A07.Ewy(r9.A08, r9.A04 + this.A00, j2);
        this.A05 = Ewy;
        FileOutputStream fileOutputStream = new FileOutputStream(Ewy);
        RC0 rc02 = this.A04;
        if (rc02 == null) {
            ? bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 20480);
            this.A04 = bufferedOutputStream;
            rc0 = bufferedOutputStream;
        } else {
            rc02.A00(fileOutputStream);
            rc0 = rc02;
        }
        this.A06 = rc0;
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
            j = 2097152;
        } else {
            j = Long.MAX_VALUE;
        }
        this.A01 = j;
        this.A00 = 0;
        try {
            A01(r6);
        } catch (IOException e) {
            throw new IOException(e);
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
                    this.A06.write(bArr, i + i3, min);
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

    public C71793Oqu(C251073mW r1) {
        this.A07 = r1;
    }
}
