package X;

/* renamed from: X.KiG  reason: case insensitive filesystem */
public enum C62583KiG {
    ENTER_AR_EFFECT(DbS.A0z(r4), 0),
    EXIT_AR_EFFECT(DbS.A0z(r8), 1),
    ENTER_AUDIO_ADJUST(DbS.A0z(r4), 2),
    EXIT_AUDIO_ADJUST(DbS.A0z(r6), 3),
    ENTER_AUDIO_FILTER(DbS.A0z(r4), 4),
    EXIT_AUDIO_FILTER((String) null, 5),
    ENTER_COLOR_FILTER(DbS.A0z(r4), 6),
    EXIT_COLOR_FILTER(DbS.A0z(r8), 7),
    ENTER_REORDER(DbS.A0z(r4), 8),
    EXIT_REORDER(DbS.A0z(r8), 9),
    ENTER_SLIP(DbS.A0z(r4), 10),
    EXIT_SLIP(DbS.A0z(r7), 11),
    ENTER_SPEED(DbS.A0z(r4), 12),
    EXIT_SPEED(DbS.A0z(r7), 13),
    ENTER_TEXT_TO_SPEECH(DbS.A0z(r4), 14),
    EXIT_TEXT_TO_SPEECH(DbS.A0z(r7), 15),
    ENTER_TRANSITION(DbS.A0z(r4), 16),
    EXIT_TRANSITION(DbS.A0z(r8), 17),
    ENTER_VOLUME_CONTROLS(DbS.A0z(r4), 18);
    
    public final C62230ry A00;
    public final C62230ry A01;

    /* access modifiers changed from: public */
    static {
        C62583KiG[] kiGArr;
        A02 = 0oU.A00(kiGArr);
    }

    /* access modifiers changed from: public */
    C62583KiG(C62230ry r3, int i) {
        this.A01 = r2;
        this.A00 = r3;
    }
}
