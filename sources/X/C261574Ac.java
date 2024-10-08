package X;

import android.app.Activity;

/* renamed from: X.4Ac  reason: invalid class name and case insensitive filesystem */
public final class C261574Ac implements C252473pA {
    public final /* synthetic */ Activity A00;

    public C261574Ac(Activity activity) {
        this.A00 = activity;
    }

    public final void DU5(C265674Vs r5) {
        C18546Vty vty;
        String str;
        0qQ.A0B(r5, 0);
        Activity activity = this.A00;
        AnonymousClass4W8 A002 = AnonymousClass4W7.A00(r5);
        C18545Vtx vtx = null;
        if (A002 != null) {
            vty = ((C18958WEl) A002).A00;
        } else {
            vty = null;
        }
        C254493sZ.A00 = String.valueOf(vty);
        if (A002 != null) {
            vtx = A002.BYt();
        }
        C254483sY.A00 = String.valueOf(vtx);
        C254503sa.A00 = Boolean.valueOf(activity.isInMultiWindowMode());
        switch (AnonymousClass4WA.A01(activity).intValue()) {
            case 0:
                str = "WIDE";
                break;
            case 1:
                str = "SQUARISH";
                break;
            default:
                str = "TALL";
                break;
        }
        C254473sX.A00 = str;
    }
}
