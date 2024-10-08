package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;

/* renamed from: X.HrX  reason: case insensitive filesystem */
public final class C56025HrX {
    public final Activity A00;
    public final UserSession A01;

    public final void A00(C56150Htc htc, C59583JPd jPd, 0sP r20) {
        C59583JPd jPd2 = jPd;
        0qQ.A0B(jPd2, 1);
        C56150Htc htc2 = htc;
        C54556HIr hIr = new C54556HIr(this.A00, C56316HwT.A01(this.A01), htc2, C59098J6g.A01(jPd2, 39), C59098J6g.A01(new C57572Icz(this, 0), 40), C59098J6g.A01(C59098J6g.A01(r20, 41), 43));
        HQL.A00 = hIr;
        hIr.A0G(hIr.A0E);
        Integer num = hIr.A0F;
        int i = hIr.A07;
        hIr.A0F(new I4X(CdsBottomSheetDimmingBehaviour.Default.A00, C46626Di6.FULL_SHEET, num, (Integer) null, (C62320sa) null, i, false), "ImagineLoadingScreen", J5A.A00);
    }

    public final void A01(C56144HtW htW, C59583JPd jPd) {
        new C54555HIq(this.A00, C56316HwT.A01(this.A01), htW, C59098J6g.A01(new C57572Icz(jPd, 1), 42)).A0J();
    }

    public C56025HrX(Activity activity, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, activity);
        this.A01 = userSession;
        this.A00 = activity;
    }
}
