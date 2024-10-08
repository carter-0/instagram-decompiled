package X;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9wv  reason: invalid class name and case insensitive filesystem */
public abstract class C393739wv {
    public static final String A00(1Av r10, long j) {
        List list;
        Integer A0l;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMdd", Locale.getDefault());
        Object obj = null;
        String string = r10.A01.getString("last_saved_draft_date_and_count", (String) null);
        int i = 0;
        String str = null;
        if (string != null) {
            list = 00l.A0R(string, new String[]{"-"}, 0);
        } else {
            list = null;
        }
        if (-1 == j) {
            j = System.currentTimeMillis();
        }
        String format = simpleDateFormat.format(Long.valueOf(j));
        if (list != null) {
            obj = 00k.A0O(list, 0);
            str = (String) 00k.A0O(list, 1);
        }
        if (0qQ.A0K(obj, format)) {
            if (!(str == null || (A0l = 00y.A0l(str)) == null)) {
                i = A0l.intValue();
            }
            return 002.A0G(format, '-', i + 1);
        }
        0qQ.A0A(format);
        return format;
    }
}
