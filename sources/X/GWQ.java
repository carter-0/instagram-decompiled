package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class GWQ {
    public static 1yX A00(Context context, UserSession userSession, Reel reel, Integer num, String str, int i, int i2, boolean z, boolean z2) {
        1Xj r3;
        AnonymousClass3WR r4;
        C226952iF A00;
        C255773uh A09 = reel.A09(userSession);
        if (A09 == null || (r3 = A09.A0b) == null) {
            return null;
        }
        if (z) {
            r4 = r3.CEL();
        } else {
            r4 = null;
        }
        String id = r3.getId();
        Resources resources = context.getResources();
        int i3 = R.dimen.clips_netego_card_width;
        if (z2) {
            i3 = R.dimen.alt_text_carousel_card_width;
        }
        ExtendedImageUrl A1m = r3.A1m(resources.getDimensionPixelSize(i3));
        if (A1m == null) {
            A00 = null;
        } else {
            1OO A0J = 1NK.A00().A0J(A1m, str);
            A0J.A0I = true;
            A0J.A0L = false;
            A0J.A0K = r3.CeS();
            r3.A17();
            r3.getId();
            AnonymousClass1MK r0 = C242663Vj.A00;
            1wY.A00(userSession);
            A0J.A02(r0);
            if (!TextUtils.isEmpty(r3.BTL())) {
                A0J.A09 = r3.BTL();
            }
            A00 = A0J.A00();
        }
        return new 1yX(new C242693Vo(A00, r4, id), new C242703Vp(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), num));
    }

    public static void A01(Context context, AnonymousClass0iw r14, UserSession userSession, Integer num, Collection collection, Map map, int i, boolean z, boolean z2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A0v = DbS.A0v(collection.size());
        Iterator it = collection.iterator();
        while (true) {
            UserSession userSession2 = userSession;
            int i2 = i;
            if (it.hasNext()) {
                Reel reel = (Reel) it.next();
                Object obj = map.get(reel);
                obj.getClass();
                Context context2 = context;
                Integer num2 = num;
                1yX A00 = A00(context2, userSession2, reel, num2, r14.getModuleName(), i2, AnonymousClass7TE.A0M(obj), z, z2);
                if (A00 != null) {
                    A0v.add(A00);
                }
            } else {
                A1C.add(new AnonymousClass4FT(A0v, i2, 3));
                1y1.A00(userSession).A05(r14.getModuleName(), A1C);
                return;
            }
        }
    }
}
