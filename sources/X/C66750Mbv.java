package X;

/* renamed from: X.Mbv  reason: case insensitive filesystem */
public final class C66750Mbv extends 1P0 {
    public final 1P0 A00;
    public final 1P0 A01;
    public final /* synthetic */ C66716MbN A02;

    public C66750Mbv(1P0 r1, 1P0 r2, C66716MbN mbN) {
        this.A02 = mbN;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -371646442);
        this.A00.onFail(r3);
        this.A01.onFail(r3);
        AnonymousClass0fD.A0A(1392611317, A0D);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -878368435);
        this.A00.onFailInBackground(r3);
        this.A01.onFailInBackground(r3);
        AnonymousClass0fD.A0A(2120958448, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1201841572);
        this.A00.onFinish();
        this.A01.onFinish();
        AnonymousClass0fD.A0A(2139316771, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1524490160);
        this.A00.onStart();
        this.A01.onStart();
        AnonymousClass0fD.A0A(-1101440908, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(974213705);
        int A0D = AnonymousClass7TG.A0D(obj, 2006045583);
        this.A00.onSuccess(obj);
        this.A01.onSuccess(obj);
        AnonymousClass0fD.A0A(1548645671, A0D);
        AnonymousClass0fD.A0A(153171880, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(764466790);
        int A0D = AnonymousClass7TG.A0D(obj, -1456889648);
        this.A00.onSuccessInBackground(obj);
        this.A01.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(-1066407328, A0D);
        AnonymousClass0fD.A0A(2103112669, A03);
    }
}
