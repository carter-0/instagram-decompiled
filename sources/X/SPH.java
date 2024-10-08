package X;

import java.io.DataInputStream;
import java.io.EOFException;
import java.nio.ByteOrder;

public final class SPH {
    public int A00;
    public int A01;
    public final SPH A02;
    public final DataInputStream A03;

    private void A00() {
        int i;
        int i2 = this.A01;
        if (i2 >= 0 && (i = this.A00) > i2) {
            throw new EOFException(002.A02(i2, i, "Invalid access: limit=", ", consumed="));
        }
    }

    public final byte A01() {
        this.A00++;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            return dataInputStream.readByte();
        }
        SPH sph = this.A02;
        if (sph != null) {
            return sph.A01();
        }
        throw AnonymousClass7TE.A11("Source input stream was not setup.");
    }

    public final int A02() {
        this.A00 += 4;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            int readInt = dataInputStream.readInt();
            if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                return Integer.reverseBytes(readInt);
            }
            return readInt;
        }
        SPH sph = this.A02;
        if (sph != null) {
            return sph.A02();
        }
        throw AnonymousClass7TE.A11("Source input stream was not setup.");
    }

    public final short A03() {
        this.A00 += 2;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            short readShort = dataInputStream.readShort();
            if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                return Short.reverseBytes(readShort);
            }
            return readShort;
        }
        SPH sph = this.A02;
        if (sph != null) {
            return sph.A03();
        }
        throw AnonymousClass7TE.A11("Source input stream was not setup.");
    }

    public final void A04(int i) {
        this.A00 += i;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            dataInputStream.skipBytes(i);
            return;
        }
        SPH sph = this.A02;
        if (sph != null) {
            sph.A04(i);
            return;
        }
        throw AnonymousClass7TE.A11("Source input stream was not setup.");
    }

    public final void A05(byte[] bArr) {
        this.A00 += bArr.length;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            dataInputStream.readFully(bArr);
            return;
        }
        SPH sph = this.A02;
        if (sph != null) {
            sph.A05(bArr);
            return;
        }
        throw AnonymousClass7TE.A11("Source input stream was not setup.");
    }

    public SPH(SPH sph) {
        this.A03 = null;
        this.A02 = sph;
    }

    public SPH(DataInputStream dataInputStream) {
        this.A03 = dataInputStream;
        this.A02 = null;
    }
}
