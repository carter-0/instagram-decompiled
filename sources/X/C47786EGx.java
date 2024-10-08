package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.business.ProfileAddressData;

/* renamed from: X.EGx  reason: case insensitive filesystem */
public final class C47786EGx extends C232232tF {
    public final E62 A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46968DoM(DbT.A0D(layoutInflater, viewGroup, R.layout.profile_multiple_addresses_bottomsheet_item_view_holder, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C47232DtJ dtJ = (C47232DtJ) r7;
        C46968DoM doM = (C46968DoM) r8;
        AnonymousClass7TF.A1H(dtJ, doM);
        ProfileAddressData profileAddressData = dtJ.A00;
        String str = profileAddressData.A03;
        String A05 = AnonymousClass703.A05(doM.A00, (String) null, profileAddressData.A08, profileAddressData.A05);
        0qQ.A07(A05);
        if (str == null || str.length() == 0) {
            doM.A02.setText(A05);
            doM.A01.setVisibility(8);
        } else {
            doM.A02.setText(str);
            IgTextView igTextView = doM.A01;
            igTextView.setText(A05);
            igTextView.setVisibility(0);
        }
        FPG.A00(doM.itemView, 32, dtJ, this);
    }

    public final Class modelClass() {
        return C47232DtJ.class;
    }

    public C47786EGx(E62 e62) {
        this.A00 = e62;
    }
}
