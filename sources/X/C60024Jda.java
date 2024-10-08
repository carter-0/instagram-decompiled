package X;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.Jda  reason: case insensitive filesystem */
public final class C60024Jda extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C61870KPj A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C60024Jda(C61870KPj kPj) {
        this.A00 = kPj;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C61870KPj kPj = this.A00;
        int i = kPj.A09;
        double d = (double) (((float) i) - f);
        double d2 = ((500.0d * 1.0d) / ((double) (kPj.A01 * IgNetworkConsentStorage.MAX_ENTRIES))) * ((double) kPj.A03);
        double d3 = (double) kPj.A08;
        if (d3 - d < d2) {
            d = d3 - d2;
        }
        int i2 = kPj.A02;
        int max = Math.max(i2, (int) Math.max(0.0d, d));
        if (i > max) {
            int i3 = i - i2;
            View view = kPj.A0B;
            if (view != null) {
                Drawable background = view.getBackground();
                if (background == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (i3 < background.getIntrinsicWidth() / 2) {
                    max = kPj.A02;
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        C61870KPj.A08(kPj, max);
        ClipInfo clipInfo = kPj.A0H;
        if (clipInfo != null) {
            clipInfo.A07 = (int) C61870KPj.A02(kPj);
            ClipInfo clipInfo2 = kPj.A0H;
            if (clipInfo2 != null) {
                clipInfo2.A0H = true;
                kPj.A0I = true;
                return true;
            }
        }
        0qQ.A0F("clipInfo");
        throw AnonymousClass00P.createAndThrow();
    }
}
