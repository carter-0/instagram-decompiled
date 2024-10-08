package X;

import java.io.File;

public final class KId extends 0ng {
    public final /* synthetic */ File A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KId(File file) {
        super(202);
        this.A00 = file;
    }

    public final void run() {
        File[] listFiles = this.A00.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.getName().contains("-stitched")) {
                    file.delete();
                }
            }
        }
    }
}
