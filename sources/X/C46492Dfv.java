package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;

/* renamed from: X.Dfv  reason: case insensitive filesystem */
public final class C46492Dfv extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C294875nB A02;
    public final String A03 = "inbox_suggestion";

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        0qQ.A0B(r3, 0);
        C294875nB r1 = this.A02;
        0qQ.A0B(r1, 1);
        r1.DpD(r3.itemView);
    }

    public C46492Dfv(AnonymousClass0iw r2, UserSession userSession, C294875nB r4) {
        this.A01 = userSession;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r25, C249703kE r26) {
        C46500Dg3 dg3 = (C46500Dg3) r25;
        C47032DpO dpO = (C47032DpO) r26;
        AnonymousClass7TF.A1H(dg3, dpO);
        DirectShareTarget directShareTarget = dg3.A01;
        int i = dg3.A00;
        String A08 = directShareTarget.A08();
        if (A08 == null) {
            A08 = directShareTarget.A09();
            0qQ.A07(A08);
        }
        ArrayList A0B = directShareTarget.A0B();
        dpO.getBindingAdapterPosition();
        C67058MhZ mhZ = new C67058MhZ(i, A08, (String) null, A0B);
        UserSession userSession = this.A01;
        AnonymousClass0iw r4 = this.A00;
        C294875nB r8 = this.A02;
        String str = this.A03;
        boolean z = dg3.A08;
        boolean z2 = z;
        C48842El4.A00(r4, userSession, dpO, mhZ, r8, directShareTarget, str, dg3.A03, 6, i, i, 0, 0, z2, false, !dg3.A05, dg3.A04, false, dg3.A06, dg3.A07);
    }

    public final Class modelClass() {
        return C46500Dg3.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C47032DpO(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout, false));
    }
}
