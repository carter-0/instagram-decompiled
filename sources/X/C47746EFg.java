package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.EFg  reason: case insensitive filesystem */
public final class C47746EFg extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46962DoG(DbT.A0D(layoutInflater, viewGroup, R.layout.fan_club_gifting_price_button, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C47241DtS dtS = (C47241DtS) r5;
        C46962DoG doG = (C46962DoG) r6;
        boolean A1Z = AnonymousClass7TG.A1Z(dtS, doG);
        doG.A01.setText(dtS.A00);
        doG.A02.setText(dtS.A01);
        View view = doG.A00;
        boolean z = dtS.A03;
        view.setEnabled(z);
        FP1.A01(view, 2, dtS);
        float f = 0.7f;
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
        view.setFocusable(A1Z);
    }

    public final Class modelClass() {
        return C47241DtS.class;
    }
}
