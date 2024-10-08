package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.TOp  reason: case insensitive filesystem */
public final class C13183TOp implements AnonymousClass0eK {
    public final AnonymousClass0eK A00;

    public final /* bridge */ /* synthetic */ Object get() {
        C13632Tdy tdy = (C13632Tdy) this.A00.get();
        HashMap A1E = AnonymousClass7TE.A1E();
        RE0 re0 = RE0.DEFAULT;
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            throw AnonymousClass7TE.A11("Null flags");
        } else if ("".isEmpty()) {
            A1E.put(re0, new C8313Qnt(emptySet, 30000));
            RE0 re02 = RE0.HIGHEST;
            Set emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                A1E.put(re02, new C8313Qnt(emptySet2, 1000));
                RE0 re03 = RE0.VERY_LOW;
                if (Collections.emptySet() != null) {
                    Set A18 = Pxg.A18(new RE1[]{RE1.NETWORK_UNMETERED, RE1.DEVICE_IDLE});
                    if (A18 != null) {
                        A1E.put(re03, new C8313Qnt(A18, 86400000));
                        if (tdy == null) {
                            throw AnonymousClass7TE.A11("missing required property: clock");
                        } else if (A1E.keySet().size() >= RE0.values().length) {
                            return new C8314Qnu(tdy, A1E);
                        } else {
                            throw AnonymousClass7TE.A0z("Not all priorities have been configured");
                        }
                    } else {
                        throw AnonymousClass7TE.A11("Null flags");
                    }
                } else {
                    throw AnonymousClass7TE.A11("Null flags");
                }
            } else {
                throw AnonymousClass7TE.A11("Null flags");
            }
        } else {
            throw DbW.A0c("Missing required properties:", "");
        }
    }

    public C13183TOp(AnonymousClass0eK r1) {
        this.A00 = r1;
    }
}
