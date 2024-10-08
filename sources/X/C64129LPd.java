package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.gifs.DirectAnimatedMediaUser;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LPd  reason: case insensitive filesystem */
public abstract class C64129LPd {
    public static final boolean A02(C63879LAi lAi) {
        if (lAi.A00 <= 0.0f || lAi.A01 <= 0.0f) {
            return false;
        }
        long j = lAi.A02;
        if (1 > j || j >= 16000001) {
            return false;
        }
        long j2 = lAi.A03;
        if (j2 != 0 && j2 > 16000000) {
            return false;
        }
        long j3 = lAi.A04;
        if (j3 == 0 || j3 <= 16000000) {
            return true;
        }
        return false;
    }

    public static GifUrlImpl A00(C63879LAi lAi, Object obj) {
        0qQ.A07(obj);
        return new GifUrlImpl(Integer.valueOf((int) lAi.A02), Integer.valueOf((int) lAi.A04), Integer.valueOf((int) lAi.A03), lAi.A05.getUrl(), lAi.A07, lAi.A06, lAi.A01, lAi.A00);
    }

    public static final ArrayList A01(UserSession userSession, Boolean bool, List list, boolean z) {
        C63879LAi lAi;
        String str;
        boolean A1X;
        DirectAnimatedMediaUser directAnimatedMediaUser;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C39746A7m a7m = (C39746A7m) it.next();
            C39747A7n a7n = a7m.A00;
            0qQ.A07(a7n);
            if (182.A06(0Tu.A05, userSession, 36318114606028671L)) {
                lAi = a7n.A00;
            } else {
                lAi = a7n.A01;
            }
            0qQ.A0A(lAi);
            C63879LAi lAi2 = a7n.A00;
            if (lAi2 != null && !C253833rU.A02(lAi2.A05) && (str = lAi2.A06) != null && str.length() != 0 && A02(lAi2) && lAi != null && !C253833rU.A02(lAi.A05) && A02(lAi)) {
                Boolean bool2 = a7m.A03;
                if (bool != null) {
                    A1X = bool.booleanValue();
                } else {
                    A1X = AnonymousClass7TG.A1X(bool2);
                }
                String str2 = a7m.A05;
                GifUrlImpl A00 = A00(lAi, str2);
                A5V a5v = a7m.A02;
                if (a5v != null) {
                    String str3 = a5v.A00;
                    0qQ.A07(str3);
                    directAnimatedMediaUser = new DirectAnimatedMediaUser(str3, a5v.A01);
                } else {
                    directAnimatedMediaUser = null;
                }
                DirectAnimatedMediaUser directAnimatedMediaUser2 = null;
                DirectAnimatedMedia directAnimatedMedia = new DirectAnimatedMedia(directAnimatedMediaUser, A00, false, (Boolean) null, str2, A1X);
                String str4 = a7m.A05;
                GifUrlImpl A002 = A00(lAi2, str4);
                A5V a5v2 = a7m.A02;
                if (a5v2 != null) {
                    String str5 = a5v2.A00;
                    0qQ.A07(str5);
                    directAnimatedMediaUser2 = new DirectAnimatedMediaUser(str5, a5v2.A01);
                }
                A1C.add(new C68137N2b(directAnimatedMedia, new DirectAnimatedMedia(directAnimatedMediaUser2, A002, (Boolean) null, (Boolean) null, str4, A1X), z));
            }
        }
        return A1C;
    }
}
