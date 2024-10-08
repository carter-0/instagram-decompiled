package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DmE  reason: case insensitive filesystem */
public final class C46838DmE extends 2Rw {
    public List A00 = 0sn.A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void onBindViewHolder(C249703kE r8, int i) {
        0qQ.A0B(r8, 0);
        C48257Ebc ebc = C48094EVm.values()[getItemViewType(i)].A00;
        List list = this.A00;
        UserSession userSession = this.A02;
        ebc.A01(r8, this.A01, userSession, list, i);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return C48094EVm.values()[i].A00.A00(viewGroup);
    }

    public C46838DmE(AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1305103358);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(298397061, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        C48094EVm eVm;
        int A03 = AnonymousClass0fD.A03(-969903628);
        Object A0n = DbX.A0n(this.A00, i);
        if (C53398GnV.A00(4, A0n)) {
            eVm = C48094EVm.A03;
        } else if (C61037Jvb.A00(8, A0n)) {
            eVm = C48094EVm.A04;
        } else {
            throw AnonymousClass7TE.A0w("Unsupported item type");
        }
        int ordinal = eVm.ordinal();
        AnonymousClass0fD.A0A(321839275, A03);
        return ordinal;
    }
}
