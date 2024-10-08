package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RAE extends 0ng {
    public final /* synthetic */ C11223SFx A00;
    public final /* synthetic */ Map A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAE(C11223SFx sFx, Map map) {
        super(1773997430, 3, false, false);
        this.A00 = sFx;
        this.A01 = map;
    }

    public final void run() {
        Map map;
        C11223SFx sFx = this.A00;
        AtomicBoolean atomicBoolean = sFx.A06;
        if (!atomicBoolean.get() && (map = this.A01) != null && map.containsKey("MEMContextSendPingResultUserInfoKey")) {
            boolean parseBoolean = Boolean.parseBoolean(Pxf.A0j("MEMContextSendPingResultUserInfoKey", map));
            sFx.A07.set(parseBoolean);
            sFx.A04.markerAnnotate(936452326, sFx.A00, "is_act_success", parseBoolean);
            atomicBoolean.set(true);
        }
    }
}
