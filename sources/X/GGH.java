package X;

import android.content.Context;
import android.util.Size;
import com.instagram.common.session.UserSession;

public final class GGH {
    public static final GGH A00 = new Object();

    public final 2WX A00(Context context, 2WX r4, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        if (!A04(context) && !A03(context)) {
            return r4;
        }
        return G9t.A0z(r4, AnonymousClass05K.A0Y, C244413b9.RELATIVE);
    }

    public final 2WX A01(Context context, 2WX r9, UserSession userSession, JP2 jp2) {
        2WX r5;
        AnonymousClass9JQ r3;
        0qQ.A0B(userSession, 2);
        if (jp2 == null) {
            return r9;
        }
        Size BJW = jp2.BJW();
        if (A04(context)) {
            r5 = new 2WX(r9, new AnonymousClass9JQ(AnonymousClass05K.A00, (((float) ((int) (((float) BJW.getHeight()) * 0.5625f))) / ((float) BJW.getWidth())) * 100.0f, 0));
            r3 = new AnonymousClass9JQ(AnonymousClass05K.A01, 100.0f, 0);
        } else if (!A03(context)) {
            return r9;
        } else {
            int width = (int) (((float) BJW.getWidth()) / 0.5625f);
            r5 = new 2WX(r9, new AnonymousClass9JQ(AnonymousClass05K.A00, 100.0f, 0));
            r3 = new AnonymousClass9JQ(AnonymousClass05K.A01, (((float) width) / ((float) BJW.getHeight())) * 100.0f, 0);
        }
        return new 2WX(r5, r3);
    }

    public final 2WX A02(Context context, 2WX r6, UserSession userSession, JP2 jp2) {
        long A0G;
        Integer num;
        0qQ.A0B(userSession, 2);
        if (jp2 == null) {
            return r6;
        }
        Size BJW = jp2.BJW();
        GGH ggh = A00;
        if (ggh.A04(context)) {
            A0G = C51969G9p.A0G((int) C51967G9n.A00((float) BJW.getWidth(), ((float) BJW.getHeight()) * 0.5625f));
            num = AnonymousClass05K.A0C;
        } else if (!ggh.A03(context)) {
            return r6;
        } else {
            A0G = C51969G9p.A0G((int) C51967G9n.A00((float) BJW.getHeight(), ((float) BJW.getWidth()) / 0.5625f));
            num = AnonymousClass05K.A0N;
        }
        return AnonymousClass9JR.A00(r6, num, 1, A0G);
    }

    public final boolean A03(Context context) {
        if (((float) AnonymousClass0nB.A01(context)) / ((float) AnonymousClass0nB.A00(context)) >= 0.44f || !2Y9.A00) {
            return false;
        }
        return true;
    }

    public final boolean A04(Context context) {
        if (((float) AnonymousClass0nB.A01(context)) / ((float) AnonymousClass0nB.A00(context)) <= 0.625f || !2Y9.A00) {
            return false;
        }
        return true;
    }
}
