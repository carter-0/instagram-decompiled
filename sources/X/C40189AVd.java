package X;

import java.io.File;

/* renamed from: X.AVd  reason: case insensitive filesystem */
public final class C40189AVd implements C13589TdH {
    public final /* synthetic */ C370248w4 A00;

    public C40189AVd(C370248w4 r1) {
        this.A00 = r1;
    }

    public final File createTempFile(String str, String str2) {
        0qQ.A0B(str, 0);
        File file = new File(this.A00.A00, "temp");
        0mb.A07(file);
        File createTempFile = File.createTempFile(str, str2, file);
        0qQ.A07(createTempFile);
        return createTempFile;
    }
}
