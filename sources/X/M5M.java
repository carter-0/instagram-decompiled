package X;

import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;

public final class M5M implements Runnable {
    public final /* synthetic */ C62422KfX A00;

    public M5M(C62422KfX kfX) {
        this.A00 = kfX;
    }

    public final void run() {
        String str;
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.A00.A0L;
        LGX lgx = igLiveWithGuestFragment.A07;
        if (lgx == null) {
            str = "reactionsPresenter";
        } else {
            String str2 = igLiveWithGuestFragment.A09;
            if (str2 == null) {
                str = "broadcastId";
            } else {
                igLiveWithGuestFragment.requireArguments().getString("args.media_id");
                lgx.A03(str2);
                11Z.A02(new M5B(igLiveWithGuestFragment));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
