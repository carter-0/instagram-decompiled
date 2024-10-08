package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Yt  reason: invalid class name and case insensitive filesystem */
public final class C333387Yt extends C331647Ru {
    public final C62320sa A00;
    public final C62320sa A01;

    public final void A05(View view) {
        UserSession userSession = this.A00.A00;
        if (!C331227Qb.A03(userSession)) {
            int i = ((AnonymousClass7SD) this.A01.invoke()).A08;
            if (i == 1012) {
                if (!182.A06(0Tu.A05, userSession, 36324831935082893L)) {
                    C49951FGg.A01((Activity) this.A00.invoke(), userSession, EV9.A04, C69503Nml.A0H.toString(), (String) null, true);
                }
            } else if (i == 1014) {
                C69837Nsz.A00(userSession, (Activity) this.A00.invoke(), C69503Nml.A0H.toString());
            }
        }
    }

    public final boolean A08() {
        return AnonymousClass9B8.A07(this.A00.A00);
    }

    public C333387Yt(C331627Rs r1, C62320sa r2, C62320sa r3) {
        super(r1);
        this.A00 = r2;
        this.A01 = r3;
    }
}
