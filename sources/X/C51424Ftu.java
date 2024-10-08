package X;

import android.animation.ObjectAnimator;
import android.view.View;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.CoinFlipAvatarImageView;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;

/* renamed from: X.Ftu  reason: case insensitive filesystem */
public final class C51424Ftu implements Runnable {
    public final /* synthetic */ AvatarCoinFlipSticker A00;
    public final /* synthetic */ AvatarCoinFlipSticker A01;
    public final /* synthetic */ C47468E3r A02;

    public C51424Ftu(AvatarCoinFlipSticker avatarCoinFlipSticker, AvatarCoinFlipSticker avatarCoinFlipSticker2, C47468E3r e3r) {
        this.A02 = e3r;
        this.A00 = avatarCoinFlipSticker;
        this.A01 = avatarCoinFlipSticker2;
    }

    public final void run() {
        CoinFlipAvatarImageView coinFlipAvatarImageView;
        C47468E3r e3r = this.A02;
        if (e3r.isAdded()) {
            AnonymousClass7TH.A0R(e3r.A06);
            ProfileCoinFlipView profileCoinFlipView = e3r.A02;
            if (profileCoinFlipView != null) {
                coinFlipAvatarImageView = profileCoinFlipView.A01;
            } else {
                coinFlipAvatarImageView = null;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(coinFlipAvatarImageView, View.ALPHA, new float[]{0.0f, 1.0f});
            ofFloat.setDuration((long) DbV.A05(e3r).getInteger(17694720));
            ofFloat.start();
            C47468E3r.A01(this.A00, this.A01, e3r);
        }
    }
}
