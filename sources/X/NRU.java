package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

public final class NRU extends 0ng {
    public final /* synthetic */ OHS A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRU(OHS ohs) {
        super(1326144141, 3, false, false);
        this.A00 = ohs;
    }

    public final void run() {
        OBA oba = (OBA) this.A00.A04.getValue();
        O8E o8e = oba.A01;
        C290865g5 A01 = oba.A00.A01("call_recipients");
        0qQ.A0B(A01, 0);
        List list = A01.A02;
        if (list.isEmpty()) {
            OHS ohs = o8e.A00;
            ohs.A03.EhX("");
            ohs.A00 = true;
            return;
        }
        0V2 r4 = (0V2) o8e.A00.A05.getValue();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            DirectShareTarget directShareTarget = (DirectShareTarget) next;
            if (!directShareTarget.A0M() && !directShareTarget.A0L()) {
                A1C.add(next);
            }
        }
        OGE oge = new OGE("", A01.A01, A1C, false, false);
        0qQ.A0B(r4, 0);
        r4.FIA(oge);
    }
}
