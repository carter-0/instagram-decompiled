package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vuf  reason: case insensitive filesystem */
public final class C18588Vuf {
    public final ProductGroup A00;
    public final AnonymousClass4UE A01;
    public final C18502Vsx A02;
    public final C17501VYe A03;
    public final W1L A04;
    public final C17458VWl A05;
    public final C17459VWm A06;
    public final C18448Vrv A07;
    public final Product A08;
    public final Product A09;
    public final String A0A;
    public final Map A0B;
    public final Map A0C;
    public final Map A0D;
    public final Map A0E;
    public final boolean A0F;
    public final boolean A0G;

    public static void A00(X9C x9c, W2j w2j) {
        x9c.Elq(new C18588Vuf(w2j));
    }

    public final boolean A01() {
        ProductGroup productGroup = this.A00;
        if (productGroup == null || Collections.unmodifiableList(productGroup.A02) == null) {
            return false;
        }
        Iterator A0h = JTQ.A0h(productGroup.A02);
        while (A0h.hasNext()) {
            C18448Vrv vrv = this.A07;
            String str = ((ProductVariantDimension) A0h.next()).A02;
            0qQ.A0B(str, 0);
            if (vrv.A01.get(str) == null) {
                return true;
            }
        }
        return false;
    }

    public C18588Vuf(W2j w2j) {
        this.A0G = w2j.A0G;
        this.A0F = w2j.A0F;
        this.A02 = w2j.A02;
        this.A0E = w2j.A0E;
        this.A04 = w2j.A04;
        this.A05 = w2j.A05;
        this.A06 = w2j.A06;
        this.A07 = w2j.A07;
        this.A00 = w2j.A00;
        this.A08 = w2j.A08;
        this.A0A = w2j.A0A;
        this.A09 = w2j.A09;
        this.A0C = w2j.A0C;
        this.A0B = w2j.A0B;
        this.A03 = w2j.A03;
        this.A0D = w2j.A0D;
        this.A01 = w2j.A01;
    }
}
