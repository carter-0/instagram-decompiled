package X;

import android.os.Build;

/* renamed from: X.KpF  reason: case insensitive filesystem */
public abstract class C62963KpF {
    @Deprecated
    public static String A00(String str) {
        if (str != null && !str.isEmpty()) {
            switch (str.hashCode()) {
                case -1367751899:
                    if (str.equals("camera")) {
                        return "android.permission.CAMERA";
                    }
                    break;
                case -196315310:
                    if (str.equals("gallery")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return Pxd.A00(7);
                        }
                        return "android.permission.WRITE_EXTERNAL_STORAGE";
                    }
                    break;
                case -94789412:
                    if (str.equals("read_contacts")) {
                        return AnonymousClass000.A00(4457);
                    }
                    break;
            }
        }
        return null;
    }
}
