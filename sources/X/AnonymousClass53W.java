package X;

/* renamed from: X.53W  reason: invalid class name */
public final class AnonymousClass53W extends 1P0 {
    public final /* synthetic */ AnonymousClass53U A00;

    public AnonymousClass53W(AnonymousClass53U r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-1003484271);
        0qQ.A0B(r3, 0);
        AnonymousClass53W.super.onFail(r3);
        this.A00.DED();
        AnonymousClass0fD.A0A(329095404, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-370569210);
        int A032 = AnonymousClass0fD.A03(-356710053);
        0qQ.A0B(obj, 0);
        AnonymousClass53W.super.onSuccess(obj);
        this.A00.onSuccess();
        AnonymousClass0fD.A0A(-2011770407, A032);
        AnonymousClass0fD.A0A(1766515788, A03);
    }
}
