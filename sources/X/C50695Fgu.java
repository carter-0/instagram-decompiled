package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.List;
import java.util.Set;

/* renamed from: X.Fgu  reason: case insensitive filesystem */
public final class C50695Fgu implements G6G {
    public final FEW FMu(Context context, UserSession userSession, QuickPromotionSurface quickPromotionSurface, C283795Ji r8, Set set, Set set2, long j, long j2) {
        String str;
        List list;
        AnonymousClass5Jm r1 = r8.A02;
        if (r1 == null || (list = r1.A07) == null || list.isEmpty()) {
            str = "Promotion has no triggers";
        } else {
            for (Object contains : r1.A07) {
                if (set.contains(contains)) {
                    return DbZ.A0W();
                }
            }
            str = "Triggers do not match";
        }
        return new FEW(false, true, str);
    }
}
