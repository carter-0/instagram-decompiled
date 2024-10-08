package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

public final class ICT implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ 1Xl A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ SourceModelInfoParams A05;

    public ICT(Fragment fragment, UserSession userSession, IgImageView igImageView, 1Xl r4, AnonymousClass4DU r5, SourceModelInfoParams sourceModelInfoParams) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A03 = r4;
        this.A05 = sourceModelInfoParams;
        this.A04 = r5;
        this.A02 = igImageView;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(794713184);
        Fragment fragment = this.A00;
        UserSession userSession = this.A01;
        1Xl r5 = this.A03;
        SourceModelInfoParams sourceModelInfoParams = this.A05;
        2EG r8 = 2EG.A27;
        C51969G9p.A1L(GT3.A00(fragment, userSession, this.A02, r5, this.A04, sourceModelInfoParams, r8, (String) null));
        AnonymousClass0fD.A0C(-2109162786, A052);
    }
}
