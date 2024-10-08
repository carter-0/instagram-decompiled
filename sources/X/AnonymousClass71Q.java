package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.71Q  reason: invalid class name */
public final class AnonymousClass71Q implements C228372lY {
    public final /* synthetic */ C294255m9 A00;

    public final /* bridge */ /* synthetic */ List AMe(Context context, AnonymousClass0iw r10, UserSession userSession, Object obj, int i) {
        1Xj r3 = (1Xj) obj;
        0qQ.A0B(r3, 4);
        int i2 = i % 3;
        Context context2 = context;
        AnonymousClass0iw r1 = r10;
        UserSession userSession2 = userSession;
        List singletonList = Collections.singletonList(new AnonymousClass9IN(C3252771t.A00(context2, r1, userSession2, r3, this.A00, (String) null, i / 3, i2), i, i2));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public AnonymousClass71Q(C294255m9 r1) {
        this.A00 = r1;
    }
}
