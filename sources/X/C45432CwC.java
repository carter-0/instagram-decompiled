package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;

/* renamed from: X.CwC  reason: case insensitive filesystem */
public class C45432CwC {
    public ProductCheckoutPropertiesIntf A00;
    public ProductImageContainer A01;
    public ProductImageContainer A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public final FBProductItemDetailsDict A0D;

    public C45432CwC(FBProductItemDetailsDict fBProductItemDetailsDict) {
        this.A0D = fBProductItemDetailsDict;
        this.A00 = fBProductItemDetailsDict.An5();
        this.A03 = fBProductItemDetailsDict.BCR();
        this.A04 = fBProductItemDetailsDict.BND();
        this.A05 = fBProductItemDetailsDict.BNE();
        this.A01 = fBProductItemDetailsDict.BOr();
        this.A06 = fBProductItemDetailsDict.BaE();
        this.A07 = fBProductItemDetailsDict.BaI();
        this.A08 = fBProductItemDetailsDict.BaK();
        this.A09 = fBProductItemDetailsDict.getProductId();
        this.A0A = fBProductItemDetailsDict.BgN();
        this.A0B = fBProductItemDetailsDict.C1f();
        this.A0C = fBProductItemDetailsDict.C1g();
        this.A02 = fBProductItemDetailsDict.C6z();
    }
}
