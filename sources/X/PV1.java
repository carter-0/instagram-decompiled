package X;

import com.instagram.common.ui.widget.imageview.IgImageView;

public final class PV1 implements Runnable {
    public final /* synthetic */ IgImageView A00;

    public PV1(IgImageView igImageView) {
        this.A00 = igImageView;
    }

    public final void run() {
        this.A00.performHapticFeedback(0);
    }
}
