package androidx.work.impl;

import X.AnonymousClass390;
import X.AnonymousClass391;
import X.AnonymousClass392;
import X.AnonymousClass393;
import X.AnonymousClass394;
import X.AnonymousClass395;
import X.C2377438z;
import X.C251983oI;
import X.C282875Fc;
import X.C282945Fj;
import X.Sg8;

public abstract class WorkDatabase extends C251983oI {
    public final AnonymousClass390 A00() {
        AnonymousClass390 r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A00 != null) {
            return workDatabase_Impl.A00;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A00 == null) {
                workDatabase_Impl.A00 = new C282945Fj(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A00;
        }
        return r0;
    }

    public abstract AnonymousClass395 A01();

    public abstract AnonymousClass392 A02();

    public final AnonymousClass393 A03() {
        AnonymousClass393 r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A02 != null) {
            return workDatabase_Impl.A02;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A02 == null) {
                workDatabase_Impl.A02 = new Sg8(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A02;
        }
        return r0;
    }

    public abstract AnonymousClass394 A04();

    public abstract C2377438z A05();

    public final AnonymousClass391 A06() {
        AnonymousClass391 r0;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this;
        if (workDatabase_Impl.A03 != null) {
            return workDatabase_Impl.A03;
        }
        synchronized (workDatabase_Impl) {
            if (workDatabase_Impl.A03 == null) {
                workDatabase_Impl.A03 = new C282875Fc(workDatabase_Impl);
            }
            r0 = workDatabase_Impl.A03;
        }
        return r0;
    }
}
