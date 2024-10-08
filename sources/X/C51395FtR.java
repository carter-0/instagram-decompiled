package X;

import android.view.View;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.FtR  reason: case insensitive filesystem */
public final class C51395FtR implements Runnable {
    public final /* synthetic */ AvatarCoinFlipConfig A00;
    public final /* synthetic */ C318956po A01;

    public C51395FtR(AvatarCoinFlipConfig avatarCoinFlipConfig, C318956po r2) {
        this.A01 = r2;
        this.A00 = avatarCoinFlipConfig;
    }

    public final void run() {
        AnonymousClass73C A002;
        View view;
        C318956po r4 = this.A01;
        C252063oV r0 = r4.A0A;
        if (!(r0 == null || (view = r0.getView()) == null)) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            view.setAlpha(0.0f);
        }
        View view2 = r4.A05;
        view2.getLayoutParams().width = view2.getWidth();
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        if (!(avatarCoinFlipConfig == null || (A002 = AnonymousClass73B.A00(r4.A09)) == null)) {
            A002.A02(avatarCoinFlipConfig, "edit_profile", true);
        }
        C319656qy r2 = r4.A0B;
        if (r2 != null) {
            r2.A00(true, new C51763G0f(r4, 26));
        }
    }
}
