package X;

import java.io.File;

/* renamed from: X.Vh0  reason: case insensitive filesystem */
public final class C17847Vh0 {
    public long A00 = -1;
    public long A01 = -1;
    public final C17952Vij A02;
    public final String A03;

    public final long A00() {
        long j = this.A01;
        if (j >= 0) {
            return j;
        }
        long lastModified = this.A02.A00.lastModified();
        this.A01 = lastModified;
        return lastModified;
    }

    public C17847Vh0(String str, File file) {
        this.A03 = str;
        this.A02 = new C17952Vij(file);
    }
}
