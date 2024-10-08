package X;

/* renamed from: X.Ksg  reason: case insensitive filesystem */
public abstract class C63173Ksg {
    public static final C62583KiG A00(AnonymousClass8RH r6, AnonymousClass8RH r7) {
        boolean A02;
        boolean A1Z = AnonymousClass7TG.A1Z(r6, r7);
        for (C62583KiG kiG : C62583KiG.values()) {
            if (kiG.A01 != null || kiG.A00 == null) {
                if (kiG.A01 == null || kiG.A00 != null) {
                    if (kiG.A01 != null && kiG.A00 != null && 0q1.A02(kiG.A01.A00, r6) && 0q1.A02(kiG.A00.A00, r7)) {
                        return kiG;
                    }
                } else if (0q1.A02(kiG.A01.A00, r6)) {
                    Class<?> cls = r7.getClass();
                    0qQ.A0B(cls, A1Z ? 1 : 0);
                    A02 = 0q1.A02(cls, r6);
                } else {
                    continue;
                }
            } else if (0q1.A02(kiG.A00.A00, r7)) {
                Class<?> cls2 = r6.getClass();
                0qQ.A0B(cls2, A1Z);
                A02 = 0q1.A02(cls2, r7);
            } else {
                continue;
            }
            if (!A02) {
                return kiG;
            }
        }
        return null;
    }
}
