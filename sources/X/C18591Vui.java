package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.user.model.Product;

/* renamed from: X.Vui  reason: case insensitive filesystem */
public final class C18591Vui {
    public long A00;
    public AnonymousClass9JL A01;
    public C61079JwH A02;
    public ULV A03;
    public C15047ULa A04;
    public X53 A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final 1Xj A0B;
    public final ImageInfo A0C;
    public final AnonymousClass3ZL A0D;
    public final ProductLaunchInformation A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final /* synthetic */ C231142qw A0J;

    public C18591Vui(FBProductItemDetailsDict fBProductItemDetailsDict, 1Xj r8, C231142qw r9) {
        ImageInfo imageInfo;
        DHS dhs = new DHS(fBProductItemDetailsDict);
        ProductImageContainer C6z = fBProductItemDetailsDict.C6z();
        if (C6z != null) {
            imageInfo = C6z.BGO();
        } else {
            imageInfo = null;
        }
        String BaE = fBProductItemDetailsDict.BaE();
        BaE = BaE == null ? "" : BaE;
        this.A0J = r9;
        this.A0D = dhs;
        this.A0E = null;
        this.A0C = imageInfo;
        this.A0I = false;
        this.A0F = null;
        this.A0B = r8;
        this.A0G = BaE;
        this.A0H = "fb";
        this.A09 = true;
        this.A0A = true;
    }

    public final void A00() {
        C243373Ym r0;
        C231142qw r2 = this.A0J;
        if (C323496xa.A00(r2.A02).A03(this.A0D)) {
            r0 = C243373Ym.NOT_SAVED;
        } else {
            r0 = C243373Ym.SAVED;
        }
        C231142qw.A00(r0, this, r2);
    }

    public C18591Vui(1Xj r6, C231142qw r7, Product product, String str) {
        ProductLaunchInformation productLaunchInformation = product.A01.A0F;
        ImageInfo imageInfo = product.A08;
        boolean A042 = product.A04();
        ProductLaunchInformation productLaunchInformation2 = product.A01.A0F;
        if (productLaunchInformation2 != null) {
            0qQ.A0K(productLaunchInformation2.BBR(), AnonymousClass7TE.A0v());
        }
        this.A0J = r7;
        this.A0D = product;
        this.A0E = productLaunchInformation;
        this.A0C = imageInfo;
        this.A0I = A042;
        this.A0F = str;
        this.A0B = r6;
        this.A0G = null;
        this.A0H = null;
        this.A09 = true;
        this.A0A = true;
    }
}
