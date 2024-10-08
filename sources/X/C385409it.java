package X;

/* renamed from: X.9it  reason: invalid class name and case insensitive filesystem */
public final class C385409it extends 1P0 {
    public final /* synthetic */ AnonymousClass57C A00;
    public final /* synthetic */ AnonymousClass8D9 A01;

    public C385409it(AnonymousClass57C r1, AnonymousClass8D9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1633124081);
        this.A01.A01 = false;
        AnonymousClass0fD.A0A(-353215802, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(520881549);
        this.A01.A01 = true;
        AnonymousClass0fD.A0A(-1779820573, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1413548585);
        int A032 = AnonymousClass0fD.A03(1039087595);
        C317876nz r2 = ((C384519hS) obj).A00;
        if (r2 != null) {
            AnonymousClass8D9.A00(this.A00, r2, this.A01);
        }
        AnonymousClass0fD.A0A(-313101239, A032);
        AnonymousClass0fD.A0A(-363554220, A03);
    }
}
