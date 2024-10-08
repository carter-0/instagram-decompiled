package X;

/* renamed from: X.4hd  reason: invalid class name and case insensitive filesystem */
public final class C270934hd {
    public final AnonymousClass0JP A00;
    public final AnonymousClass0JR A01;

    public final long A00(C276164sm r11) {
        long now = this.A00.now();
        long now2 = this.A01.now();
        long elapsedRealtimeNanos = r11.A00.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos != 0 && Long.valueOf(elapsedRealtimeNanos) != null) {
            return (((now2 * 1000000) - elapsedRealtimeNanos) + 500000) / 1000000;
        }
        if (r11.A03() != null) {
            return now - r11.A03().longValue();
        }
        return Long.MIN_VALUE;
    }

    public C270934hd(AnonymousClass0JP r1, AnonymousClass0JR r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
