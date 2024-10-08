package X;

import com.instagram.creation.activity.MediaCaptureActivity;

public final /* synthetic */ class MBQ implements C62320sa {
    public final /* synthetic */ MediaCaptureActivity A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ MBQ(MediaCaptureActivity mediaCaptureActivity, boolean z) {
        this.A00 = mediaCaptureActivity;
        this.A01 = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.creation.activity.MediaCaptureActivity, android.app.Activity] */
    public final Object invoke() {
        ? r2 = this.A00;
        r2.runOnUiThread(new M64(r2, this.A01));
        return C60340gF.A00;
    }
}
