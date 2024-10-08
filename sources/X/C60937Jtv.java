package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jtv  reason: case insensitive filesystem */
public final class C60937Jtv extends AnonymousClass0T0 {
    public final ImageUrl A00;
    public final Integer A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60937Jtv) {
                C60937Jtv jtv = (C60937Jtv) obj;
                if (!0qQ.A0K(this.A00, jtv.A00) || !0qQ.A0K(this.A03, jtv.A03) || !0qQ.A0K(this.A04, jtv.A04) || this.A01 != jtv.A01 || !0qQ.A0K(this.A02, jtv.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = ((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31;
        Integer num = this.A01;
        return AnonymousClass7TG.A0B(num, C49774F6h.A01(num), A0C) + AnonymousClass7TE.A0L(this.A02);
    }

    public C60937Jtv(ImageUrl imageUrl, Integer num, Object obj, String str, String str2) {
        this.A00 = imageUrl;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = num;
        this.A02 = obj;
    }
}
