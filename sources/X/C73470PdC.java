package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;

/* renamed from: X.PdC  reason: case insensitive filesystem */
public abstract class C73470PdC implements C62320sa {
    public static NCR A00(Context context, C74295PsU psU, UserSession userSession, O27 o27, String str, ExecutorService executorService, ExecutorService executorService2, C62320sa r17, boolean z) {
        Integer num;
        1XD r9 = (1XD) r17.invoke();
        UserSession userSession2 = userSession;
        NE0 ne0 = new NE0(userSession);
        Context context2 = context;
        C74295PsU psU2 = psU;
        O27 o272 = o27;
        String str2 = str;
        ExecutorService executorService3 = executorService;
        ExecutorService executorService4 = executorService2;
        boolean z2 = z;
        OUV ouv = OUV.A00;
        C71763OqP oqP = new C71763OqP(userSession2, str2);
        0nV AOJ = AnonymousClass12T.A00.AOJ(-18, 3);
        if (r9 != null) {
            AnonymousClass7TG.A1O(o272, ouv);
            num = AnonymousClass05K.A01;
        } else {
            AnonymousClass7TG.A1O(o272, ouv);
            num = AnonymousClass05K.A00;
            r9 = null;
        }
        return new NCR(context2, psU2, ne0, oqP, ouv, o272, r9, num, executorService4, executorService3, AOJ, z2);
    }
}
