package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.creation.location.NearbyVenuesService;
import com.instagram.location.intf.LocationSignalPackage;
import java.util.List;

/* renamed from: X.LgV  reason: case insensitive filesystem */
public final class C64700LgV implements 1wn, C267874cM {
    public Location A00;
    public final long A01;
    public final Context A02;
    public final UserSession A03;
    public final C66480MTi A04;
    public final 1Wr A05;
    public final String A06;
    public final AnonymousClass3Q2 A07;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r8 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C64700LgV(android.content.Context r4, com.instagram.common.session.UserSession r5, X.C66480MTi r6, X.1Wr r7, X.AnonymousClass3Q2 r8, java.lang.String r9) {
        /*
            r3 = this;
            r0 = 7
            X.0qQ.A0B(r9, r0)
            r3.<init>()
            r3.A02 = r4
            r3.A03 = r5
            r3.A05 = r7
            r3.A04 = r6
            r3.A07 = r8
            r3.A06 = r9
            r1 = 0
            if (r8 == 0) goto L_0x002f
            java.util.HashMap r2 = r8.A44
            if (r2 == 0) goto L_0x002f
            java.lang.String r0 = "date_time_original"
            java.lang.String r2 = X.DbS.A0r(r0, r2)
        L_0x0020:
            X.1iA r1 = r8.A1G
        L_0x0022:
            X.1iA r0 = X.1iA.A0Q
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            long r0 = X.C9859RiY.A00(r2, r0)
            r3.A01 = r0
            return
        L_0x002f:
            r2 = r1
            if (r8 == 0) goto L_0x0022
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64700LgV.<init>(android.content.Context, com.instagram.common.session.UserSession, X.MTi, X.1Wr, X.3Q2, java.lang.String):void");
    }

    public final void DCn(Exception exc) {
    }

    public final void A00() {
        1Wr r1 = this.A05;
        UserSession userSession = this.A03;
        Location lastLocation = r1.getLastLocation(userSession, "LocationSuggestionsRepository");
        if (lastLocation == null || !C270984hi.A00(lastLocation)) {
            r1.requestLocationUpdates(userSession, this, this.A06);
        } else {
            this.A00 = lastLocation;
            r1.removeLocationUpdates(userSession, this);
            NearbyVenuesService.A01(this.A02, lastLocation, userSession, (LocationSignalPackage) null, Long.valueOf(this.A01));
        }
        C22328Xzd A002 = NearbyVenuesService.A00(this.A00);
        if (A002 != null) {
            this.A04.DjY(A002.getItems(), A002.BjE());
        }
        AnonymousClass1Nd.A00(userSession).A01(this, C64677Lg3.class);
    }

    public final void A01() {
        AnonymousClass1Nd.A00(this.A03).A02(this, C64677Lg3.class);
    }

    public final void onLocationChanged(Location location) {
        if (location != null) {
            1Wr r1 = this.A05;
            if (r1.isAccurateEnough(location)) {
                this.A00 = location;
                UserSession userSession = this.A03;
                r1.removeLocationUpdates(userSession, this);
                NearbyVenuesService.A01(this.A02, location, userSession, (LocationSignalPackage) null, Long.valueOf(this.A01));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-2094534475);
        C64677Lg3 lg3 = (C64677Lg3) obj;
        int A0D = AnonymousClass7TG.A0D(lg3, 1876761096);
        A01();
        List list = lg3.A02;
        if (list != null) {
            C66480MTi mTi = this.A04;
            mTi.D1w();
            mTi.DjY(list, lg3.A00);
        }
        AnonymousClass0fD.A0A(830165147, A0D);
        AnonymousClass0fD.A0A(891401004, A032);
    }
}
