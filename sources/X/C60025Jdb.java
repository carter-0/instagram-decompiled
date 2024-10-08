package X;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.Jdb  reason: case insensitive filesystem */
public final class C60025Jdb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C61870KPj A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C60025Jdb(C61870KPj kPj) {
        this.A00 = kPj;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C378459Pw r0;
        C61870KPj kPj = this.A00;
        double d = (double) (((float) kPj.A08) - f);
        double d2 = ((500.0d * 1.0d) / ((double) (kPj.A01 * IgNetworkConsentStorage.MAX_ENTRIES))) * ((double) kPj.A03);
        double d3 = (double) kPj.A09;
        if (d - d3 < d2) {
            d = d3 + d2;
        }
        int i = kPj.A03 + kPj.A02;
        int min = Math.min((int) Math.min(d, ((double) kPj.A02) + C61870KPj.A00(kPj)), i);
        if (kPj.A08 < min) {
            int i2 = i - min;
            View view = kPj.A0C;
            if (view != null) {
                Drawable background = view.getBackground();
                if (background == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (i2 < background.getIntrinsicWidth() / 2) {
                    min = kPj.A03 + kPj.A02;
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        C61870KPj.A07(kPj, min);
        ClipInfo clipInfo = kPj.A0H;
        if (clipInfo != null) {
            clipInfo.A05 = (int) C61870KPj.A01(kPj);
            ClipInfo clipInfo2 = kPj.A0H;
            if (clipInfo2 != null) {
                clipInfo2.A0H = true;
                C378369Pn r02 = kPj.A0G;
                if (!(r02 == null || (r0 = r02.A08) == null)) {
                    r0.A0B();
                }
                kPj.A0I = true;
                return true;
            }
        }
        0qQ.A0F("clipInfo");
        throw AnonymousClass00P.createAndThrow();
    }
}
