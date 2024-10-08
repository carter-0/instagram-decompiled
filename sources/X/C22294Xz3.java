package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Xz3  reason: case insensitive filesystem */
public final class C22294Xz3 implements C257103wr {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public boolean A05;
    public byte[] A06;
    public C257263x7 A07;
    public final int A08;
    public final C257103wr A09;
    public final int A0A;

    private int A00() {
        C257263x7 r7 = this.A07;
        boolean z = true;
        if (r7 != null) {
            long j = r7.A03;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            long j2 = (long) this.A0A;
            long j3 = j2;
            if (i > 0) {
                j2 = Math.min(j2, j - (this.A04 - r7.A04));
            }
            String str = null;
            Map emptyMap = Collections.emptyMap();
            C257263x7 r13 = this.A07;
            Uri uri = r13.A06;
            if (uri == null) {
                uri = Uri.EMPTY;
            }
            byte[] bArr = r13.A0A;
            long j4 = this.A03;
            long j5 = this.A04;
            long j6 = j4 - j5;
            if (j2 <= 0) {
                j2 = -1;
            }
            int i2 = r13.A00;
            C257253x6 r9 = r13.A07;
            String str2 = r13.A08;
            if (str2 != null) {
                str = str2;
            }
            C256703wD.A02(uri);
            if (r9 == null) {
                r9 = new C257253x6();
            }
            long open = this.A09.open(new C257263x7(uri, r9, str, emptyMap, bArr, 1, i2, j6, j5, j2));
            if (open < 0 || open >= j3) {
                z = false;
            }
            this.A05 = z;
            return (int) open;
        }
        throw new C2609547r(new C257263x7(Uri.EMPTY, 0, -1), "No DataSpec when calling openInnder", 1);
    }

    public final void cancel() {
        this.A09.cancel();
    }

    public final void changeHttpPriority(byte b, boolean z) {
        this.A09.changeHttpPriority(b, z);
    }

    public final void close() {
        this.A09.close();
        this.A07 = null;
        this.A06 = null;
    }

    public final Map getResponseHeaders() {
        return this.A09.getResponseHeaders();
    }

    public final Uri getUri() {
        return this.A09.getUri();
    }

    public final long open(C257263x7 r6) {
        this.A07 = r6;
        this.A06 = new byte[this.A08];
        this.A03 = r6.A02;
        this.A04 = r6.A04;
        int A002 = A00();
        this.A02 = A002;
        this.A00 = 0;
        if (A002 >= 0 && A002 < this.A0A) {
            return (long) A002;
        }
        long j = r6.A03;
        if (j < 0) {
            return -1;
        }
        return j;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte[] bArr2 = this.A06;
        if (bArr2 == null || this.A00 < i2) {
            int i6 = 0;
            if (bArr2 == null || (i5 = this.A00) <= 0) {
                i3 = i2;
            } else {
                System.arraycopy(bArr2, this.A01, bArr, i, i5);
                int i7 = this.A00;
                i += i7;
                i3 = i2 - i7;
                this.A00 = 0;
            }
            do {
                int i8 = this.A02;
                if (i8 > 0) {
                    int read = this.A09.read(bArr, i, i3);
                    if (read == -1) {
                        this.A02 = 0;
                        i8 = 0;
                    } else {
                        i += read;
                        i3 -= read;
                        this.A02 -= read;
                        long j = (long) read;
                        this.A04 += j;
                        this.A03 += j;
                    }
                }
                byte[] bArr3 = this.A06;
                if (bArr3 != null) {
                    int i9 = this.A00;
                    if (i4 + i9 <= this.A08) {
                        int i10 = this.A01;
                        if (i10 > 0) {
                            if (i9 > 0) {
                                System.arraycopy(bArr3, i10, bArr3, 0, i9);
                            }
                            this.A01 = 0;
                        }
                        while (true) {
                            i4 = this.A02;
                            if (i4 <= 0) {
                                break;
                            }
                            int read2 = this.A09.read(this.A06, this.A00, i4);
                            if (read2 == -1) {
                                this.A02 = 0;
                                i4 = 0;
                                break;
                            }
                            this.A00 += read2;
                            this.A02 -= read2;
                            long j2 = (long) read2;
                            this.A04 += j2;
                            this.A03 += j2;
                        }
                        if (!this.A05) {
                            this.A09.close();
                            i4 = A00();
                            this.A02 = i4;
                        }
                    }
                    if (this.A00 > 0 || i4 > 0) {
                        int read3 = read(bArr, i, i3);
                        int i11 = i2 - i3;
                        if (read3 != -1) {
                            i6 = read3;
                        }
                        return i11 + i6;
                    }
                    int i12 = i2 - i3;
                    if (i12 > 0) {
                        return i12;
                    }
                    return -1;
                }
                throw new C2609547r(new C257263x7(Uri.EMPTY, 0, -1), "No internal buffer", 2);
            } while (i3 != 0);
            return i2;
        }
        System.arraycopy(bArr2, this.A01, bArr, i, i2);
        this.A01 += i2;
        this.A00 -= i2;
        return i2;
    }

    public C22294Xz3(C257103wr r1, int i, int i2) {
        this.A09 = r1;
        this.A08 = i;
        this.A0A = i2;
    }

    public final void addTransferListener(C250823m7 r2) {
        r2.getClass();
        this.A09.addTransferListener(r2);
    }
}
