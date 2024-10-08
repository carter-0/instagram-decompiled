package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductCollectionFooter;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.UdX  reason: case insensitive filesystem */
public final class C15482UdX extends 2Ru implements C231302rO {
    public ProductCollectionFooter A00;
    public ProductCollectionHeader A01;
    public C16735V3s A02;
    public C17373VTa A03;
    public C17391VTs A04;
    public final AnonymousClass2s2 A05;
    public final 1Xj A06;
    public final C16675UzB A07;
    public final C15551Uef A08;
    public final C47592E9e A09;
    public final C47593E9f A0A;
    public final C15564Ues A0B;
    public final C15498Udn A0C;
    public final C15552Ueg A0D;
    public final U9Q A0E = new U9Q(this);
    public final C15512Ue1 A0F;
    public final C17596Vao A0G;
    public final C20988X8e A0H;
    public final C15952UlT A0I;
    public final C15532UeL A0J;
    public final C15554Uei A0K;
    public final AnonymousClass71T A0L;
    public final C229122ms A0M;
    public final C231762sK A0N;
    public final String A0O;
    public final String A0P;
    public final Map A0Q = new HashMap();
    public final UserSession A0R;
    public final C47625EAl A0S;

    /* JADX WARNING: type inference failed for: r12v0, types: [X.2s0, X.Udn, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v1, types: [X.2s0, X.2s2, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15482UdX(Context context, UserSession userSession, 1Xj r27, AnonymousClass4DU r28, AnonymousClass57K r29, ProductCollectionHeader productCollectionHeader, C16675UzB uzB, C17596Vao vao, C20988X8e x8e, ProductCollectionFragment productCollectionFragment, C15952UlT ulT, C15683Ugo ugo, C229122ms r37, String str, String str2, boolean z) {
        super(false);
        Integer num;
        UserSession userSession2 = userSession;
        C229122ms r2 = r37;
        DbW.A1O(r2, 3, userSession2);
        C16675UzB uzB2 = uzB;
        0qQ.A0B(uzB2, 10);
        C17596Vao vao2 = vao;
        C20988X8e x8e2 = x8e;
        DbW.A1P(x8e2, 11, vao2);
        this.A0M = r2;
        this.A0I = ulT;
        this.A0R = userSession2;
        this.A07 = uzB2;
        this.A0G = vao2;
        this.A01 = productCollectionHeader;
        ProductCollectionFragment productCollectionFragment2 = productCollectionFragment;
        AnonymousClass4DU r3 = r28;
        C15564Ues ues = new C15564Ues(r3, userSession2, productCollectionFragment2);
        this.A0B = ues;
        C15683Ugo ugo2 = ugo;
        1Xj r10 = r27;
        Context context2 = context;
        AnonymousClass4DU r17 = r3;
        C15551Uef uef = new C15551Uef(context2, userSession2, r10, r17, productCollectionFragment2, ugo2, z);
        this.A08 = uef;
        ? obj = new Object();
        this.A0C = obj;
        ? obj2 = new Object();
        this.A05 = obj2;
        obj2.A03 = DbY.A01(context2);
        if (uzB2 != C16675UzB.PRODUCT_INSTANT_COLLECTION) {
            num = null;
            if (r29 != null) {
                switch (r29.ordinal()) {
                    case 0:
                        num = AnonymousClass05K.A01;
                        break;
                    case 1:
                    case 2:
                        num = AnonymousClass05K.A0N;
                        break;
                    case 3:
                        num = AnonymousClass05K.A0j;
                        break;
                    case 4:
                    case 5:
                        num = AnonymousClass05K.A0u;
                        break;
                }
            }
        } else {
            num = AnonymousClass05K.A0Y;
        }
        Context context3 = context2;
        C15552Ueg ueg = new C15552Ueg(context3, r17, userSession2, productCollectionFragment2, ugo2, num, str, false);
        this.A0D = ueg;
        C15554Uei uei = new C15554Uei(context2, r3, productCollectionFragment2);
        this.A0K = uei;
        C231762sK r6 = new C231762sK(context2);
        this.A0N = r6;
        C15532UeL ueL = new C15532UeL(r3, ugo2, productCollectionFragment2);
        this.A0J = ueL;
        AnonymousClass71T r4 = new AnonymousClass71T(context2);
        this.A0L = r4;
        C47625EAl eAl = new C47625EAl(context2);
        this.A0S = eAl;
        this.A0H = x8e2;
        x8e2.Epa();
        C47592E9e e9e = new C47592E9e(context2);
        this.A09 = e9e;
        C15512Ue1 ue1 = new C15512Ue1(context2);
        this.A0F = ue1;
        C47593E9f e9f = new C47593E9f(context2);
        this.A0A = e9f;
        this.A06 = r10;
        this.A0O = str2;
        this.A0P = DbX.A0t(r29);
        init(new C231642s0[]{ues, obj, uef, obj2, ueg, r6, ueL, r4, eAl, e9e, ue1, e9f, uei});
    }

    public final void A01(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductFeedItem productFeedItem = (ProductFeedItem) it.next();
            A0q.add(productFeedItem);
            MultiProductComponent multiProductComponent = productFeedItem.A01;
            if (multiProductComponent != null && multiProductComponent.A02 == C16671Uz7.PRODUCT_GRID_LIST) {
                A0q.addAll(C51966G9m.A1J(multiProductComponent.A03.A03));
            }
        }
        this.A0I.A0A(A0q);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [android.os.Parcelable, java.lang.Object] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01aa  */
    public final void A00() {
        /*
            r17 = this;
            r3 = r17
            r3.clear()
            X.UlT r1 = r3.A0I
            r1.A06()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x007b
            X.2ms r0 = r3.A0M
            boolean r0 = r0.isLoading()
            r5 = 0
            if (r0 == 0) goto L_0x0066
            X.UzB r4 = r3.A07
            int r1 = r4.ordinal()
            r2 = 1
            r0 = 16
            if (r1 == r0) goto L_0x0060
            r0 = 15
            if (r1 != r0) goto L_0x0033
            r0 = 0
            X.VT0 r1 = new X.VT0
            r1.<init>(r0, r0)
        L_0x002e:
            X.Udn r0 = r3.A0C
            r3.addModel(r1, r0)
        L_0x0033:
            X.UzB r0 = X.C16675UzB.PRODUCT_COLLECTION
            if (r4 == r0) goto L_0x003b
            X.UzB r0 = X.C16675UzB.PRODUCT_INSTANT_COLLECTION
            if (r4 != r0) goto L_0x0044
        L_0x003b:
            com.instagram.model.shopping.productfeed.ProductCollectionHeader r1 = r3.A01
            if (r1 != 0) goto L_0x005a
            X.E9e r0 = r3.A09
            r3.addModel(r5, r5, r0)
        L_0x0044:
            X.2s2 r4 = r3.A05
            r3.addModel(r5, r4)
            X.Uit r1 = new X.Uit
            r1.<init>(r5, r5, r2)
            X.Ue1 r0 = r3.A0F
            r3.addModel(r5, r1, r0)
        L_0x0053:
            r3.addModel(r5, r4)
            r3.notifyDataSetChanged()
            return
        L_0x005a:
            X.Uef r0 = r3.A08
            r3.addModel(r1, r0)
            goto L_0x0044
        L_0x0060:
            X.VT0 r1 = new X.VT0
            r1.<init>(r2, r2)
            goto L_0x002e
        L_0x0066:
            X.2s2 r4 = r3.A05
            r3.addModel(r5, r4)
            X.X8e r0 = r3.A0H
            X.72b r2 = r0.Afm()
            X.6rr r1 = r0.B0w()
            X.71T r0 = r3.A0L
            r3.addModel(r2, r1, r0)
            goto L_0x0053
        L_0x007b:
            com.instagram.model.shopping.productfeed.ProductCollectionHeader r4 = r3.A01
            if (r4 == 0) goto L_0x01d0
            X.1Xj r0 = r3.A06
            if (r0 == 0) goto L_0x01cd
            com.instagram.model.mediasize.ImageInfo r0 = r0.A1p()
        L_0x0087:
            r5 = 1
            if (r0 != 0) goto L_0x00a2
            com.instagram.model.shopping.productcollection.ProductCollectionCoverImpl r2 = r4.A00
            com.instagram.model.shopping.productimagecontainer.ProductImageContainer r0 = r2.A00
            com.instagram.model.showreelnative.IgShowreelNativeAnimation r2 = r2.A01
            if (r0 == 0) goto L_0x01ad
            com.instagram.model.mediasize.ImageInfo r0 = r0.BGO()
            java.util.List r0 = r0.Al9()
            if (r0 == 0) goto L_0x01ad
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x01ad
        L_0x00a2:
            X.V3s r2 = r3.A02
            if (r2 == 0) goto L_0x00b6
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x01aa
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x01aa
            java.lang.String r0 = r2.A01
            if (r0 != 0) goto L_0x01aa
            com.instagram.user.model.User r0 = r2.A00
            if (r0 != 0) goto L_0x01aa
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            if (r5 == 0) goto L_0x00c0
            com.instagram.model.shopping.productfeed.ProductCollectionHeader r2 = r3.A01
            X.Uef r0 = r3.A08
            r3.addModel(r2, r0)
        L_0x00c0:
            if (r4 == 0) goto L_0x00c9
            X.V3s r2 = r3.A02
            X.Ues r0 = r3.A0B
            r3.addModel(r2, r0)
        L_0x00c9:
            r7 = 0
            if (r5 != 0) goto L_0x00ce
            if (r4 == 0) goto L_0x00d3
        L_0x00ce:
            X.2s2 r0 = r3.A05
            r3.addModel(r7, r0)
        L_0x00d3:
            java.lang.String r13 = "product_collection"
            X.ULC r10 = new X.ULC
            r11 = r7
            r12 = r7
            r14 = r7
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            r15 = 0
        L_0x00df:
            java.util.List r0 = r1.A01
            int r0 = r0.size()
            if (r15 >= r0) goto L_0x01d3
            java.util.List r0 = r1.A01
            java.lang.Object r0 = r0.get(r15)
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r0
            com.instagram.model.shopping.productfeed.MultiProductComponent r5 = r0.A01
            r4 = 1
            if (r5 == 0) goto L_0x010e
            X.Uz7 r2 = r5.A02
            X.0qQ.A07(r2)
            X.Uz7 r0 = X.C16671Uz7.PRODUCT_GRID_LIST
            if (r2 != r0) goto L_0x010e
            java.lang.String r2 = r5.A07
            if (r2 == 0) goto L_0x010c
            int r0 = r2.length()
            if (r0 == 0) goto L_0x010c
            X.E9f r0 = r3.A0A
            r3.addModel(r2, r0)
        L_0x010c:
            int r15 = r15 + 1
        L_0x010e:
            java.util.List r2 = r1.A01
            r0 = 2
            X.71g r11 = new X.71g
            r11.<init>(r2, r15, r0)
            int r6 = r11.A01()
            r5 = 0
        L_0x011b:
            if (r5 >= r6) goto L_0x0134
            java.lang.Object r0 = r11.A02(r5)
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r0
            com.instagram.model.shopping.productfeed.MultiProductComponent r0 = r0.A01
            if (r0 == 0) goto L_0x01a6
            X.Uz7 r2 = r0.A02
            X.Uz7 r0 = X.C16671Uz7.PRODUCT_GRID_LIST
            if (r2 != r0) goto L_0x01a6
            java.util.List r0 = r1.A01
            X.71g r11 = new X.71g
            r11.<init>(r0, r15, r5)
        L_0x0134:
            int r2 = r11.A01()
            r0 = 2
            if (r2 == r0) goto L_0x0146
            X.2ms r0 = r3.A0M
            boolean r0 = r0.CKB()
            if (r0 == 0) goto L_0x0146
            int r15 = r15 + 1
            goto L_0x00df
        L_0x0146:
            java.util.Map r5 = r3.A0Q
            java.lang.String r0 = X.AnonymousClass7TF.A0h(r11)
            java.lang.Object r0 = r5.get(r0)
            if (r0 != 0) goto L_0x015e
            X.Vz5 r2 = new X.Vz5
            r2.<init>(r11)
            java.lang.String r0 = X.AnonymousClass7TF.A0h(r11)
            r5.put(r0, r2)
        L_0x015e:
            java.lang.String r0 = X.AnonymousClass7TF.A0h(r11)
            java.lang.Object r9 = r5.get(r0)
            X.Vz5 r9 = (X.Vz5) r9
            if (r9 != 0) goto L_0x0176
            X.Vz5 r9 = new X.Vz5
            r9.<init>(r11)
            java.lang.String r0 = X.AnonymousClass7TF.A0h(r11)
            r5.put(r0, r9)
        L_0x0176:
            X.6u8 r2 = r9.A00
            X.2ms r0 = r3.A0M
            boolean r0 = r0.CKB()
            if (r0 != 0) goto L_0x01a4
            int r0 = r1.A02()
            int r0 = r0 - r4
            if (r15 != r0) goto L_0x01a4
        L_0x0187:
            r2.A00(r15, r4)
            X.UzB r8 = r3.A07
            java.lang.String r12 = r3.A0O
            java.lang.String r13 = r3.A0P
            r16 = 130944(0x1ff80, float:1.83492E-40)
            X.WSl r6 = new X.WSl
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.Ueg r0 = r3.A0D
            r3.addModel(r6, r7, r0)
            int r0 = r11.A01()
            int r15 = r15 + r0
            goto L_0x00df
        L_0x01a4:
            r4 = 0
            goto L_0x0187
        L_0x01a6:
            int r5 = r5 + 1
            goto L_0x011b
        L_0x01aa:
            r4 = 1
            goto L_0x00b7
        L_0x01ad:
            if (r2 != 0) goto L_0x00a2
            java.lang.String r0 = r4.A02
            if (r0 != 0) goto L_0x00a2
            com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadataImpl r0 = r4.A01
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = r4.A03
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = r4.A04
            int r0 = r0.length()
            if (r0 > 0) goto L_0x00a2
            java.util.ArrayList r0 = r4.A05
            boolean r0 = X.DbT.A1b(r0)
            if (r0 == 0) goto L_0x01d0
            goto L_0x00a2
        L_0x01cd:
            r0 = 0
            goto L_0x0087
        L_0x01d0:
            r5 = 0
            goto L_0x00a2
        L_0x01d3:
            X.2ms r1 = r3.A0M
            boolean r0 = r1.CKB()
            if (r0 != 0) goto L_0x0215
            boolean r0 = r1.CT5()
            if (r0 != 0) goto L_0x0215
            X.VTa r2 = r3.A03
            if (r2 == 0) goto L_0x0207
            X.V3k r1 = r2.A01
            if (r1 == 0) goto L_0x01ee
            X.UeL r0 = r3.A0J
            r3.addModel(r1, r0)
        L_0x01ee:
            X.CGI r2 = r2.A00
            if (r2 == 0) goto L_0x0207
            X.VTs r1 = r3.A04
            if (r1 != 0) goto L_0x0202
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = new androidx.recyclerview.widget.LinearLayoutManager$SavedState
            r0.<init>()
            X.VTs r1 = new X.VTs
            r1.<init>(r0, r7)
            r3.A04 = r1
        L_0x0202:
            X.Uei r0 = r3.A0K
            r3.addModel(r2, r1, r0)
        L_0x0207:
            X.2s2 r0 = r3.A05
            r3.addModel(r7, r0)
            X.U9Q r0 = r3.A0E
            r0.A06()
            X.Vao r5 = r3.A0G
            monitor-enter(r5)
            goto L_0x021b
        L_0x0215:
            X.2sK r0 = r3.A0N
            r3.addModel(r1, r0)
            goto L_0x0207
        L_0x021b:
            java.util.Set r4 = r5.A05     // Catch:{ all -> 0x0235 }
            r3 = 37355530(0x23a000a, float:1.3665133E-37)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0235 }
            boolean r0 = r4.contains(r2)     // Catch:{ all -> 0x0235 }
            if (r0 == 0) goto L_0x0233
            X.02m r1 = X.02m.A0p     // Catch:{ all -> 0x0235 }
            r0 = 2
            r1.markerEnd(r3, r0)     // Catch:{ all -> 0x0235 }
            r4.remove(r2)     // Catch:{ all -> 0x0235 }
        L_0x0233:
            monitor-exit(r5)
            return
        L_0x0235:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15482UdX.A00():void");
    }

    public final boolean isEmpty() {
        C16735V3s v3s = this.A02;
        if ((v3s == null || (v3s.A03 == null && v3s.A02 == null && v3s.A01 == null && v3s.A00 == null)) && this.A0I.A02() == 0) {
            return true;
        }
        return false;
    }

    public final void EZ4(int i) {
        A00();
    }
}
