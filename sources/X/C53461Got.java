package X;

import com.instagram.api.schemas.ClipsRSAMidCardSubType;
import java.util.List;

/* renamed from: X.Got  reason: case insensitive filesystem */
public final class C53461Got extends AnonymousClass0T0 implements DS3 {
    public final ClipsRSAMidCardSubType A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public final DS3 E85(1E9 r1) {
        return this;
    }

    public final C53461Got F8W(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53461Got) {
                C53461Got got = (C53461Got) obj;
                if (!0qQ.A0K(this.A01, got.A01) || !0qQ.A0K(this.A03, got.A03) || this.A04 != got.A04 || this.A00 != got.A00 || !0qQ.A0K(this.A02, got.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0O(this.A01));
        return C41845B3m.A01(this.A02, (AnonymousClass7TF.A09(this.A04, A07) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public C53461Got(ClipsRSAMidCardSubType clipsRSAMidCardSubType, String str, String str2, List list, boolean z) {
        AnonymousClass7TG.A1O(str, list);
        0qQ.A0B(str2, 5);
        this.A01 = str;
        this.A03 = list;
        this.A04 = z;
        this.A00 = clipsRSAMidCardSubType;
        this.A02 = str2;
    }
}
