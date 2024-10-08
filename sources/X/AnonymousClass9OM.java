package X;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9OM  reason: invalid class name */
public final class AnonymousClass9OM implements FileFilter {
    public final /* synthetic */ AnonymousClass3KG A00;

    public AnonymousClass9OM(AnonymousClass3KG r1) {
        this.A00 = r1;
    }

    public final boolean accept(File file) {
        0qQ.A0B(file, 0);
        if (file.lastModified() < System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1) || this.A00.A03.contains(file.getName())) {
            return false;
        }
        return true;
    }
}
