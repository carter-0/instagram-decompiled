package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* renamed from: X.MdJ  reason: case insensitive filesystem */
public abstract class C66827MdJ {
    public static final AnonymousClass59G A00(Context context, UserSession userSession, int i) {
        String A0i;
        DbY.A1S(context, userSession);
        int A04 = DbS.A04(0Tu.A05, userSession, 36599280345091551L);
        boolean z = true;
        Resources resources = context.getResources();
        if (i > A04) {
            A0i = JTS.A0i(resources, A04, 2131960766);
            i = A04;
        } else {
            if (i == 0) {
                A0i = resources.getString(2131959785);
            } else {
                A0i = JTS.A0i(resources, i, 2131959786);
            }
            z = false;
        }
        0qQ.A0A(A0i);
        return new AnonymousClass59G(Integer.valueOf(i), Boolean.valueOf(z), A0i);
    }
}
