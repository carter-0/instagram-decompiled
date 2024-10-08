package X;

import java.io.File;

/* renamed from: X.SrY  reason: case insensitive filesystem */
public final class C12326SrY implements C13589TdH {
    public final File A00;

    public final File createTempFile(String str, String str2) {
        return File.createTempFile(str, str2, this.A00);
    }

    public C12326SrY(File file) {
        this.A00 = file;
    }

    public C12326SrY() {
        this.A00 = null;
    }
}
