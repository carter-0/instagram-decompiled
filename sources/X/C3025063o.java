package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.63o  reason: invalid class name and case insensitive filesystem */
public final class C3025063o {
    public final Context A00;
    public final Map A01;

    public final LinkedHashSet A00(String str, String str2) {
        ArrayList<0eP> arrayList;
        String str3;
        String str4 = str;
        0qQ.A0B(str4, 0);
        String str5 = str2;
        0qQ.A0B(str5, 1);
        C3024963n[] r10 = (C3024963n[]) this.A01.get(C393029vm.A00(str5));
        if (r10 != null) {
            ArrayList<C3024963n> arrayList2 = new ArrayList<>();
            for (C3024963n r2 : r10) {
                String str6 = r2.A00;
                String packageName = this.A00.getPackageName();
                0qQ.A07(packageName);
                boolean z = false;
                if (!0qQ.A0K(str6, packageName) && ((!packageName.equals("com.facebook.katana") || !0qQ.A0K(str6, "com.facebook.wakizashi")) && (!packageName.equals("com.facebook.wakizashi") || !0qQ.A0K(str6, "com.facebook.katana")))) {
                    z = true;
                }
                if (z) {
                    arrayList2.add(r2);
                }
            }
            arrayList = new ArrayList<>(0Yv.A1E(arrayList2, 10));
            for (C3024963n r0 : arrayList2) {
                String str7 = r0.A00;
                StringBuilder sb = new StringBuilder();
                sb.append(AnonymousClass000.A00(2925));
                sb.append(str7);
                sb.append(".ShareKey/");
                sb.append(str5);
                sb.append('/');
                sb.append(str4);
                String obj = sb.toString();
                Uri uri = null;
                try {
                    uri = 0cp.A03(obj);
                } catch (SecurityException unused) {
                }
                if (uri != null) {
                    arrayList.add(new 0eP(str7, uri));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        } else {
            arrayList = null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (arrayList != null) {
            for (0eP r02 : arrayList) {
                String str8 = (String) r02.A00;
                try {
                    Cursor A012 = 0fM.A01(this.A00.getContentResolver(), (Uri) r02.A01, (String) null, (String) null, (String[]) null, (String[]) null, -1354073294);
                    boolean z2 = true;
                    if (A012 == null || !A012.moveToFirst()) {
                        z2 = false;
                    }
                    if (z2) {
                        str3 = A012.getString(0);
                    } else {
                        str3 = null;
                    }
                    if (A012 != null) {
                        A012.close();
                    }
                } catch (SecurityException unused2) {
                    str3 = null;
                }
                if (str3 != null) {
                    linkedHashSet.add(new N49(str3, str8, 0));
                }
            }
        }
        return linkedHashSet;
    }

    public C3025063o(Context context, Map map) {
        this.A00 = context;
        this.A01 = map;
    }
}
