package X;

/* renamed from: X.7QT  reason: invalid class name */
public final class AnonymousClass7QT implements 1wn {
    public final /* synthetic */ C333637Zs A00;

    public AnonymousClass7QT(C333637Zs r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        AnonymousClass7QM r0;
        int A03 = AnonymousClass0fD.A03(-1112797440);
        AnonymousClass7QW r7 = (AnonymousClass7QW) obj;
        int A032 = AnonymousClass0fD.A03(1791750378);
        0qQ.A0B(r7, 0);
        AnonymousClass7QK r2 = this.A00.A00;
        int intValue = r7.A00.intValue();
        if (intValue == 0) {
            r0 = AnonymousClass7QM.START_TYPING;
        } else if (intValue != 1) {
            r0 = AnonymousClass7QM.SEND_QUERY;
        } else {
            r0 = AnonymousClass7QM.STOP_TYPING;
        }
        r2.A01(r0);
        AnonymousClass0fD.A0A(-710392555, A032);
        AnonymousClass0fD.A0A(1502231497, A03);
    }
}
