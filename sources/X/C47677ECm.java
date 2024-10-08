package X;

import android.net.Uri;

/* renamed from: X.ECm  reason: case insensitive filesystem */
public final class C47677ECm extends 1P0 {
    public final /* synthetic */ C47490E4u A00;

    public C47677ECm(C47490E4u e4u) {
        this.A00 = e4u;
    }

    public final void onFail(C268654dm r3) {
        AnonymousClass0fD.A0A(-1381908029, AnonymousClass0fD.A03(-1982378998));
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1523275232);
        C47677ECm.super.onFinish();
        AnonymousClass6ST r0 = this.A00.A07;
        if (r0 != null) {
            r0.hide();
        }
        AnonymousClass0fD.A0A(874880490, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1200553072);
        C47677ECm.super.onStart();
        AnonymousClass6ST r0 = this.A00.A07;
        if (r0 != null) {
            AnonymousClass0fN.A00(r0);
        }
        AnonymousClass0fD.A0A(1446258348, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(814320771);
        int A032 = AnonymousClass0fD.A03(-125908266);
        C47490E4u e4u = this.A00;
        if (e4u.getActivity() != null) {
            new C46669Diy((Uri) null, e4u.A01, 0).execute(new Void[0]);
        }
        AnonymousClass0fD.A0A(1505290076, A032);
        AnonymousClass0fD.A0A(286186993, A03);
    }
}
