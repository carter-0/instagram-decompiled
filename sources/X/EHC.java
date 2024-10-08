package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.direct.DirectSearchPrompt;

public final class EHC extends C232232tF {
    public final Context A00;
    public final O7Q A01;
    public final C294875nB A02;
    public final String A03;

    public EHC(Context context, O7Q o7q, C294875nB r4) {
        String A002 = C66579MXk.A00(334);
        AnonymousClass7TG.A1P(context, r4);
        this.A00 = context;
        this.A01 = o7q;
        this.A02 = r4;
        this.A03 = A002;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r22, C249703kE r23) {
        FYH fyh = (FYH) r22;
        C47032DpO dpO = (C47032DpO) r23;
        AnonymousClass7TG.A1N(fyh, dpO);
        Context context = this.A00;
        DirectSearchPrompt directSearchPrompt = fyh.A03;
        int i = fyh.A00;
        int i2 = fyh.A01;
        int i3 = fyh.A02;
        C294875nB r11 = this.A02;
        O7Q o7q = this.A01;
        String str = this.A03;
        AnonymousClass7TF.A1E(context, 0, r11);
        AnonymousClass7TF.A1G(o7q, 8, str);
        dpO.A07.setText(directSearchPrompt.A03);
        dpO.A04.setVisibility(8);
        IgSimpleImageView igSimpleImageView = dpO.A06;
        igSimpleImageView.setImageResource(R.drawable.messenger_icons_gen_ai_ring_16);
        igSimpleImageView.setVisibility(0);
        ViewGroup viewGroup = dpO.A00;
        viewGroup.setPaddingRelative(DbS.A03(context.getResources(), R.dimen.action_bar_item_spacing_right), DbS.A03(context.getResources(), R.dimen.action_bar_item_spacing_right), 0, (int) DbU.A00(context, R.dimen.action_bar_item_spacing_right));
        AnonymousClass0fU.A00(new C71344Oit(i2, 2, directSearchPrompt, o7q), viewGroup);
        dpO.A08.CLE();
        View view = dpO.itemView;
        0qQ.A06(view);
        int i4 = i;
        r11.DpB(view, (C67058MhZ) null, directSearchPrompt, str, 41, i4, i2, i3, false);
    }

    public final Class modelClass() {
        return FYH.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47032DpO(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout, false));
    }
}
