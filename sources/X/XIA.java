package X;

import java.io.ByteArrayOutputStream;
import java.io.Writer;

public final class XIA extends C251883np {
    public final ByteArrayOutputStream A00;

    public final void A02() {
    }

    public final int A00() {
        return this.A00.size();
    }

    public final void A03() {
        this.A00.reset();
    }

    public final void A05(Writer writer) {
        writer.write(this.A00.toString());
    }

    public XIA(C251593nM r1, ByteArrayOutputStream byteArrayOutputStream) {
        super(r1, byteArrayOutputStream);
        this.A00 = byteArrayOutputStream;
    }

    public final 1vB A01() {
        return 1uZ.A01().A02(this.A00);
    }
}
