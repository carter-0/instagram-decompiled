package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public final class EGB extends C232222tE {
    public final C320336sD A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46978DoW(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_clips_grid_drafts_header_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        String string;
        EGV egv = (EGV) r7;
        C46978DoW doW = (C46978DoW) r8;
        AnonymousClass7TG.A1N(egv, doW);
        ViewGroup viewGroup = doW.A00;
        Context context = viewGroup.getContext();
        C49455Evw evw = egv.A00;
        int i = evw.A00;
        Resources resources = context.getResources();
        if (i > 0) {
            string = DbY.A0d(resources, i, R.plurals.clips_profile_tab_drafts_entry_point_title);
        } else {
            string = resources.getString(2131955621);
        }
        0qQ.A0A(string);
        doW.A02.setText(string);
        DbT.A18(context, doW.A01, 2131955620);
        ImageUrl imageUrl = evw.A01;
        if (imageUrl != null) {
            doW.A03.setUrl(imageUrl, this.A01);
        }
        C50109FOz.A00(viewGroup, 29, this);
    }

    public final Class modelClass() {
        return EGV.class;
    }

    public EGB(C320336sD r1, AnonymousClass0iw r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
