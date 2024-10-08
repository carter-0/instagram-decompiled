package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

/* renamed from: X.Ui0  reason: case insensitive filesystem */
public final class C15755Ui0 extends C232222tE {
    public final C19560Wbk A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        C15806Uip uip = (C15806Uip) r14;
        UBR ubr = (UBR) r15;
        AnonymousClass7TF.A1H(uip, ubr);
        C19560Wbk wbk = this.A00;
        View view = ubr.itemView;
        0qQ.A06(view);
        MerchantShoppingCartFragment merchantShoppingCartFragment = wbk.A00;
        if (!AnonymousClass4KJ.A00(merchantShoppingCartFragment.A0a)) {
            merchantShoppingCartFragment.A0G.A00(merchantShoppingCartFragment.A0a, false);
            C17871VhO vhO = merchantShoppingCartFragment.A0G;
            C13988Tno.A14(view, vhO.A00, vhO.A01, 002.A0R("seller_funded_discounts_banner:", vhO.A02));
        }
        IgFundedIncentive igFundedIncentive = merchantShoppingCartFragment.A05;
        if (igFundedIncentive != null) {
            C17468VWv vWv = merchantShoppingCartFragment.A0H;
            String str = igFundedIncentive.A07;
            0qQ.A0B(str, 1);
            String A0T = 002.A0T("instagram_shopping_merchant_bag", str, '_');
            C229932oe r2 = vWv.A01;
            C13989Tnp.A1Q(vWv.A02, AnonymousClass30Y.A00(DbV.A0q(str), (Object) null, A0T), r2, A0T);
            C17468VWv vWv2 = merchantShoppingCartFragment.A0H;
            String str2 = merchantShoppingCartFragment.A05.A07;
            0qQ.A0B(str2, 2);
            vWv2.A00.A05(view, vWv2.A01.A00(002.A0T("instagram_shopping_merchant_bag", str2, '_')));
        }
        String str3 = uip.A00;
        if (str3 == null || str3.length() == 0) {
            ubr.A00.setText(uip.A01);
            return;
        }
        TextView textView = ubr.A00;
        String str4 = uip.A01;
        String A06 = 0mp.A06("%s %s", new Object[]{str4, str3});
        int A02 = DbV.A02(textView.getContext());
        AnonymousClass7AV.A07(new C15450Ud0(new 04x(16, str4), AnonymousClass05K.A01, wbk, str3, A02, 0), textView, str3, A06);
    }

    public final Class modelClass() {
        return C15806Uip.class;
    }

    public C15755Ui0(C19560Wbk wbk) {
        this.A00 = wbk;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.UBR, X.3kE] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.status_text_layout, false);
        ? r1 = new C249703kE(A0D);
        r1.A00 = DbW.A0B(A0D, R.id.status_text);
        return r1;
    }
}
