package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EFu  reason: case insensitive filesystem */
public final class C47760EFu extends C232222tE {
    public final K4C A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        FYF fyf = (FYF) r6;
        C46944Dny dny = (C46944Dny) r7;
        AnonymousClass7TG.A1N(fyf, dny);
        AnonymousClass0eM r4 = dny.A01;
        Context context = AnonymousClass7TE.A0c(r4).getContext();
        int i = fyf.A01;
        0qQ.A0A(context);
        ((TextView) r4.getValue()).setText(AnonymousClass7TF.A0d(context.getResources(), i));
        DbT.A17(context, (TextView) r4.getValue(), fyf.A00);
        FPF.A00(AnonymousClass7TE.A0c(r4), 58, fyf, this);
    }

    public final Class modelClass() {
        return FYF.class;
    }

    public C47760EFu(K4C k4c) {
        this.A00 = k4c;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46944Dny(DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_section_action_item, false));
    }
}
