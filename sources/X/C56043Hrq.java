package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.ProductWrapperIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hrq  reason: case insensitive filesystem */
public final class C56043Hrq {
    public String A00;
    public C55658HlH A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final String A05;
    public final AnonymousClass0eM A06 = C58674Ivj.A00(this, 13);
    public final AnonymousClass0eM A07 = C58674Ivj.A00(this, 14);
    public final 2el A08;
    public final C62320sa A09;

    public C56043Hrq(FragmentActivity fragmentActivity, UserSession userSession, 2el r4, AnonymousClass4DU r5, String str, String str2, C62320sa r8) {
        0qQ.A0B(str, 6);
        this.A02 = fragmentActivity;
        this.A04 = r5;
        this.A03 = userSession;
        this.A08 = r4;
        this.A09 = r8;
        this.A05 = str;
        this.A00 = str2;
        this.A01 = new C55658HlH(userSession, r4);
    }

    public final void A00(1Xj r12, AnonymousClass3W1 r13, User user) {
        0qQ.A0B(user, 0);
        C249713kF r1 = C249713kF.A00;
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A03;
        AnonymousClass4DU r5 = this.A04;
        String str = this.A00;
        String str2 = this.A05;
        String A002 = AnonymousClass3ZA.A00(user);
        0qQ.A0A(A002);
        String username = user.A03.getUsername();
        0qQ.A0A(username);
        W2P A0N = r1.A0N(fragmentActivity, user.A03.BsB(), userSession, r5, str, str2, "shopping_reels_cta", A002, username);
        A0N.A03 = r12;
        A0N.A0I = VKF.A00.A03(r12, user, r13.A03);
        A0N.A05();
    }

    public final void A01(1Xj r12, AnonymousClass3W1 r13, String str) {
        ClipsShoppingInfoIntf Btl;
        String str2;
        ProductDetailsProductItemDictIntf Bg5;
        User BRo;
        1Xj r4 = r12;
        C249713kF.A00.A0t(this.A02, this.A03, r4, this.A04, r13, (C65754Lz8) this.A07.getValue(), this.A00, this.A05, str);
        C55656HlF hlF = (C55656HlF) this.A06.getValue();
        C67231sQ A0n = C51966G9m.A0n(r12);
        if (A0n != null && (Btl = A0n.Btl()) != null) {
            ProductCollection Aoo = Btl.Aoo();
            List<ProductWrapperIntf> Bga = Btl.Bga();
            if (Bga != null) {
                1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e((0wc) hlF.A01.getValue(), C273654mx.A00(2884)), 322);
                String id = r12.getId();
                String str3 = "";
                if (id == null) {
                    id = str3;
                }
                A0U.A0m(id);
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (ProductWrapperIntf Bg52 : Bga) {
                    ProductDetailsProductItemDictIntf Bg53 = Bg52.Bg5();
                    if (Bg53 != null) {
                        A1C.add(C14502TxO.A00(Bg53));
                    }
                }
                A0U.A00.A9H("product_merchant_ids", C294165ly.A0D(A1C));
                boolean z = false;
                ProductWrapperIntf productWrapperIntf = (ProductWrapperIntf) 00k.A0O(Bga, 0);
                0bb r2 = null;
                if (productWrapperIntf == null || (Bg5 = productWrapperIntf.Bg5()) == null || (BRo = Bg5.BRo()) == null) {
                    str2 = null;
                } else {
                    str2 = AnonymousClass3ZA.A00(BRo);
                }
                A0U.A0e(C263944Ny.A00(str2));
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (ProductWrapperIntf Bg54 : Bga) {
                    ProductDetailsProductItemDictIntf Bg55 = Bg54.Bg5();
                    if (Bg55 != null) {
                        A1C2.add(Bg55);
                    }
                }
                if (!(A1C2 instanceof Collection) || !A1C2.isEmpty()) {
                    Iterator it = A1C2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C14502TxO.A00((ProductDetailsProductItemDictIntf) it.next()).A04()) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                A0U.A0O("is_checkout_enabled", Boolean.valueOf(z));
                A0U.A0R("shopping_session_id", hlF.A00);
                if (Aoo != null) {
                    0bb r1 = new 0bb();
                    String Aoi = Aoo.Aoi();
                    if (Aoi != null) {
                        str3 = Aoi;
                    }
                    r1.A06(C273654mx.A00(88), str3);
                    ProductCollectionV2Type Aou = Aoo.Aou();
                    if (Aou != null) {
                        r2 = Aou.toString();
                    }
                    r1.A06(C273654mx.A00(176), r2);
                    r2 = r1;
                }
                A0U.A0N(r2, C273654mx.A00(255));
                A0U.Cgf();
            }
        }
    }
}
