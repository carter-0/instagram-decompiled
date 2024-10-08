package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

public final class LS7 {
    public C63830L8l A00;
    public C63830L8l A01;
    public Reel A02;
    public String A03;
    public boolean A04;
    public final UserSession A05;
    public final List A06 = AnonymousClass7TE.A1C();

    public static void A01(LS7 ls7) {
        List list = ls7.A06;
        list.clear();
        Reel reel = ls7.A02;
        if (reel != null) {
            for (C255773uh r0 : reel.A0O(ls7.A05)) {
                list.add(r0.A0b);
            }
            String str = reel.A0r;
            str.getClass();
            ls7.A03 = str;
            ls7.A01 = C64184LSr.A01(reel);
            ls7.A00 = C64184LSr.A01(reel);
        }
    }

    public static boolean A02(C63830L8l l8l, C63830L8l l8l2, UserSession userSession, Reel reel, String str, List list) {
        if (!str.equals(reel.A0r)) {
            return true;
        }
        l8l.getClass();
        l8l2.getClass();
        if (!2PP.A00(l8l.A03, l8l2.A03) || !2PP.A00(l8l.A04, l8l2.A04) || (!l8l.A00.equals(l8l2.A00))) {
            return true;
        }
        List A0O = reel.A0O(userSession);
        if (list.size() != A0O.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            1Xj r2 = ((C255773uh) A0O.get(i)).A0b;
            r2.getClass();
            String id = DbZ.A0T(list, i).getId();
            id.getClass();
            if (!id.equals(r2.getId())) {
                return true;
            }
        }
        return false;
    }

    public LS7(UserSession userSession) {
        this.A05 = userSession;
    }

    public static C239693Hq A00(C63830L8l l8l) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        RectF rectF = l8l.A01;
        JTP.A1V(A1C, rectF.left);
        JTP.A1V(A1C, rectF.top);
        JTP.A1V(A1C, rectF.right);
        JTP.A1V(A1C, rectF.bottom);
        ImageUrl imageUrl = l8l.A02;
        int height = imageUrl.getHeight();
        String url = imageUrl.getUrl();
        return new C239693Hq(new C294065ln(height, "", url, imageUrl.getWidth()), new C294065ln(imageUrl.getHeight(), "", url, imageUrl.getWidth()), l8l.A03, l8l.A04, A1C);
    }
}
