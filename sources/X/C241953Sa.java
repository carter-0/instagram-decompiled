package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3Sa  reason: invalid class name and case insensitive filesystem */
public abstract class C241953Sa {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public String A00() {
        return "thread_item_seen";
    }

    public C241953Sa(String str, String str2, String str3) {
        String valueOf = String.valueOf(AnonymousClass0HN.A00());
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = valueOf;
        this.A00 = micros;
    }
}
