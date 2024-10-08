package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.business.ProfileAddressData;

/* renamed from: X.EGz  reason: case insensitive filesystem */
public final class C47788EGz extends C232232tF {
    public final E3G A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46994Dom(DbT.A0D(layoutInflater, viewGroup, R.layout.profile_multiple_addresses_edit_list_address_item_view_holder, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        IgTextView igTextView;
        C47232DtJ dtJ = (C47232DtJ) r8;
        C46994Dom dom = (C46994Dom) r9;
        int i = 0;
        AnonymousClass7TF.A1H(dtJ, dom);
        ProfileAddressData profileAddressData = dtJ.A00;
        String str = profileAddressData.A03;
        String A05 = AnonymousClass703.A05(dom.A00, (String) null, profileAddressData.A08, profileAddressData.A05);
        0qQ.A07(A05);
        int i2 = 0;
        if (str == null || str.length() <= 0) {
            i = 8;
            dom.A03.setText(A05);
            igTextView = dom.A02;
        } else {
            dom.A03.setText(str);
            igTextView = dom.A02;
            igTextView.setText(A05);
        }
        igTextView.setVisibility(i);
        IgTextView igTextView2 = dom.A01;
        if (!0qQ.A0K(profileAddressData.A06, "primary")) {
            i2 = 8;
        }
        igTextView2.setVisibility(i2);
        FPG.A00(dom.itemView, 34, dtJ, this);
    }

    public final Class modelClass() {
        return C47232DtJ.class;
    }

    public C47788EGz(E3G e3g) {
        this.A00 = e3g;
    }
}
