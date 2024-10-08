package X;

/* renamed from: X.INv  reason: case insensitive filesystem */
public final class C57081INv implements 1wn {
    public final /* synthetic */ AnonymousClass32L A00;

    public C57081INv(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1782528354);
        C57066INg iNg = (C57066INg) obj;
        int A0D = AnonymousClass7TG.A0D(iNg, 1559690968);
        C14074TpO tpO = this.A00.A06;
        if (tpO == null) {
            0qQ.A0F("grid");
            throw AnonymousClass00P.createAndThrow();
        }
        String id = iNg.A00.getId();
        if (id != null) {
            tpO.A08(id);
            AnonymousClass0fD.A0A(-2030496692, A0D);
            AnonymousClass0fD.A0A(196523172, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(2139443637, A0D);
        throw A0y;
    }
}
