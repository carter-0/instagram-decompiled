package X;

import android.content.Context;
import android.os.Bundle;

public final class OJO {
    public final 0lg A00;

    public OJO(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void A00(Context context, C69678Nq0 nq0, String str, String str2, String str3, String str4, String str5) {
        String A0n;
        Context context2 = context;
        Bundle A0A = DbY.A0A(context);
        C227642jf.A03(A0A, this.A00);
        OUs oUs = OUs.A00;
        0Yt.A0E();
        OUs oUs2 = OUs.A00;
        synchronized (oUs2) {
            A0n = C51972G9s.A0n();
            OUs.A02.put(A0n, nq0);
        }
        synchronized (oUs2) {
            0Yt.A0E();
            new C73676Php(context2, A0A, A0n, str, str2, str3, str4, str5).invoke();
        }
    }
}
