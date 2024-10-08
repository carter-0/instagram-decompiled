package X;

import java.io.File;

/* renamed from: X.SrW  reason: case insensitive filesystem */
public final /* synthetic */ class C12324SrW implements C13589TdH {
    public final /* synthetic */ File A00;

    public /* synthetic */ C12324SrW(File file) {
        this.A00 = file;
    }

    public final File createTempFile(String str, String str2) {
        return File.createTempFile(str, str2, this.A00);
    }
}
