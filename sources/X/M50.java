package X;

import com.instagram.ui.widget.nametag.NametagCardView;

public final class M50 implements Runnable {
    public final /* synthetic */ NametagCardView A00;

    public M50(NametagCardView nametagCardView) {
        this.A00 = nametagCardView;
    }

    public final void run() {
        this.A00.invalidate();
    }
}
