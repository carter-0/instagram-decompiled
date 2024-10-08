package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class Q10 implements C13966TmT {
    public final String A00;
    public final byte[] A01;

    public final long Cfu() {
        return (long) this.A01.length;
    }

    public final InputStream E15() {
        return new ByteArrayInputStream(this.A01);
    }

    public final String getContentType() {
        return "application/octet-stream";
    }

    public final String getName() {
        return this.A00;
    }

    public Q10(String str, byte[] bArr) {
        this.A00 = str;
        this.A01 = bArr;
    }
}
