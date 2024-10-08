package X;

import android.net.Uri;

public abstract class OXF {
    public static final Uri A00(String str, String str2, long j) {
        Uri.Builder appendPath = DbW.A07(C273654mx.A00(75)).appendPath(String.valueOf(j));
        if (str != null) {
            appendPath.appendPath(str);
        }
        if (str2 != null) {
            appendPath.appendPath(str2);
        }
        Uri build = appendPath.build();
        0qQ.A07(build);
        return build;
    }

    public static final String A01(String str) {
        Uri A09 = DbT.A09(str);
        if (DbV.A03(A09) < 3) {
            return null;
        }
        return AnonymousClass7TE.A19(A09.getPathSegments(), 2);
    }

    public static String A02(String str, String str2, long j) {
        return A00(str, str2, j).toString();
    }
}
