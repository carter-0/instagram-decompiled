package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EFl  reason: case insensitive filesystem */
public final class C47751EFl extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46927Dnh(DbT.A0D(layoutInflater, viewGroup, R.layout.transparency_text_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C47764EGb eGb = (C47764EGb) r5;
        C46927Dnh dnh = (C46927Dnh) r6;
        AnonymousClass7TG.A1N(eGb, dnh);
        IgTextView igTextView = dnh.A00;
        String str = eGb.A02;
        SpannableStringBuilder A0C = DbS.A0C(eGb.A01);
        AnonymousClass7AV.A05(A0C, eGb.A00, str);
        DbX.A1G(igTextView, A0C);
    }

    public final Class modelClass() {
        return C47764EGb.class;
    }
}
