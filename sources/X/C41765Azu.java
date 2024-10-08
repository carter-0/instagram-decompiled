package X;

import java.io.File;

/* renamed from: X.Azu  reason: case insensitive filesystem */
public final class C41765Azu extends 0Yg implements 0sL {
    public static final C41765Azu A00 = new C41765Azu();

    public C41765Azu() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        0qQ.A0A(file);
        long lastModified = file.lastModified();
        0qQ.A0A(file2);
        return Integer.valueOf((lastModified > file2.lastModified() ? 1 : (lastModified == file2.lastModified() ? 0 : -1)));
    }
}
