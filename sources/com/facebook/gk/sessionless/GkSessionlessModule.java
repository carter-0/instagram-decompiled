package com.facebook.gk.sessionless;

import X.0qQ;
import X.C21994Xpz;
import android.content.Context;
import com.facebook.gk.store.GatekeeperWriter;
import com.facebook.ultralight.UL;

public final class GkSessionlessModule {

    public final class GkSessionlessModuleSelendroidInjector {
        public final Context A00;

        public GkSessionlessModuleSelendroidInjector(Context context) {
            0qQ.A0B(context, 1);
            this.A00 = context;
        }

        public final GatekeeperWriter getGatekeeperWriter() {
            return (GatekeeperWriter) C21994Xpz.A00(UL.id._UL__ULSEP_com_facebook_gk_store_GatekeeperWriter_ULSEP_com_facebook_gk_sessionless_Sessionless_ULSEP_BINDING_ID);
        }
    }
}
