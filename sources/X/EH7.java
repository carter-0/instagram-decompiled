package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.igds.components.button.IgdsButton;

public final class EH7 extends C232232tF {
    public final 0sP A00;
    public final 0sL A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47032DpO(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) r4;
        C47032DpO dpO = (C47032DpO) r5;
        AnonymousClass7TF.A1H(directInviteContactViewModel, dpO);
        0sL r0 = this.A01;
        ViewGroup viewGroup = dpO.A00;
        r0.invoke(directInviteContactViewModel, viewGroup);
        FPE.A01(viewGroup, 59, directInviteContactViewModel, this);
        dpO.A08.CLE();
        IgSimpleImageView igSimpleImageView = dpO.A05;
        igSimpleImageView.setVisibility(0);
        igSimpleImageView.setImageResource(directInviteContactViewModel.A02);
        dpO.A07.setText(directInviteContactViewModel.A07);
        dpO.A04.setText(directInviteContactViewModel.A06);
        dpO.A01.setVisibility(8);
        IgdsButton igdsButton = dpO.A09;
        igdsButton.setVisibility(0);
        igdsButton.setText(directInviteContactViewModel.A01);
        FPE.A01(igdsButton, 60, directInviteContactViewModel, this);
    }

    public final Class modelClass() {
        return DirectInviteContactViewModel.class;
    }

    public EH7(0sP r1, 0sL r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
