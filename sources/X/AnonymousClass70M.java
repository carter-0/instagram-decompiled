package X;

/* renamed from: X.70M  reason: invalid class name */
public enum AnonymousClass70M {
    A05(r1, "LIVE", 0),
    A0G(r15, "UNSEEN_STORY", 1),
    A0H(r5, "UNSEEN_STORY_WITH_NEW_BADGE", 2),
    A0C(r15, "UNSEEN_CLOSE_FRIENDS_STORY", 3),
    A0D(r13, "UNSEEN_CLOSE_FRIENDS_STORY_WITH_NEW_BADGE", 4),
    A0E(r15, "UNSEEN_PRIDE_STORY", 5),
    A0F(r13, "UNSEEN_PRIDE_STORY_WITH_NEW_BADGE", 6),
    A0A(r15, "SEEN_STORY", 7),
    A0B(r13, "SEEN_STORY_WITH_NEW_BADGE", 8),
    A06(r15, "NO_REELS", 9),
    A07(r13, "NO_REELS_WITH_NEW_BADGE", 10),
    A09(r14, "NO_REELS_WITH_PROFILE_PIC_CREATION_NUDGE_OVERLAY", 11),
    A08(r18, "NO_REELS_WITH_PROFILE_PIC_CREATION_NUDGE_BADGE", 12);
    
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    /* access modifiers changed from: public */
    static {
        AnonymousClass70M[] r0;
        A03 = 0oU.A00(r0);
    }

    public final float A00() {
        int intValue = this.A02.intValue();
        if (intValue == 1) {
            return 1.0f;
        }
        if (intValue == 0 || intValue == 2) {
            return 0.625f;
        }
        throw new RuntimeException();
    }

    /* access modifiers changed from: public */
    AnonymousClass70M(Integer num, String str, int i) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = num;
    }
}
