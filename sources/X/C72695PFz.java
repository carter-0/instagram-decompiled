package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.PFz  reason: case insensitive filesystem */
public final class C72695PFz implements AnonymousClass1Xq {
    public final AnonymousClass3I4 A00;
    public final 1iA A01;

    public final List BRs() {
        return null;
    }

    public final List BgD() {
        return null;
    }

    public final ExtendedImageUrl A00() {
        ImageInfo BGO = this.A00.BGO();
        0qQ.A0B(BGO, 0);
        ExtendedImageUrl A03 = 1iI.A03(BGO);
        if (A03 != null) {
            return A03;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final 1iA BR7() {
        1iA r0 = this.A01;
        if (r0 == null) {
            return 1iA.A0Z;
        }
        return r0;
    }

    public final String getId() {
        return this.A00.getId();
    }

    public C72695PFz(AnonymousClass3I4 r2) {
        this.A00 = r2;
        this.A01 = 1i9.A01(r2.getMediaType());
    }
}
