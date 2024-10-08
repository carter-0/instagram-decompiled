package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.NNv  reason: case insensitive filesystem */
public final class C68574NNv extends C232222tE {
    public final AnonymousClass0iw A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67995MyN(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_broadcast_channel_featured_event_banner, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        String str;
        C68205N5u n5u = (C68205N5u) r7;
        C67995MyN myN = (C67995MyN) r8;
        boolean A1U = AnonymousClass7TF.A1U(0, n5u, myN);
        IgImageView igImageView = myN.A03;
        igImageView.setVisibility(8);
        IgImageView igImageView2 = myN.A02;
        igImageView2.setVisibility(8);
        myN.A01.setText(n5u.A03);
        myN.A00.setText(n5u.A02);
        if (!n5u.A04) {
            igImageView2 = igImageView;
        }
        if ((AnonymousClass1GD.A03() && (str = n5u.A00) != null && C51966G9m.A1X(str) == A1U) || ((str = n5u.A01) != null && C51966G9m.A1X(str) == A1U)) {
            igImageView2.setUrl(DbS.A0V(str), this.A00);
            igImageView2.setVisibility(0);
        }
    }

    public final Class modelClass() {
        return C68205N5u.class;
    }

    public C68574NNv(AnonymousClass0iw r1) {
        this.A00 = r1;
    }
}
