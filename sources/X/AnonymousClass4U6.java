package X;

/* renamed from: X.4U6  reason: invalid class name */
public abstract class AnonymousClass4U6 {
    public static final void A00(C232672uC r1, AnonymousClass310 r2, Object obj, Object obj2, int i) {
        r1.A7V(i, obj, obj2);
        if (i == C231592rv.LITHO_HYBRID_FULL_HEIGHT_SINGLE_MEDIA.ordinal() || i == C231592rv.LITHO_FULL_HEIGHT_SINGLE_MEDIA.ordinal() || i == C231592rv.FULL_HEIGHT_SINGLE_MEDIA.ordinal() || i == C231592rv.FULL_HEIGHT_CAROUSEL_MEDIA.ordinal() || i == C231592rv.IMMERSIVE_COMBINED_MEDIA.ordinal() || i == C231592rv.IMMERSIVE_SERVER_RENDERED_MEDIA.ordinal()) {
            r2.BRO().A88(i);
            return;
        }
        int ordinal = C231592rv.MEDIA_COMMENT.ordinal();
        AnonymousClass3WV BRO = r2.BRO();
        if (i == ordinal) {
            BRO.A85((C245833dY) obj2, i);
        } else {
            BRO.AAB(i);
        }
    }

    public static final void A01(C232672uC r0, AnonymousClass310 r1, Object obj, Object obj2, int i) {
        AnonymousClass3WV BRO;
        C231592rv r02;
        r0.A7V(i, obj, obj2);
        if (i == C231592rv.LITHO_HYBRID_FULL_HEIGHT_SINGLE_MEDIA.ordinal() || i == C231592rv.FULL_HEIGHT_SINGLE_MEDIA.ordinal()) {
            r1.BRO().AAB(i);
            r1.BRO().A88(C231592rv.MEDIA_CONTENT.ordinal());
        } else if (i == C231592rv.LITHO_FULL_HEIGHT_SINGLE_MEDIA_CLIPS_UI.ordinal() || i == C231592rv.LITHO_FULL_HEIGHT_SINGLE_MEDIA.ordinal()) {
            r1.BRO().AAB(i);
            r1.BRO().A88(i);
        } else {
            if (i == C231592rv.FULL_HEIGHT_CAROUSEL_MEDIA.ordinal()) {
                r1.BRO().AAB(i);
                BRO = r1.BRO();
            } else if (i == C231592rv.IMMERSIVE_COMBINED_MEDIA.ordinal()) {
                r1.BRO().AAB(i);
                BRO = r1.BRO();
                if (!((1Xj) obj).A5D()) {
                    r02 = C231592rv.MEDIA_CONTENT;
                    BRO.A82(r02.ordinal());
                }
            } else {
                return;
            }
            r02 = C231592rv.CAROUSEL_CONTENT;
            BRO.A82(r02.ordinal());
        }
    }
}
