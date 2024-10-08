package X;

/* renamed from: X.3Bo  reason: invalid class name and case insensitive filesystem */
public final class C238363Bo extends 2NZ {
    public final /* synthetic */ C238313Bj A00;

    public final String createQuery() {
        return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C238363Bo(C251983oI r1, C238313Bj r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void A01(AnonymousClass1WV r13, Object obj) {
        AnonymousClass3DG r14 = (AnonymousClass3DG) obj;
        String str = r14.A0M;
        r13.ADh(1, str);
        r13.ADa(2, (long) AnonymousClass3D7.A00(r14.A0E));
        r13.ADh(3, r14.A0I);
        String str2 = r14.A0H;
        if (str2 == null) {
            r13.ADb(4);
        } else {
            r13.ADh(4, str2);
        }
        byte[] A01 = C255323tw.A01(r14.A0C);
        if (A01 == null) {
            r13.ADb(5);
        } else {
            r13.ADU(5, A01);
        }
        byte[] A012 = C255323tw.A01(r14.A0D);
        if (A012 == null) {
            r13.ADb(6);
        } else {
            r13.ADU(6, A012);
        }
        r13.ADa(7, r14.A05);
        r13.ADa(8, r14.A06);
        r13.ADa(9, r14.A04);
        r13.ADa(10, (long) r14.A02);
        int intValue = r14.A0F.intValue();
        int i = 1;
        if (intValue == 0) {
            i = 0;
        } else if (intValue != 1) {
            throw new RuntimeException();
        }
        r13.ADa(11, (long) i);
        r13.ADa(12, r14.A03);
        r13.ADa(13, r14.A07);
        r13.ADa(14, r14.A08);
        r13.ADa(15, r14.A0A);
        r13.ADa(16, r14.A0J ? 1 : 0);
        int intValue2 = r14.A0G.intValue();
        int i2 = 1;
        if (intValue2 == 0) {
            i2 = 0;
        } else if (intValue2 != 1) {
            throw new RuntimeException();
        }
        r13.ADa(17, (long) i2);
        r13.ADa(18, (long) r14.A01);
        r13.ADa(19, (long) r14.A0K);
        r13.ADa(20, r14.A09);
        r13.ADa(21, (long) r14.A00);
        r13.ADa(22, (long) r14.A0L);
        C255343ty r4 = r14.A0B;
        if (r4 != null) {
            r13.ADa(23, (long) AnonymousClass3D7.A01(r4.A02));
            r13.ADa(24, r4.A05 ? 1 : 0);
            r13.ADa(25, r4.A06 ? 1 : 0);
            r13.ADa(26, r4.A04 ? 1 : 0);
            r13.ADa(27, r4.A07 ? 1 : 0);
            r13.ADa(28, r4.A01);
            r13.ADa(29, r4.A00);
            r13.ADU(30, AnonymousClass3D7.A07(r4.A03));
        } else {
            r13.ADb(23);
            r13.ADb(24);
            r13.ADb(25);
            r13.ADb(26);
            r13.ADb(27);
            r13.ADb(28);
            r13.ADb(29);
            r13.ADb(30);
        }
        r13.ADh(31, str);
    }
}
