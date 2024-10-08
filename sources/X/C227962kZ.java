package X;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.2kZ  reason: invalid class name and case insensitive filesystem */
public class C227962kZ extends InputStream implements DataInput {
    public int A00;
    public int A01;
    public ByteOrder A02;
    public byte[] A03;
    public final DataInputStream A04;

    public final void A00(int i) {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.A04;
            int i3 = i - i2;
            int skip = (int) dataInputStream.skip((long) i3);
            if (skip <= 0) {
                byte[] bArr = this.A03;
                if (bArr == null) {
                    bArr = new byte[8192];
                    this.A03 = bArr;
                }
                skip = dataInputStream.read(bArr, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(002.A0c("Reached EOF while skipping ", " bytes.", i));
                }
            }
            i2 += skip;
        }
        this.A01 += i2;
    }

    public C227962kZ(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.A00 = bArr.length;
    }

    public final int available() {
        return this.A04.available();
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.A04.read(bArr, i, i2);
        this.A01 += read;
        return read;
    }

    public final boolean readBoolean() {
        this.A01++;
        return this.A04.readBoolean();
    }

    public final byte readByte() {
        this.A01++;
        int read = this.A04.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.A01 += 2;
        return this.A04.readChar();
    }

    public final void readFully(byte[] bArr) {
        this.A01 += bArr.length;
        this.A04.readFully(bArr);
    }

    public final int readInt() {
        this.A01 += 4;
        DataInputStream dataInputStream = this.A04;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.A02;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(byteOrder);
            throw new IOException(sb.toString());
        }
        throw new EOFException();
    }

    public final String readLine() {
        return null;
    }

    public final long readLong() {
        long j;
        long j2;
        this.A01 += 8;
        DataInputStream dataInputStream = this.A04;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.A02;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                j = (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8);
                j2 = (long) read;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                j = (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8);
                j2 = (long) read8;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid byte order: ");
                sb.append(byteOrder);
                throw new IOException(sb.toString());
            }
            return j + j2;
        }
        throw new EOFException();
    }

    public final short readShort() {
        int i;
        this.A01 += 2;
        DataInputStream dataInputStream = this.A04;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.A02;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                i = (read2 << 8) + read;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                i = (read << 8) + read2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid byte order: ");
                sb.append(byteOrder);
                throw new IOException(sb.toString());
            }
            return (short) i;
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.A01 += 2;
        return this.A04.readUTF();
    }

    public final int readUnsignedByte() {
        this.A01++;
        return this.A04.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        this.A01 += 2;
        DataInputStream dataInputStream = this.A04;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.A02;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid byte order: ");
            sb.append(byteOrder);
            throw new IOException(sb.toString());
        }
        throw new EOFException();
    }

    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public C227962kZ(InputStream inputStream, ByteOrder byteOrder) {
        int i;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A04 = dataInputStream;
        dataInputStream.mark(0);
        this.A01 = 0;
        this.A02 = byteOrder;
        if (inputStream instanceof C227962kZ) {
            i = ((C227962kZ) inputStream).A00;
        } else {
            i = -1;
        }
        this.A00 = i;
    }

    public final int read() {
        this.A01++;
        return this.A04.read();
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        this.A01 += i2;
        this.A04.readFully(bArr, i, i2);
    }
}
