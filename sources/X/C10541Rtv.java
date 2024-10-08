package X;

import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.Rtv  reason: case insensitive filesystem */
public final class C10541Rtv {
    public final FileInputStream A00;
    public final MappedByteBuffer A01;
    public final FileChannel A02;

    public C10541Rtv(FileInputStream fileInputStream, MappedByteBuffer mappedByteBuffer, FileChannel fileChannel) {
        0qQ.A0B(mappedByteBuffer, 1);
        this.A01 = mappedByteBuffer;
        this.A02 = fileChannel;
        this.A00 = fileInputStream;
    }
}
