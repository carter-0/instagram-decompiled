package X;

import com.instagram.creation.activity.MediaCaptureActivity;

public final /* synthetic */ class LgE implements 1wn {
    public final /* synthetic */ MediaCaptureActivity A00;

    public /* synthetic */ LgE(MediaCaptureActivity mediaCaptureActivity) {
        this.A00 = mediaCaptureActivity;
    }

    public final void onEvent(Object obj) {
        AnonymousClass3M8 Bx5 = this.A00.Bx5();
        LQT lqt = ((AnonymousClass3GU) obj).A00;
        if (lqt.equals(Bx5.A06)) {
            AnonymousClass3M8.A03(Bx5, true);
        }
        Bx5.A0L.remove(lqt);
    }
}
