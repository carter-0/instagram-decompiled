package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.T6b  reason: case insensitive filesystem */
public final class C12767T6b implements AnonymousClass1Px {
    public final 1Fn A00;
    public final InputStream A01;
    public final AtomicBoolean A02 = JTQ.A0k();

    public final 1Fn Aqb() {
        return null;
    }

    public final long getContentLength() {
        return -1;
    }

    public final 1Fn Aql() {
        return this.A00;
    }

    public final InputStream E15() {
        if (!this.A02.getAndSet(true)) {
            return this.A01;
        }
        0KC.A0C("IgMsysStreamingUploadRequestBody", "openInputStream called more than once");
        return new ByteArrayInputStream(new byte[0]);
    }

    public C12767T6b(1Fn r2, InputStream inputStream) {
        this.A00 = r2;
        this.A01 = inputStream;
    }
}
