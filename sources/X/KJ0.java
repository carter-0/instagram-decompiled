package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class KJ0 extends 0ng {
    public final /* synthetic */ C321016tR A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJ0(C321016tR r4, File file, String str) {
        super(135, 2, false, false);
        this.A02 = str;
        this.A01 = file;
        this.A00 = r4;
    }

    public final void run() {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.A02);
            File file = this.A01;
            0mb.A09(file, fileInputStream);
            C321016tR r0 = this.A00;
            C321086tY r2 = r0.A0f;
            if (r2 != null) {
                r2.A03(r0.A0k, file.getAbsolutePath());
            }
        } catch (IOException e) {
            0wb.A06("failed to cache audio file", 002.A0u("from: ", this.A02, " to: ", this.A01.getAbsolutePath()), e);
        }
    }
}
