package X;

public final class KYZ extends C64839Lj1 {
    public static final C63902LBi A01 = new Object();
    public AnonymousClass819 A00;

    public final int A07() {
        int i;
        0xa r1;
        String str;
        1Av A002 = 1Au.A00(this.A0E);
        AnonymousClass819 r12 = this.A00;
        if (r12 == null) {
            0qQ.A0F("upsellVariant");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r12 == AnonymousClass819.BOTTOMSHEET_MIGRATION_STORIES_WAVE2) {
            r1 = A002.A01;
            str = "story_xpost_user_migration_upsell_second_wave_display_count";
        } else if (r12 == AnonymousClass819.BOTTOMSHEET_MIGRATION_FEED_WAVE2) {
            r1 = A002.A01;
            str = "feed_xpost_user_migration_upsell_second_wave_display_count";
        } else {
            i = 0;
            return i + 1;
        }
        i = DbT.A00(r1, str);
        return i + 1;
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A0E.A03(KYZ.class);
    }
}
