package com.facebook.papaya.fb.instagram.executors.mldwfalco;

import X.0KC;
import X.0dV;
import X.0qQ;
import X.0sr;
import X.AnonymousClass7TE;
import X.Pxe;
import X.RWB;
import X.T7T;
import android.content.Context;
import android.os.Bundle;
import com.facebook.papaya.client.executor.IExecutorFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class IgAnalyticsMldwFalcoExecutorFactory extends IExecutorFactory {
    public static final RWB Companion = new Object();

    public IgAnalyticsMldwFalcoExecutorFactory(Context context, Bundle bundle) {
        0qQ.A0B(bundle, 2);
        0dV.A0C("papaya-fb-fa-mldw-falco-ig-executor");
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (bundle.containsKey("enforce_secure_aggregation")) {
            A1H.put("enforce_secure_aggregation", String.valueOf(bundle.getBoolean("enforce_secure_aggregation")));
        }
        if (bundle.containsKey("min_kanon_threshold")) {
            A1H.put("min_kanon_threshold", String.valueOf(bundle.getInt("min_kanon_threshold")));
        }
        Iterator it = 0sr.A1P(new String[]{"max_epsilon", "max_delta", "min_sensitivity"}).iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (bundle.containsKey(A18)) {
                A1H.put(A18, String.valueOf(bundle.getFloat(A18)));
            }
        }
        try {
            T7T.A01.A00(Pxe.A0a(this)).A00();
        } catch (IllegalStateException e) {
            0KC.A0F("IgAnalyticsMldwFalcoExecutorFactory", "Failed to initialize mldw store due to invalid user session", e);
        }
        initHybrid(A1H);
    }

    private final native void initHybrid(Map map);
}
