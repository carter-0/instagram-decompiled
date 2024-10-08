package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.FPl  reason: case insensitive filesystem */
public final class C50121FPl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C276544tV A01;

    public C50121FPl(View view, C276544tV r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public final boolean onPreDraw() {
        C226262fy r0;
        View view = this.A00;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        C276544tV r4 = this.A01;
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f((Activity) view.getContext(), DbV.A10(r4, ""));
        A0f.A03(view);
        String A0H = r4.A0H();
        if (A0H == null || A0H.hashCode() != -2048055687 || !A0H.equals("up_center")) {
            r0 = C226262fy.ABOVE_ANCHOR;
        } else {
            r0 = C226262fy.BELOW_ANCHOR;
        }
        A0f.A05 = r0;
        String A0E = r4.A0E();
        if (A0E != null && A0E.equals("always_dark")) {
            A0f.A07(C283255Gu.A06);
        }
        DbU.A1T(A0f);
        return true;
    }
}
