package X;

import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class PWM implements Runnable {
    public final /* synthetic */ C329827Kj A00;

    public PWM(C329827Kj r1) {
        this.A00 = r1;
    }

    public final void run() {
        IgImageView igImageView = this.A00.A02;
        if (igImageView != null) {
            igImageView.setRenderEffect(RenderEffect.createBlurEffect(20.0f, 20.0f, Shader.TileMode.CLAMP));
        }
    }
}
