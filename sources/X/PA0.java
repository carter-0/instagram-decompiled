package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

public final class PA0 implements AnonymousClass7XP {
    public final /* synthetic */ C68493NKm A00;

    public PA0(C68493NKm nKm) {
        this.A00 = nKm;
    }

    public final void DRs(2FW r9, MessageIdentifier messageIdentifier, String str, String str2, long j) {
        C68493NKm nKm = this.A00;
        AnonymousClass7XP r1 = nKm.A05;
        if (r1 != null) {
            r1.DRs(r9, messageIdentifier, str, str2, j);
        }
        2Rw r0 = nKm.getRecyclerView().A0A;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }
}
