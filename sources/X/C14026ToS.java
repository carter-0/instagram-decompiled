package X;

import android.graphics.Bitmap;
import com.instagram.giphy.webp.IgWebPAnimDecoder;

/* renamed from: X.ToS  reason: case insensitive filesystem */
public final class C14026ToS implements C20997X8u {
    public final int A00;
    public final int A01;
    public final IgWebPAnimDecoder A02;

    public C14026ToS(IgWebPAnimDecoder igWebPAnimDecoder) {
        0qQ.A0B(igWebPAnimDecoder, 1);
        this.A02 = igWebPAnimDecoder;
        this.A01 = igWebPAnimDecoder.getWidth();
        this.A00 = igWebPAnimDecoder.getHeight();
    }

    public final int EL4(int i, Bitmap bitmap) {
        0qQ.A0B(bitmap, 1);
        return this.A02.seekToTime(i, bitmap);
    }

    public final int getDuration() {
        IgWebPAnimDecoder igWebPAnimDecoder = this.A02;
        if (igWebPAnimDecoder.getFrameCount() == 0) {
            return 0;
        }
        return igWebPAnimDecoder.getDuration();
    }

    public final int getFrameCount() {
        return this.A02.getFrameCount();
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }
}
