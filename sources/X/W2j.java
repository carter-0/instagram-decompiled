package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class W2j {
    public ProductGroup A00;
    public AnonymousClass4UE A01;
    public C18502Vsx A02;
    public C17501VYe A03;
    public W1L A04;
    public C17458VWl A05;
    public C17459VWm A06;
    public C18448Vrv A07;
    public Product A08;
    public Product A09;
    public String A0A;
    public Map A0B;
    public Map A0C;
    public Map A0D;
    public Map A0E;
    public boolean A0F;
    public boolean A0G;

    public static void A01(1Xj r0, Uw7 uw7, W2j w2j, C18570VuM vuM) {
        vuM.A01 = uw7;
        vuM.A00 = r0;
        w2j.A04 = new W1L(vuM);
    }

    public static void A02(C18502Vsx vsx, W2j w2j, boolean z) {
        w2j.A02 = new C18502Vsx(vsx.A00, vsx.A01, vsx.A02, C16605Uxz.LOADING, vsx.A04, vsx.A05, z);
    }

    public static void A03(W2j w2j) {
        w2j.A02 = C18502Vsx.A07;
        w2j.A0E = new HashMap();
        w2j.A04 = W1L.A06;
        w2j.A05 = new C17458VWl(new HashMap(), new HashMap(), new HashMap());
        w2j.A06 = new C17459VWm((V4S) null, new LinkedHashMap(), new LinkedHashMap());
        w2j.A07 = C18448Vrv.A02;
        w2j.A0C = new HashMap();
        w2j.A0B = new HashMap();
        w2j.A03 = new C17501VYe((FeaturedProductPermissionStatus) null, (FeaturedProductPermissionStatus) null, C16605Uxz.UNINITIALIZED, (String) null);
        w2j.A0D = new HashMap();
    }

    public W2j(C18588Vuf vuf) {
        A03(this);
        this.A0G = vuf.A0G;
        this.A0F = vuf.A0F;
        this.A02 = vuf.A02;
        this.A0E = new HashMap(vuf.A0E);
        this.A04 = vuf.A04;
        this.A05 = vuf.A05;
        this.A06 = vuf.A06;
        this.A07 = vuf.A07;
        this.A00 = vuf.A00;
        this.A08 = vuf.A08;
        this.A09 = vuf.A09;
        this.A0A = vuf.A0A;
        this.A0C = new HashMap(vuf.A0C);
        this.A0B = new HashMap(vuf.A0B);
        this.A03 = vuf.A03;
        this.A0D = new HashMap(vuf.A0D);
        this.A01 = vuf.A01;
    }

    public static W2j A00(X9C x9c) {
        return new W2j(x9c.Bz5());
    }

    public W2j() {
        A03(this);
    }
}
