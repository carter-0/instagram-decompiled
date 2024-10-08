package X;

import android.view.MotionEvent;

/* renamed from: X.5Gx  reason: invalid class name and case insensitive filesystem */
public final class C283275Gx extends C283285Gy {
    public final /* synthetic */ AnonymousClass5Gv A00;

    public C283275Gx(AnonymousClass5Gv r1) {
        this.A00 = r1;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        AnonymousClass5Gv r2 = this.A00;
        if (r2.A09 != AnonymousClass05K.A01) {
            return true;
        }
        r2.A09 = AnonymousClass05K.A0C;
        2cs r22 = r2.A0I;
        r22.A06 = true;
        r22.A06(0.9d);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass5Gv r2 = this.A00;
        if (r2.A09 != AnonymousClass05K.A0C) {
            return true;
        }
        2cs r22 = r2.A0I;
        r22.A06 = false;
        r22.A06(1.0d);
        return true;
    }
}
