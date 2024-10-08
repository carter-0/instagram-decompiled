package X;

import com.instagram.common.mvvm.SingleFlightImpl$wrapAction$1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4HW  reason: invalid class name */
public final class AnonymousClass4HW {
    public final ConcurrentHashMap A00;
    public final AnonymousClass4HV A01;

    public final Object A00(Object obj, AnonymousClass4D7 r10, 0sP r11) {
        0sL r1;
        AnonymousClass4HV r12 = this.A01;
        Object obj2 = obj;
        if (0qQ.A0K(r12, AnonymousClass4HU.A00)) {
            r1 = new AnonymousClass9KM((Object) this, obj2, (Object) new SingleFlightImpl$wrapAction$1((AnonymousClass4D7) null, r11), (AnonymousClass4D7) null, 7, 42);
        } else if (0qQ.A0K(r12, C59822JZw.A00)) {
            r1 = new AnonymousClass9KF(this, obj2, new SingleFlightImpl$wrapAction$1((AnonymousClass4D7) null, r11), (AnonymousClass4D7) null, 19);
        } else {
            throw new RuntimeException();
        }
        return 19E.A00(r10, r1);
    }

    public final void A01() {
        ConcurrentHashMap concurrentHashMap = this.A00;
        for (Object next : concurrentHashMap.values()) {
            0qQ.A07(next);
            ((C262204Co) next).AG7((CancellationException) null);
        }
        concurrentHashMap.clear();
    }

    public final boolean A02(Object obj) {
        C262204Co r0 = (C262204Co) this.A00.get(obj);
        if (r0 == null || !r0.isActive()) {
            return false;
        }
        return true;
    }

    public AnonymousClass4HW(AnonymousClass4HV r2) {
        this.A01 = r2;
        this.A00 = new ConcurrentHashMap();
    }

    public AnonymousClass4HW() {
        this(AnonymousClass4HU.A00);
    }
}
