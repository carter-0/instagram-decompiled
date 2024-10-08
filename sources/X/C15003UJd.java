package X;

import java.nio.ByteBuffer;

/* renamed from: X.UJd  reason: case insensitive filesystem */
public final class C15003UJd extends C240473La {
    public final C71532dv A00;
    public final ByteBuffer A01;
    public final C71542dx A02;

    public final int getSizeInBytes() {
        return 0;
    }

    public final void close() {
    }

    public final int getHeight() {
        return (int) this.A02.A00;
    }

    public final int getWidth() {
        return (int) this.A02.A01;
    }

    public C15003UJd(C71532dv r3, ByteBuffer byteBuffer) {
        this.A01 = byteBuffer;
        this.A00 = r3;
        this.A02 = r3.A04[r3.A00].A03;
    }

    public final boolean isClosed() {
        throw AnonymousClass00P.createAndThrow();
    }
}
