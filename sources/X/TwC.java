package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public final class TwC extends C232232tF {
    public final Fragment A00;
    public final C14140Tqa A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        UDC udc = (UDC) r9;
        C232262tL r3 = r8;
        AnonymousClass7TG.A1N(r8, udc);
        Fragment fragment = this.A00;
        C14140Tqa tqa = this.A01;
        AnonymousClass7TG.A1Q(fragment, tqa);
        0xG r5 = new 0xG("search_typeahead_large");
        tqa.A07(r5);
        AnonymousClass0fU.A00(new WBF(17, (Object) r3, (Object) tqa, (Object) r5, (Object) fragment), udc.A01);
        AnonymousClass0fU.A00(new WBF(18, (Object) r3, (Object) tqa, (Object) r5, (Object) fragment), udc.A00);
    }

    public final Class modelClass() {
        return C16189UqE.class;
    }

    public TwC(Fragment fragment, C14140Tqa tqa) {
        this.A01 = tqa;
        this.A00 = fragment;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new UDC(DbT.A0D(layoutInflater, viewGroup, R.layout.megaphone_search_upsell, false));
    }
}
