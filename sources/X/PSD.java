package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.Set;

public final class PSD implements 1aV {
    public final /* synthetic */ C72204OyU A00;

    public PSD(C72204OyU oyU) {
        this.A00 = oyU;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C72204OyU oyU = this.A00;
        Set keySet = oyU.A0C.keySet();
        ArrayList<C254793t3> A1C = AnonymousClass7TE.A1C();
        for (Object next : keySet) {
            0qQ.A0B(next, 0);
            if (next instanceof MsysThreadId) {
                A1C.add(next);
            }
        }
        for (C254793t3 A05 : A1C) {
            C72204OyU.A05(oyU, A05, (Integer) null, (String) null);
        }
    }
}
