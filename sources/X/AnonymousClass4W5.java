package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.List;

/* renamed from: X.4W5  reason: invalid class name */
public final class AnonymousClass4W5 extends AnonymousClass4UD {
    public String A00;
    public List A01;
    public List A02;

    public final List A00(QuickPromotionSurface quickPromotionSurface) {
        C283735Jc r0;
        C283755Je r02;
        C283775Jg r03;
        List list;
        0qQ.A0B(quickPromotionSurface, 0);
        List<AnonymousClass5Ja> list2 = this.A02;
        if (list2 != null) {
            for (AnonymousClass5Ja r2 : list2) {
                int i = quickPromotionSurface.A00;
                Integer num = r2.A01;
                if (num != null && i == num.intValue() && (r0 = r2.A00) != null && (r02 = r0.A00) != null && (r03 = r02.A00) != null && (list = r03.A00) != null) {
                    return list;
                }
            }
        }
        return null;
    }
}
