package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9cx  reason: invalid class name and case insensitive filesystem */
public final class C382019cx extends AnonymousClass0T0 implements AnonymousClass8I8 {
    public final AnonymousClass8JL A00;
    public final ImageUrl A01;
    public final 1Xj A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C382019cx) {
                C382019cx r5 = (C382019cx) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || this.A04 != r5.A04 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0K(this.A00)))) + AnonymousClass7TG.A0C(this.A02);
    }

    public C382019cx(AnonymousClass8JL r1, ImageUrl imageUrl, 1Xj r3, String str, boolean z) {
        AnonymousClass7TG.A1Q(str, imageUrl);
        this.A00 = r1;
        this.A03 = str;
        this.A01 = imageUrl;
        this.A04 = z;
        this.A02 = r3;
    }
}
