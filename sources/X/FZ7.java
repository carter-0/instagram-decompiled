package X;

import com.instagram.common.session.UserSession;

public final class FZ7 implements AnonymousClass11X {
    public final /* synthetic */ FBY A00;

    public final String getName() {
        return "handleFacebookPictureAvailable";
    }

    public final int getRunnableId() {
        return 249;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public final void run() {
        if (!C44596ChU.A00((UserSession) null)) {
            throw AnonymousClass7TE.A11("getFbAccessToken");
        }
    }

    public FZ7(FBY fby) {
        this.A00 = fby;
    }

    public final void onFinish() {
        synchronized (this.A00) {
        }
    }
}
