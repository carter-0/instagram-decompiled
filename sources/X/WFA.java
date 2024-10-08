package X;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class WFA implements X8E {
    public final C17993VjV A00;
    public final Map A01 = new HashMap();
    public final WFU A02;
    public final X8X A03;

    public final void ADW(C19879Wh8 wh8, VL7 vl7) {
        this.A02.A0I.invalidate();
    }

    public final void AoS(W2R w2r, AnonymousClass2R4 r4, Collection collection, float f) {
        this.A00.A00(w2r, r4, collection, this.A03.AoR());
    }

    public WFA(WFU wfu, WFX wfx, X8X x8x) {
        this.A02 = wfu;
        this.A03 = x8x;
        this.A00 = new C17993VjV(wfx, Collections.emptyList(), x8x.AoQ());
    }

    public final VL7 ALc(C19879Wh8 wh8, int i) {
        LinkedList A04 = wh8.A04();
        Collections.sort(A04, new C20381WqM((Object) this, 10));
        C14955UGt ALU = this.A03.ALU(wh8, (XCL) A04.peek(), this.A02);
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            this.A01.put(((C20944X5n) it.next()).getId(), new WeakReference(ALU));
        }
        return new VL7(ALU);
    }

    public final void EDS(C19879Wh8 wh8) {
        Iterator it = wh8.A04().iterator();
        while (it.hasNext()) {
            this.A01.remove(((C20944X5n) it.next()).getId());
        }
    }
}
