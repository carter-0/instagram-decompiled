package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.feed.ui.rows.videoscrubber.buffer.layout.MediaVideoScrubberBufferFrameLayout;

public final class ID9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MediaVideoScrubberBufferFrameLayout A01;

    public ID9(MediaVideoScrubberBufferFrameLayout mediaVideoScrubberBufferFrameLayout, int i) {
        this.A01 = mediaVideoScrubberBufferFrameLayout;
        this.A00 = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        MediaVideoScrubberBufferFrameLayout mediaVideoScrubberBufferFrameLayout = this.A01;
        int A02 = AnonymousClass7TG.A02(mediaVideoScrubberBufferFrameLayout.getContext());
        int i9 = this.A00;
        C51976G9y.A0P(new Rect(0, 0, A02, i9), mediaVideoScrubberBufferFrameLayout, A02, i9);
    }
}
