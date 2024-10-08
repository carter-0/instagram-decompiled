package X;

import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.8pm  reason: invalid class name and case insensitive filesystem */
public final class C366848pm {
    public AnonymousClass9J1 A00;
    public final EphemeralMediaToggleView A01;
    public final List A02;

    public final void A00(Integer num) {
        boolean z;
        List<AnonymousClass9J1> list = this.A02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (num == ((AnonymousClass9J1) it.next()).A01) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            for (AnonymousClass9J1 r1 : list) {
                if (num == r1.A01) {
                    this.A00 = r1;
                    this.A01.A00(r1);
                    return;
                }
            }
            throw new NoSuchElementException(AnonymousClass000.A00(3));
        } else if (!list.isEmpty()) {
            EphemeralMediaToggleView ephemeralMediaToggleView = this.A01;
            AnonymousClass9J1 r0 = this.A00;
            if (r0 == null) {
                0qQ.A0F("currentState");
                throw AnonymousClass00P.createAndThrow();
            } else {
                ephemeralMediaToggleView.A00(r0);
            }
        }
    }

    public C366848pm(EphemeralMediaToggleView ephemeralMediaToggleView, List list) {
        this.A02 = list;
        this.A01 = ephemeralMediaToggleView;
        if (!list.isEmpty()) {
            AnonymousClass9J1 r0 = (AnonymousClass9J1) list.get(0);
            this.A00 = r0;
            if (r0 == null) {
                0qQ.A0F("currentState");
                throw AnonymousClass00P.createAndThrow();
            } else {
                ephemeralMediaToggleView.A00(r0);
            }
        }
    }
}
