package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dwi  reason: case insensitive filesystem */
public final class C47372Dwi extends C272124k8 {
    public final /* synthetic */ C272124k8 A00;
    public final /* synthetic */ 1n1 A01;
    public final /* synthetic */ C66431mz A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47372Dwi(C272124k8 r1, UserSession userSession, 1n1 r3, C66431mz r4) {
        super(userSession);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, -1623136593);
        this.A00.onFail(r5);
        ((02m) AnonymousClass7TE.A14(this.A01.A01)).markerEnd(834877734, 3);
        AnonymousClass0fD.A0A(-1395652363, A0D);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1353828501);
        super.onStart();
        AnonymousClass0eM r4 = this.A01.A01;
        ((02m) AnonymousClass7TE.A14(r4)).markerStart(834877734);
        ((02m) AnonymousClass7TE.A14(r4)).markerAnnotate(834877734, "trigger_source", "typing_indicator_thread_level_toggle");
        ((02m) AnonymousClass7TE.A14(r4)).markerAnnotate(834877734, AnonymousClass000.A00(680), this.A02.A01);
        AnonymousClass0fD.A0A(1795034662, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(159715493);
        int A0D = AnonymousClass7TG.A0D(obj, 566930498);
        this.A00.onSuccess(obj);
        ((02m) AnonymousClass7TE.A14(this.A01.A01)).markerEnd(834877734, 2);
        AnonymousClass0fD.A0A(462313562, A0D);
        AnonymousClass0fD.A0A(427641417, A03);
    }
}
