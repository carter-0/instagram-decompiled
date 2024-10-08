package X;

import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* renamed from: X.Fr6  reason: case insensitive filesystem */
public final /* synthetic */ class C51251Fr6 implements Runnable {
    public final /* synthetic */ C46656Dib A00;

    public /* synthetic */ C51251Fr6(C46656Dib dib) {
        this.A00 = dib;
    }

    public final void run() {
        AvatarCoinFlipConfig avatarCoinFlipConfig;
        C46656Dib dib = this.A00;
        if (dib.A0Q != null) {
            AnonymousClass73C A002 = AnonymousClass73B.A00(dib.A0V);
            if (!(A002 == null || (avatarCoinFlipConfig = dib.A0R) == null)) {
                A002.A02(avatarCoinFlipConfig, "edit_profile", true);
            }
            dib.A0Q.A05(true, true);
        }
    }
}
