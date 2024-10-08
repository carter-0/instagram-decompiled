package X;

import android.view.animation.AlphaAnimation;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.M5w  reason: case insensitive filesystem */
public final class C65959M5w implements Runnable {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ IgdsMediaButton A01;

    public C65959M5w(AlphaAnimation alphaAnimation, IgdsMediaButton igdsMediaButton) {
        this.A01 = igdsMediaButton;
        this.A00 = alphaAnimation;
    }

    public final void run() {
        IgdsMediaButton igdsMediaButton = this.A01;
        igdsMediaButton.startAnimation(this.A00);
        igdsMediaButton.setVisibility(4);
    }
}
