package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class PF2 implements AnonymousClass77Z {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C74454Pv9 A02;
    public final /* synthetic */ C67087Mi3 A03;
    public final /* synthetic */ C68167N3h A04;
    public final /* synthetic */ AnonymousClass2Ep A05;

    public final void Doh(List list) {
        0qQ.A0B(list, 0);
        C254703su r5 = (C254703su) list.get(0);
        C67087Mi3 mi3 = this.A03;
        UserSession userSession = mi3.A04;
        if (!r5.A1e(userSession)) {
            this.A02.DQ2();
            this.A05.C6C();
            return;
        }
        Context context = this.A00;
        AnonymousClass2Ep r0 = this.A05;
        User A042 = AnonymousClass48N.A04(userSession, r5, r0);
        if (A042 != null) {
            C68167N3h A022 = C271384il.A02(context, userSession, r5, A042, AnonymousClass48N.A06(r0));
            this.A02.DQk(this.A04, A022);
            C67087Mi3.A00(mi3, A022, this.A01.getModuleName());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public PF2(Context context, AnonymousClass0iw r2, C74454Pv9 pv9, C67087Mi3 mi3, C68167N3h n3h, AnonymousClass2Ep r6) {
        this.A03 = mi3;
        this.A02 = pv9;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = n3h;
        this.A00 = context;
    }

    public final void DEc(String str) {
        C67087Mi3.A00(this.A03, this.A04, this.A01.getModuleName());
    }
}
