package X;

/* renamed from: X.657  reason: invalid class name */
public final /* synthetic */ class AnonymousClass657 implements 0sL {
    public final /* synthetic */ AnonymousClass43X A00;

    public /* synthetic */ AnonymousClass657(AnonymousClass43X r1) {
        this.A00 = r1;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        AnonymousClass43X r1 = this.A00;
        AnonymousClass651 r5 = (AnonymousClass651) obj2;
        AnonymousClass6BH A06 = r1.A01.A06((String) obj);
        if (A06 != null) {
            AnonymousClass4UY r12 = r1.A02;
            0qQ.A0B(r5, 0);
            AnonymousClass654.A00(r12.A00, r5, "wait_for_thread_snapshot_start");
            A06.A03.add(r5);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
