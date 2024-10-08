package X;

public abstract class EDI extends 1P0 {
    public final 1P0 A00;

    public EDI(1P0 r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 1420154755);
        this.A00.onFail(r3);
        AnonymousClass0fD.A0A(2142669173, A0D);
    }

    public void onFailInBackground(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, 406205892);
        this.A00.onFailInBackground(r3);
        AnonymousClass0fD.A0A(1303412379, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1055294187);
        this.A00.onFinish();
        AnonymousClass0fD.A0A(1787318387, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-340027552);
        this.A00.onStart();
        AnonymousClass0fD.A0A(623934768, A03);
    }

    public void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(417370329);
        this.A00.onSuccess(obj);
        AnonymousClass0fD.A0A(1696977451, A03);
    }

    public final void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-40390505);
        this.A00.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(-892149085, A03);
    }
}
