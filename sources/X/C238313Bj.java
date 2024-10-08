package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.3Bj  reason: invalid class name and case insensitive filesystem */
public final class C238313Bj implements C2377438z {
    public final 2NZ A00;
    public final 1Vf A01;
    public final C251983oI A02;
    public final 1Vg A03;
    public final 1Vg A04;
    public final 1Vg A05;
    public final 1Vg A06;
    public final 1Vg A07;
    public final 1Vg A08;
    public final 1Vg A09;
    public final 1Vg A0A;
    public final 1Vg A0B;
    public final 1Vg A0C;
    public final 1Vg A0D;
    public final 1Vg A0E;
    public final 1Vg A0F;
    public final 1Vg A0G;
    public final 1Vg A0H;

    public final void AOP(String str) {
        C251983oI r3 = this.A02;
        r3.assertNotSuspendingTransaction();
        1Vg r2 = this.A08;
        AnonymousClass1WV acquire = r2.acquire();
        if (str == null) {
            acquire.ADb(1);
        } else {
            acquire.ADh(1, str);
        }
        r3.beginTransaction();
        try {
            acquire.ATQ();
            r3.setTransactionSuccessful();
        } finally {
            r3.endTransaction();
            r2.release(acquire);
        }
    }

    public final ArrayList Aau(int i) {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        A002.ADa(1, 200);
        C251983oI r1 = this.A02;
        r1.assertNotSuspendingTransaction();
        Cursor query = r1.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(query, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            int A014 = 1Wd.A01(query, "worker_class_name");
            int A015 = 1Wd.A01(query, "input_merger_class_name");
            int A016 = 1Wd.A01(query, "input");
            int A017 = 1Wd.A01(query, "output");
            int A018 = 1Wd.A01(query, "initial_delay");
            int A019 = 1Wd.A01(query, "interval_duration");
            int A0110 = 1Wd.A01(query, "flex_duration");
            int A0111 = 1Wd.A01(query, "run_attempt_count");
            int A0112 = 1Wd.A01(query, "backoff_policy");
            int A0113 = 1Wd.A01(query, "backoff_delay_duration");
            int A0114 = 1Wd.A01(query, "last_enqueue_time");
            int A0115 = 1Wd.A01(query, "minimum_retention_duration");
            int A0116 = 1Wd.A01(query, "schedule_requested_at");
            int A0117 = 1Wd.A01(query, "run_in_foreground");
            int A0118 = 1Wd.A01(query, "out_of_quota_policy");
            int A0119 = 1Wd.A01(query, "period_count");
            int A0120 = 1Wd.A01(query, "generation");
            int A0121 = 1Wd.A01(query, "next_schedule_time_override");
            int A0122 = 1Wd.A01(query, "next_schedule_time_override_generation");
            int A0123 = 1Wd.A01(query, "stop_reason");
            int A0124 = 1Wd.A01(query, "required_network_type");
            int A0125 = 1Wd.A01(query, "requires_charging");
            int A0126 = 1Wd.A01(query, "requires_device_idle");
            int A0127 = 1Wd.A01(query, "requires_battery_not_low");
            int A0128 = 1Wd.A01(query, "requires_storage_not_low");
            int A0129 = 1Wd.A01(query, "trigger_content_update_delay");
            int A0130 = 1Wd.A01(query, "trigger_max_content_delay");
            int A0131 = 1Wd.A01(query, "content_uri_triggers");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(A012)) {
                    str = null;
                } else {
                    str = query.getString(A012);
                }
                C2379139t A022 = AnonymousClass3D7.A02(query.getInt(A013));
                if (query.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A014);
                }
                if (query.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = query.getString(A015);
                }
                if (query.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = query.getBlob(A016);
                }
                C255323tw A003 = C255323tw.A00(bArr);
                if (query.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = query.getBlob(A017);
                }
                C255323tw A004 = C255323tw.A00(bArr2);
                long j = query.getLong(A018);
                long j2 = query.getLong(A019);
                long j3 = query.getLong(A0110);
                int i2 = query.getInt(A0111);
                Integer A032 = AnonymousClass3D7.A03(query.getInt(A0112));
                long j4 = query.getLong(A0113);
                long j5 = query.getLong(A0114);
                long j6 = query.getLong(A0115);
                long j7 = query.getLong(A0116);
                boolean z = false;
                if (query.getInt(A0117) != 0) {
                    z = true;
                }
                Integer A052 = AnonymousClass3D7.A05(query.getInt(A0118));
                int i3 = query.getInt(A0119);
                int i4 = query.getInt(A0120);
                long j8 = query.getLong(A0121);
                int i5 = query.getInt(A0122);
                int i6 = query.getInt(A0123);
                Integer A042 = AnonymousClass3D7.A04(query.getInt(A0124));
                boolean z2 = false;
                if (query.getInt(A0125) != 0) {
                    z2 = true;
                }
                boolean z3 = false;
                if (query.getInt(A0126) != 0) {
                    z3 = true;
                }
                boolean z4 = false;
                if (query.getInt(A0127) != 0) {
                    z4 = true;
                }
                boolean z5 = false;
                if (query.getInt(A0128) != 0) {
                    z5 = true;
                }
                long j9 = query.getLong(A0129);
                long j10 = query.getLong(A0130);
                if (query.isNull(A0131)) {
                    bArr3 = null;
                } else {
                    bArr3 = query.getBlob(A0131);
                }
                arrayList.add(new AnonymousClass3DG(new C255343ty(A042, AnonymousClass3D7.A06(bArr3), j9, j10, z2, z3, z4, z5), A003, A004, A022, A032, A052, str, str2, str3, i2, i3, i4, i5, i6, j, j2, j3, j4, j5, j6, j7, j8, z));
            }
            return arrayList;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public final ArrayList Bow() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT * FROM workspec WHERE state=1", 0);
        C251983oI r2 = this.A02;
        r2.assertNotSuspendingTransaction();
        Cursor query = r2.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(query, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            int A014 = 1Wd.A01(query, "worker_class_name");
            int A015 = 1Wd.A01(query, "input_merger_class_name");
            int A016 = 1Wd.A01(query, "input");
            int A017 = 1Wd.A01(query, "output");
            int A018 = 1Wd.A01(query, "initial_delay");
            int A019 = 1Wd.A01(query, "interval_duration");
            int A0110 = 1Wd.A01(query, "flex_duration");
            int A0111 = 1Wd.A01(query, "run_attempt_count");
            int A0112 = 1Wd.A01(query, "backoff_policy");
            int A0113 = 1Wd.A01(query, "backoff_delay_duration");
            int A0114 = 1Wd.A01(query, "last_enqueue_time");
            int A0115 = 1Wd.A01(query, "minimum_retention_duration");
            int A0116 = 1Wd.A01(query, "schedule_requested_at");
            int A0117 = 1Wd.A01(query, "run_in_foreground");
            int A0118 = 1Wd.A01(query, "out_of_quota_policy");
            int A0119 = 1Wd.A01(query, "period_count");
            int A0120 = 1Wd.A01(query, "generation");
            int A0121 = 1Wd.A01(query, "next_schedule_time_override");
            int A0122 = 1Wd.A01(query, "next_schedule_time_override_generation");
            int A0123 = 1Wd.A01(query, "stop_reason");
            int A0124 = 1Wd.A01(query, "required_network_type");
            int A0125 = 1Wd.A01(query, "requires_charging");
            int A0126 = 1Wd.A01(query, "requires_device_idle");
            int A0127 = 1Wd.A01(query, "requires_battery_not_low");
            int A0128 = 1Wd.A01(query, "requires_storage_not_low");
            int A0129 = 1Wd.A01(query, "trigger_content_update_delay");
            int A0130 = 1Wd.A01(query, "trigger_max_content_delay");
            int A0131 = 1Wd.A01(query, "content_uri_triggers");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(A012)) {
                    str = null;
                } else {
                    str = query.getString(A012);
                }
                C2379139t A022 = AnonymousClass3D7.A02(query.getInt(A013));
                if (query.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A014);
                }
                if (query.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = query.getString(A015);
                }
                if (query.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = query.getBlob(A016);
                }
                C255323tw A003 = C255323tw.A00(bArr);
                if (query.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = query.getBlob(A017);
                }
                C255323tw A004 = C255323tw.A00(bArr2);
                long j = query.getLong(A018);
                long j2 = query.getLong(A019);
                long j3 = query.getLong(A0110);
                int i = query.getInt(A0111);
                Integer A032 = AnonymousClass3D7.A03(query.getInt(A0112));
                long j4 = query.getLong(A0113);
                long j5 = query.getLong(A0114);
                long j6 = query.getLong(A0115);
                long j7 = query.getLong(A0116);
                boolean z = false;
                if (query.getInt(A0117) != 0) {
                    z = true;
                }
                Integer A052 = AnonymousClass3D7.A05(query.getInt(A0118));
                int i2 = query.getInt(A0119);
                int i3 = query.getInt(A0120);
                long j8 = query.getLong(A0121);
                int i4 = query.getInt(A0122);
                int i5 = query.getInt(A0123);
                Integer A042 = AnonymousClass3D7.A04(query.getInt(A0124));
                boolean z2 = false;
                if (query.getInt(A0125) != 0) {
                    z2 = true;
                }
                boolean z3 = false;
                if (query.getInt(A0126) != 0) {
                    z3 = true;
                }
                boolean z4 = false;
                if (query.getInt(A0127) != 0) {
                    z4 = true;
                }
                boolean z5 = false;
                if (query.getInt(A0128) != 0) {
                    z5 = true;
                }
                long j9 = query.getLong(A0129);
                long j10 = query.getLong(A0130);
                if (query.isNull(A0131)) {
                    bArr3 = null;
                } else {
                    bArr3 = query.getBlob(A0131);
                }
                arrayList.add(new AnonymousClass3DG(new C255343ty(A042, AnonymousClass3D7.A06(bArr3), j9, j10, z2, z3, z4, z5), A003, A004, A022, A032, A052, str, str2, str3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z));
            }
            return arrayList;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public final ArrayList Bpe() {
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        C251983oI r2 = this.A02;
        r2.assertNotSuspendingTransaction();
        Cursor query = r2.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(query, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            int A014 = 1Wd.A01(query, "worker_class_name");
            int A015 = 1Wd.A01(query, "input_merger_class_name");
            int A016 = 1Wd.A01(query, "input");
            int A017 = 1Wd.A01(query, "output");
            int A018 = 1Wd.A01(query, "initial_delay");
            int A019 = 1Wd.A01(query, "interval_duration");
            int A0110 = 1Wd.A01(query, "flex_duration");
            int A0111 = 1Wd.A01(query, "run_attempt_count");
            int A0112 = 1Wd.A01(query, "backoff_policy");
            int A0113 = 1Wd.A01(query, "backoff_delay_duration");
            int A0114 = 1Wd.A01(query, "last_enqueue_time");
            int A0115 = 1Wd.A01(query, "minimum_retention_duration");
            int A0116 = 1Wd.A01(query, "schedule_requested_at");
            int A0117 = 1Wd.A01(query, "run_in_foreground");
            int A0118 = 1Wd.A01(query, "out_of_quota_policy");
            int A0119 = 1Wd.A01(query, "period_count");
            int A0120 = 1Wd.A01(query, "generation");
            int A0121 = 1Wd.A01(query, "next_schedule_time_override");
            int A0122 = 1Wd.A01(query, "next_schedule_time_override_generation");
            int A0123 = 1Wd.A01(query, "stop_reason");
            int A0124 = 1Wd.A01(query, "required_network_type");
            int A0125 = 1Wd.A01(query, "requires_charging");
            int A0126 = 1Wd.A01(query, "requires_device_idle");
            int A0127 = 1Wd.A01(query, "requires_battery_not_low");
            int A0128 = 1Wd.A01(query, "requires_storage_not_low");
            int A0129 = 1Wd.A01(query, "trigger_content_update_delay");
            int A0130 = 1Wd.A01(query, "trigger_max_content_delay");
            int A0131 = 1Wd.A01(query, "content_uri_triggers");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(A012)) {
                    str = null;
                } else {
                    str = query.getString(A012);
                }
                C2379139t A022 = AnonymousClass3D7.A02(query.getInt(A013));
                if (query.isNull(A014)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A014);
                }
                if (query.isNull(A015)) {
                    str3 = null;
                } else {
                    str3 = query.getString(A015);
                }
                if (query.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = query.getBlob(A016);
                }
                C255323tw A003 = C255323tw.A00(bArr);
                if (query.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = query.getBlob(A017);
                }
                C255323tw A004 = C255323tw.A00(bArr2);
                long j = query.getLong(A018);
                long j2 = query.getLong(A019);
                long j3 = query.getLong(A0110);
                int i = query.getInt(A0111);
                Integer A032 = AnonymousClass3D7.A03(query.getInt(A0112));
                long j4 = query.getLong(A0113);
                long j5 = query.getLong(A0114);
                long j6 = query.getLong(A0115);
                long j7 = query.getLong(A0116);
                boolean z = false;
                if (query.getInt(A0117) != 0) {
                    z = true;
                }
                Integer A052 = AnonymousClass3D7.A05(query.getInt(A0118));
                int i2 = query.getInt(A0119);
                int i3 = query.getInt(A0120);
                long j8 = query.getLong(A0121);
                int i4 = query.getInt(A0122);
                int i5 = query.getInt(A0123);
                Integer A042 = AnonymousClass3D7.A04(query.getInt(A0124));
                boolean z2 = false;
                if (query.getInt(A0125) != 0) {
                    z2 = true;
                }
                boolean z3 = false;
                if (query.getInt(A0126) != 0) {
                    z3 = true;
                }
                boolean z4 = false;
                if (query.getInt(A0127) != 0) {
                    z4 = true;
                }
                boolean z5 = false;
                if (query.getInt(A0128) != 0) {
                    z5 = true;
                }
                long j9 = query.getLong(A0129);
                long j10 = query.getLong(A0130);
                if (query.isNull(A0131)) {
                    bArr3 = null;
                } else {
                    bArr3 = query.getBlob(A0131);
                }
                arrayList.add(new AnonymousClass3DG(new C255343ty(A042, AnonymousClass3D7.A06(bArr3), j9, j10, z2, z3, z4, z5), A003, A004, A022, A032, A052, str, str2, str3, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z));
            }
            return arrayList;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public final C2379139t Bz2(String str) {
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            A002.ADb(1);
        } else {
            A002.ADh(1, str);
        }
        C251983oI r1 = this.A02;
        r1.assertNotSuspendingTransaction();
        C2379139t r0 = null;
        Cursor query = r1.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            if (query.moveToFirst() && !query.isNull(0)) {
                int i = query.getInt(0);
                if (Integer.valueOf(i) != null) {
                    r0 = AnonymousClass3D7.A02(i);
                }
            }
            return r0;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public final AnonymousClass3DG CGi(String str) {
        AnonymousClass3DG r31;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT * FROM workspec WHERE id=?", 1);
        String str5 = str;
        if (str == null) {
            A002.ADb(1);
        } else {
            A002.ADh(1, str5);
        }
        C251983oI r1 = this.A02;
        r1.assertNotSuspendingTransaction();
        Cursor query = r1.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(query, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            int A014 = 1Wd.A01(query, "worker_class_name");
            int A015 = 1Wd.A01(query, "input_merger_class_name");
            int A016 = 1Wd.A01(query, "input");
            int A017 = 1Wd.A01(query, "output");
            int A018 = 1Wd.A01(query, "initial_delay");
            int A019 = 1Wd.A01(query, "interval_duration");
            int A0110 = 1Wd.A01(query, "flex_duration");
            int A0111 = 1Wd.A01(query, "run_attempt_count");
            int A0112 = 1Wd.A01(query, "backoff_policy");
            int A0113 = 1Wd.A01(query, "backoff_delay_duration");
            int A0114 = 1Wd.A01(query, "last_enqueue_time");
            int A0115 = 1Wd.A01(query, "minimum_retention_duration");
            int A0116 = 1Wd.A01(query, "schedule_requested_at");
            int A0117 = 1Wd.A01(query, "run_in_foreground");
            int A0118 = 1Wd.A01(query, "out_of_quota_policy");
            int A0119 = 1Wd.A01(query, "period_count");
            int A0120 = 1Wd.A01(query, "generation");
            int A0121 = 1Wd.A01(query, "next_schedule_time_override");
            int A0122 = 1Wd.A01(query, "next_schedule_time_override_generation");
            int A0123 = 1Wd.A01(query, "stop_reason");
            int A0124 = 1Wd.A01(query, "required_network_type");
            int A0125 = 1Wd.A01(query, "requires_charging");
            int A0126 = 1Wd.A01(query, "requires_device_idle");
            int A0127 = 1Wd.A01(query, "requires_battery_not_low");
            int A0128 = 1Wd.A01(query, "requires_storage_not_low");
            int A0129 = 1Wd.A01(query, "trigger_content_update_delay");
            int A0130 = 1Wd.A01(query, "trigger_max_content_delay");
            int A0131 = 1Wd.A01(query, "content_uri_triggers");
            if (query.moveToFirst()) {
                if (query.isNull(A012)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A012);
                }
                C2379139t A022 = AnonymousClass3D7.A02(query.getInt(A013));
                if (query.isNull(A014)) {
                    str3 = null;
                } else {
                    str3 = query.getString(A014);
                }
                if (query.isNull(A015)) {
                    str4 = null;
                } else {
                    str4 = query.getString(A015);
                }
                if (query.isNull(A016)) {
                    bArr = null;
                } else {
                    bArr = query.getBlob(A016);
                }
                C255323tw A003 = C255323tw.A00(bArr);
                if (query.isNull(A017)) {
                    bArr2 = null;
                } else {
                    bArr2 = query.getBlob(A017);
                }
                C255323tw A004 = C255323tw.A00(bArr2);
                long j = query.getLong(A018);
                long j2 = query.getLong(A019);
                long j3 = query.getLong(A0110);
                int i = query.getInt(A0111);
                Integer A032 = AnonymousClass3D7.A03(query.getInt(A0112));
                long j4 = query.getLong(A0113);
                long j5 = query.getLong(A0114);
                long j6 = query.getLong(A0115);
                long j7 = query.getLong(A0116);
                boolean z = false;
                if (query.getInt(A0117) != 0) {
                    z = true;
                }
                Integer A052 = AnonymousClass3D7.A05(query.getInt(A0118));
                int i2 = query.getInt(A0119);
                int i3 = query.getInt(A0120);
                long j8 = query.getLong(A0121);
                int i4 = query.getInt(A0122);
                int i5 = query.getInt(A0123);
                Integer A042 = AnonymousClass3D7.A04(query.getInt(A0124));
                int i6 = query.getInt(A0125);
                boolean z2 = false;
                if (i6 != 0) {
                    z2 = true;
                }
                boolean z3 = false;
                if (query.getInt(A0126) != 0) {
                    z3 = true;
                }
                boolean z4 = false;
                if (query.getInt(A0127) != 0) {
                    z4 = true;
                }
                boolean z5 = false;
                if (query.getInt(A0128) != 0) {
                    z5 = true;
                }
                long j9 = query.getLong(A0129);
                long j10 = query.getLong(A0130);
                if (query.isNull(A0131)) {
                    bArr3 = null;
                } else {
                    bArr3 = query.getBlob(A0131);
                }
                r31 = new AnonymousClass3DG(new C255343ty(A042, AnonymousClass3D7.A06(bArr3), j9, j10, z2, z3, z4, z5), A003, A004, A022, A032, A052, str2, str3, str4, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z);
            } else {
                r31 = null;
            }
            return r31;
        } finally {
            query.close();
            A002.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.9FR, java.lang.Object] */
    public final ArrayList CGj(String str) {
        String str2;
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            A002.ADb(1);
        } else {
            A002.ADh(1, str);
        }
        C251983oI r0 = this.A02;
        r0.assertNotSuspendingTransaction();
        Cursor query = r0.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = query.getString(0);
                }
                C2379139t A022 = AnonymousClass3D7.A02(query.getInt(1));
                0qQ.A0B(str2, 1);
                0qQ.A0B(A022, 2);
                ? obj = new Object();
                obj.A01 = str2;
                obj.A00 = A022;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public final int CmC(long j, String str) {
        C251983oI r3 = this.A02;
        r3.assertNotSuspendingTransaction();
        1Vg r2 = this.A0A;
        AnonymousClass1WV acquire = r2.acquire();
        acquire.ADa(1, j);
        if (str == null) {
            acquire.ADb(2);
        } else {
            acquire.ADh(2, str);
        }
        r3.beginTransaction();
        try {
            int ATQ = acquire.ATQ();
            r3.setTransactionSuccessful();
            return ATQ;
        } finally {
            r3.endTransaction();
            r2.release(acquire);
        }
    }

    public final void EIO(String str, int i) {
        C251983oI r5 = this.A02;
        r5.assertNotSuspendingTransaction();
        1Vg r4 = this.A0C;
        AnonymousClass1WV acquire = r4.acquire();
        acquire.ADh(1, str);
        acquire.ADa(2, (long) i);
        r5.beginTransaction();
        try {
            acquire.ATQ();
            r5.setTransactionSuccessful();
        } finally {
            r5.endTransaction();
            r4.release(acquire);
        }
    }

    public final void Eak(String str, long j) {
        C251983oI r3 = this.A02;
        r3.assertNotSuspendingTransaction();
        1Vg r2 = this.A0D;
        AnonymousClass1WV acquire = r2.acquire();
        acquire.ADa(1, j);
        if (str == null) {
            acquire.ADb(2);
        } else {
            acquire.ADh(2, str);
        }
        r3.beginTransaction();
        try {
            acquire.ATQ();
            r3.setTransactionSuccessful();
        } finally {
            r3.endTransaction();
            r2.release(acquire);
        }
    }

    public final void Ef5(C255323tw r6, String str) {
        C251983oI r4 = this.A02;
        r4.assertNotSuspendingTransaction();
        1Vg r3 = this.A0F;
        AnonymousClass1WV acquire = r3.acquire();
        byte[] A012 = C255323tw.A01(r6);
        if (A012 == null) {
            acquire.ADb(1);
        } else {
            acquire.ADU(1, A012);
        }
        acquire.ADh(2, str);
        r4.beginTransaction();
        try {
            acquire.ATQ();
            r4.setTransactionSuccessful();
        } finally {
            r4.endTransaction();
            r3.release(acquire);
        }
    }

    public final int Elp(C2379139t r7, String str) {
        C251983oI r5 = this.A02;
        r5.assertNotSuspendingTransaction();
        1Vg r4 = this.A0G;
        AnonymousClass1WV acquire = r4.acquire();
        acquire.ADa(1, (long) AnonymousClass3D7.A00(r7));
        if (str == null) {
            acquire.ADb(2);
        } else {
            acquire.ADh(2, str);
        }
        r5.beginTransaction();
        try {
            int ATQ = acquire.ATQ();
            r5.setTransactionSuccessful();
            return ATQ;
        } finally {
            r5.endTransaction();
            r4.release(acquire);
        }
    }

    public final void Ely(String str, int i) {
        C251983oI r5 = this.A02;
        r5.assertNotSuspendingTransaction();
        1Vg r4 = this.A0H;
        AnonymousClass1WV acquire = r4.acquire();
        acquire.ADa(1, (long) i);
        acquire.ADh(2, str);
        r5.beginTransaction();
        try {
            acquire.ATQ();
            r5.setTransactionSuccessful();
        } finally {
            r5.endTransaction();
            r4.release(acquire);
        }
    }

    public C238313Bj(C251983oI r2) {
        this.A02 = r2;
        this.A01 = new C238333Bl(r2, this);
        this.A00 = new C238363Bo(r2, this);
        this.A08 = new C238373Bp(r2, this);
        this.A0G = new C238383Bq(r2, this);
        this.A07 = new C238393Br(r2, this);
        this.A03 = new C238403Bs(r2, this);
        this.A0F = new C238413Bt(r2, this);
        this.A0D = new C238423Bu(r2, this);
        this.A04 = new C238433Bv(r2, this);
        this.A06 = new C238443Bw(r2, this);
        this.A0E = new C238453Bx(r2, this);
        this.A0C = new C238463By(r2, this);
        this.A0A = new C238473Bz(r2, this);
        this.A05 = new AnonymousClass3C0(r2, this);
        this.A0B = new AnonymousClass3C1(r2, this);
        this.A09 = new AnonymousClass3C2(r2, this);
        this.A0H = new AnonymousClass3C4(r2, this);
    }

    public static void A00(C238313Bj r8, HashMap hashMap) {
        byte[] bArr;
        int i;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0:
            while (true) {
                i = 0;
                for (Object next : keySet) {
                    hashMap2.put(next, hashMap.get(next));
                    i++;
                    if (i == 999) {
                        A00(r8, hashMap2);
                        hashMap2 = new HashMap(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                A00(r8, hashMap2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        1wO.A00(sb, size);
        sb.append(")");
        String obj = sb.toString();
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00(obj, size);
        int i2 = 1;
        for (String str : keySet) {
            if (str == null) {
                A002.ADb(i2);
            } else {
                A002.ADh(i2, str);
            }
            i2++;
        }
        Cursor A003 = 1wT.A00(r8.A02, A002, false);
        try {
            int A004 = 1Wd.A00(A003, "work_spec_id");
            if (A004 != -1) {
                while (A003.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(A003.getString(A004));
                    if (arrayList != null) {
                        if (A003.isNull(0)) {
                            bArr = null;
                        } else {
                            bArr = A003.getBlob(0);
                        }
                        arrayList.add(C255323tw.A00(bArr));
                    }
                }
            }
        } finally {
            A003.close();
        }
    }

    public static void A01(C238313Bj r8, HashMap hashMap) {
        String str;
        int i;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0:
            while (true) {
                i = 0;
                for (Object next : keySet) {
                    hashMap2.put(next, hashMap.get(next));
                    i++;
                    if (i == 999) {
                        A01(r8, hashMap2);
                        hashMap2 = new HashMap(999);
                    }
                }
                break loop0;
            }
            if (i > 0) {
                A01(r8, hashMap2);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        1wO.A00(sb, size);
        sb.append(")");
        String obj = sb.toString();
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00(obj, size);
        int i2 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                A002.ADb(i2);
            } else {
                A002.ADh(i2, str2);
            }
            i2++;
        }
        Cursor A003 = 1wT.A00(r8.A02, A002, false);
        try {
            int A004 = 1Wd.A00(A003, "work_spec_id");
            if (A004 != -1) {
                while (A003.moveToNext()) {
                    ArrayList arrayList = (ArrayList) hashMap.get(A003.getString(A004));
                    if (arrayList != null) {
                        if (A003.isNull(0)) {
                            str = null;
                        } else {
                            str = A003.getString(0);
                        }
                        arrayList.add(str);
                    }
                }
            }
        } finally {
            A003.close();
        }
    }
}
