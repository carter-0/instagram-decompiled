package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.5Io  reason: invalid class name and case insensitive filesystem */
public final class C283625Io implements FilenameFilter {
    public static final C283625Io A00 = new C283625Io();

    public final boolean accept(File file, String str) {
        if (str == null) {
            return false;
        }
        0qQ.A0B("mp4", 1);
        return str.endsWith("mp4");
    }
}
