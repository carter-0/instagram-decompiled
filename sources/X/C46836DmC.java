package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DmC  reason: case insensitive filesystem */
public final class C46836DmC extends 2Rw {
    public List A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void onBindViewHolder(C249703kE r8, int i) {
        0qQ.A0B(r8, 0);
        C48257Ebc ebc = C48098EVq.values()[getItemViewType(i)].A00;
        List list = this.A00;
        UserSession userSession = this.A02;
        ebc.A01(r8, this.A01, userSession, list, i);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return C48098EVq.values()[i].A00.A00(viewGroup);
    }

    public C46836DmC(AnonymousClass0iw r1, UserSession userSession, List list) {
        AnonymousClass7TG.A1O(list, userSession);
        this.A02 = userSession;
        this.A01 = r1;
        this.A00 = list;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-552152904);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(2127948308, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        C48098EVq eVq;
        int A03 = AnonymousClass0fD.A03(1386806774);
        Object A0n = DbX.A0n(this.A00, i);
        if (A0n instanceof C46448DfA) {
            eVq = C48098EVq.A04;
        } else if (A0n instanceof C50989Fmc) {
            eVq = C48098EVq.A05;
        } else if (A0n instanceof C49324Etf) {
            eVq = C48098EVq.A03;
        } else {
            throw AnonymousClass7TE.A0w("Unsupported item type");
        }
        int ordinal = eVq.ordinal();
        AnonymousClass0fD.A0A(452110619, A03);
        return ordinal;
    }
}
