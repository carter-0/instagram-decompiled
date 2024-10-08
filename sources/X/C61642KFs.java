package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.bottomsheet.mixed.model.EffectsMixedAttributionModel;
import com.instagram.ui.bottomsheet.mixed.model.MixedAttributionModel;

/* renamed from: X.KFs  reason: case insensitive filesystem */
public final class C61642KFs extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final C331157Pu A02;
    public final LB9 A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        MixedAttributionModel mixedAttributionModel = (MixedAttributionModel) r4;
        C60625JoY joY = (C60625JoY) r5;
        ImageUrl imageUrl = mixedAttributionModel.A02;
        if (imageUrl != null) {
            joY.A02.A00.setUrl(imageUrl, this.A01);
        }
        LY5.A01(joY.A02.A00, 9, this);
        C63464KxT.A00(this.A00, this.A02, this.A03, joY, mixedAttributionModel);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60625JoY(DbT.A0C(layoutInflater, viewGroup, R.layout.mixed_attribution_list_row));
    }

    public final Class modelClass() {
        return EffectsMixedAttributionModel.class;
    }

    public C61642KFs(Context context, AnonymousClass0iw r2, C331157Pu r3, LB9 lb9) {
        this.A00 = context;
        this.A02 = r3;
        this.A03 = lb9;
        this.A01 = r2;
    }
}
