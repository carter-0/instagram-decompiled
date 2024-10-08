package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jxq  reason: case insensitive filesystem */
public final class C61140Jxq extends AnonymousClass0T0 implements C66384MPq {
    public final int A00;
    public final ImageUrl A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61140Jxq) {
                C61140Jxq jxq = (C61140Jxq) obj;
                if (this.A00 != jxq.A00 || !0qQ.A0K(this.A02, jxq.A02) || !0qQ.A0K(this.A01, jxq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, this.A00 * 31) + AnonymousClass7TG.A0C(this.A01);
    }

    public C61140Jxq(ImageUrl imageUrl, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = imageUrl;
    }
}
