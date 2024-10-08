package X;

import java.security.GeneralSecurityException;

/* renamed from: X.97t  reason: invalid class name and case insensitive filesystem */
public final class C3739997t implements C3740097u {
    public final AnonymousClass97O A00;
    public final AnonymousClass98D A01;
    public final AnonymousClass97R A02;
    public final C3740497y A03;
    public final Integer A04;
    public final String A05;

    public static C3739997t A00(AnonymousClass97O r1, AnonymousClass98D r2, AnonymousClass97R r3, Integer num, String str) {
        if (r2 == AnonymousClass98D.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C3739997t(r1, r2, r3, num, str);
    }

    public final C3740497y BXl() {
        return this.A03;
    }

    public C3739997t(AnonymousClass97O r2, AnonymousClass98D r3, AnonymousClass97R r4, Integer num, String str) {
        this.A05 = str;
        this.A03 = C3740397x.A01(str);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = num;
    }
}
