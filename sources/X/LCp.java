package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class LCp {
    public final Map A00;
    public final Map A01;

    public LCp() {
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L(1, C65406Lsm.A00), AnonymousClass7TE.A1L(2, C65405Lsl.A00), AnonymousClass7TE.A1L(3, C65392LsY.A00), AnonymousClass7TE.A1L(4, C65385LsR.A00), AnonymousClass7TE.A1L(5, C65388LsU.A00), AnonymousClass7TE.A1L(6, C65402Lsi.A00), AnonymousClass7TE.A1L(7, C65391LsX.A00), AnonymousClass7TE.A1L(8, C65393LsZ.A00), AnonymousClass7TE.A1L(9, C65386LsS.A00), AnonymousClass7TE.A1L(10, C65389LsV.A00), AnonymousClass7TE.A1L(11, C65394Lsa.A00), AnonymousClass7TE.A1L(12, C65404Lsk.A00), AnonymousClass7TE.A1L(13, C65403Lsj.A00), AnonymousClass7TE.A1L(14, C65397Lsd.A00), AnonymousClass7TE.A1L(15, C65398Lse.A00), AnonymousClass7TE.A1L(16, C65407Lsn.A00), AnonymousClass7TE.A1L(17, C65390LsW.A00), AnonymousClass7TE.A1L(18, C65401Lsh.A00), AnonymousClass7TE.A1L(19, C65387LsT.A00), AnonymousClass7TE.A1L(20, C65384LsQ.A00), AnonymousClass7TE.A1L(21, C65396Lsc.A00), AnonymousClass7TE.A1L(22, C65395Lsb.A00), AnonymousClass7TE.A1L(24, C65399Lsf.A00), AnonymousClass7TE.A1L(25, C65400Lsg.A00)});
        this.A00 = A06;
        ArrayList A0f = JTQ.A0f(A06);
        Iterator A0s = AnonymousClass7TF.A0s(A06);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            AnonymousClass7TF.A1I(A1J.getValue(), A1J.getKey(), A0f);
        }
        this.A01 = 0Yt.A08(A0f);
    }

    public final void A00(Bundle bundle, C66399MQf mQf, String str) {
        Number A14 = C51966G9m.A14(mQf, this.A01);
        if (A14 != null) {
            bundle.putInt(str, A14.intValue());
            return;
        }
        throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(mQf, "Unrecognized navigation state: ", AnonymousClass7TE.A1A()));
    }
}
