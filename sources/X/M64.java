package X;

import com.instagram.creation.activity.MediaCaptureActivity;

public final class M64 implements Runnable {
    public final /* synthetic */ MediaCaptureActivity A00;
    public final /* synthetic */ boolean A01;

    public M64(MediaCaptureActivity mediaCaptureActivity, boolean z) {
        this.A00 = mediaCaptureActivity;
        this.A01 = z;
    }

    public final void run() {
        MediaCaptureActivity mediaCaptureActivity = this.A00;
        C59885Jb9 jb9 = mediaCaptureActivity.A0A;
        if (jb9 == null || jb9.A02.size() <= 1 || mediaCaptureActivity.getSupportFragmentManager().A0M() == 0 || this.A01) {
            C59899JbO A002 = JZM.A00(mediaCaptureActivity.A04);
            A002.A09(A002.A01, 4);
            mediaCaptureActivity.finish();
            return;
        }
        C59888JbD.A00(mediaCaptureActivity.A04);
    }
}
