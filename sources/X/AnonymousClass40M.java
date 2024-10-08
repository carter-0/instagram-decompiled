package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.webrtc.CameraCapturer;

/* renamed from: X.40M  reason: invalid class name */
public final class AnonymousClass40M implements AnonymousClass40N {
    public final AnonymousClass40L A00;
    public final AnonymousClass0JP A01;

    public AnonymousClass40M(AnonymousClass0JP r2, AnonymousClass40L r3) {
        0qQ.A0B(r3, 1);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final AnonymousClass40G E6Z(List list, int i) {
        Map A002 = A00(list, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(0se.A0L(A002.size()));
        for (Map.Entry entry : A002.entrySet()) {
            Object key = entry.getKey();
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass40O r0 : (Iterable) entry.getValue()) {
                Long l = r0.A06;
                if (l != null) {
                    arrayList.add(l);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        return new AnonymousClass40G(linkedHashMap, (String) null, true);
    }

    public final void FNg(String str, long j, long j2) {
        C251983oI r1;
        long now = this.A01.now();
        List singletonList = Collections.singletonList(new AnonymousClass40O((Float) null, (Integer) null, Long.valueOf(j), str, (String) null, (String) null, 0, 0, now, now + j2));
        0qQ.A07(singletonList);
        try {
            if (!singletonList.isEmpty()) {
                AnonymousClass40L r0 = this.A00;
                r1 = r0.A01;
                r1.assertNotSuspendingTransaction();
                r1.beginTransaction();
                r0.A00.insert(singletonList);
                r1.setTransactionSuccessful();
                r1.endTransaction();
            }
        } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException | SQLiteReadOnlyDatabaseException unused) {
        } catch (Throwable th) {
            r1.endTransaction();
            throw th;
        }
    }

    private final Map A00(List list, int i) {
        1WY A002;
        Cursor query;
        Integer num;
        String str;
        Long l;
        Float f;
        String str2;
        int i2 = i;
        if (i <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        try {
            AnonymousClass40L r7 = this.A00;
            long now = this.A01.now();
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append("        SELECT * FROM signals");
            sb.append("\n");
            sb.append("        WHERE signal_id IN (");
            int size = list.size();
            1wO.A00(sb, size);
            sb.append(")");
            sb.append("\n");
            sb.append("        AND expiration_timestamp > ");
            sb.append("?");
            sb.append("\n");
            sb.append("      ");
            String obj = sb.toString();
            int i3 = size + 1;
            TreeMap treeMap = 1WY.A08;
            A002 = 1Wa.A00(obj, i3);
            Iterator it = list.iterator();
            int i4 = 1;
            while (it.hasNext()) {
                A002.ADh(i4, (String) it.next());
                i4++;
            }
            A002.ADa(i3, now);
            C251983oI r0 = r7.A01;
            r0.assertNotSuspendingTransaction();
            query = r0.query((AnonymousClass1WA) A002, (CancellationSignal) null);
            int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(query, "signal_id");
            int A014 = 1Wd.A01(query, "timestamp");
            int A015 = 1Wd.A01(query, "signal_component_id");
            int A016 = 1Wd.A01(query, "context");
            int A017 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            int A018 = 1Wd.A01(query, "long_value");
            int A019 = 1Wd.A01(query, "float_value");
            int A0110 = 1Wd.A01(query, "text_value");
            int A0111 = 1Wd.A01(query, "expiration_timestamp");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i5 = query.getInt(A012);
                String string = query.getString(A013);
                long j = query.getLong(A014);
                if (query.isNull(A015)) {
                    num = null;
                } else {
                    num = Integer.valueOf(query.getInt(A015));
                }
                if (query.isNull(A016)) {
                    str = null;
                } else {
                    str = query.getString(A016);
                }
                int i6 = query.getInt(A017);
                if (query.isNull(A018)) {
                    l = null;
                } else {
                    l = Long.valueOf(query.getLong(A018));
                }
                if (query.isNull(A019)) {
                    f = null;
                } else {
                    f = Float.valueOf(query.getFloat(A019));
                }
                if (query.isNull(A0110)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A0110);
                }
                arrayList.add(new AnonymousClass40O(f, num, l, string, str, str2, i5, i6, j, query.getLong(A0111)));
            }
            query.close();
            A002.A00();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                String str3 = ((AnonymousClass40O) next).A08;
                Object obj2 = linkedHashMap.get(str3);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(str3, obj2);
                }
                ((List) obj2).add(next);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), 00k.A0h(00k.A0g((Iterable) entry.getValue(), new C261754Au()), i2));
            }
            return linkedHashMap2;
        } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException unused) {
            return 0Yt.A0E();
        } catch (Throwable th) {
            query.close();
            A002.A00();
            throw th;
        }
    }

    public final void CfI(int i) {
        1WY A002;
        Cursor query;
        Integer num;
        String str;
        Long l;
        Float f;
        String str2;
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        try {
            AnonymousClass40L r5 = this.A00;
            AnonymousClass0JP r2 = this.A01;
            r5.A00(r2.now());
            long now = r2.now();
            TreeMap treeMap = 1WY.A08;
            A002 = 1Wa.A00("\n        SELECT * FROM signals\n        WHERE expiration_timestamp > ?\n      ", 1);
            A002.ADa(1, now);
            C251983oI r0 = r5.A01;
            r0.assertNotSuspendingTransaction();
            query = r0.query((AnonymousClass1WA) A002, (CancellationSignal) null);
            int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(query, "signal_id");
            int A014 = 1Wd.A01(query, "timestamp");
            int A015 = 1Wd.A01(query, "signal_component_id");
            int A016 = 1Wd.A01(query, "context");
            int A017 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            int A018 = 1Wd.A01(query, "long_value");
            int A019 = 1Wd.A01(query, "float_value");
            int A0110 = 1Wd.A01(query, "text_value");
            int A0111 = 1Wd.A01(query, "expiration_timestamp");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i2 = query.getInt(A012);
                String string = query.getString(A013);
                long j = query.getLong(A014);
                if (query.isNull(A015)) {
                    num = null;
                } else {
                    num = Integer.valueOf(query.getInt(A015));
                }
                if (query.isNull(A016)) {
                    str = null;
                } else {
                    str = query.getString(A016);
                }
                int i3 = query.getInt(A017);
                if (query.isNull(A018)) {
                    l = null;
                } else {
                    l = Long.valueOf(query.getLong(A018));
                }
                if (query.isNull(A019)) {
                    f = null;
                } else {
                    f = Float.valueOf(query.getFloat(A019));
                }
                if (query.isNull(A0110)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A0110);
                }
                arrayList.add(new AnonymousClass40O(f, num, l, string, str, str2, i2, i3, j, query.getLong(A0111)));
            }
            query.close();
            A002.A00();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str3 = ((AnonymousClass40O) next).A08;
                Object obj = linkedHashMap.get(str3);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str3, obj);
                }
                ((List) obj).add(next);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                List A0g = 00k.A0g((Iterable) entry.getValue(), new AnonymousClass9G0());
                0qQ.A0B(A0g, 0);
                int size = A0g.size() - i;
                if (size < 0) {
                    size = 0;
                }
                linkedHashMap2.put(key, 00k.A0d(A0g, size));
            }
            ArrayList A1F = 0Yv.A1F(linkedHashMap2.values());
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(A1F, 10));
            Iterator it2 = A1F.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((AnonymousClass40O) it2.next()).A00));
            }
            00k.A0s(arrayList2, new C377189Kw(this, 22), CameraCapturer.OPEN_CAMERA_DELAY_MS);
        } catch (SQLiteDiskIOException | SQLiteException unused) {
        } catch (Throwable th) {
            query.close();
            A002.A00();
            throw th;
        }
    }

    public final void EDJ() {
        this.A00.A00(Long.MAX_VALUE);
    }

    public final AnonymousClass40G E6Y(String str, int i) {
        ArrayList arrayList;
        List singletonList = Collections.singletonList(str);
        0qQ.A07(singletonList);
        List<AnonymousClass40O> list = (List) A00(singletonList, i).get(str);
        if (list != null) {
            for (AnonymousClass40O r0 : list) {
                Long l = r0.A06;
                if (l != null) {
                    arrayList.add(l);
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        return new AnonymousClass40G(arrayList, (String) null, true);
    }
}
