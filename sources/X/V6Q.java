package X;

import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import java.util.ArrayList;

public abstract class V6Q {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.3uV, java.lang.Object] */
    public static final AnonymousClass4OI A00(C250813m6 r34, C17415VUu vUu, String str) {
        C17415VUu vUu2 = vUu;
        String str2 = vUu2.A00;
        if (str2.length() <= 0) {
            str2 = vUu2.A01;
            if (str2.length() == 0) {
                str2 = "";
            }
        }
        C255653uU A00 = C255653uU.A00(0cp.A03(str2), vUu2.A02, 0Yt.A0E());
        28e r3 = 28e.A01;
        Integer num = AnonymousClass05K.A00;
        String A002 = C273654mx.A00(1343);
        ? obj = new Object();
        String str3 = str;
        AnonymousClass4OI r1 = new AnonymousClass4OI(new AudioFocusLossSettings(), r3, obj, A00, (AnonymousClass4SX) null, num, A002, str3, new ArrayList(), new ArrayList(), 0, 0, -1, -1, -1, -1, -1, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false);
        r1.A03 = r34;
        return r1;
    }
}
