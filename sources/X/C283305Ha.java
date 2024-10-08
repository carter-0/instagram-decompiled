package X;

import android.location.Location;

/* renamed from: X.5Ha  reason: invalid class name and case insensitive filesystem */
public final class C283305Ha implements C267874cM {
    public final /* synthetic */ 1q5 A00;
    public final /* synthetic */ 0sP A01;

    public final void onLocationChanged(Location location) {
        0qQ.A0B(location, 0);
        this.A01.invoke(location);
    }

    public C283305Ha(1q5 r1, 0sP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DCn(Exception exc) {
        this.A01.invoke(this.A00.A00);
    }
}
