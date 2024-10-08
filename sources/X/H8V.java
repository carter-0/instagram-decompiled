package X;

import com.instagram.common.session.UserSession;

public final class H8V extends C230372pW {
    public final 0sL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8V(UserSession userSession, 0sL r4) {
        super(C51969G9p.A0i(1Bk.A03, userSession, AnonymousClass000.A00(3841)));
        0qQ.A0B(userSession, 1);
        this.A00 = r4;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        0sL r2;
        C52236GKd gKd;
        H3M h3m;
        C57088IOc iOc = (C57088IOc) obj;
        C51965G9l.A1U(obj2);
        0qQ.A0B(iOc, 0);
        if (iOc instanceof H3P) {
            r2 = this.A00;
            gKd = C52236GKd.A11;
            h3m = iOc;
        } else if (iOc instanceof H3R) {
            r2 = this.A00;
            gKd = C52236GKd.A0f;
            h3m = iOc;
        } else if (iOc instanceof H3E) {
            r2 = this.A00;
            gKd = C52236GKd.A0B;
            h3m = iOc;
        } else if (iOc instanceof H3F) {
            r2 = this.A00;
            gKd = C52236GKd.A02;
            h3m = iOc;
        } else if (iOc instanceof H3I) {
            r2 = this.A00;
            gKd = C52236GKd.A0o;
            h3m = iOc;
        } else if (iOc instanceof H3J) {
            r2 = this.A00;
            gKd = C52236GKd.A0q;
            h3m = iOc;
        } else if (iOc instanceof H3M) {
            r2 = this.A00;
            H3M h3m2 = (H3M) iOc;
            if (h3m2.A06) {
                gKd = C52236GKd.A08;
                h3m = h3m2;
            } else {
                gKd = C52236GKd.A06;
                h3m = h3m2;
            }
        } else {
            return;
        }
        r2.invoke(gKd, C51971G9r.A0n(0, h3m.getKey()));
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C51965G9l.A1U(obj2);
    }
}
