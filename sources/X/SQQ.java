package X;

import java.io.File;

public final class SQQ {
    public static final SQQ A00 = new Object();

    public static final void A01(String str) {
        0qQ.A0B(str, 0);
        SQQ sqq = A00;
        File A0t = AnonymousClass7TE.A0t(str);
        if (!A0t.exists()) {
            return;
        }
        if (A0t.isDirectory()) {
            sqq.A00(A0t);
        } else if (!A0t.delete()) {
            A0t.delete();
        }
    }

    private final void A00(File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            0sC r2 = new 0sC(listFiles);
            while (r2.hasNext()) {
                File file2 = (File) r2.next();
                if (file2.isDirectory()) {
                    A00(file2);
                } else if (!file2.delete()) {
                    file2.delete();
                }
            }
        }
        if (!file.delete()) {
            file.delete();
        }
    }
}
