package X;

import com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton;

/* renamed from: X.Wnb  reason: case insensitive filesystem */
public final class C20237Wnb implements Runnable {
    public final /* synthetic */ FadeInFollowButton A00;
    public final /* synthetic */ Boolean A01;

    public C20237Wnb(FadeInFollowButton fadeInFollowButton, Boolean bool) {
        this.A00 = fadeInFollowButton;
        this.A01 = bool;
    }

    public final void run() {
        FadeInFollowButton fadeInFollowButton = this.A00;
        fadeInFollowButton.A0B = false;
        fadeInFollowButton.setDisplayedChild(0);
        fadeInFollowButton.postDelayed(new C318686pM(fadeInFollowButton), 200);
        if (!this.A01.booleanValue()) {
            fadeInFollowButton.postDelayed(new C20563Wue(fadeInFollowButton), 200);
        }
    }
}
