package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class HX5 {
    public static final List A00(Context context, List list) {
        Integer num;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55770Hn5 hn5 = (C55770Hn5) it.next();
            Context context2 = context;
            String A16 = AnonymousClass7TE.A16(context2, hn5.A02.A00);
            Drawable drawable = context2.getDrawable(hn5.A01.A00);
            Integer num2 = hn5.A00.A00;
            if (num2 != null) {
                num = Integer.valueOf(2Yu.A0H(context2, num2.intValue()));
            } else {
                num = null;
            }
            A0r.add(new C367618rI((Drawable) null, drawable, (C15048ULb) null, new IVF(hn5, 0), num, A16, 0, 0, 0, false, false, false, true, false, false, false));
        }
        return 00k.A0a(A0r);
    }
}
