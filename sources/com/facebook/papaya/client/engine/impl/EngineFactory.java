package com.facebook.papaya.client.engine.impl;

import X.0KC;
import X.0dV;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51974G9v;
import X.DbT;
import X.Pxf;
import android.content.Context;
import android.os.Bundle;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.client.executor.IExecutorFactory;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class EngineFactory extends IEngineFactory {
    private final native void initHybrid(ITransport iTransport, Map map, Map map2, IModelLoader iModelLoader);

    public EngineFactory(Context context, Map map, Bundle bundle, Map map2, List list, ITransport iTransport, IModelLoader iModelLoader) {
        C51974G9v.A1P(context, map, bundle, map2);
        AnonymousClass7TG.A1S(list, iTransport);
        0dV.A0C("papaya-engine");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            0dV.A0D(AnonymousClass7TE.A18(it), 16);
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0u = AnonymousClass7TF.A0u(map2);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            A1E.put(A1J.getKey(), ((PapayaRestrictions) A1J.getValue()).A00());
        }
        ImmutableMap.Builder A0Q = Pxf.A0Q();
        Iterator A0u2 = AnonymousClass7TF.A0u(map);
        while (A0u2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
            String A13 = DbT.A13(A1J2);
            try {
                A0Q.put(A13, (IExecutorFactory) ((Class) A1J2.getValue()).getConstructor(new Class[]{Context.class, Bundle.class}).newInstance(new Object[]{context, bundle.getBundle(A13)}));
            } catch (Exception e) {
                0KC.A0G("PapayaEngineFactory", "Failed to instantiate ExecutorFactory implementation", e);
            }
        }
        ImmutableMap build = A0Q.build();
        0qQ.A07(build);
        initHybrid(iTransport, build, A1E, iModelLoader);
    }
}
