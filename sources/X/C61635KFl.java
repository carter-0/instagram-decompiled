package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.bottomsheet.mixed.model.CameraFormatMixedAttributionModel;

/* renamed from: X.KFl  reason: case insensitive filesystem */
public final class C61635KFl extends C232222tE {
    public final Context A00;
    public final C331157Pu A01;
    public final LB9 A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        CameraFormatMixedAttributionModel cameraFormatMixedAttributionModel = (CameraFormatMixedAttributionModel) r4;
        C60625JoY joY = (C60625JoY) r5;
        joY.A02.A00.setImageDrawable(cameraFormatMixedAttributionModel.A00);
        C63464KxT.A00(this.A00, this.A01, this.A02, joY, cameraFormatMixedAttributionModel);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60625JoY(DbT.A0C(layoutInflater, viewGroup, R.layout.mixed_attribution_list_row));
    }

    public final Class modelClass() {
        return CameraFormatMixedAttributionModel.class;
    }

    public C61635KFl(Context context, C331157Pu r2, LB9 lb9) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = lb9;
    }
}
