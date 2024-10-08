package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;

public final class HH4 extends C51086FoG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public static void A00(C56519Hzq hzq, 1Xj r2, AnonymousClass3WA r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r3, 0);
        r4.A0m = r3;
        1sd.A00(hzq.A01).A02(r2, true);
    }

    public HH4(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    public final void Cyb(boolean z) {
        if (2 - this.A00 == 0) {
            ((C55948HqC) this.A04).A00();
        }
    }

    public final void De7() {
        switch (this.A00) {
            case 0:
                A00((C56519Hzq) this.A02, (1Xj) this.A03, (AnonymousClass3WA) this.A01, (AnonymousClass3W1) this.A04);
                return;
            case 1:
                C59689JTv.A0D(((C46498Dg1) this.A03).A00, AnonymousClass000.A00(3789));
                return;
            default:
                return;
        }
    }

    public final void Do0(String str, String str2, String str3) {
        if (this.A00 == 0) {
            C56519Hzq hzq = (C56519Hzq) this.A02;
            1Xj r2 = (1Xj) this.A03;
            AnonymousClass3W1 r1 = (AnonymousClass3W1) this.A04;
            AnonymousClass3WA r0 = (AnonymousClass3WA) this.A01;
            A00(hzq, r2, r0, r1);
            C56519Hzq.A00(hzq, r2, r0, r1, str);
        }
    }

    public final void Do1(String str) {
        AnonymousClass3WA r1;
        switch (this.A00) {
            case 0:
                C56519Hzq hzq = (C56519Hzq) this.A02;
                1Xj r2 = (1Xj) this.A03;
                AnonymousClass3W1 r12 = (AnonymousClass3W1) this.A04;
                AnonymousClass3WA r0 = (AnonymousClass3WA) this.A01;
                A00(hzq, r2, r0, r12);
                C56519Hzq.A00(hzq, r2, r0, r12, str);
                return;
            case 1:
                UserSession userSession = ((C17641VbX) this.A04).A02;
                1sd.A00(userSession).A04(0sr.A1N(C51971G9r.A0s(((ProductTile) this.A02).A05)));
                ((Product) this.A01).A00(userSession);
                return;
            default:
                if (C66579MXk.A00(331).equals(str) || "ig_its_inappropriate".equals(str)) {
                    r1 = AnonymousClass3WA.CLIPS_VIEWER_REPORT_INAPPROPRIATE;
                } else {
                    r1 = AnonymousClass3WA.CLIPS_VIEWER_REPORT_SPAM;
                }
                C267324bN r4 = (C267324bN) this.A01;
                ((JRO) this.A02).Eie(r4, r1);
                ((GBE) this.A03).A0N(r4, "report", true, false);
                return;
        }
    }
}
