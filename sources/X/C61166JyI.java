package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JyI  reason: case insensitive filesystem */
public final class C61166JyI extends AnonymousClass0T0 implements C232262tL {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61166JyI) {
                C61166JyI jyI = (C61166JyI) obj;
                if (!0qQ.A0K(this.A00, jyI.A00) || !0qQ.A0K(this.A01, jyI.A01) || !0qQ.A0K(this.A03, jyI.A03) || !0qQ.A0K(this.A02, jyI.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00))) + AnonymousClass7TG.A0C(this.A02);
    }

    public C61166JyI(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str) {
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
        this.A03 = str;
        this.A02 = num;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass7TF.A0h(this);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
