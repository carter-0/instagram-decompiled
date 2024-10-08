package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase_Impl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.39v  reason: invalid class name and case insensitive filesystem */
public final class C2379339v extends C2379439w {
    public final /* synthetic */ C2379239u A00;
    public final /* synthetic */ AnonymousClass385 A01;

    public C2379339v(C2379239u r1, AnonymousClass385 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ List A00() {
        AnonymousClass396 r3;
        String str;
        String str2;
        C2379139t A02;
        byte[] bArr;
        C255323tw A002;
        long j;
        long j2;
        long j3;
        int i;
        Integer A03;
        long j4;
        long j5;
        int i2;
        int i3;
        long j6;
        int i4;
        Integer A04;
        boolean z;
        boolean z2;
        boolean z3;
        long j7;
        LinkedHashSet linkedHashSet;
        byte[] bArr2;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.A01.A04;
        if (workDatabase_Impl.A01 != null) {
            r3 = workDatabase_Impl.A01;
        } else {
            synchronized (workDatabase_Impl) {
                if (workDatabase_Impl.A01 == null) {
                    workDatabase_Impl.A01 = new AnonymousClass3D2(workDatabase_Impl);
                }
                r3 = workDatabase_Impl.A01;
            }
        }
        C2379239u r8 = this.A00;
        0qQ.A0B(r8, 0);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<C2379139t> list = r8.A01;
        String str3 = " AND";
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(list, 10));
            for (C2379139t r0 : list) {
                0qQ.A0A(r0);
                arrayList2.add(Integer.valueOf(AnonymousClass3D7.A00(r0)));
            }
            sb.append(" WHERE state IN (");
            AnonymousClass3D8.A00(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str = str3;
        } else {
            str = " WHERE";
        }
        List<Object> list2 = r8.A00;
        if (!list2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(0Yv.A1E(list2, 10));
            for (Object obj : list2) {
                arrayList3.add(obj.toString());
            }
            sb.append(002.A0R(str, " id IN ("));
            AnonymousClass3D8.A00(sb, list2.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str = str3;
        }
        List list3 = r8.A02;
        if (!list3.isEmpty()) {
            sb.append(002.A0R(str, " id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            AnonymousClass3D8.A00(sb, list3.size());
            sb.append("))");
            arrayList.addAll(list3);
        } else {
            str3 = str;
        }
        List list4 = r8.A03;
        if (!list4.isEmpty()) {
            sb.append(002.A0R(str3, " id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            AnonymousClass3D8.A00(sb, list4.size());
            sb.append("))");
            arrayList.addAll(list4);
        }
        sb.append(";");
        String obj2 = sb.toString();
        0qQ.A07(obj2);
        1W8 r2 = new 1W8(obj2, arrayList.toArray(new Object[0]));
        AnonymousClass3D2 r32 = (AnonymousClass3D2) r3;
        C251983oI r1 = r32.A00;
        r1.assertNotSuspendingTransaction();
        Cursor A003 = 1wT.A00(r1, r2, true);
        try {
            int A004 = 1Wd.A00(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A005 = 1Wd.A00(A003, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            int A006 = 1Wd.A00(A003, "output");
            int A007 = 1Wd.A00(A003, "initial_delay");
            int A008 = 1Wd.A00(A003, "interval_duration");
            int A009 = 1Wd.A00(A003, "flex_duration");
            int A0010 = 1Wd.A00(A003, "run_attempt_count");
            int A0011 = 1Wd.A00(A003, "backoff_policy");
            int A0012 = 1Wd.A00(A003, "backoff_delay_duration");
            int A0013 = 1Wd.A00(A003, "last_enqueue_time");
            int A0014 = 1Wd.A00(A003, "period_count");
            int A0015 = 1Wd.A00(A003, "generation");
            int A0016 = 1Wd.A00(A003, "next_schedule_time_override");
            int A0017 = 1Wd.A00(A003, "stop_reason");
            int A0018 = 1Wd.A00(A003, "required_network_type");
            int A0019 = 1Wd.A00(A003, "requires_charging");
            int A0020 = 1Wd.A00(A003, "requires_device_idle");
            int A0021 = 1Wd.A00(A003, "requires_battery_not_low");
            int A0022 = 1Wd.A00(A003, "requires_storage_not_low");
            int A0023 = 1Wd.A00(A003, "trigger_content_update_delay");
            int A0024 = 1Wd.A00(A003, "trigger_max_content_delay");
            int A0025 = 1Wd.A00(A003, "content_uri_triggers");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (A003.moveToNext()) {
                String string = A003.getString(A004);
                if (((ArrayList) hashMap.get(string)) == null) {
                    hashMap.put(string, new ArrayList());
                }
                String string2 = A003.getString(A004);
                if (((ArrayList) hashMap2.get(string2)) == null) {
                    hashMap2.put(string2, new ArrayList());
                }
            }
            A003.moveToPosition(-1);
            AnonymousClass3D2.A01(r32, hashMap);
            AnonymousClass3D2.A00(r32, hashMap2);
            ArrayList arrayList4 = new ArrayList(A003.getCount());
            while (A003.moveToNext()) {
                if (A004 == -1 || A003.isNull(A004)) {
                    str2 = null;
                } else {
                    str2 = A003.getString(A004);
                }
                int i5 = A005;
                if (i5 == -1) {
                    A02 = null;
                } else {
                    A02 = AnonymousClass3D7.A02(A003.getInt(i5));
                }
                if (A006 == -1) {
                    A002 = null;
                } else {
                    if (A003.isNull(A006)) {
                        bArr = null;
                    } else {
                        bArr = A003.getBlob(A006);
                    }
                    A002 = C255323tw.A00(bArr);
                }
                long j8 = 0;
                int i6 = A007;
                if (i6 == -1) {
                    j = 0;
                } else {
                    j = A003.getLong(i6);
                }
                int i7 = A008;
                if (i7 == -1) {
                    j2 = 0;
                } else {
                    j2 = A003.getLong(i7);
                }
                int i8 = A009;
                if (i8 == -1) {
                    j3 = 0;
                } else {
                    j3 = A003.getLong(i8);
                }
                boolean z4 = false;
                int i9 = A0010;
                if (i9 == -1) {
                    i = 0;
                } else {
                    i = A003.getInt(i9);
                }
                int i10 = A0011;
                if (i10 == -1) {
                    A03 = null;
                } else {
                    A03 = AnonymousClass3D7.A03(A003.getInt(i10));
                }
                int i11 = A0012;
                if (i11 == -1) {
                    j4 = 0;
                } else {
                    j4 = A003.getLong(i11);
                }
                int i12 = A0013;
                if (i12 == -1) {
                    j5 = 0;
                } else {
                    j5 = A003.getLong(i12);
                }
                int i13 = A0014;
                if (i13 == -1) {
                    i2 = 0;
                } else {
                    i2 = A003.getInt(i13);
                }
                int i14 = A0015;
                if (i14 == -1) {
                    i3 = 0;
                } else {
                    i3 = A003.getInt(i14);
                }
                int i15 = A0016;
                if (i15 == -1) {
                    j6 = 0;
                } else {
                    j6 = A003.getLong(i15);
                }
                int i16 = A0017;
                if (i16 == -1) {
                    i4 = 0;
                } else {
                    i4 = A003.getInt(i16);
                }
                int i17 = A0018;
                if (i17 == -1) {
                    A04 = null;
                } else {
                    A04 = AnonymousClass3D7.A04(A003.getInt(i17));
                }
                int i18 = A0019;
                if (i18 == -1) {
                    z = false;
                } else {
                    z = false;
                    if (A003.getInt(i18) != 0) {
                        z = true;
                    }
                }
                if (A0020 == -1) {
                    z2 = false;
                } else {
                    z2 = false;
                    if (A003.getInt(A0020) != 0) {
                        z2 = true;
                    }
                }
                if (A0021 == -1) {
                    z3 = false;
                } else {
                    z3 = false;
                    if (A003.getInt(A0021) != 0) {
                        z3 = true;
                    }
                }
                if (!(A0022 == -1 || A003.getInt(A0022) == 0)) {
                    z4 = true;
                }
                if (A0023 == -1) {
                    j7 = 0;
                } else {
                    j7 = A003.getLong(A0023);
                }
                if (A0024 != -1) {
                    j8 = A003.getLong(A0024);
                }
                if (A0025 == -1) {
                    linkedHashSet = null;
                } else {
                    if (A003.isNull(A0025)) {
                        bArr2 = null;
                    } else {
                        bArr2 = A003.getBlob(A0025);
                    }
                    linkedHashSet = AnonymousClass3D7.A06(bArr2);
                }
                C255343ty r54 = new C255343ty(A04, linkedHashSet, j7, j8, z, z2, z3, z4);
                ArrayList arrayList5 = (ArrayList) hashMap.get(A003.getString(A004));
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                ArrayList arrayList6 = (ArrayList) hashMap2.get(A003.getString(A004));
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList4.add(new C11030S6i(r54, A002, A02, A03, str2, arrayList5, arrayList6, i, i2, i3, i4, j, j2, j3, j4, j5, j6));
            }
            A003.close();
            return (List) AnonymousClass3DG.A0N.apply(arrayList4);
        } catch (Throwable th) {
            A003.close();
            throw th;
        }
    }
}
