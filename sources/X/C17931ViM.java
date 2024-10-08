package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;

/* renamed from: X.ViM  reason: case insensitive filesystem */
public final class C17931ViM {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C231112qt A03;
    public final C231142qw A04;
    public final C231052qn A05;
    public final String A06;
    public final String A07;
    public final X56 A08;

    public final void A00(ProductFeedItem productFeedItem, C268374dH r10, String str, String str2, int i, int i2, int i3) {
        C18061Vkn A022 = this.A03.A02(productFeedItem, i, i2);
        A022.A01(r10);
        A022.A02(Integer.valueOf(i3), str2);
        A022.A00();
        ProductTile productTile = productFeedItem.A02;
        if (productTile == null || C18768W0o.A01(productTile) == null) {
            C249713kF r1 = C249713kF.A00;
            FragmentActivity activity = this.A00.getActivity();
            activity.getClass();
            Product A023 = productFeedItem.A02();
            A023.getClass();
            WNN A0L = r1.A0L(activity, this.A01, this.A02, A023, str, this.A07);
            A0L.A0N = this.A06;
            WNN.A01(A0L);
            return;
        }
        C249713kF r4 = C249713kF.A00;
        FragmentActivity activity2 = this.A00.getActivity();
        activity2.getClass();
        r4.A10(activity2, this.A01, this.A02, C45683D1i.A00(C18768W0o.A01(productFeedItem.A02)));
    }

    public C17931ViM(Fragment fragment, UserSession userSession, AnonymousClass4DU r3, C231112qt r4, C231142qw r5, X56 x56, C231052qn r7, String str, String str2) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = r3;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = r5;
        this.A05 = r7;
        this.A08 = x56;
        this.A03 = r4;
    }
}
