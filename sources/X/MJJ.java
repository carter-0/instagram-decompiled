package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class MJJ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJJ(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = str;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            Activity activity = (Activity) this.A01;
            UserSession userSession = (UserSession) this.A03;
            1Xj r4 = (1Xj) this.A02;
            String str = this.A05;
            String str2 = this.A04;
            long j = C55351HgJ.A00;
            AnonymousClass37D A0i = DbT.A0i(activity);
            if (A0i != null) {
                ((AnonymousClass37F) A0i).A0m = true;
            }
            C51974G9v.A1P(activity, userSession, r4, str);
            0qQ.A0B(str2, 5);
            C49115Epe.A00(activity, userSession, r4, str2, str);
        } else {
            C314556iS r42 = (C314556iS) this.A03;
            C314556iS.A00((AnonymousClass9JK) this.A02, (1Xj) this.A01, r42, this.A04, this.A05);
            ((C309496Ym) r42.A0A.getValue()).A01();
            C314556iS.A01(C65582LwG.A00, r42);
        }
        return C60340gF.A00;
    }
}
