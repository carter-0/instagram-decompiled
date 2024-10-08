package X;

import android.graphics.Bitmap;
import com.instagram.giphy.webp.IgWebPAnimDecoder;

public final class WXU implements C20997X8u {
    public int A00;
    public int A01;
    public Integer A02;
    public final int A03;
    public final int A04;
    public final IgWebPAnimDecoder A05;
    public final AnonymousClass0eM A06;

    public final int EL4(int i, Bitmap bitmap) {
        int seekToTime;
        Bitmap A002;
        int i2;
        int i3;
        Bitmap bitmap2 = bitmap;
        0qQ.A0B(bitmap2, 1);
        Integer num = this.A02;
        int i4 = i;
        if (num == AnonymousClass05K.A0C) {
            IgWebPAnimDecoder igWebPAnimDecoder = this.A05;
            AnonymousClass0eM r1 = this.A06;
            seekToTime = igWebPAnimDecoder.seekToTime(i4, (Bitmap) AnonymousClass7TE.A14(r1));
            int minCropX = igWebPAnimDecoder.getMinCropX();
            int minCropY = igWebPAnimDecoder.getMinCropY();
            Bitmap bitmap3 = (Bitmap) AnonymousClass7TE.A14(r1);
            0fO.A03(bitmap3);
            A002 = Bitmap.createBitmap(bitmap3, minCropX, minCropY, igWebPAnimDecoder.getMaxCropX() - igWebPAnimDecoder.getMinCropX(), igWebPAnimDecoder.getMaxCropY() - igWebPAnimDecoder.getMinCropY());
            0qQ.A07(A002);
            i2 = this.A04;
            i3 = this.A03;
        } else {
            Integer num2 = AnonymousClass05K.A01;
            IgWebPAnimDecoder igWebPAnimDecoder2 = this.A05;
            if (num != num2) {
                return igWebPAnimDecoder2.seekToTime(i4, bitmap2);
            }
            AnonymousClass0eM r12 = this.A06;
            seekToTime = igWebPAnimDecoder2.seekToTime(i4, (Bitmap) AnonymousClass7TE.A14(r12));
            A002 = 0fO.A00((Bitmap) AnonymousClass7TE.A14(r12), this.A01, this.A00, true);
            0qQ.A07(A002);
            i2 = this.A01;
            i3 = this.A00;
        }
        int[] iArr = new int[(i2 * i3)];
        A002.getPixels(iArr, 0, A002.getWidth(), 0, 0, A002.getWidth(), A002.getHeight());
        Bitmap bitmap4 = bitmap2;
        bitmap4.setPixels(iArr, 0, A002.getWidth(), 0, 0, A002.getWidth(), A002.getHeight());
        A002.recycle();
        return seekToTime;
    }

    public final int getDuration() {
        IgWebPAnimDecoder igWebPAnimDecoder = this.A05;
        if (igWebPAnimDecoder.getFrameCount() == 0) {
            return 0;
        }
        return igWebPAnimDecoder.getDuration();
    }

    public final int getFrameCount() {
        return this.A05.getFrameCount();
    }

    public final int getHeight() {
        int i = this.A00;
        if (i == -1) {
            return this.A05.getHeight();
        }
        return i;
    }

    public final int getWidth() {
        int i = this.A01;
        if (i == -1) {
            return this.A05.getWidth();
        }
        return i;
    }

    public WXU(IgWebPAnimDecoder igWebPAnimDecoder, Integer num) {
        AnonymousClass7TG.A1O(igWebPAnimDecoder, num);
        this.A05 = igWebPAnimDecoder;
        this.A02 = num;
        int width = igWebPAnimDecoder.getWidth();
        this.A04 = width;
        int height = igWebPAnimDecoder.getHeight();
        this.A03 = height;
        int i = this.A02 == AnonymousClass05K.A00 ? -1 : 360;
        this.A01 = -1;
        this.A00 = -1;
        this.A06 = AnonymousClass0eN.A01(new C73662Phb(this, 40));
        if (this.A02 != AnonymousClass05K.A01) {
            return;
        }
        if (width < height) {
            this.A01 = i;
            this.A00 = (int) ((((float) i) / ((float) width)) * ((float) height));
            return;
        }
        this.A00 = i;
        this.A01 = (int) ((((float) i) / ((float) height)) * ((float) width));
    }
}
