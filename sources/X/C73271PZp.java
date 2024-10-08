package X;

import android.view.View;
import com.instagram.ui.mediaactions.ScrubberWithKeyFrames;

/* renamed from: X.PZp  reason: case insensitive filesystem */
public final class C73271PZp implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScrubberWithKeyFrames A01;

    public C73271PZp(View view, ScrubberWithKeyFrames scrubberWithKeyFrames) {
        this.A01 = scrubberWithKeyFrames;
        this.A00 = view;
    }

    public final void run() {
        ScrubberWithKeyFrames.A02(this.A00, this.A01);
    }
}
