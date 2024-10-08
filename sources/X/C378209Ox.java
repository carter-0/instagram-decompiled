package X;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: X.9Ox  reason: invalid class name and case insensitive filesystem */
public abstract class C378209Ox {
    public static final Typeface A00(Context context, String str) {
        0qm r2;
        0qQ.A0B(str, 1);
        if (!0mp.A0B(str)) {
            if (str.equals("Optimistic Display App")) {
                r2 = 0qm.A0i;
            } else if (str.equals("Optimistic Display App Medium")) {
                r2 = 0qm.A0j;
            } else if (str.equals("Optimistic Text App Regular")) {
                r2 = 0qm.A0m;
            } else if (str.equals("Optimistic Text App Medium")) {
                r2 = 0qm.A0l;
            } else if (str.equals("Optimistic Text App Bold")) {
                r2 = 0qm.A0k;
            } else if (str.equals("Optimistic VF App Lite")) {
                r2 = 0qm.A0n;
            } else if (str.equals("Old Standard TT")) {
                r2 = 0qm.A0g;
            } else if (str.equals("Montserrat")) {
                r2 = 0qm.A0e;
            } else if (str.equals("Montserrat Extra Bold Italic")) {
                r2 = 0qm.A0c;
            } else if (str.equals("Aveny T Medium")) {
                r2 = 0qm.A0W;
            } else if (str.equals("Instagram Sans Condensed")) {
                r2 = 0qm.A0V;
            } else if (str.equals("Barlow Semi Bold")) {
                r2 = 0qm.A08;
            } else if (str.equals("Courier Prime Bold")) {
                r2 = 0qm.A0C;
            } else if (!str.equals("Didot")) {
                if (str.equals("prism")) {
                    r2 = 0qm.A0q;
                } else if (str.equals("prism-medium")) {
                    r2 = 0qm.A0r;
                } else if (str.equals("prism-bold")) {
                    r2 = 0qm.A0p;
                }
            }
            Typeface create = Typeface.create(AnonymousClass0qo.A00(context).A02(r2), 0);
            if (create != null) {
                return create;
            }
        }
        Typeface create2 = Typeface.create(str, 0);
        0qQ.A07(create2);
        return create2;
    }
}
