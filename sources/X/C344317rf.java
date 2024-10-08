package X;

/* renamed from: X.7rf  reason: invalid class name and case insensitive filesystem */
public abstract class C344317rf extends C343857qv implements C343697qe {
    public final C343837qt A00;

    public final C343697qe A0A(C343717qg r3) {
        02V.A07(this.A00, "Component not initialized.");
        return this.A00.Ape(r3);
    }

    public final Object A0B(C343667qb r3) {
        Object Apu = this.A00.Apu(r3);
        if (Apu != null) {
            return Apu;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Configuration is not available: ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }

    public C344317rf(C343837qt r1) {
        this.A00 = r1;
    }
}
