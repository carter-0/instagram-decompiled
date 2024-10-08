package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.discovery.refinement.model.Refinement;
import java.util.List;

public final class UA6 extends 2Rw {
    public C61078JwG A00;
    public final X45 A01;
    public final VS7 A02;

    public final void onBindViewHolder(C249703kE r6, int i) {
        List list;
        Refinement refinement;
        0qQ.A0B(r6, 0);
        getItemViewType(i);
        C14841UBv uBv = (C14841UBv) r6;
        C61078JwG jwG = this.A00;
        if (jwG == null || (list = (List) jwG.A00) == null || (refinement = (Refinement) list.get(i)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        String str = refinement.A01;
        0qQ.A07(str);
        uBv.A00.setText(str);
        VS7 vs7 = this.A02;
        vs7.A00.A05(uBv.itemView, DbU.A0a(vs7.A01, AnonymousClass30Y.A00(refinement, Integer.valueOf(i), refinement.A00())));
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        TextView A0E = C66582MXn.A0E(DbX.A0F(viewGroup, 0), viewGroup, R.layout.refinement_item, false);
        DbU.A11(A0E.getContext(), A0E, R.drawable.secondary_button_selector_panavision_soft_update);
        if (i == 0) {
            C14841UBv uBv = new C14841UBv(A0E);
            WBG.A01(A0E, 24, this, uBv);
            return uBv;
        }
        throw DbW.A0b("Invalid viewType ", i);
    }

    public UA6(X45 x45, VS7 vs7) {
        this.A01 = x45;
        this.A02 = vs7;
    }

    public final int getItemCount() {
        int i;
        List list;
        int A03 = AnonymousClass0fD.A03(1442127659);
        C61078JwG jwG = this.A00;
        if (jwG == null || (list = (List) jwG.A00) == null) {
            i = 0;
        } else {
            i = list.size();
        }
        AnonymousClass0fD.A0A(543238395, A03);
        return i;
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(40327909, AnonymousClass0fD.A03(1032773489));
        return 0;
    }
}
