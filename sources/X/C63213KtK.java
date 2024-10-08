package X;

import java.util.HashSet;
import java.util.regex.Matcher;

/* renamed from: X.KtK  reason: case insensitive filesystem */
public abstract class C63213KtK {
    public static final HashSet A00(String str) {
        0qQ.A0B(str, 0);
        Matcher A09 = 0mp.A09(str);
        HashSet A1F = AnonymousClass7TE.A1F();
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                A1F.add(00p.A0g(group, "@", "", false));
            }
        }
        return A1F;
    }
}
