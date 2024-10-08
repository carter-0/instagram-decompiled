package X;

/* renamed from: X.5tI  reason: invalid class name and case insensitive filesystem */
public final class C298355tI extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C242143Su A01;

    public C298355tI(C242143Su r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onFail(C268654dm r6) {
        Throwable A012;
        int A03 = AnonymousClass0fD.A03(-781819262);
        if (!(r6 == null || (A012 = r6.A01()) == null)) {
            String A002 = AnonymousClass000.A00(952);
            0KC.A0L(A002, "LocationUpdateMutation error (discarding %d locations)", A012, new Object[]{Integer.valueOf(this.A00)});
            0wb.A06(A002, "LocationUpdateMutation error", A012);
        }
        AnonymousClass0fD.A0A(1182316232, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-2055933243);
        AnonymousClass0fD.A0A(-1986668818, AnonymousClass0fD.A03(-755614562));
        AnonymousClass0fD.A0A(-2048142037, A03);
    }
}
