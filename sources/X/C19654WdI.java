package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.WdI  reason: case insensitive filesystem */
public final class C19654WdI implements XC9 {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final AnonymousClass4DU A03;
    public final C231332rR A04;
    public final C231052qn A05;
    public final C249763kK A06;
    public final String A07;

    public final void A9t(ProductFeedItem productFeedItem, C268374dH r4, C17524VZd vZd) {
        0qQ.A0B(productFeedItem, 1);
        C231052qn r1 = this.A05;
        String id = r4.getId();
        0qQ.A07(id);
        r1.A02(productFeedItem, vZd, id);
    }

    public final void DZh(C268374dH r1, X52 x52, Product product, int i, int i2) {
    }

    public final void APY(C268374dH r9, int i) {
        AnonymousClass4DU r2 = this.A03;
        UserSession userSession = this.A01;
        W3r.A0E(userSession, r2, r9, this.A06.getSessionId(), this.A07, r9.Bxn(), i);
        Map map = C268334dD.A00(userSession).A00;
        String Bxn = r9.Bxn();
        if (Bxn != null) {
            map.remove(Bxn);
            this.A04.AV9();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final XC8 Bg8() {
        return this.A02.Bg8();
    }

    public final void DZb(0xF r26, ProductFeedItem productFeedItem, C268374dH r28, String str, String str2, int i, int i2, int i3) {
        Product product;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            ProductFeedItem productFeedItem2 = productFeedItem;
            ProductTile productTile = productFeedItem2.A02;
            if ((productTile != null && (product = productTile.A07) != null) || (product = productFeedItem2.A02()) != null) {
                UserSession userSession = this.A01;
                AnonymousClass4DU r5 = this.A03;
                String str3 = this.A07;
                C18061Vkn A022 = new C231112qt(r5, userSession, str3, (String) null, (String) null, r5.getModuleName(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1).A02(productFeedItem2, i, i2);
                A022.A01(r28);
                A022.A02(Integer.valueOf(i3), str2);
                A022.A00();
                C249713kF r18 = C249713kF.A00;
                String str4 = str;
                if (str != null) {
                    WNN.A01(r18.A0L(activity, userSession, r5, product, str4, str3));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void DZj(C268374dH r11, X53 x53, Product product, Integer num, String str, int i, int i2) {
        String A002;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            UserSession userSession = this.A01;
            AnonymousClass4DU r7 = this.A03;
            FragmentActivity fragmentActivity = activity;
            C231142qw A012 = C231132qv.A01(activity, fragmentActivity, userSession, r7, r7.getModuleName(), this.A07);
            User user = product.A0B;
            if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
                throw AnonymousClass7TE.A0y();
            }
            C18591Vui vui = new C18591Vui((1Xj) null, A012, product, A002);
            String id = r11.getId();
            vui.A06 = id;
            vui.A08 = id;
            vui.A05 = x53;
            vui.A00();
        }
    }

    public final void EBy(View view, ProductFeedItem productFeedItem, String str) {
        this.A05.A00(view, productFeedItem, str);
    }

    public C19654WdI(Fragment fragment, UserSession userSession, AnonymousClass311 r3, AnonymousClass4DU r4, C231332rR r5, C231052qn r6, C249763kK r7, String str) {
        AnonymousClass7TG.A1S(r6, r7);
        this.A02 = r3;
        this.A01 = userSession;
        this.A03 = r4;
        this.A00 = fragment;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = str;
        this.A04 = r5;
    }
}
