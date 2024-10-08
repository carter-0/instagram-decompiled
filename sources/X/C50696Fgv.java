package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.Fgv  reason: case insensitive filesystem */
public final class C50696Fgv implements G6G {
    public static boolean A00(Context context, UserSession userSession, AnonymousClass4VG r5, Set set) {
        if (r5 != null && !TextUtils.isEmpty(r5.A03)) {
            String str = r5.A03;
            2bg r0 = 2bg.A0D;
            EnumSet<E> allOf = EnumSet.allOf(2bg.class);
            0qQ.A07(allOf);
            2bg A00 = C49084Ep2.A00(context, userSession, str, allOf);
            if (A00 == null || !set.contains(A00)) {
                return false;
            }
        }
        return true;
    }

    public final FEW FMu(Context context, UserSession userSession, QuickPromotionSurface quickPromotionSurface, C283795Ji r8, Set set, Set set2, long j, long j2) {
        String str;
        List list;
        C283845Jo r0;
        if (!r8.A04) {
            AnonymousClass5Jm r1 = r8.A02;
            if (r1 == null || (list = r1.A06) == null || list.isEmpty()) {
                str = "Promotion has no creatives";
            } else {
                AnonymousClass4V7 r12 = (AnonymousClass4V7) AnonymousClass7TE.A13(r1.A06);
                if (quickPromotionSurface != QuickPromotionSurface.A07 && TextUtils.isEmpty(DbZ.A0n(r12.A09))) {
                    str = "Promotion has no title";
                } else if (quickPromotionSurface != QuickPromotionSurface.A0H && quickPromotionSurface != QuickPromotionSurface.A09 && quickPromotionSurface != QuickPromotionSurface.A0F && ((r0 = r12.A03) == null || TextUtils.isEmpty(DbZ.A0n(r0)))) {
                    str = "Promotion has no content";
                } else if (!A00(context, userSession, r12.A01, set2)) {
                    return FEW.A03;
                } else {
                    if (!A00(context, userSession, r12.A02, set2)) {
                        return FEW.A04;
                    }
                }
            }
            return new FEW(false, true, str);
        }
        return DbZ.A0W();
    }
}
