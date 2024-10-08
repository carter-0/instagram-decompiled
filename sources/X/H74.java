package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Locale;

public final class H74 extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53147GjJ(DbT.A0D(layoutInflater, viewGroup, R.layout.translation_attribution_row, false), this);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        String str;
        C57087IOb iOb = (C57087IOb) r6;
        C53147GjJ gjJ = (C53147GjJ) r7;
        AnonymousClass7TF.A1H(iOb, gjJ);
        View view = gjJ.itemView;
        String str2 = iOb.A00;
        if (str2 == null || (str = C51966G9m.A1G(DbW.A0o(str2, "_"), 0)) == null) {
            str = "";
        }
        Locale locale = new Locale(str);
        gjJ.A00.setText(iOb.A02);
        TextView textView = gjJ.A01;
        Resources resources = view.getResources();
        textView.setText(AnonymousClass7TF.A0e(resources, locale.getDisplayName(), 2131975515));
        gjJ.A03.setText(iOb.A03);
        DbU.A1A(resources, gjJ.A02, 2131975516);
    }

    public final Class modelClass() {
        return C57087IOb.class;
    }
}
