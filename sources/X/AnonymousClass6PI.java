package X;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6PI  reason: invalid class name */
public final class AnonymousClass6PI {
    public TextView A00;
    public TextView A01;
    public IgProgressImageView A02;
    public MediaFrameLayout A03;
    public final FrameLayout A04;
    public final C252063oV A05;
    public final C252063oV A06;

    public final MediaFrameLayout A00() {
        MediaFrameLayout mediaFrameLayout = this.A03;
        if (mediaFrameLayout != null) {
            return mediaFrameLayout;
        }
        0qQ.A0F("mediaCardContainer");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        if (this.A03 != null) {
            A00().setVisibility(8);
        }
    }

    public AnonymousClass6PI(FrameLayout frameLayout, C252063oV r2, C252063oV r3) {
        this.A04 = frameLayout;
        this.A06 = r2;
        this.A05 = r3;
    }
}
