package X;

import android.view.animation.AlphaAnimation;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.WnF  reason: case insensitive filesystem */
public final class C20215WnF implements Runnable {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ C14880UDi A01;

    public C20215WnF(AlphaAnimation alphaAnimation, C14880UDi uDi) {
        this.A01 = uDi;
        this.A00 = alphaAnimation;
    }

    public final void run() {
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.A01.A04;
        if (roundedCornerFrameLayout.getVisibility() == 8) {
            roundedCornerFrameLayout.setVisibility(0);
            roundedCornerFrameLayout.startAnimation(this.A00);
        }
    }
}
