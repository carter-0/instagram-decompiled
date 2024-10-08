package com.instagram.schools.management.data;

import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class StartValidationMutationResponseImpl extends C250663lr implements C250673ls {

    public final class XdtStartValidation extends C250663lr implements C250673ls {

        public final class Schools extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                return C41846B3n.A0M(AnonymousClass7TF.A0I(r5), C41845B3m.A0G(r5), AnonymousClass7TE.A0f(r5, ServerW3CShippingAddressConstants.CITY), AnonymousClass7TE.A0f(r5, "county"), AnonymousClass7TE.A0f(r5, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE));
            }

            public Schools() {
                super(-140705577);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
            return AnonymousClass7TG.A0U(r5, AnonymousClass7TE.A0f(r5, "affiliation_id"), C41845B3m.A0A(AnonymousClass4Ks.A00(), Schools.class, "schools", -140705577), "error");
        }

        public XdtStartValidation() {
            super(-865944271);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtStartValidation.class, "xdt_start_validation(input:$input)", -865944271);
    }

    public StartValidationMutationResponseImpl() {
        super(290096273);
    }
}
