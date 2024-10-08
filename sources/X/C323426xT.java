package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.6xT  reason: invalid class name and case insensitive filesystem */
public final class C323426xT implements C323436xU, AnonymousClass0lh {
    public IgFundedIncentive A00;
    public MultiProductComponent A01;
    public Integer A02 = AnonymousClass05K.A00;
    public String A03;
    public LinkedHashMap A04;
    public LinkedHashMap A05;
    public final UserSession A06;
    public final C323486xZ A07;
    public final 1wn A08;
    public final 1wn A09;
    public final C323476xY A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(com.instagram.user.model.Product r8) {
        /*
            r7 = this;
            r6 = 0
            if (r8 == 0) goto L_0x0087
            com.instagram.user.model.User r0 = r8.A0B
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            r1.getClass()
            X.6xZ r0 = r7.A07
            X.Vky r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x0087
            X.VvF r0 = r0.A00()
            r0.A00()
            java.util.ArrayList r0 = r0.A00()
            java.util.Iterator r5 = r0.iterator()
        L_0x0023:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r4 = r5.next()
            com.instagram.user.model.Product r4 = (com.instagram.user.model.Product) r4
            java.lang.String r1 = r4.A0H
            java.lang.String r0 = r8.A0H
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0086
            java.lang.String r1 = r4.A0J
            java.lang.String r0 = r8.A0J
            boolean r0 = X.2Ob.A00(r1, r0)
            if (r0 == 0) goto L_0x0023
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r4.A01
            java.lang.Boolean r0 = r0.A0K
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            boolean r1 = X.0qQ.A0K(r0, r2)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r8.A01
            java.lang.Boolean r0 = r0.A0K
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r1 != r0) goto L_0x0023
            java.util.List r0 = r4.A0O
            if (r0 == 0) goto L_0x0023
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r2 = r1.next()
            com.instagram.api.schemas.ProductVariantPossibleValueDictIntf r2 = (com.instagram.api.schemas.ProductVariantPossibleValueDictIntf) r2
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r1 = com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle.THUMBNAIL
            com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle r0 = r2.CFr()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = r2.getId()
            r8.A02(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0086:
            return r3
        L_0x0087:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323426xT.A08(com.instagram.user.model.Product):boolean");
    }

    public static C323426xT A00(UserSession userSession) {
        return (C323426xT) userSession.A01(C323426xT.class, new C323446xV(userSession));
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.CvZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        if (r17 != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C18071Vky r13, X.C323426xT r14, X.C16508Uw5 r15, java.lang.String r16, boolean r17) {
        /*
            com.instagram.common.session.UserSession r0 = r14.A06
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)
            if (r13 != 0) goto L_0x00ca
            r8 = 0
        L_0x0009:
            X.6xZ r1 = r14.A07
            java.lang.String r10 = r1.A01
            r9 = r16
            java.lang.String r11 = r1.A09(r9)
            r12 = 1
            X.6yO r6 = new X.6yO
            r7 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.A00(r6)
            java.util.LinkedHashMap r6 = r14.A04
            java.util.LinkedHashMap r8 = r14.A05
            if (r8 == 0) goto L_0x0046
            if (r6 == 0) goto L_0x0046
            if (r13 == 0) goto L_0x0046
            X.VvF r0 = r13.A03
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0046
            X.VvF r7 = r13.A00()
            int r0 = r7.A00
            r5 = r17
            if (r0 != 0) goto L_0x0047
            r8.remove(r9)
            r6.remove(r9)
        L_0x003d:
            X.Uw5 r1 = X.C16508Uw5.LOADED
            X.CG7 r0 = r14.A03()
            A02(r0, r14, r1, r5)
        L_0x0046:
            return
        L_0x0047:
            boolean r0 = r8.containsKey(r9)
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r6.containsKey(r9)
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r1 = r8.get(r9)
            r1.getClass()
            X.CvZ r1 = (X.C45393CvZ) r1
            int r0 = r7.A00
            r1.A00 = r0
            r6.put(r9, r7)
            if (r17 == 0) goto L_0x003d
        L_0x0065:
            java.util.LinkedHashMap r0 = r14.A05
            r0.getClass()
            java.util.LinkedHashMap r0 = r14.A04
            r0.getClass()
            java.util.LinkedHashMap r0 = r14.A05
            int r0 = r0.size()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            java.util.LinkedHashMap r0 = r14.A04
            int r0 = r0.size()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.LinkedHashMap r0 = r14.A05
            java.lang.Object r0 = r0.remove(r9)
            r2.put(r9, r0)
            java.util.LinkedHashMap r0 = r14.A05
            r2.putAll(r0)
            java.util.LinkedHashMap r0 = r14.A04
            java.lang.Object r0 = r0.remove(r9)
            r1.put(r9, r0)
            java.util.LinkedHashMap r0 = r14.A04
            r1.putAll(r0)
            r14.A05 = r2
            r14.A04 = r1
            goto L_0x003d
        L_0x00a6:
            com.instagram.user.model.User r4 = r7.A05
            int r3 = r7.A00
            java.lang.String r2 = r1.A01
            r2.getClass()
            java.lang.String r1 = r1.A09(r9)
            r1.getClass()
            X.CvZ r0 = new X.CvZ
            r0.<init>()
            r0.A01 = r4
            r0.A00 = r3
            r0.A02 = r2
            r0.A03 = r1
            r8.put(r9, r0)
            r6.put(r9, r7)
            goto L_0x0065
        L_0x00ca:
            X.VvF r8 = r13.A00()
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323426xT.A01(X.Vky, X.6xT, X.Uw5, java.lang.String, boolean):void");
    }

    public static void A02(CG7 cg7, C323426xT r3, C16508Uw5 uw5, boolean z) {
        AnonymousClass1Nd.A00(r3.A06).A00(new WQN(cg7, uw5, z));
    }

    public final CG7 A03() {
        List singletonList;
        LinkedHashMap linkedHashMap = this.A05;
        if (linkedHashMap == null || this.A04 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        ArrayList arrayList2 = new ArrayList(this.A04.values());
        MultiProductComponent multiProductComponent = this.A01;
        if (multiProductComponent == null) {
            singletonList = new ArrayList();
        } else {
            singletonList = Collections.singletonList(multiProductComponent);
        }
        IgFundedIncentive igFundedIncentive = this.A00;
        0qQ.A0B(singletonList, 3);
        1XQ r5 = new 1XQ();
        r5.A02 = new ArrayList();
        r5.A01 = new ArrayList();
        r5.A02 = arrayList;
        r5.A01 = arrayList2;
        r5.A03 = singletonList;
        r5.A00 = igFundedIncentive;
        return r5;
    }

    public final C18622VvF A04(String str) {
        C323486xZ r6 = this.A07;
        0qQ.A0B(str, 0);
        Object obj = r6.A0A.get(str);
        C16508Uw5 uw5 = C16508Uw5.LOADING;
        if (obj != uw5) {
            r6.A0E(uw5, str);
            C323476xY r5 = this.A0A;
            UserSession userSession = this.A06;
            C15605UfX ufX = new C15605UfX(this, str);
            0qQ.A0B(userSession, 0);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            1NY r2 = new 1NY(userSession, -2);
            r2.A0A("commerce/bag/");
            r2.A05();
            r2.A0G("merchant_ids", jSONArray.toString());
            r2.A0Q(CG8.class, D2Y.class);
            1OC A0M = r2.A0M();
            A0M.A00 = new C15616Ufi(ufX, A0M, r5);
            1ES.A03(A0M);
        }
        C18071Vky A062 = r6.A06(str);
        if (A062 == null) {
            return null;
        }
        return A062.A00();
    }

    public final C18622VvF A05(String str) {
        C18071Vky A062 = this.A07.A06(str);
        if (A062 != null) {
            return A062.A00();
        }
        return A04(str);
    }

    public final Integer A06() {
        C323486xZ r7 = this.A07;
        if (r7.A00 == -2) {
            r7.A00 = -1;
            C323476xY r6 = r7.A08;
            UserSession userSession = r7.A05;
            C15575Uf3 uf3 = new C15575Uf3(r7);
            1NY r2 = new 1NY(userSession, -2);
            r2.A0A("commerce/bag/count/");
            r2.A08(AnonymousClass05K.A0N);
            r2.A0O((15p) null, UXN.class, C18256VoN.class, false);
            1OC A0M = r2.A0M();
            A0M.A00 = new C15616Ufi(uf3, A0M, r6);
            1ES.A03(A0M);
        }
        int i = r7.A00;
        if (i >= 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    public final void A07(C17827Vgg vgg) {
        C323476xY r5 = this.A0A;
        UserSession userSession = this.A06;
        C15588UfG ufG = new C15588UfG(vgg, this);
        0qQ.A0B(userSession, 0);
        1NY r2 = new 1NY(userSession, -2);
        r2.A0A("commerce/bag/index/");
        r2.A05();
        r2.A0Q(CG7.class, D2X.class);
        1OC A0M = r2.A0M();
        A0M.A00 = new C15616Ufi(ufG, A0M, r5);
        1ES.A03(A0M);
        if (this.A05 != null && this.A04 != null) {
            A02(A03(), this, C16508Uw5.LOADED, false);
        }
    }

    public final void D1H(C18071Vky vky, String str) {
        A01(vky, this, C16508Uw5.LOADED, str, true);
    }

    public final void DsL(int i) {
        AnonymousClass1Nd.A00(this.A06).A00(new C323956yN(HLL.NATIVE, i));
    }

    public final void onSessionWillEnd() {
        1Ng A002 = AnonymousClass1Nd.A00(this.A06);
        A002.A02(this.A09, AnonymousClass3DT.class);
        A002.A02(this.A08, C323526xd.class);
        this.A07.A0B();
    }

    public C323426xT(UserSession userSession) {
        C323456xW r3 = new C323456xW(this);
        this.A09 = r3;
        C323466xX r2 = new C323466xX(this);
        this.A08 = r2;
        this.A06 = userSession;
        C323476xY r1 = new C323476xY();
        this.A0A = r1;
        this.A07 = new C323486xZ(userSession, this, r1);
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        A002.A01(r3, AnonymousClass3DT.class);
        A002.A01(r2, C323526xd.class);
    }
}
