package com.instagram.debug.devoptions.sandboxselector;

import X.0ki;
import X.0qQ;
import X.0xZ;
import X.0xa;
import X.C252683pV;
import X.C62320sa;

public final class SandboxPreferences$observeDevPreference$1$listener$1 implements 0xZ {
    public final /* synthetic */ C252683pV $$this$callbackFlow;
    public final /* synthetic */ C62320sa $selector;

    public SandboxPreferences$observeDevPreference$1$listener$1(C252683pV r1, C62320sa r2) {
        this.$$this$callbackFlow = r1;
        this.$selector = r2;
    }

    public final void onChanged(0xa r4, String str) {
        if (0qQ.A0K(str, "using_dev_server") || 0qQ.A0K(str, "dev_server_name")) {
            final C252683pV r2 = this.$$this$callbackFlow;
            final C62320sa r0 = this.$selector;
            0ki.A00("SandboxPreferences.kt-observeDevPReference-2", new C62320sa() {
                public final void invoke() {
                    C252683pV.this.FIG(r0.invoke());
                }
            });
        }
    }
}
