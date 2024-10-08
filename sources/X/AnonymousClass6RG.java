package X;

/* renamed from: X.6RG  reason: invalid class name */
public final class AnonymousClass6RG implements AnonymousClass6RF {
    public final /* synthetic */ AnonymousClass6RA A00;
    public final /* synthetic */ AnonymousClass6RF A01;

    public AnonymousClass6RG(AnonymousClass6RA r1, AnonymousClass6RF r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void Dlc(Object obj) {
        AnonymousClass6RL r6 = (AnonymousClass6RL) obj;
        0qQ.A0B(r6, 0);
        AnonymousClass6RA r4 = this.A00;
        Object obj2 = r4.A04;
        AnonymousClass6RF r2 = this.A01;
        synchronized (obj2) {
            AnonymousClass6RN r0 = r4.A00;
            if (r0 == null) {
                0qQ.A0F("snapshot");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass6RN r02 = new AnonymousClass6RN(r6, r0.A01);
            r4.A00 = r02;
            r2.Dlc(r02);
        }
    }
}
