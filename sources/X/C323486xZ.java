package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6xZ  reason: invalid class name and case insensitive filesystem */
public final class C323486xZ {
    public int A00 = -2;
    public String A01 = null;
    public final int A02;
    public final C323396xQ A03;
    public final 1Ng A04;
    public final UserSession A05;
    public final C323516xc A06;
    public final C323436xU A07;
    public final C323476xY A08;
    public final C323506xb A09;
    public final Map A0A = new LinkedHashMap();
    public final Map A0B = new LinkedHashMap();
    public final Map A0C = new LinkedHashMap();
    public final Map A0D = new LinkedHashMap();
    public final Map A0E = new LinkedHashMap();
    public final Set A0F = new LinkedHashSet();

    public C323486xZ(UserSession userSession, C323436xU r9, C323476xY r10) {
        0qQ.A0B(userSession, 2);
        C323506xb A002 = C323496xa.A00(userSession);
        1Ng A003 = AnonymousClass1Nd.A00(userSession);
        int A012 = (int) 182.A01(0Tu.A05, userSession, 36593310340547678L);
        C323516xc r3 = new C323516xc(1vm.A01(userSession));
        C323396xQ r1 = new C323396xQ(userSession);
        0qQ.A0B(A002, 3);
        0qQ.A0B(A003, 4);
        this.A08 = r10;
        this.A05 = userSession;
        this.A09 = A002;
        this.A04 = A003;
        this.A07 = r9;
        this.A02 = A012;
        this.A06 = r3;
        this.A03 = r1;
    }

    public final C18071Vky A06(String str) {
        0qQ.A0B(str, 0);
        return (C18071Vky) this.A0B.get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C20927X4s A07(com.instagram.user.model.Product r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            int r1 = r3.A00
            int r0 = r3.A02
            if (r1 != r0) goto L_0x0014
            com.instagram.common.session.UserSession r1 = r3.A05
            X.WcF r0 = new X.WcF
            r0.<init>(r1)
        L_0x0011:
            X.X4s r0 = (X.C20927X4s) r0
            return r0
        L_0x0014:
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x004a
            X.Vky r2 = r3.A06(r5)
            if (r2 == 0) goto L_0x0048
            java.lang.String r1 = r4.A0H
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.LinkedHashMap r0 = r2.A01
            java.lang.Object r0 = r0.get(r1)
            X.W0O r0 = (X.W0O) r0
            if (r0 == 0) goto L_0x0048
            int r0 = r0.A02()
        L_0x0032:
            int r1 = r0 + 1
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r4.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x0046
            java.lang.Integer r0 = r0.A0C
            if (r0 == 0) goto L_0x0046
            int r0 = r0.intValue()
        L_0x0042:
            if (r1 > r0) goto L_0x004a
            r0 = 0
            return r0
        L_0x0046:
            r0 = 0
            goto L_0x0042
        L_0x0048:
            r0 = -1
            goto L_0x0032
        L_0x004a:
            X.WcE r0 = new X.WcE
            r0.<init>()
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323486xZ.A07(com.instagram.user.model.Product, java.lang.String):X.X4s");
    }

    public final W0O A08(W0O w0o, Product product, String str) {
        0qQ.A0B(str, 0);
        0qQ.A0B(w0o, 1);
        C18071Vky A062 = A06(str);
        if (A062 == null) {
            return null;
        }
        A062.A04(w0o, product);
        A0A(str).add(new C17991VjT(C16513UwH.REPLACE_ITEM, C16507Uw3.LOCAL_PENDING, w0o, product));
        A0B();
        this.A07.D1H(A062, str);
        String str2 = product.A0H;
        0qQ.A0B(str2, 0);
        return (W0O) A062.A01.get(str2);
    }

    public final String A09(String str) {
        0qQ.A0B(str, 0);
        return (String) this.A0D.get(str);
    }

    public final List A0A(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A0E;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        map.put(str, arrayList);
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.X7w] */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.VPJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.VTh] */
    public final void A0C(C20981X7w x7w, Product product, String str) {
        String str2;
        int i;
        CurrencyAmountInfo currencyAmountInfo;
        Integer BXp;
        CurrencyAmountInfo currencyAmountInfo2;
        0qQ.A0B(str, 0);
        C20927X4s A072 = A07(product, str);
        if (A072 != null) {
            List singletonList = Collections.singletonList(A072);
            0qQ.A07(singletonList);
            x7w.DwB(singletonList);
            return;
        }
        C18071Vky A062 = A06(str);
        if (A062 == null) {
            User user = product.A0B;
            ? obj = new Object();
            ProductCheckoutProperties productCheckoutProperties = product.A01.A0C;
            if (productCheckoutProperties == null || (currencyAmountInfo2 = productCheckoutProperties.A00) == null) {
                str2 = null;
            } else {
                str2 = currencyAmountInfo2.getCurrency();
            }
            ProductCheckoutProperties productCheckoutProperties2 = product.A01.A0C;
            if (productCheckoutProperties2 == null || (currencyAmountInfo = productCheckoutProperties2.A00) == null || (BXp = currencyAmountInfo.BXp()) == null) {
                i = 0;
            } else {
                i = BXp.intValue();
            }
            ? obj2 = new Object();
            obj2.A01 = str2;
            obj2.A00 = i;
            A062 = new C18071Vky(new C18622VvF((MultiProductComponent) null, obj2, obj, user, 0sn.A00, true));
            this.A0B.put(str, A062);
        }
        if (A062.A03.A08) {
            A0D(new Object(), product, str, (String) null);
            A062.A02(W0O.A00(product, 1));
        } else {
            for (C17991VjT A012 : A00(product, str, true)) {
                A01(A062, A012);
            }
            A0B();
        }
        this.A07.D1H(A062, str);
        String str3 = product.A0H;
        0qQ.A0B(str3, 0);
        Object obj3 = A062.A01.get(str3);
        if (obj3 != null) {
            x7w.onSuccess(obj3);
        }
    }

    public final void A0D(C20981X7w x7w, Product product, String str, String str2) {
        String str3 = str;
        0qQ.A0B(str3, 0);
        Product product2 = product;
        List A002 = A00(product2, str3, false);
        A0E(C16508Uw5.LOADING, str3);
        C15600UfS ufS = new C15600UfS(x7w, this, product2, str3, A002);
        if (182.A06(0Tu.A05, this.A03.A00, 36314996459899823L)) {
            C323516xc r0 = this.A06;
            String str4 = product2.A0H;
            String A092 = A09(str3);
            0qQ.A0B(str4, 1);
            1vo r3 = r0.A00;
            2IS r5 = new 2IS();
            2IS r6 = new 2IS();
            0Df A022 = GraphQlCallInput.A02.A02();
            0Df.A00(A022, str3, "merchant_id");
            0Df.A00(A022, str4, "product_id");
            0Df.A00(A022, 1, "quantity");
            if (A092 != null) {
                0Df.A00(A022, A092, "cart_id");
            }
            r5.A00.A02().A0E(A022, "input");
            AnonymousClass2IY r02 = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "CommerceCartGraphQLCartMutation", r5.getParamsCopy(), r6.getParamsCopy(), C52.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_commerce_cart_add_product", new ArrayList());
            r3.ATL(new C45916DEw(ufS), new DFK(ufS), pandoGraphQLRequest);
            return;
        }
        C323476xY r4 = this.A08;
        UserSession userSession = this.A05;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("merchant_id", str3).put("product_id", product2.A0H).put("additional_quantity", 1);
            String str5 = str2;
            if (str2 != null) {
                jSONObject.put("marketer_id", str5);
            }
            jSONArray.put(jSONObject);
            1NY r32 = new 1NY(userSession, -2);
            r32.A0A("commerce/bag/add/");
            r32.A04();
            r32.A9m(DialogModule.KEY_ITEMS, jSONArray.toString());
            r32.A0Q(CG8.class, D2Y.class);
            r32.A0R = true;
            1OC A0M = r32.A0M();
            A0M.A00 = new C15616Ufi(ufS, A0M, r4);
            1ES.A03(A0M);
        } catch (JSONException e) {
            ufS.onFail(new C268664dn(e));
        }
    }

    public final void A0E(C16508Uw5 uw5, String str) {
        0qQ.A0B(str, 0);
        this.A0A.put(str, uw5);
    }

    public final void A0F(W0O w0o, String str) {
        0qQ.A0B(str, 0);
        C18071Vky A062 = A06(str);
        if (A062 != null) {
            String A042 = w0o.A04();
            0qQ.A07(A042);
            if (A062.A01.get(A042) != null) {
                A062.A03(w0o);
                A0A(str).add(new C17991VjT(C16513UwH.REMOVE, C16507Uw3.LOCAL_PENDING, w0o, (Product) null));
                this.A07.D1H(A062, str);
                this.A0C.put(str, Integer.valueOf(A062.A00));
                A02(this);
            }
        }
    }

    public final void A0G(Product product, String str) {
        C16675UzB uzB;
        0qQ.A0B(str, 0);
        C18071Vky A062 = A06(str);
        if (A062 != null) {
            String str2 = product.A0H;
            0qQ.A0B(str2, 0);
            if (A062.A01.get(str2) == null) {
                MultiProductComponent multiProductComponent = A062.A02;
                if (multiProductComponent != null) {
                    uzB = multiProductComponent.A04;
                } else {
                    uzB = null;
                }
                if (uzB == C16675UzB.SAVED && multiProductComponent != null) {
                    for (ProductFeedItem id : multiProductComponent.A03.A03) {
                        if (id.getId().equals(str2)) {
                            return;
                        }
                    }
                    multiProductComponent.A02(new ProductFeedItem(product));
                    this.A07.D1H(A062, str);
                }
            }
        }
    }

    public final void A0H(Product product, String str) {
        MultiProductComponent multiProductComponent;
        0qQ.A0B(str, 0);
        C18071Vky A062 = A06(str);
        if (A062 != null && (multiProductComponent = A062.A02) != null && multiProductComponent.A03(product.A0H)) {
            this.A07.D1H(A062, str);
        }
    }

    public static final void A01(C18071Vky vky, C17991VjT vjT) {
        int ordinal = vjT.A01.ordinal();
        if (ordinal == 0) {
            vky.A02(vjT.A02);
        } else if (ordinal == 2) {
            vky.A03(vjT.A02);
        } else if (ordinal == 1) {
            W0O w0o = vjT.A02;
            String A042 = w0o.A04();
            0qQ.A07(A042);
            vky.A01(A042, w0o.A02());
        } else if (ordinal == 3) {
            W0O w0o2 = vjT.A02;
            if (vky.A01.containsKey(w0o2.A04())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(w0o2.A04(), w0o2);
                linkedHashMap.putAll(vky.A01);
                vky.A01 = linkedHashMap;
            }
        } else if (ordinal == 4) {
            Product product = vjT.A03;
            if (product != null) {
                vky.A04(vjT.A02, product);
            }
        } else {
            throw new RuntimeException();
        }
    }

    public static final void A02(C323486xZ r2) {
        int A022 = 00k.A02(r2.A0C.values());
        int i = r2.A00;
        if (i < 0 || A022 != i) {
            r2.A00 = A022;
            r2.A07.DsL(A022);
        }
    }

    public final void A0B() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Set set = this.A0F;
        set.clear();
        for (Map.Entry entry : this.A0B.entrySet()) {
            String str = (String) entry.getKey();
            C18071Vky vky = (C18071Vky) entry.getValue();
            if (!A05(this, str) && !vky.A03.A08) {
                0qQ.A0B(str, 0);
                Map map = this.A0A;
                if (map.get(str) != null && map.get(str) == C16508Uw5.LOADED) {
                    if (A04(this, str)) {
                        arrayList2.add(str);
                        arrayList.add(vky);
                        arrayList3.add(A0A(str));
                        A0E(C16508Uw5.LOADING, str);
                    }
                }
            }
            set.add(str);
        }
        if (!arrayList.isEmpty()) {
            C323476xY r4 = this.A08;
            UserSession userSession = this.A05;
            C15582UfA ufA = new C15582UfA(this, arrayList2, arrayList3);
            if (arrayList2.size() == arrayList.size()) {
                JSONArray jSONArray = new JSONArray();
                try {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = arrayList2.get(i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("merchant_id", obj);
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = new ArrayList(((C18071Vky) arrayList.get(i)).A01.values()).iterator();
                        while (it.hasNext()) {
                            W0O w0o = (W0O) it.next();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("product_id", w0o.A04());
                            jSONObject2.put("quantity", w0o.A01);
                            jSONArray2.put(jSONObject2);
                        }
                        jSONObject.put(DialogModule.KEY_ITEMS, jSONArray2);
                        jSONArray.put(jSONObject);
                    }
                    1NY r2 = new 1NY(userSession, -2);
                    r2.A0A("commerce/bag/sync/");
                    r2.A04();
                    r2.A9m("bags", jSONArray.toString());
                    r2.A0Q(CG8.class, D2Y.class);
                    r2.A0R = true;
                    1OC A0M = r2.A0M();
                    A0M.A00 = new C15616Ufi(ufA, A0M, r4);
                    1ES.A03(A0M);
                } catch (JSONException e) {
                    ufA.onFail(new C268664dn(e));
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.W0O] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0046 A[LOOP:0: B:6:0x0040->B:8:0x0046, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List A00(com.instagram.user.model.Product r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            X.Vky r2 = r6.A06(r8)
            if (r2 == 0) goto L_0x0052
            java.lang.String r1 = r7.A0H
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.LinkedHashMap r0 = r2.A01
            java.lang.Object r3 = r0.get(r1)
            X.W0O r3 = (X.W0O) r3
            if (r3 == 0) goto L_0x0052
            int r0 = r3.A02()
            int r2 = r0 + 1
            X.VjN r1 = r3.A02
            int r0 = r3.A00
            X.W0O r4 = new X.W0O
            r4.<init>()
            r4.A02 = r1
            r4.A01 = r2
            r4.A00 = r0
            X.UwH r3 = X.C16513UwH.QUANTITY_SET
            X.Uw3 r2 = X.C16507Uw3.LOCAL_PENDING
            r1 = 0
            X.VjT r0 = new X.VjT
            r0.<init>(r3, r2, r4, r1)
            java.util.List r3 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r3)
        L_0x003c:
            java.util.Iterator r2 = r3.iterator()
        L_0x0040:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r1 = r2.next()
            java.util.List r0 = r6.A0A(r8)
            r0.add(r1)
            goto L_0x0040
        L_0x0052:
            r0 = 1
            X.W0O r5 = X.W0O.A00(r7, r0)
            X.0qQ.A0A(r5)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.UwH r1 = X.C16513UwH.ADD_ITEM
            if (r9 == 0) goto L_0x0081
            X.Uw3 r0 = X.C16507Uw3.LOCAL_PENDING
        L_0x0064:
            r4 = 0
            X.VjT r3 = new X.VjT
            r3.<init>(r1, r0, r5, r4)
            X.UwH r2 = X.C16513UwH.MOVE_ITEM_TO_TOP
            if (r9 == 0) goto L_0x007e
            X.Uw3 r1 = X.C16507Uw3.LOCAL_PENDING
        L_0x0070:
            X.VjT r0 = new X.VjT
            r0.<init>(r2, r1, r5, r4)
            X.VjT[] r0 = new X.C17991VjT[]{r3, r0}
            java.util.List r3 = X.0sr.A1P(r0)
            goto L_0x003c
        L_0x007e:
            X.Uw3 r1 = X.C16507Uw3.NETWORK_PENDING
            goto L_0x0070
        L_0x0081:
            X.Uw3 r0 = X.C16507Uw3.NETWORK_PENDING
            goto L_0x0064
        L_0x0084:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323486xZ.A00(com.instagram.user.model.Product, java.lang.String, boolean):java.util.List");
    }

    public static final void A03(C323486xZ r9, List list, List list2) {
        String str;
        Iterator it = list.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            C45393CvZ cvZ = (C45393CvZ) it.next();
            User user = cvZ.A01;
            if (user != null) {
                str2 = AnonymousClass3ZA.A00(user);
            }
            0qQ.A0A(str2);
            r9.A0C.put(str2, Integer.valueOf(cvZ.A00));
            r9.A01 = cvZ.A02;
            r9.A0D.put(str2, cvZ.A03);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C18622VvF vvF = (C18622VvF) it2.next();
            User user2 = vvF.A05;
            if (user2 != null) {
                str = AnonymousClass3ZA.A00(user2);
            } else {
                str = null;
            }
            0qQ.A0A(str);
            C18071Vky vky = new C18071Vky(vvF);
            for (C17991VjT vjT : r9.A0A(str)) {
                C16507Uw3 uw3 = vjT.A00;
                if (uw3 == C16507Uw3.LOCAL_PENDING || uw3 == C16507Uw3.COMMITTED) {
                    A01(vky, vjT);
                }
            }
            r9.A0B.put(str, vky);
            r9.A0E(C16508Uw5.LOADED, str);
            r9.A0C.put(str, Integer.valueOf(vky.A00));
            linkedHashSet.add(str);
        }
        for (Map.Entry entry : r9.A0B.entrySet()) {
            String str3 = (String) entry.getKey();
            C18071Vky vky2 = (C18071Vky) entry.getValue();
            if (!linkedHashSet.contains(str3) && A04(r9, str3)) {
                r9.A0C.put(str3, Integer.valueOf(vky2.A00));
            }
        }
        A02(r9);
        if (!(!r9.A08.A00.isEmpty())) {
            Set entrySet = r9.A0E.entrySet();
            ArrayList<Map.Entry> arrayList = new ArrayList<>();
            for (Object next : entrySet) {
                if (!A04(r9, (String) ((Map.Entry) next).getKey())) {
                    arrayList.add(next);
                }
            }
            for (Map.Entry value : arrayList) {
                ((List) value.getValue()).clear();
            }
        }
    }

    public static final boolean A04(C323486xZ r2, String str) {
        List<C17991VjT> A0A2 = r2.A0A(str);
        if (!(A0A2 instanceof Collection) || !A0A2.isEmpty()) {
            for (C17991VjT vjT : A0A2) {
                if (vjT.A00 != C16507Uw3.COMMITTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A05(C323486xZ r2, String str) {
        List<C17991VjT> A0A2 = r2.A0A(str);
        if ((A0A2 instanceof Collection) && A0A2.isEmpty()) {
            return false;
        }
        for (C17991VjT vjT : A0A2) {
            if (vjT.A00 == C16507Uw3.NETWORK_PENDING) {
                return true;
            }
        }
        return false;
    }
}
