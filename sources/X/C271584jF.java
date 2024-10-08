package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.4jF  reason: invalid class name and case insensitive filesystem */
public abstract class C271584jF {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.XB5 A00(com.instagram.common.session.UserSession r4, X.C255773uh r5) {
        /*
            r0 = 1
            X.0qQ.A0B(r4, r0)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36602514455401098(0x8209cb0000128a, double:3.210915755866747E-306)
            long r3 = X.182.A01(r2, r4, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L_0x0042
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x001d:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1 = 0
            if (r2 == r0) goto L_0x0038
            X.1Xj r0 = r5.A0b
            if (r0 == 0) goto L_0x0038
            X.1Xy r0 = r0.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0038
            X.3y4 r0 = r0.BUs()
            if (r0 == 0) goto L_0x0038
            X.XB5 r1 = r0.BUi()
        L_0x0038:
            return r1
        L_0x0039:
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0042
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x001d
        L_0x0042:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C271584jF.A00(com.instagram.common.session.UserSession, X.3uh):X.XB5");
    }

    public static final String A02(UserSession userSession, MusicDataSource musicDataSource) {
        int i;
        0qQ.A0B(userSession, 0);
        if (C234472xv.A02(userSession)) {
            0qQ.A0B(musicDataSource, 0);
            String str = musicDataSource.A03;
            if (str == null) {
                return "MusicPlayer";
            }
            return str;
        }
        0qQ.A0B(musicDataSource, 0);
        Uri uri = musicDataSource.A00;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            String str2 = musicDataSource.A05;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
        }
        String hexString = Integer.toHexString(i);
        0qQ.A07(hexString);
        return hexString;
    }

    public static final MusicDataSource A01(XB5 xb5) {
        return new MusicDataSource((Uri) null, AudioType.MUSIC, xb5.BhY(), (String) null, xb5.getId(), (String) null);
    }
}
