package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public abstract class HVC {
    public static final AnonymousClass6D9 A00(C286575Wy r14, AnonymousClass6D8 r15, String str, C62320sa r17, C62320sa r18, C62320sa r19, C62320sa r20, int i, int i2, boolean z) {
        C62320sa r5 = r17;
        C62320sa r4 = r18;
        C62320sa r3 = r19;
        AnonymousClass6D8 r9 = r15;
        String str2 = str;
        C62320sa r2 = r20;
        AnonymousClass7TG.A1N(r15, str2);
        r14.ExS(-2038631347);
        int i3 = i2;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        boolean A1Q = C51966G9m.A1Q(i2 & 8, z);
        if ((i2 & 16) != 0) {
            r5 = null;
        }
        if ((i2 & 32) != 0) {
            r4 = null;
        }
        if ((i2 & 64) != 0) {
            r3 = null;
        }
        if ((i3 & 128) != 0) {
            r2 = null;
        }
        if (0fL.A02()) {
            0fL.A01(-1722081965, "com.instagram.barcelona.feed.post.video.rememberPostVideoState (PostVideoState.kt:47)");
        }
        Context A0I = C51968G9o.A0I(r14);
        UserSession A0h = C51968G9o.A0h(r14);
        AnonymousClass4DU r11 = (AnonymousClass4DU) r14.AJO(C286935Yj.A00);
        Object A0m = C51967G9n.A0m(r14, 263649822);
        if (A0m == AnonymousClass5XT.A00) {
            A0m = new AnonymousClass6D9(A0I, C51970G9q.A0S(Integer.valueOf(i)), r9, A0h, r11, str2, A1Q);
            r14.FLL(A0m);
        }
        AnonymousClass6D9 r6 = (AnonymousClass6D9) A0m;
        C286565Wx A0G = C51965G9l.A0G(r14);
        r6.A05.Epw(r5);
        r6.A07.Epw(r4);
        r6.A08.Epw(r3);
        r6.A06.Epw(r2);
        if (0fL.A02()) {
            0fL.A00(-809587184);
        }
        C286565Wx.A0I(A0G);
        return r6;
    }
}
