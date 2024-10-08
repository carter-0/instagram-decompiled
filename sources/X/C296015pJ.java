package X;

import com.google.common.io.Closeables;
import java.io.InputStream;

/* renamed from: X.5pJ  reason: invalid class name and case insensitive filesystem */
public final class C296015pJ implements 1Qb {
    public final long A00;
    public final InputStream A01;

    public final void AI7() {
        Closeables.A01(this.A01);
    }

    public final long AJg() {
        return this.A00;
    }

    public final InputStream AjD() {
        return this.A01;
    }

    public final void close() {
        this.A01.close();
    }

    public C296015pJ(InputStream inputStream, long j) {
        this.A01 = inputStream;
        this.A00 = j;
    }
}
