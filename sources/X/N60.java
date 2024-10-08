package X;

import com.instagram.common.typedurl.ImageUrl;

public final class N60 extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final C61077JwF A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N60) {
                N60 n60 = (N60) obj;
                if (!0qQ.A0K(this.A01, n60.A01) || this.A00 != n60.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        C317966o8 r0;
        String str;
        C61077JwF jwF = this.A01;
        if (jwF == null || (r0 = (C317966o8) jwF.A00) == null || (str = r0.A0S) == null) {
            return "Shimmer";
        }
        return str;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        ImageUrl imageUrl;
        C61077JwF jwF;
        C317966o8 r1;
        C317966o8 r12;
        N60 n60 = (N60) obj;
        C61077JwF jwF2 = this.A01;
        ImageUrl imageUrl2 = null;
        if (jwF2 == null || (r12 = (C317966o8) jwF2.A00) == null) {
            imageUrl = null;
        } else {
            imageUrl = r12.A0H;
        }
        if (!(n60 == null || (jwF = n60.A01) == null || (r1 = (C317966o8) jwF.A00) == null)) {
            imageUrl2 = r1.A0H;
        }
        return 0qQ.A0K(imageUrl, imageUrl2);
    }

    public N60(C61077JwF jwF, int i) {
        this.A01 = jwF;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DirectAIStickerItemViewModel(stickerModel=");
        A1A.append(this.A01);
        A1A.append(", positionIndex=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
