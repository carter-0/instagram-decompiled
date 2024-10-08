package X;

import android.view.MotionEvent;

/* renamed from: X.76D  reason: invalid class name */
public final class AnonymousClass76D implements AnonymousClass7DS {
    public final Object A00;

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        AnonymousClass7FU r7 = (AnonymousClass7FU) obj;
        Object obj3 = this.A00;
        if (!(obj3 instanceof AnonymousClass7YM) || !(r7 instanceof AnonymousClass79c)) {
            return false;
        }
        AnonymousClass79c r72 = (AnonymousClass79c) r7;
        return ((AnonymousClass7YM) obj3).Cnf(r72.A04.toString(), String.valueOf(r72.A07), String.valueOf(r72.A06), "tap");
    }

    public AnonymousClass76D(Object obj) {
        this.A00 = obj;
    }
}
