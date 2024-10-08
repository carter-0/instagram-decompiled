package X;

import com.instagram.api.schemas.ProductTileBannerMetadataDecoration;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

public final class UL1 extends AnonymousClass0T0 {
    public final ProductTileBannerMetadataDecoration A00;
    public final C56078HsR A01;
    public final C266444Yx A02;
    public final ImageUrl A03;
    public final ImageInfo A04;
    public final Uw7 A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
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
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final AnonymousClass0iw A0M;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UL1) {
                UL1 ul1 = (UL1) obj;
                if (!(this.A05 == ul1.A05 && 0qQ.A0K(this.A02, ul1.A02) && 0qQ.A0K(this.A01, ul1.A01) && 0qQ.A0K(this.A04, ul1.A04) && this.A0A == ul1.A0A && this.A0B == ul1.A0B && this.A0C == ul1.A0C && this.A0E == ul1.A0E && this.A0F == ul1.A0F && this.A0G == ul1.A0G && this.A0H == ul1.A0H && this.A0I == ul1.A0I && this.A0D == ul1.A0D && 0qQ.A0K(this.A09, ul1.A09) && 0qQ.A0K(this.A06, ul1.A06) && 0qQ.A0K(this.A00, ul1.A00) && 0qQ.A0K(this.A03, ul1.A03) && 0qQ.A0K(this.A08, ul1.A08) && this.A0L == ul1.A0L && 0qQ.A0K(this.A07, ul1.A07) && this.A0K == ul1.A0K && 0qQ.A0K(this.A0M, ul1.A0M) && this.A0J == ul1.A0J)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TG.A0C(this.A05) * 31);
        int A092 = AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0A, ((AnonymousClass7TF.A07(this.A01, A072) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31)))))))));
        int A002 = C54732HQn.A00();
        int i = (((A092 + A002) * 31) + A002) * 31;
        boolean z = this.A0L;
        return DbS.A06(this.A0J, (AnonymousClass7TF.A07(this.A0M, AnonymousClass7TF.A09(this.A0K, (AnonymousClass7TF.A09(z, (((((((AnonymousClass7TF.A07(this.A09, i) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A07)) * 31)) + A002) * 31);
    }

    public UL1(ProductTileBannerMetadataDecoration productTileBannerMetadataDecoration, AnonymousClass0iw r3, C56078HsR hsR, C266444Yx r5, ImageUrl imageUrl, ImageInfo imageInfo, Uw7 uw7, Integer num, Integer num2, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A05 = uw7;
        this.A02 = r5;
        this.A01 = hsR;
        this.A04 = imageInfo;
        this.A0A = z;
        this.A0B = z2;
        this.A0C = z3;
        this.A0E = z4;
        this.A0F = z5;
        this.A0G = z6;
        this.A0H = z7;
        this.A0I = z8;
        this.A0D = z9;
        this.A09 = list;
        this.A06 = num;
        this.A00 = productTileBannerMetadataDecoration;
        this.A03 = imageUrl;
        this.A08 = str;
        this.A0L = z10;
        this.A07 = num2;
        this.A0K = z11;
        this.A0M = r3;
        this.A0J = z12;
    }
}
