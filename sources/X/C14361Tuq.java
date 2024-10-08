package X;

/* renamed from: X.Tuq  reason: case insensitive filesystem */
public final class C14361Tuq implements C230902qW {
    public final /* synthetic */ AnonymousClass32L A00;

    public C14361Tuq(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void DR0(AnonymousClass4UE r3) {
        AnonymousClass4UC r32;
        0qQ.A0B(r3, 0);
        C14227TsA tsA = this.A00.A04;
        if (tsA == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        if (r3 instanceof AnonymousClass4UC) {
            r32 = (AnonymousClass4UC) r3;
        } else {
            r32 = null;
        }
        tsA.A01 = r32;
        C14227TsA.A00(tsA);
    }
}
