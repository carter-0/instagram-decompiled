package X;

import android.view.MotionEvent;
import java.util.Collection;
import java.util.List;

/* renamed from: X.76A  reason: invalid class name */
public final class AnonymousClass76A implements AnonymousClass7DS {
    public final List A00;

    public AnonymousClass76A(Object obj, C62320sa r7) {
        C40461AcW acW;
        0qQ.A0B(obj, 1);
        AnonymousClass76B r4 = new AnonymousClass76B(obj);
        if (((Boolean) r7.invoke()).booleanValue()) {
            acW = new C40461AcW(obj);
        } else {
            acW = null;
        }
        this.A00 = 0sr.A1Q(new AnonymousClass7DS[]{r4, acW, new AnonymousClass76C(obj), new AnonymousClass76D(obj), new AnonymousClass76E(obj)});
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        0qQ.A0B(motionEvent, 2);
        List<AnonymousClass7DS> list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AnonymousClass7DS DRa : list) {
                if (DRa.DRa(motionEvent, obj, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
