package X;

import android.location.Location;

/* renamed from: X.4sm  reason: invalid class name and case insensitive filesystem */
public class C276164sm {
    public final Location A00;
    public final Boolean A01;

    public final Double A00() {
        Location location = this.A00;
        if (location.hasAltitude()) {
            return Double.valueOf(location.getAltitude());
        }
        return null;
    }

    public final Float A01() {
        Location location = this.A00;
        if (location.hasAccuracy()) {
            return Float.valueOf(location.getAccuracy());
        }
        return null;
    }

    public final Float A02() {
        Location location = this.A00;
        if (location.hasBearing()) {
            return Float.valueOf(location.getBearing());
        }
        return null;
    }

    public final Long A03() {
        long time = this.A00.getTime();
        if (time == 0) {
            return null;
        }
        return Long.valueOf(time);
    }

    public final String toString() {
        return this.A00.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r6.getLongitude() != 0.0d) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C276164sm(android.location.Location r6, java.lang.Boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            double r1 = r6.getLatitude()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            double r1 = r6.getLongitude()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            java.lang.String r0 = "location must have latitude/longitude"
            X.17k.A0G(r1, r0)
            r5.A00 = r6
            r5.A01 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C276164sm.<init>(android.location.Location, java.lang.Boolean):void");
    }
}
