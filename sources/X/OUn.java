package X;

import java.util.Map;

public final class OUn {
    public static final OUn A00 = new Object();
    public static final Map A01 = AnonymousClass7TE.A1H();

    public final synchronized long A00(AnonymousClass5HN r3, String str, String str2) {
        long j;
        Long l = (Long) A01.remove(new JV7(r3, str, str2));
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return j;
    }
}
