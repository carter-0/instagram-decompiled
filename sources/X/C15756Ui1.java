package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

/* renamed from: X.Ui1  reason: case insensitive filesystem */
public final class C15756Ui1 extends C232222tE {
    public final C19560Wbk A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        String str;
        C15809Uis uis = (C15809Uis) r11;
        UBZ ubz = (UBZ) r12;
        boolean A1Z = AnonymousClass7TG.A1Z(uis, ubz);
        C19560Wbk wbk = this.A00;
        View view = ubz.itemView;
        0qQ.A06(view);
        MerchantShoppingCartFragment merchantShoppingCartFragment = wbk.A00;
        if (!AnonymousClass4KJ.A00(merchantShoppingCartFragment.A0a)) {
            merchantShoppingCartFragment.A0G.A00(merchantShoppingCartFragment.A0a, A1Z);
            C17871VhO vhO = merchantShoppingCartFragment.A0G;
            C13988Tno.A14(view, vhO.A00, vhO.A01, 002.A0R("seller_funded_discounts_banner:", vhO.A02));
        }
        WBC.A00(ubz.A00, 30, wbk);
        ubz.A02.setText(uis.A02);
        String str2 = uis.A00;
        if (str2 == null || str2.length() == 0) {
            ubz.A01.setText(uis.A01);
            return;
        }
        String str3 = uis.A01;
        if (str3 == null || str3.length() == 0) {
            str = str2;
        } else {
            str = 0mp.A06("%s %s", new Object[]{str3, str2});
        }
        TextView textView = ubz.A01;
        int A02 = DbV.A02(textView.getContext());
        AnonymousClass7AV.A07(new C15450Ud0(new 04x(16, str), AnonymousClass05K.A01, wbk, str2, A02, A1Z ? 1 : 0), textView, str2, str);
    }

    public final Class modelClass() {
        return C15809Uis.class;
    }

    public C15756Ui1(C19560Wbk wbk) {
        this.A00 = wbk;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.UBZ, X.3kE] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.merchant_cart_offer_banner, false);
        ? r1 = new C249703kE(A0D);
        r1.A00 = (ViewGroup) A0D;
        r1.A03 = DbX.A0b(A0D, R.id.gift_card_icon);
        r1.A02 = AnonymousClass7TG.A0R(A0D, R.id.offer_banner_title);
        r1.A01 = AnonymousClass7TG.A0R(A0D, R.id.offer_banner_subtitle);
        return r1;
    }
}
