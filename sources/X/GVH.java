package X;

public final class GVH extends 03J implements 0sP {
    public final int A00 = 1;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GVH(C239993Jd r8) {
        super(1, C61920qH.class, "badgeToRule", "logAppIconBadgeAccuracy$badgeToRule$8(Lcom/instagram/notifications/badging/intf/BadgingLoggingContext;Lcom/instagram/notifications/badging/model/Badge;)Lcom/facebook/analytics/structuredlogger/enums/IGBadgeRenderingRule;", 0);
        this.A01 = r8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                float[] fArr = ((AnonymousClass5S4) obj).A00;
                C268064ch r1 = (C268064ch) ((C52698GbA) ((JLL) this.A01)).A03.getValue();
                if (r1 != null && r1.COx()) {
                    r1.FHq(fArr);
                }
                return C60340gF.A00;
            case 1:
                2aX r4 = (2aX) obj;
                0qQ.A0B(r4, 0);
                Object obj2 = this.A01;
                if (r4.A01 + r4.A00 > 0) {
                    if (0qQ.A0K(r4.A03, obj2)) {
                        return C294225m6.INDIVIDUAL_ORDERING_0;
                    }
                    return C294225m6.GROUP;
                }
                break;
            default:
                2aX r42 = (2aX) obj;
                0qQ.A0B(r42, 0);
                C239993Jd r2 = (C239993Jd) this.A01;
                if (r42.A01 + r42.A00 > 0) {
                    if (r2.A00 == C226252fx.NUMBERED) {
                        return C294225m6.NUMBER;
                    }
                    return C294225m6.DOT;
                }
                break;
        }
        return C294225m6.NO_INVENTORY;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GVH(C71062aE r7) {
        super(1, C61920qH.class, "badgeToRule", "logAccountSwitcherBadgingAccuracy$badgeToRule$7(Lcom/instagram/notifications/badging/constants/BadgeUseCase;Lcom/instagram/notifications/badging/model/Badge;)Lcom/facebook/analytics/structuredlogger/enums/IGBadgeRenderingRule;", 0);
        this.A01 = r7;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GVH(JLL jll) {
        super(1, C61920qH.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.A01 = jll;
    }
}
