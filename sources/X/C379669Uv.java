package X;

import android.location.Location;
import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Uv  reason: invalid class name and case insensitive filesystem */
public abstract class C379669Uv {
    public static final Pair A00(UserSession userSession) {
        Location lastLocation;
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        if (A0q.getString("torch_relay_prefecture", (String) null) != null) {
            float f = A0q.getFloat("torch_relay_lat", 0.0f);
            float f2 = A0q.getFloat("torch_relay_lng", 0.0f);
            if (!(f == 0.0f || f2 == 0.0f)) {
                return new Pair(Float.valueOf(f), Float.valueOf(f2));
            }
        }
        1Wr r2 = 1Wr.A00;
        if (r2 == null || (lastLocation = r2.getLastLocation(userSession, "UnlockableStickersUtil")) == null) {
            return null;
        }
        return new Pair(Float.valueOf((float) lastLocation.getLatitude()), Float.valueOf((float) lastLocation.getLongitude()));
    }

    public static final void A01(1P0 r3, UserSession userSession, String str) {
        AnonymousClass7TG.A1N(userSession, str);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0K("creatives/unlock_sticker/%s/", new Object[]{str});
        A0b.A0Q(C384529hT.class, C39818AAp.class);
        1OC A0M = A0b.A0M();
        A0M.A00 = r3;
        1ES.A03(A0M);
    }
}
