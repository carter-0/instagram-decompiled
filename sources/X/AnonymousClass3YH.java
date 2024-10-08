package X;

import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3YH  reason: invalid class name */
public final class AnonymousClass3YH {
    public static final ArrayList A01(1Xj r7, User user) {
        ClipsShoppingInfoIntf Btl;
        ArrayList arrayList = new ArrayList();
        AnonymousClass9LR r6 = new AnonymousClass9LR(user, 0);
        ArrayList A3G = r7.A3G();
        if (A3G != null) {
            ArrayList<Tag> arrayList2 = new ArrayList<>();
            Iterator it = A3G.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                ProductTag productTag = (ProductTag) next;
                if (user == null || ((Boolean) r6.invoke(C14502TxO.A00(productTag.A02))).booleanValue()) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(0Yv.A1E(arrayList2, 10));
            for (Tag id : arrayList2) {
                arrayList3.add(id.getId());
            }
            arrayList.addAll(arrayList3);
        }
        IGTVShoppingInfoIntf BFq = r7.A0C.BFq();
        if (BFq != null) {
            ArrayList A00 = C17024VEy.A00(BFq);
            ArrayList<Product> arrayList4 = new ArrayList<>();
            Iterator it2 = A00.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (((Boolean) r6.invoke(next2)).booleanValue()) {
                    arrayList4.add(next2);
                }
            }
            ArrayList arrayList5 = new ArrayList(0Yv.A1E(arrayList4, 10));
            for (Product product : arrayList4) {
                arrayList5.add(product.A0H);
            }
            arrayList.addAll(arrayList5);
        }
        C67231sQ clipsMetadata = r7.A0C.getClipsMetadata();
        if (!(clipsMetadata == null || (Btl = clipsMetadata.Btl()) == null)) {
            List A002 = C17023VEx.A00(Btl);
            ArrayList<Product> arrayList6 = new ArrayList<>();
            for (Object next3 : A002) {
                if (((Boolean) r6.invoke(next3)).booleanValue()) {
                    arrayList6.add(next3);
                }
            }
            ArrayList arrayList7 = new ArrayList(0Yv.A1E(arrayList6, 10));
            for (Product product2 : arrayList6) {
                arrayList7.add(product2.A0H);
            }
            arrayList.addAll(arrayList7);
        }
        return arrayList;
    }

    public final ArrayList A03(1Xj r5, User user, int i) {
        1Xj A1c;
        if (!r5.A5D()) {
            return A01(r5, user);
        }
        ArrayList arrayList = new ArrayList();
        1Xj A1c2 = r5.A1c(i);
        if (A1c2 != null) {
            arrayList.addAll(A01(A1c2, user));
        }
        0sh it = C229632nm.A0C(0, r5.A0o()).iterator();
        while (it.hasNext()) {
            int A00 = it.A00();
            Integer valueOf = Integer.valueOf(A00);
            if (!(i == A00 || valueOf == null || (A1c = r5.A1c(A00)) == null)) {
                arrayList.addAll(A01(A1c, user));
            }
        }
        return arrayList;
    }

    public final List A04(1Xj r5) {
        AnonymousClass3T1 A0A = C242173Sx.A0A(new C242193Sz(C66353MOk.A00, 00k.A0o(A00(r5))));
        C41743AzY azY = C41743AzY.A00;
        0qQ.A0B(azY, 1);
        return C242173Sx.A07(new C52515GVs(azY, A0A));
    }

    public static final ArrayList A00(1Xj r2) {
        List list;
        List list2;
        ClipsShoppingInfoIntf Btl;
        List A0a = 00k.A0a(r2.A3B());
        IGTVShoppingInfoIntf BFq = r2.A0C.BFq();
        if (BFq != null) {
            list = 00k.A0a(C17024VEy.A00(BFq));
        } else {
            list = 0sn.A00;
        }
        ArrayList A0S = 00k.A0S(list, A0a);
        C67231sQ clipsMetadata = r2.A0C.getClipsMetadata();
        if (clipsMetadata == null || (Btl = clipsMetadata.Btl()) == null) {
            list2 = 0sn.A00;
        } else {
            list2 = C17023VEx.A00(Btl);
        }
        return 00k.A0S(list2, A0S);
    }

    public static final boolean A02(1Xj r3) {
        IGTVShoppingInfoIntf BFq;
        C67231sQ clipsMetadata;
        ClipsShoppingInfoIntf Btl;
        ArrayList A3A = r3.A3A();
        if ((A3A == null || !(!A3A.isEmpty())) && (((BFq = r3.A0C.BFq()) == null || !(!C17024VEy.A00(BFq).isEmpty())) && ((clipsMetadata = r3.A0C.getClipsMetadata()) == null || (Btl = clipsMetadata.Btl()) == null || !(!C17023VEx.A00(Btl).isEmpty())))) {
            return false;
        }
        return true;
    }
}
