package X;

import android.content.Context;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.UdY  reason: case insensitive filesystem */
public final class C15483UdY extends 2Ru implements C231302rO {
    public final C15552Ueg A00;
    public final C15512Ue1 A01;
    public final C15513Ue2 A02;
    public final C15682Ugn A03;
    public final C20988X8e A04;
    public final WishListFeedFragment A05;
    public final C15952UlT A06 = new AnonymousClass2rW();
    public final C15952UlT A07 = new AnonymousClass2rW();
    public final AnonymousClass71T A08;
    public final C229122ms A09;
    public final C231762sK A0A;
    public final Map A0B = new HashMap();
    public final Map A0C = new HashMap();
    public final AnonymousClass2tu A0D;
    public final C47625EAl A0E;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.UlT, X.2rW] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.UlT, X.2rW] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15483UdY(Context context, C229382nI r25, AnonymousClass0iw r26, UserSession userSession, C15682Ugn ugn, C20988X8e x8e, WishListFeedFragment wishListFeedFragment, C229122ms r31) {
        super(false);
        Context context2 = context;
        UserSession userSession2 = userSession;
        C229122ms r1 = r31;
        C51973G9u.A0r(1, context2, r1, userSession2);
        C15682Ugn ugn2 = ugn;
        C20988X8e x8e2 = x8e;
        AnonymousClass7TF.A1G(x8e2, 7, ugn2);
        WishListFeedFragment wishListFeedFragment2 = wishListFeedFragment;
        this.A05 = wishListFeedFragment2;
        this.A09 = r1;
        this.A04 = x8e2;
        this.A03 = ugn2;
        XC8 Bg8 = wishListFeedFragment2.BgB().Bg8();
        Integer num = AnonymousClass05K.A15;
        AnonymousClass0iw r12 = r26;
        C15552Ueg ueg = new C15552Ueg(context2, r12, userSession2, Bg8, (C15683Ugo) null, num, (String) null, true);
        this.A00 = ueg;
        C231762sK r8 = new C231762sK(context2);
        this.A0A = r8;
        AnonymousClass71T r7 = new AnonymousClass71T(context2);
        this.A08 = r7;
        C47625EAl eAl = new C47625EAl(context2);
        this.A0E = eAl;
        C15512Ue1 ue1 = new C15512Ue1(context2);
        this.A01 = ue1;
        C15513Ue2 ue2 = new C15513Ue2(r25);
        this.A02 = ue2;
        AnonymousClass2tu r16 = new AnonymousClass2tu(context2, r12, userSession2, wishListFeedFragment2, num, false);
        this.A0D = r16;
        x8e2.Epa();
        init(new C231642s0[]{r7, eAl, r8, ueg, r16, ue1, ue2});
    }

    public static final void A01(C15483UdY udY) {
        C15483UdY udY2 = udY;
        udY.clear();
        C15952UlT ulT = udY.A06;
        ulT.A06();
        C15952UlT ulT2 = udY.A07;
        ulT2.A06();
        C3034368u r2 = udY.A03.A00;
        if (r2 != null) {
            udY.addModel(r2, udY.A02);
        }
        if (!udY.isEmpty()) {
            ULC ulc = new ULC((C376699Iz) null, (FiltersLoggingInfo) null, "saved_products_collection", (String) null, (String) null);
            int A022 = ulT.A02();
            for (int i = 0; i < A022; i++) {
                List list = ulT.A01;
                0qQ.A0B(list, 0);
                C3251571g r10 = new C3251571g(list, i * 2, 2);
                if (r10.A01() == 2 || !udY2.A09.CKB()) {
                    Map map = udY2.A0B;
                    Vz5 vz5 = (Vz5) map.get(AnonymousClass7TF.A0h(r10));
                    if (vz5 == null) {
                        vz5 = new Vz5(r10);
                        map.put(AnonymousClass7TF.A0h(r10), vz5);
                    }
                    AnonymousClass6u8 r5 = vz5.A00;
                    boolean z = true;
                    if (udY2.A09.CKB() || i != ulT.A02() - 1) {
                        z = false;
                    }
                    r5.A00(i, z);
                    udY2.addModel(new C19278WSl(ProductCardSubtitleType.PRICE_WITH_MERCHANT_OVERLAY, C16675UzB.SAVED, vz5, ulc, r10, (String) null, (String) null, (Set) null, i, 130816), (Object) null, udY2.A00);
                }
            }
            udY2.A00();
            C229122ms r22 = udY2.A09;
            if (r22.CKB() || r22.CT5() || udY2.A05.A06) {
                udY2.addModel(r22, udY2.A0A);
            }
        } else if (udY.A09.isLoading()) {
            udY.addModel((Object) null, new C15810Uit((List) null, (DefaultConstructorMarker) null, 1), udY.A01);
        } else {
            C20988X8e x8e = udY.A04;
            C3253572b Afm = x8e.Afm();
            if (ulT2.A02() != 0) {
                Afm.A0P = true;
                Afm.A0L = true;
                Afm.A0N = true;
            }
            udY.addModel(Afm, x8e.B0w(), udY.A08);
            udY.A00();
        }
        udY2.notifyDataSetChanged();
    }

    private final void A00() {
        C15952UlT ulT = this.A07;
        int size = ulT.A01.size();
        for (int i = 0; i < size; i++) {
            MultiProductComponent multiProductComponent = ((ProductFeedItem) ulT.A01.get(i)).A01;
            if (multiProductComponent != null && multiProductComponent.A02 == C16671Uz7.HSCROLL) {
                addModel(C46568DhA.FULL_WIDTH, this.A0E);
                Map map = this.A0C;
                Object obj = map.get(multiProductComponent.A06);
                if (obj == null) {
                    obj = new C17524VZd(multiProductComponent, i);
                    map.put(multiProductComponent.A06, obj);
                }
                addModel(multiProductComponent, obj, this.A0D);
            }
        }
    }

    public final boolean isEmpty() {
        if (this.A06.A02() == 0) {
            return true;
        }
        return false;
    }

    public final void EZ4(int i) {
        A01(this);
    }
}
