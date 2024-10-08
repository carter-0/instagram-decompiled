package X;

import android.graphics.RenderEffect;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class PWN implements Runnable {
    public final /* synthetic */ C329827Kj A00;

    public PWN(C329827Kj r1) {
        this.A00 = r1;
    }

    public final void run() {
        IgImageView igImageView = this.A00.A02;
        if (igImageView != null) {
            igImageView.setRenderEffect((RenderEffect) null);
        }
    }
}
