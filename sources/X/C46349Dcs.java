package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Comparator;

/* renamed from: X.Dcs  reason: case insensitive filesystem */
public final class C46349Dcs implements Comparator {
    public final QuickPromotionSurface A00;
    public final 2bx A01;

    public C46349Dcs(QuickPromotionSurface quickPromotionSurface, 2bx r4) {
        0qQ.A0B(r4, 2);
        this.A01 = r4;
        this.A00 = quickPromotionSurface == null ? r4.A00[3] : quickPromotionSurface;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass4UE r7 = (AnonymousClass4UE) obj;
        AnonymousClass4UE r8 = (AnonymousClass4UE) obj2;
        AnonymousClass7TG.A1N(r7, r8);
        AnonymousClass4UC r72 = (AnonymousClass4UC) r7;
        AnonymousClass4UC r82 = (AnonymousClass4UC) r8;
        int i = r72.A01;
        int i2 = r82.A01;
        if (i == i2) {
            2bx r4 = this.A01;
            QuickPromotionSurface quickPromotionSurface = this.A00;
            QuickPromotionSurface quickPromotionSurface2 = r72.A06;
            QuickPromotionSurface quickPromotionSurface3 = r82.A06;
            0qQ.A0B(quickPromotionSurface, 0);
            QuickPromotionSurface[] quickPromotionSurfaceArr = r4.A00;
            int A002 = 2by.A00(quickPromotionSurface2, quickPromotionSurfaceArr);
            int A003 = 2by.A00(quickPromotionSurface3, quickPromotionSurfaceArr);
            int A004 = 2by.A00(quickPromotionSurface, quickPromotionSurfaceArr);
            int i3 = A002 - A004;
            if (A004 >= A002) {
                i3 = A002 + (4 - A004);
            }
            int i4 = A003 - A004;
            if (A004 >= A003) {
                i4 = A003 + (4 - A004);
            }
            if (i3 == i4) {
                return 0;
            }
            if (i3 > i4) {
                return 1;
            }
            return -1;
        } else if (i < i2) {
            return -1;
        } else {
            return 1;
        }
    }
}
