package X;

public final class FB8 {
    public static final FB8 A00 = new Object();

    public final Integer A00() {
        int i = 0xn.A01("age_verification_settings_preferences").getInt("age_verification_settings_blocked_state", 0);
        if (i == 0) {
            return AnonymousClass05K.A00;
        }
        if (i == 1) {
            return AnonymousClass05K.A01;
        }
        if (i == 2) {
            return AnonymousClass05K.A0C;
        }
        throw DbW.A0b("Invalid state ", i);
    }
}
