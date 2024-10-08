package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EFp  reason: case insensitive filesystem */
public final class C47755EFp extends C232222tE {
    public final EEP A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46985Dod(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_row_suggested_ssc_item, false));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C47768EGf eGf = (C47768EGf) r7;
        C46985Dod dod = (C46985Dod) r8;
        AnonymousClass7TG.A1N(eGf, dod);
        C266444Yx r2 = eGf.A01;
        0qQ.A0B(r2, 0);
        IgTextView igTextView = dod.A02;
        View view = dod.A01;
        Context A0S = AnonymousClass7TE.A0S(view);
        igTextView.setText(C66909Mes.A00(A0S, r2));
        dod.A00 = r2;
        int i = eGf.A00;
        Integer valueOf = Integer.valueOf(i);
        ? r1 = dod.A03;
        if (valueOf != null) {
            r1.setVisibility(0);
            DbU.A13(A0S, r1, i);
        } else {
            r1.setVisibility(8);
        }
        EEP eep = this.A00;
        0qQ.A0B(eep, 0);
        AnonymousClass0fU.A00(new FPI(eep, 66), view);
    }

    public final Class modelClass() {
        return C47768EGf.class;
    }

    public C47755EFp(EEP eep) {
        this.A00 = eep;
    }
}
