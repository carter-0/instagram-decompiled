package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.DhI  reason: case insensitive filesystem */
public final class C46576DhI implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ C46577DhJ A05;
    public final /* synthetic */ C46578DhK A06;
    public final /* synthetic */ C51981GAe A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    public C46576DhI(Activity activity, AnonymousClass0iw r2, UserSession userSession, User user, C46577DhJ dhJ, C46578DhK dhK, C51981GAe gAe, String str, List list, int i, boolean z) {
        this.A09 = list;
        this.A04 = user;
        this.A06 = dhK;
        this.A05 = dhJ;
        this.A03 = userSession;
        this.A02 = r2;
        this.A01 = activity;
        this.A0A = z;
        this.A00 = i;
        this.A07 = gAe;
        this.A08 = str;
    }

    public final void run() {
        List list = this.A09;
        User user = this.A04;
        C46578DhK dhK = this.A06;
        C46577DhJ dhJ = this.A05;
        UserSession userSession = this.A03;
        AnonymousClass0iw r1 = this.A02;
        Activity activity = this.A01;
        boolean z = this.A0A;
        C46575DhH.A01(activity, r1, userSession, user, dhJ, dhK, this.A07, this.A08, list, this.A00, z);
    }
}
