package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DmD  reason: case insensitive filesystem */
public final class C46837DmD extends 2Rw {
    public List A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void onBindViewHolder(C249703kE r8, int i) {
        0qQ.A0B(r8, 0);
        C48257Ebc ebc = EW7.values()[getItemViewType(i)].A00;
        List list = this.A00;
        UserSession userSession = this.A02;
        ebc.A01(r8, this.A01, userSession, list, i);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return EW7.values()[i].A00.A00(viewGroup);
    }

    public C46837DmD(AnonymousClass0iw r1, UserSession userSession, List list) {
        AnonymousClass7TG.A1O(list, userSession);
        this.A02 = userSession;
        this.A01 = r1;
        this.A00 = list;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(385662323);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1151882426, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        EW7 ew7;
        int A03 = AnonymousClass0fD.A03(908436402);
        Object A0n = DbX.A0n(this.A00, i);
        if (JV7.A00(20, A0n)) {
            ew7 = EW7.A03;
        } else if (C61084JwM.A04(23, A0n)) {
            ew7 = EW7.A09;
        } else if (JV7.A00(21, A0n)) {
            ew7 = EW7.A04;
        } else if (C47184Drz.A00(2, A0n)) {
            ew7 = EW7.A06;
        } else if (C47184Drz.A00(4, A0n)) {
            ew7 = EW7.A08;
        } else if (C47184Drz.A00(3, A0n)) {
            ew7 = EW7.A07;
        } else if (A0n instanceof C49324Etf) {
            ew7 = EW7.A05;
        } else {
            throw AnonymousClass7TE.A0w("Unsupported item type");
        }
        int ordinal = ew7.ordinal();
        AnonymousClass0fD.A0A(2068828962, A03);
        return ordinal;
    }
}
