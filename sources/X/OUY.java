package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CompletableFuture;

public final class OUY {
    public static final OUY A00 = new Object();

    public final CompletableFuture A00(UserSession userSession) {
        String str;
        AnonymousClass65E A002 = AnonymousClass65D.A00(userSession);
        CompletableFuture completableFuture = new CompletableFuture();
        if (!AnonymousClass65A.A02(A002.A00, 2342158959164985146L)) {
            19i A01 = 0jh.A04.A01(userSession).A01(19f.A1d);
            if (A01 == null || (str = A01.A01) == null) {
                str = "uniqueDeviceId";
            }
        } else {
            0KC.A0D("EncryptedBackupsDeviceIdUtil", "getDeviceId() start");
            0jh A012 = 0jh.A04.A01(userSession);
            19f r1 = 19f.A1d;
            19i A013 = A012.A01(r1);
            if (A013 == null || (str = A013.A01) == null) {
                Context context = C60960kU.A00;
                0qQ.A07(context);
                0nY.A00().ATE(new C68660NRs(C60820jg.A00(context, r1, userSession), completableFuture));
                return completableFuture;
            }
            C66580MXl.A1U("getDeviceId() device id already available, ", str, "EncryptedBackupsDeviceIdUtil");
        }
        completableFuture.complete(str);
        return completableFuture;
    }
}
