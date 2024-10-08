package X;

import android.content.Context;
import com.instagram.creation.capture.MediaCaptureFragment;

public final class KJ4 extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C363858kS A01;
    public final /* synthetic */ MediaCaptureFragment A02;
    public final /* synthetic */ byte[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJ4(Context context, C363858kS r5, MediaCaptureFragment mediaCaptureFragment, byte[] bArr) {
        super(76, 4, false, false);
        this.A02 = mediaCaptureFragment;
        this.A00 = context;
        this.A03 = bArr;
        this.A01 = r5;
    }

    public final void run() {
        C59881Jb4 jb4 = this.A02.A02;
        if (jb4 != null) {
            jb4.A00(this.A00, this.A01, this.A03);
        }
    }
}
