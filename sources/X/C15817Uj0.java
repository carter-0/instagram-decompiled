package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Uj0  reason: case insensitive filesystem */
public final class C15817Uj0 extends C232232tF {
    public final String A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C14824UBd(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_ads_consent_growth_bottomsheet_footer, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C15076UNt uNt = (C15076UNt) r7;
        C14824UBd uBd = (C14824UBd) r8;
        AnonymousClass7TG.A1N(uNt, uBd);
        String str = this.A00;
        TextView textView = uBd.A00;
        Context A0S = AnonymousClass7TE.A0S(textView);
        CharSequence A002 = C66909Mes.A00(A0S, (C266444Yx) uNt.A00.A00);
        if (A002.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (0qQ.A0K(str, "3pd_trial_inline_opt_in")) {
            AnonymousClass7AV.A07(new UsT(uNt, C13988Tno.A08(A0S)), textView, AnonymousClass7TE.A16(A0S, 2131952487), A002.toString());
            return;
        }
        textView.setText(A002);
    }

    public final Class modelClass() {
        return C15076UNt.class;
    }

    public C15817Uj0(String str) {
        this.A00 = str;
    }
}
