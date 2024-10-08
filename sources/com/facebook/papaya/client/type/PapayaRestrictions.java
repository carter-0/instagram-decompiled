package com.facebook.papaya.client.type;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbY;
import X.Pxf;
import X.RFV;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;

public final class PapayaRestrictions {
    public final Map A00 = AnonymousClass7TE.A1E();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !DbY.A1b(this, obj)) {
            return false;
        }
        return 0qQ.A0K(this.A00, ((PapayaRestrictions) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final ImmutableMap A00() {
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            A0Q.put(((RFV) A1J.getKey()).A00, Long.valueOf(AnonymousClass7TE.A0R(A1J.getValue())));
        }
        ImmutableMap build = A0Q.build();
        0qQ.A07(build);
        return build;
    }
}
