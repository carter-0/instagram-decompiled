package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.3nm  reason: invalid class name and case insensitive filesystem */
public final class C251853nm implements FileFilter {
    public final boolean accept(File file) {
        if (!file.isFile()) {
            return false;
        }
        String name = file.getName();
        if (!name.startsWith("batch-") || !name.endsWith(".json")) {
            return false;
        }
        return true;
    }
}
