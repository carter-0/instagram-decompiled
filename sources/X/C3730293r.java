package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.93r  reason: invalid class name and case insensitive filesystem */
public final class C3730293r implements FileFilter {
    public static final C3730293r A00 = new C3730293r();

    public final boolean accept(File file) {
        String name = file.getName();
        0qQ.A07(name);
        if (!00p.A0k(name, "cpu", false) || file.getName().length() < 4 || !Character.isDigit(file.getName().charAt(3))) {
            return false;
        }
        return true;
    }
}
