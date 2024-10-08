package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.NNe  reason: case insensitive filesystem */
public final class C68557NNe extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67963Mxn(DbT.A0D(layoutInflater, viewGroup, R.layout.card_gallery_title_card_layout, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C68193N5i n5i = (C68193N5i) r4;
        C67963Mxn mxn = (C67963Mxn) r5;
        AnonymousClass7TG.A1N(n5i, mxn);
        mxn.A02.setText(n5i.A02);
        mxn.A01.setText(n5i.A01);
        Integer num = n5i.A00;
        if (num != null) {
            int intValue = num.intValue();
            IgSimpleImageView igSimpleImageView = mxn.A00;
            igSimpleImageView.setImageResource(intValue);
            igSimpleImageView.setVisibility(0);
        }
    }

    public final Class modelClass() {
        return C68193N5i.class;
    }
}
