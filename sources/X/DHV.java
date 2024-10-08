package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.List;
import java.util.Set;

public final class DHV implements G6G {
    public final FEW FMu(Context context, UserSession userSession, QuickPromotionSurface quickPromotionSurface, C283795Ji r8, Set set, Set set2, long j, long j2) {
        List<AnonymousClass4VK> list;
        AnonymousClass4VK r0 = r8.A02.A00;
        if (!(r0 == null || (list = r0.A01) == null)) {
            for (AnonymousClass4VK r02 : list) {
                List<AnonymousClass4VM> list2 = r02.A02;
                if (list2 != null) {
                    for (AnonymousClass4VM r03 : list2) {
                        if (r03.A01 == null) {
                            return new FEW(false, true, "Promotion has a filter with missing or invalid data");
                        }
                    }
                    continue;
                }
            }
        }
        return new FEW(true, false, (String) null);
    }
}
