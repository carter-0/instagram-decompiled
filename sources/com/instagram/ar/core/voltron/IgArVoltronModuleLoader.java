package com.instagram.ar.core.voltron;

import X.0lg;
import X.0qQ;
import X.1US;
import X.1UY;
import X.AnonymousClass83x;
import X.AnonymousClass840;
import X.C312666ev;
import X.C3502583y;
import X.C3502683z;
import X.C377199Kx;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgArVoltronModuleLoader {
    public static final C312666ev Companion = new Object();
    public static final String TAG = "IgArVoltronModuleLoader";
    public boolean arePytorchModulesLoaded;
    public final Map loaderMap;
    public final 0lg session;

    public /* synthetic */ IgArVoltronModuleLoader(0lg r1, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1);
    }

    public final synchronized C3502583y getModuleLoader(1US r3) {
        C3502583y r1;
        0qQ.A0B(r3, 0);
        r1 = (C3502583y) this.loaderMap.get(r3);
        if (r1 == null) {
            r1 = new C3502683z(this.session, r3);
            this.loaderMap.put(r3, r1);
        }
        return r1;
    }

    public void loadModule(String str, AnonymousClass83x r5) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r5, 1);
        EnumEntries enumEntries = 1US.A02;
        1US A00 = 1UY.A00(str);
        getModuleLoader(A00).CgN(new AnonymousClass840(r5, this, A00));
    }

    public void prefetchModules(Collection collection) {
    }

    public static final synchronized IgArVoltronModuleLoader getInstance(0lg r4) {
        IgArVoltronModuleLoader igArVoltronModuleLoader;
        Class<IgArVoltronModuleLoader> cls = IgArVoltronModuleLoader.class;
        synchronized (cls) {
            synchronized (Companion) {
                0qQ.A0B(r4, 0);
                igArVoltronModuleLoader = (IgArVoltronModuleLoader) r4.A01(cls, new C377199Kx(r4, 29));
            }
        }
        return igArVoltronModuleLoader;
    }

    public final boolean getArePytorchModulesLoaded() {
        return this.arePytorchModulesLoaded;
    }

    public IgArVoltronModuleLoader(0lg r3) {
        this.session = r3;
        this.loaderMap = new EnumMap(1US.class);
    }

    public final void setArePytorchModulesLoaded(boolean z) {
        this.arePytorchModulesLoaded = z;
    }
}
