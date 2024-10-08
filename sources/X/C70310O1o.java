package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.O1o  reason: case insensitive filesystem */
public abstract class C70310O1o {
    public static Drawable A00(Context context, AnonymousClass0iw r7, Boolean bool, List list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i3 = 0;
        if (list.size() == 1) {
            return new C244303ay(DbS.A0V(AnonymousClass7TE.A19(list, 0)), r7.getModuleName(), AnonymousClass7TF.A02(context, i), 0, 0, 0);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        while (i3 < list.size()) {
            A1C.add(DbS.A0V(AnonymousClass7TE.A19(list, i3)));
            i3++;
            if (i3 >= 3) {
                break;
            }
        }
        ON3 on3 = new ON3(context, r7.getModuleName(), A1C, AnonymousClass7TF.A02(context, i));
        on3.A0G = true;
        on3.A0B = bool.booleanValue();
        on3.A01(AnonymousClass7TF.A02(context, i2));
        on3.A0D = true;
        return on3.A00();
    }
}
