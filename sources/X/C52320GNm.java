package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.List;

/* renamed from: X.GNm  reason: case insensitive filesystem */
public final class C52320GNm extends AnonymousClass0T0 {
    public final AnonymousClass1Xp A00;
    public final C56078HsR A01;
    public final ImageUrl A02;
    public final SpritesheetInfo A03;
    public final 1iA A04;
    public final Integer A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
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
            if (obj instanceof C52320GNm) {
                C52320GNm gNm = (C52320GNm) obj;
                if (!(0qQ.A0K(this.A01, gNm.A01) && 0qQ.A0K(this.A05, gNm.A05) && this.A0H == gNm.A0H && this.A0G == gNm.A0G && this.A09 == gNm.A09 && this.A0A == gNm.A0A && this.A07 == gNm.A07 && this.A0I == gNm.A0I && 0qQ.A0K(this.A03, gNm.A03) && 0qQ.A0K(this.A02, gNm.A02) && 0qQ.A0K(this.A06, gNm.A06) && 0qQ.A0K(this.A00, gNm.A00) && this.A0D == gNm.A0D && this.A0E == gNm.A0E && this.A0C == gNm.A0C && this.A04 == gNm.A04 && this.A08 == gNm.A08 && this.A0F == gNm.A0F && this.A0B == gNm.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0H, ((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31)))));
        int A093 = AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0D, (((((((AnonymousClass7TF.A09(this.A0I, A092) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31));
        int A094 = AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A08, (AnonymousClass7TF.A09(this.A0C, A093) + AnonymousClass7TE.A0L(this.A04)) * 31));
        int A002 = C54732HQn.A00();
        return DbS.A06(this.A0B, (((A094 + A002) * 31) + A002) * 31);
    }

    public C52320GNm(AnonymousClass1Xp r2, C56078HsR hsR, ImageUrl imageUrl, SpritesheetInfo spritesheetInfo, 1iA r6, Integer num, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A01 = hsR;
        this.A05 = num;
        this.A0H = z;
        this.A0G = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A07 = z5;
        this.A0I = z6;
        this.A03 = spritesheetInfo;
        this.A02 = imageUrl;
        this.A06 = list;
        this.A00 = r2;
        this.A0D = z7;
        this.A0E = z8;
        this.A0C = z9;
        this.A04 = r6;
        this.A08 = z10;
        this.A0F = z11;
        this.A0B = z12;
    }
}
