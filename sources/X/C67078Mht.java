package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mht  reason: case insensitive filesystem */
public final class C67078Mht implements AnonymousClass3AB {
    public final /* synthetic */ C66633Ma2 A00;

    public C67078Mht(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void Dcp() {
        C66633Ma2 ma2 = this.A00;
        if (ma2.A05 != 0) {
            UserSession A0p = ma2.A0p();
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, A0p, 36328156240100374L) && C66633Ma2.A0n(ma2, ma2.A05)) {
                if (182.A06(r5, ma2.A0p(), 36328156240690203L)) {
                    ma2.A1I.postDelayed(new C73070PVd(ma2), 1000);
                    return;
                } else {
                    ((AnonymousClass3AD) ma2.A0z.getValue()).setIsLoading(false);
                    return;
                }
            }
        }
        ma2.A05 = System.currentTimeMillis();
        if (C66633Ma2.A0k(ma2)) {
            C66582MXn.A1I(ma2);
        } else {
            ma2.A06 = System.currentTimeMillis();
            ((C74564PxD) ma2.A24.getValue()).EB8();
        }
        C66633Ma2.A0R(ma2);
        C66633Ma2.A0Z(ma2, AnonymousClass05K.A0Y);
        AnonymousClass4A7.A00(ma2.A0p()).A02(true);
        C66633Ma2.A0c(ma2, false);
        C67028Mh1 mh1 = ma2.A0l;
        if (mh1 != null) {
            mh1.A01(true);
        }
    }
}
