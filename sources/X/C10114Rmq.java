package X;

import android.net.Uri;

/* renamed from: X.Rmq  reason: case insensitive filesystem */
public abstract class C10114Rmq {
    public static final Uri A00;
    public static final Uri A01;
    public static final Uri A02;

    static {
        String A0R = 002.A0R("com.facebook.appmanager", ".attribution");
        A02 = Uri.parse(002.A0R("content://", A0R));
        A01 = Pxe.A0I().scheme("content").authority(A0R).appendPath(Q2N.A01(0, 9, 86)).build();
        A00 = Pxe.A0I().scheme("content").authority(A0R).appendPath("attribution_info").build();
    }
}
