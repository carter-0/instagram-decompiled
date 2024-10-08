package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Meo  reason: case insensitive filesystem */
public final class C66905Meo implements AnonymousClass2tB {
    public final int A00;
    public final Object A01;

    public C66905Meo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DvY() {
        C2366634p r0;
        List<C62320sa> list;
        switch (this.A00) {
            case 0:
                C71153OeR oeR = (C71153OeR) this.A01;
                if (oeR.A0D && (r0 = oeR.A04.A00) != null) {
                    r0.A05();
                }
                if (oeR.A0E) {
                    C68952Nbb nbb = oeR.A04;
                    nbb.A02.A05();
                    nbb.A08.A01(oeR.A12.size());
                }
                if (C71153OeR.A0U(oeR) && oeR.A0I) {
                    C68952Nbb nbb2 = oeR.A04;
                    nbb2.A08.A01(oeR.A12.size());
                    C2366634p r02 = nbb2.A00;
                    if (r02 != null) {
                        r02.A05();
                    }
                    C71153OeR.A0H(oeR);
                    return;
                }
                return;
            case 1:
                K6H k6h = (K6H) this.A01;
                RecyclerView recyclerView = k6h.A02;
                if (recyclerView == null) {
                    C66580MXl.A19();
                    throw AnonymousClass00P.createAndThrow();
                }
                recyclerView.A0i();
                C60327JjW jjW = (C60327JjW) k6h.A0O.getValue();
                MP7 mp7 = new MP7(k6h, 14);
                LML lml = jjW.A00;
                if (lml != null) {
                    mp7.invoke(lml);
                    jjW.A00 = null;
                    return;
                }
                return;
            case 2:
                MerchantShoppingCartFragment merchantShoppingCartFragment = (MerchantShoppingCartFragment) this.A01;
                C18622VvF vvF = merchantShoppingCartFragment.A0E;
                if (!merchantShoppingCartFragment.A0b && vvF != null && merchantShoppingCartFragment.A0Z != null) {
                    Iterator A0h = JTQ.A0h(vvF.A06);
                    while (A0h.hasNext()) {
                        W0O w0o = (W0O) A0h.next();
                        if (merchantShoppingCartFragment.A0Z.containsKey(w0o.A04())) {
                            int A02 = merchantShoppingCartFragment.A07.A08.A02(w0o.A04());
                            if (A02 >= 0) {
                                RecyclerView recyclerView2 = merchantShoppingCartFragment.mRecyclerView;
                                C252553pI r03 = recyclerView2.A0D;
                                r03.getClass();
                                if (!C240113Jq.A06(r03, recyclerView2, A02)) {
                                    U9e u9e = new U9e(merchantShoppingCartFragment.requireContext(), merchantShoppingCartFragment, 1);
                                    u9e.A00 = A02;
                                    C252553pI r04 = merchantShoppingCartFragment.mRecyclerView.A0D;
                                    if (r04 != null) {
                                        r04.A0t(u9e);
                                    }
                                }
                                merchantShoppingCartFragment.A0b = true;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                GD6 gd6 = (GD6) this.A01;
                if (gd6.A0G) {
                    gd6.A02 = false;
                    list = gd6.A0E;
                    for (C62320sa invoke : list) {
                        invoke.invoke();
                    }
                    break;
                } else {
                    return;
                }
            default:
                GD6 gd62 = (GD6) this.A01;
                if (!gd62.A0G) {
                    gd62.A02 = false;
                    list = gd62.A0E;
                    for (C62320sa invoke2 : list) {
                        invoke2.invoke();
                    }
                    break;
                } else {
                    return;
                }
        }
        list.clear();
    }
}
