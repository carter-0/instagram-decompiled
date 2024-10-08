package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HXh  reason: case insensitive filesystem */
public abstract class C54899HXh {
    public static final boolean A00(Context context, View view, UserSession userSession, List list, C62320sa r28, 0sP r29) {
        Context context2;
        int i;
        Integer num;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (true) {
            context2 = context;
            if (!it.hasNext()) {
                break;
            }
            JQD jqd = (JQD) it.next();
            String A16 = AnonymousClass7TE.A16(context2, jqd.BKN());
            Drawable drawable = context2.getDrawable(jqd.BEI());
            IVI ivi = new IVI(1, (Object) jqd, (Object) r29);
            if (jqd.isNegative()) {
                num = Integer.valueOf(2Yu.A03(context2));
            } else {
                num = null;
            }
            A0r.add(new C367618rI((Drawable) null, drawable, (C15048ULb) null, ivi, num, A16, 0, 0, 0, false, false, false, true, false, false, false));
        }
        UserSession userSession2 = userSession;
        C355148Ov r8 = new C355148Ov(context2, userSession2, (Integer) null, false);
        r8.A02(A0r);
        r8.setOnDismissListener(new IEF(r28, 1));
        View view2 = view;
        int measuredHeight = view2.getMeasuredHeight();
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int A0G = 2Yu.A0G(context2, 0Pn.A01(userSession2));
        int i2 = iArr[1];
        int A0A = C51969G9p.A0A(r8.A00());
        try {
            if (AnonymousClass0nB.A00(context2) - i2 < A0G + A0A + measuredHeight) {
                i = (-A0A) - (measuredHeight / 2);
            } else {
                i = 0;
            }
            r8.showAsDropDown(view2, 0, i);
            return true;
        } catch (WindowManager.BadTokenException unused) {
            return false;
        }
    }
}
