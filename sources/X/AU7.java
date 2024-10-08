package X;

public final class AU7 implements C341127mN {
    public final /* synthetic */ C363898kX A00;

    public AU7(C363898kX r1) {
        this.A00 = r1;
    }

    public final void EEt(Long l) {
        C363898kX r2 = this.A00;
        C344477rv r0 = r2.A00;
        if (r0 == null) {
            0qQ.A0F("mediaGraphController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.getHandler().post(new C40738AiQ(r2));
        }
    }
}
