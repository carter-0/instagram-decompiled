package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class LQZ {
    public UserSession A00;
    public 1Xj A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;

    public static LQZ A00(UserSession userSession) {
        return (LQZ) userSession.A01(LQZ.class, new MBI(userSession, 1));
    }

    public static void A01(Context context, LQZ lqz, AnonymousClass8VT r15) {
        List list;
        int i;
        int i2;
        boolean z = r15.A04;
        HashSet A1F = AnonymousClass7TE.A1F();
        HashSet A1F2 = AnonymousClass7TE.A1F();
        lqz.A01.getClass();
        C51970G9q.A1Q(lqz.A01.getId(), A1F, A1F2, z ? 1 : 0);
        UserSession userSession = lqz.A00;
        Reel A0M = 1OP.A05(userSession).A0M(r15.A00);
        A0M.getClass();
        String id = lqz.A01.getId();
        id.getClass();
        C63830L8l A002 = JZV.A00(context, userSession, A0M, id);
        String str = null;
        if (A002 != null) {
            str = A002.A03;
            list = JZV.A05(A002);
            ImageUrl imageUrl = A002.A02;
            i = imageUrl.getHeight();
            i2 = imageUrl.getWidth();
        } else {
            list = null;
            i = 0;
            i2 = 0;
        }
        String str2 = r15.A00;
        String str3 = r15.A02;
        0qQ.A0B(str3, 0);
        Object obj = Ki3.A01.get(str3);
        if (obj != null) {
            Ki3 ki3 = (Ki3) obj;
            C51973G9u.A1E(userSession, str2, ki3);
            1OC A012 = AnonymousClass738.A01(ki3, userSession, str2, (String) null, str, (String) null, list, A1F, A1F2, i, i2);
            A012.A00 = new KA7(lqz, r15.A00, z);
            1ES.A03(A012);
            return;
        }
        throw AnonymousClass7TE.A0z("value not found in the enum's reverse map");
    }

    public static void A02(LQZ lqz, AnonymousClass8VT r13) {
        lqz.A01.getClass();
        UserSession userSession = lqz.A00;
        String str = r13.A02;
        0qQ.A0B(str, 0);
        Object obj = Ki3.A01.get(str);
        if (obj != null) {
            Ki3 ki3 = (Ki3) obj;
            HashSet hashSet = new HashSet(Collections.singletonList(lqz.A01.getId()));
            String str2 = r13.A01;
            str2.getClass();
            String id = lqz.A01.getId();
            int A0x = lqz.A01.A0x();
            int A0y = lqz.A01.A0y();
            List list = r13.A03;
            AnonymousClass7TF.A1H(userSession, ki3);
            1OC A002 = AnonymousClass738.A00(ki3, userSession, str2, id, (String) null, (String) null, list, hashSet, A0x, A0y, false);
            A002.A00 = new KA4(lqz);
            1ES.A03(A002);
            return;
        }
        throw AnonymousClass7TE.A0z("value not found in the enum's reverse map");
    }
}
