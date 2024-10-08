package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.3tv  reason: invalid class name and case insensitive filesystem */
public abstract class C255313tv {
    static {
        AnonymousClass389.A01("Schedulers");
    }

    public static void A00(WorkDatabase workDatabase, List list) {
        1WY A00;
        Cursor query;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        String str4;
        String str5;
        String str6;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        if (list != null && list.size() != 0) {
            C2377438z A05 = workDatabase.A05();
            workDatabase.beginTransaction();
            try {
                TreeMap treeMap = 1WY.A08;
                1WY A002 = 1Wa.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
                C251983oI r10 = ((C238313Bj) A05).A02;
                r10.assertNotSuspendingTransaction();
                Cursor query2 = r10.query((AnonymousClass1WA) A002, (CancellationSignal) null);
                try {
                    int A01 = 1Wd.A01(query2, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A012 = 1Wd.A01(query2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    int A013 = 1Wd.A01(query2, "worker_class_name");
                    int A014 = 1Wd.A01(query2, "input_merger_class_name");
                    int A015 = 1Wd.A01(query2, "input");
                    int A016 = 1Wd.A01(query2, "output");
                    int A017 = 1Wd.A01(query2, "initial_delay");
                    int A018 = 1Wd.A01(query2, "interval_duration");
                    int A019 = 1Wd.A01(query2, "flex_duration");
                    int A0110 = 1Wd.A01(query2, "run_attempt_count");
                    int A0111 = 1Wd.A01(query2, "backoff_policy");
                    int A0112 = 1Wd.A01(query2, "backoff_delay_duration");
                    int A0113 = 1Wd.A01(query2, "last_enqueue_time");
                    int A0114 = 1Wd.A01(query2, "minimum_retention_duration");
                    int A0115 = 1Wd.A01(query2, "schedule_requested_at");
                    int A0116 = 1Wd.A01(query2, "run_in_foreground");
                    int A0117 = 1Wd.A01(query2, "out_of_quota_policy");
                    int A0118 = 1Wd.A01(query2, "period_count");
                    int A0119 = 1Wd.A01(query2, "generation");
                    int A0120 = 1Wd.A01(query2, "next_schedule_time_override");
                    int A0121 = 1Wd.A01(query2, "next_schedule_time_override_generation");
                    int A0122 = 1Wd.A01(query2, "stop_reason");
                    int A0123 = 1Wd.A01(query2, "required_network_type");
                    int A0124 = 1Wd.A01(query2, "requires_charging");
                    int A0125 = 1Wd.A01(query2, "requires_device_idle");
                    int A0126 = 1Wd.A01(query2, "requires_battery_not_low");
                    int A0127 = 1Wd.A01(query2, "requires_storage_not_low");
                    int A0128 = 1Wd.A01(query2, "trigger_content_update_delay");
                    int A0129 = 1Wd.A01(query2, "trigger_max_content_delay");
                    int A0130 = 1Wd.A01(query2, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList(query2.getCount());
                    while (query2.moveToNext()) {
                        if (query2.isNull(A01)) {
                            str4 = null;
                        } else {
                            str4 = query2.getString(A01);
                        }
                        C2379139t A02 = AnonymousClass3D7.A02(query2.getInt(A012));
                        if (query2.isNull(A013)) {
                            str5 = null;
                        } else {
                            str5 = query2.getString(A013);
                        }
                        if (query2.isNull(A014)) {
                            str6 = null;
                        } else {
                            str6 = query2.getString(A014);
                        }
                        if (query2.isNull(A015)) {
                            bArr4 = null;
                        } else {
                            bArr4 = query2.getBlob(A015);
                        }
                        C255323tw A003 = C255323tw.A00(bArr4);
                        if (query2.isNull(A016)) {
                            bArr5 = null;
                        } else {
                            bArr5 = query2.getBlob(A016);
                        }
                        C255323tw A004 = C255323tw.A00(bArr5);
                        long j = query2.getLong(A017);
                        long j2 = query2.getLong(A018);
                        long j3 = query2.getLong(A019);
                        int i = query2.getInt(A0110);
                        Integer A03 = AnonymousClass3D7.A03(query2.getInt(A0111));
                        long j4 = query2.getLong(A0112);
                        long j5 = query2.getLong(A0113);
                        long j6 = query2.getLong(A0114);
                        long j7 = query2.getLong(A0115);
                        boolean z = false;
                        if (query2.getInt(A0116) != 0) {
                            z = true;
                        }
                        Integer A052 = AnonymousClass3D7.A05(query2.getInt(A0117));
                        int i2 = query2.getInt(A0118);
                        int i3 = query2.getInt(A0119);
                        long j8 = query2.getLong(A0120);
                        int i4 = query2.getInt(A0121);
                        int i5 = query2.getInt(A0122);
                        Integer A04 = AnonymousClass3D7.A04(query2.getInt(A0123));
                        boolean z2 = false;
                        if (query2.getInt(A0124) != 0) {
                            z2 = true;
                        }
                        boolean z3 = false;
                        if (query2.getInt(A0125) != 0) {
                            z3 = true;
                        }
                        boolean z4 = false;
                        if (query2.getInt(A0126) != 0) {
                            z4 = true;
                        }
                        boolean z5 = false;
                        if (query2.getInt(A0127) != 0) {
                            z5 = true;
                        }
                        long j9 = query2.getLong(A0128);
                        long j10 = query2.getLong(A0129);
                        if (query2.isNull(A0130)) {
                            bArr6 = null;
                        } else {
                            bArr6 = query2.getBlob(A0130);
                        }
                        arrayList.add(new AnonymousClass3DG(new C255343ty(A04, AnonymousClass3D7.A06(bArr6), j9, j10, z2, z3, z4, z5), A003, A004, A02, A03, A052, str4, str5, str6, i, i2, i3, i4, i5, j, j2, j3, j4, j5, j6, j7, j8, z));
                    }
                    query2.close();
                    A002.A00();
                    A01(A05, arrayList);
                    A00 = 1Wa.A00("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
                    A00.ADa(1, 20);
                    r10.assertNotSuspendingTransaction();
                    query = r10.query((AnonymousClass1WA) A00, (CancellationSignal) null);
                    int A0131 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A0132 = 1Wd.A01(query, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    int A0133 = 1Wd.A01(query, "worker_class_name");
                    int A0134 = 1Wd.A01(query, "input_merger_class_name");
                    int A0135 = 1Wd.A01(query, "input");
                    int A0136 = 1Wd.A01(query, "output");
                    int A0137 = 1Wd.A01(query, "initial_delay");
                    int A0138 = 1Wd.A01(query, "interval_duration");
                    int A0139 = 1Wd.A01(query, "flex_duration");
                    int A0140 = 1Wd.A01(query, "run_attempt_count");
                    int A0141 = 1Wd.A01(query, "backoff_policy");
                    int A0142 = 1Wd.A01(query, "backoff_delay_duration");
                    int A0143 = 1Wd.A01(query, "last_enqueue_time");
                    int A0144 = 1Wd.A01(query, "minimum_retention_duration");
                    int A0145 = 1Wd.A01(query, "schedule_requested_at");
                    int A0146 = 1Wd.A01(query, "run_in_foreground");
                    int A0147 = 1Wd.A01(query, "out_of_quota_policy");
                    int A0148 = 1Wd.A01(query, "period_count");
                    int A0149 = 1Wd.A01(query, "generation");
                    int A0150 = 1Wd.A01(query, "next_schedule_time_override");
                    int A0151 = 1Wd.A01(query, "next_schedule_time_override_generation");
                    int A0152 = 1Wd.A01(query, "stop_reason");
                    int A0153 = 1Wd.A01(query, "required_network_type");
                    int A0154 = 1Wd.A01(query, "requires_charging");
                    int A0155 = 1Wd.A01(query, "requires_device_idle");
                    int A0156 = 1Wd.A01(query, "requires_battery_not_low");
                    int A0157 = 1Wd.A01(query, "requires_storage_not_low");
                    int A0158 = 1Wd.A01(query, "trigger_content_update_delay");
                    int A0159 = 1Wd.A01(query, "trigger_max_content_delay");
                    int A0160 = 1Wd.A01(query, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        if (query.isNull(A0131)) {
                            str = null;
                        } else {
                            str = query.getString(A0131);
                        }
                        C2379139t A022 = AnonymousClass3D7.A02(query.getInt(A0132));
                        if (query.isNull(A0133)) {
                            str2 = null;
                        } else {
                            str2 = query.getString(A0133);
                        }
                        if (query.isNull(A0134)) {
                            str3 = null;
                        } else {
                            str3 = query.getString(A0134);
                        }
                        if (query.isNull(A0135)) {
                            bArr = null;
                        } else {
                            bArr = query.getBlob(A0135);
                        }
                        C255323tw A005 = C255323tw.A00(bArr);
                        if (query.isNull(A0136)) {
                            bArr2 = null;
                        } else {
                            bArr2 = query.getBlob(A0136);
                        }
                        C255323tw A006 = C255323tw.A00(bArr2);
                        long j11 = query.getLong(A0137);
                        long j12 = query.getLong(A0138);
                        long j13 = query.getLong(A0139);
                        int i6 = query.getInt(A0140);
                        Integer A032 = AnonymousClass3D7.A03(query.getInt(A0141));
                        long j14 = query.getLong(A0142);
                        long j15 = query.getLong(A0143);
                        long j16 = query.getLong(A0144);
                        long j17 = query.getLong(A0145);
                        boolean z6 = false;
                        if (query.getInt(A0146) != 0) {
                            z6 = true;
                        }
                        Integer A053 = AnonymousClass3D7.A05(query.getInt(A0147));
                        int i7 = query.getInt(A0148);
                        int i8 = query.getInt(A0149);
                        long j18 = query.getLong(A0150);
                        int i9 = query.getInt(A0151);
                        int i10 = query.getInt(A0152);
                        Integer A042 = AnonymousClass3D7.A04(query.getInt(A0153));
                        boolean z7 = false;
                        if (query.getInt(A0154) != 0) {
                            z7 = true;
                        }
                        boolean z8 = false;
                        if (query.getInt(A0155) != 0) {
                            z8 = true;
                        }
                        boolean z9 = false;
                        if (query.getInt(A0156) != 0) {
                            z9 = true;
                        }
                        boolean z10 = false;
                        if (query.getInt(A0157) != 0) {
                            z10 = true;
                        }
                        long j19 = query.getLong(A0158);
                        long j20 = query.getLong(A0159);
                        if (query.isNull(A0160)) {
                            bArr3 = null;
                        } else {
                            bArr3 = query.getBlob(A0160);
                        }
                        arrayList2.add(new AnonymousClass3DG(new C255343ty(A042, AnonymousClass3D7.A06(bArr3), j19, j20, z7, z8, z9, z10), A005, A006, A022, A032, A053, str, str2, str3, i6, i7, i8, i9, i10, j11, j12, j13, j14, j15, j16, j17, j18, z6));
                    }
                    query.close();
                    A00.A00();
                    A01(A05, arrayList2);
                    arrayList2.addAll(arrayList);
                    ArrayList Aau = A05.Aau(200);
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (arrayList2.size() > 0) {
                        AnonymousClass3DG[] r3 = (AnonymousClass3DG[]) arrayList2.toArray(new AnonymousClass3DG[arrayList2.size()]);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AnonymousClass39P r1 = (AnonymousClass39P) it.next();
                            if (r1.CK1()) {
                                r1.EKN(r3);
                            }
                        }
                    }
                    if (Aau.size() > 0) {
                        AnonymousClass3DG[] r32 = (AnonymousClass3DG[]) Aau.toArray(new AnonymousClass3DG[Aau.size()]);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass39P r12 = (AnonymousClass39P) it2.next();
                            if (!r12.CK1()) {
                                r12.EKN(r32);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    query2.close();
                    A002.A00();
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    public static void A01(C2377438z r4, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r4.CmC(currentTimeMillis, ((AnonymousClass3DG) it.next()).A0M);
            }
        }
    }
}
