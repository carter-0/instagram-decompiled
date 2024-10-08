package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.5GY  reason: invalid class name */
public final class AnonymousClass5GY {
    public final C251983oI A00;
    public final 1Vg A01;
    public final 1Vg A02;
    public final 1Vg A03;
    public final 2NZ A04;
    public final 1Vf A05;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: X.5Gg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.5Gg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: X.5Gg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: X.5Gg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.5Gg} */
    /* JADX WARNING: type inference failed for: r12v4, types: [java.lang.Long] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C283135Gg A00(java.lang.String r24) {
        /*
            r23 = this;
            java.lang.String r2 = "\n    SELECT *\n    FROM newfeedstory\n    WHERE id = ?\n    ORDER BY timestamp ASC\n  "
            r1 = 1
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r3 = X.1Wa.A00(r2, r1)
            r0 = r24
            r3.ADh(r1, r0)
            r0 = r23
            X.3oI r0 = r0.A00
            r0.assertNotSuspendingTransaction()
            r12 = 0
            android.database.Cursor r2 = r0.query((X.AnonymousClass1WA) r3, (android.os.CancellationSignal) r12)
            java.lang.String r0 = "id"
            int r11 = X.1Wd.A01(r2, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "user_id"
            int r10 = X.1Wd.A01(r2, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "notification_type"
            int r9 = X.1Wd.A01(r2, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "timestamp"
            int r8 = X.1Wd.A01(r2, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "first_impression_timestamp"
            int r1 = X.1Wd.A01(r2, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "impression_count"
            int r7 = X.1Wd.A01(r2, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "priority_section_eligibility"
            int r6 = X.1Wd.A01(r2, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "major_app_version"
            int r5 = X.1Wd.A01(r2, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "data"
            int r4 = X.1Wd.A01(r2, r0)     // Catch:{ all -> 0x0097 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r14 = r2.getString(r11)     // Catch:{ all -> 0x0097 }
            java.lang.String r15 = r2.getString(r10)     // Catch:{ all -> 0x0097 }
            int r17 = r2.getInt(r9)     // Catch:{ all -> 0x0097 }
            long r20 = r2.getLong(r8)     // Catch:{ all -> 0x0097 }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0097 }
            if (r0 != 0) goto L_0x0074
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x0097 }
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0097 }
        L_0x0074:
            r13 = r12
            int r18 = r2.getInt(r7)     // Catch:{ all -> 0x0097 }
            int r0 = r2.getInt(r6)     // Catch:{ all -> 0x0097 }
            r22 = 0
            if (r0 == 0) goto L_0x0083
            r22 = 1
        L_0x0083:
            int r19 = r2.getInt(r5)     // Catch:{ all -> 0x0097 }
            byte[] r16 = r2.getBlob(r4)     // Catch:{ all -> 0x0097 }
            X.5Gg r12 = new X.5Gg     // Catch:{ all -> 0x0097 }
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r22)     // Catch:{ all -> 0x0097 }
        L_0x0090:
            r2.close()
            r3.A00()
            return r12
        L_0x0097:
            r0 = move-exception
            r2.close()
            r3.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5GY.A00(java.lang.String):X.5Gg");
    }

    public final ArrayList A01(String str, List list, long j, long j2) {
        Long l;
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("    SELECT *");
        sb.append("\n");
        sb.append("    FROM newfeedstory");
        sb.append("\n");
        sb.append("    WHERE user_id = ");
        sb.append("?");
        sb.append(" ");
        sb.append("\n");
        sb.append("        AND timestamp >= ");
        sb.append("?");
        sb.append(" ");
        sb.append("\n");
        sb.append("        AND timestamp <= ");
        sb.append("?");
        sb.append(" ");
        sb.append("\n");
        sb.append("        AND notification_type IN (");
        int size = list.size();
        1wO.A00(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("    ORDER BY timestamp ASC");
        sb.append("\n");
        sb.append("  ");
        TreeMap treeMap = 1WY.A08;
        1WY A002 = 1Wa.A00(sb.toString(), size + 3);
        A002.ADh(1, str);
        A002.ADa(2, j);
        A002.ADa(3, j2);
        Iterator it = list.iterator();
        int i = 4;
        while (it.hasNext()) {
            A002.ADa(i, (long) ((Number) it.next()).intValue());
            i++;
        }
        C251983oI r0 = this.A00;
        r0.assertNotSuspendingTransaction();
        Cursor query = r0.query((AnonymousClass1WA) A002, (CancellationSignal) null);
        try {
            int A012 = 1Wd.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A013 = 1Wd.A01(query, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            int A014 = 1Wd.A01(query, "notification_type");
            int A015 = 1Wd.A01(query, "timestamp");
            int A016 = 1Wd.A01(query, "first_impression_timestamp");
            int A017 = 1Wd.A01(query, "impression_count");
            int A018 = 1Wd.A01(query, "priority_section_eligibility");
            int A019 = 1Wd.A01(query, "major_app_version");
            int A0110 = 1Wd.A01(query, "data");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(A012);
                String string2 = query.getString(A013);
                int i2 = query.getInt(A014);
                long j3 = query.getLong(A015);
                if (query.isNull(A016)) {
                    l = null;
                } else {
                    l = Long.valueOf(query.getLong(A016));
                }
                int i3 = query.getInt(A017);
                boolean z = false;
                if (query.getInt(A018) != 0) {
                    z = true;
                }
                arrayList.add(new C283135Gg(l, string, string2, query.getBlob(A0110), i2, i3, query.getInt(A019), j3, z));
            }
            return arrayList;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public final void A02(List list) {
        C251983oI r1 = this.A00;
        r1.assertNotSuspendingTransaction();
        r1.beginTransaction();
        try {
            this.A05.insert(list);
            r1.setTransactionSuccessful();
        } finally {
            r1.endTransaction();
        }
    }

    public AnonymousClass5GY(C251983oI r2) {
        this.A00 = r2;
        this.A05 = new AnonymousClass5GZ(r2, this);
        this.A04 = new AnonymousClass5Ga(r2, this);
        this.A02 = new C283085Gb(r2, this);
        this.A01 = new C283095Gc(r2, this);
        this.A03 = new C283105Gd(r2, this);
    }
}
