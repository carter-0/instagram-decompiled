package X;

import android.location.Location;
import com.instagram.creation.fragment.EditMediaInfoFragment;

/* renamed from: X.Lt3  reason: case insensitive filesystem */
public final class C65423Lt3 implements C267874cM {
    public final int A00;
    public final Object A01;

    public C65423Lt3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DCn(Exception exc) {
        if (2 - this.A00 == 0) {
            ((0sP) this.A01).invoke((Object) null);
        }
    }

    public final void onLocationChanged(Location location) {
        switch (this.A00) {
            case 0:
                1Wr r0 = 1Wr.A00;
                r0.getClass();
                if (r0.isAccurateEnough(location)) {
                    EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                    editMediaInfoFragment.A01 = location;
                    EditMediaInfoFragment.A05(editMediaInfoFragment);
                    return;
                }
                return;
            case 1:
                1Wr r3 = 1Wr.A00;
                if (r3 != null && r3.isAccurateEnough(location, 600000, 400.0f)) {
                    K5H k5h = (K5H) this.A01;
                    Location location2 = (Location) k5h.requireArguments().getParcelable("INTENT_EXTRA_PHOTO_LOCATION");
                    if (location2 == null || ((double) location.distanceTo(location2)) <= 1000.0d) {
                        k5h.A02 = location;
                        K5H.A04(k5h);
                        return;
                    }
                    K5H.A09(k5h);
                    K5H.A07(k5h);
                    return;
                }
                return;
            case 2:
                C51965G9l.A1W(this.A01, location);
                return;
            case 3:
                0qQ.A0B(location, 0);
                C61941KSq.A00(location, (C61941KSq) this.A01);
                return;
            default:
                0qQ.A0B(location, 0);
                C61942KSr.A02(location, (C61942KSr) this.A01);
                return;
        }
    }
}
