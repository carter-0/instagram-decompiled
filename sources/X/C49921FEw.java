package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.FEw  reason: case insensitive filesystem */
public final class C49921FEw {
    public static C49921FEw A00;
    public static final long A01 = TimeUnit.HOURS.toMillis(12);
    public static final F1S A02 = new Object();

    public final synchronized Integer A01() {
        Integer A002;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            FB8 fb8 = FB8.A00;
            long j = currentTimeMillis - 0xn.A01("age_verification_settings_preferences").getLong("age_verification_settings_cooldown_start_time", -1);
            if (fb8.A00() == AnonymousClass05K.A0C && j > A01) {
                0xY AR4 = 0xn.A01("age_verification_settings_preferences").AR4();
                AR4.E5Z("age_verification_settings_blocked_state", 0);
                AR4.apply();
            }
            A002 = fb8.A00();
        }
        return A002;
    }

    public final synchronized void A02() {
        Integer num;
        int i;
        if (FB8.A00.A00().intValue() == 0) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        0xY AR4 = 0xn.A01("age_verification_settings_preferences").AR4();
        if (1 - num.intValue() != 0) {
            i = 2;
        } else {
            i = 1;
        }
        AR4.E5Z("age_verification_settings_blocked_state", i);
        AR4.apply();
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR42 = 0xn.A01("age_verification_settings_preferences").AR4();
        AR42.E5c("age_verification_settings_cooldown_start_time", currentTimeMillis);
        AR42.apply();
    }

    public static final synchronized C49921FEw A00() {
        C49921FEw A002;
        synchronized (C49921FEw.class) {
            A002 = A02.A00();
        }
        return A002;
    }
}
