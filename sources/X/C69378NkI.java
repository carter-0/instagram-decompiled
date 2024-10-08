package X;

/* renamed from: X.NkI  reason: case insensitive filesystem */
public enum C69378NkI {
    EFFECT,
    FILTER,
    MULTIPEER,
    SOLO_BACKGROUNDS,
    AVATAR,
    AVATAR_BACKGROUND;

    /* access modifiers changed from: public */
    static {
        C69378NkI[] nkIArr;
        A00 = 0oU.A00(nkIArr);
    }

    public final C69350Njp A00(boolean z) {
        switch (ordinal()) {
            case 0:
                return C69350Njp.EFFECTS_TAB;
            case 1:
                if (!z) {
                    return C69350Njp.FILTERS_TAB;
                }
                return C69350Njp.AVATAR_FILTERS_TAB;
            case 2:
                return C69350Njp.GROUP_EFFECTS_TAB;
            case 3:
                return C69350Njp.SOLO_BACKGROUNDS;
            case 4:
                return C69350Njp.AVATARS_TAB;
            case 5:
                return C69350Njp.AVATAR_BACKGROUNDS_TAB;
            default:
                throw AnonymousClass7TE.A1K();
        }
    }
}
