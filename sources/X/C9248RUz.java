package X;

import java.io.File;

/* renamed from: X.RUz  reason: case insensitive filesystem */
public abstract class C9248RUz {
    public static final void A00(File file) {
        File[] listFiles;
        0qQ.A0B(file, 0);
        if (file.isDirectory() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            0sC r1 = new 0sC(listFiles);
            while (r1.hasNext()) {
                File file2 = (File) r1.next();
                0qQ.A0A(file2);
                A00(file2);
            }
        }
        file.delete();
    }
}
