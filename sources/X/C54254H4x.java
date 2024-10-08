package X;

/* renamed from: X.H4x  reason: case insensitive filesystem */
public final class C54254H4x extends 1P0 {
    public final C324596za A00;
    public final C324366zA A01;
    public final AnonymousClass11X A02;

    public C54254H4x(AnonymousClass11X r2, C324596za r3, C324366zA r4) {
        0qQ.A0B(r4, 2);
        this.A02 = r2;
        this.A01 = r4;
        this.A00 = r3;
    }

    public final void onFail(C268654dm r4) {
        int A0D = AnonymousClass7TG.A0D(r4, -1475272207);
        C324366zA r1 = this.A01;
        r1.A01 = null;
        r1.A00(AnonymousClass05K.A01);
        this.A00.onFail(r4);
        AnonymousClass0fD.A0A(-1425992250, A0D);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 1959791012);
        this.A00.onFailInBackground(r3);
        AnonymousClass0fD.A0A(-1210725006, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1563496711);
        this.A00.onFinish();
        AnonymousClass0fD.A0A(-664548062, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1938740161);
        C324366zA r1 = this.A01;
        r1.A00(AnonymousClass05K.A00);
        r1.A01 = this.A02;
        this.A00.onStart();
        AnonymousClass0fD.A0A(1686848174, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-595769799);
        AnonymousClass1XV r6 = (AnonymousClass1XV) obj;
        int A0D = AnonymousClass7TG.A0D(r6, -29321431);
        C324366zA r2 = this.A01;
        r2.A01 = null;
        r2.A00(AnonymousClass05K.A0C);
        r2.A0A = r6.CP6();
        boolean CPJ = r6.CPJ();
        String nextMaxId = r6.getNextMaxId();
        if (CPJ) {
            r2.A06 = nextMaxId;
        } else {
            r2.A07 = nextMaxId;
        }
        this.A00.onSuccess(r6);
        AnonymousClass0fD.A0A(1923467156, A0D);
        AnonymousClass0fD.A0A(-754235887, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(1490628625);
        int A0D = AnonymousClass7TG.A0D(obj, -1120690383);
        this.A00.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(1165528539, A0D);
        AnonymousClass0fD.A0A(-671140569, A03);
    }
}
