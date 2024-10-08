package X;

/* renamed from: X.OPe  reason: case insensitive filesystem */
public abstract class C70865OPe {
    public static final C376649Iu A00(1Xj r8) {
        C277994w4 BQf;
        String title;
        String description;
        boolean z;
        if (r8 == null || (BQf = r8.BQf()) == null) {
            return null;
        }
        String BTL = r8.BTL();
        Integer num = null;
        if (C52501GVd.A04(BQf)) {
            title = BQf.getTitle();
            description = BQf.getDescription();
            if (description != null) {
                C278034w8 BE7 = BQf.BE7();
                if (BE7 != null) {
                    num = BE7.BED();
                }
                z = false;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (C52501GVd.A03(BQf) != AnonymousClass05K.A0N) {
            return null;
        } else {
            title = BQf.getTitle();
            description = BQf.getDescription();
            if (description != null) {
                C278034w8 BE72 = BQf.BE7();
                if (BE72 != null) {
                    num = BE72.BED();
                }
                z = true;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        return new C376649Iu(BTL, (Object) new C70815OMk(A01(num, z), title, description, z), 5);
    }

    public static final C69305Nj6 A01(Integer num, boolean z) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return C69305Nj6.EYE_OFF;
            }
            if (intValue == 0) {
                if (z) {
                    return C69305Nj6.INFO_FILLED;
                }
                return C69305Nj6.INFO;
            } else if (intValue == 2) {
                return C69305Nj6.NEWS_OFF;
            } else {
                if (intValue == 3) {
                    return C69305Nj6.WARNING;
                }
                if (intValue == 4) {
                    return C69305Nj6.PRIVATE;
                }
            }
        }
        throw AnonymousClass7TE.A0z("no glyph");
    }
}
