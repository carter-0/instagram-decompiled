package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

public final class KH3 extends 2Cl {
    public final Context A00;
    public final UserSession A01;
    public final 1GK A02;
    public final 1GK A03;
    public final MTY A04;
    public final AnonymousClass3Q2 A05;
    public final LinkedHashMap A06;

    public final int getRunnableId() {
        return 325;
    }

    public final Object call() {
        1GK r0 = this.A02;
        if (r0 != null) {
            try {
                Location location = (Location) OX4.A01(r0);
                if (location != null) {
                    AnonymousClass3Q2 r2 = this.A05;
                    r2.A00 = location.getLatitude();
                    r2.A01 = location.getLongitude();
                }
            } catch (InterruptedException unused) {
                0kD.A0G("VideoPrepareTask", "An interrupted occurred while waiting for async parsing of video location metadata to finish.", (Throwable) null);
            }
        }
        1GK r6 = this.A03;
        if (r6 != null) {
            try {
                if (OX4.A02(r6, new OTS(15, TimeUnit.SECONDS))) {
                    AnonymousClass3Q2 r1 = this.A05;
                    Object A07 = r6.A07();
                    A07.getClass();
                    r1.A2k = ((File) A07).getAbsolutePath();
                    27p.A01(this.A01).A04.A0A();
                } else {
                    0kD.A0G("VideoPrepareTask", "Timed out while waiting for async decor image saving to finish.", (Throwable) null);
                    27p.A01(this.A01).A04.A0B("Timed out while waiting for async decor image saving to finish.");
                    return null;
                }
            } catch (InterruptedException e) {
                0kD.A0G("VideoPrepareTask", "An interrupted occurred while waiting for async decor image saving to finish.", e);
                27p.A01(this.A01).A04.A0B("An interrupted occurred while waiting for async decor image saving to finish.");
                return null;
            }
        }
        LinkedHashMap linkedHashMap = this.A06;
        if (linkedHashMap != null) {
            AB8.A01(this.A01, this.A05, linkedHashMap);
        }
        this.A05.A5l = true;
        UserSession userSession = this.A01;
        28K.A00(userSession).A0A();
        28K.A00(userSession).A0B(this.A00.getApplicationContext());
        MTY mty = this.A04;
        if (mty != null) {
            mty.Dvn(new Object());
        }
        return new Object();
    }

    public KH3(Context context, UserSession userSession, 1GK r3, 1GK r4, MTY mty, AnonymousClass3Q2 r6, LinkedHashMap linkedHashMap) {
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = r6;
        this.A03 = r3;
        this.A02 = r4;
        this.A06 = linkedHashMap;
        this.A04 = mty;
    }
}
