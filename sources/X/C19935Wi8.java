package X;

import com.facebook.locationsharing.core.models.Location;

/* renamed from: X.Wi8  reason: case insensitive filesystem */
public final class C19935Wi8 implements Runnable {
    public final /* synthetic */ UHR A00;

    public C19935Wi8(UHR uhr) {
        this.A00 = uhr;
    }

    public final void run() {
        Location location;
        UHR uhr = this.A00;
        if (uhr.A00 && (location = UHR.A00(uhr).A05) != null) {
            uhr.A05.A02(new C18982WFj(this, 0), location.A00, location.A01);
        }
    }
}
