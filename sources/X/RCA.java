package X;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.util.Iterator;

public final class RCA extends FilterInputStream implements Iterable {
    public final S58 A00;

    public RCA(S58 s58, byte[] bArr) {
        super(new ByteArrayInputStream(bArr));
        this.A00 = s58;
    }

    public final RRQ A00() {
        try {
            S58 s58 = this.A00;
            SPJ A01 = s58.A01(this);
            return A01.A01(s58).A00(A01, s58.A02(this, s58.A00(this)));
        } catch (TQK e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(String.format("Cannot parse ASN.1 object from stream", Pxe.A1b()), e2);
        }
    }

    public final Iterator iterator() {
        return new TM7(this);
    }
}
