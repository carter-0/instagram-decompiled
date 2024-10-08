package X;

import android.graphics.ImageDecoder;
import android.net.Uri;

public final class H8E extends 0ng {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ K0X A01;
    public final /* synthetic */ 0sP A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8E(Uri uri, K0X k0x, 0sP r7) {
        super(1505345961, 3, false, true);
        this.A01 = k0x;
        this.A00 = uri;
        this.A02 = r7;
    }

    public final void run() {
        AnonymousClass7TF.A0D().post(new C57827Ih6(ImageDecoder.decodeBitmap(ImageDecoder.createSource(this.A01.requireContext().getContentResolver(), this.A00)), this.A02));
    }
}
