package X;

import com.instagram.friendmap.data.MapText;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;

public final class PGT implements JSy {
    public final /* synthetic */ C68462NJa A00;

    public final void DbZ(N4t n4t, String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        C68462NJa nJa = this.A00;
        C69028NdD A01 = C68462NJa.A01(nJa);
        DirectShareTarget A002 = OSM.A00(C319736r8.FRIEND_MAP, A01.A02, n4t, str);
        if (A002 != null) {
            C254783t2 A0c = DbS.A0c(A002);
            A01.A0P(new PH0(n4t.A06.Bh3(), new MapText.Res(2131962760, new String[0]), new MapText.Res(2131962761, new String[0]), A0c));
        }
        A01.A0P(PH8.A00);
        C71144Ody.A06((C71144Ody) nJa.A0n.getValue(), true, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, "QUICK_REACT", "TAP", (String) null, (String) null, str2);
    }

    public PGT(C68462NJa nJa) {
        this.A00 = nJa;
    }

    public final QuickSnapReactionEmitterView Bjn() {
        return this.A00.A0h;
    }

    public final AnonymousClass07V getLifecycle() {
        0h9 r0 = this.A00.mLifecycleRegistry;
        0qQ.A07(r0);
        return r0;
    }
}
