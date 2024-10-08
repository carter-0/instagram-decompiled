package X;

import java.util.HashMap;
import java.util.Map;

public final class TSU extends HashMap {
    public final int A00 = 2;
    public final Object A01;

    public TSU(S0M s0m, String str, String str2) {
        this.A01 = s0m;
        put("surface", str);
        put("mechanism", "mechanism_location_sharing_button");
        put("result", str2);
    }

    public TSU(S0M s0m, String str) {
        this.A01 = s0m;
        put("surface", str);
        put("mechanism", "mechanism_location_sharing_button");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TSU(C10399Rrb rrb, Map map) {
        super(map);
        this.A01 = rrb;
        put("logging_unit_id", (Object) null);
    }
}
