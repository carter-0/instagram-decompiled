package X;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: X.9Qk  reason: invalid class name and case insensitive filesystem */
public final class C378589Qk implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C343167pm A00;

    public C378589Qk(C343167pm r1) {
        this.A00 = r1;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        Image acquireNextImage;
        C343167pm r5 = this.A00;
        ImageReader imageReader2 = r5.A00;
        byte[] bArr = null;
        if (imageReader2 != null) {
            imageReader2.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        }
        C364098kr r3 = r5.A03;
        r5.A03 = null;
        if (r3 != null) {
            try {
                acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage != null) {
                    Image.Plane[] planes = acquireNextImage.getPlanes();
                    if (planes != null && planes.length > 0) {
                        ByteBuffer buffer = planes[0].getBuffer();
                        buffer.rewind();
                        bArr = new byte[buffer.remaining()];
                        buffer.get(bArr);
                    }
                    acquireNextImage.close();
                }
            } catch (Exception e) {
                try {
                    Log.e("DefaultPhotoProcessor", AnonymousClass7TF.A0m("Failed to acquire image: ", e), e);
                } catch (Throwable th) {
                    if (C344237rX.A00()) {
                        bArr = C344237rX.A01();
                    }
                    r3.A00(new C364128ku(bArr, r5.A01));
                    throw th;
                }
            } catch (Throwable th2) {
                C9153RRe.A00(th, th2);
            }
            if (C344237rX.A00()) {
                bArr = C344237rX.A01();
            }
            r3.A00(new C364128ku(bArr, r5.A01));
            return;
        }
        return;
        throw th;
    }
}
