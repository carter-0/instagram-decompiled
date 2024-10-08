package X;

public final class PCI implements C3031367n {
    public C3031167l A00;
    public final AnonymousClass66d A01 = new C71737Opx(this, 6);

    public final /* bridge */ /* synthetic */ void EpW(Object obj) {
        C3031167l r6 = (C3031167l) obj;
        0qQ.A0B(r6, 0);
        AnonymousClass1aS r0 = 1aD.A06;
        this.A00 = r6;
        14i.A08();
        if (!14i.A08()) {
            C70105NxL.A00(r6.A01);
        } else {
            0no.A00().A01(new NRP(r6), 30000);
        }
        r6.A01.getAccountSession().getSessionedNotificationCenter().addObserver(this.A01, "MEMOfflineHandlingCompletionNotification", 1, (AnonymousClass2Lq) null);
    }

    public final void Ezd() {
        AnonymousClass1aS r0 = 1aD.A06;
        C3031167l r02 = this.A00;
        if (r02 == null) {
            0qQ.A0F("deps");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r02.A01.getAccountSession().getSessionedNotificationCenter().removeObserver(this.A01, "MEMOfflineHandlingCompletionNotification", (AnonymousClass2Lq) null);
        }
    }
}
