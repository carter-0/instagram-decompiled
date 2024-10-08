package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.5wr  reason: invalid class name and case insensitive filesystem */
public abstract class C300285wr {
    public static final String A00() {
        String str = null;
        try {
            str = AnonymousClass1F2.A00().AXT((1LJ) null, 195432639).getCanonicalPath();
        } catch (IOException unused) {
            0wb.A03("msys_mailbox_config", "Unable to retrieve canonical path from Cask");
        }
        if (str == null) {
            return str;
        }
        0qQ.A0B("/", 1);
        if (!str.endsWith("/")) {
            return 002.A0C(str, '/');
        }
        return str;
    }

    public static final void A01(File file) {
        if (file.isDirectory()) {
            0sC A00 = 0pe.A00(file.listFiles());
            while (A00.hasNext()) {
                File file2 = (File) A00.next();
                0qQ.A0A(file2);
                A01(file2);
            }
        }
        file.delete();
    }
}
