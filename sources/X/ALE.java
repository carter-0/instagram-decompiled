package X;

import android.media.ImageReader;

public final class ALE implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ AnonymousClass80G A00;

    public ALE(AnonymousClass80G r1) {
        this.A00 = r1;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        AnonymousClass80G.A01(this.A00);
    }
}
