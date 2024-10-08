package X;

import java.util.Iterator;
import java.util.Map;

public final class AfN implements MUC {
    public final /* synthetic */ N4R A00;
    public final /* synthetic */ AnonymousClass8k0 A01;
    public final /* synthetic */ C40442AcD A02;

    public AfN(N4R n4r, AnonymousClass8k0 r2, C40442AcD acD) {
        this.A02 = acD;
        this.A00 = n4r;
        this.A01 = r2;
    }

    public final void DED() {
        this.A01.DEc("FbCreatorBPLCrossPostingSettingMutator - Mutation failed");
    }

    public final void DoV(C383489ff r6) {
        boolean z;
        0xY r1;
        String str;
        C40442AcD acD = this.A02;
        Iterator A0u = AnonymousClass7TF.A0u((Map) this.A00.A02);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            int ordinal = ((C390849rw) A1J.getKey()).ordinal();
            if (ordinal == 0) {
                z = AnonymousClass7TE.A1a(A1J.getValue());
                r1 = ((2D6) acD.A01.getValue()).A04.AR4();
                str = "PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING";
            } else if (ordinal == 1) {
                z = AnonymousClass7TE.A1a(A1J.getValue());
                r1 = ((2D6) acD.A01.getValue()).A04.AR4();
                str = "PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING";
            } else if (ordinal == 2) {
                ((2D6) acD.A01.getValue()).A06(AnonymousClass7TE.A1a(A1J.getValue()));
            } else {
                throw AnonymousClass7TE.A1K();
            }
            r1.E5T(str, z);
            r1.apply();
        }
    }
}
