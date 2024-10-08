package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;
import com.instagram.ui.bottomsheet.mixed.model.MusicMixedAttributionModel;

/* renamed from: X.KFt  reason: case insensitive filesystem */
public final class C61643KFt extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final C331157Pu A02;
    public final LB9 A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        MixedAttributionModel mixedAttributionModel = (MixedAttributionModel) r4;
        C60625JoY joY = (C60625JoY) r5;
        JYP.A02(mixedAttributionModel.A02, joY.A02.A00, this.A01);
        C63464KxT.A00(this.A00, this.A02, this.A03, joY, mixedAttributionModel);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60625JoY(DbT.A0C(layoutInflater, viewGroup, R.layout.mixed_attribution_list_row));
    }

    public final Class modelClass() {
        return MusicMixedAttributionModel.class;
    }

    public C61643KFt(Context context, AnonymousClass0iw r2, C331157Pu r3, LB9 lb9) {
        this.A00 = context;
        this.A02 = r3;
        this.A03 = lb9;
        this.A01 = r2;
    }
}
