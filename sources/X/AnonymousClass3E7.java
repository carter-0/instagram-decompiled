package X;

import android.view.View;

/* renamed from: X.3E7  reason: invalid class name */
public final class AnonymousClass3E7 implements AnonymousClass03Q {
    public final /* synthetic */ AnonymousClass3E5 A00;

    public AnonymousClass3E7(AnonymousClass3E5 r1) {
        this.A00 = r1;
    }

    public final 04k Cvn(View view, 04k r4) {
        0qQ.A0B(view, 0);
        0qQ.A0B(r4, 1);
        AnonymousClass3E5 r1 = this.A00;
        r1.A00 = r4.A00.A01().A00;
        View view2 = r1.A05;
        if (view2 != null && view2.isAttachedToWindow()) {
            return 03v.A05(view2, r4);
        }
        try {
            return 03v.A05(view, r4);
        } catch (Throwable th) {
            String obj = AnonymousClass3E5.class.toString();
            0qQ.A07(obj);
            0wb.A07(obj, th);
            return r4;
        }
    }
}
