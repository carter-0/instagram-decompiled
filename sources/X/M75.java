package X;

import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

public final class M75 implements Runnable {
    public final /* synthetic */ FollowersShareFragment A00;
    public final /* synthetic */ C64647LfZ A01;

    public M75(FollowersShareFragment followersShareFragment, C64647LfZ lfZ) {
        this.A00 = followersShareFragment;
        this.A01 = lfZ;
    }

    public final void run() {
        C60063Jel jel;
        LFW lfw;
        FollowersShareFragment followersShareFragment = this.A00;
        if (!LTP.A0A(followersShareFragment)) {
            int intValue = this.A01.A00.intValue();
            boolean z = true;
            if (intValue == 0) {
                LFW lfw2 = followersShareFragment.shareToBarcelonaViewBinder;
                if (lfw2 != null) {
                    jel = lfw2.A04;
                    z = false;
                } else {
                    return;
                }
            } else if (intValue == 2 && (lfw = followersShareFragment.shareToBarcelonaViewBinder) != null) {
                jel = lfw.A04;
            } else {
                return;
            }
            jel.setEnabledState(z);
        }
    }
}
