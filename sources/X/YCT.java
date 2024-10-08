package X;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

public interface YCT extends C13970TmY, ReadableByteChannel {
    @Deprecated
    C13198TPe AEA();

    boolean ATS();

    C13198TPe AiN();

    long CMD(byte b);

    long CMF(TAH tah);

    InputStream CNP();

    byte[] E6H(long j);

    TAH E6I(long j);

    void E6S(C13198TPe tPe, long j);

    long E6U();

    int E6X();

    short E6l();

    String E6p();

    String E6q(long j);

    boolean EHK(long j);

    void EHi(long j);

    int EL6(TS1 ts1);

    void Evi(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    static int A00(YCT yct) {
        return yct.readByte() & 255;
    }
}
