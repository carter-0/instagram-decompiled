package X;

import java.io.File;
import java.io.InputStream;

/* renamed from: X.T6c  reason: case insensitive filesystem */
public final class C12768T6c implements AnonymousClass1Px {
    public final int A00;
    public final int A01;
    public final C13885Tj8 A02;
    public final File A03;

    public final 1Fn Aqb() {
        return null;
    }

    public final 1Fn Aql() {
        return new 1Fn("Content-Type", "application/octet-stream");
    }

    public final InputStream E15() {
        T6X t6x = new T6X(this);
        C13885Tj8 tj8 = this.A02;
        long j = (long) this.A01;
        long j2 = (long) this.A00;
        tj8.onBytesTransferred(j, j2);
        return new C7238Q0k(t6x, new C8844RCk(this.A03, j, j2), j2);
    }

    public final long getContentLength() {
        return (long) this.A00;
    }

    public C12768T6c(C13885Tj8 tj8, File file, int i, int i2) {
        this.A03 = file;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = tj8;
    }
}
