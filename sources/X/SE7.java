package X;

import java.io.File;

public final class SE7 {
    public final int A00;
    public final File A01;

    public SE7(File file, int i) {
        this.A01 = file;
        this.A00 = i;
    }

    public SE7(File file) {
        this.A01 = file;
        this.A00 = 0;
    }
}
