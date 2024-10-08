package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EGm  reason: case insensitive filesystem */
public final class C47775EGm extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46940Dnu(DbT.A0D(layoutInflater, viewGroup, R.layout.subscription_list_education, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C47767EGe eGe = (C47767EGe) r5;
        C46940Dnu dnu = (C46940Dnu) r6;
        boolean A1Z = AnonymousClass7TG.A1Z(eGe, dnu);
        TextView textView = dnu.A01;
        Resources resources = dnu.A00.getResources();
        0qQ.A07(resources);
        C266444Yx r0 = eGe.A00;
        0qQ.A0B(r0, A1Z ? 1 : 0);
        textView.setText(r0.A00(resources));
    }

    public final Class modelClass() {
        return C47767EGe.class;
    }
}
