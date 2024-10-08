package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

public final class IPR implements JPH {
    public final AnonymousClass4DH A00;
    public final C53335GmL A01;
    public final C52971GgO A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C249763kK A05;
    public final C62320sa A06;
    public final C62320sa A07;

    public final /* bridge */ /* synthetic */ void ADn(View view, Object obj) {
        View view2 = view;
        C334337b6.A00.A07(view2, this.A00, this.A01, this.A02, this.A03, (IgLinearLayout) null, this.A04, this.A05, this.A07, this.A06);
    }

    public IPR(AnonymousClass4DH r2, C53335GmL gmL, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r6, C249763kK r7, C62320sa r8, C62320sa r9) {
        AnonymousClass7TG.A1P(userSession, ggO);
        AnonymousClass7TF.A1F(gmL, 7, r7);
        this.A03 = userSession;
        this.A00 = r2;
        this.A02 = ggO;
        this.A07 = r8;
        this.A06 = r9;
        this.A04 = r6;
        this.A01 = gmL;
        this.A05 = r7;
    }

    public final View ANI(Context context) {
        View A08 = DbU.A08(LayoutInflater.from(context), R.layout.comment_composer_container);
        0qQ.A07(A08);
        return A08;
    }
}
