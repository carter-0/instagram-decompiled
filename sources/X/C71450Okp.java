package X;

import android.app.Activity;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.instagram.ui.mediaactions.ScrubberWithKeyFrames;

/* renamed from: X.Okp  reason: case insensitive filesystem */
public final class C71450Okp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C71450Okp(Activity activity, FrameLayout frameLayout, ScrubberWithKeyFrames scrubberWithKeyFrames, String str, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A03 = scrubberWithKeyFrames;
            this.A02 = frameLayout;
        } else {
            this.A02 = frameLayout;
            this.A03 = scrubberWithKeyFrames;
        }
        this.A01 = activity;
        this.A04 = str;
    }

    public final void onGlobalLayout() {
        if (this.A00 != 0) {
            ScrubberWithKeyFrames scrubberWithKeyFrames = (ScrubberWithKeyFrames) this.A03;
            C51967G9n.A0y(scrubberWithKeyFrames, this);
            scrubberWithKeyFrames.setupAdKeyFrameMarkersInternal((FrameLayout) this.A02, (Activity) this.A01, this.A04);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.A02;
        C51967G9n.A0y(frameLayout, this);
        ((ScrubberWithKeyFrames) this.A03).setupAdKeyFrameMarkersInternal(frameLayout, (Activity) this.A01, this.A04);
    }
}
