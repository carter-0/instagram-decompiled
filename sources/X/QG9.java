package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public final class QG9 extends C2379439w {
    public final /* synthetic */ AnonymousClass385 A00;
    public final /* synthetic */ String A01;

    public QG9(AnonymousClass385 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ List A00() {
        Cursor A002;
        String str;
        byte[] bArr;
        byte[] bArr2;
        C2377438z A05 = this.A00.A04.A05();
        String str2 = this.A01;
        C238313Bj r6 = (C238313Bj) A05;
        TreeMap treeMap = 1WY.A08;
        1WY A003 = 1Wa.A00("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str2 == null) {
            A003.ADb(1);
        } else {
            A003.ADh(1, str2);
        }
        C251983oI r8 = r6.A02;
        r8.assertNotSuspendingTransaction();
        r8.beginTransaction();
        try {
            A002 = 1wT.A00(r8, A003, true);
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            while (A002.moveToNext()) {
                Pxh.A15(A002, A1E);
                Pxh.A15(A002, A1E2);
            }
            A002.moveToPosition(-1);
            C238313Bj.A01(r6, A1E);
            C238313Bj.A00(r6, A1E2);
            ArrayList A0o = AnonymousClass7TF.A0o(A002);
            while (A002.moveToNext()) {
                if (A002.isNull(0)) {
                    str = null;
                } else {
                    str = A002.getString(0);
                }
                C2379139t A02 = AnonymousClass3D7.A02(A002.getInt(1));
                if (A002.isNull(2)) {
                    bArr = null;
                } else {
                    bArr = A002.getBlob(2);
                }
                C255323tw A004 = C255323tw.A00(bArr);
                int i = A002.getInt(3);
                int i2 = A002.getInt(4);
                long j = A002.getLong(13);
                long j2 = A002.getLong(14);
                long j3 = A002.getLong(15);
                Integer A03 = AnonymousClass3D7.A03(A002.getInt(16));
                long j4 = A002.getLong(17);
                long j5 = A002.getLong(18);
                int i3 = A002.getInt(19);
                long j6 = A002.getLong(20);
                int i4 = A002.getInt(21);
                Integer A04 = AnonymousClass3D7.A04(A002.getInt(5));
                boolean A1P = AnonymousClass7TF.A1P(A002.getInt(6));
                boolean A1P2 = AnonymousClass7TF.A1P(A002.getInt(7));
                boolean A1P3 = AnonymousClass7TF.A1P(A002.getInt(8));
                boolean A1P4 = AnonymousClass7TF.A1P(A002.getInt(9));
                long j7 = A002.getLong(10);
                long j8 = A002.getLong(11);
                if (A002.isNull(12)) {
                    bArr2 = null;
                } else {
                    bArr2 = A002.getBlob(12);
                }
                A0o.add(new C11030S6i(new C255343ty(A04, AnonymousClass3D7.A06(bArr2), j7, j8, A1P, A1P2, A1P3, A1P4), A004, A02, A03, str, Pxh.A0t(A002, A1E), Pxh.A0t(A002, A1E2), i, i3, i2, i4, j, j2, j3, j4, j5, j6));
            }
            r8.setTransactionSuccessful();
            A002.close();
            A003.A00();
            r8.endTransaction();
            return (List) AnonymousClass3DG.A0N.apply(A0o);
        } catch (Throwable th) {
            r8.endTransaction();
            throw th;
        }
    }
}
