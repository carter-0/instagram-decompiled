package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Upi  reason: case insensitive filesystem */
public final class C16157Upi extends AnonymousClass6UX {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ MediaMapFragment A01;
    public final /* synthetic */ GradientSpinner A02;

    public final void A09(Reel reel) {
    }

    public final void A0C(Reel reel, C255773uh r2) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16157Upi(RectF rectF, MediaMapFragment mediaMapFragment, GradientSpinner gradientSpinner) {
        super((Activity) null, (C230222pE) null);
        this.A01 = mediaMapFragment;
        this.A00 = rectF;
        this.A02 = gradientSpinner;
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r3) {
        return AnonymousClass6KT.A03(this.A00);
    }

    public final void A0A(Reel reel, C255773uh r4) {
        boolean A16 = reel.A16(this.A01.A02);
        GradientSpinner gradientSpinner = this.A02;
        if (A16) {
            gradientSpinner.A04();
        } else {
            gradientSpinner.A02();
        }
    }

    public final void A0B(Reel reel, C255773uh r3) {
        C19204WPk wPk = this.A01.mMapChromeController;
        if (wPk != null) {
            wPk.A03();
        }
    }
}
