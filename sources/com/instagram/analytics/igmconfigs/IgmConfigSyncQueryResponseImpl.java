package com.instagram.analytics.igmconfigs;

import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4LF;
import X.C250663lr;
import X.C250673ls;

public final class IgmConfigSyncQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XigViperConfigSync extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4LF r3 = AnonymousClass4LF.A00;
            return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r3, "is_ads_enabled"), new AnonymousClass4L7(r3, "is_organic_enabled")});
        }

        public XigViperConfigSync() {
            super(-1634672125);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(AnonymousClass4Kz.A00, "xig_twoMeasurement_platform_config(config_type:$configType)"), new AnonymousClass4Kp(XigViperConfigSync.class, "xig_viper_config_sync(config_type:$configType)", -1634672125)});
    }

    public IgmConfigSyncQueryResponseImpl() {
        super(-1358517233);
    }
}
