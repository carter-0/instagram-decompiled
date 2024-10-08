package X;

import android.content.Context;
import java.util.Map;

public final class SH1 {
    public static final SH1 A02 = new SH1();
    public final Map A00 = AnonymousClass7TE.A1E();
    public final Map A01 = AnonymousClass7TE.A1E();

    public final int A00(Context context, String str) {
        int i;
        0qQ.A0B(context, 0);
        if (str == null || str.length() == 0) {
            return 0;
        }
        String A0g = 00p.A0g(AnonymousClass7TF.A0j(str), "-", "_", false);
        try {
            return Integer.parseInt(A0g);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                Map map = this.A00;
                Integer num = (Integer) map.get(A0g);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = context.getResources().getIdentifier(A0g, "drawable", context.getPackageName());
                    C66580MXl.A1T(A0g, map, i);
                }
                return i;
            }
        }
    }
}
