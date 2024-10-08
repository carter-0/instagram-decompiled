package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class IKE implements AnonymousClass2WK {
    public final AnonymousClass9IZ A00;
    public final UserSession A01;

    public final 2WL Cfk(2WI r6, long j) {
        long A002;
        0qQ.A0B(r6, 0);
        if (this.A00.A00 == AnonymousClass05K.A00) {
            A002 = C51971G9r.A0J();
        } else {
            2WU r2 = C53965Gx9.A03;
            Context context = r6.A00.A04;
            View A003 = r2.A00(context);
            FC9.A01(context, A003, this.A01, false);
            C51972G9s.A0y(A003, j);
            A002 = C245133cN.A00(Math.max(C245073cH.A03(j), A003.getMeasuredWidth()), Math.max(C245073cH.A02(j), A003.getMeasuredHeight()));
        }
        return new 2WL(A002, (Object) null);
    }

    public IKE(AnonymousClass9IZ r1, UserSession userSession) {
        AnonymousClass7TG.A1O(r1, userSession);
        this.A00 = r1;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
