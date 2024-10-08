package X;

import android.net.Uri;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.ProductTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.595  reason: invalid class name */
public abstract class AnonymousClass595 {
    public static final 0bY A00 = new 1Q7("IgSecureUriParser").A00;

    public static final String A00(AndroidLink androidLink) {
        0qQ.A0B(androidLink, 0);
        String Avj = androidLink.Avj();
        if (Avj == null) {
            return null;
        }
        Uri A03 = 0cp.A03(Avj);
        0qQ.A07(A03);
        return A03.getQueryParameter(AnonymousClass000.A00(1150));
    }

    public static final String A01(AndroidLink androidLink) {
        0qQ.A0B(androidLink, 0);
        String Avj = androidLink.Avj();
        if (Avj == null) {
            return null;
        }
        Uri A03 = 0cp.A03(Avj);
        0qQ.A07(A03);
        return A03.getQueryParameter("product_id");
    }

    public static final boolean A03(1Xj r4) {
        boolean z = false;
        if (r4.A5v()) {
            List A3o = r4.A3o(AnonymousClass3WT.PRODUCT);
            if (A3o == null || A3o.isEmpty()) {
                return false;
            }
            return true;
        } else if (r4.A5D()) {
            Collection A0C = C229632nm.A0C(0, r4.A0o());
            if ((A0C instanceof Collection) && A0C.isEmpty()) {
                return false;
            }
            0sh it = A0C.iterator();
            while (it.hasNext()) {
                1Xj A1c = r4.A1c(it.A00());
                if (A1c != null && !A1c.A5D() && A03(A1c)) {
                    return true;
                }
            }
            return false;
        } else {
            if (A02(r4).isEmpty()) {
                z = true;
            }
            return !z;
        }
    }

    public static final boolean A04(AndroidLink androidLink) {
        Uri A01;
        String queryParameter;
        String Avj = androidLink.Avj();
        if (Avj == null || (A01 = 0cp.A01(A00, Avj)) == null || (queryParameter = A01.getQueryParameter("checkout_style")) == null || !queryParameter.equals("native_checkout")) {
            return false;
        }
        return true;
    }

    public static final ArrayList A02(1Xj r5) {
        ArrayList arrayList = new ArrayList();
        ArrayList A3G = r5.A3G();
        if (A3G != null && !A3G.isEmpty()) {
            Iterator it = A3G.iterator();
            while (it.hasNext()) {
                ProductTag productTag = (ProductTag) it.next();
                if (productTag.A00 != 1) {
                    arrayList.add(productTag);
                }
            }
        }
        return arrayList;
    }
}
