package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.List;

/* renamed from: X.Goa  reason: case insensitive filesystem */
public final class C53442Goa extends AnonymousClass0T0 implements C46237DRs {
    public final ClipsACRMidCardSubType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public C53442Goa(ClipsACRMidCardSubType clipsACRMidCardSubType, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        0qQ.A0B(str, 2);
        C51974G9v.A1N(list, list2, str4);
        0qQ.A0B(str5, 8);
        this.A00 = clipsACRMidCardSubType;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A06 = list;
        this.A07 = list2;
        this.A04 = str4;
        this.A05 = str5;
    }

    public final C46237DRs E7N(1E9 r1) {
        return this;
    }

    public final C53442Goa F33(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53442Goa) {
                C53442Goa goa = (C53442Goa) obj;
                if (this.A00 != goa.A00 || !0qQ.A0K(this.A01, goa.A01) || !0qQ.A0K(this.A02, goa.A02) || !0qQ.A0K(this.A03, goa.A03) || !0qQ.A0K(this.A06, goa.A06) || !0qQ.A0K(this.A07, goa.A07) || !0qQ.A0K(this.A04, goa.A04) || !0qQ.A0K(this.A05, goa.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A00) * 31;
        return C41845B3m.A01(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A06, (((AnonymousClass7TF.A08(this.A01, A0C) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03)) * 31))));
    }
}
