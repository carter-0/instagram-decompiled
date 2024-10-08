package X;

import java.io.File;

/* renamed from: X.9yO  reason: invalid class name and case insensitive filesystem */
public abstract class C394609yO {
    public static final File A00(C370248w4 r2, File file, String str) {
        File file2 = new File(r2.A00, str);
        0mb.A07(file2);
        File file3 = new File(file2, "assets");
        0mb.A07(file3);
        File createTempFile = File.createTempFile("asset", 002.A0D(AnonymousClass5Kg.A05(file), '.'), file3);
        0qQ.A07(createTempFile);
        return createTempFile;
    }
}
