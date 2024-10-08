package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class IWJ implements C228372lY {
    public final int A00;

    public final /* bridge */ /* synthetic */ List AMe(Context context, AnonymousClass0iw r9, UserSession userSession, Object obj, int i) {
        1Xj r4;
        Object obj2 = obj;
        Context context2 = context;
        AnonymousClass0iw r2 = r9;
        UserSession userSession2 = userSession;
        int i2 = i;
        if (this.A00 == 0) {
            return C242613Ve.A01(context, r9, userSession, AnonymousClass7TE.A1I(obj), i);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (obj instanceof 1Xj) {
            r4 = (1Xj) obj2;
        } else if (obj instanceof AnonymousClass3OA) {
            r4 = ((AnonymousClass3OA) obj2).A0K;
        } else {
            if (obj instanceof AnonymousClass3UH) {
                C242613Ve.A03(context2, r2, userSession2, (AnonymousClass3UH) obj2, A1C, i2);
                return A1C;
            }
            return A1C;
        }
        C242613Ve.A02(context2, r2, userSession2, r4, A1C, i2);
        return A1C;
    }

    public IWJ(int i) {
        this.A00 = i;
    }
}
