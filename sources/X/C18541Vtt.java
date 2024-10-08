package X;

import android.graphics.Point;
import com.facebook.android.maps.model.LatLng;

/* renamed from: X.Vtt  reason: case insensitive filesystem */
public final class C18541Vtt {
    public final WFU A00;

    public final LatLng A00(float f, float f2) {
        W2R w2r = this.A00.A0J;
        Point point = new Point((int) f, (int) f2);
        return w2r.A04((float) point.x, (float) point.y);
    }

    public C18541Vtt(WFU wfu) {
        this.A00 = wfu;
    }

    public C18541Vtt() {
    }
}
