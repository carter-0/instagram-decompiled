package com.instagram.wellbeing.supervisionupsells.constants;

import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.C255463uA;
import X.C73535PeR;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class IGSupervisionUpsellEligibilityStatus extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final boolean A00;

    public final class Companion {
        public final C255463uA serializer() {
            return C73535PeR.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IGSupervisionUpsellEligibilityStatus) && this.A00 == ((IGSupervisionUpsellEligibilityStatus) obj).A00);
    }

    public /* synthetic */ IGSupervisionUpsellEligibilityStatus(int i, boolean z) {
        if (1 != (i & 1)) {
            VJ6.A00(C73535PeR.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = z;
        }
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public IGSupervisionUpsellEligibilityStatus(boolean z) {
        this.A00 = z;
    }
}
