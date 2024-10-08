package X;

import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.VvF  reason: case insensitive filesystem */
public final class C18622VvF {
    public int A00;
    public int A01;
    public C19875Wh3 A02;
    public C17380VTh A03;
    public VPJ A04;
    public User A05;
    public List A06;
    public List A07 = new ArrayList();
    public boolean A08;
    public final List A09 = new ArrayList();

    public C18622VvF(MultiProductComponent multiProductComponent, C17380VTh vTh, VPJ vpj, User user, List list, boolean z) {
        user.getClass();
        this.A05 = user;
        vpj.getClass();
        this.A04 = vpj;
        list.getClass();
        this.A06 = list;
        this.A07 = Arrays.asList(new MultiProductComponent[]{multiProductComponent});
        vTh.getClass();
        this.A03 = vTh;
        this.A08 = z;
        A01();
    }

    public final void A01() {
        ProductCheckoutProperties productCheckoutProperties;
        BigDecimal bigDecimal;
        this.A00 = 0;
        this.A01 = 0;
        C17380VTh vTh = this.A03;
        this.A02 = new C19875Wh3(vTh.A01, BigDecimal.ZERO, vTh.A00);
        for (W0O w0o : this.A06) {
            this.A00 += w0o.A02();
            Product A032 = w0o.A03();
            if (A032 != null && (productCheckoutProperties = A032.A01.A0C) != null && Boolean.TRUE.equals(productCheckoutProperties.A02) && w0o.A03().A0P) {
                this.A01 += w0o.A02();
                C19875Wh3 wh3 = this.A02;
                Product A033 = w0o.A03();
                if (A033 == null || !A033.A0P) {
                    bigDecimal = new BigDecimal(0);
                } else {
                    bigDecimal = new BigDecimal(A033.A01.A0C.A00.getAmountWithOffset()).multiply(new BigDecimal(w0o.A02()));
                }
                this.A02 = new C19875Wh3(wh3.A01, wh3.A02.add(bigDecimal), wh3.A00);
                this.A09.add(w0o);
            }
        }
    }

    public final ArrayList A00() {
        ArrayList arrayList = new ArrayList();
        for (W0O A032 : this.A06) {
            Product A033 = A032.A03();
            if (A033 != null) {
                arrayList.add(A033);
            }
        }
        return arrayList;
    }

    public C18622VvF() {
    }
}
