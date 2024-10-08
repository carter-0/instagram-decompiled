package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class KFS extends C232222tE {
    public final C63585KzY A00;
    public final AnonymousClass0iw A01;

    public KFS(C63585KzY kzY, AnonymousClass0iw r3) {
        0qQ.A0B(kzY, 2);
        this.A01 = r3;
        this.A00 = kzY;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60649Jow(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_gifting_creator_header, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        int i;
        KGL kgl = (KGL) r7;
        C60649Jow jow = (C60649Jow) r8;
        AnonymousClass7TF.A1H(kgl, jow);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = jow.A04;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, this.A01, kgl.A01);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        jow.A01.setText(kgl.A02);
        IgTextView igTextView = jow.A02;
        igTextView.setText(kgl.A03);
        LYC.A00(jow.A00, 19, this);
        View view = jow.itemView;
        Context context = view.getContext();
        int A0B = AnonymousClass7TE.A0B(view.getResources());
        boolean z = kgl.A04;
        if (z) {
            i = 0;
        } else {
            i = kgl.A00;
        }
        igTextView.setPadding(A0B, 0, A0B, i);
        if (z) {
            C252063oV r2 = jow.A03;
            r2.getView().setPadding(0, A0B, 0, kgl.A00);
            ((IgdsBanner) r2.getView()).setDividerColor(2Yu.A0H(context, R.attr.igds_color_elevated_separator));
        }
    }

    public final Class modelClass() {
        return KGL.class;
    }
}
