package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.1W6;
import X.AnonymousClass1VF;

public final class DevServerDatabaseKt$MIGRATION_1_2$1 extends AnonymousClass1VF {
    public DevServerDatabaseKt$MIGRATION_1_2$1() {
        super(1, 2);
    }

    public void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("\n          ALTER TABLE internal_dev_servers\n          ADD COLUMN supports_vpnless integer NOT NULL DEFAULT 0\n        ");
    }
}
