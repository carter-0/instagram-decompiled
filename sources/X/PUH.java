package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

public final class PUH implements Comparable {
    public final long A00;
    public final C317966o8 A01;
    public final C317966o8 A02;
    public final C69304Nj5 A03;
    public final C68137N2b A04;
    public final DirectStoreSticker A05;

    public PUH(C317966o8 r2, C317966o8 r3, C69304Nj5 nj5, C68137N2b n2b, DirectStoreSticker directStoreSticker, long j) {
        0qQ.A0B(nj5, 1);
        this.A03 = nj5;
        this.A04 = n2b;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = directStoreSticker;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.hashCode() == hashCode();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        PUH puh = (PUH) obj;
        0qQ.A0B(puh, 0);
        return (int) (puh.A00 - this.A00);
    }

    public final int hashCode() {
        String str;
        DirectAnimatedMedia directAnimatedMedia;
        C317966o8 r0;
        C69304Nj5 nj5 = this.A03;
        C69925NuR nuR = C69925NuR.$redex_init_class;
        int ordinal = nj5.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r0 = this.A01;
            } else if (ordinal == 2) {
                r0 = this.A02;
            } else if (ordinal == 3) {
                DirectStoreSticker directStoreSticker = this.A05;
                if (directStoreSticker == null) {
                    return 0;
                }
                str = directStoreSticker.A04;
            } else if (ordinal == 4) {
                return super.hashCode();
            } else {
                throw AnonymousClass7TE.A1K();
            }
            if (r0 == null) {
                return 0;
            }
            str = r0.A0S;
        } else {
            C68137N2b n2b = this.A04;
            if (n2b == null || (directAnimatedMedia = n2b.A00) == null) {
                return 0;
            }
            str = directAnimatedMedia.A05;
        }
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
