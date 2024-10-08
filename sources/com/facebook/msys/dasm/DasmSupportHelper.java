package com.facebook.msys.dasm;

import X.0dV;
import X.0ff;
import X.C300365x1;
import android.content.Context;
import android.content.res.AssetManager;

public class DasmSupportHelper {
    public static volatile Context sContext;

    static {
        synchronized (C300365x1.class) {
            if (!C300365x1.A00) {
                0dV.A0C("msysjnidasm");
                C300365x1.A00 = true;
            }
        }
    }

    public static AssetManager assets() {
        if (sContext != null) {
            return sContext.getAssets();
        }
        return null;
    }

    public static synchronized void initialize(Context context) {
        synchronized (DasmSupportHelper.class) {
            0ff.A01("DasmSupportHelper.initialize", 1443598349);
            try {
                if (sContext == null) {
                    sContext = context.getApplicationContext();
                }
            } finally {
                0ff.A00(-1535965724);
            }
        }
    }
}
