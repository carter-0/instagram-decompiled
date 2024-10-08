package X;

import java.util.Set;

/* renamed from: X.Fes  reason: case insensitive filesystem */
public final class C50583Fes implements MVE {
    public final /* synthetic */ F2T A00;
    public final /* synthetic */ C53324GmA A01;
    public final /* synthetic */ 0sL A02;

    public C50583Fes(F2T f2t, C53324GmA gmA, 0sL r3) {
        this.A00 = f2t;
        this.A01 = gmA;
        this.A02 = r3;
    }

    public final void D9N() {
        F2T f2t = this.A00;
        C53324GmA gmA = this.A01;
        f2t.A00(gmA.A01, gmA.A00);
    }

    public final void DVo() {
        0sL r2 = this.A02;
        C53324GmA gmA = this.A01;
        r2.invoke(gmA.A01, Integer.valueOf(gmA.A00));
    }

    public final void Dg7() {
        F2T f2t = this.A00;
        C53324GmA gmA = this.A01;
        AnonymousClass3UM r5 = gmA.A01;
        int i = gmA.A00;
        0qQ.A0B(r5, 0);
        String id = r5.getId();
        C230012om r2 = f2t.A02;
        AnonymousClass6KM A0Y = DbZ.A0Y(r5, "fullscreen", id, r2.A02, i);
        DbW.A1M(r5, A0Y);
        DbY.A1Q(r5, A0Y);
        r2.A0B(new AnonymousClass6KN(A0Y));
        0sL r22 = f2t.A00;
        if (r22 != null) {
            r22.invoke(r5.getId(), "recommended_user");
        }
    }

    public final void DgF() {
        F2T f2t = this.A00;
        C53324GmA gmA = this.A01;
        AnonymousClass3UM r6 = gmA.A01;
        int i = gmA.A00;
        0qQ.A0B(r6, 0);
        if (((Set) f2t.A03.getValue()).add(DbU.A0q(r6))) {
            String id = r6.getId();
            C230012om r3 = f2t.A02;
            AnonymousClass6KM r1 = new AnonymousClass6KM("fullscreen", id, r3.A02);
            r1.A00 = i;
            DbW.A1M(r6, r1);
            r1.A04 = r6.getAlgorithm();
            DbY.A1Q(r6, r1);
            DbV.A1T(r1, r3);
        }
    }
}
