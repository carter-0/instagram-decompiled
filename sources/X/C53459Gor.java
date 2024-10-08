package X;

import com.instagram.api.schemas.MidCardReelsChainCtaType;
import java.util.List;

/* renamed from: X.Gor  reason: case insensitive filesystem */
public final class C53459Gor extends AnonymousClass0T0 implements JSH {
    public final MidCardReelsChainCtaType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final C53459Gor F7A() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53459Gor) {
                C53459Gor gor = (C53459Gor) obj;
                if (!0qQ.A0K(this.A01, gor.A01) || !0qQ.A0K(this.A02, gor.A02) || !0qQ.A0K(this.A03, gor.A03) || this.A00 != gor.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String AmW() {
        return this.A01;
    }

    public final String AmX() {
        return this.A02;
    }

    public final List Bfe() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C53459Gor(MidCardReelsChainCtaType midCardReelsChainCtaType, String str, String str2, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = midCardReelsChainCtaType;
    }
}
