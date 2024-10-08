package X;

/* renamed from: X.7r0  reason: invalid class name and case insensitive filesystem */
public abstract class C343907r0 implements C343917r1 {
    public C343837qt A00;
    public boolean A01;

    public final Object A06(C343667qb r3) {
        Object Apu = this.A00.Apu(r3);
        if (Apu != null) {
            return Apu;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Configuration is not available: ");
        sb.append(r3);
        throw new IllegalArgumentException(sb.toString());
    }
}
