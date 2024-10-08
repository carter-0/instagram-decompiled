package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;

public final class NQ3 extends C232232tF {
    public final Context A00;
    public final O7S A01;
    public final C294875nB A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        NP5 np5 = (NP5) r4;
        C67933MxJ mxJ = (C67933MxJ) r5;
        boolean A1Z = AnonymousClass7TG.A1Z(np5, mxJ);
        List list = np5.A00;
        0qQ.A0B(list, A1Z ? 1 : 0);
        C67799Mv3 mv3 = mxJ.A00.A0A;
        0qQ.A0C(mv3, "null cannot be cast to non-null type com.instagram.ui.search.recyclerview.DirectInboxSearchPromptAdapter");
        mv3.A00 = list;
    }

    public final Class modelClass() {
        return NP5.class;
    }

    public NQ3(Context context, O7S o7s, C294875nB r3, boolean z) {
        C51972G9s.A1B(context, r3);
        this.A00 = context;
        this.A03 = z;
        this.A01 = o7s;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        Context context = this.A00;
        boolean z = this.A03;
        O7S o7s = this.A01;
        C294875nB r4 = this.A02;
        C51973G9u.A0r(0, context, o7s, r4);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.search_header, false);
        RecyclerView recyclerView = new C67933MxJ(A09).A00;
        DbV.A1A(A09.getContext(), recyclerView);
        recyclerView.setAdapter(new C67799Mv3(context, o7s, r4, z));
        recyclerView.setVisibility(0);
        0nA.A0c(recyclerView, DbY.A01(context));
        return new C67933MxJ(A09);
    }
}
