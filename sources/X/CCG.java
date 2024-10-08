package X;

public final class CCG extends C250663lr implements DaJ {
    public final boolean AkX() {
        return getCoercedBooleanField(0, "can_see_fxim");
    }

    public final boolean AkZ() {
        return getCoercedBooleanField(1, "can_see_native_reminders");
    }

    public final DYF BEg() {
        return (DYF) getOptionalTreeField(5, "identities", CCC.class, 612826622);
    }

    public final DYz Bh0() {
        return (DYz) A04(CCD.class, "fxim_reminder_info(field:\"PROFILE_PHOTO\")", 1272976757);
    }

    public final G9V Bps() {
        return (G9V) getOptionalTreeField(4, "screen_resources", CCE.class, 201217818);
    }

    public final G9E CD4() {
        return (G9E) getOptionalTreeField(3, "fxim_reminder_info(field:\"USERNAME\")", CCF.class, -280533698);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "can_see_fxim"), AnonymousClass7TE.A0f(r1, "can_see_native_reminders"), C41845B3m.A0C(CCD.class, "fxim_reminder_info(field:\"PROFILE_PHOTO\")", 1272976757), C41845B3m.A0C(CCF.class, "fxim_reminder_info(field:\"USERNAME\")", -280533698), C41845B3m.A0C(CCE.class, "screen_resources", 201217818), C41845B3m.A0C(CCC.class, "identities", 612826622)});
    }

    public CCG(int i) {
        super(i);
    }

    public CCG() {
        super(-1287955954);
    }
}
