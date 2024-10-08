package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Sy  reason: invalid class name and case insensitive filesystem */
public abstract class C379209Sy {
    public static final List A00;
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final List A05;

    public static final boolean A00(UserSession userSession, String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (userSession != null) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36317423116227702L)) {
                return 00l.A0d(182.A04(r2, userSession, 36880373069709632L), str, false);
            }
        }
        return A04.contains(str) || A03.contains(str) || A01.contains(str) || A00.contains(str) || A05.contains(str);
    }

    public static final boolean A01(UserSession userSession, String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (userSession != null) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36317423116227702L)) {
                return 00l.A0d(182.A04(r2, userSession, 36880373069775169L), str, false);
            }
        }
        return A04.contains(str);
    }

    static {
        ArrayList A1C = AnonymousClass7TE.A1C();
        A04 = A1C;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A03 = A1C2;
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        A01 = A1C3;
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        A00 = A1C4;
        ArrayList A1C5 = AnonymousClass7TE.A1C();
        A05 = A1C5;
        ArrayList A1C6 = AnonymousClass7TE.A1C();
        A02 = A1C6;
        A1C.add("com.spotify.music");
        A1C.add("com.spotify.music.canary");
        A1C.add("com.spotify.s4a");
        A1C.add("174829003346");
        A1C2.add("com.soundcloud.android.alpha");
        A1C2.add("com.soundcloud.android");
        A1C2.add("19507961798");
        A1C3.add("com.apple.android.music");
        A1C3.add("602231459918900");
        A1C4.add("com.amazon.mp3");
        A1C4.add("164159468181390");
        A1C5.add("com.google.android.apps.youtube.music");
        A1C5.add("364181942380876");
        A1C6.addAll(A1C);
        A1C6.addAll(A1C3);
        A1C6.addAll(A1C4);
        A1C6.addAll(A1C5);
    }
}
