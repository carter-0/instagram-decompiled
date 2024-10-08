package X;

import android.net.Uri;

/* renamed from: X.RmB  reason: case insensitive filesystem */
public abstract class C10074RmB {
    public static final Uri A00;
    public static final String A01;

    static {
        String A0R = 002.A0R("com.facebook.appmanager", ".nekodirect");
        A01 = A0R;
        A00 = Uri.parse(002.A0R("content://", A0R));
    }
}
