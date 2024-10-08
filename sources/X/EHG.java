package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.igds.components.button.IgdsRadioButton;

public final class EHG extends C232232tF {
    public View A00;
    public final Context A01;
    public final E7Y A02;
    public final boolean A03;
    public final UserSession A04;

    public EHG(Context context, UserSession userSession, E7Y e7y, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = z;
        this.A02 = e7y;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        int color;
        HallPassViewModel hallPassViewModel = (HallPassViewModel) r9;
        C47023DpF dpF = (C47023DpF) r10;
        AnonymousClass7TF.A1H(hallPassViewModel, dpF);
        Context context = this.A01;
        boolean z = this.A03;
        E7Y e7y = this.A02;
        DbW.A1N(context, 0, e7y);
        int A012 = AnonymousClass0nB.A01(context) / 2;
        IgTextView igTextView = dpF.A05;
        igTextView.setText(hallPassViewModel.A05);
        FPF.A00(igTextView, 37, e7y, hallPassViewModel);
        igTextView.setMaxWidth(A012);
        int i = 8;
        dpF.A03.setVisibility(DbW.A00(z ? 1 : 0));
        dpF.A02.setVisibility(DbW.A01(z));
        IgdsRadioButton igdsRadioButton = dpF.A06;
        if (z) {
            i = 0;
        }
        igdsRadioButton.setVisibility(i);
        igdsRadioButton.setChecked(hallPassViewModel.A00);
        FPF.A00(dpF.A00, 38, e7y, hallPassViewModel);
        String str = hallPassViewModel.A03;
        if (!00l.A0W(str)) {
            color = Color.parseColor(str);
        } else {
            color = context.getColor(R.color.igds_gradient_lavender);
        }
        int A042 = 0nH.A04(color);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) AnonymousClass7TG.A07(context));
        gradientDrawable.setColor(color);
        igTextView.setTextColor(A042);
        dpF.A01.setBackground(gradientDrawable);
        IgTextView igTextView2 = dpF.A04;
        igTextView2.setText(DbY.A0d(context.getResources(), hallPassViewModel.A01, R.plurals.hall_pass_followers_count));
        FPF.A00(igTextView2, 36, e7y, hallPassViewModel);
    }

    public final Class modelClass() {
        return HallPassViewModel.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_hall_pass_row_item, false);
        this.A00 = A0D;
        return new C47023DpF(A0D);
    }
}
