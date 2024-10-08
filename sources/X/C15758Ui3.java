package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Ui3  reason: case insensitive filesystem */
public final class C15758Ui3 extends C232222tE {
    public final C15335Uak A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new UC5(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.full_screen_text_only_empty_state, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        KGI kgi = (KGI) r4;
        UC5 uc5 = (UC5) r5;
        AnonymousClass7TG.A1N(kgi, uc5);
        IgTextView igTextView = uc5.A00;
        igTextView.setText(C56259HvT.A00(C66580MXl.A0B(igTextView), kgi.A00));
        C15335Uak uak = this.A00;
        C17052VGa.A00(AnonymousClass7TE.A0l(uak.A0K)).A03(DbS.A0t(uak.A0C));
    }

    public final Class modelClass() {
        return KGI.class;
    }

    public C15758Ui3(C15335Uak uak) {
        this.A00 = uak;
    }
}
