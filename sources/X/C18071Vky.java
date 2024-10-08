package X;

import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Vky  reason: case insensitive filesystem */
public final class C18071Vky {
    public int A00;
    public LinkedHashMap A01;
    public final MultiProductComponent A02;
    public final C18622VvF A03;

    public final C18622VvF A00() {
        C18622VvF vvF = this.A03;
        User user = vvF.A05;
        VPJ vpj = vvF.A04;
        Collections.unmodifiableList(vvF.A06);
        if (!vvF.A07.isEmpty()) {
            vvF.A07.get(0);
        }
        boolean z = vvF.A08;
        return new C18622VvF(this.A02, vvF.A03, vpj, user, new ArrayList(this.A01.values()), z);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.W0O] */
    public final W0O A01(String str, int i) {
        if (this.A01.containsKey(str)) {
            Object obj = this.A01.get(str);
            if (obj != null) {
                W0O w0o = (W0O) obj;
                LinkedHashMap linkedHashMap = this.A01;
                C17985VjN vjN = w0o.A02;
                int i2 = w0o.A00;
                ? obj2 = new Object();
                obj2.A02 = vjN;
                obj2.A01 = i;
                obj2.A00 = i2;
                linkedHashMap.put(str, obj2);
                this.A00 = (this.A00 - w0o.A01) + i;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return (W0O) this.A01.get(str);
    }

    public final void A02(W0O w0o) {
        if (!this.A01.containsKey(w0o.A04())) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(w0o.A04(), w0o);
            linkedHashMap.putAll(this.A01);
            this.A01 = linkedHashMap;
            this.A00 += w0o.A01;
        }
    }

    public final void A03(W0O w0o) {
        if (this.A01.containsKey(w0o.A04())) {
            this.A01.remove(w0o.A04());
            this.A00 -= w0o.A01;
        }
    }

    public final void A04(W0O w0o, Product product) {
        int i;
        Integer num;
        if (product.A01.A0C != null) {
            String str = product.A0H;
            0qQ.A0B(str, 0);
            W0O w0o2 = (W0O) this.A01.get(str);
            int A022 = w0o.A02();
            if (w0o2 != null) {
                A022 += w0o2.A02();
            }
            ProductCheckoutProperties productCheckoutProperties = product.A01.A0C;
            int i2 = 0;
            if (productCheckoutProperties == null || (num = productCheckoutProperties.A0C) == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            W0O A002 = W0O.A00(product, Math.min(i, A022));
            int i3 = this.A00 - w0o.A01;
            this.A00 = i3;
            if (w0o2 != null) {
                i2 = w0o2.A01;
            }
            int i4 = i3 - i2;
            this.A00 = i4;
            this.A00 = i4 + A002.A01;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator A0s = AnonymousClass7TF.A0s(this.A01);
            while (A0s.hasNext()) {
                Map.Entry entry = (Map.Entry) AnonymousClass7TF.A0a(A0s);
                if (!0qQ.A0K(entry.getKey(), A002.A04())) {
                    if (0qQ.A0K(entry.getKey(), w0o.A04())) {
                        linkedHashMap.put(A002.A04(), A002);
                    } else {
                        JTR.A1U(linkedHashMap, entry);
                    }
                }
            }
            this.A01 = linkedHashMap;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C18071Vky(C18622VvF vvF) {
        MultiProductComponent multiProductComponent;
        this.A03 = vvF;
        if (vvF.A07.isEmpty()) {
            multiProductComponent = null;
        } else {
            multiProductComponent = (MultiProductComponent) AnonymousClass7TE.A13(vvF.A07);
        }
        this.A02 = multiProductComponent;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A01 = linkedHashMap;
        linkedHashMap.clear();
        this.A00 = 0;
        Iterator A0h = JTQ.A0h(vvF.A06);
        while (A0h.hasNext()) {
            W0O w0o = (W0O) AnonymousClass7TF.A0a(A0h);
            this.A01.put(w0o.A04(), w0o);
            this.A00 += w0o.A01;
        }
    }
}
