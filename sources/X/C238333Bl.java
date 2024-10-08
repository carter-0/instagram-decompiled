package X;

/* renamed from: X.3Bl  reason: invalid class name and case insensitive filesystem */
public final class C238333Bl extends 1Vf {
    public final /* synthetic */ C238313Bj A00;

    public final String createQuery() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C238333Bl(C251983oI r1, C238313Bj r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r12, Object obj) {
        AnonymousClass3DG r13 = (AnonymousClass3DG) obj;
        r12.ADh(1, r13.A0M);
        r12.ADa(2, (long) AnonymousClass3D7.A00(r13.A0E));
        r12.ADh(3, r13.A0I);
        String str = r13.A0H;
        if (str == null) {
            r12.ADb(4);
        } else {
            r12.ADh(4, str);
        }
        byte[] A01 = C255323tw.A01(r13.A0C);
        if (A01 == null) {
            r12.ADb(5);
        } else {
            r12.ADU(5, A01);
        }
        byte[] A012 = C255323tw.A01(r13.A0D);
        if (A012 == null) {
            r12.ADb(6);
        } else {
            r12.ADU(6, A012);
        }
        r12.ADa(7, r13.A05);
        r12.ADa(8, r13.A06);
        r12.ADa(9, r13.A04);
        r12.ADa(10, (long) r13.A02);
        int intValue = r13.A0F.intValue();
        int i = 1;
        if (intValue == 0) {
            i = 0;
        } else if (intValue != 1) {
            throw new RuntimeException();
        }
        r12.ADa(11, (long) i);
        r12.ADa(12, r13.A03);
        r12.ADa(13, r13.A07);
        r12.ADa(14, r13.A08);
        r12.ADa(15, r13.A0A);
        r12.ADa(16, r13.A0J ? 1 : 0);
        int intValue2 = r13.A0G.intValue();
        int i2 = 1;
        if (intValue2 == 0) {
            i2 = 0;
        } else if (intValue2 != 1) {
            throw new RuntimeException();
        }
        r12.ADa(17, (long) i2);
        r12.ADa(18, (long) r13.A01);
        r12.ADa(19, (long) r13.A0K);
        r12.ADa(20, r13.A09);
        r12.ADa(21, (long) r13.A00);
        r12.ADa(22, (long) r13.A0L);
        C255343ty r4 = r13.A0B;
        if (r4 != null) {
            r12.ADa(23, (long) AnonymousClass3D7.A01(r4.A02));
            r12.ADa(24, r4.A05 ? 1 : 0);
            r12.ADa(25, r4.A06 ? 1 : 0);
            r12.ADa(26, r4.A04 ? 1 : 0);
            r12.ADa(27, r4.A07 ? 1 : 0);
            r12.ADa(28, r4.A01);
            r12.ADa(29, r4.A00);
            r12.ADU(30, AnonymousClass3D7.A07(r4.A03));
            return;
        }
        r12.ADb(23);
        r12.ADb(24);
        r12.ADb(25);
        r12.ADb(26);
        r12.ADb(27);
        r12.ADb(28);
        r12.ADb(29);
        r12.ADb(30);
    }
}
