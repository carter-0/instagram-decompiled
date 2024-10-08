package X;

import android.content.Context;

/* renamed from: X.3eF  reason: invalid class name and case insensitive filesystem */
public final class C246233eF implements C13907Tl7 {
    public final 07U A00;

    public final void onCreate(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 0);
        if (this.A00.compareTo(07U.A01) < 0) {
            AnonymousClass2Vc.A02((Context) r3);
        }
    }

    public final void onDestroy(AnonymousClass07Z r4) {
        0qQ.A0B(r4, 0);
        Context context = (Context) r4;
        AnonymousClass2Vc.A03(context);
        r4.getLifecycle().A0A(this);
        synchronized (AnonymousClass2Vc.A02) {
            AnonymousClass2Vc.A03.remove(context);
        }
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public C246233eF(07U r1) {
        this.A00 = r1;
    }
}
