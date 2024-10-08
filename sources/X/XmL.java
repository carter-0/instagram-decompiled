package X;

import android.content.Context;
import java.util.Map;

public abstract class XmL {
    public static final Map A00 = AnonymousClass7TE.A1H();

    public static final void A00(Context context, C21246XQr xQr, C21401Xa9 xa9) {
        Map map = A00;
        if (!map.containsKey(xQr)) {
            map.put(xQr, new XnB(new C61250m8(context, 0), xa9));
            XnB xnB = (XnB) map.get(xQr);
            if (xnB != null) {
                XnB.A00(xa9, xnB, xnB.A03);
            }
        }
    }
}
