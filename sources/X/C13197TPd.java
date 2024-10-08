package X;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.TPd  reason: case insensitive filesystem */
public final class C13197TPd implements YCT {
    public boolean A00;
    public final C13198TPe A01 = new Object();
    public final C13970TmY A02;

    public final long CMD(byte b) {
        return A01((byte) 0, Long.MAX_VALUE);
    }

    public final void readFully(byte[] bArr) {
        try {
            EHi((long) bArr.length);
            this.A01.readFully(bArr);
        } catch (EOFException e) {
            e = e;
            int i = 0;
            while (true) {
                C13198TPe tPe = this.A01;
                long j = tPe.A00;
                if (j > 0) {
                    int A022 = tPe.A02(bArr, i, (int) j);
                    if (A022 == -1) {
                        e = Pxe.A0d();
                        break;
                    }
                    i += A022;
                } else {
                    break;
                }
            }
            throw e;
        }
    }

    public static long A00(C13198TPe tPe, C13197TPd tPd) {
        return tPd.A02.E6C(tPe, 8192);
    }

    public final long A01(byte b, long j) {
        long j2 = 0;
        if (!this.A00) {
            long j3 = j;
            if (j < 0) {
                throw Pxf.A0X("fromIndex=%s toIndex=%s", new Object[]{0L, Long.valueOf(j3)});
            }
            while (j2 < j) {
                C13198TPe tPe = this.A01;
                long A03 = tPe.A03(b, j2, j3);
                if (A03 == -1) {
                    long j4 = tPe.A00;
                    if (j4 >= j || A00(tPe, this) == -1) {
                        break;
                    }
                    j2 = Math.max(j2, j4);
                } else {
                    return A03;
                }
            }
            return -1;
        }
        throw Pxh.A0a();
    }

    public final C13198TPe AEA() {
        return this.A01;
    }

    public final boolean ATS() {
        if (!this.A00) {
            C13198TPe tPe = this.A01;
            if (!tPe.ATS() || A00(tPe, this) != -1) {
                return false;
            }
            return true;
        }
        throw Pxh.A0a();
    }

    public final C13198TPe AiN() {
        return this.A01;
    }

    public final long CMF(TAH tah) {
        long j = 0;
        if (this.A00) {
            throw Pxh.A0a();
        }
        while (true) {
            C13198TPe tPe = this.A01;
            long A04 = tPe.A04(tah, j);
            if (A04 != -1) {
                return A04;
            }
            long j2 = tPe.A00;
            if (A00(tPe, this) == -1) {
                return -1;
            }
            j = Math.max(j, j2);
        }
    }

    public final InputStream CNP() {
        return new C8847RCn(this);
    }

    public final long E6C(C13198TPe tPe, long j) {
        if (tPe == null) {
            throw AnonymousClass7TE.A0w("sink == null");
        } else if (j < 0) {
            throw Pxg.A0b("byteCount < 0: ", j);
        } else if (!this.A00) {
            C13198TPe tPe2 = this.A01;
            if (tPe2.A00 == 0 && A00(tPe2, this) == -1) {
                return -1;
            }
            return tPe2.E6C(tPe, Math.min(j, tPe2.A00));
        } else {
            throw Pxh.A0a();
        }
    }

    public final long E6U() {
        byte A002;
        byte b;
        EHi(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!EHK((long) i2)) {
                break;
            }
            A002 = this.A01.A00((long) i);
            if (A002 < 48) {
                break;
            }
            if (A002 > 57) {
                if (A002 < 97) {
                    if (A002 < 65) {
                        break;
                    }
                    b = 70;
                } else {
                    b = 102;
                }
                if (A002 > b) {
                    break;
                }
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(A002)}));
        }
        return this.A01.E6U();
    }

    public final int E6X() {
        EHi(4);
        return this.A01.E6X();
    }

    public final short E6l() {
        EHi(2);
        return this.A01.E6l();
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, X.TPe] */
    public final String E6q(long j) {
        long j2;
        long j3 = j;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long A012 = A01((byte) 10, j2);
            if (A012 != -1) {
                return this.A01.A06(A012);
            }
            if (j2 < Long.MAX_VALUE && EHK(j2)) {
                C13198TPe tPe = this.A01;
                if (tPe.A00(j2 - 1) == 13 && EHK(1 + j2) && tPe.A00(j2) == 10) {
                    return tPe.A06(j2);
                }
            }
            ? obj = new Object();
            C13198TPe tPe2 = this.A01;
            tPe2.A0I(obj, 0, Math.min(32, tPe2.A00));
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("\\n not found: limit=");
            A1A.append(Math.min(tPe2.A00, j3));
            A1A.append(" content=");
            A1A.append(obj.A08().A07());
            throw new EOFException(C51967G9n.A0r(A1A, 8230));
        }
        throw Pxg.A0b("limit < 0: ", j3);
    }

    public final boolean EHK(long j) {
        C13198TPe tPe;
        if (j < 0) {
            throw Pxg.A0b("byteCount < 0: ", j);
        } else if (this.A00) {
            throw Pxh.A0a();
        } else {
            do {
                tPe = this.A01;
                if (tPe.A00 >= j) {
                    return true;
                }
            } while (A00(tPe, this) != -1);
            return false;
        }
    }

    public final int EL6(TS1 ts1) {
        C13198TPe tPe;
        if (this.A00) {
            throw Pxh.A0a();
        }
        do {
            tPe = this.A01;
            int A012 = tPe.A01(ts1, true);
            if (A012 == -1) {
                break;
            } else if (A012 != -2) {
                tPe.Evi((long) ts1.A01[A012].A05());
                return A012;
            }
        } while (A00(tPe, this) != -1);
        return -1;
    }

    public final void Evi(long j) {
        if (this.A00) {
            throw Pxh.A0a();
        }
        while (j > 0) {
            C13198TPe tPe = this.A01;
            if (tPe.A00 == 0 && A00(tPe, this) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, tPe.A00);
            tPe.Evi(min);
            j -= min;
        }
    }

    public final C11291SJy Ezn() {
        return this.A02.Ezn();
    }

    public final void close() {
        if (!this.A00) {
            this.A00 = true;
            this.A02.close();
            this.A01.A0A();
        }
    }

    public final boolean isOpen() {
        return !this.A00;
    }

    public final int read(ByteBuffer byteBuffer) {
        C13198TPe tPe = this.A01;
        if (tPe.A00 == 0 && A00(tPe, this) == -1) {
            return -1;
        }
        return tPe.read(byteBuffer);
    }

    public final byte readByte() {
        EHi(1);
        return this.A01.readByte();
    }

    public final int readInt() {
        EHi(4);
        return this.A01.readInt();
    }

    public final long readLong() {
        EHi(8);
        return this.A01.readLong();
    }

    public final short readShort() {
        EHi(2);
        return this.A01.readShort();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.TPe] */
    public C13197TPd(C13970TmY tmY) {
        this.A02 = tmY;
    }

    public final byte[] E6H(long j) {
        EHi(j);
        return this.A01.E6H(j);
    }

    public final TAH E6I(long j) {
        EHi(j);
        return this.A01.E6I(j);
    }

    public final void E6S(C13198TPe tPe, long j) {
        try {
            EHi(j);
            this.A01.E6S(tPe, j);
        } catch (EOFException e) {
            do {
            } while (this.A01.E6C(tPe, 8192) != -1);
            throw e;
        }
    }

    public final void EHi(long j) {
        if (!EHK(j)) {
            throw new EOFException();
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("buffer(");
        return Pxg.A0q(this.A02, A1A);
    }

    public final String E6p() {
        return E6q(Long.MAX_VALUE);
    }
}
