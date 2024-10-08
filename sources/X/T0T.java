package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class T0T implements 2IR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C242053Sl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public T0T(C242053Sl r1, String str, String str2, int i) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    public final void onFailure(Throwable th) {
        C242053Sl r2 = this.A01;
        String str = this.A02;
        synchronized (r2) {
            if (str.equals(r2.A02)) {
                r2.A00 = null;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserSession userSession;
        SG0 sg0 = (SG0) obj;
        C242053Sl r3 = this.A01;
        String str = this.A02;
        synchronized (r3) {
            if (str.equals(r3.A02)) {
                r3.A00 = null;
            }
        }
        boolean z = false;
        if (!(sg0 == null || (sg0.A02 == null && sg0.A0N == null && sg0.A03 == null && sg0.A0I == null))) {
            z = true;
        }
        int i = this.A00 + 1;
        if (z) {
            ArrayList A0v = DbS.A0v(1);
            A0v.add(sg0);
            C298215t4 A002 = C298215t4.A00(true, (Integer) null, r3.A04, r3.A05, A0v, (List) null);
            if (!(A002 == null || (userSession = r3.A01) == null)) {
                C239123Fb r1 = new C239123Fb(userSession);
                r1.A09(A002);
                1OC A07 = r1.A07(AnonymousClass05K.A00);
                A07.A00 = new C8764R8p((Object) r3, 5);
                1ES.A03(A07);
            }
        }
        C242053Sl.A01(r3, str, this.A03, i);
    }
}
