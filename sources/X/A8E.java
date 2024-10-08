package X;

public final class A8E {
    public final Integer A00(C379289Tg r4, AnonymousClass804 r5) {
        0qQ.A0B(r5, 0);
        if (r4 == null) {
            r4 = C379289Tg.STORY;
        }
        int ordinal = r4.ordinal();
        if (ordinal == 1) {
            if (r5 instanceof AnonymousClass803) {
                int ordinal2 = ((AnonymousClass803) r5).A00.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        return AnonymousClass05K.A0j;
                    }
                    throw AnonymousClass7TE.A1K();
                }
            } else if (r5 instanceof C339987kV) {
                return AnonymousClass05K.A0u;
            } else {
                if (r5 instanceof C340007kX) {
                    return AnonymousClass05K.A15;
                }
            }
            return AnonymousClass05K.A0Y;
        } else if (ordinal != 0) {
            throw AnonymousClass7TE.A1K();
        } else if (r5 instanceof C339987kV) {
            return AnonymousClass05K.A01;
        } else {
            return AnonymousClass05K.A00;
        }
    }
}
