package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3za  reason: invalid class name and case insensitive filesystem */
public abstract class C258753za {
    public static final AnonymousClass407 A00(Context context, C258733zY r4, UserSession userSession) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(context, 3);
        0t0 A01 = AnonymousClass0eN.A01(new C377129Kq(userSession, 9));
        List singletonList = Collections.singletonList(AnonymousClass0eN.A01(new AnonymousClass9MH(3, (Object) context, (Object) userSession, (Object) r4)).getValue());
        0qQ.A07(singletonList);
        return C258763zb.A00(userSession).A00((C258833zi) A01.getValue(), r4, singletonList);
    }
}
