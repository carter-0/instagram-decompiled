package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class JY1 {
    public Location A00;
    public final Context A01;
    public final JY2 A02;
    public final long A03 = TimeUnit.DAYS.toMillis(10);

    public final boolean A00() {
        if (this.A00 == null || System.currentTimeMillis() - DbW.A06(JTS.A0V(this.A02), C66579MXk.A00(1156)) > this.A03) {
            return true;
        }
        return false;
    }

    public JY1(Context context, UserSession userSession) {
        this.A01 = context;
        JY2 jy2 = new JY2(userSession);
        this.A02 = jy2;
        0eP A002 = jy2.A00();
        if (A002 != null) {
            Location location = new Location((String) null);
            location.setLatitude((double) AnonymousClass7TE.A04(A002.A00));
            location.setLongitude((double) AnonymousClass7TE.A04(A002.A01));
            this.A00 = location;
        }
    }
}
