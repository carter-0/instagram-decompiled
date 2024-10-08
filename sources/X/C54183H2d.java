package X;

import com.instagram.creator.agent.settings.facts.repository.FactsRepository;

/* renamed from: X.H2d  reason: case insensitive filesystem */
public final class C54183H2d extends AnonymousClass8ZF {
    public final H2V A00;
    public final H2T A01;
    public final H2Q A02;

    public final void A00() {
        Object value;
        C53295Glh glh;
        boolean z;
        05G r2 = this.A00.A05;
        do {
            value = r2.getValue();
            glh = (C53295Glh) value;
            z = glh.A06;
        } while (!r2.AIY(value, new C53295Glh((C54617HLa) null, glh.A04, glh.A03, glh.A01, glh.A00, z, glh.A05)));
    }

    public C54183H2d(FactsRepository factsRepository, H2V h2v, H2T h2t, H2Q h2q) {
        this.A01 = h2t;
        this.A00 = h2v;
        this.A02 = h2q;
        h2t.A04(this, true);
        h2v.A04(this, true);
        h2q.A04(this, true);
        addCloseable(factsRepository);
    }
}
