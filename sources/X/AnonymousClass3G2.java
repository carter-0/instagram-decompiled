package X;

/* renamed from: X.3G2  reason: invalid class name */
public final class AnonymousClass3G2 implements Runnable {
    public final /* synthetic */ 2Kz A00;

    public AnonymousClass3G2(2Kz r1) {
        this.A00 = r1;
    }

    public final void run() {
        2Kz r9 = this.A00;
        0xa r8 = AnonymousClass0xl.A00(C61170le.A00).A00;
        long j = r8.getLong("device_info_last_reported_time_foreground", 0);
        long currentTimeMillis = System.currentTimeMillis();
        0KC.A0C("fatal", "runForegroundReporters");
        if (currentTimeMillis > j + 43200000) {
            2Kz.A00(r9, r9.A03);
            0xY AR4 = r8.AR4();
            AR4.E5c("device_info_last_reported_time_foreground", currentTimeMillis);
            AR4.apply();
        }
    }
}
