package X;

import android.view.MotionEvent;

/* renamed from: X.76E  reason: invalid class name */
public final class AnonymousClass76E implements AnonymousClass7DS {
    public final Object A00;

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        String Bwc;
        AnonymousClass7FU r6 = (AnonymousClass7FU) obj;
        if (r6 == null || (Bwc = r6.Bwc()) == null) {
            return false;
        }
        Object obj3 = this.A00;
        if (obj3 instanceof AnonymousClass7Y7) {
            return ((AnonymousClass7Y7) obj3).Cpc(Bwc);
        }
        return false;
    }

    public AnonymousClass76E(Object obj) {
        this.A00 = obj;
    }
}
