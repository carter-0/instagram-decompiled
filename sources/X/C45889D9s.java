package X;

/* renamed from: X.D9s  reason: case insensitive filesystem */
public abstract class C45889D9s {
    public static final C250673ls A00(C250673ls r5) {
        C250673ls r4 = null;
        if (r5 instanceof C43189BuD) {
            C250663lr A03 = ((C250663lr) r5).A03(C43188BuC.class, AnonymousClass000.A00(199), -1506725993);
            if (A03 != null) {
                r4 = (C43187BuB) A03.A02(C43187BuB.class, AnonymousClass000.A00(1790), -1178621019);
            }
        } else if (!(r5 instanceof C43197BuL)) {
            return null;
        } else {
            C250663lr A032 = ((C250663lr) r5).A03(C43196BuK.class, AnonymousClass000.A00(199), -508970197);
            if (A032 != null) {
                r4 = (C43195BuJ) A032.A02(C43195BuJ.class, AnonymousClass000.A00(1908), -1833591441);
            }
        }
        return r4;
    }

    public static final C45407Cvn A01(C250673ls r4) {
        C250663lr r42;
        Class cls;
        int i;
        String str;
        int i2;
        if (r4 instanceof C43187BuB) {
            r42 = (C250663lr) r4;
            cls = C43185Bu9.class;
            i = 0;
            str = "edges";
            i2 = -237310242;
        } else if (!(r4 instanceof C43195BuJ)) {
            return null;
        } else {
            r42 = (C250663lr) r4;
            cls = C43193BuH.class;
            i = 0;
            str = "edges";
            i2 = -609830347;
        }
        return r42.getRequiredCompactedPaginableListEdgesField(i, str, cls, i2);
    }

    public static final C43369Bx7 A02(C250673ls r6) {
        C250663lr optionalTreeField;
        C250663lr reinterpretIfFulfillsType;
        if (r6 instanceof C43185Bu9) {
            reinterpretIfFulfillsType = ((C250663lr) r6).A03(C43184Bu8.class, "node", -275832008);
        } else if (!(r6 instanceof C43193BuH) || (optionalTreeField = ((C250663lr) r6).getOptionalTreeField(0, "node", C43192BuG.class, -658497755)) == null) {
            return null;
        } else {
            reinterpretIfFulfillsType = optionalTreeField.reinterpretIfFulfillsType(0, "XFBGENAIPersonaSection", C43191BuF.class, 1257802499);
        }
        if (reinterpretIfFulfillsType != null) {
            return (C43369Bx7) reinterpretIfFulfillsType.A01(C43369Bx7.class, 1054269527);
        }
        return null;
    }
}
