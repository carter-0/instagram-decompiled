package X;

import java.io.InputStream;

/* renamed from: X.RCn  reason: case insensitive filesystem */
public final class C8847RCn extends InputStream {
    public final /* synthetic */ C13197TPd A00;

    public C8847RCn(C13197TPd tPd) {
        this.A00 = tPd;
    }

    public final int available() {
        C13197TPd tPd = this.A00;
        if (!tPd.A00) {
            return (int) Math.min(tPd.A01.A00, 2147483647L);
        }
        throw JTO.A0u("closed");
    }

    public final void close() {
        this.A00.close();
    }

    public final int read(byte[] bArr, int i, int i2) {
        C13197TPd tPd = this.A00;
        if (!tPd.A00) {
            SCP.A00((long) bArr.length, (long) i, (long) i2);
            C13198TPe tPe = tPd.A01;
            if (tPe.A00 == 0 && C13197TPd.A00(tPe, tPd) == -1) {
                return -1;
            }
            return tPe.A02(bArr, i, i2);
        }
        throw JTO.A0u("closed");
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(".inputStream()", A1A);
    }

    public final int read() {
        C13197TPd tPd = this.A00;
        if (!tPd.A00) {
            C13198TPe tPe = tPd.A01;
            if (tPe.A00 == 0 && C13197TPd.A00(tPe, tPd) == -1) {
                return -1;
            }
            return tPe.readByte() & 255;
        }
        throw JTO.A0u("closed");
    }
}
