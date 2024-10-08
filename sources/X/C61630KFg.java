package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.KFg  reason: case insensitive filesystem */
public final class C61630KFg extends C232222tE {
    public final C63679L2p A00;
    public final Context A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60600Jo9(DbT.A0D(layoutInflater, viewGroup, R.layout.iglive_post_live_section_header, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C64791LiB liB = (C64791LiB) r4;
        C60600Jo9 jo9 = (C60600Jo9) r5;
        AnonymousClass7TF.A1H(liB, jo9);
        jo9.A00.setText(liB.A00);
        IgdsButton igdsButton = jo9.A01;
        String str = liB.A02;
        if (str != null) {
            igdsButton.setText(str);
            igdsButton.setVisibility(0);
            LY7.A00(igdsButton, 60, liB, this);
            return;
        }
        igdsButton.setVisibility(8);
        igdsButton.setText("");
        igdsButton.setOnClickListener((View.OnClickListener) null);
    }

    public final Class modelClass() {
        return C64791LiB.class;
    }

    public C61630KFg(Context context, C63679L2p l2p) {
        this.A01 = context;
        this.A00 = l2p;
    }
}
