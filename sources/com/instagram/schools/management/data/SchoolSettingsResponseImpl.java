package com.instagram.schools.management.data;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class SchoolSettingsResponseImpl extends C250663lr implements C250673ls {

    public final class XdtSchoolSettings extends C250663lr implements C250673ls {

        public final class BadgeVisibilityMenuItems extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "setting"), DevServerEntity.COLUMN_DESCRIPTION);
            }

            public BadgeVisibilityMenuItems() {
                super(-1240993684);
            }
        }

        public final class School extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                return C41846B3n.A0M(C41845B3m.A0G(r1), AnonymousClass7TE.A0f(r1, ServerW3CShippingAddressConstants.CITY), AnonymousClass7TE.A0f(r1, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE), AnonymousClass7TE.A0f(r1, "county"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00(), "badge_names"));
            }

            public School() {
                super(1515139856);
            }
        }

        public final School A0E() {
            C250663lr A05 = A05(School.class, "school", 1515139856);
            0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.schools.management.data.SchoolSettingsResponseImpl.XdtSchoolSettings.School");
            return (School) A05;
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A01(), School.class, "school", 1515139856);
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "saved_name_for_badge");
            AnonymousClass4LF r1 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0A, A0f, AnonymousClass7TE.A0f(r1, "can_update_school"), AnonymousClass7TE.A0f(r1, "can_update_grad_year"), AnonymousClass7TE.A0f(r2, "selected_grad_month"), AnonymousClass7TE.A0f(r2, "selected_grad_year"), AnonymousClass7TE.A0f(r2, "learn_more_url"), AnonymousClass7TE.A0f(r2, AnonymousClass000.A00(1129)), C41845B3m.A0A(AnonymousClass4Ks.A00(), BadgeVisibilityMenuItems.class, "badge_visibility_menu_items", -1240993684)});
        }

        public XdtSchoolSettings() {
            super(-152575241);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XdtSchoolSettings.class, "xdt_school_settings", -152575241);
    }

    public SchoolSettingsResponseImpl() {
        super(122164409);
    }
}
