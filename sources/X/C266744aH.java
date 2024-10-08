package X;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4aH  reason: invalid class name and case insensitive filesystem */
public final class C266744aH {
    public int A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public C266724aF A03 = null;
    public File A04;
    public URL A05 = null;

    public final C266754aI A00() {
        if (this.A05 == null) {
            if (this.A04 == null) {
                throw new IllegalArgumentException("Source file and url cannot be both null");
            }
        } else if (this.A04 != null) {
            throw new IllegalArgumentException("Source file and url cannot be both non-null");
        }
        if (this.A03 == null) {
            this.A03 = new C266724aF(TimeUnit.MILLISECONDS, -1, -1);
        }
        return new C266754aI(this);
    }

    public C266744aH(File file) {
        this.A04 = file;
    }
}
