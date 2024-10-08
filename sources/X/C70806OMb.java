package X;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.OMb  reason: case insensitive filesystem */
public final class C70806OMb {
    public final 0bY A00;
    public final File A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();

    public final File A00() {
        File file = this.A01;
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(002.A0g("Temporary folder ", file.getAbsolutePath(), " is not a directory."));
            } else if (!file.canRead()) {
                throw new IOException(002.A0g("No read permissions for temporary directory ", file.getAbsolutePath(), "."));
            } else if (!file.canWrite()) {
                throw new IOException(002.A0g("No write permissions for temporary directory ", file.getAbsolutePath(), "."));
            }
        } else if (!file.mkdirs()) {
            this.A00.EFT("TempFileDirectoryManager", 002.A0g("Could not create temporary directory. ", file.getCanonicalPath(), ""), (Throwable) null);
        }
        return file;
    }

    public C70806OMb(0bY r2, File file) {
        this.A01 = file.getCanonicalFile();
        this.A00 = r2;
    }

    public final void A01(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        File[] listFiles = A00().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file != null && currentTimeMillis - file.lastModified() >= j) {
                    file.delete();
                }
            }
            Iterator A0t = AnonymousClass7TF.A0t(this.A02);
            while (A0t.hasNext()) {
                ((C70806OMb) A0t.next()).A01(j);
            }
        }
    }
}
