package com.msys;

import X.1K2;
import X.AnonymousClass666;
import X.C60340gF;
import com.facebook.msys.mcf.MsysError;

public class MsysInfraNoSqliteMCFBridgeCallbacks {

    public abstract class MCIAuxiliaryDatabasesOpenCallback {
        private void callbackJNI(int i, MsysError msysError) {
            AnonymousClass666 r0 = (AnonymousClass666) this;
            Integer valueOf = Integer.valueOf(i);
            if (msysError != null) {
                msysError.getMessage();
                1K2 r2 = (1K2) r0.A00.A00.get(valueOf);
                if (r2 != null) {
                    r2.setException(new RuntimeException(msysError.getMessage()));
                    return;
                }
                return;
            }
            1K2 r1 = (1K2) r0.A00.A00.get(valueOf);
            if (r1 != null) {
                r1.set(C60340gF.A00);
            }
        }
    }
}
