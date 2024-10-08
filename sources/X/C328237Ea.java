package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* renamed from: X.7Ea  reason: invalid class name and case insensitive filesystem */
public final class C328237Ea implements AnonymousClass7PN {
    public final View A00;
    public final AnonymousClass7PN A01;
    public final C328137Dq A02;

    public final void APf(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        AnonymousClass7PN r0 = this.A01;
        if (r0 != null) {
            r0.APf(motionEvent);
        }
    }

    public final boolean EsS(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        AnonymousClass7PN r0 = this.A01;
        if (r0 != null) {
            return r0.EsS(motionEvent);
        }
        return false;
    }

    public final void DAV(float f, float f2) {
        2cs r0;
        AnonymousClass7PN r02 = this.A01;
        if (r02 != null) {
            r02.DAV(f, f2);
        }
        View view = this.A00;
        0qQ.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setTranslationX(f);
        }
        C328137Dq r4 = this.A02;
        float min = Math.min(f / f2, 1.0f);
        C328167Dt r2 = r4.A0A;
        boolean z = false;
        if (r4.A04.A00() == 0) {
            z = true;
        }
        r2.A00 = f;
        r2.A02 = min;
        if (z && ((r0 = r2.A03) == null || r0.A0C())) {
            C328167Dt.A00(r2, f, min);
        }
        ViewStub viewStub = r4.A09;
        if (!(viewStub == null || viewStub.getParent() == null)) {
            r4.A03 = r4.A05.getView();
        }
        View view2 = r4.A03;
        if (view2 != null) {
            view2.setTranslationX(f + ((float) r4.A02));
        }
    }

    public final boolean Esh() {
        AnonymousClass7PN r0 = this.A01;
        if (r0 != null) {
            return r0.Esh();
        }
        return false;
    }

    public C328237Ea(View view, AnonymousClass7PN r2, C328137Dq r3) {
        this.A00 = view;
        this.A02 = r3;
        this.A01 = r2;
    }
}
