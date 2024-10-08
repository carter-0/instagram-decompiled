package X;

/* renamed from: X.3Eq  reason: invalid class name and case insensitive filesystem */
public final class C239063Eq extends 1P0 {
    public final /* synthetic */ 1IX A00;
    public final /* synthetic */ boolean A01;

    public C239063Eq(1IX r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1038864198);
        0qQ.A0B(r4, 0);
        this.A00.resumeWith(new C297815sO(r4));
        AnonymousClass0fD.A0A(689658036, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-515900618);
        int A032 = AnonymousClass0fD.A03(761574318);
        0qQ.A0B(obj, 0);
        if (!this.A01) {
            this.A00.resumeWith(new C239793Ih(obj));
        }
        AnonymousClass0fD.A0A(1918195663, A032);
        AnonymousClass0fD.A0A(-1933789626, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(1474658502);
        int A032 = AnonymousClass0fD.A03(1061021562);
        0qQ.A0B(obj, 0);
        if (this.A01) {
            this.A00.resumeWith(new C239793Ih(obj));
        }
        AnonymousClass0fD.A0A(1206571206, A032);
        AnonymousClass0fD.A0A(-849576076, A03);
    }
}
