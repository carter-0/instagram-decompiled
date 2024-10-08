package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Vg  reason: invalid class name and case insensitive filesystem */
public final class C242633Vg implements C242643Vh {
    public WeakReference A00;
    public final C13997Tnz A01;
    public final Map A02 = new LinkedHashMap();
    public final AnonymousClass0Ud A03;
    public final 05G A04;

    public final Object AvB() {
        return null;
    }

    public final /* synthetic */ void DPe(Object obj) {
    }

    public static final Object A00(C242633Vg r0, Object obj, C62320sa r2) {
        Object invoke;
        if (r0.A01.A03) {
            return r2.invoke();
        }
        synchronized (obj) {
            invoke = r2.invoke();
        }
        return invoke;
    }

    public static final void A01(C242633Vg r4) {
        if (r4.A01.A03) {
            r4.A04.Epw(new AnonymousClass9IV(r4.A00, 00k.A0k(r4.A02.keySet())));
        }
    }

    public final Iterable BVk(C376459Ib r3, AnonymousClass34Q r4, int i) {
        return (Iterable) A00(this, this, new AnonymousClass9LM(this, 27));
    }

    public C242633Vg(C13997Tnz tnz) {
        this.A01 = tnz;
        02z r0 = new 02z(new AnonymousClass9IV((WeakReference) null, (Set) 0sl.A00));
        this.A04 = r0;
        this.A03 = 10b.A03(r0);
    }

    public final /* synthetic */ boolean DPd(Object obj) {
        return true;
    }
}
