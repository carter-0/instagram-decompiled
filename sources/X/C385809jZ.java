package X;

/* renamed from: X.9jZ  reason: invalid class name and case insensitive filesystem */
public final class C385809jZ extends 2Cn {
    public final /* synthetic */ AnonymousClass88B A00;

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        this.A00.A06.A0B(AnonymousClass88C.FAILURE);
    }

    public C385809jZ(AnonymousClass88B r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C349307zv r4 = (C349307zv) obj;
        0qQ.A0B(r4, 0);
        AnonymousClass88B r2 = this.A00;
        r2.A01 = AnonymousClass7TE.A0t(r4.A0k);
        r2.A06.A0B(AnonymousClass88C.SUCCESS);
        AnonymousClass7TF.A1O(r2.A07, true);
    }
}
