package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileInputStream;

public final class KH9 extends 2Cl {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C270194gL A01;
    public final /* synthetic */ C309636Za A02;

    public final int getRunnableId() {
        return 768;
    }

    public final void onFail(Exception exc) {
        11Z.A03(new C51419Ftp(this.A02, false));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        11Z.A03(new C51419Ftp(this.A02, true));
    }

    public KH9(Context context, C270194gL r2, C309636Za r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        Context context = this.A00;
        File A0t = AnonymousClass7TE.A0t(AnonymousClass457.A09(context, ".mp4", System.nanoTime(), true));
        C270194gL r1 = this.A01;
        C309636Za r6 = this.A02;
        UserSession userSession = r6.A01;
        if (userSession != null) {
            AnonymousClass3WR A04 = r1.A04(userSession);
            if (!(A04 == null || (str = A04.A0L) == null)) {
                UserSession userSession2 = r6.A01;
                if (userSession2 != null) {
                    File A07 = C59730JVo.A07(userSession2, A0t, str, -1);
                    if (A07 != null) {
                        if (!A07.equals(A0t)) {
                            0mb.A09(A0t, new FileInputStream(A07));
                        }
                        C59730JVo.A08(context, A0t);
                        11Z.A03(new C51419Ftp(r6, true));
                        return null;
                    }
                }
            }
            throw new Exception("Attempt to download archive could not find cache or file");
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }
}
