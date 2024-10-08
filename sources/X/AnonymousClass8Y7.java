package X;

/* renamed from: X.8Y7  reason: invalid class name */
public final class AnonymousClass8Y7 implements C3493580b {
    public final /* synthetic */ C252683pV A00;

    public AnonymousClass8Y7(C252683pV r1) {
        this.A00 = r1;
    }

    public final void Dmx(Object obj, Object obj2, Object obj3) {
        try {
            this.A00.FIG(new AnonymousClass9IV(36, obj, obj2));
        } catch (Throwable th) {
            0wb.A06("state_machine", 002.A0R("offer on closed channel: ", "state update"), th);
        }
    }
}
