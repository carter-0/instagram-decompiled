package X;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: X.38s  reason: invalid class name and case insensitive filesystem */
public final class C2376738s implements C2376838t {
    public final void DYW(1W6 r12) {
        String str;
        r12.AT6("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        Object[] objArr = new Object[0];
        1W5 r122 = (1W5) r12;
        int i = 0;
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            Object[] objArr2 = new Object[size];
            StringBuilder sb = new StringBuilder();
            sb.append(C273654mx.A00(516));
            sb.append(1W5.A01[3]);
            sb.append("WorkSpec");
            sb.append(" SET ");
            for (String next : contentValues.keySet()) {
                if (i > 0) {
                    str = ",";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(next);
                objArr2[i] = contentValues.get(next);
                sb.append("=?");
                i++;
            }
            for (int i2 = size; i2 < size; i2++) {
                objArr2[i2] = objArr[i2 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb.append(AnonymousClass000.A00(1980));
                sb.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            String obj = sb.toString();
            0qQ.A07(obj);
            AnonymousClass1WT AIZ = r122.AIZ(obj);
            1W8.A02.A00(AIZ, objArr2);
            AIZ.ATQ();
            return;
        }
        throw new IllegalArgumentException("Empty values");
    }
}
