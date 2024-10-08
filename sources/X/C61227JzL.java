package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.JzL  reason: case insensitive filesystem */
public final class C61227JzL extends AnonymousClass0T0 implements C2802350v {
    public final int A00;
    public final ImageUrl A01;
    public final Long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61227JzL) {
                C61227JzL jzL = (C61227JzL) obj;
                if (!0qQ.A0K(this.A01, jzL.A01) || !0qQ.A0K(this.A06, jzL.A06) || !0qQ.A0K(this.A03, jzL.A03) || !0qQ.A0K(this.A04, jzL.A04) || this.A00 != jzL.A00 || !0qQ.A0K(this.A05, jzL.A05) || !0qQ.A0K(this.A02, jzL.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0d;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A08(this.A06, AnonymousClass7TE.A0K(this.A01)) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C61227JzL(ImageUrl imageUrl, Long l, String str, String str2, String str3, String str4, int i) {
        AnonymousClass7TG.A1O(imageUrl, str);
        this.A01 = imageUrl;
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = i;
        this.A05 = str4;
        this.A02 = l;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        A0C.A06 = C317876nz.A1e.A01();
        return A0C;
    }
}
