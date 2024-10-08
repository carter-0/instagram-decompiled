package X;

import java.io.IOException;
import java.util.Iterator;

public final class TM7 implements Iterator {
    public final /* synthetic */ RCA A00;

    public final boolean hasNext() {
        try {
            return this.A00.available() > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    public TM7(RCA rca) {
        this.A00 = rca;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.A00();
    }

    public final void remove() {
        throw AnonymousClass7TE.A1B("Remove not supported on ASN.1 InputStream iterator");
    }
}
