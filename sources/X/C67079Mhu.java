package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mhu  reason: case insensitive filesystem */
public final class C67079Mhu implements Runnable {
    public final /* synthetic */ C66633Ma2 A00;

    public C67079Mhu(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final void run() {
        C66633Ma2 ma2 = this.A00;
        if (ma2.A05 != 0) {
            UserSession A0p = ma2.A0p();
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, A0p, 36328156240100374L) && C66633Ma2.A0n(ma2, ma2.A05)) {
                if (182.A06(r5, ma2.A0p(), 36328156240690203L)) {
                    ma2.A1I.postDelayed(new C73069PVc(ma2), 1000);
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
        if (!182.A06(0Tu.A05, C66580MXl.A0P(ma2, 0), 36328285088726207L)) {
            AnonymousClass0eM r1 = ma2.A2c;
            if (((C66609MYv) r1.getValue()).A00 != null) {
                C66609MYv mYv = (C66609MYv) r1.getValue();
                List list = mYv.A00;
                if (list != null) {
                    AnonymousClass1Nd.A00(mYv.A01).A00(new C67323Mlz(list));
                }
            } else {
                C66633Ma2.A0R(ma2);
            }
        }
        C66633Ma2.A0Z(ma2, AnonymousClass05K.A0Y);
        AnonymousClass4A7.A00(ma2.A0p()).A02(true);
        C66633Ma2.A0c(ma2, false);
        C228312lJ r0 = ma2.A1R;
        if (r0 != null) {
            r0.A02();
        }
    }
}
