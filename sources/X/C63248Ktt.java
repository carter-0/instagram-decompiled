package X;

/* renamed from: X.Ktt  reason: case insensitive filesystem */
public abstract class C63248Ktt {
    public static final C61022JvM A00(C61018JvI jvI) {
        long currentTimeMillis;
        0qQ.A0B(jvI, 0);
        String str = jvI.A08;
        Long l = jvI.A06;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        int i = jvI.A00;
        int i2 = jvI.A01;
        int i3 = jvI.A02;
        String str2 = jvI.A09;
        String str3 = jvI.A0A;
        String str4 = jvI.A0B;
        return new C61022JvM(jvI.A03, jvI.A04, jvI.A07, jvI.A05, str, str2, str3, str4, i, i2, i3, currentTimeMillis, jvI.A0D);
    }
}
