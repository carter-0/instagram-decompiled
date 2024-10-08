package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class MCW implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public MCW(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r12) {
        C59678JTj jTj;
        ProductFeedResponse productFeedResponse;
        String str;
        User user;
        if (this.A00 != 0) {
            MQ0 mq0 = (MQ0) obj;
            if (!(!C59678JTj.A01(1, mq0) || (jTj = (C59678JTj) mq0) == null || (productFeedResponse = (ProductFeedResponse) jTj.A01) == null)) {
                C64835Lix lix = (C64835Lix) this.A03;
                C16679UzF uzF = (C16679UzF) this.A02;
                String str2 = this.A04;
                C64835Lix.A08(uzF, str2, C51966G9m.A1J(productFeedResponse.A03), (05G) this.A01);
                C16679UzF uzF2 = C16679UzF.CART;
                if (uzF == uzF2) {
                    05G r8 = lix.A06;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : (List) ((C61071Jw9) r8.getValue()).A00) {
                        Product A022 = ((ProductFeedItem) next).A02();
                        if (A022 == null || (user = A022.A0B) == null) {
                            str = null;
                        } else {
                            str = AnonymousClass3ZA.A00(user);
                        }
                        JTR.A1P(str, str2, next, A1C);
                    }
                    List A1J = C51966G9m.A1J(productFeedResponse.A03);
                    ArrayList A0S = 00k.A0S(A1J, A1C);
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    Iterator it = A0S.iterator();
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        ((List) JTS.A0h(((ProductFeedItem) next2).getId(), A1H)).add(next2);
                    }
                    LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
                    Iterator A0s = AnonymousClass7TF.A0s(A1H);
                    while (A0s.hasNext()) {
                        Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s);
                        if (DbS.A05(A1J2.getValue()) == 1) {
                            Dbb.A1V(A1J2, A1H2);
                        }
                    }
                    ArrayList<ProductFeedItem> A1C2 = AnonymousClass7TE.A1C();
                    Iterator A0s2 = AnonymousClass7TF.A0s(A1H2);
                    while (A0s2.hasNext()) {
                        018.A16((Iterable) C51971G9r.A0p(A0s2), A1C2);
                    }
                    if (A1J.containsAll(A1C2)) {
                        C64835Lix.A0B(uzF2, A1C2, r8);
                    } else {
                        List A012 = ((C61071Jw9) r8.getValue()).A01(uzF2);
                        ArrayList A1C3 = AnonymousClass7TE.A1C();
                        for (Object next3 : A012) {
                            ProductFeedItem productFeedItem = (ProductFeedItem) next3;
                            ArrayList A0r = AnonymousClass7TG.A0r(A1C2);
                            for (ProductFeedItem id : A1C2) {
                                A0r.add(id.getId());
                            }
                            DbV.A1U(next3, A1C3, A0r.contains(productFeedItem.getId()) ? 1 : 0);
                        }
                        C64835Lix.A0C(uzF2, A1C3, r8);
                    }
                }
            }
        } else {
            int A0M = AnonymousClass7TE.A0M(obj);
            if (A0M != -1) {
                C63929LDm lDm = (C63929LDm) this.A03;
                lDm.A01 = A0M;
                ((Oy9) this.A02).A00((MessageIdentifier) this.A01, this.A04, A0M + lDm.A00);
            }
        }
        return C60340gF.A00;
    }
}
