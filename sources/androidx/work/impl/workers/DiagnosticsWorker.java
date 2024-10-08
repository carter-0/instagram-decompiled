package androidx.work.impl.workers;

import X.0qQ;
import X.1WY;
import X.1Wa;
import X.1Wd;
import X.AnonymousClass1WA;
import X.AnonymousClass385;
import X.AnonymousClass389;
import X.AnonymousClass391;
import X.AnonymousClass392;
import X.AnonymousClass393;
import X.AnonymousClass3D7;
import X.AnonymousClass3DG;
import X.AnonymousClass5G1;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C2377438z;
import X.C2379139t;
import X.C238313Bj;
import X.C251983oI;
import X.C255323tw;
import X.C255343ty;
import X.C282935Fi;
import X.DbT;
import X.JTR;
import X.S82;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: finally extract failed */
    public final C282935Fi doWork() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        AnonymousClass385 A00 = AnonymousClass385.A00(this.mAppContext);
        0qQ.A07(A00);
        WorkDatabase workDatabase = A00.A04;
        0qQ.A07(workDatabase);
        C2377438z A05 = workDatabase.A05();
        AnonymousClass393 A03 = workDatabase.A03();
        AnonymousClass391 A06 = workDatabase.A06();
        AnonymousClass392 A02 = workDatabase.A02();
        long currentTimeMillis = System.currentTimeMillis() - JTR.A0N(TimeUnit.DAYS);
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        A002.ADa(1, currentTimeMillis);
        C251983oI r1 = ((C238313Bj) A05).A02;
        r1.assertNotSuspendingTransaction();
        Cursor query = r1.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            int A01 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A012 = 1Wd.A01(query, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            int A013 = 1Wd.A01(query, "worker_class_name");
            int A014 = 1Wd.A01(query, "input_merger_class_name");
            int A015 = 1Wd.A01(query, "input");
            int A016 = 1Wd.A01(query, "output");
            int A017 = 1Wd.A01(query, "initial_delay");
            int A018 = 1Wd.A01(query, "interval_duration");
            int A019 = 1Wd.A01(query, "flex_duration");
            int A0110 = 1Wd.A01(query, "run_attempt_count");
            int A0111 = 1Wd.A01(query, "backoff_policy");
            int A0112 = 1Wd.A01(query, "backoff_delay_duration");
            int A0113 = 1Wd.A01(query, "last_enqueue_time");
            int A0114 = 1Wd.A01(query, "minimum_retention_duration");
            int A0115 = 1Wd.A01(query, "schedule_requested_at");
            int A0116 = 1Wd.A01(query, "run_in_foreground");
            int A0117 = 1Wd.A01(query, "out_of_quota_policy");
            int A0118 = 1Wd.A01(query, "period_count");
            int A0119 = 1Wd.A01(query, "generation");
            int A0120 = 1Wd.A01(query, "next_schedule_time_override");
            int A0121 = 1Wd.A01(query, "next_schedule_time_override_generation");
            int A0122 = 1Wd.A01(query, "stop_reason");
            int A0123 = 1Wd.A01(query, "required_network_type");
            int A0124 = 1Wd.A01(query, "requires_charging");
            int A0125 = 1Wd.A01(query, "requires_device_idle");
            int A0126 = 1Wd.A01(query, "requires_battery_not_low");
            int A0127 = 1Wd.A01(query, "requires_storage_not_low");
            int A0128 = 1Wd.A01(query, "trigger_content_update_delay");
            int A0129 = 1Wd.A01(query, "trigger_max_content_delay");
            int A0130 = 1Wd.A01(query, "content_uri_triggers");
            ArrayList A0o = AnonymousClass7TF.A0o(query);
            while (query.moveToNext()) {
                if (query.isNull(A01)) {
                    str = null;
                } else {
                    str = query.getString(A01);
                }
                C2379139t A022 = AnonymousClass3D7.A02(query.getInt(A012));
                if (query.isNull(A013)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A013);
                }
                if (query.isNull(A014)) {
                    str3 = null;
                } else {
                    str3 = query.getString(A014);
                }
                if (query.isNull(A015)) {
                    bArr = null;
                } else {
                    bArr = query.getBlob(A015);
                }
                C255323tw A003 = C255323tw.A00(bArr);
                if (query.isNull(A016)) {
                    bArr2 = null;
                } else {
                    bArr2 = query.getBlob(A016);
                }
                C255323tw A004 = C255323tw.A00(bArr2);
                long j = query.getLong(A017);
                long j2 = query.getLong(A018);
                long j3 = query.getLong(A019);
                int i = query.getInt(A0110);
                Integer A032 = AnonymousClass3D7.A03(query.getInt(A0111));
                long j4 = query.getLong(A0112);
                long j5 = query.getLong(A0113);
                long j6 = query.getLong(A0114);
                long j7 = query.getLong(A0115);
                boolean A1P = AnonymousClass7TF.A1P(query.getInt(A0116));
                Integer A052 = AnonymousClass3D7.A05(query.getInt(A0117));
                int i2 = query.getInt(A0118);
                int i3 = query.getInt(A0119);
                long j8 = query.getLong(A0120);
                int i4 = query.getInt(A0121);
                int i5 = query.getInt(A0122);
                Integer A04 = AnonymousClass3D7.A04(query.getInt(A0123));
                boolean A1P2 = AnonymousClass7TF.A1P(query.getInt(A0124));
                boolean A1P3 = AnonymousClass7TF.A1P(query.getInt(A0125));
                boolean A1P4 = AnonymousClass7TF.A1P(query.getInt(A0126));
                boolean A1P5 = AnonymousClass7TF.A1P(query.getInt(A0127));
                long j9 = query.getLong(A0128);
                long j10 = query.getLong(A0129);
                if (query.isNull(A0130)) {
                    bArr3 = null;
                } else {
                    bArr3 = query.getBlob(A0130);
                }
                A0o.add(new AnonymousClass3DG(new C255343ty(A04, AnonymousClass3D7.A06(bArr3), j9, j10, A1P2, A1P3, A1P4, A1P5), A003, A004, A022, A032, A052, str, str2, str3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, A1P));
            }
            query.close();
            A002.A00();
            ArrayList Bow = A05.Bow();
            ArrayList Aau = A05.Aau(200);
            if (DbT.A1b(A0o)) {
                AnonymousClass389.A00();
                AnonymousClass389.A00();
                S82.A00(A02, A03, A06, A0o);
            }
            if (DbT.A1b(Bow)) {
                AnonymousClass389.A00();
                AnonymousClass389.A00();
                S82.A00(A02, A03, A06, Bow);
            }
            if (DbT.A1b(Aau)) {
                AnonymousClass389.A00();
                AnonymousClass389.A00();
                S82.A00(A02, A03, A06, Aau);
            }
            return new AnonymousClass5G1();
        } catch (Throwable th) {
            query.close();
            A002.A00();
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass7TG.A1O(context, workerParameters);
    }
}
