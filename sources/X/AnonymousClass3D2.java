package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.3D2  reason: invalid class name */
public final class AnonymousClass3D2 implements AnonymousClass396 {
    public final C251983oI A00;

    public AnonymousClass3D2(C251983oI r1) {
        this.A00 = r1;
    }

    public static void A00(AnonymousClass3D2 r8, HashMap hashMap) {
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
        Cursor A003 = 1wT.A00(r8.A00, A002, false);
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

    public static void A01(AnonymousClass3D2 r8, HashMap hashMap) {
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
        Cursor A003 = 1wT.A00(r8.A00, A002, false);
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
