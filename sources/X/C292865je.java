package X;

/* renamed from: X.5je  reason: invalid class name and case insensitive filesystem */
public final class C292865je extends 1P0 {
    public final 1P0 A00;

    public C292865je(1P0 r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-1744960163);
        0qQ.A0B(r3, 0);
        1P0 r0 = this.A00;
        r0.onFail(r3);
        r0.onFinish();
        AnonymousClass0fD.A0A(1065464871, A03);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-1274674716);
        0qQ.A0B(r3, 0);
        this.A00.onFailInBackground(r3);
        AnonymousClass0fD.A0A(-677493621, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-500376419);
        this.A00.onStart();
        AnonymousClass0fD.A0A(-533765357, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1438698873);
        int A032 = AnonymousClass0fD.A03(64596885);
        0qQ.A0B(obj, 0);
        1P0 r0 = this.A00;
        r0.onSuccess(obj);
        r0.onFinish();
        AnonymousClass0fD.A0A(-761652704, A032);
        AnonymousClass0fD.A0A(1067949142, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-27105606);
        int A032 = AnonymousClass0fD.A03(220280697);
        0qQ.A0B(obj, 0);
        this.A00.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(938727743, A032);
        AnonymousClass0fD.A0A(-307721480, A03);
    }
}
