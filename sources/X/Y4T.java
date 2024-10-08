package X;

import com.instagram.debug.devoptions.apiperf.DebugHeadPlugin;
import com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations;
import com.instagram.debug.devoptions.debughead.data.provider.DebugHeadMemoryMetricsListener;
import java.util.HashSet;

public final class Y4T implements AnonymousClass0eK {
    public static final Y4T A00 = new Y4T();

    /* JADX WARNING: type inference failed for: r0v4, types: [X.XwS, java.lang.Object] */
    public static C22163XwS A00(01r r5) {
        r5.put(XIW.class, new Object());
        r5.put(XIX.class, new Object());
        r5.put(XIT.class, new Object());
        r5.put(XIY.class, new Object());
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.XwH] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, X.XwH] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, X.XwG] */
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        HashSet A1F = AnonymousClass7TE.A1F();
        if (!DebugHeadPlugin.isAvailable() || !DebugHeadConfigurations.isMemoryMetricsDebuggingEnabled) {
            01r r1 = new 01r(0);
            Class<XIW> cls = XIW.class;
            r1.put(cls, new Object());
            Class<XIX> cls2 = XIX.class;
            r1.put(cls2, new Object());
            Class<XIT> cls3 = XIT.class;
            r1.put(cls3, new Object());
            Class<XIY> cls4 = XIY.class;
            r1.put(cls4, new Object());
            Class<XIZ> cls5 = XIZ.class;
            r1.put(cls5, new Object());
            Class<XIU> cls6 = XIU.class;
            r1.put(cls6, new Object());
            C22158XwN xwN = new C22158XwN(r1);
            01r r12 = new 01r(0);
            r12.put(cls5, A00(r12));
            r12.put(cls6, new Object());
            C22170XwZ xwZ = new C22170XwZ(r12);
            C62880wX r8 = C61170le.A00;
            C22162XwR xwR = new C22162XwR(C60510iO.A00(r8));
            C22172Xwc xwc = C22172Xwc.A00;
            ? obj2 = new Object();
            obj2.A00 = xwN;
            obj2.A02 = xwZ;
            obj2.A01 = xwR;
            obj2.A03 = xwc;
            A1F.add(obj2);
            01r r13 = new 01r(0);
            r13.put(cls, new Object());
            r13.put(cls2, new Object());
            r13.put(cls3, new Object());
            r13.put(cls4, new Object());
            r13.put(cls5, new Object());
            Class<XIS> cls7 = XIS.class;
            r13.put(cls7, new Object());
            r13.put(cls6, new Object());
            C22158XwN xwN2 = new C22158XwN(r13);
            01r r14 = new 01r(0);
            r14.put(cls5, A00(r14));
            r14.put(cls7, new Object());
            r14.put(cls6, new Object());
            C22170XwZ xwZ2 = new C22170XwZ(r14);
            C22162XwR xwR2 = new C22162XwR(C60510iO.A00(r8));
            C22171Xwb xwb = C22171Xwb.A00;
            ? obj3 = new Object();
            obj3.A00 = xwN2;
            obj3.A02 = xwZ2;
            obj3.A01 = xwR2;
            obj3.A03 = xwb;
            obj = obj3;
        } else {
            01r r2 = new 01r(0);
            r2.put(XIV.class, new Object());
            C22158XwN xwN3 = new C22158XwN(r2);
            if (DebugHeadPlugin.sInstance != null) {
                DebugHeadMemoryMetricsListener instance = DebugHeadMemoryMetricsListener.getInstance();
                ? obj4 = new Object();
                obj4.A01 = xwN3;
                obj4.A00 = instance;
                obj = obj4;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        A1F.add(obj);
        return A1F;
    }
}
