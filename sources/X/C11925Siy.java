package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: X.Siy  reason: case insensitive filesystem */
public final class C11925Siy implements C13767Tgf {
    public final /* bridge */ /* synthetic */ void AI2(Object obj) {
        ((InputStream) obj).close();
    }

    public final Class AvH() {
        return InputStream.class;
    }

    public final /* bridge */ /* synthetic */ Object E0g(File file) {
        return new FileInputStream(file);
    }
}
