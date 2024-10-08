package X;

/* renamed from: X.ASf  reason: case insensitive filesystem */
public final class C40115ASf implements 2Kw {
    public final int A00;
    public final Object A01;

    public C40115ASf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                0qQ.A0A(th);
                ((AWX) this.A01).onFailure(th);
                return;
            case 1:
                0qQ.A0B(th, 0);
                ((C360678ey) this.A01).A00.A02(new C268664dn(th));
                return;
            case 2:
                ((AnonymousClass7QQ) this.A01).A01.A00(false);
                0KC.A0C("AiAgentEmbodimentRepository", "Failed to fetch agent embodiment behavior graph");
                return;
            case 3:
                ((C249523jv) this.A01).FIG(new C297815sO(th));
                return;
            default:
                ((C347307wb) this.A01).A00(th);
                return;
        }
    }
}
