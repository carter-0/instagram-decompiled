package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import java.util.List;

/* renamed from: X.Vcz  reason: case insensitive filesystem */
public final class C17730Vcz {
    public IgFundedIncentive A00;
    public MultiProductComponent A01;
    public C16599Uxt A02;
    public C16508Uw5 A03;
    public List A04;
    public List A05;
    public final Context A06;
    public final UO2 A07;
    public final UO2 A08 = new UO2((Integer) null, (Integer) null, "top_gap_view_model_key", R.dimen.abc_button_padding_horizontal_material);
    public final AnonymousClass2t9 A09;
    public final ShoppingCartFragment A0A;
    public final C3253572b A0B;
    public final C3253572b A0C;
    public final C3253572b A0D;
    public final boolean A0E;
    public final UserSession A0F;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.2tF, java.lang.Object] */
    public C17730Vcz(Context context, AnonymousClass0iw r6, C14819UAy uAy, UserSession userSession, ShoppingCartFragment shoppingCartFragment, boolean z) {
        DbW.A1N(userSession, 1, uAy);
        this.A0F = userSession;
        this.A06 = context;
        this.A0A = shoppingCartFragment;
        this.A0E = z;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new C15763Ui8(new C17269VOw(this)));
        A002.A01(new H7G(r6, shoppingCartFragment, AnonymousClass05K.A01));
        C13991Tnr.A1E(A002, new Object());
        A002.A01(new C15784UiT(r6, userSession, shoppingCartFragment));
        A002.A01(new Object());
        A002.A01(new Object());
        A002.A01(new C15790UiZ(r6, uAy, userSession, shoppingCartFragment));
        this.A09 = DbU.A0U(A002, new C15785UiU(r6, userSession, shoppingCartFragment));
        this.A07 = new UO2((Integer) null, (Integer) null, "bottom_gap_view_model_key", z ? R.dimen.abc_dropdownitem_icon_width : R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        C3253572b r1 = new C3253572b();
        r1.A00 = 2Yu.A00(context);
        this.A0D = r1;
        C3253572b r12 = new C3253572b();
        r12.A02 = R.drawable.loadmore_icon_refresh_compound;
        r12.A00 = 2Yu.A00(context);
        WBC.A01(r12, shoppingCartFragment, 27);
        this.A0C = r12;
        C3253572b r13 = new C3253572b();
        r13.A02 = R.drawable.instagram_shopping_cart_outline_96;
        r13.A0D = context.getString(2131973755);
        r13.A07 = context.getString(2131973754);
        r13.A0C = context.getString(2131973753);
        r13.A00 = 2Yu.A00(context);
        r13.A06 = shoppingCartFragment;
        this.A0B = r13;
        this.A03 = C16508Uw5.LOADING;
        this.A02 = C16599Uxt.A04;
    }
}
