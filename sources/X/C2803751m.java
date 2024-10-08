package X;

/* renamed from: X.51m  reason: invalid class name and case insensitive filesystem */
public final class C2803751m extends 1Vf {
    public final /* synthetic */ C279014xw A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `screentime_sync` (`id`,`last_sync_time`,`tia_last_interval_end`) VALUES (nullif(?, 0),?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2803751m(C251983oI r1, C279014xw r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r4, Object obj) {
        C283685Iu r5 = (C283685Iu) obj;
        r4.ADa(1, (long) r5.A00);
        r4.ADa(2, r5.A01);
        Long l = r5.A02;
        if (l == null) {
            r4.ADb(3);
        } else {
            r4.ADa(3, l.longValue());
        }
    }
}
