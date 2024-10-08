package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.71t  reason: invalid class name and case insensitive filesystem */
public abstract class C3252771t {
    /* JADX WARNING: type inference failed for: r2v2, types: [X.3Vq, X.5mB, X.3Vp] */
    public static final 1yX A00(Context context, AnonymousClass0iw r7, UserSession userSession, 1Xj r9, C294255m9 r10, String str, int i, int i2) {
        C242693Vo A03;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r9, 3);
        int ordinal = r10.ordinal();
        if (ordinal == 0) {
            str = "profile_media_grid";
        } else if (ordinal == 1) {
            str = "profile_tagged_media_photos_of_you";
        } else if (ordinal == 2) {
            str = "profile_fan_club_grid";
        } else if (ordinal == 3) {
            str = "profile_reposts";
        } else if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't generate prefetch resource for unknown tabMode: ");
            sb.append(r10);
            throw new IllegalArgumentException(sb.toString());
        }
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        Integer num = r10.A01;
        0qQ.A0B(num, 2);
        ? r2 = new C242703Vp(pair, AnonymousClass05K.A00);
        r2.A01 = num;
        r2.A00 = r10;
        r2.A02 = str;
        Integer num2 = AnonymousClass05K.A01;
        String moduleName = r7.getModuleName();
        if (num == num2) {
            A03 = C242663Vj.A05(context, userSession, r9, moduleName, false);
        } else {
            A03 = C242663Vj.A03(context, userSession, r9, num, moduleName);
        }
        return new 1yX(A03, r2);
    }
}
