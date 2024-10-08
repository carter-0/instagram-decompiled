package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.List;

/* renamed from: X.UKy  reason: case insensitive filesystem */
public final class C15045UKy extends AnonymousClass0T0 {
    public final N4R A00;
    public final ImageUrl A01;
    public final C15027UKg A02;
    public final C16527UwW A03;
    public final LeadGenDisqualifyingScreenData A04;
    public final LeadGenPrivacyPolicy A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15045UKy) {
                C15045UKy uKy = (C15045UKy) obj;
                if (!(0qQ.A0K(this.A08, uKy.A08) && this.A03 == uKy.A03 && 0qQ.A0K(this.A00, uKy.A00) && 0qQ.A0K(this.A06, uKy.A06) && 0qQ.A0K(this.A01, uKy.A01) && 0qQ.A0K(this.A05, uKy.A05) && 0qQ.A0K(this.A07, uKy.A07) && 0qQ.A0K(this.A09, uKy.A09) && this.A0C == uKy.A0C && this.A0I == uKy.A0I && 0qQ.A0K(this.A04, uKy.A04) && this.A0G == uKy.A0G && this.A0D == uKy.A0D && this.A0H == uKy.A0H && this.A0B == uKy.A0B && 0qQ.A0K(this.A02, uKy.A02) && this.A0A == uKy.A0A && this.A0F == uKy.A0F && this.A0E == uKy.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A08));
        int A092 = AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A07, (((((AnonymousClass7TF.A07(this.A00, A072) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31)));
        int A093 = AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0G, (((AnonymousClass7TF.A09(this.A0I, A092) + C54732HQn.A00()) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31)));
        return DbS.A06(this.A0E, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A09(this.A0B, A093) + AnonymousClass7TE.A0L(this.A02)) * 31)));
    }

    public C15045UKy(N4R n4r, ImageUrl imageUrl, C15027UKg uKg, C16527UwW uwW, LeadGenDisqualifyingScreenData leadGenDisqualifyingScreenData, LeadGenPrivacyPolicy leadGenPrivacyPolicy, String str, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        AnonymousClass7TG.A1U(list, uwW, n4r);
        0qQ.A0B(list2, 7);
        this.A08 = list;
        this.A03 = uwW;
        this.A00 = n4r;
        this.A06 = str;
        this.A01 = imageUrl;
        this.A05 = leadGenPrivacyPolicy;
        this.A07 = list2;
        this.A09 = list3;
        this.A0C = z;
        this.A0I = z2;
        this.A04 = leadGenDisqualifyingScreenData;
        this.A0G = z3;
        this.A0D = z4;
        this.A0H = z5;
        this.A0B = z6;
        this.A02 = uKg;
        this.A0A = z7;
        this.A0F = z8;
        this.A0E = z9;
    }
}
