package com.instagram.appreciation.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41847B3o;

public final class ContentAppreciationMetricsDataImpl extends C250663lr implements C250673ls {

    public final class EstimatedEarnings extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "formatted_amount"), "amount_with_offset");
        }

        public EstimatedEarnings() {
            super(-591550938);
        }
    }

    public final EstimatedEarnings A0E() {
        return (EstimatedEarnings) A04(EstimatedEarnings.class, "estimated_earnings", -591550938);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return C41847B3o.A0k(AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, AnonymousClass000.A00(1373)), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, AnonymousClass000.A00(2974)), EstimatedEarnings.class, "estimated_earnings", -591550938);
    }

    public ContentAppreciationMetricsDataImpl() {
        super(1941391533);
    }
}
