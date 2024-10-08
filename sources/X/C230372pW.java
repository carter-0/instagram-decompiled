package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2pW  reason: invalid class name and case insensitive filesystem */
public abstract class C230372pW implements C250603lj {
    public final long A00;
    public final 1Bk A01;
    public final C229312nB A02;
    public final C229222n2 A03;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.2n2] */
    public C230372pW(1Bk r8) {
        C229312nB r6 = new C229312nB(r8, C61410nE.A00);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(1);
        ? obj = new Object();
        this.A02 = r6;
        this.A00 = r8.A0G("override_staleTime_in_testMode", false) ? timeUnit.toMillis(0) : millis;
        this.A01 = r8;
        this.A03 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0333, code lost:
        if (r0 != null) goto L_0x0335;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0691  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0b26  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.Object r23, java.lang.Object r24) {
        /*
            r22 = this;
            r1 = r22
            r3 = r24
            r11 = r23
            boolean r0 = r1 instanceof X.C234662yQ
            if (r0 == 0) goto L_0x008e
            r7 = r1
            X.2yQ r7 = (X.C234662yQ) r7
            X.1Xj r11 = (X.1Xj) r11
            X.4HA r3 = (X.AnonymousClass4HA) r3
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r15 = 1
            X.0qQ.A0B(r3, r15)
            X.3W1 r4 = r3.A01
            X.1sy r1 = r4.A0o
            X.1sy r0 = X.1sy.A0A
            if (r1 != r0) goto L_0x0034
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.String r6 = X.C231122qu.A07(r0, r11)
            if (r6 == 0) goto L_0x0034
            X.2yG r5 = r7.A03
            X.2pg r2 = X.C230472pg.SPONSORED
            X.2v9 r1 = X.C233162v9.SEEN_STATE
            X.2pc r0 = X.C230432pc.EXPLORE
            r5.EGR(r2, r1, r0, r6)
        L_0x0034:
            com.instagram.common.session.UserSession r9 = r7.A00
            int r14 = r3.A00
            X.4DU r12 = r7.A02
            X.2uY r1 = r7.A01
            r0 = 5
            X.0qQ.A0B(r1, r0)
            int r21 = r4.getPosition()
            java.lang.String r19 = "impression"
            r17 = r11
            r18 = r12
            r20 = r14
            r16 = r1
            X.3sc r10 = r16.A03(r17, r18, r19, r20, r21)
            if (r10 == 0) goto L_0x008d
            r10.A03()
            boolean r0 = X.C231122qu.A0R(r9, r11)
            r10.A8B = r0
            r10.A02()
            boolean r0 = r4.A2R
            r10.A8A = r0
            java.util.HashMap r0 = X.C254453sV.A00(r9)
            r10.A89 = r0
            boolean r0 = X.C228342lQ.A02(r9)
            if (r0 == 0) goto L_0x0088
            X.1Av r0 = X.1Au.A00(r9)
            X.1Az r0 = X.C228342lQ.A01(r0)
            java.lang.String r0 = r0.toString()
            r10.A4X = r0
            X.1Az r0 = X.C228342lQ.A00(r9)
            java.lang.String r0 = r0.toString()
            r10.A4Y = r0
        L_0x0088:
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.C233822wX.A0F(r9, r10, r11, r12, r13, r14, r15)
        L_0x008d:
            return
        L_0x008e:
            boolean r0 = r1 instanceof X.C235272ze
            if (r0 == 0) goto L_0x010c
            r2 = r1
            X.2ze r2 = (X.C235272ze) r2
            X.1Xj r11 = (X.1Xj) r11
            r13 = 0
            X.0qQ.A0B(r11, r13)
            com.instagram.common.session.UserSession r10 = r2.A01
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323672293715326(0x810c3000012d7e, double:3.034574850009403E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 == 0) goto L_0x0103
            X.1Xy r0 = r11.A0C
            java.util.List r1 = r0.Alu()
            if (r1 == 0) goto L_0x0103
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0103
            java.lang.Object r0 = r1.get(r13)
            X.1Xj r0 = (X.1Xj) r0
            java.util.List r0 = r0.A3P()
            r3 = 0
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            X.3kF r7 = X.C249713kF.A00
            X.0qQ.A07(r7)
            if (r0 == 0) goto L_0x010a
            java.lang.String r3 = r0.Avj()
            X.47L r1 = X.C271714jT.A01(r0)
        L_0x00d8:
            X.47L r0 = X.AnonymousClass47L.IG_DESTINATION_BLOKS
            if (r1 != r0) goto L_0x0103
            if (r3 == 0) goto L_0x0103
            X.0bY r1 = X.C235272ze.A03
            android.net.Uri r8 = X.0cp.A00(r1, r3)
            java.lang.String r0 = X.C235272ze.A04
            java.lang.String r1 = r7.A0Z(r8, r1, r0)
            if (r8 == 0) goto L_0x0103
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0103
            androidx.fragment.app.FragmentActivity r9 = r2.A00
            X.4DU r12 = r2.A02
            X.W2P r0 = r7.A0M(r8, r9, r10, r11, r12, r13)
            r0.A04()
        L_0x0103:
            X.C235272ze.A00(r11, r2)
            X.C235272ze.A01(r11, r2)
            return
        L_0x010a:
            r1 = r3
            goto L_0x00d8
        L_0x010c:
            boolean r0 = r1 instanceof X.C235102zH
            if (r0 == 0) goto L_0x0123
            r0 = r1
            X.2zH r0 = (X.C235102zH) r0
            X.1Xj r11 = (X.1Xj) r11
            r3 = 0
            X.0qQ.A0B(r11, r3)
            com.instagram.common.session.UserSession r2 = r0.A00
            X.4DU r1 = r0.A01
            java.lang.String r0 = "on_impression"
            X.I7O.A08(r1, r2, r11, r0, r3)
            return
        L_0x0123:
            boolean r0 = r1 instanceof X.C262884Gj
            if (r0 == 0) goto L_0x015c
            r2 = r1
            X.4Gj r2 = (X.C262884Gj) r2
            X.1Xj r11 = (X.1Xj) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            com.instagram.common.session.UserSession r4 = r2.A00
            X.1Xj r0 = r11.A1e(r4)
            boolean r0 = r0.CcK()
            if (r0 == 0) goto L_0x0b0e
            X.4DU r3 = r2.A01
            r2 = 0
            java.lang.String r1 = "tags_list_entry_point_impression"
            java.lang.String r0 = "instagram_ad_"
            java.lang.String r0 = X.002.A0R(r0, r1)
            X.3sc r1 = new X.3sc
            r1.<init>(r3, r0)
            r1.A0G(r4, r11)
            r1.A6S = r2
            java.lang.String r0 = "shopping"
            r1.A4J = r0
            r1.A02()
            X.C18694Vws.A00(r4, r1, r11, r3)
            return
        L_0x015c:
            boolean r0 = r1 instanceof X.AnonymousClass32O
            if (r0 == 0) goto L_0x01c9
            r2 = r1
            X.32O r2 = (X.AnonymousClass32O) r2
            X.1Xj r11 = (X.1Xj) r11
            r3 = 0
            X.0qQ.A0B(r11, r3)
            X.4DU r12 = r2.A02
            com.instagram.common.session.UserSession r10 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass3YA.A00(r10, r11, r12)
            java.lang.String r13 = X.C16944VBw.A00(r0)
            java.lang.String r14 = r2.A05
            java.lang.String r15 = r2.A06
            java.lang.String r1 = r2.A04
            boolean r0 = r2.A07
            r17 = r3
            r18 = r0
            r16 = r1
            X.W3r.A0B(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.2rR r4 = r2.A03
            if (r4 == 0) goto L_0x008d
            X.0Tu r3 = X.0Tu.A06
            r0 = 36323672293911935(0x810c3000042d7f, double:3.0345748501337393E-306)
            boolean r0 = X.182.A06(r3, r10, r0)
            if (r0 == 0) goto L_0x008d
            X.3YH r3 = X.VKF.A00
            r1 = 1
            java.util.List r0 = r3.A04(r11)
            int r0 = r0.size()
            if (r0 > r1) goto L_0x008d
            java.util.List r0 = r3.A04(r11)
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x008d
            X.3kF r1 = X.C249713kF.A00
            X.3W1 r6 = r4.BQr(r11)
            androidx.fragment.app.FragmentActivity r2 = r2.A00
            java.lang.String r8 = "cta_bar"
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r0
            r9 = r14
            X.W2P r0 = r1.A0O(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x008d
            r0.A04()
            return
        L_0x01c9:
            boolean r0 = r1 instanceof X.C235252zc
            if (r0 == 0) goto L_0x03cd
            X.2zc r1 = (X.C235252zc) r1
            X.1Xj r11 = (X.1Xj) r11
            r6 = 0
            X.0qQ.A0B(r11, r6)
            java.util.List r0 = r11.A3P()
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            X.3kF r8 = X.C249713kF.A00
            X.0qQ.A07(r8)
            r5 = 0
            if (r0 == 0) goto L_0x03c9
            java.lang.String r3 = r0.Avj()
            X.47L r2 = X.C271714jT.A01(r0)
        L_0x01ef:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_ORGANIC_COLLECTION
            if (r2 != r0) goto L_0x027a
            if (r3 == 0) goto L_0x027a
            X.0bY r2 = X.C235252zc.A04
            android.net.Uri r4 = X.0cp.A00(r2, r3)
            java.lang.String r0 = X.C235252zc.A05
            java.lang.String r2 = r8.A0Z(r4, r2, r0)
            if (r4 == 0) goto L_0x027a
            r0 = 130(0x82, float:1.82E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x027a
            com.instagram.common.session.UserSession r7 = r1.A02
            X.0Tu r0 = X.0Tu.A05
            r2 = 36316783166165633(0x8105ec00011281, double:3.030218138006687E-306)
            boolean r0 = X.182.A06(r0, r7, r2)
            if (r0 == 0) goto L_0x027a
            r0 = 77
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r2 = r4.getQueryParameter(r0)
            if (r2 == 0) goto L_0x0b16
            java.lang.String r0 = "title"
            java.lang.String r3 = r4.getQueryParameter(r0)
            androidx.fragment.app.FragmentActivity r0 = r1.A01
            X.S54 r2 = r8.A0S(r0, r7, r2)
            java.lang.String r0 = "ad_id"
            java.lang.String r0 = r4.getQueryParameter(r0)
            r2.A00 = r0
            r0 = 44
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = r4.getQueryParameter(r0)
            r2.A01 = r0
            java.lang.String r0 = r11.getId()
            r2.A02 = r0
            r0 = 346(0x15a, float:4.85E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r4.getQueryParameter(r0)
            r2.A01(r0)
            X.4DU r0 = r1.A03
            java.lang.String r0 = r0.getModuleName()
            r2.A03 = r0
            java.lang.String r0 = "shopping_session_id"
            java.lang.String r0 = r4.getQueryParameter(r0)
            r2.A04 = r0
            r2.A05 = r3
            java.lang.String r0 = "tracking_token"
            java.lang.String r0 = r4.getQueryParameter(r0)
            r2.A06 = r0
            r2.A00()
        L_0x027a:
            com.instagram.common.session.UserSession r7 = r1.A02
            X.0Tu r4 = X.0Tu.A05
            r2 = 36316053021724550(0x81054200010f86, double:3.0297563917220905E-306)
            boolean r0 = X.182.A06(r4, r7, r2)
            if (r0 == 0) goto L_0x02d4
            java.util.List r0 = r11.A3P()
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            X.3kF r12 = X.C249713kF.A00
            X.0qQ.A07(r12)
            if (r0 == 0) goto L_0x03c5
            java.lang.String r3 = r0.Avj()
            X.47L r2 = X.C271714jT.A01(r0)
        L_0x02a2:
            X.47L r0 = X.AnonymousClass47L.IG_DESTINATION_BLOKS
            if (r2 != r0) goto L_0x02d4
            if (r3 == 0) goto L_0x02d4
            X.0bY r2 = X.C235252zc.A04
            android.net.Uri r13 = X.0cp.A00(r2, r3)
            java.lang.String r0 = X.C235252zc.A05
            java.lang.String r2 = r12.A0Z(r13, r2, r0)
            if (r13 == 0) goto L_0x02d4
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x02d4
            androidx.fragment.app.FragmentActivity r14 = r1.A01
            X.4DU r0 = r1.A03
            r15 = r7
            r16 = r11
            r17 = r0
            r18 = r6
            X.W2P r0 = r12.A0M(r13, r14, r15, r16, r17, r18)
            r0.A04()
        L_0x02d4:
            r2 = 2342155196766159830(0x208101be001503d6, double:4.058961587439773E-152)
            boolean r0 = X.182.A06(r4, r7, r2)
            if (r0 == 0) goto L_0x0359
            java.util.List r0 = r11.A3P()
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            r2 = 1
            if (r0 != 0) goto L_0x0335
            boolean r0 = r11.A5D()
            if (r0 == 0) goto L_0x03c1
            X.1Xy r0 = r11.A0C
            java.util.List r0 = r0.Alu()
            if (r0 == 0) goto L_0x03c1
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L_0x03c1
            X.1Xy r0 = r11.A0C
            java.util.List r0 = r0.Alu()
            if (r0 != 0) goto L_0x030f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x030f:
            java.util.Iterator r3 = r0.iterator()
        L_0x0313:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03c1
            java.lang.Object r2 = r3.next()
            X.1Xj r2 = (X.1Xj) r2
            java.util.List r0 = r2.A3P()
            java.lang.Object r0 = X.00k.A0J(r0)
            if (r0 == 0) goto L_0x0313
            java.util.List r0 = r2.A3P()
            java.lang.Object r0 = X.00k.A0I(r0)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x03c1
        L_0x0335:
            java.lang.String r3 = r0.Avj()
            X.47L r2 = X.C271714jT.A01(r0)
        L_0x033d:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_SHOPPING_PDP
            if (r2 != r0) goto L_0x0359
            if (r3 == 0) goto L_0x0359
            X.0bY r0 = X.C235252zc.A04
            android.net.Uri r0 = X.0cp.A00(r0, r3)
            if (r0 == 0) goto L_0x0359
            X.3yT r0 = r1.A00
            if (r0 != 0) goto L_0x0356
            X.3yT r0 = new X.3yT
            r0.<init>(r7)
            r1.A00 = r0
        L_0x0356:
            r0.A00(r5)
        L_0x0359:
            r2 = 36330853478974262(0x8112b800004336, double:3.039116260483466E-306)
            boolean r0 = X.182.A06(r4, r7, r2)
            if (r0 == 0) goto L_0x008d
            java.util.List r0 = r11.A3P()
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x008d
            java.lang.String r2 = r0.Avj()
            if (r2 == 0) goto L_0x008d
            X.0bY r0 = X.C235252zc.A04
            android.net.Uri r3 = X.0cp.A00(r0, r2)
            if (r3 == 0) goto L_0x008d
            boolean r0 = r3.isHierarchical()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "app_id"
            java.lang.String r2 = r3.getQueryParameter(r0)
            java.lang.String r0 = "merchant_id"
            java.lang.String r8 = r3.getQueryParameter(r0)
            java.lang.String r0 = "ad_id"
            java.lang.String r9 = r3.getQueryParameter(r0)
            java.lang.String r0 = "ad_tracking_token"
            java.lang.String r10 = r3.getQueryParameter(r0)
            java.lang.String r0 = "com.bloks.www.bloks.commerce.cart.singlemerchantcart"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x008d
            if (r8 == 0) goto L_0x008d
            if (r9 == 0) goto L_0x008d
            if (r10 == 0) goto L_0x008d
            X.3kF r4 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r5 = r1.A01
            r0 = 1
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r5, r0)
            X.4DU r0 = r1.A03
            java.lang.String r11 = r0.getModuleName()
            r6 = r5
            r4.A0d(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x03c1:
            r3 = r5
            r2 = r5
            goto L_0x033d
        L_0x03c5:
            r3 = r5
            r2 = r5
            goto L_0x02a2
        L_0x03c9:
            r3 = r5
            r2 = r5
            goto L_0x01ef
        L_0x03cd:
            boolean r0 = r1 instanceof X.AnonymousClass32R
            if (r0 == 0) goto L_0x0559
            X.32R r1 = (X.AnonymousClass32R) r1
            X.Trb r11 = (X.C14196Trb) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r7 = r3.intValue()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.1Xj r4 = r11.A00
            com.instagram.common.session.UserSession r3 = r1.A00
            X.4DU r0 = r1.A01
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r3)
            r0 = 309(0x135, float:4.33E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            X.0kJ r0 = r2.A00
            X.0Aj r10 = r2.A00(r0, r1)
            boolean r0 = r10.isSampled()
            if (r0 == 0) goto L_0x008d
            r0 = 3
            int r6 = r7 / r0
            int r7 = r7 % r0
            boolean r0 = r4.A5Y()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_igtv"
            r10.A7p(r0, r1)
            r2 = 0
            java.lang.String r0 = "is_top_post"
            r10.A7p(r0, r2)
            java.lang.String r1 = r4.getId()
            java.lang.String r0 = "id"
            r10.AAJ(r0, r1)
            java.lang.String r0 = r4.A30()
            if (r0 == 0) goto L_0x0b1e
            r5 = 10
            java.lang.Long r1 = X.00y.A0n(r5, r0)
            java.lang.String r0 = "media_id"
            r10.A9F(r0, r1)
            X.1iA r0 = r4.BR7()
            X.5wb r1 = r0.A00()
            java.lang.String r0 = "media_type"
            r10.A8M(r1, r0)
            java.lang.String r1 = X.C320166rs.A01(r6, r7)
            java.lang.String r0 = "position"
            r10.AAJ(r0, r1)
            java.lang.String r1 = r4.getId()
            java.lang.String r0 = "m_pk"
            r10.AAJ(r0, r1)
            java.lang.Long r1 = r11.A02
            r0 = 965(0x3c5, float:1.352E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r10.A9F(r0, r1)
            X.1Xy r0 = r4.A0C
            java.lang.String r1 = r0.getMezqlToken()
            java.lang.String r0 = "mezql_token"
            r10.AAJ(r0, r1)
            java.util.List r1 = r4.A3g()
            java.lang.String r0 = "product_ids"
            r10.AAe(r0, r1)
            java.util.ArrayList r1 = r4.A3C()
            if (r1 == 0) goto L_0x048f
            int r0 = X.0Yv.A1E(r1, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x047d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0490
            java.lang.Object r0 = r1.next()
            X.4Ny r0 = (X.C263944Ny) r0
            java.lang.Long r0 = r0.A00
            r5.add(r0)
            goto L_0x047d
        L_0x048f:
            r5 = r2
        L_0x0490:
            r0 = 167(0xa7, float:2.34E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r10.AAe(r0, r5)
            X.1Xy r0 = r4.A0C
            java.lang.String r1 = r0.getLoggingInfoToken()
            java.lang.String r0 = "ranking_info_token"
            r10.AAJ(r0, r1)
            boolean r0 = r11.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_video_feed_preview"
            r10.A7p(r0, r1)
            java.lang.Integer r0 = r11.A01
            if (r0 == 0) goto L_0x04ea
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x04bc:
            r0 = 1689(0x699, float:2.367E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A9F(r0, r1)
            java.lang.String r1 = r11.A03
            r0 = 1686(0x696, float:2.363E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.AAJ(r0, r1)
            X.1Xy r0 = r4.A0C
            X.DUF r0 = r0.Anr()
            if (r0 == 0) goto L_0x04e8
            java.lang.String r1 = r0.getAttributionAppId()
        L_0x04dc:
            java.lang.String r0 = "app_attribution_id"
            r10.AAJ(r0, r1)
            com.instagram.user.model.User r3 = r4.A2A(r3)
            if (r3 == 0) goto L_0x0509
            goto L_0x04ec
        L_0x04e8:
            r1 = r2
            goto L_0x04dc
        L_0x04ea:
            r1 = r2
            goto L_0x04bc
        L_0x04ec:
            java.lang.String r0 = r3.getId()     // Catch:{ NumberFormatException -> 0x04f5 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x04f5 }
            goto L_0x04f7
        L_0x04f5:
            r0 = -1
        L_0x04f7:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "entity_id"
            r10.A9F(r0, r1)
            java.lang.String r1 = r3.getUsername()
            java.lang.String r0 = "entity_name"
            r10.AAJ(r0, r1)
        L_0x0509:
            X.1Xy r0 = r4.A0C
            X.DTA r3 = r0.Anl()
            if (r3 == 0) goto L_0x052f
            X.B8u r2 = new X.B8u
            r2.<init>()
            com.instagram.api.schemas.ClipChainType r0 = r3.Ans()
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "chain_type"
            r2.A06(r0, r1)
            int r0 = r3.Anm()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "clip_count"
            r2.A05(r0, r1)
        L_0x052f:
            java.lang.String r0 = "clip_chain_metadata"
            r10.AAK(r2, r0)
            java.lang.String r1 = X.AnonymousClass1K6.A00
            java.lang.String r0 = "canonical_nav_chain"
            r10.AAJ(r0, r1)
            java.lang.String r1 = X.C254473sX.A00
            java.lang.String r0 = "device_aspect_ratio_category"
            r10.AAJ(r0, r1)
            java.lang.String r1 = X.C254483sY.A00
            java.lang.String r0 = "device_fold_orientation"
            r10.AAJ(r0, r1)
            java.lang.String r1 = X.C254493sZ.A00
            java.lang.String r0 = "device_fold_state"
            r10.AAJ(r0, r1)
            java.lang.Boolean r1 = X.C254503sa.A00
            java.lang.String r0 = "device_is_in_multi_window_mode"
            r10.A7p(r0, r1)
            goto L_0x07f9
        L_0x0559:
            boolean r0 = r1 instanceof X.C230392pY
            if (r0 == 0) goto L_0x0865
            X.2pY r1 = (X.C230392pY) r1
            X.Gla r11 = (X.C53288Gla) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r9 = r3.intValue()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.2pK r8 = r1.A00
            X.Gz1 r7 = r11.A03
            com.instagram.feed.ui.state.IntentAwareAdPivotState r11 = r11.A01
            X.0qQ.A0B(r7, r0)
            r1 = 1
            X.0qQ.A0B(r11, r1)
            java.lang.String r0 = "impression"
            X.C230282pK.A07(r11, r7, r8, r0, r9)
            X.0wc r3 = r8.A01
            r0 = 3360(0xd20, float:4.708E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            X.0kJ r0 = r3.A00
            X.0Aj r10 = r3.A00(r0, r2)
            boolean r0 = r10.isSampled()
            if (r0 == 0) goto L_0x008d
            java.util.List r0 = r7.A0B
            java.lang.Object r0 = r0.get(r9)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r6 = r0.A00()
            com.instagram.common.session.UserSession r5 = r8.A02
            java.lang.String r4 = X.C231122qu.A07(r5, r6)
            java.lang.String r12 = "Required value was null."
            if (r4 == 0) goto L_0x0b2c
            boolean r0 = r6.A5D()
            r14 = 0
            if (r0 == 0) goto L_0x0862
            X.1Xy r0 = r6.A0C
            java.util.List r0 = r0.Alu()
            if (r0 == 0) goto L_0x085f
            java.lang.Object r2 = X.00k.A0J(r0)
            X.1Xj r2 = (X.1Xj) r2
        L_0x05bc:
            boolean r0 = X.C18222Vnm.A01(r6)
            if (r0 == 0) goto L_0x0832
            X.1Xy r0 = r6.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x082f
            X.3xr r1 = r0.BEi()
        L_0x05ce:
            X.1Xy r0 = r6.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x082c
            X.3xs r0 = r0.BEj()
        L_0x05da:
            if (r1 == 0) goto L_0x081c
            java.lang.Float r14 = r1.AhU()
            java.lang.Float r17 = r1.AhS()
        L_0x05e4:
            r2 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            r0 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            X.Cu7 r13 = new X.Cu7
            r13.<init>(r2, r0)
            if (r14 == 0) goto L_0x0619
            if (r17 == 0) goto L_0x0619
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            float r14 = r14.floatValue()
            float r13 = r17.floatValue()
            float r14 = r14 + r13
            r13 = 1073741824(0x40000000, float:2.0)
            float r14 = r14 / r13
            double r13 = (double) r14
            double r13 = r13 - r15
            r15 = -4631501856787818086(0xbfb999999999999a, double:-0.1)
            r17 = r2
            double r13 = X.C229632nm.A00(r13, r15, r17)
            double r2 = r2 + r13
            double r0 = r0 + r13
        L_0x0614:
            X.Cu7 r13 = new X.Cu7
            r13.<init>(r2, r0)
        L_0x0619:
            long r0 = java.lang.Long.parseLong(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ad_id"
            r10.A9F(r0, r1)
            long r0 = X.C230282pK.A00(r7, r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "chaining_position"
            r10.A9F(r0, r1)
            java.lang.String r1 = r11.A0E
            java.lang.String r0 = "chaining_session_id"
            r10.AAJ(r0, r1)
            X.3kK r0 = r8.A04
            java.lang.String r1 = r0.getSessionId()
            java.lang.String r0 = "client_session_id"
            r10.AAJ(r0, r1)
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "contextual_ads_category"
            r10.AAJ(r0, r1)
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = (long) r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long[] r0 = new java.lang.Long[]{r2, r0}
            java.util.ArrayList r1 = X.0sr.A1M(r0)
            java.lang.String r0 = "position"
            r10.AAe(r0, r1)
            java.lang.String r1 = "feed_timeline"
            java.lang.String r0 = "container_module"
            r10.AAJ(r0, r1)
            com.instagram.api.schemas.ContextualAdResponseExtrasImpl r0 = r7.A00()
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "trigger_type"
            r10.AAJ(r0, r1)
            int r0 = r7.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "multi_ads_type_number"
            r10.A9F(r0, r1)
            java.lang.String r1 = r7.getId()
            java.lang.String r0 = "multi_ads_unit_id"
            r10.AAJ(r0, r1)
            java.lang.String r1 = X.C231122qu.A0F(r5, r6)
            if (r1 == 0) goto L_0x0b26
            java.lang.String r0 = "tracking_token"
            r10.AAJ(r0, r1)
            java.lang.String r0 = r7.A0A
            java.lang.String r1 = X.C241323Ot.A02(r0)
            java.lang.String r0 = "inventory_source"
            r10.AAJ(r0, r1)
            java.lang.Integer r0 = r7.A02()
            r2 = 0
            if (r0 == 0) goto L_0x0819
            java.lang.String r1 = X.C55034Hb5.A00(r0)
        L_0x06ac:
            java.lang.String r0 = "insertion_mechanism"
            r10.AAJ(r0, r1)
            java.lang.Long r1 = r8.A08(r7)
            java.lang.String r0 = "hscroll_seed_ad_id"
            r10.A9F(r0, r1)
            java.lang.Long r1 = X.C230282pK.A04(r7)
            java.lang.String r0 = "hscroll_seed_media_id"
            r10.A9F(r0, r1)
            java.lang.Long r1 = X.C230282pK.A03(r7)
            java.lang.String r0 = "hscroll_seed_media_author_igid"
            r10.A9F(r0, r1)
            X.1Xj r0 = r7.A04
            java.lang.Boolean r1 = X.C230282pK.A02(r5, r0)
            java.lang.String r0 = "is_seed_ad_multi_ads_eligible"
            r10.A7p(r0, r1)
            java.util.Map r3 = r7.A0C
            java.lang.Object r0 = r3.get(r4)
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x0816
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (int) r0
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x06ef:
            java.lang.String r0 = "media_displayed_width"
            r10.A8D(r0, r1)
            java.lang.Object r0 = r3.get(r4)
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x0813
            java.lang.Object r0 = r0.A01
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (int) r0
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x070a:
            java.lang.String r0 = "media_displayed_height"
            r10.A8D(r0, r1)
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "ad_request_id"
            r10.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A2P()
            if (r0 == 0) goto L_0x0810
            java.lang.String r1 = r0.toString()
        L_0x0720:
            java.lang.String r0 = "imp_signature"
            r10.AAJ(r0, r1)
            boolean r0 = X.C18222Vnm.A01(r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_text_cropping_adjustment"
            r10.A7p(r0, r1)
            int r0 = r7.A00
            boolean r0 = X.I7D.A03(r5, r0)
            if (r0 == 0) goto L_0x080d
            com.instagram.api.schemas.SocialContextType r1 = X.C18222Vnm.A00(r6)
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.FOLLOWED_BY
            if (r1 != r0) goto L_0x080d
            com.instagram.api.schemas.SocialContextType r0 = X.C18222Vnm.A00(r6)
            if (r0 == 0) goto L_0x080d
            java.lang.String r1 = r0.A00
        L_0x074a:
            java.lang.String r0 = "social_context_type"
            r10.AAJ(r0, r1)
            X.3xs r0 = X.C230282pK.A01(r6)
            if (r0 == 0) goto L_0x080a
            java.lang.Float r0 = r0.AhU()
            if (r0 == 0) goto L_0x080a
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0764:
            java.lang.String r0 = "text_bounding_box_top_left_x"
            r10.A8D(r0, r1)
            X.3xs r0 = X.C230282pK.A01(r6)
            if (r0 == 0) goto L_0x0807
            java.lang.Float r0 = r0.AhV()
            if (r0 == 0) goto L_0x0807
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x077e:
            java.lang.String r0 = "text_bounding_box_top_left_y"
            r10.A8D(r0, r1)
            X.3xs r0 = X.C230282pK.A01(r6)
            if (r0 == 0) goto L_0x0805
            java.lang.Float r0 = r0.AhS()
            if (r0 == 0) goto L_0x0805
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0798:
            java.lang.String r0 = "text_bounding_box_bottom_right_x"
            r10.A8D(r0, r1)
            X.3xs r0 = X.C230282pK.A01(r6)
            if (r0 == 0) goto L_0x0803
            java.lang.Float r0 = r0.AhT()
            if (r0 == 0) goto L_0x0803
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x07b2:
            java.lang.String r0 = "text_bounding_box_bottom_right_y"
            r10.A8D(r0, r1)
            if (r13 == 0) goto L_0x0801
            double r0 = r13.A01
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x07bf:
            java.lang.String r0 = "media_bounding_box_top_left_x"
            r10.A8D(r0, r1)
            if (r13 == 0) goto L_0x07ff
            r0 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x07cc:
            java.lang.String r0 = "media_bounding_box_top_left_y"
            r10.A8D(r0, r1)
            if (r13 == 0) goto L_0x07fd
            double r0 = r13.A00
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x07d9:
            java.lang.String r0 = "media_bounding_box_bottom_right_x"
            r10.A8D(r0, r1)
            if (r13 == 0) goto L_0x07e6
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
        L_0x07e6:
            java.lang.String r0 = "media_bounding_box_bottom_right_y"
            r10.A8D(r0, r2)
            float r0 = r6.A0l()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "client_rendering_media_aspect_ratio"
            r10.A8D(r0, r1)
        L_0x07f9:
            r10.Cgf()
            return
        L_0x07fd:
            r1 = r2
            goto L_0x07d9
        L_0x07ff:
            r1 = r2
            goto L_0x07cc
        L_0x0801:
            r1 = r2
            goto L_0x07bf
        L_0x0803:
            r1 = r2
            goto L_0x07b2
        L_0x0805:
            r1 = r2
            goto L_0x0798
        L_0x0807:
            r1 = r2
            goto L_0x077e
        L_0x080a:
            r1 = r2
            goto L_0x0764
        L_0x080d:
            r1 = r2
            goto L_0x074a
        L_0x0810:
            r1 = r2
            goto L_0x0720
        L_0x0813:
            r1 = r2
            goto L_0x070a
        L_0x0816:
            r1 = r2
            goto L_0x06ef
        L_0x0819:
            r1 = r2
            goto L_0x06ac
        L_0x081c:
            if (r0 == 0) goto L_0x0828
            java.lang.Float r14 = r0.AhU()
            java.lang.Float r17 = r0.AhS()
            goto L_0x05e4
        L_0x0828:
            r17 = r14
            goto L_0x05e4
        L_0x082c:
            r0 = r14
            goto L_0x05da
        L_0x082f:
            r1 = r14
            goto L_0x05ce
        L_0x0832:
            if (r2 == 0) goto L_0x085c
            boolean r0 = r2.A5p()
            if (r0 != r1) goto L_0x085c
            float r1 = r2.A0l()
            r0 = 1063675494(0x3f666666, float:0.9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x085c
            float r1 = r2.A0l()
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x085c
            r2 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            r0 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            goto L_0x0614
        L_0x085c:
            r13 = r14
            goto L_0x0619
        L_0x085f:
            r2 = r14
            goto L_0x05bc
        L_0x0862:
            r2 = r6
            goto L_0x05bc
        L_0x0865:
            boolean r0 = r1 instanceof X.AnonymousClass32Y
            if (r0 == 0) goto L_0x087a
            X.32Y r1 = (X.AnonymousClass32Y) r1
            X.1Xj r11 = (X.1Xj) r11
            java.lang.Number r3 = (java.lang.Number) r3
            r3.intValue()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.AnonymousClass32Y.A00(r1, r11)
            return
        L_0x087a:
            boolean r0 = r1 instanceof X.C230362pV
            if (r0 == 0) goto L_0x094c
            X.2pV r1 = (X.C230362pV) r1
            X.Gla r11 = (X.C53288Gla) r11
            java.lang.Number r3 = (java.lang.Number) r3
            r3.intValue()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.2pK r5 = r1.A00
            X.Gz1 r6 = r11.A03
            com.instagram.feed.ui.state.IntentAwareAdPivotState r3 = r11.A01
            X.0qQ.A0B(r6, r0)
            r9 = 1
            X.0qQ.A0B(r3, r9)
            long r7 = X.C230282pK.A00(r6, r5)
            X.0wc r2 = r5.A01
            r0 = 758(0x2f6, float:1.062E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x008d
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = "chaining_position"
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A0E
            java.lang.String r0 = "chaining_session_id"
            r2.AAJ(r0, r1)
            X.3kK r0 = r5.A04
            java.lang.String r1 = r0.getSessionId()
            java.lang.String r0 = "client_session_id"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r6.A09
            java.lang.String r0 = "contextual_ads_category"
            r2.AAJ(r0, r1)
            java.util.List r1 = X.C230282pK.A06(r6, r5)
            java.lang.String r0 = "ad_ids"
            r2.AAe(r0, r1)
            com.instagram.common.session.UserSession r4 = r5.A02
            java.util.List r0 = r6.A0B
            java.lang.Object r0 = X.00k.A0I(r0)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r0 = r0.A00()
            java.lang.String r0 = X.C231122qu.A07(r4, r0)
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0b38
            r10 = 10
            java.lang.Long r1 = X.00y.A0n(r10, r0)
            java.lang.String r0 = "first_hscroll_item_ad_id"
            r2.A9F(r0, r1)
            java.lang.String r1 = "feed_timeline"
            java.lang.String r0 = "container_module"
            r2.AAJ(r0, r1)
            com.instagram.api.schemas.ContextualAdResponseExtrasImpl r0 = r6.A00()
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "trigger_type"
            r2.AAJ(r0, r1)
            int r0 = r6.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "multi_ads_type_number"
            r2.A9F(r0, r1)
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = "multi_ads_unit_id"
            r2.AAJ(r0, r1)
            java.util.List r1 = r6.A0B
            int r0 = X.0Yv.A1E(r1, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0932:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0b3e
            java.lang.Object r0 = r1.next()
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r0 = r0.A00()
            java.lang.String r0 = X.C231122qu.A0F(r4, r0)
            if (r0 == 0) goto L_0x0b32
            r10.add(r0)
            goto L_0x0932
        L_0x094c:
            boolean r0 = r1 instanceof X.C230602pt
            if (r0 == 0) goto L_0x095b
            r0 = r1
            X.2pt r0 = (X.C230602pt) r0
            X.JR4 r0 = r0.A00
            if (r0 == 0) goto L_0x0ce0
            r0.Cis()
            return
        L_0x095b:
            boolean r0 = r1 instanceof X.C231102qs
            if (r0 == 0) goto L_0x09f4
            X.2qs r1 = (X.C231102qs) r1
            X.V3X r11 = (X.V3X) r11
            X.VZd r3 = (X.C17524VZd) r3
            r5 = 0
            X.0qQ.A0B(r11, r5)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            com.instagram.model.shopping.productfeed.ProductFeedItem r4 = r11.A00
            X.4dH r7 = r3.A02
            X.2qt r2 = r1.A00
            java.lang.String r1 = r4.getId()
            java.util.Map r0 = r3.A04
            java.lang.Object r0 = r0.get(r1)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            X.VWb r6 = new X.VWb
            r6.<init>(r4, r2, r5, r0)
            X.1Ln r5 = r6.A01
            X.UzB r0 = r7.B5W()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "product_collection_type"
            r5.A0R(r0, r1)
            java.lang.String r0 = r7.Bxn()
            if (r0 == 0) goto L_0x09a3
            r5.A0m(r0)
        L_0x09a3:
            java.lang.String r1 = r7.Bxr()
            if (r1 == 0) goto L_0x09ae
            java.lang.String r0 = "source_media_type"
            r5.A0R(r0, r1)
        L_0x09ae:
            boolean r0 = r7 instanceof com.instagram.model.shopping.productfeed.MultiProductComponent
            if (r0 == 0) goto L_0x09be
            r0 = r7
            com.instagram.model.shopping.productfeed.MultiProductComponent r0 = (com.instagram.model.shopping.productfeed.MultiProductComponent) r0
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "submodule"
            r5.A0R(r0, r1)
        L_0x09be:
            java.lang.String r4 = r7.Bxr()
            int r2 = r3.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r4 == 0) goto L_0x09cf
            java.lang.String r0 = "source_media_type"
            r5.A0R(r0, r4)
        L_0x09cf:
            if (r1 == 0) goto L_0x09db
            long r0 = (long) r2
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "chaining_position"
            r5.A0Q(r0, r1)
        L_0x09db:
            java.lang.String r1 = r7.C2K()
            if (r1 == 0) goto L_0x09e6
            java.lang.String r0 = "submodule"
            r5.A0R(r0, r1)
        L_0x09e6:
            X.1Ln r0 = r6.A00
            X.0Aj r0 = r0.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x008d
            r5.Cgf()
            return
        L_0x09f4:
            boolean r0 = r1 instanceof X.C231082qq
            if (r0 == 0) goto L_0x0a7d
            r5 = r1
            X.2qq r5 = (X.C231082qq) r5
            X.V3Y r11 = (X.V3Y) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r1 = 0
            X.0qQ.A0B(r11, r1)
            X.4dH r4 = r11.A00
            boolean r0 = r4 instanceof X.C268364dG
            if (r0 == 0) goto L_0x0a1d
            r0 = 0
            r2 = r4
            X.4dG r2 = (X.C268364dG) r2
            X.2qo r1 = r5.A00
            if (r2 == 0) goto L_0x0a19
            X.UxV r0 = r2.A02
            java.lang.String r0 = r0.A00
        L_0x0a19:
            r1.A00(r4, r0, r3)
            return
        L_0x0a1d:
            X.2qo r3 = r5.A00
            java.lang.String r5 = r11.A01
            X.0qQ.A0B(r4, r1)
            X.0wc r2 = r3.A01
            java.lang.String r1 = "instagram_shopping_product_hscroll_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = r3.A05
            java.lang.String r0 = "prior_module"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A06
            java.lang.String r0 = "prior_submodule"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "submodule"
            r2.AAJ(r0, r5)
            java.lang.String r1 = r3.A07
            java.lang.String r0 = "shopping_session_id"
            r2.AAJ(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            X.UzB r0 = r4.B5W()
            if (r0 == 0) goto L_0x0a65
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x0a69
        L_0x0a65:
            java.lang.String r1 = r4.getId()
        L_0x0a69:
            java.lang.String r0 = "product_collection_type"
            r2.AAJ(r0, r1)
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0c6d
            X.4Ny r1 = X.C263944Ny.A00(r0)
            java.lang.String r0 = "merchant_id"
            r2.AAE(r1, r0)
            goto L_0x0c6d
        L_0x0a7d:
            boolean r0 = r1 instanceof X.C231182r4
            if (r0 == 0) goto L_0x0a9d
            r0 = r1
            X.2r4 r0 = (X.C231182r4) r0
            X.VPV r11 = (X.VPV) r11
            java.lang.Number r3 = (java.lang.Number) r3
            X.4dG r4 = r11.A00
            if (r4 == 0) goto L_0x0ae7
            X.2qo r2 = r0.A01
            r2.getClass()
            r1 = 0
            r3.getClass()
            int r0 = r3.intValue()
            r2.A00(r4, r1, r0)
            return
        L_0x0a9d:
            boolean r0 = r1 instanceof X.AnonymousClass2r6
            if (r0 == 0) goto L_0x0c88
            r0 = r1
            X.2r6 r0 = (X.AnonymousClass2r6) r0
            com.instagram.user.model.User r11 = (com.instagram.user.model.User) r11
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.2r2 r4 = r0.A00
            int r5 = r3.intValue()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.0wc r2 = r4.A00
            java.lang.String r1 = "instagram_shopping_merchant_hscroll_tile_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = X.AnonymousClass3ZA.A00(r11)
            X.4Ny r1 = X.C263944Ny.A00(r0)
            java.lang.String r0 = "merchant_id"
            r2.AAE(r1, r0)
            long r0 = (long) r5
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "position"
            r2.A9F(r0, r1)
            X.327 r1 = X.AnonymousClass2r2.A01(r4)
            java.lang.String r0 = "navigation_info"
            r2.AAK(r1, r0)
            X.3sW r1 = X.AnonymousClass2r2.A00(r4, r3)
            goto L_0x0b07
        L_0x0ae7:
            X.2r2 r3 = r0.A00
            X.0wc r2 = r3.A00
            java.lang.String r1 = "instagram_shopping_merchant_hscroll_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x008d
            X.327 r1 = X.AnonymousClass2r2.A01(r3)
            java.lang.String r0 = "navigation_info"
            r2.AAK(r1, r0)
            r0 = 0
            X.3sW r1 = X.AnonymousClass2r2.A00(r3, r0)
        L_0x0b07:
            java.lang.String r0 = "collections_logging_info"
            r2.AAK(r1, r0)
            goto L_0x0c6d
        L_0x0b0e:
            X.4DU r1 = r2.A01
            java.lang.String r0 = r2.A02
            X.W3r.A05(r1, r4, r11, r0)
            return
        L_0x0b16:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0b1e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0b26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x0b2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x0b32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0b38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0b3e:
            java.lang.String r0 = "tracking_tokens"
            r2.AAe(r0, r10)
            java.lang.String r0 = r6.A0A
            java.lang.String r1 = X.C241323Ot.A02(r0)
            java.lang.String r0 = "inventory_source"
            r2.AAJ(r0, r1)
            java.lang.Integer r0 = r6.A02()
            r3 = 0
            if (r0 == 0) goto L_0x0c85
            java.lang.String r1 = X.C55034Hb5.A00(r0)
        L_0x0b59:
            java.lang.String r0 = "insertion_mechanism"
            r2.AAJ(r0, r1)
            java.lang.Long r1 = r5.A08(r6)
            java.lang.String r0 = "hscroll_seed_ad_id"
            r2.A9F(r0, r1)
            java.lang.Long r1 = X.C230282pK.A04(r6)
            java.lang.String r0 = "hscroll_seed_media_id"
            r2.A9F(r0, r1)
            java.lang.Long r1 = X.C230282pK.A03(r6)
            java.lang.String r0 = "hscroll_seed_media_author_igid"
            r2.A9F(r0, r1)
            java.lang.Integer r0 = r6.A07
            if (r0 == 0) goto L_0x0c82
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0b86:
            java.lang.String r0 = "hscroll_seed_ad_position"
            r2.A9F(r0, r1)
            X.1Xj r0 = r6.A04
            java.lang.Boolean r1 = X.C230282pK.A02(r4, r0)
            java.lang.String r0 = "is_seed_ad_multi_ads_eligible"
            r2.A7p(r0, r1)
            X.1Xj r0 = r6.A04
            java.lang.String r1 = X.C230282pK.A05(r4, r0)
            java.lang.String r0 = "hscroll_seed_ad_tracking_token"
            r2.AAJ(r0, r1)
            r4 = -1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0c7e
            X.3Bb r10 = X.C238233Bb.A02
            X.4ai r0 = X.C267004ai.STANDALONE_MULTI_AD
            X.4ai[] r0 = new X.C267004ai[]{r0}
            java.util.ArrayList r1 = X.0sr.A1M(r0)
            int r0 = (int) r7
            int r0 = r10.A01(r1, r0)
            long r0 = (long) r0
        L_0x0bb9:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 3186(0xc72, float:4.465E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0c7a
            X.3Bb r10 = X.C238233Bb.A02
            X.4ai r0 = X.C267004ai.PAE_MULTI_AD
            X.4ai[] r0 = new X.C267004ai[]{r0}
            java.util.ArrayList r1 = X.0sr.A1M(r0)
            int r0 = (int) r7
            int r0 = r10.A01(r1, r0)
            long r0 = (long) r0
        L_0x0bdc:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 3185(0xc71, float:4.463E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0c76
            X.3Bb r10 = X.C238233Bb.A02
            X.4ai r1 = X.C267004ai.NETEGO
            int r0 = (int) r7
            int r0 = r10.A00(r1, r0)
            long r0 = (long) r0
        L_0x0bf7:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 3184(0xc70, float:4.462E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0c3e
            X.3Bb r0 = X.C238233Bb.A02
            int r10 = (int) r7
            android.util.SparseArray r8 = r0.A00
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0c74
            int r7 = r8.indexOfKey(r10)
            int r7 = r7 - r9
        L_0x0c18:
            if (r7 < 0) goto L_0x0c74
            java.lang.Object r0 = r8.valueAt(r7)
            X.4ai r5 = X.C267004ai.AD
            if (r0 != r5) goto L_0x0c71
            int r4 = r7 + -1
            if (r4 < 0) goto L_0x0c71
            int r1 = r8.keyAt(r7)
            int r0 = r8.keyAt(r4)
            int r1 = r1 - r0
            if (r1 != r9) goto L_0x0c71
            java.lang.Object r0 = r8.valueAt(r4)
            if (r0 != r5) goto L_0x0c71
            int r0 = r8.keyAt(r7)
            int r10 = r10 - r0
            int r10 = r10 - r9
        L_0x0c3d:
            long r4 = (long) r10
        L_0x0c3e:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0 = 3183(0xc6f, float:4.46E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            java.lang.String r1 = r6.A08
            java.lang.String r0 = "ad_request_id"
            r2.AAJ(r0, r1)
            java.util.List r0 = r6.A0B
            java.lang.Object r0 = X.00k.A0I(r0)
            X.Hpk r0 = (X.C55923Hpk) r0
            X.1Xj r0 = r0.A00()
            java.lang.Integer r0 = r0.A2P()
            if (r0 == 0) goto L_0x0c68
            java.lang.String r3 = r0.toString()
        L_0x0c68:
            java.lang.String r0 = "imp_signature"
            r2.AAJ(r0, r3)
        L_0x0c6d:
            r2.Cgf()
            return
        L_0x0c71:
            int r7 = r7 + -1
            goto L_0x0c18
        L_0x0c74:
            r10 = -1
            goto L_0x0c3d
        L_0x0c76:
            r0 = -1
            goto L_0x0bf7
        L_0x0c7a:
            r0 = -1
            goto L_0x0bdc
        L_0x0c7e:
            r0 = -1
            goto L_0x0bb9
        L_0x0c82:
            r1 = r3
            goto L_0x0b86
        L_0x0c85:
            r1 = r3
            goto L_0x0b59
        L_0x0c88:
            boolean r0 = r1 instanceof X.C230642px
            if (r0 == 0) goto L_0x0cea
            X.2px r1 = (X.C230642px) r1
            X.Hl0 r3 = (X.C55641Hl0) r3
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.JR4 r4 = r1.A00
            if (r4 == 0) goto L_0x0ce0
            X.IVp r0 = r3.A00
            X.4fs r0 = r0.A00
            java.lang.Integer r0 = r0.BXG()
            if (r0 == 0) goto L_0x0cda
            int r1 = r0.intValue()
        L_0x0ca6:
            X.HoH r0 = r3.A01
            com.instagram.ui.widget.flowlayout.HorizontalFlowLayout r2 = r0.A05
            int r0 = r1 + -1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            java.util.List r0 = r2.A01(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0cbe:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0cdc
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1 instanceof X.H7Y
            if (r0 == 0) goto L_0x0cbe
            X.H7Y r1 = (X.H7Y) r1
            if (r1 == 0) goto L_0x0cbe
            X.JSM r0 = r1.A00
            if (r0 == 0) goto L_0x0cbe
            r3.add(r0)
            goto L_0x0cbe
        L_0x0cda:
            r1 = 3
            goto L_0x0ca6
        L_0x0cdc:
            r4.Ciu(r3)
            return
        L_0x0ce0:
            java.lang.String r0 = "afiLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0cea:
            r4 = r1
            X.2zE r4 = (X.C235072zE) r4
            X.1Xj r11 = (X.1Xj) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.0wc r2 = r4.A00
            X.0kJ r1 = X.0kJ.A04
            java.lang.String r0 = "instagram_organic_in_feed_survey_impression"
            X.0Aj r3 = r2.A00(r1, r0)
            com.instagram.common.session.UserSession r0 = r4.A01
            com.instagram.user.model.User r0 = r11.A2A(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0d0a
            java.lang.String r2 = r0.getId()
        L_0x0d0a:
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x0d1c
            java.lang.String r0 = "a_pk"
            r3.AAJ(r0, r2)
            r11.A3r()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C230372pW.A03(java.lang.Object, java.lang.Object):void");
    }

    public void A04(Object obj, Object obj2) {
        0Aj r2;
        String str;
        C263944Ny A002;
        User BRo;
        String A07;
        String A072;
        int position;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (!(this instanceof AnonymousClass32R)) {
            if (this instanceof C235272ze) {
                C235272ze r1 = (C235272ze) this;
                1Xj r8 = (1Xj) obj3;
                0qQ.A0B(r8, 0);
                C235272ze.A00(r8, r1);
                C235272ze.A01(r8, r1);
                return;
            } else if (this instanceof C234552yC) {
                C234552yC r4 = (C234552yC) this;
                1Xj r82 = (1Xj) obj3;
                AnonymousClass3W1 r22 = (AnonymousClass3W1) obj4;
                0qQ.A0B(r82, 0);
                0qQ.A0B(r22, 1);
                boolean A0p = r22.A0p();
                UserSession userSession = r4.A00;
                Boolean valueOf = Boolean.valueOf(182.A06(0Tu.A05, userSession, 36313437387425772L));
                if (!A0p) {
                    0wb.A03("OrganicImpressionEventAction:handleSubImpression", 002.A0R("position in media state is not set, media type is ", r82.BR7().name()));
                    position = -1;
                } else {
                    position = r22.getPosition();
                }
                AnonymousClass2lU r12 = r4.A03;
                if (r12 != null && r12.A09(r22.A0o)) {
                    r12.A06(r82, r22.A03);
                }
                int i = r22.A03;
                C254433sT.A02(userSession, r4.A01, r82, r4.A02, true, valueOf, position, i);
                return;
            } else if (this instanceof C235252zc) {
                return;
            } else {
                if (this instanceof C234622yL) {
                    C234622yL r6 = (C234622yL) this;
                    1Xj r83 = (1Xj) obj3;
                    AnonymousClass3W1 r23 = (AnonymousClass3W1) obj4;
                    0qQ.A0B(r83, 0);
                    0qQ.A0B(r23, 1);
                    AnonymousClass2lU r13 = r6.A04;
                    if (r13 != null && r13.A09(r23.A0o)) {
                        r13.A06(r83, r23.A03);
                    }
                    if (r23.A0o == 1sy.A0A && (A072 = C231122qu.A07(r6.A01, r83)) != null) {
                        r6.A05.EGR(C230472pg.SPONSORED, C233162v9.SEEN_STATE, C230432pc.EXPLORE, A072);
                    }
                    UserSession userSession2 = r6.A01;
                    Context context = r6.A00;
                    AnonymousClass4DU r14 = r6.A03;
                    C232852uY r42 = r6.A02;
                    0qQ.A0B(r42, 5);
                    C254523sc A022 = r42.A02(r83, r14, r23.getPosition());
                    if (A022 != null) {
                        A022.A03();
                        A022.A02();
                        A022.A8A = r23.A2R;
                        A022.A8B = C231122qu.A0R(userSession2, r83);
                        C254433sT r15 = C254433sT.A00;
                        A022.A89 = C254453sV.A00(userSession2);
                        String str2 = AnonymousClass1QI.A00.A02.A00;
                        if (str2 != null) {
                            A022.A65 = str2;
                        }
                        C232852uY.A02.A03(userSession2, A022, r83, r23, new StringBuilder());
                        C232832uW.A00(A022, r83, r14, r23.getPosition());
                        r15.A03(userSession2, A022, r83, r14, r23);
                        C254433sT.A00(context, A022, r23);
                        if (C228342lQ.A02(userSession2)) {
                            A022.A4X = C228342lQ.A01(1Au.A00(userSession2)).toString();
                            A022.A4Y = C228342lQ.A00(userSession2).toString();
                        }
                        C233822wX.A0E(userSession2, A022, r83, r14, r23.A03);
                        return;
                    }
                    return;
                }
                if (this instanceof C262884Gj) {
                    C262884Gj r16 = (C262884Gj) this;
                    1Xj r84 = (1Xj) obj3;
                    0qQ.A0B(r84, 0);
                    UserSession userSession3 = r16.A00;
                    if (r84.A1e(userSession3).CcK()) {
                        AnonymousClass4DU r3 = r16.A01;
                        C254523sc r17 = new C254523sc(r3, 002.A0R("instagram_ad_", "tags_list_entry_point_sub_impression"));
                        r17.A0G(userSession3, r84);
                        r17.A6S = null;
                        r17.A4J = "shopping";
                        r17.A02();
                        C18694Vws.A00(userSession3, r17, r84, r3);
                        return;
                    }
                    AnonymousClass4DU r0 = r16.A01;
                    String str3 = r16.A02;
                    0wc A012 = AnonymousClass0kN.A01(r0, userSession3);
                    r2 = A012.A00(A012.A00, "instagram_shopping_tags_list_entry_point_sub_impression");
                    if (r2.isSampled()) {
                        r2.AAJ("shopping_session_id", str3);
                        r2.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                        r2.A9H("product_merchant_ids", C294165ly.A0D(r84.A3B()));
                        r2.A7p("is_checkout_enabled", C294165ly.A08(r84.A3B()));
                        r2.AAJ("m_pk", r84.getId());
                    } else {
                        return;
                    }
                } else if (this instanceof AnonymousClass32O) {
                    AnonymousClass32O r18 = (AnonymousClass32O) this;
                    1Xj r85 = (1Xj) obj3;
                    0qQ.A0B(r85, 0);
                    AnonymousClass4DU r9 = r18.A02;
                    UserSession userSession4 = r18.A01;
                    W3r.A0B(userSession4, r85, r9, C16944VBw.A00(AnonymousClass3YA.A00(userSession4, r85, r9)), r18.A05, r18.A06, r18.A04, true, r18.A07);
                    return;
                } else if (this instanceof C230602pt) {
                    return;
                } else {
                    if (this instanceof C234662yQ) {
                        C234662yQ r7 = (C234662yQ) this;
                        1Xj r86 = (1Xj) obj3;
                        AnonymousClass4HA r24 = (AnonymousClass4HA) obj4;
                        0qQ.A0B(r86, 0);
                        0qQ.A0B(r24, 1);
                        AnonymousClass3W1 r5 = r24.A01;
                        if (r5.A0o == 1sy.A0A && (A07 = C231122qu.A07(r7.A00, r86)) != null) {
                            r7.A03.EGR(C230472pg.SPONSORED, C233162v9.SEEN_STATE, C230432pc.EXPLORE, A07);
                        }
                        UserSession userSession5 = r7.A00;
                        int i2 = r24.A00;
                        AnonymousClass4DU r92 = r7.A02;
                        C232852uY r132 = r7.A01;
                        0qQ.A0B(r132, 5);
                        C254523sc A032 = r132.A03(r86, r92, "sub_impression", i2, r5.getPosition());
                        if (A032 != null) {
                            A032.A03();
                            A032.A02();
                            A032.A8A = r5.A2R;
                            A032.A8B = C231122qu.A0R(userSession5, r86);
                            if (C228342lQ.A02(userSession5)) {
                                A032.A4X = C228342lQ.A01(1Au.A00(userSession5)).toString();
                                A032.A4Y = C228342lQ.A00(userSession5).toString();
                            }
                            C233822wX.A0F(userSession5, A032, r86, r92, AnonymousClass05K.A00, i2, true);
                            return;
                        }
                        return;
                    } else if (this instanceof C235102zH) {
                        C235102zH r19 = (C235102zH) this;
                        1Xj r87 = (1Xj) obj3;
                        0qQ.A0B(r87, 0);
                        I7O.A08(r19.A01, r19.A00, r87, "on_impression", true);
                        return;
                    } else if (this instanceof AnonymousClass32Y) {
                        1Xj r88 = (1Xj) obj3;
                        ((Number) obj4).intValue();
                        0qQ.A0B(r88, 0);
                        AnonymousClass32Y.A00((AnonymousClass32Y) this, r88);
                        return;
                    } else if (this instanceof C231102qs) {
                        V3X v3x = (V3X) obj3;
                        C17524VZd vZd = (C17524VZd) obj4;
                        0qQ.A0B(v3x, 0);
                        0qQ.A0B(vZd, 1);
                        ProductFeedItem productFeedItem = v3x.A00;
                        C268374dH r62 = vZd.A02;
                        C231112qt r32 = ((C231102qs) this).A00;
                        Object obj5 = vZd.A04.get(productFeedItem.getId());
                        obj5.getClass();
                        C17449VWc vWc = new C17449VWc(productFeedItem, r32, 0, ((Number) obj5).intValue());
                        1Ln r43 = vWc.A01;
                        r43.A0R("product_collection_type", String.valueOf(r62.B5W()));
                        String Bxn = r62.Bxn();
                        if (Bxn != null) {
                            r43.A0m(Bxn);
                        }
                        String Bxr = r62.Bxr();
                        if (Bxr != null) {
                            r43.A0R("source_media_type", Bxr);
                        }
                        if (r62 instanceof MultiProductComponent) {
                            r43.A0R("submodule", ((MultiProductComponent) r62).A00());
                        }
                        String Bxr2 = r62.Bxr();
                        int i3 = vZd.A01;
                        Integer valueOf2 = Integer.valueOf(i3);
                        if (Bxr2 != null) {
                            r43.A0R("source_media_type", Bxr2);
                        }
                        if (valueOf2 != null) {
                            r43.A0Q("chaining_position", Long.valueOf((long) i3));
                        }
                        String C2K = r62.C2K();
                        if (C2K != null) {
                            r43.A0R("submodule", C2K);
                        }
                        if (vWc.A00.A00.isSampled()) {
                            r43.Cgf();
                            return;
                        }
                        return;
                    } else if (this instanceof C231082qq) {
                        C231082qq r33 = (C231082qq) this;
                        V3Y v3y = (V3Y) obj3;
                        int intValue = ((Number) obj4).intValue();
                        0qQ.A0B(v3y, 0);
                        C268374dH r44 = v3y.A00;
                        if (r44 instanceof C268364dG) {
                            String str4 = null;
                            C268364dG r02 = (C268364dG) r44;
                            C231062qo r52 = r33.A00;
                            if (r02 != null) {
                                str4 = r02.A02.A00;
                            }
                            0qQ.A0B(r44, 0);
                            0wc r25 = r52.A01;
                            r2 = r25.A00(r25.A00, AnonymousClass000.A00(3381));
                            if (r2.isSampled()) {
                                0bb r34 = new 0bb();
                                r34.A06("submodule", str4);
                                r34.A06("prior_module", r52.A05);
                                r34.A06("prior_submodule", r52.A06);
                                r34.A06("shopping_session_id", r52.A07);
                                r34.A06("nav_chain", AnonymousClass1QI.A00.A02.A00);
                                r2.AAK(r34, "navigation_info");
                                0bb r35 = new 0bb();
                                r35.A05("chaining_position", Long.valueOf((long) intValue));
                                r35.A06("chaining_session_id", r52.A02);
                                r35.A06("m_pk", r44.Bxn());
                                r35.A06("parent_m_pk", r52.A04);
                                r35.A05("m_t", Long.valueOf((long) r52.A00));
                                r35.A06("source_media_type", r44.Bxr());
                                r2.AAK(r35, "pivots_logging_info");
                                X9B Aif = r44.Aif();
                                String str5 = null;
                                if (!(Aif == null || Aif.BRo() == null)) {
                                    X9B Aif2 = r44.Aif();
                                    if (!(Aif2 == null || (BRo = Aif2.BRo()) == null)) {
                                        str5 = AnonymousClass3ZA.A00(BRo);
                                    }
                                    A002 = C263944Ny.A00(str5);
                                }
                            } else {
                                return;
                            }
                        } else {
                            C231062qo r36 = r33.A00;
                            String str6 = v3y.A01;
                            0qQ.A0B(r44, 0);
                            0wc r26 = r36.A01;
                            r2 = r26.A00(r26.A00, "instagram_shopping_product_hscroll_sub_impression");
                            if (r2.isSampled()) {
                                r2.AAJ("prior_module", r36.A05);
                                r2.AAJ("prior_submodule", r36.A06);
                                r2.AAJ("submodule", str6);
                                r2.AAJ("shopping_session_id", r36.A07);
                                r2.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                                C16675UzB B5W = r44.B5W();
                                if (B5W == null || (str = B5W.toString()) == null) {
                                    str = r44.getId();
                                }
                                r2.AAJ("product_collection_type", str);
                                String str7 = r36.A03;
                                if (str7 != null) {
                                    A002 = C263944Ny.A00(str7);
                                }
                            } else {
                                return;
                            }
                        }
                        r2.AAE(A002, "merchant_id");
                    } else if (!(this instanceof C231182r4) && !(this instanceof AnonymousClass2r6)) {
                        if (!(this instanceof C230362pV)) {
                            if (this instanceof C230392pY) {
                                C53288Gla gla = (C53288Gla) obj3;
                                int intValue2 = ((Number) obj4).intValue();
                                0qQ.A0B(gla, 0);
                                C230282pK r37 = ((C230392pY) this).A00;
                                C54077Gz1 gz1 = gla.A03;
                                IntentAwareAdPivotState intentAwareAdPivotState = gla.A01;
                                0qQ.A0B(gz1, 0);
                                0qQ.A0B(intentAwareAdPivotState, 1);
                                C230282pK.A07(intentAwareAdPivotState, gz1, r37, "sub_impression", intValue2);
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                r2.Cgf();
                return;
            }
        }
        ((Number) obj4).intValue();
    }

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        if (r6.CEk(r5) == AnonymousClass05K.A00) {
            String BK2 = this.A03.BK2(r5);
            C229312nB r2 = this.A02;
            if (!r2.A00.A0F(BK2)) {
                A03(r5.A03, r5.A04);
            } else if (r2.A03(BK2, this.A00)) {
                A04(r5.A03, r5.A04);
            } else {
                return;
            }
            r2.A02(BK2);
        }
    }

    public C230372pW(1Bk r6, C229222n2 r7) {
        C229312nB r3 = new C229312nB(r6, C61410nE.A00);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(1);
        this.A02 = r3;
        this.A00 = r6.A0G("override_staleTime_in_testMode", false) ? timeUnit.toMillis(0) : millis;
        this.A01 = r6;
        this.A03 = r7;
    }
}
