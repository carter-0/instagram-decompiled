package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.ExampleContext;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.LsG  reason: case insensitive filesystem */
public final class C65375LsG implements MSQ {
    public final UserSession A00;

    public final void AIG(C65380LsL lsL, C63718L4c l4c, List list) {
        ArrayList A0S = 00k.A0S(lsL.A05, list);
        LinkedHashMap A0x = DbS.A0x(JTT.A08(A0S));
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            IgSignalsFeature igSignalsFeature = (IgSignalsFeature) it.next();
            String valueOf = String.valueOf(igSignalsFeature.A01);
            A0x.put(valueOf, new FeatureData((Type) null, valueOf, (String) null, (List) null, igSignalsFeature.A00, 16374, 0));
        }
        C255463uA[] r0 = Example.A04;
        Example example = new Example(ExampleContext.A05, "identity", A0x);
        new AnonymousClass953(1vm.A01(this.A00)).A00(AnonymousClass05K.A0N, l4c.A00, String.valueOf(lsL.A02), AnonymousClass7TE.A1I(example), (C62320sa) null, (0sP) null, lsL.A03);
    }

    public C65375LsG(UserSession userSession) {
        this.A00 = userSession;
    }
}
