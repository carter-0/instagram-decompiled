package X;

import android.os.Parcelable;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABScreenshotImpressionEvent;

/* renamed from: X.S4r  reason: case insensitive filesystem */
public final class C10997S4r {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final A9z A03;
    public final C340027ka A04;

    public final void A01(RIk rIk, String str) {
        IABEvent iABScreenshotImpressionEvent;
        if (!this.A01) {
            this.A01 = true;
            A9z a9z = this.A03;
            if (a9z != null) {
                if (!a9z.A0p) {
                    iABScreenshotImpressionEvent = IABEvent.A04;
                } else {
                    Parcelable.Creator creator = IABEvent.CREATOR;
                    RIk rIk2 = rIk;
                    iABScreenshotImpressionEvent = new IABScreenshotImpressionEvent(rIk2, a9z.A0Z, a9z.A0a, str, a9z.A0m.now());
                }
                SRY A002 = SRY.A00();
                BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) this.A04;
                A002.A06(browserLiteFragment.A08, iABScreenshotImpressionEvent, browserLiteFragment.A0e);
            }
        }
    }

    public final void A00() {
        if (!this.A02) {
            this.A02 = true;
            A9z a9z = this.A03;
            if (a9z != null) {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = a9z.A0p;
                if (z) {
                    a9z.A0V = Long.valueOf(currentTimeMillis);
                }
                if (z) {
                    a9z.A0S = true;
                }
            }
        }
    }

    public C10997S4r(C340027ka r2) {
        this.A04 = r2;
        this.A03 = ((BrowserLiteFragment) r2).A0d;
    }
}
