package X;

import com.facebook.common.build.BuildConstants;
import java.io.File;

/* renamed from: X.Rw0  reason: case insensitive filesystem */
public final class C10666Rw0 {
    public final C635813i A00;
    public final File A01;
    public final File A02;
    public final File A03;

    public C10666Rw0(C635813i r2, File file, File file2) {
        0JA.A03(file, "cacheDir == null");
        this.A01 = file;
        0JA.A03(file2, "tempDir == null");
        this.A03 = file2;
        this.A00 = r2;
        this.A02 = JTO.A0s(file, String.valueOf(BuildConstants.A01()));
    }
}
