package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;
import java.io.FileInputStream;
import java.util.List;

/* renamed from: X.Sjm  reason: case insensitive filesystem */
public final class C11971Sjm implements C13799ThI {
    public final C11900SiZ A00;
    public final ST0 A01;
    public final List A02;

    public final void EyD() {
    }

    public final Bitmap ANg(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.A00.A00.rewind().getFileDescriptor(), (Rect) null, options);
    }

    public final int BGB() {
        List list = this.A02;
        C11900SiZ siZ = this.A00;
        ST0 st0 = this.A01;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C13795ThE thE = (C13795ThE) list.get(i);
            try {
                ParcelFileDescriptorRewinder$InternalRewinder parcelFileDescriptorRewinder$InternalRewinder = siZ.A00;
                RC9 rc9 = new RC9(st0, new FileInputStream(parcelFileDescriptorRewinder$InternalRewinder.rewind().getFileDescriptor()));
                try {
                    int BYu = thE.BYu(st0, rc9);
                    rc9.A01();
                    parcelFileDescriptorRewinder$InternalRewinder.rewind();
                    if (BYu != -1) {
                        return BYu;
                    }
                    i++;
                } catch (Throwable th) {
                    th = th;
                    rc9.A01();
                    siZ.A00.rewind();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                siZ.A00.rewind();
                throw th;
            }
        }
        return -1;
    }

    public final ImageHeaderParser$ImageType BGI() {
        List list = this.A02;
        C11900SiZ siZ = this.A00;
        ST0 st0 = this.A01;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C13795ThE thE = (C13795ThE) list.get(i);
            try {
                ParcelFileDescriptorRewinder$InternalRewinder parcelFileDescriptorRewinder$InternalRewinder = siZ.A00;
                RC9 rc9 = new RC9(st0, new FileInputStream(parcelFileDescriptorRewinder$InternalRewinder.rewind().getFileDescriptor()));
                try {
                    ImageHeaderParser$ImageType CAC = thE.CAC(rc9);
                    rc9.A01();
                    parcelFileDescriptorRewinder$InternalRewinder.rewind();
                    if (CAC != ImageHeaderParser$ImageType.UNKNOWN) {
                        return CAC;
                    }
                    i++;
                } catch (Throwable th) {
                    th = th;
                    rc9.A01();
                    siZ.A00.rewind();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                siZ.A00.rewind();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public C11971Sjm(ParcelFileDescriptor parcelFileDescriptor, ST0 st0, List list) {
        C9217RTu.A00(st0);
        this.A01 = st0;
        C9217RTu.A00(list);
        this.A02 = list;
        this.A00 = new C11900SiZ(parcelFileDescriptor);
    }
}
