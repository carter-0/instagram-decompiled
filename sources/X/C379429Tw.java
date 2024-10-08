package X;

/* renamed from: X.9Tw  reason: invalid class name and case insensitive filesystem */
public final class C379429Tw implements C345537tg {
    public final /* synthetic */ AnonymousClass9Tu A00;

    public C379429Tw(AnonymousClass9Tu r1) {
        this.A00 = r1;
    }

    public final void DQO(Long l) {
        AnonymousClass9Tu r3 = this.A00;
        Object obj = r3.A0M;
        synchronized (obj) {
            r3.A07 = true;
            r3.A00--;
            obj.notifyAll();
        }
    }
}
