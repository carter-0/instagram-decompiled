package X;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* renamed from: X.SiZ  reason: case insensitive filesystem */
public final class C11900SiZ implements C13694TfC {
    public final ParcelFileDescriptorRewinder$InternalRewinder A00;

    public final void cleanup() {
    }

    public final /* bridge */ /* synthetic */ Object EJO() {
        return this.A00.rewind();
    }

    public C11900SiZ(ParcelFileDescriptor parcelFileDescriptor) {
        this.A00 = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }
}
