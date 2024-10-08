package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.Vux  reason: case insensitive filesystem */
public final class C18604Vux {
    public ExtendedImageUrl A00;
    public final Object A01;
    public final 0sP A02;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C18604Vux) && super.equals(obj) && 0qQ.A0K(this.A01, ((C18604Vux) obj).A01));
    }

    public C18604Vux(1Xj r3) {
        C20596WvZ wvZ = new C20596WvZ(r3, 20);
        this.A01 = r3;
        this.A02 = wvZ;
    }

    public final int hashCode() {
        return C51971G9r.A0E(this.A01);
    }

    public C18604Vux(ImageInfo imageInfo) {
        C20596WvZ wvZ = new C20596WvZ(imageInfo, 19);
        this.A01 = imageInfo;
        this.A02 = wvZ;
    }
}
