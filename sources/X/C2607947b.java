package X;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.47b  reason: invalid class name and case insensitive filesystem */
public final class C2607947b implements AnonymousClass47P {
    public long A00;
    public long A01;
    public C257263x7 A02;
    public File A03;
    public OutputStream A04;
    public final C251073mW A05;
    public final boolean A06;
    public final long A07;
    public final long A08;
    public final 2R9 A09;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r4.A00 <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r3 != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(byte[] r14, int r15, int r16) {
        /*
            r13 = this;
            r5 = 0
            long r8 = r13.A07     // Catch:{ IOException -> 0x005f }
            r11 = r8
            X.2R9 r4 = r13.A09     // Catch:{ IOException -> 0x005f }
            boolean r10 = r13.A06     // Catch:{ IOException -> 0x005f }
            if (r10 == 0) goto L_0x0018
            X.3mW r1 = r13.A05     // Catch:{ IOException -> 0x005f }
            if (r4 == 0) goto L_0x0018
            java.lang.String r0 = r4.A06     // Catch:{ IOException -> 0x005f }
            boolean r0 = r1.CWd(r0)     // Catch:{ IOException -> 0x005f }
            if (r0 == 0) goto L_0x0018
            long r8 = r13.A08     // Catch:{ IOException -> 0x005f }
        L_0x0018:
            r6 = r16
            if (r5 >= r6) goto L_0x005e
            if (r10 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0025
            int r0 = r4.A00     // Catch:{ IOException -> 0x005f }
            r3 = 1
            if (r0 > 0) goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            long r0 = r13.A01     // Catch:{ IOException -> 0x005f }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x002f
            if (r3 == 0) goto L_0x003e
            goto L_0x0031
        L_0x002f:
            if (r3 == 0) goto L_0x0038
        L_0x0031:
            X.3mW r1 = r13.A05     // Catch:{ IOException -> 0x005f }
            java.lang.String r0 = r4.A06     // Catch:{ IOException -> 0x005f }
            r1.A9E(r0)     // Catch:{ IOException -> 0x005f }
        L_0x0038:
            r13.A00()     // Catch:{ IOException -> 0x005f }
            r13.A01()     // Catch:{ IOException -> 0x005f }
        L_0x003e:
            int r0 = r16 - r5
            long r6 = (long) r0     // Catch:{ IOException -> 0x005f }
            long r2 = r13.A01     // Catch:{ IOException -> 0x005f }
            long r0 = r11 - r2
            long r0 = java.lang.Math.min(r6, r0)     // Catch:{ IOException -> 0x005f }
            int r2 = (int) r0     // Catch:{ IOException -> 0x005f }
            java.io.OutputStream r1 = r13.A04     // Catch:{ IOException -> 0x005f }
            int r0 = r15 + r5
            r1.write(r14, r0, r2)     // Catch:{ IOException -> 0x005f }
            int r5 = r5 + r2
            long r0 = r13.A01     // Catch:{ IOException -> 0x005f }
            long r2 = (long) r2     // Catch:{ IOException -> 0x005f }
            long r0 = r0 + r2
            r13.A01 = r0     // Catch:{ IOException -> 0x005f }
            long r0 = r13.A00     // Catch:{ IOException -> 0x005f }
            long r0 = r0 + r2
            r13.A00 = r0     // Catch:{ IOException -> 0x005f }
            goto L_0x0018
        L_0x005e:
            return
        L_0x005f:
            r1 = move-exception
            X.47t r0 = new X.47t
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2607947b.write(byte[], int, int):void");
    }

    private void A00() {
        if (this.A04 != null) {
            try {
                27d.A01("cacheDataSinkSync");
                this.A04.flush();
                27d.A00();
                OutputStream outputStream = this.A04;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.A04 = null;
                File file = this.A03;
                this.A03 = null;
                this.A05.AIT(file, file.length());
            } catch (Throwable th) {
                27d.A00();
                OutputStream outputStream2 = this.A04;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A04 = null;
                File file2 = this.A03;
                this.A03 = null;
                file2.delete();
                throw th;
            }
        }
    }

    private void A01() {
        C257263x7 r4 = this.A02;
        long j = r4.A03;
        long j2 = this.A00;
        File Ewy = this.A05.Ewy(r4.A08, j2 + r4.A02, Math.min(j - j2, this.A07));
        this.A03 = Ewy;
        FileOutputStream fileOutputStream = new FileOutputStream(Ewy);
        this.A01 = 0;
        this.A04 = fileOutputStream;
    }

    public final void E0i(C257263x7 r7) {
        IOException iOException;
        boolean z = false;
        if (r7.A03 != -1) {
            z = true;
        }
        C256703wD.A04(z);
        try {
            27d.A01("exo-opencachedatasink");
            this.A02 = r7;
            this.A00 = 0;
            A01();
            27d.A00();
            return;
        } catch (FileNotFoundException e) {
            iOException = new IOException(e);
        } catch (AnonymousClass5HZ e2) {
            iOException = new IOException(e2);
        } catch (Throwable th) {
            27d.A00();
            throw th;
        }
        throw iOException;
    }

    public C2607947b(C251073mW r1, 2R9 r2, long j, long j2, boolean z) {
        r1.getClass();
        this.A05 = r1;
        this.A07 = j;
        this.A09 = r2;
        this.A06 = z;
        this.A08 = j2;
    }

    public final void close() {
        try {
            A00();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}
