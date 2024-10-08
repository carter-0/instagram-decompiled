package X;

import java.io.File;

/* renamed from: X.Rfq  reason: case insensitive filesystem */
public abstract class C9732Rfq {
    public static String A00(File file) {
        if (file.getName().endsWith(".apk")) {
            String name = file.getName();
            String str = "";
            String replaceFirst = name.replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.").replace(".config.master", str);
                str2 = ".config.main";
            }
            return replaceFirst.replace(str2, str);
        }
        throw AnonymousClass7TE.A0w("Non-apk found in splits directory.");
    }
}
