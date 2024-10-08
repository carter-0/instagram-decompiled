package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.igds.components.button.IgdsButton;

public final class EH5 extends C232232tF {
    public final 0sP A00;
    public final 0sL A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47021DpD(DbT.A0D(layoutInflater, viewGroup, R.layout.directshare_row_user, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) r4;
        C47021DpD dpD = (C47021DpD) r5;
        AnonymousClass7TF.A1H(directInviteContactViewModel, dpD);
        0sL r0 = this.A01;
        View view = dpD.A00;
        r0.invoke(directInviteContactViewModel, view);
        FPE.A01(view, 49, directInviteContactViewModel, this);
        dpD.A05.setVisibility(8);
        IgSimpleImageView igSimpleImageView = dpD.A03;
        igSimpleImageView.setVisibility(0);
        igSimpleImageView.setImageResource(directInviteContactViewModel.A02);
        TextView textView = dpD.A02;
        textView.setText(directInviteContactViewModel.A07);
        DbY.A12(textView, textView.getContext());
        TextView textView2 = dpD.A01;
        textView2.setVisibility(0);
        textView2.setText(directInviteContactViewModel.A06);
        DbY.A11(textView2, textView2.getContext());
        IgdsButton igdsButton = dpD.A04;
        igdsButton.setVisibility(0);
        igdsButton.setText(directInviteContactViewModel.A01);
        FPE.A01(igdsButton, 50, directInviteContactViewModel, this);
    }

    public final Class modelClass() {
        return DirectInviteContactViewModel.class;
    }

    public EH5(0sP r1, 0sL r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
