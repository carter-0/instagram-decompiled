package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class T6Z implements AnonymousClass1Px {
    public final byte[] A00;
    public final 1Fn A01;

    public final 1Fn Aqb() {
        return null;
    }

    public final 1Fn Aql() {
        return this.A01;
    }

    public final InputStream E15() {
        return new ByteArrayInputStream(this.A00);
    }

    public final long getContentLength() {
        return (long) this.A00.length;
    }

    public T6Z(String str, String str2) {
        this.A00 = str.getBytes("ISO-8859-1");
        this.A01 = new 1Fn("Content-Type", str2);
    }
}
