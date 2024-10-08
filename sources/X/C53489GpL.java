package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.GpL  reason: case insensitive filesystem */
public final class C53489GpL extends AnonymousClass0T0 implements C299515vK {
    public final GifUrlImpl A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final ImageUrl A05;
    public final String A06;

    public C53489GpL(ImageUrl imageUrl, GifUrlImpl gifUrlImpl, String str, String str2, String str3, int i, int i2) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A04 = i;
        this.A03 = i2;
        this.A06 = str2;
        this.A01 = str3;
        this.A00 = gifUrlImpl;
        this.A05 = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53489GpL) {
                C53489GpL gpL = (C53489GpL) obj;
                if (!0qQ.A0K(this.A02, gpL.A02) || this.A04 != gpL.A04 || this.A03 != gpL.A03 || !0qQ.A0K(this.A06, gpL.A06) || !0qQ.A0K(this.A01, gpL.A01) || !0qQ.A0K(this.A00, gpL.A00) || !0qQ.A0K(this.A05, gpL.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AXm() {
        return this.A06;
    }

    public final int getHeight() {
        return this.A03;
    }

    public final String getId() {
        return this.A02;
    }

    public final int getWidth() {
        return this.A04;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A05, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A01, (((((AnonymousClass7TE.A0O(this.A02) + this.A04) * 31) + this.A03) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31)));
    }
}
