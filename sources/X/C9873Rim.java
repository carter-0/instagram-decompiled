package X;

import android.content.Context;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Rim  reason: case insensitive filesystem */
public abstract class C9873Rim {
    public static String A00(Context context, List list, Locale locale) {
        int size = list.size();
        if (size == 0) {
            throw Pxe.A0g();
        } else if (size == 1) {
            return AnonymousClass7TE.A19(list, 0);
        } else {
            if (size == 2) {
                return DbV.A0u(context, list.get(0), list.get(1), 2131963517);
            }
            Object obj = list.get(0);
            String string = context.getString(2131963517);
            T9s t9s = new T9s(list.size() * 5);
            Formatter formatter = new Formatter(t9s, locale);
            for (int i = 1; i < size; i++) {
                formatter.format(string, new Object[]{obj, list.get(i)});
                List list2 = t9s.A02;
                obj = new C12841T9x(list2, t9s.A01, list2.size(), t9s.A00);
                t9s.A01 = list2.size();
                t9s.A00 = 0;
            }
            return obj.toString();
        }
    }
}
