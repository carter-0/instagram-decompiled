package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class KF8 extends C232222tE {
    public final C63583KzW A00;

    public KF8(C63583KzW kzW) {
        0qQ.A0B(kzW, 1);
        this.A00 = kzW;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60648Jov(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_pack_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        SpinnerImageView spinnerImageView;
        C255943uy r0;
        int intValue;
        LiQ liQ = (LiQ) r7;
        C60648Jov jov = (C60648Jov) r8;
        AnonymousClass7TF.A1H(liQ, jov);
        jov.A02.setText(liQ.A05);
        Integer num = liQ.A00;
        if (num != null && (intValue = num.intValue()) > 0) {
            ((TextView) jov.A03.getView()).setText(DbV.A0v(jov.itemView.getResources(), num, R.plurals.appreciation_funding_bonus_amount, intValue));
        }
        boolean z = liQ.A06;
        IgTextView igTextView = jov.A01;
        if (z) {
            igTextView.setVisibility(8);
            spinnerImageView = jov.A04;
            r0 = C255943uy.LOADING;
        } else {
            igTextView.setText(liQ.A02);
            igTextView.setVisibility(0);
            spinnerImageView = jov.A04;
            r0 = C255943uy.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(r0);
        IgLinearLayout igLinearLayout = jov.A00;
        2eS.A02(igLinearLayout, jov.itemView.getResources().getString(2131953015));
        igLinearLayout.setContentDescription(liQ.A01);
        LY8.A00(igLinearLayout, 9, liQ, this);
    }

    public final Class modelClass() {
        return LiQ.class;
    }
}
