package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.F9o  reason: case insensitive filesystem */
public abstract class C49849F9o {
    public static final 0Pj A00;
    public static final 0Pj A01;

    public static boolean A00(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            return A01.A04(context, applicationInfo.uid) || A00.A04(context, applicationInfo.uid);
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        new 0PH("-sYXRdwJA3hvue3mKpYrOZ9zSPC7b4mbgzJmdZEDO5w");
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.add(C60020ci.A0d);
        A1F.add(C60020ci.A0m);
        A1F.add(C60020ci.A1G);
        A1F.add(C60020ci.A1f);
        A01 = 0cQ.A02(Collections.unmodifiableSet(A1F));
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(C60020ci.A0h, "com.facebook.study");
        A1E.put(C60020ci.A0A, "com.facebook.viewpoints");
        A00 = 0cQ.A01(Collections.unmodifiableMap(A1E));
    }
}
